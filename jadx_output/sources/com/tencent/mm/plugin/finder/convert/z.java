package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.c0 f105067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f105069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105070g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f105071h;

    public z(com.tencent.mm.plugin.finder.convert.c0 c0Var, in5.s0 s0Var, long j17, java.lang.String str, android.widget.TextView textView) {
        this.f105067d = c0Var;
        this.f105068e = s0Var;
        this.f105069f = j17;
        this.f105070g = str;
        this.f105071h = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.c0.n(this.f105067d, this.f105068e, false, this.f105069f, this.f105070g);
        android.widget.TextView textView = this.f105071h;
        if (textView.getVisibility() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", textView, null, 25496);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
