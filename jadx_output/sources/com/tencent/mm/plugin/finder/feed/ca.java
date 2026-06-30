package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ca implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment f106465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader f106466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.oa f106467c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f106468d;

    public ca(com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, com.tencent.mm.plugin.finder.feed.oa oaVar, int i17) {
        this.f106465a = finderHomeTabFragment;
        this.f106466b = baseFeedLoader;
        this.f106467c = oaVar;
        this.f106468d = i17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        android.os.Bundle bundle;
        boolean z17 = false;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = this.f106465a;
        if (finderHomeTabFragment != null && (bundle = finderHomeTabFragment.f129268s) != null && bundle.getInt("RequestScene", -1) == 1) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f106466b;
        if (z17) {
            com.tencent.mars.xlog.Log.i(baseFeedLoader.getF123427d(), "IInitDone come from hot card.");
        } else {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ba(this.f106467c, baseFeedLoader, this.f106468d));
        }
    }
}
