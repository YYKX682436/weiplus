package n74;

/* loaded from: classes4.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f416910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f416911e;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, java.util.List list) {
        this.f416910d = c17933xe8d1b226;
        this.f416911e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopPreloadHelper$preload$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f416910d;
        java.util.List list = this.f416911e;
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdMiniShopPreloadHelper", "start preload, snsId = " + ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
                n74.k0.a(n74.k0.f416916a, list, context);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdMiniShopPreloadHelper", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopPreloadHelper$preload$1");
    }
}
