package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f78755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yz5.l lVar) {
        super(1);
        this.f78755d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) obj;
        java.lang.String appId = e9Var != null ? e9Var.getAppId() : null;
        boolean z17 = false;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive service null, skip setPauseType");
        } else {
            if (appId == null || appId.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive appid empty, skip setPauseType");
            } else {
                com.tencent.mm.plugin.appbrand.x0.g(appId, com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive setPauseType applied, hostAppId=" + appId);
                z17 = true;
            }
        }
        this.f78755d.invoke(java.lang.Boolean.valueOf(z17));
        return jz5.f0.f302826a;
    }
}
