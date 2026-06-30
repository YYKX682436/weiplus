package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c0 f186600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f186602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f186604h;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c0 c0Var, in5.s0 s0Var, long j17, java.lang.String str, android.widget.TextView textView) {
        this.f186600d = c0Var;
        this.f186601e = s0Var;
        this.f186602f = j17;
        this.f186603g = str;
        this.f186604h = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c0.n(this.f186600d, this.f186601e, false, this.f186602f, this.f186603g);
        android.widget.TextView textView = this.f186604h;
        if (textView.getVisibility() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", textView, null, 25496);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
