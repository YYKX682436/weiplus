package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class n extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f148885d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f148886e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f148887f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f148888g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f148889h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f148885d = "";
        this.f148889h = "";
    }

    public static final void T6(com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 c12473xe2bfc4b5) {
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgByAppBrandClickUIC", "tryLaunchAppBrand, appId: " + c12474x8b872a21.f167788d.f167795d + ", versionType: " + c12474x8b872a21.f167788d.f167796e + ", enterPath: " + c12474x8b872a21.f167788d.f167797f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgByAppBrandClickUIC", "tryLaunchAppBrand, appBrandLauncher is null");
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.m mVar = new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.m(h6Var, nVar, c12474x8b872a21, c12473xe2bfc4b5);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            mVar.run();
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(mVar);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic.k(this));
        }
    }
}
