package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class k3 implements zs4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l3 f239325a;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l3 l3Var) {
        this.f239325a = l3Var;
    }

    @Override // zs4.p
    public boolean run(int i17, int i18, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "resultCode :%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l3 l3Var = this.f239325a;
        if (i17 == 2) {
            l3Var.f239335d.a7();
            return true;
        }
        if (i17 == 0 && z17) {
            l3Var.f239335d.a7();
        }
        return true;
    }
}
