package com.p314xaae8f345.mm.p815xbe0af3c9.app;

@j95.b
/* loaded from: classes12.dex */
public class t extends i95.w {
    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        boolean z17;
        super.mo8845x3e5a77bb(context);
        u51.a.f506312p = new oo.a();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() || !com.p314xaae8f345.mm.app.v5.a(context).f135402f) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SVGInit", "SVG initSVGPreload");
        com.p314xaae8f345.mm.app.d6 d6Var = new com.p314xaae8f345.mm.app.d6();
        m95.h hVar = m95.k.f406637a;
        n95.d.f417463a = d6Var;
        m95.k.f406647k = com.p314xaae8f345.mm.app.e6.f134941a;
        android.app.Application application = com.p314xaae8f345.mm.app.e6.f134943c;
        android.content.res.Resources resources = com.p314xaae8f345.mm.app.e6.f134944d;
        m95.k.e(application, com.p314xaae8f345.mm.app.e6.f134942b);
        if (m95.k.f406648l) {
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
            m95.k.f406648l = true;
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        java.util.ArrayList arrayList = nm.a.f419953u;
        arrayList.add(new long[]{783, 4, currentTimeMillis2});
        arrayList.add(new long[]{783, 5, 1});
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DefaultBootStep", "SVG newInstance done, spent %s", java.lang.Long.valueOf(currentTimeMillis2));
    }
}
