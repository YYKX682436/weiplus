package x44;

/* loaded from: classes.dex */
public final class o2 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f533406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f533407b;

    public o2(java.lang.String str, yz5.p pVar) {
        this.f533406a = str;
        this.f533407b = pVar;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdJs.ScanQRCode", "the " + this.f533406a + " download failed!");
        this.f533407b.mo149xb9724478(-1, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdJs.ScanQRCode", "the " + this.f533406a + " download completed, the path is " + str + '!');
        yz5.p pVar = this.f533407b;
        if (str != null) {
            pVar.mo149xb9724478(0, str);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pVar.mo149xb9724478(-1, "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ScanQRCode$download$1");
    }
}
