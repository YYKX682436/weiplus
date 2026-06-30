package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class s1 implements db5.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI f90195a;

    public s1(com.tencent.mm.plugin.appbrand.ui.AppBrandDebugUI appBrandDebugUI) {
        this.f90195a = appBrandDebugUI;
    }

    @Override // db5.a1
    public final boolean onFinish(java.lang.CharSequence charSequence) {
        java.lang.String valueOf = java.lang.String.valueOf(charSequence != null ? r26.n0.u0(charSequence) : null);
        if (valueOf.length() == 0) {
            return false;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = 1001;
        if (r26.i0.n(valueOf, "@app", false)) {
            b1Var.f317012a = valueOf;
        } else {
            b1Var.f317014b = valueOf;
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f90195a, b1Var);
        return true;
    }
}
