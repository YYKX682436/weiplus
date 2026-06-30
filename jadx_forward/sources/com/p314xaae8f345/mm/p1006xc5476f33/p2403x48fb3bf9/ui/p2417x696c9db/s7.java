package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class s7 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.q {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r7 f268380a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f268381b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 f268382c;

    /* renamed from: j, reason: collision with root package name */
    public android.animation.ValueAnimator f268389j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f268390k;

    /* renamed from: l, reason: collision with root package name */
    public float f268391l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f268392m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f268393n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f268394o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f268396q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f268397r;

    /* renamed from: d, reason: collision with root package name */
    public int f268383d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f268384e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f268385f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f268386g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f268387h = 0;

    /* renamed from: i, reason: collision with root package name */
    public float f268388i = 0.0f;

    /* renamed from: p, reason: collision with root package name */
    public boolean f268395p = true;

    public s7() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        this.f268396q = true ^ yp5.a.f545942a.a();
        this.f268397r = false;
    }

    public void a() {
        this.f268384e = false;
        i();
        if (!this.f268395p || this.f268393n == null) {
            return;
        }
        e(this.f268397r);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e5 = this.f268382c;
        if (c19312x9ccd54e5 != null) {
            c19312x9ccd54e5.m74379x428503fd(0);
        }
        g();
    }

    public void b() {
        android.view.View view = this.f268393n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "hidePullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "hidePullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c(int i17, boolean z17) {
        android.widget.ImageView imageView = this.f268381b;
        if (imageView != null) {
            java.lang.String.valueOf(imageView.getVisibility());
        }
        android.widget.ImageView imageView2 = this.f268381b;
        if (imageView2 != null) {
            imageView2.getDrawable().toString();
        }
        android.widget.ImageView imageView3 = this.f268381b;
        if (imageView3 != null) {
            java.lang.String.valueOf(imageView3.getAlpha());
        }
        if (this.f268384e) {
            if (i17 == 0) {
                this.f268386g = false;
            }
            if (this.f268381b == null) {
                return;
            }
            if (z17) {
                int abs = java.lang.Math.abs(i17);
                int i18 = this.f268383d;
                if (abs >= i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e5 = this.f268382c;
                    if (c19312x9ccd54e5 != null) {
                        c19312x9ccd54e5.m74379x428503fd(i18);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e52 = this.f268382c;
                    if (c19312x9ccd54e52 != null) {
                        c19312x9ccd54e52.m74379x428503fd(0);
                    }
                }
            } else if (java.lang.Math.abs(i17) > this.f268383d && !this.f268385f) {
                h();
                return;
            } else if (this.f268385f) {
                return;
            }
            android.widget.ImageView imageView4 = this.f268381b;
            if (imageView4 != null && imageView4.getAlpha() < 1.0f && this.f268390k == null && z17) {
                android.view.ViewPropertyAnimator duration = this.f268381b.animate().alpha(1.0f).setDuration(500L);
                this.f268390k = duration;
                duration.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.q7(this));
                this.f268390k.start();
            }
            if (!this.f268386g) {
                int i19 = -i17;
                int i27 = i19 - this.f268387h;
                int i28 = java.lang.Math.abs(i17) >= this.f268383d ? i27 * 5 : i27 * 2;
                this.f268387h = i19;
                float width = this.f268381b.getWidth() / 2.0f;
                this.f268388i -= i28;
                this.f268381b.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
                android.graphics.Matrix imageMatrix = this.f268381b.getImageMatrix();
                imageMatrix.postRotate(-i28, width, this.f268381b.getHeight() / 2.0f);
                this.f268381b.setImageMatrix(imageMatrix);
                this.f268381b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ci6);
            }
            this.f268381b.invalidate();
        }
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e5 = this.f268382c;
        if (c19312x9ccd54e5 != null) {
            android.widget.FrameLayout frameLayout = c19312x9ccd54e5.f265139e;
            if (frameLayout != null) {
                frameLayout.removeView(c19312x9ccd54e5.f265138d);
                c19312x9ccd54e5.f265138d = null;
            }
            this.f268382c.f265150s = null;
        }
        android.view.View view = this.f268392m;
        if (view != null) {
            ((android.view.ViewGroup) view).removeAllViews();
        }
        this.f268382c = null;
        this.f268381b = null;
        this.f268387h = 0;
        android.animation.ValueAnimator valueAnimator = this.f268389j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f268389j = null;
        }
    }

    public void e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e5 = this.f268382c;
        if (c19312x9ccd54e5 == null || c19312x9ccd54e5.f265147p == z17) {
            return;
        }
        c19312x9ccd54e5.f265147p = z17;
        if (z17) {
            c19312x9ccd54e5.f265141g = false;
            c19312x9ccd54e5.f265146o = 0;
        }
        b();
        this.f268397r = z17;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        this.f268396q = !yp5.a.f545942a.a() || z17;
    }

    public void f(java.lang.String str) {
        if (!this.f268395p || this.f268396q) {
            e(true);
            android.view.View view = this.f268393n;
            if (view == null || view.getVisibility() != 0) {
                return;
            }
            b();
            return;
        }
        if (this.f268394o != null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                this.f268394o.setVisibility(8);
                return;
            }
            java.lang.String host = android.net.Uri.parse(str).getHost();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(host) || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2582x48fb3bf9.C20823x581fcfd6()) == 1) {
                this.f268394o.setVisibility(8);
                return;
            }
            java.lang.String string = this.f268394o.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l6m, host);
            this.f268394o.setVisibility(0);
            this.f268394o.setText(string);
            e(false);
        }
    }

    public void g() {
        android.view.View view = this.f268393n;
        if (view == null || this.f268396q) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "showPullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewPullDownLogoDelegate", "showPullDownInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: getStartLoadingStep */
    public float m74784x514377dc() {
        return this.f268391l;
    }

    public void h() {
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e5;
        nw4.n nVar;
        if (this.f268385f || (imageView = this.f268381b) == null || (c19312x9ccd54e5 = this.f268382c) == null) {
            return;
        }
        this.f268385f = true;
        c19312x9ccd54e5.f265147p = true;
        c19312x9ccd54e5.f265141g = false;
        c19312x9ccd54e5.f265146o = 0;
        imageView.clearAnimation();
        android.animation.ValueAnimator valueAnimator = this.f268389j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f17 = this.f268388i;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this, "startLoadingStep", 0.0f + f17, f17 + 354.0f);
        this.f268389j = ofFloat;
        ofFloat.setDuration(960L);
        this.f268389j.setRepeatMode(1);
        this.f268389j.setRepeatCount(-1);
        this.f268389j.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f268389j.start();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r7 r7Var = this.f268380a;
        if (r7Var == null || (nVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.oa) r7Var).f268269a.f265377p0) == null) {
            return;
        }
        if (!nVar.f422428i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, not ready");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onPullDownRefresh success, ready");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.x1(nVar, nw4.n.t(nw4.x2.c("onPullDownRefresh", null, nVar.f422436q, nVar.f422437r))));
        }
    }

    public void i() {
        if (this.f268385f) {
            this.f268386g = true;
            this.f268385f = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e5 = this.f268382c;
            if (c19312x9ccd54e5 != null && this.f268384e) {
                c19312x9ccd54e5.f265147p = false;
            }
            android.animation.ValueAnimator valueAnimator = this.f268389j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e52 = this.f268382c;
            if (c19312x9ccd54e52 != null) {
                c19312x9ccd54e52.b(0, 250L);
            }
            android.widget.ImageView imageView = this.f268381b;
            if (imageView != null) {
                imageView.animate().alpha(0.0f).setDuration(500L).start();
            }
        }
    }

    /* renamed from: setStartLoadingStep */
    public void m74785xf5400ce8(float f17) {
        this.f268391l = f17;
        this.f268381b.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        this.f268381b.getImageMatrix().setRotate(f17, this.f268381b == null ? 0.0f : r1.getWidth() / 2.0f, this.f268381b != null ? r4.getHeight() / 2.0f : 0.0f);
        this.f268388i = f17;
        this.f268381b.invalidate();
    }
}
