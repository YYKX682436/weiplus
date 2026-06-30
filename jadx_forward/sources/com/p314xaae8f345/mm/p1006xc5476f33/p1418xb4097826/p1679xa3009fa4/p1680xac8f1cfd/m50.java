package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class m50 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public int f216657d;

    /* renamed from: e, reason: collision with root package name */
    public long f216658e;

    /* renamed from: f, reason: collision with root package name */
    public int f216659f;

    /* renamed from: g, reason: collision with root package name */
    public int f216660g;

    /* renamed from: h, reason: collision with root package name */
    public final long f216661h;

    /* renamed from: i, reason: collision with root package name */
    public final int f216662i;

    /* renamed from: m, reason: collision with root package name */
    public int f216663m;

    /* renamed from: n, reason: collision with root package name */
    public int f216664n;

    /* renamed from: o, reason: collision with root package name */
    public long f216665o;

    /* renamed from: p, reason: collision with root package name */
    public long f216666p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f216667q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f216668r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f216669s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f216670t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f216661h = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y8).mo141623x754a37bb()).r()).longValue();
        this.f216662i = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Z8).mo141623x754a37bb()).r()).intValue();
        this.f216665o = -1L;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("Finder.SilentPlayControlUIC", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l50(this), true);
        b4Var.m77789xc5a5549d(false);
        this.f216669s = b4Var;
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m50 m50Var, long j17, int i17, int i18, boolean z17) {
        m50Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SilentPlayControlUIC", "[pausePlay] feedId=" + pm0.v.u(j17) + " isImage=" + z17 + " limitPlayDuration=" + m50Var.f216661h + " limitPlayCount=" + m50Var.f216662i);
        m50Var.P6(1, z17, j17, i17, i18, true);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j50(z17, m50Var));
    }

    public final void P6(int i17, boolean z17, long j17, int i18, int i19, boolean z18) {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", pm0.v.u(j17));
            if (!z17) {
                cl0.g gVar2 = new cl0.g();
                gVar2.o("current_play_sec", i18);
                gVar2.o("video_duration", i19);
                gVar.h("video_play_info", gVar2);
            }
            gVar.o("pause_type", i17);
            if (i17 == 1) {
                cl0.g gVar3 = new cl0.g();
                gVar3.o("replay_cnt", this.f216657d);
                gVar3.p("freeze_sec", (java.lang.System.currentTimeMillis() - this.f216658e) / 1000);
                gVar.h("auto_pause", gVar3);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SilentPlayControlUIC", "[report] isExposed=" + z18 + ' ' + gVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.String gVar4 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
            g0Var.d(21875, V6.m75945x2fec8307(0), V6.m75945x2fec8307(1), java.lang.Integer.valueOf(V6.m75939xb282bd08(5)), java.lang.Integer.valueOf(1 ^ (z18 ? 1 : 0)), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "button_goon_play", r26.i0.t(gVar4, ",", ";", false), V6.m75945x2fec8307(2), java.lang.Integer.valueOf(V6.m75939xb282bd08(7)));
        }
    }

    public final void Q6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SilentPlayControlUIC", "[reset] playCount=" + this.f216657d + " playTime=" + (java.lang.System.currentTimeMillis() - this.f216658e) + "ms source=" + str);
        this.f216657d = 0;
        this.f216658e = java.lang.System.currentTimeMillis();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        Q6("onKeyDown");
        return super.mo2278x1f03f0c2(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        this.f216669s.d();
        this.f216670t = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onWindowFocusChanged */
    public void mo14961xa4ec7b0b(boolean z17) {
        super.mo14961xa4ec7b0b(z17);
        Q6("WINDOW_FOCUS");
    }
}
