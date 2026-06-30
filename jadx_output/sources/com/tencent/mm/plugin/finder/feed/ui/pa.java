package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class pa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI f110415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f110416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110415d = finderLiveKTVReplayUI;
        this.f110416e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.pa(this.f110415d, this.f110416e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.ui.pa paVar = (com.tencent.mm.plugin.finder.feed.ui.pa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        paVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI = this.f110415d;
        dk2.ca caVar = finderLiveKTVReplayUI.B;
        if (caVar != null) {
            com.tencent.mm.plugin.finder.feed.ui.oa oaVar = new com.tencent.mm.plugin.finder.feed.ui.oa(finderLiveKTVReplayUI);
            java.util.List micReplayInfoList = this.f110416e;
            kotlin.jvm.internal.o.g(micReplayInfoList, "micReplayInfoList");
            com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayDownloadManager", "downloadAllVideos: videoCount=" + micReplayInfoList.size() + ", isDownloading=" + caVar.f233293c);
            if (caVar.f233293c) {
                com.tencent.mars.xlog.Log.w("FinderLiveKTVReplayDownloadManager", "downloadAllVideos: already downloading");
                com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayUI", "onError: ".concat("Already downloading"));
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.ka(finderLiveKTVReplayUI));
            } else if (micReplayInfoList.isEmpty()) {
                com.tencent.mars.xlog.Log.w("FinderLiveKTVReplayDownloadManager", "downloadAllVideos: empty list");
                com.tencent.mars.xlog.Log.e("FinderLiveKTVReplayUI", "onError: ".concat("Empty video list"));
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.ka(finderLiveKTVReplayUI));
            } else {
                caVar.f233293c = true;
                caVar.b(micReplayInfoList, 0, micReplayInfoList.size(), new java.util.ArrayList(), oaVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
