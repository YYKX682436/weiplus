package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class p8 extends com.tencent.mm.plugin.appbrand.page.o8 {
    public android.widget.LinearLayout A;
    public android.widget.TextView B;
    public android.view.View C;
    public android.widget.ImageView D;
    public android.widget.ImageView E;
    public android.widget.ImageView F;
    public java.lang.Runnable G;
    public long H;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.q8 f87001u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.r8 f87002v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f87003w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f87004x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f87005y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.fb f87006z;

    public p8(android.content.Context context, com.tencent.mm.plugin.appbrand.page.fb fbVar) {
        super(context);
        this.f87003w = false;
        this.H = 0L;
        this.f87006z = fbVar;
        super.setContentView(fbVar.getWrapperView());
    }

    @Override // com.tencent.mm.plugin.appbrand.page.o8
    public void c() {
        if (this.A == null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488079ge, (android.view.ViewGroup) this, false);
            this.A = linearLayout;
            super.setBackgroundView(linearLayout);
            this.B = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483204zh);
            this.C = findViewById(com.tencent.mm.R.id.f483200zd);
            this.D = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483201ze);
            this.E = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483202zf);
            this.F = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483203zg);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(this)) {
                post(this.G);
            }
            if (!android.text.TextUtils.isEmpty(this.f87005y)) {
                setPullDownText(this.f87005y);
            }
            if (android.text.TextUtils.isEmpty(this.f87004x)) {
                return;
            }
            setBackgroundTextStyle(this.f87004x);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.o8
    public void e(int i17) {
        com.tencent.mm.plugin.appbrand.page.r8 r8Var = this.f87002v;
        if (r8Var != null) {
            r8Var.h(i17);
        }
        if (this.f87003w) {
            removeCallbacks(this.G);
            if (i17 > this.A.getHeight()) {
                i17 = this.A.getHeight();
            }
            this.A.setTranslationY(i17 - r0.getHeight());
        }
    }

    public void g(boolean z17) {
        this.f87003w = z17;
        if (z17 && this.A == null) {
            c();
        }
        setNeedStay(z17);
        android.view.View view = this.C;
        if (view != null) {
            int i17 = z17 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandPullDownWebView", "enablePullDownRefresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandPullDownWebView", "enablePullDownRefresh", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.o8
    public int getStayHeight() {
        return this.A.getHeight();
    }

    public final android.graphics.drawable.AnimationDrawable h(int i17, float[] fArr) {
        android.graphics.drawable.AnimationDrawable animationDrawable = new android.graphics.drawable.AnimationDrawable();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPullDownWebView", "AnimationDrawable hash:" + animationDrawable.hashCode());
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
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPullDownWebView", "setupDarkLoading but mLoading0 is null, try protect");
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
                        com.tencent.mm.plugin.appbrand.page.p8.this.A.setTranslationY(-r0.getHeight());
                    }
                };
            }
            removeCallbacks(this.G);
            post(this.G);
        }
    }

    public void setBackgroundTextStyle(java.lang.String str) {
        this.f87004x = str;
        if (this.A == null) {
            return;
        }
        if ("light".equals(str)) {
            android.widget.ImageView imageView = this.D;
            if (imageView == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPullDownWebView", "setupLightLoading but mLoading0 is null, try protect");
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

    public void setHeadViewHeight(int i17) {
        if (i17 <= this.A.getHeight()) {
            return;
        }
        this.A.getLayoutParams().height = i17;
        this.A.requestLayout();
    }

    public void setOnPullDownListener(com.tencent.mm.plugin.appbrand.page.q8 q8Var) {
        this.f87001u = q8Var;
    }

    public void setOnPullDownOffsetListener(com.tencent.mm.plugin.appbrand.page.r8 r8Var) {
        this.f87002v = r8Var;
    }

    public void setPullDownText(java.lang.String str) {
        this.f87005y = str;
        if (this.A == null || this.B == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.B.setVisibility(8);
        } else {
            this.B.setVisibility(0);
            this.B.setText(str);
        }
    }
}
