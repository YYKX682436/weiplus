package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.nw f103868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ys f103869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103870f;

    public kw(com.tencent.mm.plugin.finder.convert.nw nwVar, com.tencent.mm.plugin.finder.feed.ys ysVar, int i17) {
        this.f103868d = nwVar;
        this.f103869e = ysVar;
        this.f103870f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.nw nwVar = this.f103868d;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.convert.nw.n(nwVar, (com.tencent.mm.ui.MMActivity) context, null, this.f103869e, 3, this.f103870f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
