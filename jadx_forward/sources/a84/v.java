package a84;

/* loaded from: classes4.dex */
public class v extends n74.z1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f83899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f83900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.widget.ImageView imageView, java.lang.String str, float f17, boolean z17) {
        super(imageView);
        this.f83898b = str;
        this.f83899c = f17;
        this.f83900d = z17;
    }

    @Override // n74.z1, za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
        java.lang.ref.WeakReference weakReference = this.f416989a;
        if (weakReference != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
            if (imageView != null) {
                imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f83898b);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloadError, realImageView==null");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloadError, imgViewRef==null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
    }

    @Override // n74.z1, za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
    }

    @Override // n74.z1, za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
        try {
            java.lang.ref.WeakReference weakReference = this.f416989a;
            if (weakReference != null) {
                android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
                if (imageView != null) {
                    imageView.hashCode();
                    a84.z.a(imageView, str, this.f83899c, this.f83900d);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloaded, realImageView==null");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloaded, imgViewRef==null");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "loadImageByCdn, onDownloaded, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$4");
    }
}
