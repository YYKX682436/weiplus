package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ql implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f104404f;

    public ql(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.protobuf.g gVar) {
        this.f104402d = s0Var;
        this.f104403e = baseFinderFeed;
        this.f104404f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f104402d.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = activity != null ? (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) activity.findViewById(com.tencent.mm.R.id.edz) : null;
        if (finderLikeDrawer != null) {
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer.w(finderLikeDrawer, this.f104402d, this.f104403e.getFeedObject(), this.f104404f, 0, null, null, 56, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLikeConvert$onBindViewHolder$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
