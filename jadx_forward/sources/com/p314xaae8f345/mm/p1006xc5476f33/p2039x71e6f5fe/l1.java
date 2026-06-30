package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe;

/* loaded from: classes5.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1 f240286d;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1 m1Var) {
        this.f240286d = m1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1 m1Var = this.f240286d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m1Var.f240289d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.SubCoreScanner", "accPath == null in onAccountPostReset");
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i(m1Var.f240289d + "image/scan/img", "scanbook", 604800000L);
        }
    }

    /* renamed from: toString */
    public java.lang.String m68558x9616526c() {
        return super.toString() + "|onAccountPostReset";
    }
}
