package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class c7 implements qk.u6 {

    /* renamed from: a, reason: collision with root package name */
    public final qk.v6 f88640a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni f88641b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f88642c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88643d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsruntime.t f88644e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f88645f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f88646g;

    public c7(qk.v6 devToolsService, com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni inspectorAccessible, yz5.a runtimeProvider, int i17, com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime) {
        kotlin.jvm.internal.o.g(devToolsService, "devToolsService");
        kotlin.jvm.internal.o.g(inspectorAccessible, "inspectorAccessible");
        kotlin.jvm.internal.o.g(runtimeProvider, "runtimeProvider");
        kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
        this.f88640a = devToolsService;
        this.f88641b = inspectorAccessible;
        this.f88642c = runtimeProvider;
        this.f88643d = i17;
        this.f88644e = jsRuntime;
        this.f88645f = com.tencent.mm.plugin.appbrand.service.k7.f88708b;
    }

    @Override // qk.u6
    public java.lang.String a() {
        return name();
    }

    @Override // qk.u6
    public void b(java.lang.String str) {
        if (str == null) {
            return;
        }
        java.lang.String str2 = null;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaServiceDevToolsListener", "generateEmptyReply, message is empty");
        } else {
            try {
                int i17 = new org.json.JSONObject(str).getInt(dm.i4.COL_ID);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.COL_ID, i17);
                jSONObject.put("result", new org.json.JSONObject());
                jSONObject.put("type", "recv");
                jSONObject.put("domain", "-");
                str2 = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WxaServiceDevToolsListener", "generateEmptyReply, fail since " + e17);
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        ((xz1.k) this.f88640a).Di(this, str2);
    }

    @Override // qk.u6
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsListener", "onOpen");
        if (this.f88645f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsListener", "onOpen, waiting for debugger now, not need to start inspector");
        } else {
            this.f88641b.startInspector(this.f88643d);
        }
    }

    @Override // qk.u6
    public void d(java.lang.String str) {
        if (str == null) {
            return;
        }
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(str) && com.tencent.mm.plugin.appbrand.service.k7.f88708b && r26.n0.D(str, "WeChat.runIfWaitingForDebugger", false, 2, null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsListener", "interceptForCustomRunIfWaitingForDebuggerIfNeed, runIfWaitingForDebugger");
            com.tencent.mm.plugin.appbrand.jsruntime.w wVar = (com.tencent.mm.plugin.appbrand.jsruntime.w) this.f88644e.h0(com.tencent.mm.plugin.appbrand.jsruntime.w.class);
            if (wVar != null) {
                cl.a aVar = (cl.a) ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).c0();
                synchronized (aVar.f42590w) {
                    boolean[] zArr = aVar.f42590w;
                    zArr[0] = false;
                    zArr.notifyAll();
                }
            }
            this.f88641b.sendInspectorMsg(this.f88643d, r26.i0.t(str, "WeChat.runIfWaitingForDebugger", "Runtime.runIfWaitingForDebugger", false));
            this.f88645f = false;
            z17 = true;
        }
        if (z17) {
            return;
        }
        this.f88641b.sendInspectorMsg(this.f88643d, str);
    }

    @Override // qk.u6
    public java.lang.String description() {
        return name();
    }

    @Override // qk.u6
    public java.lang.String name() {
        java.lang.String str = this.f88646g;
        if (str != null) {
            return str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsListener", "getName, generateName");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) this.f88642c.invoke();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (appBrandRuntime == null) {
            sb6.append(android.os.Process.myPid());
            sb6.append(':');
            sb6.append(hashCode());
        } else {
            sb6.append(appBrandRuntime.f74803n);
            sb6.append(':');
            sb6.append(appBrandRuntime.f74805p.f77281g);
        }
        if (this.f88643d == 0) {
            sb6.append(":service");
        } else {
            sb6.append(":worker" + this.f88643d);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsListener", "generateName, name: ".concat(sb7));
        this.f88646g = sb7;
        return sb7;
    }

    @Override // qk.u6
    public void onClose() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsListener", "onClose");
        this.f88641b.stopInspector(this.f88643d);
    }
}
