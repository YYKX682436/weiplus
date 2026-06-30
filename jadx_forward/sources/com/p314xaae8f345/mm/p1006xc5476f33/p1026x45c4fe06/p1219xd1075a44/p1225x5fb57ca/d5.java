package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e5 f172934d;

    public d5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e5 e5Var) {
        this.f172934d = e5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e5 e5Var = this.f172934d;
        if (e5Var.f172960f) {
            if1.r c17 = if1.s.c(e5Var.f172955a);
            if1.r rVar = e5Var.f172958d;
            if (rVar == null || java.lang.Math.abs(rVar.f372627b - c17.f372627b) > 1.0f || java.lang.Math.abs(e5Var.f172958d.f372628c - c17.f372628c) > 1.0f) {
                java.lang.String str = e5Var.f172956b;
            } else {
                if (e5Var.f172959e == null) {
                    return;
                }
                e5Var.f172960f = false;
                e5Var.f172955a.removeCallbacks(e5Var.f172961g);
            }
        }
    }
}
