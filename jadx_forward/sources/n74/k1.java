package n74;

/* loaded from: classes4.dex */
public class k1 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f416917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n74.n1 f416919c;

    public k1(n74.n1 n1Var, java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f416919c = n1Var;
        this.f416917a = weakReference;
        this.f416918b = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43) this.f416917a.get();
        if (c17806x48d2cd43 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdRollHelper", "realBar released");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
            return;
        }
        c17806x48d2cd43.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        android.widget.ImageView imageView = c17806x48d2cd43.f245196d;
        if (imageView != null) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78372xa799cd96);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDefaultIconImage", "com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "onDownloadError, hash = " + c17806x48d2cd43.hashCode() + ", url = " + this.f416918b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43 c17806x48d2cd43;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
        try {
            c17806x48d2cd43 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.C17806x48d2cd43) this.f416917a.get();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdRollHelper", "onDownloaded, exp = " + th6.toString());
        }
        if (c17806x48d2cd43 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAdRollHelper", "realBar released");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
            return;
        }
        java.lang.String str2 = (java.lang.String) c17806x48d2cd43.getTag(com.p314xaae8f345.mm.R.id.n1z);
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? "" : za4.t0.l("adId_mm", str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals(l17)) {
            n74.n1 n1Var = this.f416919c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
            n1Var.c(str, c17806x48d2cd43);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper$1");
    }
}
