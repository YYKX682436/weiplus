package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class j0 implements si1.n0 {
    public final int a(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        kotlin.jvm.internal.o.e(lVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.AppBrandComponentWxaShared");
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = yVar.getRuntime();
        k91.z0 E0 = runtime != null ? runtime.E0() : null;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = E0 instanceof com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC ? (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) E0 : null;
        int i17 = appBrandSysConfigWC != null ? appBrandSysConfigWC.D1 : 0;
        return i17 <= 0 ? com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.e(yVar.getRuntime()) ? d85.f0.P.f227177e : d85.f0.N.f227177e : i17;
    }

    public boolean b(android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.l component, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(component, "component");
        int a17 = a(component);
        d85.h0 ij6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(context, str, a17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPermissionDelegateLogic", "isPermissionGranted permission: business:" + a17 + ' ' + str + " ret:" + ij6);
        return ij6 == d85.h0.GRANTED;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.app.Activity r19, com.tencent.mm.plugin.appbrand.jsapi.l r20, java.lang.String r21, si1.m0 r22) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.utils.j0.c(android.app.Activity, com.tencent.mm.plugin.appbrand.jsapi.l, java.lang.String, si1.m0):void");
    }
}
