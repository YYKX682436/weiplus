package xw5;

/* loaded from: classes8.dex */
public final class d implements vw5.b {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f539279a;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f539281c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f539282d;

    /* renamed from: e, reason: collision with root package name */
    public android.webkit.WebView f539283e;

    /* renamed from: f, reason: collision with root package name */
    public xw5.b f539284f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f539286h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f539287i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f539288j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f539289k;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f539280b = jz5.h.b(new yz5.a() { // from class: xw5.d$$a
        @Override // yz5.a
        /* renamed from: invoke */
        public final java.lang.Object mo152xb9724478() {
            xw5.d this$0 = xw5.d.this;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
            if (this$0.f539279a != null) {
                return java.lang.Float.valueOf(r0.getResources().getDisplayMetrics().heightPixels);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
    });

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f539285g = new java.util.ArrayList();

    public final boolean a() {
        android.widget.FrameLayout frameLayout = this.f539282d;
        if (frameLayout == null) {
            yz5.a aVar = this.f539281c;
            frameLayout = aVar != null ? (android.widget.FrameLayout) aVar.mo152xb9724478() : null;
        }
        if (frameLayout == null) {
            return false;
        }
        this.f539282d = frameLayout;
        this.f539279a = frameLayout.getContext();
        frameLayout.setClipChildren(false);
        if (this.f539283e == null) {
            android.content.Context context = this.f539279a;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            android.webkit.WebView webView = new android.webkit.WebView(context);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setTranslationY(100000.0f);
            webView.setVisibility(8);
            webView.setWebViewClient(new xw5.f(this));
            webView.loadUrl("wemagic://WAGameVConsole.html");
            this.f539283e = webView;
            android.content.Context context2 = this.f539279a;
            if (context2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
                throw null;
            }
            xw5.b bVar = new xw5.b(context2, -16776961);
            bVar.setOnClickListener(new android.view.View.OnClickListener() { // from class: xw5.d$$c
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    final xw5.d dVar = xw5.d.this;
                    dVar.f539289k = !dVar.f539289k;
                    java.lang.String format = "onClick: isShow?" + dVar.f539289k;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
                    if (!(copyOf.length == 0)) {
                        format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
                    final android.webkit.WebView webView2 = dVar.f539283e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(webView2);
                    if (!dVar.f539289k) {
                        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new xw5.e(webView2, dVar));
                        ofFloat.start();
                        return;
                    }
                    if (!dVar.f539288j) {
                        dVar.f539288j = true;
                        com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d.f301597a.b(new xw5.RunnableC30742x2e0101(dVar));
                    }
                    webView2.setVisibility(0);
                    webView2.setTranslationY(((java.lang.Number) ((jz5.n) dVar.f539280b).mo141623x754a37bb()).floatValue());
                    android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: xw5.d$$f
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
                            android.webkit.WebView webView3 = webView2;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webView3, "$webView");
                            xw5.d this$0 = dVar;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
                            java.lang.Object animatedValue = animation.getAnimatedValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                            webView3.setTranslationY(((java.lang.Float) animatedValue).floatValue() * ((java.lang.Number) ((jz5.n) this$0.f539280b).mo141623x754a37bb()).floatValue());
                            webView3.requestLayout();
                        }
                    });
                    ofFloat2.start();
                }
            });
            this.f539284f = bVar;
        }
        android.content.Context context3 = this.f539279a;
        if (context3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("context");
            throw null;
        }
        float f17 = context3.getResources().getDisplayMetrics().density;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.webkit.WebView webView2 = this.f539283e;
        if ((webView2 != null ? webView2.getParent() : null) != null) {
            android.webkit.WebView webView3 = this.f539283e;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) (webView3 != null ? webView3.getParent() : null);
            if (viewGroup != null) {
                viewGroup.removeView(this.f539283e);
            }
        }
        frameLayout.addView(this.f539283e, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        layoutParams2.bottomMargin = (int) (85 * f17);
        layoutParams2.rightMargin = (int) (15 * f17);
        xw5.b bVar2 = this.f539284f;
        if ((bVar2 != null ? bVar2.getParent() : null) != null) {
            xw5.b bVar3 = this.f539284f;
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) (bVar3 != null ? bVar3.getParent() : null);
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f539284f);
            }
        }
        frameLayout.addView(this.f539284f, layoutParams2);
        return true;
    }

    public void b() {
        android.widget.FrameLayout frameLayout;
        android.webkit.WebView webView = this.f539283e;
        if (webView != null) {
            android.widget.FrameLayout frameLayout2 = this.f539282d;
            if (frameLayout2 != null) {
                frameLayout2.removeView(webView);
            }
            webView.destroy();
        }
        xw5.b bVar = this.f539284f;
        if (bVar != null && (frameLayout = this.f539282d) != null) {
            frameLayout.removeView(bVar);
        }
        this.f539282d = null;
        this.f539281c = null;
        this.f539283e = null;
        this.f539284f = null;
        this.f539285g.clear();
        this.f539287i = false;
        this.f539288j = false;
        this.f539289k = false;
    }

    public final void c(java.lang.String input) {
        android.webkit.WebView webView = this.f539283e;
        if (webView != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("console._log('");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
            if (!(input.length() == 0)) {
                java.lang.String[][] strArr = xw5.c.f539278a;
                for (int i17 = 0; i17 < 10; i17++) {
                    java.lang.String[] strArr2 = strArr[i17];
                    input = r26.i0.t(input, strArr2[0], strArr2[1], false);
                }
            }
            sb6.append(input);
            sb6.append("')");
            webView.evaluateJavascript(sb6.toString(), null);
        }
    }
}
