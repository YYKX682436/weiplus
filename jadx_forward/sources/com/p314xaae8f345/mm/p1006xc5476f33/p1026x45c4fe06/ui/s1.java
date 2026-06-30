package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class s1 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f171728a;

    public s1(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f171728a = appBrandDebugUI;
    }

    @Override // db5.a1
    /* renamed from: onFinish */
    public final boolean mo26039x42fe6352(java.lang.CharSequence charSequence) {
        java.lang.String valueOf = java.lang.String.valueOf(charSequence != null ? r26.n0.u0(charSequence) : null);
        if (valueOf.length() == 0) {
            return false;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398565k = 1001;
        if (r26.i0.n(valueOf, "@app", false)) {
            b1Var.f398545a = valueOf;
        } else {
            b1Var.f398547b = valueOf;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f171728a, b1Var);
        return true;
    }
}
