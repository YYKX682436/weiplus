package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class nz implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fr1 f200757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rz f200758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f200760g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f200761h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200762i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200763m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f200764n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f200765o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f200766p;

    public nz(r45.fr1 fr1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rz rzVar, java.lang.String str, boolean z17, android.widget.CheckBox checkBox, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar, boolean z18, android.content.Context context) {
        this.f200757d = fr1Var;
        this.f200758e = rzVar;
        this.f200759f = str;
        this.f200760g = z17;
        this.f200761h = checkBox;
        this.f200762i = str2;
        this.f200763m = str3;
        this.f200764n = lVar;
        this.f200765o = z18;
        this.f200766p = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.md6 md6Var;
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        r45.fr1 fr1Var = this.f200757d;
        ml2.r0.Uj(r0Var, 13, 0, null, fr1Var != null ? ml2.s0.b(fr1Var) : null, 6, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rz rzVar = this.f200758e;
        if (rzVar != null) {
            rzVar.a(true);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = this.f200759f;
        if (this.f200760g) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_GAME_TEAM_START_LIVE_CHECKED_BOOLEAN_SYNC;
            android.widget.CheckBox checkBox = this.f200761h;
            c18.x(u3Var, java.lang.Boolean.valueOf(checkBox.isChecked()));
            if (checkBox.isChecked()) {
                java.lang.String m75945x2fec8307 = (fr1Var == null || (md6Var = (r45.md6) fr1Var.m75936x14adae67(16)) == null) ? null : md6Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                h0Var.f391656d = m75945x2fec8307;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "jumpGame " + this.f200762i + ", " + this.f200763m + ", launchParams:" + ((java.lang.String) h0Var.f391656d));
        pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mz(this.f200763m, h0Var, this.f200764n, this.f200765o, this.f200766p, this.f200762i));
    }
}
