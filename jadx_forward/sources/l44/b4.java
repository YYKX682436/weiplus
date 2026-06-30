package l44;

/* loaded from: classes4.dex */
public class b4 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f397588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397590c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab4.u f397591d;

    public b4(android.widget.Button button, java.lang.String str, android.content.Context context, ab4.u uVar) {
        this.f397588a = button;
        this.f397589b = str;
        this.f397590c = context;
        this.f397591d = uVar;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
        android.widget.Button button = this.f397588a;
        button.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", "onDownloadError, hash = " + button.hashCode() + ", url = " + this.f397589b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.widget.Button button = this.f397588a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
        try {
            java.lang.String str2 = (java.lang.String) button.getTag(com.p314xaae8f345.mm.R.id.n1z);
            java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? "" : za4.t0.l("adId", str2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals(l17)) {
                android.content.Context context = this.f397590c;
                ab4.u uVar = this.f397591d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                l44.f4.c(context, uVar, button, str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
                button.hashCode();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", "onDownloaded, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$2");
    }
}
