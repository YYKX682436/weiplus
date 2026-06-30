package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class n0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 f154276a;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2) {
        this.f154276a = activityC11343xa72aeaf2;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AARemittanceUI", "aapay failed: %s", obj);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2 activityC11343xa72aeaf2 = this.f154276a;
        activityC11343xa72aeaf2.mo48627xce38d9a();
        if (obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2.i7(activityC11343xa72aeaf2, activityC11343xa72aeaf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571285ap));
            return;
        }
        if (!(obj instanceof r45.a)) {
            if (!(obj instanceof java.lang.String) || obj.toString().equalsIgnoreCase("ok")) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11343xa72aeaf2.i7(activityC11343xa72aeaf2, obj.toString());
            return;
        }
        r45.a aVar = (r45.a) obj;
        java.lang.String str = aVar.f451101e;
        java.lang.String str2 = aVar.f451102f;
        java.lang.String str3 = aVar.f451103g;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar2.f293262s = str;
        aVar2.f293265v = str3;
        aVar2.E = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.k0(this, aVar);
        aVar2.f293266w = str2;
        aVar2.F = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.m0(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activityC11343xa72aeaf2, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar2.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }
}
