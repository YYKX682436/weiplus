package a84;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a84.l f83835f;

    public i(java.lang.String str, java.lang.String str2, a84.l lVar) {
        this.f83833d = str;
        this.f83834e = str2;
        this.f83835f = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6");
        try {
            android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f83833d, null);
            if (J2 == null || J2.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, setImageBitmapAsync bitmap is not exist and imgUrl is " + this.f83834e);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                java.lang.Object obj = a84.m.f83862a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM");
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.r2) obj).put(this.f83834e, J2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdCdnImageLoaderMM", "loadImageAsync, setImageBitmapAsync bitmap is exist and imgUrl is " + this.f83834e);
                ((ku5.t0) ku5.t0.f394148d).B(new a84.h(this, J2));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdCdnImageLoaderMM", "setImageBitmapAsync decode bitmap, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6");
    }
}
