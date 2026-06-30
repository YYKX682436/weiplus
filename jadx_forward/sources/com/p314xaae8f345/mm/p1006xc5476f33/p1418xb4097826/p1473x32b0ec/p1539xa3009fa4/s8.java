package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class s8 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.q8 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f198932d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f198933e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f198934f;

    /* renamed from: g, reason: collision with root package name */
    public long f198935g;

    /* renamed from: h, reason: collision with root package name */
    public long f198936h;

    /* renamed from: i, reason: collision with root package name */
    public int f198937i;

    /* renamed from: m, reason: collision with root package name */
    public int f198938m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f198939n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f198940o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r4 f198941p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.l f198942q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198938m = 1;
        this.f198942q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r8(this, activity);
    }

    public final void O6() {
        if (this.f198938m != 1) {
            android.view.View view = this.f198932d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = this.f198940o;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.view.View view2 = this.f198932d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView2 = this.f198940o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = this.f198940o;
        if (textView3 != null) {
            java.lang.String string = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eis);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nvz, string);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            if (L >= 0 && string.length() + L <= string2.length()) {
                spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m8(this), L, string.length() + L, 33);
            }
            textView3.setText(spannableString);
            textView3.setHighlightColor(textView3.getContext().getResources().getColor(android.R.color.transparent));
            textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f198934f;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ACCOUNT_LIVE_VISITOR_HONOR_RANK_SWITCH_ENABLE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(((java.lang.Boolean) m17).booleanValue());
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n8(this));
        }
    }

    public final void P6() {
        this.f198935g = m158354x19263085().getIntent().getLongExtra("LIVE_ID", 0L);
        this.f198936h = m158354x19263085().getIntent().getLongExtra("OBJECT_ID", 0L);
        this.f198937i = m158359x1e885992().getIntExtra("KEY_SOURCE", 0);
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("KEY_IS_FROM_SETTING", true);
        this.f198939n = booleanExtra;
        this.f198938m = (booleanExtra || this.f198937i == 2) ? g92.b.f351302e.k2().m75939xb282bd08(4) : m158359x1e885992().getIntExtra("KEY_VISITOR_ROLE", 1);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f198932d = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f566780h11);
        this.f198940o = (android.widget.TextView) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.f566779h10);
        this.f198933e = (android.widget.ProgressBar) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.imc);
        this.f198934f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nto);
        P6();
        O6();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f198934f;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            ym5.a1.h(viewOnClickListenerC22631x1cc07cc8, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.o8());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f198939n) {
            P6();
            O6();
        }
    }
}
