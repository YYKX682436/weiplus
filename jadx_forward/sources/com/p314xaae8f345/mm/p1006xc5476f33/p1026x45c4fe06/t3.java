package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u3 f170496d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u3 u3Var) {
        this.f170496d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f170496d.f170796a.f159983b.S || this.f170496d.f170796a.f159983b.L0()) {
            return;
        }
        java.lang.Class[] clsArr = {al1.b.class, al1.l.class, zl1.t.class};
        for (int i17 = 0; i17 < 3; i17++) {
            this.f170496d.f170796a.f159983b.s0().d(clsArr[i17]);
        }
    }
}
