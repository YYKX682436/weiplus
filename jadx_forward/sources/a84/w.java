package a84;

/* loaded from: classes4.dex */
public class w implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t84.c f83901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f83903c;

    public w(t84.c cVar, java.lang.String str, float f17) {
        this.f83901a = cVar;
        this.f83902b = str;
        this.f83903c = f17;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloadError, hash=" + this.f83901a.hashCode() + ", url=" + this.f83902b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        t84.c cVar = this.f83901a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
        try {
            cVar.hashCode();
            a84.z.b(cVar, str, this.f83903c);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "loadImageByCdn, onDownloaded, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$5");
    }
}
