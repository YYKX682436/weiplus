package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView */
/* loaded from: classes9.dex */
public class C19152xaaf0e35d extends android.widget.FrameLayout implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef f262285d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f262286e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f262287f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f262288g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f262289h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f262290i;

    public C19152xaaf0e35d(android.content.Context context) {
        super(context);
        this.f262287f = "";
        this.f262289h = false;
        this.f262290i = new gt4.l2(this);
        c();
    }

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WcPayMoneyLoadingView", "hide loading pb");
        android.widget.ProgressBar progressBar = this.f262286e;
        if (progressBar != null) {
            if (z17) {
                progressBar.setVisibility(8);
            } else {
                progressBar.setVisibility(4);
            }
        }
        removeCallbacks(this.f262290i);
    }

    public void b() {
        setVisibility(8);
        android.widget.ProgressBar progressBar = this.f262286e;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        removeCallbacks(this.f262290i);
    }

    public final void c() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c2f, this);
        com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef c2885xf34260ef = (com.p312xaaa79c6.p313xcbe86b0a.C2885xf34260ef) findViewById(com.p314xaae8f345.mm.R.id.f567469jl3);
        this.f262285d = c2885xf34260ef;
        c2885xf34260ef.m21505xcac67eee("0123456789");
    }

    public final void d(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p2465x6c52a27.j.f270122l, i17, 0);
        float dimension = obtainStyledAttributes.getDimension(0, 15.0f);
        int color = obtainStyledAttributes.getColor(1, -16777216);
        int integer = obtainStyledAttributes.getInteger(3, 4);
        obtainStyledAttributes.getInteger(2, 0);
        obtainStyledAttributes.recycle();
        m73939x3abfd950(dimension);
        m73938x1c5c5ff4(color);
        m73941x4e4ad719(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.F(getContext(), integer));
    }

    public void e(java.lang.String str, boolean z17) {
        f(str, z17, false, true);
    }

    public void f(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        if (str == null) {
            return;
        }
        if (z18) {
            this.f262289h = true;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262288g)) {
            m73932x11cf91f2(str);
            if (z17) {
                removeCallbacks(this.f262290i);
                return;
            }
            return;
        }
        if (z19) {
            m73935xc7ab2982(str);
        } else {
            g(str, false);
        }
    }

    public void g(java.lang.String str, boolean z17) {
        removeCallbacks(this.f262290i);
        if (z17) {
            this.f262286e.setVisibility(8);
        } else {
            this.f262286e.setVisibility(4);
        }
        if (this.f262288g.length() != str.length()) {
            this.f262285d.m21503xce929cf6(800L);
        } else {
            this.f262285d.m21503xce929cf6(500L);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(str, 0.0d) > com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(this.f262288g, 0.0d)) {
            this.f262285d.m21507x6fe7f1a9(xb.i.DOWN);
        } else {
            this.f262285d.m21507x6fe7f1a9(xb.i.UP);
        }
        boolean z18 = this.f262289h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f262288g)) {
            z18 = false;
        }
        this.f262285d.d(this.f262287f + str, z18);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onActivityDestroy */
    public void m73930x2711d60c() {
        removeCallbacks(this.f262290i);
    }

    /* renamed from: setAnimationDuration */
    public void m73931xce929cf6(long j17) {
        this.f262285d.m21503xce929cf6(j17);
    }

    /* renamed from: setFirstMoney */
    public void m73932x11cf91f2(java.lang.String str) {
        this.f262288g = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f262285d.d(this.f262287f + str, false);
        }
        postDelayed(this.f262290i, 500L);
    }

    /* renamed from: setLoadingPb */
    public void m73933xaf1ebe0c(android.widget.ProgressBar progressBar) {
        this.f262286e = progressBar;
    }

    /* renamed from: setMoney */
    public void m73934x535fe17e(java.lang.String str) {
        e(str, false);
    }

    /* renamed from: setNewMoney */
    public void m73935xc7ab2982(java.lang.String str) {
        g(str, true);
    }

    /* renamed from: setPrefixSymbol */
    public void m73936xb2ceec4c(java.lang.String str) {
        this.f262287f = str;
    }

    /* renamed from: setProgressBarStyle */
    public void m73937x2e9eb2d(int i17) {
        if (i17 == 0) {
            this.f262286e.setIndeterminateDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.avk));
        } else {
            this.f262286e.setIndeterminateDrawable(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.avh));
        }
    }

    /* renamed from: setTextColor */
    public void m73938x1c5c5ff4(int i17) {
        this.f262285d.m21509x1c5c5ff4(i17);
    }

    /* renamed from: setTextSize */
    public void m73939x3abfd950(float f17) {
        float q17 = i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.u(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) || com.p314xaae8f345.mm.ui.bk.M(q17, i65.a.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a))) {
            q17 = i65.a.t(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        this.f262285d.m21510x3abfd950(f17 * q17);
    }

    /* renamed from: setTextSizeNotScaled */
    public void m73940xc709cd9d(float f17) {
        this.f262285d.m21510x3abfd950(f17);
    }

    /* renamed from: setTypeface */
    public void m73941x4e4ad719(android.graphics.Typeface typeface) {
        this.f262285d.m21511x4e4ad719(typeface);
    }

    public C19152xaaf0e35d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f262287f = "";
        this.f262289h = false;
        this.f262290i = new gt4.l2(this);
        c();
        d(attributeSet, -1);
    }

    public C19152xaaf0e35d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f262287f = "";
        this.f262289h = false;
        this.f262290i = new gt4.l2(this);
        c();
        d(attributeSet, i17);
    }
}
