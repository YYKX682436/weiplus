package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class s7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.n7 f88452d;

    public s7(com.tencent.mm.plugin.appbrand.n7 n7Var) {
        this.f88452d = n7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        k91.r m07;
        com.tencent.mm.plugin.appbrand.n7 n7Var = this.f88452d;
        if (n7Var.f86038h.L0() || (m07 = n7Var.f86038h.m0()) == null) {
            return;
        }
        n7Var.f86038h.E2.onAppConfigGot(m07);
    }
}
