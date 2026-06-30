package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f173232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 f173233e;

    public v5(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 w5Var) {
        this.f173232d = i17;
        this.f173233e = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 w5Var = this.f173233e;
        int i17 = this.f173232d;
        if (i17 > 0 && i17 != w5Var.f173246d.b()) {
            w5Var.f173246d.d(i17);
        }
        if (i17 > 0 && !w5Var.f173248f) {
            w5Var.f173246d.a(true);
            w5Var.f173248f = true;
        }
        w5Var.f173247e = null;
    }
}
