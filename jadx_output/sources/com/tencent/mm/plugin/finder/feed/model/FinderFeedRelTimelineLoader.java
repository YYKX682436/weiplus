package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedRelTimelineLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/l1", "com/tencent/mm/plugin/finder/feed/model/m1", "com/tencent/mm/plugin/finder/feed/model/n1", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderFeedRelTimelineLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {

    /* renamed from: d, reason: collision with root package name */
    public final long f107416d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107417e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107418f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107419g;

    /* renamed from: h, reason: collision with root package name */
    public int f107420h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f107421i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.kd3 f107422m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f107423n;

    /* renamed from: o, reason: collision with root package name */
    public final r45.vd6 f107424o;

    /* renamed from: p, reason: collision with root package name */
    public final int f107425p;

    /* renamed from: q, reason: collision with root package name */
    public r45.z91 f107426q;

    /* renamed from: r, reason: collision with root package name */
    public final float f107427r;

    /* renamed from: s, reason: collision with root package name */
    public final float f107428s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.l f107429t;

    /* renamed from: u, reason: collision with root package name */
    public yz5.l f107430u;

    /* renamed from: v, reason: collision with root package name */
    public yz5.l f107431v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedRelTimelineLoader(long j17, java.lang.String str, int i17, java.lang.String str2, int i18, boolean z17, com.tencent.mm.protobuf.g gVar, r45.kd3 kd3Var, com.tencent.mm.protobuf.g gVar2, r45.vd6 vd6Var, int i19, r45.z91 z91Var, r45.qt2 qt2Var, float f17, float f18, int i27, kotlin.jvm.internal.i iVar) {
        super(qt2Var);
        long j18 = (i27 & 1) != 0 ? 0L : j17;
        java.lang.String nonceId = (i27 & 2) != 0 ? "" : str;
        int i28 = (i27 & 4) != 0 ? 0 : i17;
        java.lang.String str3 = (i27 & 8) == 0 ? str2 : "";
        int i29 = (i27 & 16) != 0 ? 0 : i18;
        boolean z18 = (i27 & 32) != 0 ? true : z17;
        r45.kd3 kd3Var2 = (i27 & 128) != 0 ? null : kd3Var;
        com.tencent.mm.protobuf.g gVar3 = (i27 & 256) != 0 ? null : gVar2;
        r45.vd6 vd6Var2 = (i27 & 512) != 0 ? null : vd6Var;
        int i37 = (i27 & 1024) == 0 ? i19 : 0;
        r45.z91 z91Var2 = (i27 & 2048) == 0 ? z91Var : null;
        float f19 = (i27 & 8192) != 0 ? 0.0f : f17;
        float f27 = (i27 & 16384) == 0 ? f18 : 0.0f;
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.f107416d = j18;
        this.f107417e = nonceId;
        this.f107418f = i28;
        this.f107419g = str3;
        this.f107420h = i29;
        this.f107421i = z18;
        this.f107422m = kd3Var2;
        this.f107423n = gVar3;
        this.f107424o = vd6Var2;
        this.f107425p = i37;
        this.f107426q = z91Var2;
        this.f107427r = f19;
        this.f107428s = f27;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.model.l1(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public boolean isObservePostEvent() {
        return !(this instanceof com.tencent.mm.plugin.finder.convert.FinderStreamCardAlbumConvert$fetchContent$loader$1);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchDone(response);
        if (isInitOperation(response) || response.getHasMore() || (lVar = this.f107429t) == null) {
            return;
        }
        lVar.invoke(response);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchInitDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse initResponse) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(initResponse, "initResponse");
        super.onFetchInitDone(initResponse);
        if (initResponse.getHasMore() || (lVar = this.f107429t) == null) {
            return;
        }
        lVar.invoke(initResponse);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchLoadMoreDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchLoadMoreDone(response);
        yz5.l lVar = this.f107431v;
        if (lVar != null) {
            lVar.invoke(response);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public void onFetchRefreshDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        super.onFetchRefreshDone(response);
        yz5.l lVar = this.f107430u;
        if (lVar != null) {
            lVar.invoke(response);
        }
    }
}
