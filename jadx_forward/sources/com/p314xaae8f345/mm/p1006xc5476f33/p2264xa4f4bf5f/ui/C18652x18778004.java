package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0005\u0006\u0007\b\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment;", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "Ll75/q0;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/sc", "com/tencent/mm/plugin/textstatus/ui/tc", "com/tencent/mm/plugin/textstatus/ui/uc", "com/tencent/mm/plugin/textstatus/ui/xc", "com/tencent/mm/plugin/textstatus/ui/zc", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment */
/* loaded from: classes11.dex */
public final class C18652x18778004 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 implements l75.q0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f255175y = 0;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f255176n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f255177o;

    /* renamed from: p, reason: collision with root package name */
    public int f255178p;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.uc f255180r;

    /* renamed from: t, reason: collision with root package name */
    public ui4.e f255182t;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f255179q = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final int[] f255181s = new int[2];

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f255183u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ad(this));

    /* renamed from: v, reason: collision with root package name */
    public int f255184v = -1;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.q f255185w = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.gd(this);

    /* renamed from: x, reason: collision with root package name */
    public final db5.t4 f255186x = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.hd(this);

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.tc(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: getLayoutId */
    public int mo48065x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.czp;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.r0.f395535d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        yj0.a.a("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        super.onCreateContextMenu(menu, v17, contextMenuInfo);
        menu.add(0, 0, 0, m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.uc ucVar = this.f255180r;
        if (ucVar != null) {
            ucVar.c();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dataLoader");
            throw null;
        }
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.util.Objects.toString(w0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f568817o50);
        int i17 = com.p314xaae8f345.mm.R.id.dft;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.dft);
        if (textView != null) {
            i17 = com.p314xaae8f345.mm.R.id.lqa;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.lqa);
            if (c22849x81a93d25 != null) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.m6e);
                if (c22801x87cbdc00 != null) {
                    p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) findViewById;
                    this.f255182t = new ui4.e(c1081xa22a3e5a, textView, c22849x81a93d25, c22801x87cbdc00, c1081xa22a3e5a);
                    super.mo7518x594b1124(view, bundle);
                    android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
                    this.f255178p = m7436x8619eaa0 != null ? m7436x8619eaa0.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) : 0;
                    android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.m6e);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) findViewById2;
                    this.f255176n = c22801x87cbdc002;
                    c22801x87cbdc002.m82683xb165a19d(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.jd(this));
                    android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.lqa);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById3;
                    this.f255177o = c22849x81a93d252;
                    c22849x81a93d252.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7438x76847179(), 1, false));
                    java.util.ArrayList arrayList = this.f255179q;
                    arrayList.clear();
                    final long j17 = this.f255178p == 0 ? 4L : 3L;
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusLikeListFragment$buildItemConverts$1
                        @Override // in5.s
                        /* renamed from: getItemConvert */
                        public in5.r mo43555xf2bb75ea(int type) {
                            return type != 0 ? type != 2 ? type != 4 ? new oi4.l(j17, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004.this.f255185w) : new oi4.c(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004.this.f255185w) : new oi4.j(j17, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18652x18778004.this.f255185w) : new oi4.g();
                        }
                    }, arrayList, false);
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f255177o;
                    if (c22849x81a93d253 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvLikeList");
                        throw null;
                    }
                    c22849x81a93d253.mo7960x6cab2c8d(c22848x6ddd90cf);
                    c22848x6ddd90cf.mo8163xed962dec(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ed(this));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeListActivity", "initData: scene=" + this.f255178p);
                    int i18 = this.f255178p;
                    if (i18 == 0) {
                        android.os.Bundle m7436x8619eaa02 = m7436x8619eaa0();
                        if (m7436x8619eaa02 == null || (str = m7436x8619eaa02.getString("status_id")) == null) {
                            str = "";
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc003 = this.f255176n;
                        if (c22801x87cbdc003 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.xc xcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.xc(str, c22848x6ddd90cf, c22801x87cbdc003);
                        this.f255180r = xcVar;
                        xcVar.b();
                    } else if (i18 == 1) {
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc004 = this.f255176n;
                        if (c22801x87cbdc004 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.zc zcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.zc(c22848x6ddd90cf, c22801x87cbdc004);
                        this.f255180r = zcVar;
                        zcVar.b();
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc005 = this.f255176n;
                        if (c22801x87cbdc005 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                            throw null;
                        }
                        c22801x87cbdc005.m82690xd3a27e96(false);
                    } else if (i18 == 2 || i18 == 3) {
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc006 = this.f255176n;
                        if (c22801x87cbdc006 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                            throw null;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.sc scVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.sc(c22848x6ddd90cf, c22801x87cbdc006);
                        this.f255180r = scVar;
                        scVar.b();
                        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc007 = this.f255176n;
                        if (c22801x87cbdc007 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRefreshLayout");
                            throw null;
                        }
                        c22801x87cbdc007.m82690xd3a27e96(false);
                    }
                    ai4.m0.f86706a.r();
                    int i19 = this.f255178p;
                    if (i19 == 1 || i19 == 2 || i19 == 3) {
                        if (arrayList.size() > 0) {
                            android.content.Context mo7438x76847179 = mo7438x76847179();
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo7438x76847179 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo7438x76847179 : null;
                            if (abstractActivityC21394xb3d2c0cf != null) {
                                abstractActivityC21394xb3d2c0cf.mo78491xd9193382(0, m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.cd(this));
                            }
                        }
                        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = this.f255177o;
                        if (c22849x81a93d254 != null) {
                            c22849x81a93d254.P(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.dd(this));
                            return;
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rvLikeList");
                            throw null;
                        }
                    }
                    return;
                }
                i17 = com.p314xaae8f345.mm.R.id.m6e;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        yj0.a.a("com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }
}
