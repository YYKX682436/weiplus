package bf3;

/* loaded from: classes7.dex */
public final class z extends bf3.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f19676a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f19677b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f19678c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f19679d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f19680e;

    /* renamed from: f, reason: collision with root package name */
    public android.webkit.WebView f19681f;

    /* renamed from: g, reason: collision with root package name */
    public bf3.d f19682g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f19683h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19684i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19685j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19686k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19687l;

    public z(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f19676a = context;
        this.f19677b = "WAGameVConsole.html";
        this.f19678c = "wagame://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyj) + "/WAGameVConsole.html";
        this.f19679d = jz5.h.b(bf3.q.f19653d);
        this.f19683h = new java.util.ArrayList();
    }

    public static final void d(bf3.z zVar, java.lang.String str) {
        android.webkit.WebView webView = zVar.f19681f;
        if (webView != null) {
            webView.evaluateJavascript("console._log('" + com.tencent.mm.plugin.appbrand.utils.w2.a(str) + "')", null);
        }
    }

    @Override // bf3.p
    public void a(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f19680e = container;
        if (this.f19684i) {
            e(container);
        }
    }

    @Override // bf3.p
    public void b() {
        android.widget.FrameLayout frameLayout;
        android.webkit.WebView webView = this.f19681f;
        if (webView != null) {
            android.widget.FrameLayout frameLayout2 = this.f19680e;
            if (frameLayout2 != null) {
                frameLayout2.removeView(webView);
            }
            webView.destroy();
        }
        bf3.d dVar = this.f19682g;
        if (dVar != null && (frameLayout = this.f19680e) != null) {
            frameLayout.removeView(dVar);
        }
        this.f19681f = null;
        this.f19682g = null;
        this.f19683h.clear();
        this.f19685j = false;
        this.f19686k = false;
        this.f19687l = false;
    }

    @Override // bf3.p
    public void c(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        this.f19680e = null;
        android.webkit.WebView webView = this.f19681f;
        if (webView != null) {
            container.removeView(webView);
        }
        bf3.d dVar = this.f19682g;
        if (dVar != null) {
            container.removeView(dVar);
        }
    }

    public final void e(android.widget.FrameLayout frameLayout) {
        frameLayout.setClipChildren(false);
        if (this.f19681f == null) {
            android.webkit.WebView webView = new android.webkit.WebView(this.f19676a);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setTranslationY(100000.0f);
            webView.setVisibility(8);
            webView.setWebViewClient(new bf3.y(this));
            webView.loadUrl(this.f19678c);
            this.f19681f = webView;
            bf3.d dVar = new bf3.d(this.f19676a, -16776961);
            dVar.setOnClickListener(new android.view.View.OnClickListener() { // from class: bf3.w
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View p07) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(p07);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/magicbrush/util/MBInspectorImpl$setupButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    kotlin.jvm.internal.o.g(p07, "p0");
                    bf3.z zVar = bf3.z.this;
                    zVar.f19687l = !zVar.f19687l;
                    com.tencent.mars.xlog.Log.i("MBInspectorImpl", "onClick: isShow?" + zVar.f19687l);
                    android.webkit.WebView webView2 = zVar.f19681f;
                    kotlin.jvm.internal.o.d(webView2);
                    if (zVar.f19687l) {
                        if (!zVar.f19686k) {
                            zVar.f19686k = true;
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
            this.f19682g = dVar;
        }
        float f17 = com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().density;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.webkit.WebView webView2 = this.f19681f;
        if ((webView2 != null ? webView2.getParent() : null) != null) {
            android.webkit.WebView webView3 = this.f19681f;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) (webView3 != null ? webView3.getParent() : null);
            if (viewGroup != null) {
                viewGroup.removeView(this.f19681f);
            }
        }
        frameLayout.addView(this.f19681f, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        layoutParams2.bottomMargin = (int) (85 * f17);
        layoutParams2.rightMargin = (int) (15 * f17);
        bf3.d dVar2 = this.f19682g;
        if ((dVar2 != null ? dVar2.getParent() : null) != null) {
            bf3.d dVar3 = this.f19682g;
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (dVar3 != null ? dVar3.getParent() : null);
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f19682g);
            }
        }
        frameLayout.addView(this.f19682g, layoutParams2);
    }

    public final float f() {
        return ((java.lang.Number) ((jz5.n) this.f19679d).getValue()).floatValue();
    }
}
