package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.c0 f104979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f104981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f104982g;

    public y(com.tencent.mm.plugin.finder.convert.c0 c0Var, in5.s0 s0Var, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f104979d = c0Var;
        this.f104980e = s0Var;
        this.f104981f = textView;
        this.f104982g = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.c0.n(this.f104979d, this.f104980e, false, 0L, null);
        android.widget.TextView textView = this.f104982g;
        this.f104981f.postDelayed(new com.tencent.mm.plugin.finder.convert.x(textView), 1000L);
        if (textView.getVisibility() == 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", textView, null, 25496);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
