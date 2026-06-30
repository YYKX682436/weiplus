package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class pa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256 f191948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f191949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256 activityC14003xac416256, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f191948d = activityC14003xac416256;
        this.f191949e = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pa(this.f191948d, this.f191949e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pa paVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.pa) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        paVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14003xac416256 activityC14003xac416256 = this.f191948d;
        dk2.ca caVar = activityC14003xac416256.B;
        if (caVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.oa oaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.oa(activityC14003xac416256);
            java.util.List micReplayInfoList = this.f191949e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micReplayInfoList, "micReplayInfoList");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "downloadAllVideos: videoCount=" + micReplayInfoList.size() + ", isDownloading=" + caVar.f314826c);
            if (caVar.f314826c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveKTVReplayDownloadManager", "downloadAllVideos: already downloading");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayUI", "onError: ".concat("Already downloading"));
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ka(activityC14003xac416256));
            } else if (micReplayInfoList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveKTVReplayDownloadManager", "downloadAllVideos: empty list");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayUI", "onError: ".concat("Empty video list"));
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ka(activityC14003xac416256));
            } else {
                caVar.f314826c = true;
                caVar.b(micReplayInfoList, 0, micReplayInfoList.size(), new java.util.ArrayList(), oaVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
