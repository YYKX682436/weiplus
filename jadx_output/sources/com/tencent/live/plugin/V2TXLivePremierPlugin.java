package com.tencent.live.plugin;

/* loaded from: classes16.dex */
public class V2TXLivePremierPlugin implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {
    private static final java.lang.String TAG = "V2TXLivePremierPlugin";
    private io.flutter.plugin.common.MethodChannel mChannel;
    private android.content.Context mContext;
    private android.os.Handler mHandler;
    private io.flutter.plugin.common.BinaryMessenger mMessenger;

    /* loaded from: classes11.dex */
    public static class UIHandler extends android.os.Handler {
        java.lang.ref.WeakReference<com.tencent.live.plugin.V2TXLivePremierPlugin> pluginReference;

        public UIHandler(com.tencent.live.plugin.V2TXLivePremierPlugin v2TXLivePremierPlugin) {
            super(android.os.Looper.getMainLooper());
            this.pluginReference = new java.lang.ref.WeakReference<>(v2TXLivePremierPlugin);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
        }
    }

    /* loaded from: classes16.dex */
    public class V2TXLivePremierObserverImpl extends com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver {
        public V2TXLivePremierObserverImpl() {
        }

        public void invokeListener(final com.tencent.live.TXLivePluginDef.V2TXLivePremierObserverType v2TXLivePremierObserverType, final java.util.Map map) {
            com.tencent.live.plugin.V2TXLivePremierPlugin.this.mHandler.post(new java.lang.Runnable() { // from class: com.tencent.live.plugin.V2TXLivePremierPlugin.V2TXLivePremierObserverImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("type", v2TXLivePremierObserverType.getName());
                    java.util.Map map2 = map;
                    if (map2 != null) {
                        hashMap.put("params", map2);
                    }
                    if (com.tencent.live.plugin.V2TXLivePremierPlugin.this.mChannel != null) {
                        com.tencent.live.plugin.V2TXLivePremierPlugin.this.mChannel.invokeMethod("onPremierListener", hashMap);
                    }
                }
            });
        }

        @Override // com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver
        public void onLicenceLoaded(int i17, java.lang.String str) {
            com.tencent.live.utils.Logger.premierPrint(2, "V2TXLivePremierPlugin, onLicenceLoaded result:" + i17 + ",reason:" + str);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("result", java.lang.Integer.valueOf(i17));
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, str);
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePremierObserverType.getByName("onLicenceLoaded"), hashMap);
        }

        @Override // com.tencent.live2.V2TXLivePremier.V2TXLivePremierObserver
        public void onLog(int i17, java.lang.String str) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ya.b.LEVEL, java.lang.Integer.valueOf(i17));
            hashMap.put("log", str);
            invokeListener(com.tencent.live.TXLivePluginDef.V2TXLivePremierObserverType.getByName("onLog"), hashMap);
        }
    }

    public V2TXLivePremierPlugin(io.flutter.plugin.common.BinaryMessenger binaryMessenger, android.content.Context context) {
        this.mMessenger = binaryMessenger;
        this.mContext = context;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binaryMessenger, "live_cloud_premier");
        this.mChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.mHandler = new com.tencent.live.plugin.V2TXLivePremierPlugin.UIHandler(this);
    }

    public static void setSocks5Proxy(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        java.lang.String str = (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "host");
        int intValue = ((java.lang.Integer) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "port")).intValue();
        java.lang.String str2 = (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, dm.i4.COL_USERNAME);
        java.lang.String str3 = (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "password");
        java.util.Map map = (java.util.Map) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "config");
        com.tencent.live2.V2TXLiveDef.V2TXLiveSocks5ProxyConfig v2TXLiveSocks5ProxyConfig = new com.tencent.live2.V2TXLiveDef.V2TXLiveSocks5ProxyConfig();
        if (map != null && map.containsKey("supportHttps")) {
            v2TXLiveSocks5ProxyConfig.supportHttps = ((java.lang.Boolean) map.get("supportHttps")).booleanValue();
        }
        if (map != null && map.containsKey("supportTcp")) {
            v2TXLiveSocks5ProxyConfig.supportTcp = ((java.lang.Boolean) map.get("supportTcp")).booleanValue();
        }
        if (map != null && map.containsKey("supportUdp")) {
            v2TXLiveSocks5ProxyConfig.supportUdp = ((java.lang.Boolean) map.get("supportUdp")).booleanValue();
        }
        com.tencent.live2.V2TXLivePremier.setSocks5Proxy(str, intValue, str2, str3, v2TXLiveSocks5ProxyConfig);
        result.success(0);
    }

    public static void setUserId(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live2.V2TXLivePremier.setUserId((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "userId"));
        result.success(0);
    }

    public void getSDKVersionStr(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        result.success(com.tencent.live2.V2TXLivePremier.getSDKVersionStr());
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live.utils.Logger.premierPrint(2, "V2TXLivePremierPlugin, onMethodCall -> method:" + methodCall.method + ", arguments:" + methodCall.arguments);
        try {
            com.tencent.live.plugin.V2TXLivePremierPlugin.class.getDeclaredMethod(methodCall.method, io.flutter.plugin.common.MethodCall.class, io.flutter.plugin.common.MethodChannel.Result.class).invoke(this, methodCall, result);
        } catch (java.lang.Exception e17) {
            com.tencent.live.utils.Logger.premierPrint(4, "V2TXLivePremierPlugin, method=" + methodCall.method + "|arguments=" + methodCall.arguments + "|error=" + e17);
        }
    }

    public void setEnvironment(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live2.V2TXLivePremier.setEnvironment((java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "env"));
        result.success(0);
    }

    public void setLicence(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live2.V2TXLivePremier.setLicence(this.mContext, (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "url"), (java.lang.String) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "key"));
        com.tencent.live2.V2TXLivePremier.setObserver(new com.tencent.live.plugin.V2TXLivePremierPlugin.V2TXLivePremierObserverImpl());
        result.success(0);
    }

    public void setLogConfig(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.live2.V2TXLiveDef.V2TXLiveLogConfig v2TXLiveLogConfig = new com.tencent.live2.V2TXLiveDef.V2TXLiveLogConfig();
        java.util.Map map = (java.util.Map) com.tencent.live.utils.MethodUtils.getMethodParams(methodCall, result, "config");
        if (map != null && map.containsKey("logLevel")) {
            v2TXLiveLogConfig.logLevel = ((java.lang.Integer) map.get("logLevel")).intValue();
        }
        if (map != null && map.containsKey("enableObserver")) {
            v2TXLiveLogConfig.enableObserver = ((java.lang.Boolean) map.get("enableObserver")).booleanValue();
        }
        if (map != null && map.containsKey("enableConsole")) {
            v2TXLiveLogConfig.enableConsole = ((java.lang.Boolean) map.get("enableConsole")).booleanValue();
        }
        if (map != null && map.containsKey("enableLogFile")) {
            v2TXLiveLogConfig.enableLogFile = ((java.lang.Boolean) map.get("enableLogFile")).booleanValue();
        }
        if (map != null && map.containsKey("logPath")) {
            v2TXLiveLogConfig.logPath = (java.lang.String) map.get("logPath");
        }
        com.tencent.live2.V2TXLivePremier.setLogConfig(v2TXLiveLogConfig);
        result.success(0);
    }
}
