// Polyfill: Node.js 环境下 global 由运行时提供，去掉 Node 后需要手动定义
var global = (function() { return this; })();

// Timer 兼容层（原先由 node/core/controller.js + node/common/timer.js 在 _switchTimer=true 时注入）：
// - Node 原生 setTimeout 返回 Timer 对象，其 _args 会持有调用者传入的大对象，
//   某些下游代码遍历 Timer 对象时会沿着 _args 递归栈溢出 → 白屏。
// - 本包装把返回值改成 number id，让外部拿不到 Timer 对象，切断递归路径。
// no-node 模式（clicfg_disable_node_js=1）下，TimerBinding 已经在 android.js 执行
// 之前把返回 number id 的实现挂到了 global/NativeGlobal，无需再包一层——通过 probe
// 检测 setTimeout 返回值类型，是 number 就直接跳过。
//
// TODO(node-removal): clicfg_disable_node_js 全量（强制 no-node）后，Node 原生 setTimeout
// 不再出现在运行时，本段包装就成了纯开销，届时删除本 IIFE 即可。
;(function(root) {
    if (typeof root.setTimeout !== 'function'
        || typeof root.setInterval !== 'function'
        || typeof root.clearTimeout !== 'function'
        || typeof root.clearInterval !== 'function'
        || !root.NativeGlobal) {
        return;
    }
    // Probe：调用一次看返回什么。TimerBinding 返回 number，Node 原生返回 Timer 对象。
    var probeId = root.setTimeout(function(){}, 0);
    root.clearTimeout(probeId);
    if (typeof probeId === 'number') {
        // 已经是 number id 的实现（TimerBinding / no-node），无需包装
        return;
    }
    var originSetTimeout = root.setTimeout;
    var originSetInterval = root.setInterval;
    var originClearTimeout = root.clearTimeout;
    var originClearInterval = root.clearInterval;
    var timers = new Map();
    var currentId = 1;
    function wrappedSetTimeout(fn, timeout) {
        var extra = Array.prototype.slice.call(arguments, 2);
        var timerId = currentId++;
        // 不把 extra 传给 originSetTimeout，避免 Node Timer 对象的 _args 持有大对象引用。
        var inst = originSetTimeout(function() {
            try { fn.apply(root, extra); } finally { timers.delete(timerId); }
        }, timeout);
        timers.set(timerId, inst);
        return timerId;
    }
    function wrappedClearTimeout(timerId) {
        var inst = timers.get(timerId);
        if (inst) { originClearTimeout(inst); }
        timers.delete(timerId);
    }
    function wrappedSetInterval(fn, interval) {
        var extra = Array.prototype.slice.call(arguments, 2);
        var timerId = currentId++;
        var inst = originSetInterval(function() {
            fn.apply(root, extra);
        }, interval);
        timers.set(timerId, inst);
        return timerId;
    }
    function wrappedClearInterval(timerId) {
        var inst = timers.get(timerId);
        if (inst) { originClearInterval(inst); }
        timers.delete(timerId);
    }
    root.NativeGlobal.setTimeout = wrappedSetTimeout;
    root.NativeGlobal.clearTimeout = wrappedClearTimeout;
    root.NativeGlobal.setInterval = wrappedSetInterval;
    root.NativeGlobal.clearInterval = wrappedClearInterval;
    root.setTimeout = wrappedSetTimeout;
    root.clearTimeout = wrappedClearTimeout;
    root.setInterval = wrappedSetInterval;
    root.clearInterval = wrappedClearInterval;
})(this);

;if (this.setTimeout && this.clearTimeout && this.setInterval && this.clearInterval && this.NativeGlobal) {
    this.NativeGlobal.setTimeout = this.setTimeout;
    this.NativeGlobal.clearTimeout = this.clearTimeout;
    this.NativeGlobal.setInterval = this.setInterval;
    this.NativeGlobal.clearInterval = this.clearInterval;
};

