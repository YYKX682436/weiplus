package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class o5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q5 f239394d;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.q5 q5Var) {
        this.f239394d = q5Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v0 v0Var;
        java.util.Iterator it = this.f239394d.f239431d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.e1) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e1Var.f238344a) && (v0Var = e1Var.f238345b) != null && v0Var.f238569a != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", " add option :%s", e1Var.f238344a);
                g4Var.f(i17, e1Var.f238344a);
            }
            i17++;
        }
    }
}
