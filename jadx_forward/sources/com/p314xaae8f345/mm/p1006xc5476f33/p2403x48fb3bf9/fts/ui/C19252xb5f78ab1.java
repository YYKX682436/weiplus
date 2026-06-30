package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui;

/* renamed from: com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView */
/* loaded from: classes8.dex */
public class C19252xb5f78ab1 extends android.widget.RelativeLayout {
    public static final /* synthetic */ int V = 0;
    public boolean A;
    public kw4.e B;
    public kw4.t C;
    public boolean D;
    public boolean E;
    public int F;
    public java.lang.String G;
    public lw4.j H;
    public lw4.e I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f263599J;
    public int K;
    public boolean L;
    public boolean M;
    public android.widget.ImageView N;
    public java.lang.String P;
    public long Q;
    public android.view.View R;
    public android.view.View S;
    public kw4.v T;
    public final android.content.BroadcastReceiver U;

    /* renamed from: d, reason: collision with root package name */
    public kw4.u f263600d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19251x6f79c17d f263601e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f263602f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19230x247e287e f263603g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f263604h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f263605i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f263606m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19228x9c70cf17 f263607n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f263608o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f263609p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f263610q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f263611r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f263612s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f263613t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f263614u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f263615v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f263616w;

    /* renamed from: x, reason: collision with root package name */
    public int f263617x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f263618y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f263619z;

    public C19252xb5f78ab1(android.content.Context context, boolean z17) {
        super(context);
        this.f263600d = kw4.u.AUTO;
        this.T = kw4.v.UNKNOWN;
        this.U = new kw4.o(this);
        m74192xcc520c05(z17);
        c(context);
    }

