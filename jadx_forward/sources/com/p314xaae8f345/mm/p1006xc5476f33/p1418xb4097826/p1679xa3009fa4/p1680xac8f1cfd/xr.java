package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class xr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs f218022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f218023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f218024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f218025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.zk2 f218026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.xk2 f218027i;

    public xr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar, android.view.View view, android.view.View view2, in5.s0 s0Var, r45.zk2 zk2Var, r45.xk2 xk2Var) {
        this.f218022d = hsVar;
        this.f218023e = view;
        this.f218024f = view2;
        this.f218025g = s0Var;
        this.f218026h = zk2Var;
        this.f218027i = xk2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar = this.f218022d;
        android.view.View likeLayout = this.f218023e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(likeLayout, "$likeLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs.D7(hsVar, likeLayout, true, null, true, 4, null);
        this.f218024f.setEnabled(false);
        likeLayout.setEnabled(false);
        in5.s0 s0Var = this.f218025g;
        java.lang.String string = s0Var.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hsa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f218022d.R6(s0Var, this.f218026h, this.f218027i, string);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNpsSurveyUIC$refreshHeaderLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
