package dc4;

/* loaded from: classes4.dex */
public class p0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.q0 f310341a;

    public p0(dc4.q0 q0Var) {
        this.f310341a = q0Var;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDownloadError thumb");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDownloaded thumb, path=" + str);
        dc4.q0 q0Var = this.f310341a;
        if (dc4.v0.l(q0Var.f310344c).getVisibility() == 0) {
            try {
                dc4.v0.l(q0Var.f310344c).setImageBitmap(com.p314xaae8f345.mm.p786x600aa8b.e.c(str));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "onDownloaded thumb exp:" + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$1$1");
    }
}
