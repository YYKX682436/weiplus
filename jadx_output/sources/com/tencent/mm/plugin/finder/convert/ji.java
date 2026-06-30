package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ji implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f103758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f103761g;

    public ji(com.tencent.mm.plugin.finder.convert.oj ojVar, int i17, in5.s0 s0Var, so2.n1 n1Var) {
        this.f103758d = ojVar;
        this.f103759e = i17;
        this.f103760f = s0Var;
        this.f103761g = n1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindEnableRecommend$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f103758d;
        com.tencent.mm.plugin.finder.feed.k8 k8Var = ojVar.f104184f;
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        if (pzVar != null) {
            hb2.q.f280082e.n(pzVar.f108755g, pzVar.C.getDataListJustForAdapter(), new com.tencent.mm.plugin.finder.feed.yy(pzVar));
            pzVar.f108779z1 = java.lang.Integer.valueOf(this.f103759e);
        }
        com.tencent.mm.plugin.finder.feed.k8 k8Var2 = ojVar.f104184f;
        com.tencent.mm.plugin.finder.ui.qm qmVar = k8Var2 instanceof com.tencent.mm.plugin.finder.ui.qm ? (com.tencent.mm.plugin.finder.ui.qm) k8Var2 : null;
        if (qmVar != null && (baseFeedLoader = qmVar.f106570t) != null) {
            hb2.q.f280082e.n(qmVar.f106421d, baseFeedLoader.getDataListJustForAdapter(), new com.tencent.mm.plugin.finder.ui.nm(qmVar));
        }
        android.content.Context context = this.f103760f.f293121e;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.ikb);
        e4Var.b(com.tencent.mm.R.raw.toast_ok);
        e4Var.c();
        this.f103761g.f410490d = true;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindEnableRecommend$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
