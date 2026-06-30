package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public class u9 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f156835d;

    public u9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.v9 v9Var, int i17) {
        this.f156835d = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String appId = (java.lang.String) obj;
        java.lang.Integer num = (java.lang.Integer) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).kf(1, "weapp_".concat(appId))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAppBrand", "onTeenModeDataChanged not kill authed %s", appId);
            return java.lang.Boolean.FALSE;
        }
        if (this.f156835d != 0 || !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.z5.class)).Y1(appId, num.intValue())) {
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreAppBrand", "onTeenModeDataChanged not kill collection %s", appId);
        return java.lang.Boolean.FALSE;
    }
}
