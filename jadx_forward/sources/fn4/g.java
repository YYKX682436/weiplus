package fn4;

/* loaded from: classes15.dex */
public abstract class g extends android.widget.RelativeLayout {
    public static final o11.g F;
    public final fn4.b A;
    public android.widget.TextView B;
    public fn4.f C;
    public java.lang.String D;
    public r45.xn6 E;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f346042d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f346043e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f346044f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f346045g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f346046h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f346047i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f346048m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f346049n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f346050o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f346051p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f346052q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f346053r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f346054s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f346055t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f346056u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f346057v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f346058w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f346059x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f346060y;

    /* renamed from: z, reason: collision with root package name */
    public final fn4.a f346061z;

    static {
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423612c = true;
        F = fVar.a();
    }

    public g(android.content.Context context, fn4.b bVar, fn4.a aVar) {
        super(context);
        this.C = fn4.f.UNKNOWN;
        this.D = "";
        this.A = bVar;
        this.f346061z = aVar;
        d();
    }

    public abstract void a();

    public abstract com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 b(r45.xn6 xn6Var);

    public abstract void c();

    public void d() {
        android.view.LayoutInflater.from(getContext()).inflate(mo129844x2ee31f5b(), this);
        this.f346042d = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.p0z);
        this.f346043e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568009lc3);
        this.f346053r = findViewById(com.p314xaae8f345.mm.R.id.f568861oa5);
        this.f346054s = findViewById(com.p314xaae8f345.mm.R.id.oxu);
        this.f346055t = findViewById(com.p314xaae8f345.mm.R.id.p0q);
        this.f346056u = findViewById(com.p314xaae8f345.mm.R.id.oxv);
        this.f346057v = findViewById(com.p314xaae8f345.mm.R.id.oz9);
        this.f346044f = findViewById(com.p314xaae8f345.mm.R.id.ozd);
        this.f346045g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cl7);
        this.f346046h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p0a);
        this.f346047i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f346048m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.cko);
        this.f346049n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ckp);
        this.f346052q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lyg);
        this.f346050o = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.o_c);
        this.f346051p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o_d);
        this.f346059x = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kxe);
        this.f346060y = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.kxd);
        this.f346058w = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.kxf);
        this.B = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k6u);
    }

    public abstract boolean e();

    public void f(int i17) {
        fn4.b bVar = this.A;
        fn4.c1 c1Var = bVar.I2().f346106b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "seek to position=%d current=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(c1Var != null ? c1Var.mo61523x898ffe25() : 0));
        fn4.c1 c1Var2 = bVar.I2().f346106b;
        if (c1Var2 != null) {
            c1Var2.j0(i17, true);
        }
        rm4.d dVar = bVar.o4().f346012f;
        if (dVar != null) {
            dVar.f478990f = 1L;
        }
    }

    public void g() {
        this.C = fn4.f.MOBILE_NET;
        c();
        k(m129845xc7a1eb76(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jzw));
    }

    /* renamed from: getControlBar */
    public abstract fn4.h mo129842x143e7d6c();

    /* renamed from: getItemUIComponent */
    public fn4.a m129843xb51695a0() {
        return this.f346061z;
    }

    /* renamed from: getLayoutId */
    public abstract int mo129844x2ee31f5b();

    /* renamed from: getMobileNetTip */
    public java.lang.String m129845xc7a1eb76() {
        return this.E.f471787J == 0 ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0c) : getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0b, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i0(this.E.f471787J, 100.0d));
    }

    /* renamed from: getNoNetTip */
    public java.lang.String m129846x994e8055() {
        return getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k7r);
    }

    /* renamed from: getPauseReason */
    public fn4.f m129847x6ba61aa4() {
        return this.C;
    }

    /* renamed from: getVideoViewCallback */
    public abstract com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 mo129848x9535596f();

    /* renamed from: getVideoViewParent */
    public android.widget.FrameLayout m129849xb8948454() {
        return this.f346042d;
    }

    public void h() {
        k(m129846x994e8055(), this.A.B().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80));
        getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k0b, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i0(this.E.f471787J, 100.0d));
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setPlayingContainerStatus, pos:%d", java.lang.Integer.valueOf(this.f346061z.u()));
        android.view.View view = this.f346054s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346045g.setVisibility(8);
        this.f346043e.setVisibility(8);
        android.view.View view2 = this.f346053r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setPlayingContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346042d.setVisibility(0);
        this.f346042d.setAlpha(1.0f);
    }

    public void j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setStopContainerStatus, pos:%d", java.lang.Integer.valueOf(this.f346061z.u()));
        this.f346045g.setVisibility(0);
        android.view.View view = this.f346054s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346058w.setVisibility(8);
        android.view.View view2 = this.f346055t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f346053r;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f346056u;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346048m.setVisibility(0);
        this.f346049n.setVisibility(8);
        this.f346052q.setVisibility(8);
        this.f346046h.setVisibility(8);
    }

    public void k(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setWarningTipContainerStatus %s %s", str, str2);
        this.f346045g.setVisibility(0);
        android.view.View view = this.f346054s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f346055t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f346053r;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f346056u;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f346057v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f346044f;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setWarningTipContainerStatus", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (android.text.TextUtils.isEmpty(str)) {
            this.f346051p.setVisibility(8);
        } else {
            this.f346051p.setText(str);
            this.f346051p.setVisibility(0);
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            this.f346050o.setVisibility(8);
        } else {
            this.f346050o.setText(str2);
            this.f346050o.setVisibility(0);
        }
    }

    public void l() {
    }

    public abstract void m();

    public boolean n(boolean z17, boolean z18) {
        int i17;
        fn4.b bVar = this.A;
        java.lang.String t37 = bVar.t3();
        java.lang.String str = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "wifi" : su4.r2.k() ? "wangka" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "4g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "3g" : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "2g" : !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? "fail" : "";
        int h37 = bVar.h3();
        if (!bVar.s1().b()) {
            this.C = fn4.f.NO_NET;
            c();
            k(m129846x994e8055(), getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574979k80));
            bVar.I2().b(this, b(this.E));
            return false;
        }
        if (!str.equals("wifi") && !str.equals(t37)) {
            if (str.equals("wangka")) {
                if (h37 != 1 && h37 != 2) {
                    bVar.k4(1);
                    android.widget.TextView textView = this.B;
                    if (textView != null) {
                        textView.setVisibility(0);
                        this.B.setAlpha(1.0f);
                        this.B.animate().alpha(0.0f).setDuration(3000L).start();
                    } else {
                        db5.t7.m123882x26a183b(bVar.B(), com.p314xaae8f345.mm.R.C30867xcad56011.k0d, 0).show();
                    }
                }
            } else if (h37 != 2) {
                g();
                bVar.I2().b(this, b(this.E));
                return false;
            }
        }
        bVar.E3(str);
        this.D = java.util.UUID.randomUUID().toString();
        this.C = fn4.f.UNKNOWN;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "setStartPlayContainerStatus");
        android.view.View view = this.f346054s;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f346056u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f346053r;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f346058w.setVisibility(8);
        android.view.View view4 = this.f346055t;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f346057v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f346044f;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view7 = this.f346044f;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(0);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f346044f;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view8.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/topstory/ui/video/TopStoryBaseVideoContainer", "setStartPlayContainerStatus", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f346044f.animate().setDuration(4000L).setInterpolator(new android.view.animation.AccelerateInterpolator()).alpha(1.0f).start();
        this.f346045g.setVisibility(0);
        this.f346043e.setVisibility(8);
        this.f346042d.setVisibility(0);
        this.f346042d.setAlpha(0.0f);
        bVar.I2().b(this, b(this.E));
        fn4.l1 I2 = bVar.I2();
        r45.xn6 xn6Var = this.E;
        java.lang.String str2 = this.D;
        int u17 = this.f346061z.u();
        I2.getClass();
        java.util.HashMap hashMap = ((wm4.p) i95.n0.c(wm4.p.class)).f528832f;
        if (hashMap.containsKey(xn6Var.f471792h)) {
            i17 = ((java.lang.Integer) hashMap.get(xn6Var.f471792h)).intValue();
        } else {
            hashMap.put(xn6Var.f471792h, 0);
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "startPlay, pos:%s, vid:%s videoProgress: %d", java.lang.Integer.valueOf(u17), xn6Var.f471792h, java.lang.Integer.valueOf(i17));
        r45.sn6 sn6Var = xn6Var.N;
        if (sn6Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "video %s secondVideoInfo %d %d", xn6Var.f471792h, java.lang.Integer.valueOf(sn6Var.f467403g), java.lang.Integer.valueOf(xn6Var.N.f467404h));
        }
        r45.pn6 pn6Var = xn6Var.Y;
        if (pn6Var != null) {
            pn6Var.f464777o = false;
        }
        r45.xn6 xn6Var2 = I2.f346108d;
        if (xn6Var2 != null) {
            if (!xn6Var2.G.equals(xn6Var.G) || z18) {
                I2.f346106b.mo48239x360802();
                bVar.o4().g(bVar.r0());
                bVar.o4().c();
            }
            return true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xn6Var.f471789e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TopStory.TopStoryVideoViewMgr", "start play video url is null %s %s %s", str2, xn6Var.f471792h, xn6Var.f471788d);
        } else {
            bVar.o4().f(xn6Var, u17, str2);
            I2.f346114j.o4().e(xn6Var);
            I2.f346106b.mo48236x764cf626(false);
            I2.f346106b.m129837xab2f6987(xn6Var);
            I2.f346106b.mo61536x764d819b(bVar.mo72295xb9a62e63());
            I2.f346106b.setKeepScreenOn(true);
            if (i17 == 0) {
                fn4.c1 c1Var = I2.f346106b;
                c1Var.P1 = str2;
                c1Var.mo48238x68ac462();
            } else {
                fn4.c1 c1Var2 = I2.f346106b;
                c1Var2.P1 = str2;
                c1Var2.j0(i17, true);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.C18756x7b629d71) I2.f346106b.f271281q).setAlpha(1.0f);
            I2.f346108d = xn6Var;
            I2.f346109e = true;
            I2.f346110f = false;
        }
        return true;
    }

    public abstract void o();

    public void p() {
        this.f346045g.setImageDrawable(null);
        n11.a.b().h(this.E.f471790f, this.f346045g, F);
        android.widget.TextView textView = this.B;
        if (textView != null) {
            textView.animate().cancel();
            this.B.setVisibility(8);
        }
    }

    public void q(r45.xn6 xn6Var, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoContainer", "updateView position:%s", java.lang.Integer.valueOf(i17));
        this.E = xn6Var;
        p();
    }
}
