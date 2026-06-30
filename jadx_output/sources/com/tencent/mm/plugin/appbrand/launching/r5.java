package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class r5 implements com.tencent.mm.plugin.appbrand.launching.s5 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r5 f85103b = new com.tencent.mm.plugin.appbrand.launching.r5();

    public boolean a(boolean z17) {
        if (z17) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wagame_encrypt_wxapkg, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.GetPkgDownloadUrlUnifiedCgiRouter.WECHAT_INSTANCE", "useEncryptPkg for game, retVal[" + fj6 + "] exptVal[" + fj6 + "] defVal[false]");
            return fj6;
        }
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_encrypt_wxapkg, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPkgDownloadUrlUnifiedCgiRouter.WECHAT_INSTANCE", "useEncryptPkg for app, retVal[" + fj7 + "] exptVal[" + fj7 + "] defVal[false]");
        return fj7;
    }
}
