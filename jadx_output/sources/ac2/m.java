package ac2;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ac2.t f3043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, ac2.t tVar) {
        super(1);
        this.f3042d = str;
        this.f3043e = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject appendClientReportInfo = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(appendClientReportInfo, "$this$appendClientReportInfo");
        appendClientReportInfo.put("drama_sessionid", this.f3042d);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.f3043e.f106570t;
        com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader finderNativeDramaTimelineFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader ? (com.tencent.mm.plugin.finder.drama.timeline.FinderNativeDramaTimelineFeedLoader) baseFeedLoader : null;
        java.lang.Integer valueOf = finderNativeDramaTimelineFeedLoader != null ? java.lang.Integer.valueOf(finderNativeDramaTimelineFeedLoader.f105291f) : null;
        java.lang.Integer num = valueOf != null && valueOf.intValue() > 0 ? valueOf : null;
        appendClientReportInfo.put("ref_commentscene", num != null ? num.intValue() : 0);
        return jz5.f0.f302826a;
    }
}
