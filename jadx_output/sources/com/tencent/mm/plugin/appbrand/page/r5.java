package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class r5 {
    public static final void a(com.tencent.mm.plugin.appbrand.page.d5 d5Var) {
        com.tencent.mm.plugin.appbrand.page.n7 N2;
        kotlin.jvm.internal.o.g(d5Var, "<this>");
        java.util.Iterator h07 = d5Var.h0(true);
        while (true) {
            com.tencent.mm.plugin.appbrand.page.g4 g4Var = (com.tencent.mm.plugin.appbrand.page.g4) h07;
            if (!g4Var.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.appbrand.page.w2 w2Var = (com.tencent.mm.plugin.appbrand.page.w2) g4Var.next();
            if (w2Var instanceof ce.h ? true : w2Var instanceof com.tencent.mm.plugin.appbrand.page.s8) {
                w2Var.getCurrentPageView().N0(null);
            } else if (w2Var instanceof com.tencent.mm.plugin.appbrand.page.y1) {
                com.tencent.mm.plugin.appbrand.page.y1 y1Var = (com.tencent.mm.plugin.appbrand.page.y1) w2Var;
                y1Var.getClass();
                java.util.Iterator it = y1Var.f87270x1.values().iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.plugin.appbrand.page.v5) it.next()).N0(null);
                }
            }
        }
        java.util.List<com.tencent.mm.plugin.appbrand.page.v5> preloadedPageView = d5Var.getPreloadedPageView();
        if (preloadedPageView != null) {
            java.util.Iterator<T> it6 = preloadedPageView.iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.appbrand.page.v5) it6.next()).N0(null);
            }
        }
        com.tencent.mm.plugin.appbrand.o6 runtime = d5Var.getRuntime();
        if (runtime == null || (N2 = runtime.N2()) == null) {
            return;
        }
        d5Var.a0(N2);
    }
}
