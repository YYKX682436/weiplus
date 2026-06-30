package i54;

/* loaded from: classes.dex */
public final class w implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f370361b;

    public w(java.lang.String str, yz5.p pVar) {
        this.f370360a = str;
        this.f370361b = pVar;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$download$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdForm.ScanQR", "the " + this.f370360a + " download failed!");
        this.f370361b.mo149xb9724478(-1, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$download$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$download$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$download$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$download$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdForm.ScanQR", "the " + this.f370360a + " download completed, the path is " + str + '!');
        yz5.p pVar = this.f370361b;
        if (str != null) {
            pVar.mo149xb9724478(0, str);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pVar.mo149xb9724478(-1, "");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiScanQR$download$1");
    }
}
