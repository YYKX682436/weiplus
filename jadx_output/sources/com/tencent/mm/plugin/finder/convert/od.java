package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class od implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f104169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104171f;

    public od(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f104169d = qeVar;
        this.f104170e = s0Var;
        this.f104171f = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f104169d;
        qeVar.getClass();
        in5.s0 s0Var = this.f104170e;
        android.content.Context context = s0Var.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = activity != null ? (com.tencent.mm.plugin.finder.view.FinderLikeDrawer) activity.findViewById(com.tencent.mm.R.id.edz) : null;
        com.tencent.mm.plugin.finder.feed.k8 k8Var = qeVar.f104358f;
        if (finderLikeDrawer == null) {
            com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "lazy init friend like drawer");
            finderLikeDrawer = k8Var.s6();
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer2 = finderLikeDrawer;
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar != null ? pzVar.f108756h : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f104171f;
        a4Var.R6(finderHomeTabFragment, baseFinderFeed, s0Var, finderLikeDrawer2);
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
        in5.s0 s0Var2 = this.f104170e;
        a4Var2.f133730z = new com.tencent.mm.plugin.finder.convert.nd(qeVar, s0Var2);
        if (finderLikeDrawer2 != null) {
            com.tencent.mm.plugin.finder.view.FinderLikeDrawer.w(finderLikeDrawer2, s0Var2, baseFinderFeed.getFeedObject(), baseFinderFeed.getLikeBuffer(), qeVar.R(s0Var), null, null, 48, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshRealNameRecommendLayout$2$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
