package l44;

/* loaded from: classes4.dex */
public final class k3 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397751a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f397752b;

    public k3(java.lang.String str, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f397751a = str;
        this.f397752b = qVar;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
        l44.p3.f397832a.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdQrClickHelper", "res " + this.f397751a + "  failed!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
    }

    @Override // za4.e0
    public void c(java.lang.String path) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        ((p3325xe03a0797.p3326xc267989b.r) this.f397752b).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(path));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.helper.AdQrClickHelper$downloadImgWithPath$2$1");
    }
}
