package a84;

/* loaded from: classes4.dex */
public class s implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f83885a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f83887c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83888d;

    public s(int i17, android.widget.ImageView imageView, java.lang.String str) {
        this.f83886b = i17;
        this.f83887c = imageView;
        this.f83888d = str;
    }

    @Override // za4.e0
    public void a() {
        android.widget.ImageView imageView = this.f83887c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
        try {
            ca4.m0.t0(this.f83886b, 1);
            imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
            imageView.setImageDrawable(null);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f83888d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
        this.f83885a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
        a84.z.a(this.f83887c, str, 0.0f, false);
        try {
            if (this.f83885a) {
                ca4.m0.t0(this.f83886b, 0);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$2");
    }
}
