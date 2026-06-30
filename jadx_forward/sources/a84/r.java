package a84;

/* loaded from: classes.dex */
public class r implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f83883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83884b;

    public r(android.widget.ImageView imageView, java.lang.String str) {
        this.f83883a = imageView;
        this.f83884b = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        android.widget.ImageView imageView = this.f83883a;
        imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f83884b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.ImageView imageView = this.f83883a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
        try {
            java.lang.String str2 = (java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.n1z);
            java.lang.String l17 = android.text.TextUtils.isEmpty(str2) ? "" : za4.t0.l("adId", str2);
            if (!android.text.TextUtils.isEmpty(str) && str.equals(l17)) {
                android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
                if (J2 != null) {
                    imageView.setImageBitmap(J2);
                    imageView.hashCode();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloaded, bitmap==null");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdImageLoader", "onDownloaded, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader$1");
    }
}
