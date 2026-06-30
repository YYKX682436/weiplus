package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class s6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154335a;

    public s6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154335a = activityC11355x7bcfecda;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        boolean z17;
        r45.v vVar = (r45.v) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154335a;
        z17 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC11355x7bcfecda).f39902xe856ec83;
        if (!z17) {
            activityC11355x7bcfecda.mo48627xce38d9a();
        }
        if (vVar == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        r45.a aVar = vVar.f469310m;
        objArr[0] = aVar;
        objArr[1] = java.lang.Integer.valueOf(aVar != null ? aVar.f451100d : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "aapay return, alertItem: %s, alertItem.flag: %s", objArr);
        r45.a aVar2 = vVar.f469310m;
        if (aVar2 == null || aVar2.f451100d != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda.h7(activityC11355x7bcfecda, vVar);
            return null;
        }
        java.lang.String str = aVar2.f451101e;
        java.lang.String str2 = aVar2.f451102f;
        java.lang.String str3 = aVar2.f451103g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar3.f293262s = str;
        aVar3.f293265v = str3;
        aVar3.E = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.r6(this, vVar);
        aVar3.f293266w = str2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activityC11355x7bcfecda, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar3.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        activityC11355x7bcfecda.mo48627xce38d9a();
        return null;
    }
}
