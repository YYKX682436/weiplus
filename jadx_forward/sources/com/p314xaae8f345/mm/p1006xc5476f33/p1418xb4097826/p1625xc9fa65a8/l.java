package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class l implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b f207283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.mu2 f207284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f207285c;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b, r45.mu2 mu2Var, int i17) {
        this.f207283a = activityC14941x5c78ef2b;
        this.f207284b = mu2Var;
        this.f207285c = i17;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b.E;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContactSearchIncludeFollowUI", "privacy result " + bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        boolean booleanValue = bool.booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14941x5c78ef2b activityC14941x5c78ef2b = this.f207283a;
        if (booleanValue) {
            activityC14941x5c78ef2b.X6(this.f207284b, this.f207285c);
        }
        if (activityC14941x5c78ef2b.f207053t == 0) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14941x5c78ef2b.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC14941x5c78ef2b.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        java.lang.String e17 = xy2.c.e(mo55332x768471792);
        r45.xw4 xw4Var = new r45.xw4();
        xw4Var.set(0, 1);
        r45.ny0 ny0Var = new r45.ny0();
        ny0Var.set(0, java.lang.Long.valueOf(activityC14941x5c78ef2b.f207053t));
        xw4Var.set(1, hc2.b.a(ny0Var));
        cq.j1.d(kVar, V6, e17, xw4Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.i(activityC14941x5c78ef2b), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.k(activityC14941x5c78ef2b));
    }
}
