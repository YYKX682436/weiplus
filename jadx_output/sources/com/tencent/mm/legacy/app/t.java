package com.tencent.mm.legacy.app;

@j95.b
/* loaded from: classes12.dex */
public class t extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        boolean z17;
        super.onCreate(context);
        u51.a.f424779p = new oo.a();
        if (com.tencent.mm.sdk.platformtools.x2.p() || !com.tencent.mm.app.v5.a(context).f53869f) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.i.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.SVGInit", "SVG initSVGPreload");
        com.tencent.mm.app.d6 d6Var = new com.tencent.mm.app.d6();
        m95.h hVar = m95.k.f325104a;
        n95.d.f335930a = d6Var;
        m95.k.f325114k = com.tencent.mm.app.e6.f53408a;
        android.app.Application application = com.tencent.mm.app.e6.f53410c;
        android.content.res.Resources resources = com.tencent.mm.app.e6.f53411d;
        m95.k.e(application, com.tencent.mm.app.e6.f53409b);
        if (m95.k.f325115l) {
            n95.d.b("MicroMsg.SVGResourceLoader", "svg loaded, skip this time.", new java.lang.Object[0]);
        } else {
            try {
                try {
                    if (!m95.k.i(application, resources)) {
                        n95.d.b("MicroMsg.SVGResourceLoader", "SVG initSVGPreloadFallback", new java.lang.Object[0]);
                        long nanoTime = java.lang.System.nanoTime();
                        m95.k.j(application);
                        try {
                            m95.k.h(application, resources);
                        } catch (java.lang.ClassNotFoundException e17) {
                            n95.d.c("MicroMsg.SVGResourceLoader", e17, "", new java.lang.Object[0]);
                        }
                        n95.d.b("MicroMsg.SVGResourceLoader", "SVG fallback Register spent %s", java.lang.Long.valueOf((java.lang.System.nanoTime() - nanoTime) / 1000));
                    }
                } catch (java.lang.Throwable th6) {
                    n95.d.b("MicroMsg.SVGResourceLoader", "SVG initSVGPreloadFallback", new java.lang.Object[0]);
                    long nanoTime2 = java.lang.System.nanoTime();
                    m95.k.j(application);
                    try {
                        m95.k.h(application, resources);
                    } catch (java.lang.ClassNotFoundException e18) {
                        n95.d.c("MicroMsg.SVGResourceLoader", e18, "", new java.lang.Object[0]);
                    }
                    n95.d.b("MicroMsg.SVGResourceLoader", "SVG fallback Register spent %s", java.lang.Long.valueOf((java.lang.System.nanoTime() - nanoTime2) / 1000));
                    throw th6;
                }
            } catch (java.lang.StackOverflowError e19) {
                n95.d.c("MicroMsg.SVGResourceLoader", e19, "", new java.lang.Object[0]);
                try {
                    z17 = m95.k.i(application, resources);
                } catch (java.lang.StackOverflowError unused) {
                    n95.d.a("MicroMsg.SVGResourceLoader", "StackOverflowError again.", new java.lang.Object[0]);
                    z17 = false;
                }
                if (!z17) {
                    n95.d.b("MicroMsg.SVGResourceLoader", "SVG initSVGPreloadFallback", new java.lang.Object[0]);
                    long nanoTime3 = java.lang.System.nanoTime();
                    m95.k.j(application);
                    try {
                        m95.k.h(application, resources);
                    } catch (java.lang.ClassNotFoundException e27) {
                        n95.d.c("MicroMsg.SVGResourceLoader", e27, "", new java.lang.Object[0]);
                    }
                    n95.d.b("MicroMsg.SVGResourceLoader", "SVG fallback Register spent %s", java.lang.Long.valueOf((java.lang.System.nanoTime() - nanoTime3) / 1000));
                }
            }
            m95.k.f325115l = true;
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        java.util.ArrayList arrayList = nm.a.f338420u;
        arrayList.add(new long[]{783, 4, currentTimeMillis2});
        arrayList.add(new long[]{783, 5, 1});
        com.tencent.mars.xlog.Log.i("MicroMsg.DefaultBootStep", "SVG newInstance done, spent %s", java.lang.Long.valueOf(currentTimeMillis2));
    }
}
