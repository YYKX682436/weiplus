package bf3;

/* loaded from: classes7.dex */
public final class z extends bf3.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f101209a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f101210b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f101211c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f101212d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f101213e;

    /* renamed from: f, reason: collision with root package name */
    public android.webkit.WebView f101214f;

    /* renamed from: g, reason: collision with root package name */
    public bf3.d f101215g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f101216h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f101217i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f101218j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f101219k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f101220l;

    public z(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f101209a = context;
        this.f101210b = "WAGameVConsole.html";
        this.f101211c = "wagame://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyj) + "/WAGameVConsole.html";
        this.f101212d = jz5.h.b(bf3.q.f101186d);
        this.f101216h = new java.util.ArrayList();
    }

    public static final void d(bf3.z zVar, java.lang.String str) {
        android.webkit.WebView webView = zVar.f101214f;
        if (webView != null) {
            webView.evaluateJavascript("console._log('" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str) + "')", null);
        }
    }

    @Override // bf3.p
    public void a(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f101213e = container;
        if (this.f101217i) {
            e(container);
        }
    }

    @Override // bf3.p
    public void b() {
        android.widget.FrameLayout frameLayout;
        android.webkit.WebView webView = this.f101214f;
        if (webView != null) {
            android.widget.FrameLayout frameLayout2 = this.f101213e;
            if (frameLayout2 != null) {
                frameLayout2.removeView(webView);
            }
            webView.destroy();
        }
        bf3.d dVar = this.f101215g;
        if (dVar != null && (frameLayout = this.f101213e) != null) {
            frameLayout.removeView(dVar);
        }
        this.f101214f = null;
        this.f101215g = null;
        this.f101216h.clear();
        this.f101218j = false;
        this.f101219k = false;
        this.f101220l = false;
    }

    @Override // bf3.p
    public void c(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        this.f101213e = null;
        android.webkit.WebView webView = this.f101214f;
        if (webView != null) {
            container.removeView(webView);
        }
        bf3.d dVar = this.f101215g;
        if (dVar != null) {
            container.removeView(dVar);
        }
    }

    public final void e(android.widget.FrameLayout frameLayout) {
        frameLayout.setClipChildren(false);
        if (this.f101214f == null) {
            android.webkit.WebView webView = new android.webkit.WebView(this.f101209a);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setTranslationY(100000.0f);
            webView.setVisibility(8);
            webView.setWebViewClient(new bf3.y(this));
            webView.loadUrl(this.f101211c);
            this.f101214f = webView;
            bf3.d dVar = new bf3.d(this.f101209a, -16776961);
            dVar.setOnClickListener(new android.view.View.OnClickListener() { // from class: bf3.w
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View p07) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(p07);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/magicbrush/util/MBInspectorImpl$setupButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
                    bf3.z zVar = bf3.z.this;
                    zVar.f101220l = !zVar.f101220l;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBInspectorImpl", "onClick: isShow?" + zVar.f101220l);
                    android.webkit.WebView webView2 = zVar.f101214f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(webView2);
                    if (zVar.f101220l) {
                        if (!zVar.f101219k) {
                            zVar.f101219k = true;
                            ym5.a1.f(new bf3.r(zVar));
                        }
                        webView2.setVisibility(0);
                        webView2.setTranslationY(zVar.f());
                        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.addUpdateListener(new bf3.s(webView2, zVar));
                        ofFloat.start();
                    } else {
                        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.addUpdateListener(new bf3.t(webView2, zVar));
                        ofFloat2.start();
                    }
                    yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/util/MBInspectorImpl$setupButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            this.f101215g = dVar;
        }
        float f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDisplayMetrics().density;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.webkit.WebView webView2 = this.f101214f;
        if ((webView2 != null ? webView2.getParent() : null) != null) {
            android.webkit.WebView webView3 = this.f101214f;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) (webView3 != null ? webView3.getParent() : null);
            if (viewGroup != null) {
                viewGroup.removeView(this.f101214f);
            }
        }
        frameLayout.addView(this.f101214f, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        layoutParams2.bottomMargin = (int) (85 * f17);
        layoutParams2.rightMargin = (int) (15 * f17);
        bf3.d dVar2 = this.f101215g;
        if ((dVar2 != null ? dVar2.getParent() : null) != null) {
            bf3.d dVar3 = this.f101215g;
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (dVar3 != null ? dVar3.getParent() : null);
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f101215g);
            }
        }
        frameLayout.addView(this.f101215g, layoutParams2);
    }

    public final float f() {
        return ((java.lang.Number) ((jz5.n) this.f101212d).mo141623x754a37bb()).floatValue();
    }
}
