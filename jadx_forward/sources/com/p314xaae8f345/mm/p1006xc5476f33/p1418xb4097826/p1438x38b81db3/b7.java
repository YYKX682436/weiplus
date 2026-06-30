package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class b7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 f184475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f184476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184477f;

    public b7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s7 s7Var, android.widget.TextView textView, in5.s0 s0Var) {
        this.f184475d = s7Var;
        this.f184476e = textView;
        this.f184477f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f184475d.f186061e;
        android.widget.TextView commentFailTV = this.f184476e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(commentFailTV, "$commentFailTV");
        nPresenter.E(commentFailTV, this.f184477f.m8183xf806b362());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
