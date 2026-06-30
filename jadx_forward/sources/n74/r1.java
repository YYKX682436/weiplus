package n74;

/* loaded from: classes4.dex */
public class r1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416957b;

    public r1(java.lang.String str, java.lang.String str2) {
        this.f416956a = str;
        this.f416957b = str2;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
        java.util.Set a17 = n74.v1.a();
        java.lang.String str = this.f416956a;
        a17.remove(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", this.f416957b + " [landingPageImg] failed, url=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
        java.util.Set a17 = n74.v1.a();
        java.lang.String str2 = this.f416956a;
        a17.remove(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimeLineAdPreloadHelper", this.f416957b + " [landingPageImg] succ, url=" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$4");
    }
}
