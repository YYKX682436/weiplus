package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c0 f186512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f186514f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f186515g;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c0 c0Var, in5.s0 s0Var, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f186512d = c0Var;
        this.f186513e = s0Var;
        this.f186514f = textView;
        this.f186515g = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c0.n(this.f186512d, this.f186513e, false, 0L, null);
        android.widget.TextView textView = this.f186515g;
        this.f186514f.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x(textView), 1000L);
        if (textView.getVisibility() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", textView, null, 25496);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
