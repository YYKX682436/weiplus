package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui;

/* renamed from: com.tencent.mm.plugin.sight.decode.ui.VideoPlayView */
/* loaded from: classes4.dex */
public class C17691x8fb37d74 extends android.widget.RelativeLayout implements c01.i, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public boolean B;
    public long C;
    public final android.view.animation.Animation D;
    public final android.view.animation.Animation E;
    public final java.lang.Runnable F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public int f244040d;

    /* renamed from: e, reason: collision with root package name */
    public int f244041e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f244042f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f244043g;

    /* renamed from: h, reason: collision with root package name */
    public m34.a0 f244044h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f244045i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f244046m;

    /* renamed from: n, reason: collision with root package name */
    public m34.d f244047n;

    /* renamed from: o, reason: collision with root package name */
    public double f244048o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f244049p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f244050q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f244051r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f244052s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f244053t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f244054u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f244055v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f244056w;

    /* renamed from: x, reason: collision with root package name */
    public int f244057x;

    /* renamed from: y, reason: collision with root package name */
    public int f244058y;

    /* renamed from: z, reason: collision with root package name */
    public int f244059z;

    public C17691x8fb37d74(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f244040d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
        this.f244041e = 240;
        this.f244042f = true;
        this.f244046m = null;
        this.f244048o = 0.0d;
        this.f244051r = "";
        this.f244052s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f244055v = true;
        this.f244057x = 0;
        this.f244058y = 0;
        this.f244059z = 0;
        this.A = false;
        this.B = false;
        this.C = 0L;
        this.D = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.E = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.F = new m34.v(this);
        this.G = 0;
        e();
    }

    @Override // c01.i
    public void P0() {
    }

    @Override // c01.i
    public void U5() {
    }

    @Override // c01.i
    public void V3() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void a(double d17, boolean z17) {
        b(d17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public void b(double d17) {
        this.f244046m.b(d17);
        this.f244047n.a((int) d17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    public boolean c(android.content.Context context, boolean z17) {
        return this.f244046m.c(context, z17);
    }

    public void d() {
        java.lang.Object obj = this.f244047n;
        if (obj != null) {
            android.view.View view = (android.view.View) obj;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f244053t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f244054u.setVisibility(8);
        android.view.View view3 = this.f244049p;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "hideBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void e() {
        this.D.setDuration(200L);
        this.E.setDuration(200L);
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.d3l, this);
        this.f244053t = findViewById(com.p314xaae8f345.mm.R.id.kwk);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.jgc);
        this.f244054u = imageView;
        imageView.getDrawable().setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
        this.f244043g = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.lc6);
        this.f244045i = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.oy7);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n8.a(getContext());
        this.f244046m = a17;
        a17.mo69317x764cf626(false);
        this.f244045i.addView((android.view.View) this.f244046m, 0, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mva);
        this.f244050q = textView;
        this.f244049p = textView;
        this.f244046m.mo69326x360a109e(new m34.s(this));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f244046m;
        if (f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) f4Var).m75836x6d699c8d(false);
        }
        setOnTouchListener(new m34.t(this));
        d();
        ((android.view.View) this.f244046m).post(new m34.u(this));
    }

    public final void f(int i17) {
        this.f244048o = i17 >= 0 ? i17 : this.f244046m.mo69308x9c2553a6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayView", "pause play " + this.f244048o + " lastTime: " + i17 + " last " + this.f244046m.mo69308x9c2553a6());
        this.f244046m.mo69313x65825f6();
        this.f244052s.mo50293x3498a0(new m34.y(this));
        m34.a0 a0Var = this.f244044h;
        if (a0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPausePlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933 activityC18151xfc5a9933 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iy) a0Var).f250991a;
            c01.k kVar = activityC18151xfc5a9933.f249189d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            kVar.a();
            j64.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T6(activityC18151xfc5a9933).f370654i;
            int i19 = bVar.f379444c;
            long j17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T6(activityC18151xfc5a9933).f370654i.f379448g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            bVar.f379444c = i19 + ((int) (android.os.SystemClock.elapsedRealtime() - j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.U6(activityC18151xfc5a9933, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPausePlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
    }

    public final void g() {
        android.view.View view = (android.view.View) this.f244047n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f244053t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "showBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f244055v) {
            this.f244054u.setVisibility(0);
        }
        if ((this.G == 2 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f244051r)) ? false : true) {
            android.view.View view3 = this.f244049p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "tryShowMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView", "tryShowMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f244052s;
        java.lang.Runnable runnable = this.F;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 3000L);
    }

    @Override // c01.i
    public void g3() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getCurrentPosition */
    public int mo69307x9746038c() {
        return this.f244046m.mo69307x9746038c();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getDuration */
    public int mo69286x51e8b0a() {
        int i17 = this.f244057x;
        return i17 == 0 ? this.f244046m.mo69286x51e8b0a() : i17;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getLastProgresstime */
    public double mo69308x9c2553a6() {
        return java.lang.Math.max(this.f244048o, this.f244046m.mo69308x9c2553a6());
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getLastSurfaceUpdateTime */
    public long mo69309x53bc4617() {
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: getVideoPath */
    public java.lang.String getF256131m() {
        return this.f244056w;
    }

    public final void h(boolean z17) {
        this.f244046m.b(this.f244048o);
        this.f244046m.mo69330x68ac462();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayView", "startplay get duration " + this.f244057x + " lastPlayProgressTime: " + this.f244048o);
        m34.a0 a0Var = this.f244044h;
        if (a0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933 activityC18151xfc5a9933 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iy) a0Var).f250991a;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T6(activityC18151xfc5a9933).f370654i.f379447f = activityC18151xfc5a9933.getResources().getConfiguration().orientation == 2 ? 2 : 1;
                j64.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T6(activityC18151xfc5a9933).f370654i;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                bVar.f379448g = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T6(activityC18151xfc5a9933).f370654i.f379446e = 2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T6(activityC18151xfc5a9933).f370654i.f379444c = 0;
            }
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            boolean z19 = activityC18151xfc5a9933.P;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (!z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74 = activityC18151xfc5a9933.f249190e;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                if (((int) c17691x8fb37d74.mo69308x9c2553a6()) == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T6(activityC18151xfc5a9933).f370654i.f379442a++;
                }
            }
            j64.b bVar2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.T6(activityC18151xfc5a9933).f370654i;
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            bVar2.f379448g = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            c01.k kVar = activityC18151xfc5a9933.f249189d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d742 = activityC18151xfc5a9933.f249190e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            kVar.c(c17691x8fb37d742);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            int i18 = activityC18151xfc5a9933.L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (i18 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,1,0,");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str = activityC18151xfc5a9933.M;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str);
                sb6.append(",");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str2 = activityC18151xfc5a9933.N;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str2);
                sb6.append(",");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                sb6.append(",");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                java.lang.String str3 = activityC18151xfc5a9933.K;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                sb6.append(str3);
                sb6.append(",");
                sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.V6(activityC18151xfc5a9933));
                com.p314xaae8f345.mm.p959x883644fd.r rVar = new com.p314xaae8f345.mm.p959x883644fd.r(13227, sb6.toString(), (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                gm0.j1.i();
                gm0.j1.n().f354821b.g(rVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.U6(activityC18151xfc5a9933, true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartPlay", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
    }

    public final void i(int i17) {
        this.B = true;
        if (this.f244059z == 0 || this.f244058y == 0) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            int i18 = displayMetrics.heightPixels;
            this.f244059z = i18;
            int i19 = displayMetrics.widthPixels;
            this.f244058y = i19;
            if (i18 < i19) {
                this.f244059z = i19;
                this.f244058y = i18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayView", "getScreen screen_height:" + this.f244059z + " screen_width:" + this.f244058y);
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f244045i.getLayoutParams();
        java.lang.Object obj = this.f244047n;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = obj == null ? null : (android.widget.RelativeLayout.LayoutParams) ((android.view.View) obj).getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        if (i17 == 1) {
            int i27 = this.f244058y;
            layoutParams3.width = i27;
            layoutParams3.height = (int) (((i27 * 1.0d) * this.f244041e) / this.f244040d);
            if (this.f244047n != null) {
                layoutParams2.bottomMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 0.0f);
            }
        } else {
            int i28 = this.f244058y;
            layoutParams3.height = i28;
            layoutParams3.width = (int) (((i28 * 1.0d) * this.f244040d) / this.f244041e);
            if (this.f244047n != null) {
                layoutParams2.bottomMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(getContext(), 0.0f);
            }
        }
        m34.d dVar = this.f244047n;
        if (dVar != null) {
            dVar.g();
            ((android.view.View) this.f244047n).setLayoutParams(layoutParams2);
            if (this.f244047n instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10) {
                this.f244052s.mo50297x7c4d7ca2(new m34.z(this), 500L);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayView", "orientation " + i17 + " " + layoutParams3.width + " " + layoutParams3.height);
        ((android.view.View) this.f244046m).setLayoutParams(layoutParams3);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f244046m;
        if (f4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.a) f4Var).e(layoutParams3.width, layoutParams3.height);
        }
        layoutParams.height = layoutParams3.height;
        layoutParams.width = layoutParams3.width;
        this.f244045i.setLayoutParams(layoutParams);
        ((android.view.View) this.f244046m).requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: isPlaying */
    public boolean mo69311xc00617a4() {
        return this.f244046m.mo69311xc00617a4();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: onDetach */
    public void mo69312x3f5eee52() {
        this.f244046m.mo69312x3f5eee52();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: pause */
    public void mo69313x65825f6() {
        f(-1);
    }

    /* renamed from: setForceScaleFullScreen */
    public void m69314x772f3ddc(boolean z17) {
    }

    /* renamed from: setIsDownloading */
    public void m69315xb3fa618e(boolean z17) {
        this.A = z17;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f244046m;
        if (f4Var == null || !(f4Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7)) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7 c19747xde723c7 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) f4Var;
        if (c19747xde723c7.m69285x143f1b92() != null) {
            c19747xde723c7.m69285x143f1b92().f243998u = !z17;
        }
    }

    /* renamed from: setLeftButtonOnClickListener */
    public void m69316x60d99122(android.view.View.OnClickListener onClickListener) {
        this.f244053t.setOnClickListener(onClickListener);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setLoop */
    public void mo69317x764cf626(boolean z17) {
        this.f244046m.mo69317x764cf626(z17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setMute */
    public void mo69318x764d819b(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnInfoCallback */
    public void mo69319xe6781b94(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4 b4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSeekCompleteCallback */
    public void mo69320x87223eb7(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4 c4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOnSurfaceCallback */
    public void mo69321x146557f1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4 d4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setOneTimeVideoTextureUpdateCallback */
    public void mo69322xfae314df(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4 e4Var) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setPlayProgressCallback */
    public void mo69323xc2339c68(boolean z17) {
        this.f244046m.mo69323xc2339c68(z17);
    }

    /* renamed from: setRightButtonOnCliclListener */
    public void m69324xfb553972(android.view.View.OnClickListener onClickListener) {
        this.f244054u.setOnClickListener(onClickListener);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setThumb */
    public void mo69325x53bf7294(android.graphics.Bitmap bitmap) {
        this.f244046m.mo69325x53bf7294(bitmap);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoCallback */
    public void mo69326x360a109e(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 a4Var) {
        this.f244046m.mo69326x360a109e(a4Var);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: setVideoPath */
    public void mo69327xab3268fe(java.lang.String str) {
        this.f244056w = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayView", "videoPath  %s", str);
        this.f244046m.mo69327xab3268fe(this.f244056w);
    }

    /* renamed from: setVideoPlayViewEvent */
    public void m69328x9cac7568(m34.a0 a0Var) {
        this.f244044h = a0Var;
    }

    /* renamed from: setVideoTotalTime */
    public void m69329xa7077af8(int i17) {
        if (this.f244047n.mo69281xdf1112ec() != i17) {
            this.f244047n.mo61298xa7077af8(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: start */
    public boolean mo69330x68ac462() {
        h(true);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4
    /* renamed from: stop */
    public void mo69303x360802() {
        this.f244046m.mo69303x360802();
    }

    public C17691x8fb37d74(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f244040d = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e;
        this.f244041e = 240;
        this.f244042f = true;
        this.f244046m = null;
        this.f244048o = 0.0d;
        this.f244051r = "";
        this.f244052s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f244055v = true;
        this.f244057x = 0;
        this.f244058y = 0;
        this.f244059z = 0;
        this.A = false;
        this.B = false;
        this.C = 0L;
        this.D = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.E = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.F = new m34.v(this);
        this.G = 0;
        e();
    }
}
