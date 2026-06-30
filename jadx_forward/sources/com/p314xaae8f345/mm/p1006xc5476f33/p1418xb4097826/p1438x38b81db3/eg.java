package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class eg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15330x673c21f7 f184793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg f184794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184795g;

    public eg(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15330x673c21f7 c15330x673c21f7, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar, in5.s0 s0Var) {
        this.f184792d = z17;
        this.f184793e = c15330x673c21f7;
        this.f184794f = qgVar;
        this.f184795g = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        boolean z18;
        boolean z19 = this.f184792d;
        in5.s0 s0Var = this.f184795g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qg qgVar = this.f184794f;
        if (!z19) {
            qgVar.r(s0Var, true, true);
            return;
        }
        android.content.Context context = this.f184793e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu nuVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nu.class);
        nuVar.S6("popup_show", qgVar.f185913e.f190295p, false);
        so2.q4 q4Var = so2.q4.f492084a;
        r45.ep2 ep2Var = (r45.ep2) ((jz5.n) nuVar.f216892m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ep2Var, "<this>");
        if (ep2Var.m75939xb282bd08(0) > 0 || ep2Var.m75939xb282bd08(1) > 0) {
            jz5.g gVar = nuVar.f216893n;
            r45.pb4 pb4Var = (r45.pb4) ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pb4Var, "<this>");
            boolean a17 = q4Var.a(pb4Var);
            long c17 = c01.id.c();
            if (pb4Var.m75939xb282bd08(1) <= 0) {
                pb4Var.set(1, 1);
                pb4Var.set(0, java.lang.Long.valueOf(c17));
            } else {
                pb4Var.set(1, java.lang.Integer.valueOf(pb4Var.m75939xb282bd08(1) + 1));
            }
            pb4Var.set(2, java.lang.Long.valueOf(c01.id.c()));
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
                z18 = false;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopupLogic", "finderPopupExpose overDay=" + a17 + ",expose_cnt=" + pb4Var.m75939xb282bd08(1) + ",first_expose_time=" + pb4Var.m75942xfb822ef2(0) + ",last_expose_time=" + pb4Var.m75942xfb822ef2(2));
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_POPUP_EXPOSE_INFO_STRING, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(((r45.pb4) ((jz5.n) gVar).mo141623x754a37bb()).mo14344x5f01b1f6()));
        }
        qgVar.r(s0Var, false, true);
    }
}
