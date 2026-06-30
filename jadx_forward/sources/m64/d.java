package m64;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f405924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f405925e;

    public d(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f405924d = context;
        this.f405925e = c17933xe8d1b226;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader$preload$1");
        m64.e eVar = m64.e.f405926a;
        android.content.Context context = this.f405924d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f405925e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        try {
            java.lang.String y07 = ca4.z0.y0(c17933xe8d1b226);
            e17 = m54.j.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdVangoghCanvasPreloader", "doPreload, snsId=" + y07 + ", libVersion=" + e17);
        } catch (java.lang.Throwable th6) {
            ca4.q.c("TimelineAdPreloader preloadLiteApp", th6);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65520x18714402(e17, "1.19.1")) {
            n64.a aVar = m64.e.f405927b;
            if (eVar.a(context, aVar.b(c17933xe8d1b226.m70354x74235b3e()))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdVangoghCanvasPreloader", "preload liteApp succ in adXml");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
            } else {
                if (eVar.a(context, aVar.b(c17933xe8d1b226.m70346x10413e67()))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdVangoghCanvasPreloader", "preload liteApp succ in adInfo");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdVangoghCanvasPreloader", "libVersion=" + e17 + " not greater than min=1.19.1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doPreload", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader$preload$1");
    }
}
