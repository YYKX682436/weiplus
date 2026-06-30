package n74;

/* loaded from: classes4.dex */
public class t1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416967a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416969c;

    public t1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f416967a = str;
        this.f416968b = str2;
        this.f416969c = str3;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f416967a);
        sb6.append(" [http] failed, snsId=");
        sb6.append(this.f416968b);
        sb6.append(", url=");
        java.lang.String str = this.f416969c;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TimeLineAdPreloadHelper", sb6.toString());
        n74.v1.a().remove(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f416967a);
        sb6.append(" [http] succ, snsId=");
        sb6.append(this.f416968b);
        sb6.append(", url=");
        java.lang.String str2 = this.f416969c;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", sb6.toString());
        n74.v1.a().remove(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$6");
    }
}
