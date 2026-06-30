package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zw implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f111305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader f111306b;

    public zw(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader) {
        this.f111305a = pzVar;
        this.f111306b = finderTimelineFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        android.os.Bundle bundle;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f111305a;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar.f108756h;
        boolean z17 = false;
        if (finderHomeTabFragment != null && (bundle = finderHomeTabFragment.f129268s) != null && bundle.getInt("RequestScene", -1) == 1) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader finderTimelineFeedLoader = this.f111306b;
        if (!z17) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.yw(pzVar, finderTimelineFeedLoader, i17));
            return;
        }
        com.tencent.mars.xlog.Log.i(finderTimelineFeedLoader.getF123427d(), "IInitDone come from hot card.");
        dw2.c0 c0Var = pzVar.F.f223703n;
        if (c0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment2 = pzVar.f108756h;
            sb6.append(finderHomeTabFragment2 != null ? finderHomeTabFragment2.getClass().getSimpleName() : null);
            sb6.append("#onAttach");
            dw2.c0.h(c0Var, sb6.toString(), false, false, 4, null);
        }
    }
}
