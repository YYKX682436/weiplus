package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class k7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.s7 f103807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103809f;

    public k7(com.tencent.mm.plugin.finder.convert.s7 s7Var, so2.y0 y0Var, in5.s0 s0Var) {
        this.f103807d = s7Var;
        this.f103808e = y0Var;
        this.f103809f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f103807d.M(this.f103808e, this.f103809f, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$onBindViewHolder$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
