package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class k2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198709d;

    /* renamed from: e, reason: collision with root package name */
    public int f198710e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f198711f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f198712g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f198713h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f198714i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f198715m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f198716n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f198717o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.j2 f198718p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f198719q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198709d = "Finder.FinderGameFinishUIC";
        this.f198710e = 6;
        this.f198711f = "";
        this.f198718p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.j2(this, activity);
        this.f198719q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i2(this), true);
    }

    public final void O6() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator withEndAction;
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null && (mo78514x143f1b92 = abstractActivityC21394xb3d2c0cf.mo78514x143f1b92()) != null) {
            mo78514x143f1b92.G0(m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        android.view.View view = this.f198712g;
        if (view == null || (animate = view.animate()) == null || (translationX = animate.translationX(-com.p314xaae8f345.mm.ui.bl.b(m158354x19263085()).x)) == null || (withEndAction = translationX.withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f2(this))) == null) {
            return;
        }
        withEndAction.start();
    }

    public final void P6() {
        android.view.View findViewById;
        com.p314xaae8f345.mm.ui.ga mo78514x143f1b92;
        android.view.View findViewById2;
        android.view.View findViewById3;
        android.view.View view = this.f198712g;
        this.f198715m = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.eyn) : null;
        android.view.View view2 = this.f198712g;
        this.f198716n = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.eyk) : null;
        m158354x19263085();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) this.f198712g.findViewById(com.p314xaae8f345.mm.R.id.ezd);
        c22633x83752a59.getClass();
        this.f198713h = c22633x83752a59;
        c22633x83752a59.mo81410x6fd49b97(this.f198718p);
        android.view.View view3 = this.f198712g;
        android.widget.Button button = view3 != null ? (android.widget.Button) view3.findViewById(com.p314xaae8f345.mm.R.id.eym) : null;
        this.f198714i = button;
        android.view.ViewGroup.LayoutParams layoutParams = button != null ? button.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(m158354x19263085(), 48) + com.p314xaae8f345.mm.ui.bl.c(m158354x19263085());
        }
        android.view.View view4 = this.f198712g;
        android.view.ViewGroup.LayoutParams layoutParams2 = (view4 == null || (findViewById3 = view4.findViewById(com.p314xaae8f345.mm.R.id.eyl)) == null) ? null : findViewById3.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(m158354x19263085());
        }
        android.widget.Button button2 = this.f198714i;
        if (button2 != null) {
            button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g2(this));
        }
        android.view.View view5 = this.f198716n;
        if (view5 != null) {
            view5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h2(this));
        }
        if (m80379x76847179() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13961x4185f9c0) {
            android.view.View view6 = this.f198712g;
            android.view.ViewGroup.LayoutParams layoutParams3 = (view6 == null || (findViewById = view6.findViewById(com.p314xaae8f345.mm.R.id.ezb)) == null) ? null : findViewById.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams3 != null) {
                marginLayoutParams3.topMargin = (int) m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            }
        } else {
            android.view.View view7 = this.f198712g;
            android.view.ViewGroup.LayoutParams layoutParams4 = (view7 == null || (findViewById2 = view7.findViewById(com.p314xaae8f345.mm.R.id.ezb)) == null) ? null : findViewById2.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            if (marginLayoutParams4 != null) {
                marginLayoutParams4.topMargin = com.p314xaae8f345.mm.ui.bl.h(m158354x19263085());
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null && (mo78514x143f1b92 = abstractActivityC21394xb3d2c0cf.mo78514x143f1b92()) != null) {
            mo78514x143f1b92.G0(m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307));
        }
        android.view.View view8 = this.f198712g;
        if (view8 != null) {
            view8.setTranslationX(0.0f);
        }
        android.view.View view9 = this.f198712g;
        if (view9 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view9, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameProtocolUIC", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        try {
            this.f198711f = "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_game_agreement";
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a592 = this.f198713h;
            if (c22633x83752a592 != null) {
                c22633x83752a592.mo32265x141096a9("https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_game_agreement");
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f198719q;
            b4Var.d();
            this.f198710e = 6;
            b4Var.c(1000L, 1000L);
            android.widget.Button button3 = this.f198714i;
            if (button3 == null) {
                return;
            }
            button3.setEnabled(false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f198709d, e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f198712g = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.lcj);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f198719q.d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f198713h;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo52095x5cd39ffa();
        }
    }
}
