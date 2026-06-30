package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class xb implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac f211547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f211548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f211549c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d f211550d;

    public xb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ac acVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d) {
        this.f211547a = acVar;
        this.f211548b = k3Var;
        this.f211549c = i17;
        this.f211550d = activityC15052xa671b52d;
    }

    @Override // vh0.i1
    /* renamed from: onResult */
    public void mo56534x57429edc(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d.D;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostAtUI", "privacy result " + bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue()) {
            this.f211547a.x(this.f211548b, this.f211549c);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15052xa671b52d activityC15052xa671b52d = this.f211550d;
            if (activityC15052xa671b52d.f210183z == 0) {
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15052xa671b52d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            cq.k kVar = (cq.k) c17;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC15052xa671b52d.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
            java.lang.String e17 = xy2.c.e(mo55332x768471792);
            r45.xw4 xw4Var = new r45.xw4();
            xw4Var.set(0, 1);
            r45.ny0 ny0Var = new r45.ny0();
            ny0Var.set(0, java.lang.Long.valueOf(activityC15052xa671b52d.f210183z));
            xw4Var.set(1, hc2.b.a(ny0Var));
            cq.j1.d(kVar, V6, e17, xw4Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ub(activityC15052xa671b52d), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.wb(activityC15052xa671b52d));
        }
    }
}
