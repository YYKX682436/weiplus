package com.tencent.mm.plugin.appbrand.extendplugin;

/* loaded from: classes7.dex */
public abstract class f {
    public static final boolean a(sf.f fVar) {
        u81.h hVar;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.m();
        u81.b bVar = null;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = m17 instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) m17 : null;
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandInvokeContextExt", "isPageInForeground, pageView is null");
            return false;
        }
        boolean l27 = v5Var.l2();
        u81.b bVar2 = u81.b.FOREGROUND;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = v5Var.getRuntime();
        if (runtime != null && (hVar = runtime.N) != null) {
            bVar = hVar.b();
        }
        boolean z17 = bVar2 == bVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInvokeContextExt", "isPageInForeground, isPageInForeground: " + l27 + ", isRuntimeInForeground: " + z17);
        return l27 && z17;
    }
}
