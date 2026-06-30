package m64;

/* loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f405928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f405929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f405930f;

    public f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        this.f405928d = context;
        this.f405929e = c17933xe8d1b226;
        this.f405930f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        boolean a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader$doClickInfoPreload$1");
        android.content.Context context = this.f405928d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f405929e;
        int i17 = this.f405930f;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m64.h hVar = m64.h.f405932a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
            a17 = hVar.a(context);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isContextDestroyed", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader$doClickInfoPreload$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMDetector$p", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMDetector$p", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        n64.a aVar = m64.h.f405933b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMDetector$p", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMDetector$p", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader");
        java.util.List r17 = kz5.d0.r(kz5.z.I(new java.util.List[]{aVar.b(c17933xe8d1b226.m70354x74235b3e()), aVar.b(c17933xe8d1b226.m70346x10413e67())}));
        n74.u0 u0Var = n74.u0.f416970a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        } else {
            if (i17 == 0) {
                ((ku5.t0) ku5.t0.f394148d).g(new n74.t0(c17933xe8d1b226, r17, 1045));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopPreloadHelper");
        ((ku5.t0) ku5.t0.f394148d).g(new n74.j0(c17933xe8d1b226, r17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMiniShopPreloadHelper");
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("TimelineAdExposurePreloader", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.preload.TimelineAdExposurePreloader$doClickInfoPreload$1");
    }
}
