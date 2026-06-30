package ee5;

/* loaded from: classes9.dex */
public final class q3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f333539d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f333540e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f333541f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f333542g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f333543h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f333544i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f333545m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f333546n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f333547o;

    /* renamed from: p, reason: collision with root package name */
    public int f333548p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f333549q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f333550r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f333551s;

    /* renamed from: t, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f333552t;

    /* renamed from: u, reason: collision with root package name */
    public int f333553u;

    /* renamed from: v, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f333554v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f333555w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f333556x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f333539d = jz5.h.b(new ee5.i3(this));
        this.f333540e = jz5.h.b(new ee5.h3(this));
        this.f333541f = jz5.h.b(new ee5.p3(this));
        this.f333542g = new java.util.ArrayList();
        fn5.o0 o0Var = fn5.o0.f346276d;
        this.f333549q = true;
        this.f333550r = true;
        aq.c cVar = aq.c.f94375d;
    }

    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f333540e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) mo141623x754a37bb;
    }

    public final p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe P6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f333541f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) mo141623x754a37bb;
    }

    public final void Q6() {
        if (this.f333555w) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabViewUIC", "initTabView is init");
            return;
        }
        this.f333555w = true;
        android.view.View inflate = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcu, (android.view.ViewGroup) null);
        this.f333543h = inflate;
        this.f333544i = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ggd) : null;
        android.view.View view = this.f333543h;
        this.f333546n = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ggc) : null;
        android.view.View view2 = this.f333543h;
        this.f333545m = view2 != null ? (android.widget.ProgressBar) view2.findViewById(com.p314xaae8f345.mm.R.id.ggb) : null;
        android.view.View view3 = this.f333543h;
        this.f333547o = view3 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view3.findViewById(com.p314xaae8f345.mm.R.id.gga) : null;
        R6();
    }

    public final void R6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((ee5.z) pf5.z.f435481a.a(activity).a(ee5.z.class)).f333636m.mo7806x9d92d11c(m158354x19263085(), new ee5.o3(this));
    }

    public final void S6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowProgress");
        if (!this.f333555w) {
            Q6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabViewUIC", "setImageTabToShowProgress >> is no init");
        }
        android.widget.ProgressBar progressBar = this.f333545m;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        R6();
    }

    public final void T6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabViewUIC", "setTabViewVisible >> " + i17);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f333539d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiTabViewUIC", "setTabViewVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/search/multi/uic/FTSMultiTabViewUIC", "setTabViewVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        this.f333549q = ((ee5.z) zVar.a(activity).a(ee5.z.class)).S6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        this.f333550r = ((ee5.z) zVar.a(activity2).a(ee5.z.class)).T6();
        this.f333551s = j62.e.g().l("clicfg_android_enable_emoji_vertical_search_and_full_search", false, true, true);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O6 = O6();
        oa.i l17 = O6().l();
        android.view.View inflate = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.fgy));
        l17.f425316f = inflate;
        l17.f();
        O6.b(l17);
        if (this.f333549q) {
            Q6();
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O62 = O6();
            oa.i l18 = O6().l();
            l18.f425316f = this.f333543h;
            l18.f();
            O62.b(l18);
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O63 = O6();
        oa.i l19 = O6().l();
        android.view.View inflate2 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ice));
        l19.f425316f = inflate2;
        l19.f();
        O63.b(l19);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O64 = O6();
        oa.i l27 = O6().l();
        android.view.View inflate3 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ick));
        l27.f425316f = inflate3;
        l27.f();
        O64.b(l27);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O65 = O6();
        oa.i l28 = O6().l();
        android.view.View inflate4 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate4.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ici));
        l28.f425316f = inflate4;
        l28.f();
        O65.b(l28);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O66 = O6();
        oa.i l29 = O6().l();
        android.view.View inflate5 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate5.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.icj));
        l29.f425316f = inflate5;
        l29.f();
        O66.b(l29);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O67 = O6();
        oa.i l37 = O6().l();
        android.view.View inflate6 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate6.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.icc));
        l37.f425316f = inflate6;
        l37.f();
        O67.b(l37);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O68 = O6();
        oa.i l38 = O6().l();
        android.view.View inflate7 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate7.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.icf));
        l38.f425316f = inflate7;
        l38.f();
        O68.b(l38);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O69 = O6();
        oa.i l39 = O6().l();
        android.view.View inflate8 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate8.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p7h));
        l39.f425316f = inflate8;
        l39.f();
        O69.b(l39);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O610 = O6();
        oa.i l47 = O6().l();
        android.view.View inflate9 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate9.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p7f));
        l47.f425316f = inflate9;
        l47.f();
        O610.b(l47);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O611 = O6();
        oa.i l48 = O6().l();
        android.view.View inflate10 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate10.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p7g));
        l48.f425316f = inflate10;
        l48.f();
        O611.b(l48);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O612 = O6();
        oa.i l49 = O6().l();
        android.view.View inflate11 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate11.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.oga));
        l49.f425316f = inflate11;
        l49.f();
        O612.b(l49);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O613 = O6();
        oa.i l57 = O6().l();
        android.view.View inflate12 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate12.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.og_));
        l57.f425316f = inflate12;
        l57.f();
        O613.b(l57);
        if (this.f333551s) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff O614 = O6();
            oa.i l58 = O6().l();
            android.view.View inflate13 = android.view.LayoutInflater.from(m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcv, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate13.findViewById(com.p314xaae8f345.mm.R.id.ggd)).setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p7e));
            l58.f425316f = inflate13;
            l58.f();
            O614.b(l58);
        }
        java.util.ArrayList arrayList = this.f333542g;
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21856x604a8fa());
        if (this.f333549q) {
            arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21857x403ca034());
        }
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(1));
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(2));
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(3));
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(4));
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(5));
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.y2) ((q40.f) i95.n0.c(q40.f.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10 c15104x4e0baa10 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1639x2eaf34.C15104x4e0baa10(stringExtra);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
        ee5.y0 y0Var = (ee5.y0) zVar.a(activity3).a(ee5.y0.class);
        y0Var.getClass();
        y0Var.f333626r = c15104x4e0baa10;
        arrayList.add(c15104x4e0baa10);
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(8));
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(9));
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(10));
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(6));
        arrayList.add(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21858x72911368(7));
        if (this.f333551s) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc c21744x29417dbc = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21744x29417dbc(stringExtra, false);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
            ee5.q0 q0Var = (ee5.q0) zVar.a(activity4).a(ee5.q0.class);
            q0Var.getClass();
            q0Var.f333534r = c21744x29417dbc;
            arrayList.add(c21744x29417dbc);
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe P6 = P6();
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = m158354x19263085().mo7595x9cdc264();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo7595x9cdc264, "getSupportFragmentManager(...)");
        P6.m8315x6cab2c8d(new zd5.o(mo7595x9cdc264, arrayList));
        P6().m8289xa5a25773(new oa.j(O6()));
        P6().m8316x940d026a(this.f333548p);
        O6().m20364xbc0f6683(new ee5.j3(this));
    }
}
