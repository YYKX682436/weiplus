package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class r0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 f154315a;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2) {
        this.f154315a = activityC11343xa72aeaf2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        boolean z17;
        r45.v vVar = (r45.v) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2 = this.f154315a;
        z17 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC11343xa72aeaf2).f39902xe856ec83;
        if (!z17) {
            activityC11343xa72aeaf2.mo48627xce38d9a();
        }
        if (vVar == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        r45.a aVar = vVar.f469310m;
        objArr[0] = aVar;
        objArr[1] = java.lang.Integer.valueOf(aVar != null ? aVar.f451100d : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "aapay return, alertItem: %s, alertItem.flag: %s", objArr);
        r45.a aVar2 = vVar.f469310m;
        if (aVar2 == null || aVar2.f451100d != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2.h7(activityC11343xa72aeaf2, vVar);
            return null;
        }
        java.lang.String str = aVar2.f451101e;
        java.lang.String str2 = aVar2.f451102f;
        java.lang.String str3 = aVar2.f451103g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar3.f293262s = str;
        aVar3.f293265v = str3;
        aVar3.E = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o0(this, vVar);
        aVar3.f293266w = str2;
        aVar3.F = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.q0(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activityC11343xa72aeaf2, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar3);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar3.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        activityC11343xa72aeaf2.mo48627xce38d9a();
        return null;
    }
}
