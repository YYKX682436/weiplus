package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class iw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.nw f103699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vb2.q f103700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ys f103701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f103702g;

    public iw(com.tencent.mm.plugin.finder.convert.nw nwVar, vb2.q qVar, com.tencent.mm.plugin.finder.feed.ys ysVar, int i17) {
        this.f103699d = nwVar;
        this.f103700e = qVar;
        this.f103701f = ysVar;
        this.f103702g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.nw nwVar = this.f103699d;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        java.lang.Object tag = this.f103700e.f434706c.f434645a.getTag();
        com.tencent.mm.plugin.finder.convert.nw.n(nwVar, mMActivity, tag instanceof com.tencent.mm.protocal.protobuf.FinderObject ? (com.tencent.mm.protocal.protobuf.FinderObject) tag : null, this.f103701f, 1, this.f103702g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderStreamJumpHotCardConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
