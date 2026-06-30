package o94;

/* loaded from: classes.dex */
public class b implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f425267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f425268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425269c;

    public b(android.widget.ImageView imageView, int i17, java.lang.String str) {
        this.f425267a = imageView;
        this.f425268b = i17;
        this.f425269c = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
        int i17 = this.f425268b;
        android.widget.ImageView imageView = this.f425267a;
        imageView.setTag(i17, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenSubscribeUtils", "onDownloadError, hash=" + imageView.hashCode() + ", url=" + this.f425269c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.ImageView imageView = this.f425267a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
        try {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
                if (J2 != null) {
                    imageView.setImageBitmap(J2);
                    imageView.setTag(this.f425268b, this.f425269c);
                    imageView.hashCode();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenSubscribeUtils", "onDownloaded, bitmap==null");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HalfScreenSubscribeUtils", "onDownloaded, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
    }
}
