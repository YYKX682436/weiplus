package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.LogoWebViewWrapper */
/* loaded from: classes8.dex */
public class C19312x9ccd54e5 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f265138d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f265139e;

    /* renamed from: f, reason: collision with root package name */
    public int f265140f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f265141g;

    /* renamed from: h, reason: collision with root package name */
    public int f265142h;

    /* renamed from: i, reason: collision with root package name */
    public int f265143i;

    /* renamed from: m, reason: collision with root package name */
    public int f265144m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r f265145n;

    /* renamed from: o, reason: collision with root package name */
    public int f265146o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f265147p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f265148q;

    /* renamed from: r, reason: collision with root package name */
    public int f265149r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.q f265150s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f265151t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f265152u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f265153v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f265154w;

    /* renamed from: x, reason: collision with root package name */
    public int f265155x;

    public C19312x9ccd54e5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f265141g = false;
        this.f265146o = 0;
        this.f265147p = false;
        this.f265148q = false;
        this.f265149r = 0;
        this.f265151t = false;
        this.f265152u = false;
        this.f265153v = false;
        this.f265154w = false;
        this.f265155x = -1;
        setOrientation(1);
        this.f265140f = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* renamed from: getLogoHeight */
    private int m74370x82f2cea8() {
        if (this.f265155x < 0) {
            if (this.f265154w) {
                this.f265155x = getHeight();
            } else {
                this.f265155x = (int) android.util.TypedValue.applyDimension(1, 60, getContext().getResources().getDisplayMetrics());
            }
        }
        return this.f265155x;
    }

    /* renamed from: getOverScrollDistance */
    private int m74371xa3eb21cc() {
        return getHeight();
    }

    /* renamed from: getScrollBackDuration */
    private long m74372x4919b0fe() {
        long abs = java.lang.Math.abs(getScrollY());
        if (java.lang.Math.abs(abs - java.lang.Math.abs(this.f265149r)) >= abs) {
            return 300L;
        }
        return (((float) r2) / ((float) abs)) * 300.0f;
    }

    public final void a(int i17) {
        int m74371xa3eb21cc = m74371xa3eb21cc();
        scrollTo(0, java.lang.Math.min(m74371xa3eb21cc, java.lang.Math.max(-m74371xa3eb21cc, i17)));
    }

    public void b(int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r rVar = this.f265145n;
        if (rVar != null) {
            rVar.f268324h = false;
            rVar.f268327n.removeCallbacks(rVar);
        }
        int scrollY = getScrollY();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LogoWebViewWrapper", "smoothScrollTo oldScrollValue = %s, newScrollValue = %s", java.lang.Integer.valueOf(scrollY), java.lang.Integer.valueOf(i17));
        if (scrollY != i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r rVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r(this, scrollY, i17, j17);
            this.f265145n = rVar2;
            post(rVar2);
        }
    }

    /* renamed from: getWebView */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 m74373x86b9ebe3() {
        return this.f265138d;
    }

    /* renamed from: getWebViewContainer */
    public android.widget.FrameLayout m74374x60512fde() {
        if (this.f265139e == null) {
            int childCount = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount) {
                    break;
                }
                android.view.View childAt = getChildAt(i17);
                if ((childAt instanceof android.widget.FrameLayout) && childAt.getId() == com.p314xaae8f345.mm.R.id.ipm) {
                    this.f265139e = (android.widget.FrameLayout) childAt;
                    break;
                }
                i17++;
            }
        }
        return this.f265139e;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f265147p && !this.f265151t) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f265141g = false;
            this.f265146o = 0;
            this.f265152u = false;
            return false;
        }
        if (action == 2 && this.f265141g) {
            return true;
        }
        if (action != 0) {
            if (action == 2 && this.f265138d.y()) {
                if (!this.f265152u) {
                    this.f265142h = (int) motionEvent.getY();
                    this.f265143i = (int) motionEvent.getY();
                    this.f265144m = (int) motionEvent.getX();
                    this.f265141g = false;
                    this.f265146o = 0;
                    this.f265151t = true;
                    this.f265152u = true;
                    return false;
                }
                int y17 = (int) motionEvent.getY();
                int x17 = (int) motionEvent.getX();
                int i17 = y17 - this.f265142h;
                int i18 = x17 - this.f265144m;
                if (java.lang.Math.abs(i17) > this.f265140f && java.lang.Math.abs(i17) > java.lang.Math.abs(i18) && i17 > 0) {
                    this.f265142h = y17;
                    this.f265144m = x17;
                    int i19 = this.f265146o;
                    if (i19 == 1) {
                        this.f265141g = true;
                        this.f265152u = false;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LogoWebViewWrapper", "Competitor wins in onTouchEvent");
                    } else {
                        this.f265146o = i19 + 1;
                    }
                }
            }
        } else if (this.f265138d.y()) {
            this.f265142h = (int) motionEvent.getY();
            this.f265143i = (int) motionEvent.getY();
            this.f265144m = (int) motionEvent.getX();
            this.f265141g = false;
            this.f265146o = 0;
            this.f265151t = true;
            this.f265152u = true;
        }
        return this.f265141g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
    
        if (r0 != 3) goto L46;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f265147p
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r5.f265151t
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = r6.getAction()
            if (r0 != 0) goto L17
            int r0 = r6.getEdgeFlags()
            if (r0 == 0) goto L17
            return r1
        L17:
            int r0 = r6.getAction()
            r2 = 1
            if (r0 == 0) goto Lb0
            if (r0 == r2) goto L91
            r3 = 2
            if (r0 == r3) goto L28
            r6 = 3
            if (r0 == r6) goto L91
            goto Ld2
        L28:
            boolean r0 = r5.f265141g
            if (r0 == 0) goto Ld2
            boolean r0 = r5.f265153v
            if (r0 != 0) goto L48
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f265142h = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f265143i = r0
            float r6 = r6.getX()
            int r6 = (int) r6
            r5.f265144m = r6
            r5.f265153v = r2
            return r2
        L48:
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f265142h = r0
            float r6 = r6.getX()
            int r6 = (int) r6
            r5.f265144m = r6
            int r6 = r5.f265143i
            int r0 = r5.f265142h
            int r6 = r6 - r0
            int r6 = java.lang.Math.min(r6, r1)
            int r6 = r6 >> r2
            int r0 = r5.m74371xa3eb21cc()
            int r1 = r5.m74370x82f2cea8()
            int r1 = r1 >> r2
            int r3 = java.lang.Math.abs(r6)
            int r3 = r3 * r1
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            int r1 = (int) r3
            int r1 = r1 << r2
            int r3 = java.lang.Math.abs(r6)
            if (r1 <= r3) goto L83
            int r1 = java.lang.Math.abs(r6)
            if (r1 <= r0) goto L84
            int r6 = -r0
            goto L84
        L83:
            int r6 = -r1
        L84:
            r5.a(r6)
            com.tencent.mm.plugin.webview.ui.tools.q r0 = r5.f265150s
            if (r0 == 0) goto L90
            com.tencent.mm.plugin.webview.ui.tools.s7 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s7) r0
            r0.c(r6, r2)
        L90:
            return r2
        L91:
            r5.f265153v = r1
            boolean r6 = r5.f265141g
            if (r6 != 0) goto L9b
            boolean r6 = r5.f265151t
            if (r6 == 0) goto Ld2
        L9b:
            r5.f265141g = r1
            com.tencent.mm.plugin.webview.ui.tools.o r6 = new com.tencent.mm.plugin.webview.ui.tools.o
            r6.<init>(r5)
            r5.post(r6)
            int r6 = r5.f265149r
            int r6 = -r6
            long r0 = r5.m74372x4919b0fe()
            r5.b(r6, r0)
            return r2
        Lb0:
            r5.f265151t = r2
            com.tencent.xweb.WebView r0 = r5.f265138d
            boolean r0 = r0.y()
            if (r0 == 0) goto Ld2
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f265142h = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f265143i = r0
            float r6 = r6.getX()
            int r6 = (int) r6
            r5.f265144m = r6
            r5.f265153v = r2
            return r2
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setEasyMod */
    public void m74375x3c26bcde(boolean z17) {
        this.f265154w = z17;
    }

    /* renamed from: setFastScrollBack */
    public void m74376x7bbd57d2(boolean z17) {
        this.f265148q = z17;
    }

    /* renamed from: setMMOverScrollListener */
    public void m74377xe1a44db7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p pVar) {
    }

    /* renamed from: setMMOverScrollOffsetListener */
    public void m74378x4b85c52a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.q qVar) {
        this.f265150s = qVar;
    }

    /* renamed from: setReleaseTargetHeight */
    public void m74379x428503fd(int i17) {
        this.f265149r = i17;
    }

    public C19312x9ccd54e5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f265141g = false;
        this.f265146o = 0;
        this.f265147p = false;
        this.f265148q = false;
        this.f265149r = 0;
        this.f265151t = false;
        this.f265152u = false;
        this.f265153v = false;
        this.f265154w = false;
        this.f265155x = -1;
        setOrientation(1);
        this.f265140f = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