var WeixinJSCore = (function(global) {
    var _WeixinJSCore = global.WeixinJSCore
    if (!_WeixinJSCore) {
        return undefined;
    }

    var __invokeHandler__ = _WeixinJSCore.invokeHandler
    var __invokeHandler2__ = _WeixinJSCore.invokeHandler2

    // global.NativeGlobal.invokeHandler2 由 WeAppCore 实现
    var __weappCoreInvokeHandler__ = undefined;
    if (global.NativeGlobal && global.NativeGlobal.invokeHandler2) {
        __weappCoreInvokeHandler__ = global.NativeGlobal.invokeHandler2;
    }

    if (global.NativeGlobal && global.NativeGlobal.invokeHandler) {
        __invokeHandler2__ = global.NativeGlobal.invokeHandler
    } else if (global.workerInvokeJsApi) {
        __invokeHandler2__ = global.workerInvokeJsApi
    }

    var ret = {};
    ret.publishHandler = function(event, data, dst) {
        _WeixinJSCore.publishHandler(event, data, dst)
    }

    ret.invokeHandler = function(api, args, callbackId, privateArgs) {
        if (__weappCoreInvokeHandler__) {
            let result = __weappCoreInvokeHandler__(api, args, callbackId, privateArgs);
            if (result && result.accepted) {
                return result.jsapiResult;
            }
        }
        if (__invokeHandler2__) {
            privateArgs = privateArgs || ""
            if (typeof privateArgs !== 'string') {
                privateArgs = JSON.stringify(privateArgs)
            }
            return __invokeHandler2__(api, args, callbackId, privateArgs)
        } else {
            return __invokeHandler__(api, args, callbackId)
        }
    }
    if (global.workerInvokeJsApi) {
        // 改为每次都查找 WeixinJSCore.invokeHandler，保证 node 的 hook 能生效
        global.workerInvokeJsApi = function(api, args, callbackId, privateArgs) {
            return ret.invokeHandler(api, args, callbackId, privateArgs)
        }
    }

    return ret
})(this);

var WeixinJSCoreAndroid = (function(global) {
    if (typeof global.WeixinJSCoreAndroid !== 'undefined') {
        return global.WeixinJSCoreAndroid
    }

    var ret = {};
    ret.invokeCallbackHandler = function(callbackId, data, ext) {
        if (typeof WeixinJSBridge !== 'undefined') {
            if (typeof data === 'string') {
                try {
                    data = JSON.parse(data)
                } catch (e) {
                    console.e('hy: fail not compatible data' + data)
                }
            }
//            console.log('invokeCallbackHandler ' + JSON.stringify(data))
            if (typeof ext === 'string' && ext.length > 0) {
                try {
                    ext = JSON.parse(ext)
                } catch(e) {}
            }
            WeixinJSBridge.invokeCallbackHandler(callbackId, data, ext);
        } else {
            console.error('WeixinJSCoreAndroid::invokeCallbackHandler, WeixinJSBridge==undefined, callbackId==' + callbackId)
        }
    };
    ret.subscribeHandler = function(event, data, src, ext) {
        if ('__native_custom_event__wxConfig_inject' === event) {
            data = JSON.parse(data)
//            global.__wxIndexPage = data.__wxIndexPage
//            delete data.__wxIndexPage
            if (typeof global.__wxConfig === 'undefined') {
                global.__wxConfig = {}
            }
            if (global.NativeGlobal !== undefined) {
                global.NativeGlobal.hasInitializedWxConfig = true;
            }
            Object.assign(global.__wxConfig, data)
            return
        }

        if (typeof WeixinJSBridge !== 'undefined') {
//            console.log('subscribeHandler event:' + (typeof event) + ":" + event + ", data:" + (typeof data) + ":" + data + ", src:" + (typeof src) + ":" + src + ", ext:" + (typeof ext) + ":" + ext)

            if (typeof data === 'string' && data.length > 0) {
                try {
                    data = JSON.parse(data)
                } catch(e) {}
            }
            if (typeof src === 'string') {
                src = Number(src)
            }
            if (typeof ext === 'string') {
                ext = JSON.parse(ext)
            }
//            if (event === 'onError') {
//                console.error('subscribeHandler onError ' + data)
//            }
//            console.log('subscribeHandler impl event:' + (typeof event) + ":" + event + ", data:" + (typeof data) + ":" + data + ", src:" + (typeof src) + ":" + src + ", ext:" + (typeof ext) + ":" + ext)
            WeixinJSBridge.subscribeHandler(event, data, src, ext);
        } else {
            console.error('WeixinJSCoreAndroid::subscribeHandler, WeixinJSBridge==undefined, event==' + event)
        }
    };

    return ret;
})(this);

// 直接注入的JsApi不支持多态，需要手动处理
if (typeof this.WeixinWorker !== 'undefined') {
    var createWorker = this.WeixinWorker.create;
    var createWithParams = this.WeixinWorker.createWithParams;
    if (createWorker && createWithParams) {
        this.WeixinWorker.create = function(path, params) {
            if (!params) {
                return createWorker(path);
            } else {
                return createWithParams(path, JSON.stringify(params));
            }
        }
    }
};
