package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class m7 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154274a;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154274a = activityC11355x7bcfecda;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "onInterrupt: %s", obj);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154274a;
        activityC11355x7bcfecda.mo48627xce38d9a();
        if (obj == null || !(obj instanceof r45.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda.j7(activityC11355x7bcfecda, obj == null ? "" : obj.toString());
            return;
        }
        r45.a aVar = (r45.a) obj;
        java.lang.String str = aVar.f451101e;
        java.lang.String str2 = aVar.f451102f;
        java.lang.String str3 = aVar.f451103g;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11355x7bcfecda.mo55332x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar2.f293262s = str;
        aVar2.f293265v = str3;
        aVar2.E = new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l7(this, aVar);
        aVar2.f293266w = str2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar2.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }
}
