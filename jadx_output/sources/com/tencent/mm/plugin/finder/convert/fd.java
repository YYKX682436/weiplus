package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class fd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103367e;

    public fd(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        this.f103366d = baseFinderFeed;
        this.f103367e = qeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.feed.i0 i0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPromotionUnlockCountDownCapsule$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f103366d.getNativeDramaUnlockCountDownFinish()) {
            com.tencent.mm.plugin.finder.feed.k8 k8Var = this.f103367e.f104358f;
            ac2.t tVar = k8Var instanceof ac2.t ? (ac2.t) k8Var : null;
            if (tVar != null && (i0Var = tVar.f106424g) != null) {
                i0Var.v(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPromotionUnlockCountDownCapsule$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
