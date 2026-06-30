package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 f186519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f186521f;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u4 u4Var, in5.s0 s0Var, so2.y0 y0Var) {
        this.f186519d = u4Var;
        this.f186520e = s0Var;
        this.f186521f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$28$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f186519d.f186203e;
        android.view.View itemView = this.f186520e.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        nPresenter.u(itemView, this.f186521f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$28$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
