package l44;

/* loaded from: classes4.dex */
public class c4 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f397605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397606b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397607c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab4.u f397608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f397609e;

    public c4(android.widget.Button button, java.lang.String str, android.content.Context context, ab4.u uVar, int i17) {
        this.f397605a = button;
        this.f397606b = str;
        this.f397607c = context;
        this.f397608d = uVar;
        this.f397609e = i17;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
        android.widget.Button button = this.f397605a;
        button.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("BtnIconUpdateHelper", "onDownloadError, hash = " + button.hashCode() + ", url = " + this.f397606b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
        android.widget.Button button = this.f397605a;
        java.lang.String str2 = (java.lang.String) button.getTag(com.p314xaae8f345.mm.R.id.n1z);
        java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? "" : za4.t0.l("adId", str2);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals(l17)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            l44.f4.d(this.f397607c, this.f397608d, button, str, this.f397609e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper");
            button.hashCode();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.BtnIconUpdateHelper$3");
    }
}
