package un;

/* loaded from: classes11.dex */
public abstract class h extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f510806d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f510807e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f510808f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f510809g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f510810h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f510811i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.SharedPreferences.OnSharedPreferenceChangeListener f510812m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f510807e = jz5.h.b(new un.g(activity));
        this.f510808f = jz5.h.b(new un.e(activity));
        this.f510809g = jz5.h.b(new un.f(this));
        this.f510810h = jz5.h.b(new un.c(this));
        this.f510812m = new un.b(this);
    }

    public void O6(boolean z17) {
        boolean z18 = W6().getBoolean("room_placed_to_the_top", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(X6(), "changePlacedTop() called isCurInPlaceTop:%s isNeedModContact:%s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f510806d;
        if (z3Var != null) {
            if (z18) {
                c01.e2.t0(z3Var.d1(), true, z17);
                if (W6().getBoolean("room_set_to_conv_box", false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(X6(), "changePlacedTop() unset convBox");
                    Q6(java.lang.Boolean.FALSE, false);
                }
            } else {
                c01.e2.B0(z3Var.d1(), true, z17);
            }
            qn.d dVar = z18 ? qn.d.f446416f : qn.d.f446415e;
            qn.e eVar = qn.e.f446419a;
            java.lang.String d17 = z3Var.d1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
            eVar.b(d17, dVar, qn.b.f446406e);
            X6();
        }
    }

    public void P6() {
        Q6(null, true);
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        java.lang.String U6 = U6();
        ((py.a) iVar).getClass();
        boolean y17 = c01.v1.y(U6);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7 c6363x8f18fad7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7();
        c6363x8f18fad7.f137131d = c6363x8f18fad7.b("roomUsername", U6(), true);
        c6363x8f18fad7.f137132e = y17 ? 1L : 0L;
        c6363x8f18fad7.k();
    }

    public void Q6(java.lang.Boolean bool, boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(X6(), "dealSetToConvBox preSetValue:%s isNeedModContact:%s", bool, java.lang.Boolean.valueOf(z17));
        if (bool != null) {
            W6().edit().putBoolean("room_set_to_conv_box", bool.booleanValue()).apply();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(U6());
        if (p17 == null) {
            p17 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4(U6());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(p17);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 R6 = R6();
        if (a7(c01.z1.r(), R6)) {
            if (!W6().getBoolean("room_set_to_conv_box", false)) {
                qy.j jVar = (qy.j) i95.n0.c(qy.j.class);
                java.lang.String U6 = U6();
                boolean z18 = !(this instanceof un.j1);
                xf5.c cVar = (xf5.c) jVar;
                cVar.getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(U6, true);
                if (n17 != null) {
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n17.d1())) {
                        n17.k3(false);
                    } else {
                        n17.W1(n17.c1() & (-129));
                        n17.k3(false);
                    }
                    c01.v1.L(U6, R6, 0, n17, z17, z18);
                    cVar.cj(p17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvBoxConversationService", "setToConvBox isNeedModContact:%s conversation:%s, del from conv box :%s %s", java.lang.Boolean.valueOf(z17), U6, java.lang.Boolean.valueOf(n17.v2()), p17.W0());
                    return;
                }
                return;
            }
            boolean z19 = W6().getBoolean("room_placed_to_the_top", false);
            boolean z27 = z17 && !z19;
            qy.j jVar2 = (qy.j) i95.n0.c(qy.j.class);
            java.lang.String U62 = U6();
            boolean z28 = !(this instanceof un.j1);
            xf5.c cVar2 = (xf5.c) jVar2;
            cVar2.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(U62, true);
            if (n18 != null) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n18.d1())) {
                    n18.k3(true);
                    str = "MicroMsg.ConvBoxConversationService";
                } else {
                    str = "MicroMsg.ConvBoxConversationService";
                    n18.W1(n18.c1() | 128);
                    n18.k3(false);
                }
                n18.mo43621x7650bebc(n18.m124896xfb85f7b0() & (-2049));
                c01.v1.L(U62, R6, 1, n18, z27, z28);
                cVar2.Zi(p17, false, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "conversation:%s , add to conv box :%s %s", U62, java.lang.Boolean.TRUE, p17.W0());
            }
            if (z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(X6(), "dealSetToConvBox() closePlacedTop by set to convbox");
                X6();
                W6().edit().putBoolean("room_placed_to_the_top", false).commit();
                O6(true);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(U6());
                R6();
            }
            boolean z29 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20000x88ab5bc7()) == 1;
            boolean z37 = W6().getBoolean("is_show_conv_box_guide", false);
            if (z29 || !z37) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                java.lang.String U63 = U6();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7 c6363x8f18fad7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7();
                c6363x8f18fad7.f137131d = c6363x8f18fad7.b("roomUsername", U63, true);
                c6363x8f18fad7.f137132e = 2L;
                c6363x8f18fad7.k();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) m158354x19263085, 1, false);
                android.view.View inflate = android.view.View.inflate(m158354x19263085, com.p314xaae8f345.mm.R.C30864xbddafb2a.a2u, null);
                android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.cil);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cim);
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) inflate.findViewById(com.p314xaae8f345.mm.R.id.cin);
                c22789xd23e9a9b.o(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20313x85eb58f4()) == 1);
                c22789xd23e9a9b.k(m158354x19263085.getAssets(), "conv_box_guide_navigation.pag");
                c22789xd23e9a9b.m82583xcde73672(0);
                c22789xd23e9a9b.g();
                button.setOnClickListener(new vn.b(k0Var));
                textView.setOnClickListener(new vn.c(k0Var, m158354x19263085, U63));
                k0Var.f293405n = new vn.d(k0Var, inflate);
                k0Var.f293387d = new vn.e(c22789xd23e9a9b);
                k0Var.e(true);
                k0Var.v();
                W6().edit().putBoolean("is_show_conv_box_guide", true).apply();
            }
        }
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 R6() {
        return null;
    }

    public abstract boolean S6();

    public abstract boolean T6();

    public abstract java.lang.String U6();

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r V6() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r) ((jz5.n) this.f510808f).mo141623x754a37bb();
    }

    public final android.content.SharedPreferences W6() {
        return (android.content.SharedPreferences) ((jz5.n) this.f510807e).mo141623x754a37bb();
    }

    public abstract java.lang.String X6();

    public void Y6(boolean z17) {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) V6()).m("room_set_to_conv_box", z17);
    }

    public final void Z6() {
        X6();
        if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f510810h).mo141623x754a37bb()) != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = this.f510806d;
            if (z3Var != null) {
                boolean T6 = T6();
                W6().edit().putBoolean("room_placed_to_the_top", T6).commit();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(X6(), "updatePlaceTop() isContactPlaceTop:%s username:%s", java.lang.Boolean.valueOf(T6), z3Var.d1());
            } else {
                W6().edit().putBoolean("room_placed_to_the_top", false).commit();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(X6(), "updatePlaceTop() to false no contact");
            }
        }
        X6();
        if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f510809g).mo141623x754a37bb()) != null) {
            if (this.f510806d == null) {
                W6().edit().putBoolean("room_set_to_conv_box", false).commit();
                return;
            }
            boolean S6 = S6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(X6(), "updateConvBox() isInConv:%s", java.lang.Boolean.valueOf(S6));
            W6().edit().putBoolean("room_set_to_conv_box", S6).commit();
        }
    }

    public boolean a7(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
    }

    public final void b7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(X6(), "reportMuteAndConvBoxExpose isMute:" + z17);
        if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) V6()).q("room_set_to_conv_box")) {
            ((ku5.t0) ku5.t0.f394148d).g(new un.d(this));
        }
        if (this.f510811i) {
            return;
        }
        this.f510811i = true;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7 c6363x8f18fad7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7();
        c6363x8f18fad7.f137131d = c6363x8f18fad7.b("roomUsername", U6(), true);
        c6363x8f18fad7.f137132e = 12;
        c6363x8f18fad7.f137133f = z17 ? 1L : 0L;
        c6363x8f18fad7.k();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            W6().registerOnSharedPreferenceChangeListener(this.f510812m);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            W6().unregisterOnSharedPreferenceChangeListener(this.f510812m);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        this.f510811i = false;
    }
}
