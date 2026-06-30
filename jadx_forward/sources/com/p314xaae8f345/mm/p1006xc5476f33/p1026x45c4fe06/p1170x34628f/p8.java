package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class p8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o8 {
    public android.widget.LinearLayout A;
    public android.widget.TextView B;
    public android.view.View C;
    public android.widget.ImageView D;
    public android.widget.ImageView E;
    public android.widget.ImageView F;
    public java.lang.Runnable G;
    public long H;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q8 f168534u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r8 f168535v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f168536w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f168537x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f168538y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb f168539z;

    public p8(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
        super(context);
        this.f168536w = false;
        this.H = 0L;
        this.f168539z = fbVar;
        super.m52203x590ab8fc(fbVar.mo14669x50cdf8a2());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o8
    public void c() {
        if (this.A == null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569612ge, (android.view.ViewGroup) this, false);
            this.A = linearLayout;
            super.m52202xba4f1f5(linearLayout);
            this.B = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564737zh);
            this.C = findViewById(com.p314xaae8f345.mm.R.id.f564733zd);
            this.D = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564734ze);
            this.E = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564735zf);
            this.F = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f564736zg);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(this)) {
                post(this.G);
            }
            if (!android.text.TextUtils.isEmpty(this.f168538y)) {
                m52211xf63e47d6(this.f168538y);
            }
            if (android.text.TextUtils.isEmpty(this.f168537x)) {
                return;
            }
            m52207xa18f7734(this.f168537x);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o8
    public void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r8 r8Var = this.f168535v;
        if (r8Var != null) {
            r8Var.h(i17);
        }
        if (this.f168536w) {
            removeCallbacks(this.G);
            if (i17 > this.A.getHeight()) {
                i17 = this.A.getHeight();
            }
            this.A.setTranslationY(i17 - r0.getHeight());
        }
    }

    public void g(boolean z17) {
        this.f168536w = z17;
        if (z17 && this.A == null) {
            c();
        }
        m52204xaa2b6691(z17);
        android.view.View view = this.C;
        if (view != null) {
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandPullDownWebView", "enablePullDownRefresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandPullDownWebView", "enablePullDownRefresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o8
    /* renamed from: getStayHeight */
    public int mo52201xb80254d6() {
        return this.A.getHeight();
    }

    public final android.graphics.drawable.AnimationDrawable h(int i17, float[] fArr) {
        android.graphics.drawable.AnimationDrawable animationDrawable = new android.graphics.drawable.AnimationDrawable();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPullDownWebView", "AnimationDrawable hash:" + animationDrawable.hashCode());
        animationDrawable.setOneShot(false);
        animationDrawable.addFrame(i(i17, fArr[0]), 0);
        animationDrawable.addFrame(i(i17, fArr[1]), 300);
        animationDrawable.addFrame(i(i17, fArr[2]), 300);
        animationDrawable.addFrame(i(i17, fArr[3]), 300);
        return animationDrawable;
    }

    public final android.graphics.drawable.Drawable i(int i17, float f17) {
        android.graphics.drawable.ShapeDrawable shapeDrawable = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());
        shapeDrawable.setIntrinsicHeight(32);
        shapeDrawable.setIntrinsicWidth(32);
        shapeDrawable.getPaint().setColor(i17);
        shapeDrawable.getPaint().setAlpha((int) (f17 * 255.0f));
        return shapeDrawable;
    }

    public final void j() {
        android.widget.ImageView imageView = this.D;
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPullDownWebView", "setupDarkLoading but mLoading0 is null, try protect");
            return;
        }
        imageView.setImageDrawable(h(-16777216, new float[]{0.1f, 0.4f, 0.2f, 0.1f}));
        this.E.setImageDrawable(h(-16777216, new float[]{0.1f, 0.1f, 0.4f, 0.2f}));
        this.F.setImageDrawable(h(-16777216, new float[]{0.1f, 0.2f, 0.1f, 0.4f}));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A != null) {
            if (this.G == null) {
                this.G = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.p8$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8.this.A.setTranslationY(-r0.getHeight());
                    }
                };
            }
            removeCallbacks(this.G);
            post(this.G);
        }
    }

    /* renamed from: setBackgroundTextStyle */
    public void m52207xa18f7734(java.lang.String str) {
        this.f168537x = str;
        if (this.A == null) {
            return;
        }
        if ("light".equals(str)) {
            android.widget.ImageView imageView = this.D;
            if (imageView == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPullDownWebView", "setupLightLoading but mLoading0 is null, try protect");
            } else {
                imageView.setImageDrawable(h(-1, new float[]{0.2f, 0.6f, 0.4f, 0.2f}));
                this.E.setImageDrawable(h(-1, new float[]{0.2f, 0.2f, 0.6f, 0.4f}));
                this.F.setImageDrawable(h(-1, new float[]{0.2f, 0.4f, 0.2f, 0.6f}));
            }
            this.B.setTextColor(-1);
            this.B.setAlpha(0.4f);
            return;
        }
        if ("dark".equals(str)) {
            j();
            this.B.setTextColor(-16777216);
            this.B.setAlpha(0.2f);
        } else {
            if ("ignore".equals(str)) {
                return;
            }
            j();
            this.B.setTextColor(-16777216);
            this.B.setAlpha(0.2f);
        }
    }

    /* renamed from: setHeadViewHeight */
    public void m52208x9a366f2e(int i17) {
        if (i17 <= this.A.getHeight()) {
            return;
        }
        this.A.getLayoutParams().height = i17;
        this.A.requestLayout();
    }

    /* renamed from: setOnPullDownListener */
    public void m52209x3876e65c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q8 q8Var) {
        this.f168534u = q8Var;
    }

    /* renamed from: setOnPullDownOffsetListener */
    public void m52210x886a8e0f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r8 r8Var) {
        this.f168535v = r8Var;
    }

    /* renamed from: setPullDownText */
    public void m52211xf63e47d6(java.lang.String str) {
        this.f168538y = str;
        if (this.A == null || this.B == null) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.B.setVisibility(8);
        } else {
            this.B.setVisibility(0);
            this.B.setText(str);
        }
    }
}
