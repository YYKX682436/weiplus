package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes14.dex */
public final class x1 implements q80.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.z1 f226031a;

    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.z1 z1Var) {
        this.f226031a = z1Var;
    }

    @Override // q80.s
    public void a(android.view.View liteAppView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppView, "liteAppView");
        if (liteAppView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) {
            java.util.HashMap platformViewHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226047q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(platformViewHashMap, "platformViewHashMap");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38 c16266x3ede7a38 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) liteAppView;
            java.lang.Long valueOf = java.lang.Long.valueOf(c16266x3ede7a38.mo28563xe7b2546());
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.z1 z1Var = this.f226031a;
            platformViewHashMap.put(valueOf, z1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(z1Var.f226039e, "startLiteAppView success,liteAppView uuid:" + c16266x3ede7a38.mo28563xe7b2546());
            z1Var.f226041g = true;
        }
    }

    @Override // q80.s
    /* renamed from: fail */
    public void mo9542x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f226031a.f226039e, "startLiteAppView fail!");
    }
}
