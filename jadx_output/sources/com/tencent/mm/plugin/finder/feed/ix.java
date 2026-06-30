package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ix implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f107054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f107055e;

    public ix(com.tencent.mm.plugin.finder.feed.pz pzVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f107054d = pzVar;
        this.f107055e = baseFinderFeed;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f107054d;
        pzVar.getClass();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f107055e;
        if (!baseFinderFeed.N0()) {
            com.tencent.mm.ui.MMActivity mMActivity = pzVar.f108755g;
            g4Var.j(99, mMActivity.getString(com.tencent.mm.R.string.gyz), com.tencent.mm.R.raw.finder_feed_dislike_new, mMActivity.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_8), false);
        }
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.plugin.finder.feed.pz.J0(pzVar, baseFinderFeed, g4Var);
    }
}
