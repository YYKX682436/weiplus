package ed4;

/* loaded from: classes4.dex */
public class w implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f332862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.o0 f332863b;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.o0 o0Var) {
        this.f332863b = o0Var;
        this.f332862a = o0Var.f250931c;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloadError thumb");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloaded thumb, path=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.o0 o0Var = this.f332863b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p pVar = o0Var.f250932d.f250940r;
        java.lang.String str2 = pVar != null ? pVar.f247629h : "";
        java.lang.String str3 = this.f332862a;
        if (str3 == null || !str3.equals(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloaded, url != nowUrl");
        } else if (o0Var.f250930b.M0.getVisibility() == 0) {
            try {
                o0Var.f250930b.M0.setImageBitmap(com.p314xaae8f345.mm.p786x600aa8b.e.c(str));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "onDownloaded thumb exp:" + th6.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4$1");
    }
}
