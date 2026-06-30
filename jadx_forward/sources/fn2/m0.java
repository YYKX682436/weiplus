package fn2;

/* loaded from: classes10.dex */
public final class m0 extends android.widget.LinearLayout implements fn2.y1 {

    /* renamed from: d, reason: collision with root package name */
    public final sf2.d3 f345846d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f345847e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f345848f;

    /* renamed from: g, reason: collision with root package name */
    public final fn2.u1 f345849g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f345850h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f345851i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu f345852m;

    /* renamed from: n, reason: collision with root package name */
    public fn2.t0 f345853n;

    /* renamed from: o, reason: collision with root package name */
    public int f345854o;

    /* renamed from: p, reason: collision with root package name */
    public r45.yx1 f345855p;

    /* renamed from: q, reason: collision with root package name */
    public p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f345856q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f345857r;

    /* renamed from: s, reason: collision with root package name */
    public final fn2.q1 f345858s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f345859t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context, sf2.d3 controller, p3325xe03a0797.p3326xc267989b.y0 y0Var, java.lang.String str, fn2.u1 sourceScene) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceScene, "sourceScene");
        this.f345846d = controller;
        this.f345847e = y0Var;
        this.f345848f = str;
        this.f345849g = sourceScene;
        this.f345858s = new fn2.q1(controller);
        java.util.List i17 = kz5.c0.i(new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573350mo2), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573351mo3)), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573348mo0), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f573349mo1)), new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mnm), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.mnn)));
        this.f345859t = i17;
        setOrientation(1);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dsm, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f568884s92);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f345850h = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.s_x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById2;
        this.f345851i = c1190x18d3c3fe;
        c1190x18d3c3fe.m8321x40341e13(i17.size() - 1);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.rtg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f345852m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu((android.view.ViewGroup) findViewById3, controller, y0Var, sourceScene);
        this.f345856q = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById(com.p314xaae8f345.mm.R.id.ssm);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568999vj4);
        this.f345857r = textView;
        if (textView != null) {
            textView.setOnClickListener(new fn2.d0(this));
        }
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new fn2.f0(this, null), 3, null);
        }
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new fn2.h0(this, null), 3, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu vuVar = this.f345852m;
        if (vuVar != null) {
            vuVar.c(1, bm2.y8.f103998h, 1, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singingSongWidget");
            throw null;
        }
    }

    public static final void b(fn2.m0 m0Var, int i17, int i18) {
        java.util.List list = m0Var.f345859t;
        java.lang.String string = i18 == 0 ? m0Var.getContext().getString(((java.lang.Number) ((jz5.l) list.get(i17)).f384367e).intValue()) : m0Var.getContext().getString(((java.lang.Number) ((jz5.l) list.get(i17)).f384366d).intValue(), java.lang.String.valueOf(i18));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = m0Var.f345850h;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        oa.i k17 = c2718xca2902ff.k(i17);
        if (k17 != null) {
            k17.e(string);
        }
    }

    /* renamed from: setupTabListInternal */
    private final void m129821x9d0f4d73(fn2.i1 i1Var) {
        r45.yx1 yx1Var;
        boolean z17 = false;
        java.util.List i17 = kz5.c0.i(0, 1, 2);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        fn2.t0 t0Var = new fn2.t0(context, i17, this.f345849g);
        this.f345853n = t0Var;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f345851i;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe.m8315x6cab2c8d(t0Var);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f345850h;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = this.f345851i;
        if (c1190x18d3c3fe2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c2718xca2902ff.m20382x3da43a7b(c1190x18d3c3fe2);
        fn2.l0 l0Var = new fn2.l0(this, i17);
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe3 = this.f345851i;
        if (c1190x18d3c3fe3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe3.m8289xa5a25773(l0Var);
        int i18 = i1Var != null ? i1Var.f345818b : 0;
        l0Var.mo8333x510f45c9(0);
        c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Selecting default tab: ");
        sb6.append(i18);
        sb6.append(" based on locate result: ");
        sb6.append(i1Var != null ? java.lang.Integer.valueOf(i1Var.f345818b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestSongTabRequested", sb6.toString());
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe4 = this.f345851i;
        if (c1190x18d3c3fe4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        c1190x18d3c3fe4.m8316x940d026a(i18);
        java.lang.String str = this.f345848f;
        if (str != null && (yx1Var = this.f345855p) != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, yx1Var != null ? yx1Var.f472992e : null)) {
                z17 = true;
            }
        }
        if (z17) {
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe5 = this.f345851i;
            if (c1190x18d3c3fe5 != null) {
                c1190x18d3c3fe5.postDelayed(new fn2.j0(this), 300L);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
        }
        if (i1Var == null || i1Var.f345819c < 0) {
            return;
        }
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe6 = this.f345851i;
        if (c1190x18d3c3fe6 != null) {
            c1190x18d3c3fe6.postDelayed(new fn2.k0(this, i18, i1Var), 300L);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // fn2.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fn2.m0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m129816x2fa4312f;
        fn2.t0 t0Var = this.f345853n;
        if (t0Var != null) {
            kz5.x0 it = e06.p.m(0, t0Var.mo8338x7444f759()).iterator();
            while (((e06.j) it).f327747f) {
                int b17 = it.b();
                fn2.h1 h1Var = (fn2.h1) t0Var.f345935g.get(b17);
                if (h1Var != null && (m129816x2fa4312f = h1Var.m129816x2fa4312f()) != null) {
                    int i17 = b17 == this.f345854o ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(m129816x2fa4312f, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m129816x2fa4312f.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(m129816x2fa4312f, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "enableScrollForSelectedPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m129816x2fa4312f.setNestedScrollingEnabled(b17 == this.f345854o);
                }
            }
        }
    }

    public final void d() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f345856q;
        if (c1073x7e08a787 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1073x7e08a787, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f345857r;
        if (textView != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f345850h;
        if (c2718xca2902ff == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(c2718xca2902ff, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2718xca2902ff.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(c2718xca2902ff, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = this.f345851i;
        if (c1190x18d3c3fe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(c1190x18d3c3fe, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1190x18d3c3fe.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(c1190x18d3c3fe, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequested", "hideLoadingAndShowTab", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: getTitle */
    public java.lang.String m129822x7531c8a2() {
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // fn2.y1
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vu vuVar = this.f345852m;
        if (vuVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("singingSongWidget");
            throw null;
        }
        vuVar.b();
        fn2.q1 q1Var = this.f345858s;
        q1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRequestedSongPlayListTabViewDataSource", "Clearing cache data");
        q1Var.f345892b = null;
        q1Var.f345893c = null;
        q1Var.f345894d = null;
        q1Var.f345895e = null;
    }
}
