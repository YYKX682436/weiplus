package m64;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final m64.h f405932a = new m64.h();

    /* renamed from: b, reason: collision with root package name */
    public static final n64.a f405933b;

    static {
        n64.a aVar = new n64.a();
        aVar.e(m64.g.f405931d);
        f405933b = aVar;
    }

    public final boolean a(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        if (!ca4.n0.c(context)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimelineAdExposurePreloader", "activity maybe destroyed");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        return true;
    }
}
