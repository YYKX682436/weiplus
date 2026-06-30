package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes3.dex */
public final class c4 {

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y3 f265562l = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y3(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f265563a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f265564b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f265565c;

    /* renamed from: d, reason: collision with root package name */
    public long f265566d;

    /* renamed from: e, reason: collision with root package name */
    public int f265567e;

    /* renamed from: f, reason: collision with root package name */
    public final int f265568f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f265569g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f265570h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f265571i;

    /* renamed from: j, reason: collision with root package name */
    public int f265572j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f265573k;

    public c4(android.view.View bottomNavigator, android.view.View root, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomNavigator, "bottomNavigator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f265563a = bottomNavigator;
        this.f265564b = root;
        this.f265565c = c22633x83752a59;
        this.f265568f = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
        if (c22633x83752a59 != null) {
            this.f265571i = c22633x83752a59.m120171x1f05d274();
        }
        this.f265573k = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.z3(this));
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c4 c4Var, boolean z17) {
        if (!c4Var.f265571i) {
            android.view.View view = c4Var.f265564b;
            if (view.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
                if (z17) {
                    layoutParams2.addRule(2, com.p314xaae8f345.mm.R.id.php);
                } else {
                    layoutParams2.removeRule(2);
                }
                view.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        if (c4Var.f265572j <= 0) {
            c4Var.f265572j = c4Var.f265563a.getHeight();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = c4Var.f265565c;
        if (z17) {
            if (c22633x83752a59 != null) {
                c22633x83752a59.mo120176x9f718b4(c4Var.f265572j);
            }
        } else if (c22633x83752a59 != null) {
            c22633x83752a59.mo120176x9f718b4(0);
        }
    }

    public final void b() {
        android.view.View view = this.f265563a;
        if (view.getVisibility() == 8) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBottomNavigatorHelper", "hideBottomNavigator");
        view.clearAnimation();
        view.animate().setDuration(300L).translationY(view.getHeight()).setInterpolator(new android.view.animation.AccelerateInterpolator(2.0f)).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a4(this)).start();
    }

    public final void c() {
        android.view.View view = this.f265563a;
        if (view.getVisibility() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewBottomNavigatorHelper", "showBottomNavigator");
        view.clearAnimation();
        view.animate().setDuration(300L).translationY(0.0f).setInterpolator(new android.view.animation.AccelerateInterpolator(2.0f)).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b4(this)).start();
    }
}
