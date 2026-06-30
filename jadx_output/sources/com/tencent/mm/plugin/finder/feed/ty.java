package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ty implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f109116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f109117e;

    public ty(com.tencent.mm.plugin.finder.feed.pz pzVar, ym5.s3 s3Var) {
        this.f109116d = pzVar;
        this.f109117e = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f109116d;
        com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
        if (ctVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.u(((com.tencent.mm.plugin.finder.feed.v00) ctVar).l(), null, 1, null);
        }
        pzVar.onRefreshEnd(this.f109117e);
    }
}
