package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class u5 implements wu5.j {
    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "PkgNetworkOpt.triggerPreConnect";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        try {
            try {
                str = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77220r;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PkgNetworkOpt", e17, "triggerPreConnect", new java.lang.Object[0]);
            }
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            com.tencent.mm.plugin.appbrand.appcache.x5.a(str);
        } finally {
            com.tencent.mm.plugin.appbrand.appcache.x5.f76050a = false;
        }
    }
}
