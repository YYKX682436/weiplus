package com.tencent.mm.plugin.finder.feed;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$Loader", "Lcom/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$TopicLoader;", "com/tencent/mm/plugin/finder/feed/y10", "com/tencent/mm/plugin/finder/feed/z10", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTopicTimelineUIContract$Loader extends com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$TopicLoader {
    public com.tencent.mm.protobuf.g A;
    public java.lang.String B;

    /* renamed from: o, reason: collision with root package name */
    public final int f106133o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f106134p;

    /* renamed from: q, reason: collision with root package name */
    public final long f106135q;

    /* renamed from: r, reason: collision with root package name */
    public final r45.ze2 f106136r;

    /* renamed from: s, reason: collision with root package name */
    public final r45.xu2 f106137s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f106138t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f106139u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f106140v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f106141w;

    /* renamed from: x, reason: collision with root package name */
    public long f106142x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f106143y;

    /* renamed from: z, reason: collision with root package name */
    public int f106144z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderTopicTimelineUIContract$Loader(int i17, java.lang.String topic, long j17, r45.ze2 location, r45.xu2 xu2Var, r45.qt2 qt2Var, boolean z17, java.lang.String str, boolean z18, com.tencent.mm.protobuf.g gVar) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(topic, "topic");
        kotlin.jvm.internal.o.g(location, "location");
        this.f106133o = i17;
        this.f106134p = topic;
        this.f106135q = j17;
        this.f106136r = location;
        this.f106137s = xu2Var;
        this.f106138t = z17;
        this.f106139u = str;
        this.f106140v = z18;
        this.f106141w = gVar;
        this.f106143y = "";
        this.B = "Finder.FinderTopicTimelineLoader";
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader
    public com.tencent.mm.plugin.finder.feed.model.internal.p0 createDataFetch() {
        return new com.tencent.mm.plugin.finder.feed.z10(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader, com.tencent.mm.plugin.finder.feed.model.internal.Dispatcher
    public com.tencent.mm.plugin.finder.feed.model.internal.a0 createDataMerger() {
        return new com.tencent.mm.plugin.finder.feed.b20(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.DataStore
    /* renamed from: getTAG, reason: from getter */
    public java.lang.String getB() {
        return this.B;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.DataStore
    public void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.B = str;
    }
}
