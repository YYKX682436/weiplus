package k84;

/* loaded from: classes3.dex */
public class o4 implements a84.l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f386703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f386704b;

    public o4(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f) {
        this.f386703a = new java.lang.ref.WeakReference(c17781x303781f);
        this.f386704b = i65.a.b(c17781x303781f.getContext(), 16);
    }

    @Override // a84.l
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
        try {
            weakReference = this.f386703a;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DownloadCallback", "onDownloadResult, exp=" + th6.toString());
        }
        if (weakReference == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f) weakReference.get();
        if (c17781x303781f == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
            return;
        }
        java.lang.Object tag = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.j(c17781x303781f).getTag(com.p314xaae8f345.mm.R.id.n5q);
        if (tag instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) tag;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            java.lang.String str2 = c17781x303781f.S;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            if (!android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                java.lang.String str3 = c17781x303781f.S;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                if (str3.equals(str) && com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.j(c17781x303781f) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    android.graphics.drawable.Drawable drawable = c17781x303781f.R;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
                    if (z17 && bitmap != null) {
                        drawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), bitmap);
                        int i17 = this.f386704b;
                        drawable.setBounds(0, 0, i17, i17);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f.j(c17781x303781f).setImageDrawable(drawable);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadResult", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView$DownloadCallback");
    }
}
