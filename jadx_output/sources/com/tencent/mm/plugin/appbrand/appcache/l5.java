package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class l5 implements java.lang.Runnable {
    public l5(com.tencent.mm.plugin.appbrand.appcache.e5 e5Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.PkgDownloadService", "queueTimeout");
        com.tencent.mm.autogen.mmdata.rpt.AppBrandLegacyBizStruct appBrandLegacyBizStruct = new com.tencent.mm.autogen.mmdata.rpt.AppBrandLegacyBizStruct();
        appBrandLegacyBizStruct.p("queueTimeout");
        appBrandLegacyBizStruct.k();
    }
}