    /* renamed from: getNetUnavailableTip */
    private java.lang.String m74180xa4523472() {
        java.lang.String str;
        if (this.K == 0) {
            return getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7t);
        }
        android.content.Context context = getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        long j17 = this.K;
        if (j17 < 0) {
            str = "";
        } else {
            java.math.BigDecimal bigDecimal = new java.math.BigDecimal(j17);
            float floatValue = bigDecimal.divide(new java.math.BigDecimal(1048576), 2, 0).floatValue();
            if (floatValue > 1.0f) {
                str = ((int) floatValue) + "M";
            } else {
                str = ((int) bigDecimal.divide(new java.math.BigDecimal(1024), 2, 0).floatValue()) + "K";
            }
        }
        objArr[0] = str;
        return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7s, objArr);
    }

    /* renamed from: getSystemVolume */
    private int m74181x3cc6389f() {
        return ((android.media.AudioManager) getContext().getSystemService("audio")).getStreamVolume(3);
    }

    /* renamed from: setCover */
    private void m74182x52d31475(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setCover mCoverUrl not null");
    }

    public final void a(boolean z17) {
        lw4.j jVar = this.H;
        if (jVar == null) {
            return;
        }
        java.lang.String str = this.f263600d == kw4.u.PORTRAIT ? "vertical" : "horizontal";
        int i17 = this.f263617x;
        jVar.getClass();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange videoPlayerId=%d isFullScreen=%b direction:%s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), str);
            org.json.JSONObject h17 = jVar.h();
            h17.put("fullScreen", z17);
            h17.put(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0, str);
            jVar.j(jVar.g(5, h17));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiVideoCallback", "onVideoFullScreenChange e=%s", e17);
        }
        l();
    }

    public final boolean b(android.content.Context context) {
        kw4.v vVar = this.T;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(context)) {
            if (this.L || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
                return true;
            }
            i();
            this.T = kw4.v.MOBILE_NET;
            this.f263603g.setVisibility(8);
            o(m74180xa4523472(), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k6o), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k6f));
            return false;
        }
        kw4.v vVar2 = kw4.v.NO_NET;
        if (vVar == vVar2) {
            android.view.View view = this.R;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.S;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f263604h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showFakeLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            postDelayed(new kw4.p(this, context), 200L);
        } else {
            this.T = vVar2;
            i();
            o(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7r), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80), null);
        }
        return false;
    }

    public final void c(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bda, this);
        this.f263601e = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19251x6f79c17d) findViewById(com.p314xaae8f345.mm.R.id.p0x);
        this.f263602f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lbi);
        this.f263604h = findViewById(com.p314xaae8f345.mm.R.id.o__);
        this.f263605i = findViewById(com.p314xaae8f345.mm.R.id.oa8);
        this.f263606m = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f564295nc);
        this.f263607n = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19228x9c70cf17) findViewById(com.p314xaae8f345.mm.R.id.f564296nd);
        this.f263608o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.n_);
        this.f263609p = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564294nb);
        this.f263610q = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cki);
        this.R = findViewById(com.p314xaae8f345.mm.R.id.ozc);
        this.S = findViewById(com.p314xaae8f345.mm.R.id.oa9);
        this.f263607n.m74116x1f2fbc1a(8);
        this.f263611r = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cko);
        this.f263612s = findViewById(com.p314xaae8f345.mm.R.id.cld);
        this.f263614u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_a);
        this.f263613t = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.o_b);
        this.f263615v = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_d);
        this.N = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.djo);
        this.f263614u.setOnClickListener(new kw4.k(this));
        this.N.setOnClickListener(new kw4.l(this));
        this.f263613t.setOnClickListener(new kw4.m(this));
        this.f263612s.setOnClickListener(new kw4.n(this));
        this.B = new kw4.e(getContext(), this, new kw4.q(this));
        this.f263601e.m74179x526554de(new kw4.r(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19230x247e287e c19230x247e287e = new com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19230x247e287e(getContext());
        this.f263603g = c19230x247e287e;
        c19230x247e287e.setVisibility(8);
        this.f263603g.m74126xf3d6d791(new kw4.s(this));
        this.f263603g.m74127xfbc5601b(new kw4.f(this));
        this.f263603g.m74128x2fdf2dbc(new kw4.g(this));
        this.f263603g.mo69283xbdcdae58(new kw4.h(this));
        this.f263603g.mo69284xb892d55(new kw4.i(this));
        this.f263603g.m74129xb1e0831d(new kw4.j(this));
        this.f263601e.mo64632xb9405cf9(this.f263603g);
        context.registerReceiver(this.U, new android.content.IntentFilter(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be));
        m();
    }

    public boolean d() {
        kw4.t tVar = this.C;
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FtsWebVideoView", "isInFullScreen mFullScreenDelegate null");
            return false;
        }
        lw4.c cVar = (lw4.c) tVar;
        kw4.c0 c0Var = cVar.f403182c.f403187c;
        int i17 = c0Var.f394692e;
        int i18 = cVar.f403180a;
        return i17 == i18 || c0Var.f394691d == i18;
    }

    public final boolean e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "isLive %b %b", java.lang.Boolean.valueOf(this.D), java.lang.Boolean.valueOf(this.f263601e.j()));
        return this.D || this.f263601e.j();
    }

    public void f() {
        if (this.f263599J || m74181x3cc6389f() != 0) {
            return;
        }
        m74202x764d819b(true);
    }

    public void g() {
        if (!this.f263599J || m74181x3cc6389f() <= 0) {
            return;
        }
        m74202x764d819b(false);
    }

    /* renamed from: getCallback */
    public lw4.j m74183x71965dbb() {
        return this.H;
    }

    /* renamed from: getCookieData */
    public java.lang.String m74184x900d5424() {
        return this.f263616w;
    }

    /* renamed from: getCurrPosMs */
    public int m74185x25784152() {
        return this.f263601e.mo64621x25784152();
    }

    /* renamed from: getCurrPosSec */
    public int m74186x898ffe25() {
        return this.f263601e.mo61523x898ffe25();
    }

    /* renamed from: getUiLifecycleListener */
    public lw4.e m74187xae398ed4() {
        return this.I;
    }

    /* renamed from: getVideoSizeByte */
    public int m74188xdfeb568e() {
        return this.K;
    }

    /* renamed from: getmVideoPlayerId */
    public int m74189xe57a46e0() {
        return this.f263617x;
    }

    public void h(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "operateFullScreen toFullScreen=%b", java.lang.Boolean.valueOf(z17));
        if (this.C == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FtsWebVideoView", "operateFullScreen mFullScreenDelegate null");
            return;
        }
        if (z17 == d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "operateFullScreen current same");
            return;
        }
        if (!z17) {
            lw4.c cVar = (lw4.c) this.C;
            kw4.c0 c0Var = cVar.f403182c.f403187c;
            int i17 = cVar.f403180a;
            c0Var.getClass();
            kw4.a0 a0Var = new kw4.a0(c0Var, 1000L, java.lang.Boolean.FALSE, i17);
            if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                ((java.lang.Boolean) a0Var.a(null)).booleanValue();
            } else {
                ((java.lang.Boolean) a0Var.a(c0Var.f394689b)).booleanValue();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19230x247e287e c19230x247e287e = this.f263603g;
            c19230x247e287e.N = false;
            c19230x247e287e.w();
            return;
        }
        kw4.t tVar = this.C;
        boolean z18 = this.f263600d != kw4.u.PORTRAIT;
        lw4.c cVar2 = (lw4.c) tVar;
        kw4.c0 c0Var2 = cVar2.f403182c.f403187c;
        int i18 = cVar2.f403180a;
        lw4.a aVar = cVar2.f403181b;
        c0Var2.getClass();
        kw4.z zVar = new kw4.z(c0Var2, 1000L, java.lang.Boolean.FALSE, i18, aVar, z18);
        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
            ((java.lang.Boolean) zVar.a(null)).booleanValue();
        } else {
            ((java.lang.Boolean) zVar.a(c0Var2.f394689b)).booleanValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19230x247e287e c19230x247e287e2 = this.f263603g;
        c19230x247e287e2.N = true;
        c19230x247e287e2.w();
        a(true);
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "pause");
        m();
        if (this.f263601e.mo61531xc00617a4()) {
            this.f263601e.mo48231x65825f6();
        }
    }

    public void j(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "seek to position=%d current=%d isLive=%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f263601e.mo61523x898ffe25()), java.lang.Boolean.valueOf(this.D));
        if (e()) {
            return;
        }
        if (z17) {
            this.f263601e.a(i17, z17);
        } else {
            this.f263601e.b(i17);
        }
    }

    public void k(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setCover coverUrl=%s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.G = str;
        l01.d0.f396294a.b(this.f263610q, str, null, null);
    }

    public final void l() {
        if (d()) {
            this.N.setVisibility(0);
        } else {
            this.N.setVisibility(8);
        }
    }

    public final void m() {
        android.view.View view = this.f263604h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "setCoverGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "setCoverGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void n(java.lang.String str, boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setVideoPath path=%s isLive=%s", str, java.lang.Boolean.valueOf(z17));
        this.P = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        q();
        this.D = z17;
        this.f263601e.h(z17, str, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19230x247e287e c19230x247e287e = this.f263603g;
        if (c19230x247e287e != null) {
            c19230x247e287e.mo61298xa7077af8(i17);
        }
        int i18 = this.F;
        if (i18 > 0) {
            this.f263601e.b(i18);
        }
        if (this.f263618y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setVideoPath autoPlay");
            p(false);
        }
        if (str.startsWith("wxfile://")) {
            m74182x52d31475(str);
        }
    }

    public final void o(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        m();
        android.view.View view = this.R;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.S;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f263603g.setVisibility(8);
        android.view.View view3 = this.f263604h;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(str)) {
            this.f263615v.setVisibility(8);
        } else {
            this.f263615v.setText(str);
            this.f263615v.setVisibility(0);
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            this.f263613t.setVisibility(8);
        } else {
            this.f263613t.setText(str2);
            this.f263613t.setVisibility(0);
        }
        android.view.View view4 = this.f263605i;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f263612s;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView", "showWarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f263614u.setVisibility(8);
        l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r21.f263604h.getVisibility() == 0) == false) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "start");
        m();
        if (z17 && !b(getContext())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "start network is not wifi");
            return;
        }
        this.T = kw4.v.UNKNOWN;
        if (this.f263601e.mo61531xc00617a4()) {
            return;
        }
        if (this.f263619z) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19230x247e287e c19230x247e287e = this.f263603g;
            if (c19230x247e287e.M == null) {
                c19230x247e287e.M = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new bw4.h(c19230x247e287e), true);
            }
            c19230x247e287e.A();
            c19230x247e287e.M.d();
            c19230x247e287e.M.c(500L, 500L);
        }
        this.f263601e.mo48238x68ac462();
        if (this.Q == 0) {
            this.Q = java.lang.System.currentTimeMillis();
        } else {
            this.Q = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
    }

    public void q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "stop");
        if (this.f263601e.mo61531xc00617a4()) {
            this.f263601e.mo48239x360802();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f263603g.M;
            if (b4Var != null) {
                b4Var.d();
            }
        }
    }

    /* renamed from: setAllowMobileNetPlay */
    public void m74190xea16cea8(boolean z17) {
        this.L = z17;
    }

    /* renamed from: setAppId */
    public void m74191x52b73fda(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setAppId appid=%s", str);
    }

    /* renamed from: setAutoPlay */
    public void m74192xcc520c05(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setAutoPlay =%b", java.lang.Boolean.valueOf(z17));
        this.f263618y = z17;
    }

    /* renamed from: setCallback */
    public void m74193x6c4ebec7(lw4.j jVar) {
        this.H = jVar;
    }

    /* renamed from: setCookieData */
    public void m74194xbe31a230(java.lang.String str) {
        this.f263616w = str;
    }

    /* renamed from: setDisableScroll */
    public void m74195x1d234a93(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setDisableScroll isDisableScroll=%b", java.lang.Boolean.valueOf(z17));
    }

    /* renamed from: setDuration */
    public void m74196xffd6ec16(int i17) {
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setDuration error duration=%d", java.lang.Integer.valueOf(i17));
        }
    }

    /* renamed from: setFullScreenDelegate */
    public void m74197xda608282(kw4.t tVar) {
        this.C = tVar;
    }

    /* renamed from: setFullScreenDirection */
    public void m74198x4e6a0222(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setFullScreenDirection %s", str);
        if ("horizontal".equalsIgnoreCase(str)) {
            this.f263600d = kw4.u.LANDSCAPE;
        } else if ("vertical".equalsIgnoreCase(str)) {
            this.f263600d = kw4.u.PORTRAIT;
        } else {
            this.f263600d = kw4.u.AUTO;
        }
    }

    /* renamed from: setInitialTime */
    public void m74199xb9bf966f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setInitialTime initialTime=%d", java.lang.Integer.valueOf(i17));
        this.F = i17;
    }

    /* renamed from: setIsShowBasicControls */
    public void m74200xc2e9d13b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setIsShowBasicControls isShowBasicControls=%b", java.lang.Boolean.valueOf(z17));
        this.f263619z = z17;
    }

    /* renamed from: setLoop */
    public void m74201x764cf626(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setLoop loop=%b", java.lang.Boolean.valueOf(z17));
        this.E = z17;
    }

    /* renamed from: setMute */
    public void m74202x764d819b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setMute isMute=%b", java.lang.Boolean.valueOf(z17));
        this.f263599J = z17;
        this.f263601e.mo61536x764d819b(z17);
        if (z17) {
            this.f263603g.F.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6f);
        } else {
            this.f263603g.F.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6c);
        }
    }

    /* renamed from: setObjectFit */
    public void m74203x2f76610(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setObjectFit objectFit=%s", str);
        if ("fill".equalsIgnoreCase(str)) {
            this.f263601e.mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.FILL);
            this.f263610q.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        } else if ("cover".equalsIgnoreCase(str)) {
            this.f263601e.mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER);
            this.f263610q.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else {
            this.f263601e.mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
            this.f263610q.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        }
    }

    /* renamed from: setPageGesture */
    public void m74204x263c1df8(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FtsWebVideoView", "setPageGesture pageGesture=%b", java.lang.Boolean.valueOf(z17));
        this.A = z17;
    }

    /* renamed from: setUiLifecycleListener */
    public void m74205xfc7e4e48(lw4.e eVar) {
        this.I = eVar;
    }

    /* renamed from: setVideoPlayerId */
    public void m74206xb0516035(int i17) {
        this.f263617x = i17;
    }

    /* renamed from: setVideoSizeByte */
    public void m74207x72c1bd02(int i17) {
        this.K = i17;
    }

    public C19252xb5f78ab1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f263600d = kw4.u.AUTO;
        this.T = kw4.v.UNKNOWN;
        this.U = new kw4.o(this);
        c(context);
    }

    public C19252xb5f78ab1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f263600d = kw4.u.AUTO;
        this.T = kw4.v.UNKNOWN;
        this.U = new kw4.o(this);
        c(context);
    }
}
