package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class s4 {
    public android.view.VelocityTracker F;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.p4 G;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.r4 H;
    public com.p314xaae8f345.mm.ui.p2740x696c9db.q4 I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.m4 f292226J;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f292227a;

    /* renamed from: b, reason: collision with root package name */
    public int f292228b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f292229c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f292230d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f292231e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f292232f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f292233g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f292234h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f292235i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f292236j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f292237k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f292238l = 0.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f292239m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f292240n = 1.0f;

    /* renamed from: o, reason: collision with root package name */
    public int f292241o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f292242p = 0;

    /* renamed from: q, reason: collision with root package name */
    public float f292243q = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f292244r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f292245s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f292246t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f292247u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f292248v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f292249w = 200;

    /* renamed from: x, reason: collision with root package name */
    public int f292250x = 200;

    /* renamed from: y, reason: collision with root package name */
    public int f292251y = 0;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f292252z = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
    public float A = 0.0f;
    public float B = 0.0f;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;

    public s4(android.content.Context context) {
        this.f292227a = context;
    }

    public static void a(com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var, float f17, float f18, android.view.View view, android.view.View view2, android.view.View view3) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.q4 q4Var = s4Var.I;
        if (q4Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.x) q4Var;
            boolean z17 = f17 == 0.0f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = xVar.f267365a;
            if (z17) {
                if (f18 == 0.0f) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.c(viewOnClickListenerC19428xb021cc2c);
                }
            }
            if (java.lang.Math.abs(f17) > 10.0f || java.lang.Math.abs(f18) > 10.0f) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c.f267238y0;
                viewOnClickListenerC19428xb021cc2c.p();
            }
        }
        float height = 1.0f - (f18 / view.getHeight());
        if (height > 1.0f) {
            height = 1.0f;
        }
        if (java.lang.Float.isNaN(height)) {
            return;
        }
        if (height != 1.0d) {
            s4Var.f292240n = 1.0f / height;
            if (f17 != 0.0f || f18 != 0.0f) {
                s4Var.f292241o = (int) (((int) ((view.getWidth() / 2) * (1.0f - height))) + f17);
                s4Var.f292242p = (int) (((view.getHeight() / 2) + f18) - ((s4Var.f292233g / 2) * height));
            }
        }
        if (view3 != null) {
            view3.setPivotX(view.getWidth() / 2);
            view3.setPivotY(view.getHeight() / 2);
            view3.setScaleX(height);
            view3.setScaleY(height);
            view3.setTranslationX(f17);
            view3.setTranslationY(f18);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(height));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/tools/ImagePreviewAnimation", "onGalleryScale", "(FFLandroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/tools/ImagePreviewAnimation", "onGalleryScale", "(FFLandroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public final void b(android.view.View view, boolean z17) {
        int i17;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (this.f292228b == 0 && this.f292229c == 0) {
            this.f292228b = view.getWidth() / 2;
            this.f292229c = view.getHeight() / 2;
        }
        this.f292234h = this.f292228b - iArr[0];
        this.f292235i = this.f292229c - iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            width = this.f292232f;
            height = this.f292233g;
        }
        if (width != 0 && height != 0) {
            this.f292236j = this.f292230d / width;
            this.f292237k = this.f292231e / height;
        }
        float f17 = (this.f292245s == 0 && this.f292246t == 0 && this.f292247u == 0 && this.f292248v == 0) ? 1.0f : 1.1f;
        if (z17) {
            int i18 = this.f292232f;
            if (i18 != 0 && (i17 = this.f292233g) != 0) {
                this.f292236j = this.f292230d / i18;
                this.f292237k = this.f292231e / i17;
            }
            f17 = 1.0f;
        }
        float f18 = this.f292240n;
        if (f18 != 1.0d) {
            int i19 = this.f292234h + iArr[0];
            int i27 = this.f292235i + iArr[1];
            float f19 = this.f292236j * f18;
            this.f292238l = f19;
            this.f292239m = f19;
            this.f292235i = (int) (i27 - (this.f292242p * f19));
            this.f292234h = (int) (i19 - (this.f292241o * f19));
            return;
        }
        float f27 = this.f292236j;
        float f28 = this.f292237k;
        if (f27 > f28) {
            float f29 = f27 * f17;
            this.f292238l = f29;
            this.f292235i = (int) (this.f292235i - (((height * f29) - (this.f292231e * f17)) / 2.0f));
        } else {
            float f37 = f28 * f17;
            this.f292238l = f37;
            this.f292234h = (int) (this.f292234h - (((width * f37) - (this.f292230d * f17)) / 2.0f));
            int i28 = this.f292233g;
            if (i28 != 0 && i28 < height) {
                this.f292235i = (int) (this.f292235i - (((height * f37) - (this.f292231e * f17)) / 2.0f));
            }
        }
        float f38 = this.f292235i;
        int i29 = this.f292231e;
        float f39 = f17 - 1.0f;
        int i37 = this.f292244r;
        int i38 = (int) ((f38 - ((i29 * f39) / 2.0f)) - ((i37 * this.f292238l) / 2.0f));
        this.f292235i = i38;
        float f47 = this.f292234h;
        int i39 = this.f292230d;
        int i47 = (int) (f47 - ((i39 * f39) / 2.0f));
        this.f292234h = i47;
        int i48 = this.f292233g;
        if (i48 != 0 && this.f292229c < (height - i48) / 2) {
            this.f292235i = (int) (i38 + ((i29 * f39) / 2.0f));
        } else if (i48 != 0 && this.f292229c + i29 > (i48 + height) / 2) {
            this.f292235i = (int) (i38 - ((i29 * f39) / 2.0f));
        }
        if (i39 == 0 && i29 == 0) {
            this.f292238l = 0.5f;
            this.f292243q = 0.0f;
            this.f292234h = (int) (i47 - ((width * 0.5f) / 2.0f));
            this.f292235i = (int) ((this.f292235i - ((height * 0.5f) / 2.0f)) - ((i37 * 0.5f) / 2.0f));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewAnimation", "left: %s; top: %s; width: %s; height: %s; zoomScale: %s; LeftDelta: %s; TopDelta: %s", java.lang.Integer.valueOf(this.f292228b), java.lang.Integer.valueOf(this.f292229c), java.lang.Integer.valueOf(this.f292230d), java.lang.Integer.valueOf(this.f292231e), java.lang.Float.valueOf(this.f292238l), java.lang.Integer.valueOf(this.f292234h), java.lang.Integer.valueOf(this.f292235i));
    }

    public void c(android.view.View view, android.view.View view2, com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var) {
        int i17;
        float f17;
        android.animation.TimeInterpolator decelerateInterpolator;
        if (view == null || (i17 = this.f292251y) == 2 || i17 == 4 || i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImagePreviewAnimation", "[runEnterAnimation] %s %s ", java.lang.Integer.valueOf(this.f292251y), view);
            return;
        }
        if (java.lang.Float.isNaN(this.f292238l)) {
            return;
        }
        b(view, false);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(this.f292238l);
        view.setScaleY(this.f292238l);
        view.setTranslationX(this.f292234h);
        view.setTranslationY(this.f292235i);
        com.p314xaae8f345.mm.ui.p2740x696c9db.b3 b3Var = com.p314xaae8f345.mm.ui.p2740x696c9db.b3.EASE_IN_OUT;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/tools/ImagePreviewAnimation", "runEnterAnimation", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/ui/tools/ImagePreviewAnimation$ICallback;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/tools/ImagePreviewAnimation", "runEnterAnimation", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/ui/tools/ImagePreviewAnimation$ICallback;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (n4Var instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.o4) {
                this.f292249w = 250;
                decelerateInterpolator = com.p314xaae8f345.mm.ui.p2740x696c9db.c3.a(b3Var);
            } else {
                decelerateInterpolator = new android.view.animation.DecelerateInterpolator(1.2f);
            }
            f17 = 1.0f;
            view2.animate().setDuration(this.f292249w).setInterpolator(decelerateInterpolator).alpha(1.0f).setListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.c4(this, view2));
        } else {
            f17 = 1.0f;
        }
        view.animate().setDuration(this.f292249w).setInterpolator(n4Var instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.o4 ? com.p314xaae8f345.mm.ui.p2740x696c9db.c3.a(b3Var) : new android.view.animation.DecelerateInterpolator(1.2f)).scaleX(f17).scaleY(f17).translationX(0.0f).translationY(0.0f).setUpdateListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.e4(this, n4Var)).setListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.d4(this, n4Var, view));
        this.f292252z.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2740x696c9db.f4(this, view), 10);
    }

    public void d(android.view.View view, android.view.View view2, boolean z17, com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var, com.p314xaae8f345.mm.ui.p2740x696c9db.l4 l4Var) {
        int i17;
        if (view == null || (i17 = this.f292251y) == 2 || i17 == 4 || i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation not run! animationState: %s , gallery:%s", java.lang.Integer.valueOf(this.f292251y), view);
            return;
        }
        if (z17) {
            this.f292250x = this.f292249w;
        } else {
            this.f292250x = 200;
            b(view, true);
        }
        if (view2 != null) {
            view2.animate().setDuration(this.f292250x).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).alpha(0.0f).setListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.g4(this, view2));
        }
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(true);
        if (!z17) {
            float f17 = this.f292238l;
            com.p314xaae8f345.mm.ui.p2740x696c9db.h4 h4Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.h4(this, 1.0f, f17, 1.0f, f17, view, l4Var);
            h4Var.setDuration(this.f292250x);
            h4Var.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
            animationSet.addAnimation(h4Var);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, this.f292234h, 0.0f, this.f292235i);
            translateAnimation.setDuration(this.f292250x);
            translateAnimation.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
            animationSet.addAnimation(translateAnimation);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.i4 i4Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.i4(this, 1.0f, this.f292243q, n4Var);
        i4Var.setDuration(this.f292250x);
        if (z17) {
            i4Var.setInterpolator(com.p314xaae8f345.mm.ui.p2740x696c9db.c3.a(com.p314xaae8f345.mm.ui.p2740x696c9db.b3.EASE_IN_OUT));
        } else {
            i4Var.setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f));
        }
        animationSet.addAnimation(i4Var);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.j4(this, n4Var));
        view.startAnimation(animationSet);
    }

    public void e(int i17, int i18, int i19, int i27) {
        this.f292228b = i17;
        this.f292229c = i18;
        this.f292230d = i19;
        this.f292231e = i27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewAnimation", "setAnimationParam: left=%d, top=%d, width=%d, height=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
    }
}
