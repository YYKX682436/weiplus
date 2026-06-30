package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.gj f106747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(com.tencent.mm.plugin.finder.feed.gj gjVar) {
        super(1);
        this.f106747d = gjVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.gj gjVar = this.f106747d;
        com.tencent.mm.plugin.finder.feed.c0 c0Var = gjVar.f106969e;
        kotlin.jvm.internal.o.e(c0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract.Presenter");
        ((com.tencent.mm.plugin.finder.feed.dj) c0Var).V();
        com.tencent.mm.view.RefreshLoadMoreLayout.T(gjVar.o(), 0, false, null, 7, null);
        return jz5.f0.f302826a;
    }
}
