package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout */
/* loaded from: classes5.dex */
public class C19678x1ab789dd extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.OverScroller f271655d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f271656e;

    /* renamed from: f, reason: collision with root package name */
    public int f271657f;

    /* renamed from: g, reason: collision with root package name */
    public int f271658g;

    /* renamed from: h, reason: collision with root package name */
    public int f271659h;

    /* renamed from: i, reason: collision with root package name */
    public int f271660i;

    /* renamed from: m, reason: collision with root package name */
    public int f271661m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f271662n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f271663o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 f271664p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f271665q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f271666r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f271667s;

    /* renamed from: t, reason: collision with root package name */
    public float f271668t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f271669u;

    public C19678x1ab789dd(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getInterTranslationY */
    private int m75523x20933a0e() {
        int i17 = this.f271659h;
        if (i17 != 0) {
            return (int) (((this.f271657f * 1.0d) / i17) * this.f271661m);
        }
        return 0;
    }

    public boolean a(int i17) {
        android.view.View m75885x6a486239;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = this.f271664p;
        if (c21897x17252689 != null && c21897x17252689.m79872xcc101dd9() != null) {
            int mo75762xe81a1f0f = (this.f271664p.m79872xcc101dd9().mo75762xe81a1f0f() - this.f271664p.m79872xcc101dd9().mo75761x118cb524()) - (this.f271664p.m79872xcc101dd9().mo75757x2ce24761() - this.f271664p.m79872xcc101dd9().mo75761x118cb524());
            if (mo75762xe81a1f0f >= 0 && mo75762xe81a1f0f < this.f271664p.m79872xcc101dd9().m75886x3d79f549() && (m75885x6a486239 = this.f271664p.m79872xcc101dd9().m75885x6a486239(mo75762xe81a1f0f)) != null) {
                int[] iArr = new int[2];
                m75885x6a486239.getLocationOnScreen(iArr);
                if (iArr[1] + m75885x6a486239.getHeight() > com.p314xaae8f345.mm.ui.bl.b(getContext()).y - i17) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b(int i17, boolean z17, int i18, int i19) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingScrollLayout", "scrollContentTo: y:%s, targetScroll:%s, alwaysScroll:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f271658g), java.lang.Boolean.valueOf(this.f271665q));
        if (this.f271658g != i17 || this.f271665q) {
            this.f271658g = i17;
            if (i17 != 0) {
                this.f271659h = i17;
            }
            this.f271661m = i19;
            android.view.View view = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16) findViewById(com.p314xaae8f345.mm.R.id.bhk);
            if (view == null) {
                view = findViewById(com.p314xaae8f345.mm.R.id.p2g);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingScrollLayout", "resizeChatAnimFrame: use view stub");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingScrollLayout", "resizeChatAnimFrame: use view");
            }
            if (view != null && (marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
                marginLayoutParams.bottomMargin = this.f271658g;
                view.setLayoutParams(marginLayoutParams);
            }
            this.f271655d.forceFinished(true);
            removeCallbacks(this.f271656e);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m5 m5Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.m5(this, i18, z17);
            this.f271656e = m5Var;
            post(m5Var);
        }
    }

    public final void c(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = this.f271664p;
        if (c21897x17252689 == null) {
            return;
        }
        int m79869xb4df5065 = c21897x17252689.m79869xb4df5065();
        float translationY = this.f271662n.getTranslationY();
        float m75523x20933a0e = (m79869xb4df5065 > 0 ? m79869xb4df5065 + translationY : translationY) + m75523x20933a0e();
        if (m75523x20933a0e > 0.0f) {
            m75523x20933a0e = 0.0f;
        }
        if (translationY == 0.0f && m75523x20933a0e < 0.0f) {
            java.lang.String format = java.lang.String.format("updateListContent isValueException:%s footerTranslationY:%s bottomSpace:%s targetTranslate:%s curTranslationY:%s targetScroll:%s scroller.isFinished:%s isFromOnLayout:%s isFromScroller:%s lastTranslateY:%s targetTranslate:%s", java.lang.Boolean.TRUE, java.lang.Float.valueOf(translationY), java.lang.Integer.valueOf(m79869xb4df5065), java.lang.Float.valueOf(m75523x20933a0e), java.lang.Float.valueOf(this.f271664p.getTranslationY()), java.lang.Integer.valueOf(this.f271658g), java.lang.Boolean.valueOf(this.f271655d.isFinished()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Float.valueOf(this.f271668t), java.lang.Float.valueOf(m75523x20933a0e));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
            c6423x452b9f7c.f137646e = 2998L;
            c6423x452b9f7c.f137650i = m75523x20933a0e;
            c6423x452b9f7c.f137651j = z17 ? 1L : 0L;
            c6423x452b9f7c.f137652k = z18 ? 1L : 0L;
            c6423x452b9f7c.r(format);
            c6423x452b9f7c.k();
        }
        if (this.f271668t != m75523x20933a0e) {
            if (z17 && this.f271655d.isFinished() && this.f271658g > 0 && m75523x20933a0e < this.f271664p.getTranslationY() && fp.h.c(24)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingScrollLayout", "updateListContent called with animate:%s", java.lang.Float.valueOf(m75523x20933a0e));
                android.view.ViewPropertyAnimator duration = this.f271664p.animate().translationY(m75523x20933a0e).setDuration(100L);
                this.f271669u = duration;
                duration.start();
            } else {
                if (this.f271669u != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingScrollLayout", "tryCancelContentListViewPropertyAnimator called");
                    this.f271669u.cancel();
                    this.f271669u = null;
                }
                this.f271664p.setTranslationY(m75523x20933a0e);
            }
        }
        this.f271668t = m75523x20933a0e;
        if (z17) {
            return;
        }
        boolean z19 = z18 && this.f271655d.isFinished();
        java.util.Iterator it = new java.util.ArrayList(this.f271666r).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.n5) it.next()).q(m75523x20933a0e, z19);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f271655d.computeScrollOffset()) {
            this.f271657f = this.f271655d.getCurrY();
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                android.view.View childAt = getChildAt(i17);
                if (childAt != this.f271663o) {
                    childAt.setTranslationY(-this.f271657f);
                }
            }
            c(false, true);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f271660i = this.f271657f;
        } else {
            motionEvent.offsetLocation(0.0f, this.f271660i - this.f271657f);
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                this.f271660i = 0;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f271662n = findViewById(com.p314xaae8f345.mm.R.id.f567625k52);
        this.f271663o = findViewById(com.p314xaae8f345.mm.R.id.bki);
        this.f271664p = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689) findViewById(com.p314xaae8f345.mm.R.id.bm6);
        if (this.f271663o == null) {
            this.f271663o = findViewById(com.p314xaae8f345.mm.R.id.r3z);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingScrollLayout", "onLayout: %s, %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        super.onLayout(z17, i17, i18, i19, i27);
        java.lang.Runnable runnable = this.f271656e;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.f271656e);
        }
        android.widget.OverScroller overScroller = this.f271655d;
        if (overScroller == null || !overScroller.isFinished()) {
            return;
        }
        c(true, true);
    }

    /* renamed from: setAlwaysScroll */
    public void m75524x7e3deb3e(boolean z17) {
        this.f271665q = z17;
    }

    public C19678x1ab789dd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f271657f = 0;
        this.f271658g = 0;
        this.f271659h = 0;
        this.f271660i = 0;
        this.f271665q = false;
        this.f271666r = new java.util.LinkedList();
        this.f271667s = new java.util.LinkedList();
        this.f271668t = 0.0f;
        this.f271655d = new android.widget.OverScroller(getContext(), new y3.b());
    }
}
