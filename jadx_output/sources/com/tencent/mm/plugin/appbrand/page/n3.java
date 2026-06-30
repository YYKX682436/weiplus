package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class n3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f86897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f86898f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86899g;

    public n3(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str, int i17, long j17) {
        this.f86899g = i3Var;
        this.f86896d = str;
        this.f86897e = i17;
        this.f86898f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.g4 g4Var;
        final com.tencent.mm.plugin.appbrand.page.w2 w2Var;
        synchronized (this.f86899g.f86709o) {
            this.f86899g.q();
            final com.tencent.mm.plugin.appbrand.page.w2 currentPage = this.f86899g.getCurrentPage();
            if (currentPage != null && this.f86899g.r(currentPage) != null) {
                int i17 = this.f86897e;
                java.util.Iterator h07 = this.f86899g.h0(false);
                do {
                    g4Var = (com.tencent.mm.plugin.appbrand.page.g4) h07;
                    w2Var = (com.tencent.mm.plugin.appbrand.page.w2) g4Var.next();
                    if (i17 <= 0) {
                        break;
                    } else {
                        i17--;
                    }
                } while (g4Var.hasNext());
                com.tencent.mm.plugin.appbrand.page.a5 E = this.f86899g.E(currentPage, w2Var);
                this.f86899g.i(currentPage, w2Var);
                final com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f86899g;
                final long j17 = this.f86898f;
                final java.lang.String str = this.f86896d;
                i3Var.getClass();
                final li1.a aVar = currentPage.B() && w2Var.B() && currentPage.getCurrentWindowId() == w2Var.getCurrentWindowId() ? new li1.a() : null;
                final com.tencent.mm.plugin.appbrand.page.v5 currentPageView = w2Var.getCurrentPageView();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                w2Var.setIsAnimating(true);
                com.tencent.mm.plugin.appbrand.page.t4 n07 = i3Var.n0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j18 = j17;
                        final com.tencent.mm.plugin.appbrand.page.i3 i3Var2 = com.tencent.mm.plugin.appbrand.page.i3.this;
                        i3Var2.getClass();
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mm.plugin.appbrand.utils.s3.b("MicroMsg.AppBrandPageContainer", "navigateBack, switchToImage cost[%dms]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        currentPageView.b1();
                        com.tencent.mm.plugin.appbrand.page.w2 w2Var2 = w2Var;
                        w2Var2.setIsAnimating(false);
                        com.tencent.mm.plugin.appbrand.page.jb jbVar = i3Var2.f86716v;
                        if (jbVar != null) {
                            int currentWindowId = w2Var2.getCurrentWindowId();
                            int currentComponentId = w2Var2.getCurrentComponentId();
                            boolean equals = str.equals("scene_skyline_back");
                            boolean z19 = currentPage.getCurrentWindowId() == w2Var2.getCurrentWindowId();
                            final java.lang.Runnable[] runnableArr = r10;
                            ((com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) jbVar).g(j18, currentWindowId, currentComponentId, equals, z19, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.tencent.mm.plugin.appbrand.page.i3 i3Var3 = com.tencent.mm.plugin.appbrand.page.i3.this;
                                    i3Var3.getClass();
                                    i3Var3.c0(runnableArr[0]);
                                }
                            });
                        }
                    }
                });
                final java.lang.Runnable[] runnableArr = {i3Var.n0(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        li1.a aVar2 = li1.a.this;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                    }
                })};
                currentPageView.X0(io.flutter.embedding.android.RenderMode.texture, n07, 500L);
                this.f86899g.j0(this.f86898f, w2Var, currentPage, com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK, E, aVar);
                return;
            }
            if (u46.l.c("scene_jsapi_navigate_back", this.f86896d)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageContainer", "navigateBackImpl appId:%s, %s", this.f86899g.getAppId(), jc1.h.f298943a);
            } else {
                com.tencent.mm.plugin.appbrand.x0.g(this.f86899g.f86703f, com.tencent.mm.plugin.appbrand.w0.BACK);
                this.f86899g.f86702e.S();
            }
        }
    }
}
