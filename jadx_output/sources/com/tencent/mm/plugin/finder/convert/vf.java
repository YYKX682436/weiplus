package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f104785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f104786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f104787g;

    public vf(in5.s0 s0Var, so2.h1 h1Var, int i17, com.tencent.mm.plugin.finder.convert.zf zfVar) {
        this.f104784d = s0Var;
        this.f104785e = h1Var;
        this.f104786f = i17;
        this.f104787g = zfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f104784d;
        com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView finderFeedLiveRecommendView = (com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView) s0Var.p(com.tencent.mm.R.id.efr);
        so2.h1 h1Var = this.f104785e;
        finderFeedLiveRecommendView.b(h1Var.getFeedObject().getLiveInfo(), this.f104786f);
        com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView finderFeedLiveRecommendView2 = (com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView) s0Var.p(com.tencent.mm.R.id.efr);
        com.tencent.mm.plugin.finder.convert.zf zfVar = this.f104787g;
        finderFeedLiveRecommendView2.setOnClickListener(new com.tencent.mm.plugin.finder.convert.tf(zfVar, s0Var, h1Var));
        ((com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView) s0Var.p(com.tencent.mm.R.id.efr)).setOnLongClickListener(new com.tencent.mm.plugin.finder.convert.uf(zfVar, s0Var));
    }
}
