package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class wv {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f201769a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k80 f201770b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f201771c;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f201772d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f201773e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f201774f;

    public wv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 pluginLayout, android.app.Activity activity, gk2.e buContext, zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        this.f201769a = pluginLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k80 k80Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k80(pluginLayout, uiMode);
        this.f201770b = k80Var;
        zl2.w4 w4Var = zl2.w4.f555550a;
        android.view.LayoutInflater layoutInflater = activity.getLayoutInflater();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutInflater, "getLayoutInflater(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) w4Var.b(com.p314xaae8f345.mm.R.C30864xbddafb2a.eby, null, false, uiMode, activity, layoutInflater);
        this.f201771c = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ruw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f201772d = c1163xf1deaba4;
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.rnf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f201773e = findViewById2;
        android.view.View findViewById3 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.rjm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f201774f = findViewById3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveSingerListWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveSingerListWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c1163xf1deaba4.setVisibility(8);
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vv(this));
        c1163xf1deaba4.mo7960x6cab2c8d(k80Var);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(pluginLayout.getContext()));
    }
}
