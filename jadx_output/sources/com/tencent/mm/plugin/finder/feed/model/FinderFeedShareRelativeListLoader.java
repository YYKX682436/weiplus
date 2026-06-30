package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedShareRelativeListLoader;", "Lcom/tencent/mm/plugin/finder/feed/model/BaseFinderFeedLoader;", "com/tencent/mm/plugin/finder/feed/model/p1", "com/tencent/mm/plugin/finder/feed/model/x1", "com/tencent/mm/plugin/finder/feed/model/y1", "com/tencent/mm/plugin/finder/feed/model/z1", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedShareRelativeListLoader extends com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader {
    public final android.content.Intent A;
    public so2.j5 B;
    public long C;
    public as2.g D;
    public boolean E;
    public yz5.l F;
    public yz5.l G;
    public yz5.q H;
    public yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public yz5.l f107432J;
    public boolean K;
    public boolean L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public java.util.List Q;
    public java.util.List R;

    /* renamed from: d, reason: collision with root package name */
    public long f107433d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f107434e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107435f;

    /* renamed from: g, reason: collision with root package name */
    public final int f107436g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f107437h;

    /* renamed from: i, reason: collision with root package name */
    public final int f107438i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f107439m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f107440n;

    /* renamed from: o, reason: collision with root package name */
    public final int f107441o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f107442p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f107443q;

    /* renamed from: r, reason: collision with root package name */
    public final r45.sf6 f107444r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f107445s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f107446t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f107447u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f107448v;

    /* renamed from: w, reason: collision with root package name */
    public r45.a34 f107449w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f107450x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.nv2 f107451y;

    /* renamed from: z, reason: collision with root package name */
    public final dv2.y1 f107452z;

    public /* synthetic */ FinderFeedShareRelativeListLoader(long j17, java.lang.String str, java.lang.String str2, int i17, boolean z17, int i18, java.lang.String str3, r45.qt2 qt2Var, boolean z18, int i19, boolean z19, boolean z27, r45.sf6 sf6Var, com.tencent.mm.protobuf.g gVar, java.lang.String str4, java.lang.String str5, java.lang.String str6, r45.a34 a34Var, java.lang.String str7, r45.nv2 nv2Var, dv2.y1 y1Var, android.content.Intent intent, int i27, kotlin.jvm.internal.i iVar) {
        this(j17, str, str2, i17, (i27 & 16) != 0 ? false : z17, (i27 & 32) != 0 ? 3 : i18, (i27 & 64) != 0 ? "" : str3, qt2Var, (i27 & 256) != 0 ? false : z18, (i27 & 512) != 0 ? 0 : i19, (i27 & 1024) != 0 ? false : z19, (i27 & 2048) != 0 ? false : z27, (i27 & 4096) != 0 ? null : sf6Var, (i27 & 8192) != 0 ? null : gVar, (i27 & 16384) != 0 ? null : str4, (32768 & i27) != 0 ? null : str5, (65536 & i27) != 0 ? null : str6, (131072 & i27) != 0 ? null : a34Var, (262144 & i27) != 0 ? null : str7, (524288 & i27) != 0 ? null : nv2Var, (1048576 & i27) != 0 ? null : y1Var, (i27 & 2097152) != 0 ? null : intent);
    }

    public final so2.j c(int i17) {
        r45.eh2 eh2Var = new r45.eh2();
        eh2Var.set(0, java.lang.Integer.valueOf(i17));
        eh2Var.set(1, "");
        return new so2.j(new com.tencent.mm.plugin.finder.storage.la0(eh2Var));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return this.f107436g == 1001 ? new com.tencent.mm.plugin.finder.feed.model.p1(this) : this.f107437h ? new com.tencent.mm.plugin.finder.feed.model.z1(this) : new com.tencent.mm.plugin.finder.feed.model.x1(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.model.a2(this);
    }

    public final void d(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f107435f = str;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader
    public boolean isObservePostEvent() {
        return this.C != 0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.n0
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mm.plugin.finder.feed.model.y1 y1Var = response instanceof com.tencent.mm.plugin.finder.feed.model.y1 ? (com.tencent.mm.plugin.finder.feed.model.y1) response : null;
        if (y1Var != null) {
            y1Var.f108472b = response.getPullType();
        }
        if (response.getPullType() == 0 || response.getPullType() == 1000) {
            this.K = true;
            com.tencent.mars.xlog.Log.i(getF123427d(), "refresh finish pullType = " + response.getPullType());
        }
        if (response.getPullType() == 19) {
            this.L = true;
            com.tencent.mars.xlog.Log.i(getF123427d(), "slideUp finish pullType = " + response.getPullType());
        }
        if (response.getPullType() == 2 && !this.K) {
            com.tencent.mars.xlog.Log.i(getF123427d(), "loadmore before refresh");
            setInnerLoadingMore(false);
            return;
        }
        if (!isInitOperation(response) && (lVar = this.I) != null) {
            lVar.invoke(response);
        }
        if (response.getPullType() == 0) {
            response.setPullType(2);
        }
        super.onFetchDone(response);
        if (isInitOperation(response)) {
            yz5.l lVar2 = this.f107432J;
            if (lVar2 != null) {
                lVar2.invoke(response);
                return;
            }
            return;
        }
        yz5.l lVar3 = this.F;
        if (lVar3 != null) {
            lVar3.invoke(response);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderFeedShareRelativeListLoader(long j17, java.lang.String encryptedFeedId, java.lang.String nonceId, int i17, boolean z17, int i18, java.lang.String str, r45.qt2 qt2Var, boolean z18, int i19, boolean z19, boolean z27, r45.sf6 sf6Var, com.tencent.mm.protobuf.g gVar, java.lang.String str2, java.lang.String str3, java.lang.String str4, r45.a34 a34Var, java.lang.String str5, r45.nv2 nv2Var, dv2.y1 y1Var, android.content.Intent intent) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(encryptedFeedId, "encryptedFeedId");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.f107433d = j17;
        this.f107434e = encryptedFeedId;
        this.f107435f = nonceId;
        this.f107436g = i17;
        this.f107437h = z17;
        this.f107438i = i18;
        this.f107439m = str;
        this.f107440n = z18;
        this.f107441o = i19;
        this.f107442p = z19;
        this.f107443q = z27;
        this.f107444r = sf6Var;
        this.f107445s = gVar;
        this.f107446t = str2;
        this.f107447u = str3;
        this.f107448v = str4;
        this.f107449w = a34Var;
        this.f107450x = str5;
        this.f107451y = nv2Var;
        this.f107452z = y1Var;
        this.A = intent;
        this.L = true;
        this.M = "";
        this.N = "";
        this.P = "";
    }
}
