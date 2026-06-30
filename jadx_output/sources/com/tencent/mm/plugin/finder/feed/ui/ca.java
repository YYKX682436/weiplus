package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ca extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f109747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI f109748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI) {
        super(2, continuation);
        this.f109747d = hVar;
        this.f109748e = finderLiveHistoryUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.ca(this.f109747d, continuation, this.f109748e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.ui.ca caVar = (com.tencent.mm.plugin.finder.feed.ui.ca) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        caVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("FinderLiveHistoryUI", "#refreshData fail cgiException=" + ((xg2.a) ((xg2.b) this.f109747d).f454381b).f454379a);
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f109748e.f109376z;
        if (finderRefreshLayout != null) {
            finderRefreshLayout.i(true);
        }
        return jz5.f0.f302826a;
    }
}
