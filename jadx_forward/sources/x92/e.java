package x92;

/* loaded from: classes2.dex */
public class e extends x92.r {
    public final int A;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f534207g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f534208h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f534209i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f534210m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f534211n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f534212o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f534213p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.FrameLayout f534214q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f534215r;

    /* renamed from: s, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f534216s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f534217t;

    /* renamed from: u, reason: collision with root package name */
    public v92.g f534218u;

    /* renamed from: v, reason: collision with root package name */
    public final int f534219v;

    /* renamed from: w, reason: collision with root package name */
    public int f534220w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f534221x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f534222y;

    /* renamed from: z, reason: collision with root package name */
    public float f534223z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f534219v = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.f534220w = activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560512mi);
        this.A = i65.a.b(m80379x76847179(), 72);
    }

    @Override // x92.r
    public void O6(int i17, java.lang.String str) {
        android.view.View view;
        if (!this.f534221x && !this.f534222y && (view = this.f534209i) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout linearLayout = this.f534210m;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.f534211n;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(4);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f534212o;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        }
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.lb_);
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().O0(com.p314xaae8f345.mm.ui.bk.C());
        android.view.View view2 = this.f534208h;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setInvalidView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        this.f534207g = (android.widget.FrameLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f566452fx3);
        this.f534208h = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565486cj5);
        this.f534216s = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564768a24);
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564151jh);
        this.f534209i = findViewById;
        if (this.f534221x || this.f534222y) {
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.FrameLayout frameLayout = this.f534207g;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }
        this.f534214q = (android.widget.FrameLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.lb_);
        this.f534215r = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564067h0);
        this.f534212o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.e9e);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.e9d);
        android.widget.LinearLayout linearLayout2 = null;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new x92.c(this));
        } else {
            linearLayout = null;
        }
        this.f534210m = linearLayout;
        this.f534213p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.e9g);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.e9f);
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new x92.d(this));
            linearLayout2 = linearLayout3;
        }
        this.f534211n = linearLayout2;
        this.f534217t = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564118ii);
        mo55425x60022348();
    }

    @Override // x92.r
    public void T6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        super.T6(fVar);
        android.widget.TextView textView = this.f534215r;
        if (textView == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        java.lang.String Y6 = Y6();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m158354x19263085, Y6));
    }

    @Override // x92.r
    public void U6() {
        android.view.View view;
        z5();
        android.view.View view2 = this.f534208h;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f534221x || this.f534222y || (view = this.f534209i) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void V6(float f17, float f18) {
        if (f17 < 0.5d) {
            Z6(this.f534215r, 4);
        } else {
            Z6(this.f534215r, 0);
        }
        android.widget.LinearLayout linearLayout = this.f534210m;
        if (linearLayout != null) {
            linearLayout.setAlpha(f18);
        }
        android.widget.LinearLayout linearLayout2 = this.f534211n;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setAlpha(f18);
    }

    public void W6(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, float f17) {
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        float min = java.lang.Math.min(1.0f, (java.lang.Math.abs(f17) * 1.0f) / this.A);
        if (min == this.f534223z) {
            return;
        }
        this.f534223z = min;
        if (min < 0.5f) {
            f18 = (0.5f - min) / 0.5f;
            android.view.View view2 = this.f534209i;
            if (view2 != null) {
                view2.setBackgroundColor(this.f534219v);
            }
            android.widget.FrameLayout frameLayout = this.f534214q;
            if (frameLayout != null) {
                frameLayout.setAlpha(0.0f);
            }
            V6(min, f18);
        } else {
            f18 = (min - 0.5f) / 0.5f;
            int i17 = (int) (255 * f18);
            android.view.View view3 = this.f534209i;
            if (view3 != null) {
                view3.setBackgroundColor(com.p314xaae8f345.mm.ui.uk.a(this.f534220w, i17));
            }
            android.widget.FrameLayout frameLayout2 = this.f534214q;
            if (frameLayout2 != null) {
                frameLayout2.setAlpha(f18);
            }
            V6(min, f18);
        }
        android.view.View view4 = this.f534217t;
        if (view4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(min));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "contentOffsetChange", "(Lcom/google/android/material/appbar/AppBarLayout;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "contentOffsetChange", "(Lcom/google/android/material/appbar/AppBarLayout;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicActionBarUIC", "alpha : " + f18);
    }

    public v92.g X6() {
        return new v92.g(m158354x19263085());
    }

    public java.lang.String Y6() {
        return "";
    }

    public final void Z6(android.view.View view, int i17) {
        if ((view != null && view.getVisibility() == i17) || view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/base/uic/BaseActionBarUIC", "setVisibleStats", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // x92.r, x92.q
    public void b2() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().O0(true);
        int color = m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560515ml);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f534212o;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(color);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f534213p;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(color);
        }
        android.widget.TextView textView = this.f534215r;
        if (textView != null) {
            textView.setTextColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560511mh));
        }
        this.f534220w = m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560512mi);
    }

    @Override // x92.r, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c;
        this.f534221x = m158359x1e885992().getBooleanExtra("key_drawer_mode", false);
        this.f534222y = m158359x1e885992().getBooleanExtra("key_is_half_mode", false);
        super.mo450x3e5a77bb(bundle);
        android.view.View decorView = m158354x19263085().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        com.p314xaae8f345.mm.ui.r0.a(m158354x19263085(), false);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = m158354x19263085().mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        android.view.View decorView2 = m158354x19263085().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView2, "getDecorView(...)");
        decorView2.getViewTreeObserver().addOnPreDrawListener(new x92.b(decorView2, this));
        android.widget.FrameLayout frameLayout = this.f534214q;
        if (frameLayout != null) {
            frameLayout.setAlpha(0.0f);
        }
        if (this.f534221x || (c2678xa407981c = this.f534216s) == null) {
            return;
        }
        x92.a aVar = new x92.a(this);
        aVar.a(c2678xa407981c, 0);
        c2678xa407981c.a(aVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // x92.r, x92.q
    /* renamed from: setNormalStyle */
    public void mo55425x60022348() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().O0(com.p314xaae8f345.mm.ui.bk.C());
        int color = m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f534212o;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(color);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f534213p;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(color);
        }
        android.widget.TextView textView = this.f534215r;
        if (textView != null) {
            textView.setTextColor(m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        }
        this.f534220w = m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
    }
}
