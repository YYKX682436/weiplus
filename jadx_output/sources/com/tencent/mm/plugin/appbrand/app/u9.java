package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class u9 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f75302d;

    public u9(com.tencent.mm.plugin.appbrand.app.v9 v9Var, int i17) {
        this.f75302d = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String appId = (java.lang.String) obj;
        java.lang.Integer num = (java.lang.Integer) obj2;
        kotlin.jvm.internal.o.g(appId, "appId");
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).kf(1, "weapp_".concat(appId))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAppBrand", "onTeenModeDataChanged not kill authed %s", appId);
            return java.lang.Boolean.FALSE;
        }
        if (this.f75302d != 0 || !((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).Y1(appId, num.intValue())) {
            return java.lang.Boolean.TRUE;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAppBrand", "onTeenModeDataChanged not kill collection %s", appId);
        return java.lang.Boolean.FALSE;
    }
}
