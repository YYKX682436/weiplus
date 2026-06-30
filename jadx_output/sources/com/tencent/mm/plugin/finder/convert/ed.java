package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ed implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f103250f;

    public ed(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f103248d = qeVar;
        this.f103249e = s0Var;
        this.f103250f = baseFinderFeed;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshProfileCreateTimeIv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "click profile create time tv");
        com.tencent.mm.plugin.finder.convert.qe qeVar = this.f103248d;
        in5.s0 s0Var = this.f103249e;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f103250f;
        kotlin.jvm.internal.o.e(baseFinderFeed, "null cannot be cast to non-null type T of com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert.refreshProfileCreateTimeIv$lambda$116");
        com.tencent.mm.plugin.finder.convert.qe qeVar2 = this.f103248d;
        com.tencent.mm.plugin.finder.convert.qe.E0(qeVar, s0Var, baseFinderFeed, false, 0L, null, 0, 4, qeVar2.i0(), 0L, qeVar2.R(this.f103249e), 1, 312, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshProfileCreateTimeIv$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
