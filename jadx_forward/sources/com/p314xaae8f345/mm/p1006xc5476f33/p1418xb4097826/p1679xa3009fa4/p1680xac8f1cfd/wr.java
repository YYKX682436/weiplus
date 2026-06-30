package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class wr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs f217893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217895f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217896g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f217897h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.xk2 f217898i;

    public wr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, android.view.View view, android.view.View view2, in5.s0 s0Var, r45.zk2 zk2Var, r45.xk2 xk2Var) {
        this.f217893d = hsVar;
        this.f217894e = view;
        this.f217895f = view2;
        this.f217896g = s0Var;
        this.f217897h = zk2Var;
        this.f217898i = xk2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar = this.f217893d;
        android.view.View dislikeLayout = this.f217894e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dislikeLayout, "$dislikeLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.D7(hsVar, dislikeLayout, true, null, false, 4, null);
        dislikeLayout.setEnabled(false);
        this.f217895f.setEnabled(false);
        in5.s0 s0Var = this.f217896g;
        java.lang.String string = s0Var.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hs_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f217893d.R6(s0Var, this.f217897h, this.f217898i, string);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
