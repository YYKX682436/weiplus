package fr2;

/* loaded from: classes2.dex */
public final class x extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c f347296d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f347297e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f347298f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f347299g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f347300h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f347301i;

    /* renamed from: m, reason: collision with root package name */
    public dk2.of f347302m;

    /* renamed from: n, reason: collision with root package name */
    public o25.y1 f347303n;

    /* renamed from: o, reason: collision with root package name */
    public r45.zz2 f347304o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 act) {
        super(act);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(act, "act");
    }

    public static final float O6(fr2.x xVar, int i17, float f17) {
        xVar.getClass();
        float f18 = i17;
        if (f18 <= 0.0f) {
            return 1.0f;
        }
        if (f18 >= f17) {
            return 0.0f;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(f17);
        if (!(valueOf.floatValue() > 0.0f)) {
            valueOf = null;
        }
        return (f17 - f18) / (valueOf != null ? valueOf.floatValue() : 1.0f);
    }

    public final void P6(r45.vz2 vz2Var) {
        jz5.f0 f0Var;
        if (vz2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.f196976a;
            android.widget.ImageView imageView = this.f347297e;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("themeBgView");
                throw null;
            }
            java.util.LinkedList background_color = vz2Var.f470228m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(background_color, "background_color");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2 u2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2.f197250f;
            a3Var.c(imageView, background_color, u2Var);
            android.widget.ImageView imageView2 = this.f347298f;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("themeHeaderBgView");
                throw null;
            }
            a3Var.d(imageView2, vz2Var.f470222d);
            android.widget.ImageView imageView3 = this.f347300h;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerBgView");
                throw null;
            }
            java.util.LinkedList navbar_bg_color = vz2Var.f470229n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(navbar_bg_color, "navbar_bg_color");
            a3Var.c(imageView3, navbar_bg_color, u2Var);
            android.widget.TextView textView = this.f347301i;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTextView");
                throw null;
            }
            java.util.LinkedList navbar_text_color = vz2Var.f470230o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(navbar_text_color, "navbar_text_color");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.e(a3Var, textView, navbar_text_color, null, null, 6, null);
            android.widget.TextView textView2 = this.f347301i;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTextView");
                throw null;
            }
            textView2.setText(vz2Var.f470223e);
            android.widget.TextView textView3 = this.f347301i;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTextView");
                throw null;
            }
            com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.ImageView imageView4 = this.f347297e;
            if (imageView4 != null) {
                imageView4.setBackgroundColor(-16777216);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("themeBgView");
                throw null;
            }
        }
    }

    public final void Q6(r45.zz2 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f347304o = info;
        android.view.View findViewById = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.r6i);
        if (findViewById == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "refreshShareInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderThemeLiveStreamShareInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "refreshShareInfo", "(Lcom/tencent/mm/protocal/protobuf/FinderThemeLiveStreamShareInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void R6(r45.vz2 vz2Var) {
        android.view.View findViewById;
        if (vz2Var == null || (findViewById = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.nv_)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "setTabListBackground", "(Lcom/tencent/mm/protocal/protobuf/FinderThemeLiveStreamAppearance;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "setTabListBackground", "(Lcom/tencent/mm/protocal/protobuf/FinderThemeLiveStreamAppearance;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.f196976a;
        java.util.LinkedList navbar_bg_color = vz2Var.f470229n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(navbar_bg_color, "navbar_bg_color");
        a3Var.c(findViewById, navbar_bg_color, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2.f197250f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View findViewById = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.o5u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f347297e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.gyo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f347298f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f564618w6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f347296d = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) findViewById3;
        android.view.View findViewById4 = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.f563969ej);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f347299g = findViewById4;
        android.view.View findViewById5 = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.gy9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f347300h = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.fnn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f347301i = (android.widget.TextView) findViewById6;
        android.widget.ImageView imageView = this.f347300h;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerBgView");
            throw null;
        }
        imageView.setAlpha(0.0f);
        android.widget.TextView textView = this.f347301i;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleTextView");
            throw null;
        }
        textView.setAlpha(0.0f);
        android.widget.ImageView imageView2 = this.f347298f;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("themeHeaderBgView");
            throw null;
        }
        imageView2.setAlpha(0.5f);
        int h17 = com.p314xaae8f345.mm.ui.bl.h(m80379x76847179());
        android.view.View view = this.f347299g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = i65.a.b(m80379x76847179(), 48) + h17;
        }
        android.view.View findViewById7 = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.nhk);
        if (findViewById7 != null && (layoutParams = findViewById7.getLayoutParams()) != null) {
            layoutParams.height = h17;
        }
        android.view.View findViewById8 = m80379x76847179().findViewById(com.p314xaae8f345.mm.R.id.r6i);
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(new fr2.r(this));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById8, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.e0();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = this.f347296d;
        if (c2678xa407981c == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appBarLayout");
            throw null;
        }
        c2678xa407981c.a(new fr2.s(e0Var, e0Var2, this));
        dk2.of a17 = dk2.of.f315392j.a(m80379x76847179().getIntent());
        this.f347302m = a17;
        P6(a17 != null ? a17.f315396c : null);
        dk2.of ofVar = this.f347302m;
        R6(ofVar != null ? ofVar.f315396c : null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f347303n = null;
    }
}
