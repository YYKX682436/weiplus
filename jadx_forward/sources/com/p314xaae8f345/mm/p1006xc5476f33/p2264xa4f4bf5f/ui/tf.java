package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class tf extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements l75.q0, qi4.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f255858d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f255859e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f255860f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f255861g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f255862h;

    /* renamed from: i, reason: collision with root package name */
    public int f255863i;

    /* renamed from: m, reason: collision with root package name */
    public int f255864m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f255865n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f255858d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.pf(this, activity));
        this.f255859e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.of(this));
        this.f255860f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kf.f255572d);
        this.f255861g = true;
        this.f255862h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.sf(this));
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.rf(this));
        this.f255865n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.qf(this));
    }

    public static final int O6(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf tfVar, oa.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ff ffVar;
        tfVar.getClass();
        java.lang.Object obj = iVar.f425311a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf jfVar = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf) obj : null;
        if (jfVar == null || (ffVar = jfVar.f255553e) == null) {
            return 0;
        }
        return ffVar.f255415b;
    }

    public static final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf tfVar, oa.i iVar, boolean z17) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        tfVar.getClass();
        java.lang.Object obj = iVar.f425311a;
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf) {
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf jfVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf) obj;
                jfVar.b(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj);
                jfVar.a(false);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf jfVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf) obj;
            jfVar2.b(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            jfVar2.a(true);
            if (iVar.f425315e == 0) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = tfVar.m158354x19263085();
                abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
                if (abstractActivityC21394xb3d2c0cf != null) {
                    abstractActivityC21394xb3d2c0cf.mo74408xb0dfae51(true);
                    return;
                }
                return;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = tfVar.m158354x19263085();
            abstractActivityC21394xb3d2c0cf = m158354x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852 : null;
            if (abstractActivityC21394xb3d2c0cf != null) {
                abstractActivityC21394xb3d2c0cf.mo74408xb0dfae51(false);
            }
        }
    }

    @Override // qi4.b
    public void L3(java.lang.String event, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusPagerUIC", "onObserver() called with: event = " + event + ", eventId = " + i17);
        U6(0);
        if (S6().m20352xe06bcb0d() == 0) {
            T6(0);
        }
    }

    public final void Q6(oa.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ff ffVar) {
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17 = iVar.f425315e;
        java.util.Objects.toString(ffVar);
        java.lang.Object obj = iVar.f425311a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf jfVar = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf) obj : null;
        if (jfVar != null) {
            jfVar.f255553e = ffVar;
            int i18 = ffVar.f255414a;
            jz5.g gVar = jfVar.f255552d;
            jz5.g gVar2 = jfVar.f255551c;
            if (i18 == 0) {
                android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb();
                if (textView != null) {
                    textView.setVisibility(8);
                }
                android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i18 == 1) {
                android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb();
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                android.widget.TextView textView3 = (android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb();
                if (textView3 != null) {
                    textView3.setText("+" + ffVar.f255415b);
                }
                android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i18 == 2) {
                android.view.View view3 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC", "attachRedInfo", "(Lcom/google/android/material/tabs/TabLayout$Tab;Lcom/tencent/mm/plugin/textstatus/ui/TextStatusPagerUIC$RedInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView4 = (android.widget.TextView) ((jz5.n) gVar2).mo141623x754a37bb();
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
            oa.k kVar = iVar.f425318h;
            if (!(kVar instanceof android.view.View)) {
                kVar = null;
            }
            if (kVar == null || (layoutParams = kVar.getLayoutParams()) == null) {
                return;
            }
            layoutParams.width = -2;
            oa.k kVar2 = iVar.f425318h;
            oa.k kVar3 = kVar2 instanceof android.view.View ? kVar2 : null;
            if (kVar3 == null) {
                return;
            }
            kVar3.setLayoutParams(layoutParams);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ef R6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ef) ((jz5.n) this.f255858d).mo141623x754a37bb();
    }

    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff S6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f255862h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) mo141623x754a37bb;
    }

    public final void T6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusPagerUIC", "markShownTime: " + i17);
        if (i17 == 0) {
            ai4.m0.f86706a.F(c01.id.e());
        } else {
            if (i17 != 1) {
                return;
            }
            ni4.x xVar = ni4.x.f419309d;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_CONV_TAB_SHOWN_INT, java.lang.Integer.valueOf(c01.id.e()));
        }
    }

    public final void U6(int i17) {
        oa.i k17;
        if (i17 == -1 || (k17 = S6().k(i17)) == null) {
            return;
        }
        Q6(k17, R6().a(i17));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ni4.x xVar = ni4.x.f419309d;
        xVar.o();
        xVar.k().mo49775xc84af884(this);
        xVar.h().mo49775xc84af884(this);
        xVar.l().mo49775xc84af884(this);
        ai4.m0 m0Var = ai4.m0.f86706a;
        m0Var.p(this, null);
        m0Var.b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(hi4.m.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        hi4.m.O6((hi4.m) a17, 4, 0, 0, 0, 14, null);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.util.Objects.toString(w0Var);
        l75.s0 s0Var = w0Var != null ? w0Var.f398508c : null;
        int i17 = 1;
        if (s0Var instanceof mj4.n ? true : s0Var instanceof mj4.p) {
            i17 = 0;
        } else {
            if (!(s0Var instanceof li4.a ? true : s0Var instanceof li4.b)) {
                i17 = -1;
            }
        }
        U6(i17);
        if (i17 == S6().m20352xe06bcb0d()) {
            T6(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        ni4.x.f419309d.o();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92;
        if (this.f255861g) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf != null && (mo78514x143f1b92 = abstractActivityC21394xb3d2c0cf.mo78514x143f1b92()) != null) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
                mo78514x143f1b92.f290186k0 = com.p314xaae8f345.mm.R.C30864xbddafb2a.cyj;
                mo78514x143f1b92.N(m158354x192630852);
            }
            int mo8338x7444f759 = R6().mo8338x7444f759();
            for (int i17 = 0; i17 < mo8338x7444f759; i17++) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ef R6 = R6();
                com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff S6 = S6();
                R6.getClass();
                oa.i l17 = S6.l();
                new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf(l17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ef R62 = R6();
                R62.getClass();
                java.lang.CharSequence mo8340x337c8253 = R62.mo8340x337c8253(i17);
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tf tfVar = R62.f255383d;
                tfVar.getClass();
                java.lang.Object obj = l17.f425311a;
                if ((obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf) && (textView = (android.widget.TextView) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jf) obj).f255550b).mo141623x754a37bb()) != null) {
                    textView.setText(mo8340x337c8253);
                }
                tfVar.Q6(l17, R62.a(i17));
                S6().d(l17, false);
            }
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.kod);
            S6().a(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.lf(c1190x18d3c3fe, this));
            c1190x18d3c3fe.m8289xa5a25773(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.mf(S6()));
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            oa.i k17 = S6().k(((java.lang.Number) ((jz5.n) ((hi4.j) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(hi4.j.class)).f363086f).mo141623x754a37bb()).intValue());
            if (k17 != null) {
                k17.b();
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = m158354x192630853 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853 : null;
            if (abstractActivityC21394xb3d2c0cf2 != null) {
                abstractActivityC21394xb3d2c0cf2.mo54450xbf7c1df6("");
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = m158354x192630854 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630854 : null;
            if (abstractActivityC21394xb3d2c0cf3 != null) {
                abstractActivityC21394xb3d2c0cf3.mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.nf(this));
            }
            ni4.x xVar = ni4.x.f419309d;
            xVar.k().add(this);
            xVar.h().add(this);
            xVar.l().add(this);
            this.f255861g = false;
        }
        ni4.x xVar2 = ni4.x.f419309d;
        int e17 = c01.id.e();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_NOTIFY_SHOWN_INT, java.lang.Integer.valueOf(e17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_LIKE_TAB_SHOWN_INT, java.lang.Integer.valueOf(e17));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_LASTTIME_CONV_TAB_SHOWN_INT, java.lang.Integer.valueOf(e17));
    }
}
