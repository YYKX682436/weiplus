package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class me {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f85749d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f85750e;

    /* renamed from: a, reason: collision with root package name */
    public final ze.n f85751a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f85752b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.w0 f85753c;

    public me(ze.n rt6) {
        kotlin.jvm.internal.o.g(rt6, "rt");
        this.f85751a = rt6;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "didCreate appId:" + rt6.f74803n);
        this.f85752b = "";
        rt6.I1(new com.tencent.mm.plugin.appbrand.ie(this));
        com.tencent.mm.plugin.appbrand.le leVar = new com.tencent.mm.plugin.appbrand.le(this);
        java.lang.String str = rt6.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        leVar.invoke(mVar);
        rt6.N.a(mVar);
        this.f85752b = "";
        this.f85753c = com.tencent.mm.plugin.appbrand.w0.HIDE;
    }

    public final void a(org.json.JSONObject eventData) {
        kotlin.jvm.internal.o.g(eventData, "eventData");
        java.lang.String optString = eventData.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "didDispatchEnterForegroundEvent appId:" + this.f85751a.f74803n + ", sessionId:" + optString);
        kotlin.jvm.internal.o.d(optString);
        this.f85752b = optString;
    }

    public final int b() {
        int g27 = (f85750e && this.f85753c == com.tencent.mm.plugin.appbrand.w0.LAUNCH_NATIVE_PAGE) ? bb1.e.CTRL_INDEX : this.f85751a.g2();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RuntimeLaunchSessionPlugin", "sessionScene.get() return " + g27 + ", kResetSceneAfterBackFromNativePage:" + f85750e);
        return g27;
    }
}
