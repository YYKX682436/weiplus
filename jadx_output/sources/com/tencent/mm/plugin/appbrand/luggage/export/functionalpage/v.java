package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/v;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfigWC;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class v implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalConfigAssembler", "invoke GetSycConfigTask with " + iPCString);
        try {
            kotlin.jvm.internal.o.d(iPCString);
            if (!gm0.j1.b().m()) {
                return null;
            }
            k91.v5 k17 = com.tencent.mm.plugin.appbrand.app.r9.ij().k1(iPCString.f68406d, new java.lang.String[0]);
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC c17 = k17 != null ? k91.k4.c(k17) : null;
            if (c17 == null) {
                return null;
            }
            c17.Y = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b();
            return c17;
        } catch (java.lang.Exception unused) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return null;
        }
    }
}
