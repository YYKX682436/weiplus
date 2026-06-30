package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class j9 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f242721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k9 f242722b;

    public j9(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.k9 k9Var, boolean z17) {
        this.f242722b = k9Var;
        this.f242721a = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        float f17;
        int i17;
        if (z17) {
            l14.a.a("large_font_btn", this.f242721a);
            j65.e.k(this.f242721a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 activityC17415x5f2726f5 = this.f242722b.f242765a;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5.D;
            activityC17415x5f2726f5.getClass();
            boolean e17 = j65.e.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeIntro", "updateLargeFontStatus, lastExtStatus2:" + activityC17415x5f2726f5.f241883i + " isLargeFont:" + e17);
            if (e17) {
                activityC17415x5f2726f5.f241883i &= -33554433;
            } else {
                activityC17415x5f2726f5.f241883i |= 33554432;
            }
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(activityC17415x5f2726f5.f241883i));
            bn0.g.f104312a.g("USERINFO_EXT_STATUS2_LONG_SYNC", activityC17415x5f2726f5.f241883i);
            int i19 = e17 ? 1 : 2;
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = 90;
            p53Var.f464295e = i19;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsCareModeIntro", "switch ext change : big font open = " + e17 + " item value = " + p53Var.f464295e + " functionId = " + p53Var.f464294d);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54512xc618a7cf, java.lang.Integer.valueOf(e17 ? 1 : 0));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("care_mode_big_font_switch", "view_clk", hashMap, 29254);
            if (!j65.e.f() && !j65.e.g() && !j65.e.c() && !this.f242721a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5.T6(this.f242722b.f242765a);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17415x5f2726f5 activityC17415x5f2726f52 = this.f242722b.f242765a;
            boolean z18 = !this.f242721a;
            int b17 = f14.e.b(activityC17415x5f2726f52.mo55332x76847179());
            float n17 = i65.a.n(activityC17415x5f2726f52.mo55332x76847179());
            if (j65.e.e()) {
                f17 = 1.4f;
                i17 = 5;
            } else {
                i17 = b17;
                f17 = n17;
            }
            if (z18) {
                b17 = j65.c.e(activityC17415x5f2726f52.mo55332x76847179());
                n17 = j65.c.c(activityC17415x5f2726f52.mo55332x76847179());
                j65.e.j(0);
            } else if (b17 < i17) {
                j65.e.j(5);
                n17 = f17;
                b17 = i17;
            } else {
                j65.e.j(0);
            }
            f14.e.d(activityC17415x5f2726f52.mo55332x76847179(), n17, b17);
            j65.f.k(f14.e.c(b17));
            gm0.j1.u().c().i(true);
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v8 v8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v8(activityC17415x5f2726f52);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(v8Var, 200L, false);
        }
    }
}
