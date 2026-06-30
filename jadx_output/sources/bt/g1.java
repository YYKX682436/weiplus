package bt;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class})
/* loaded from: classes12.dex */
public class g1 extends i95.w implements com.tencent.mm.plugin.zero.s0 {
    @Override // com.tencent.mm.plugin.zero.s0
    public long T3() {
        throw new java.lang.IllegalStateException("Not Supported");
    }

    @Override // com.tencent.mm.plugin.zero.s0
    public void a(int i17) {
        jx3.f.INSTANCE.a(i17);
    }

    @Override // com.tencent.mm.plugin.zero.s0
    public void i4(int i17, int i18, byte[] bArr, int i19) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_err_type", i17);
        bundle.putInt("key_err_code", i18);
        bundle.putByteArray("key_buffer", bArr);
        bundle.putInt("key_channel", i19);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, bundle, bt.l1.class, null);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        com.tencent.mars.smc.SmcConfig.INSTANCE.updateConfig();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        com.tencent.mars.WeChatMars.loadDependentLibraries();
        com.tencent.mars.xlog.Log.i("MicroMsg.MarsOnSplashService", "mars2 start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.tencent.mars.MarsContext.getContext().getNativeHandle()));
        com.tencent.mars.app.AppManager appManager = new com.tencent.mars.app.AppManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.app.AppManager.class, appManager);
        appManager.setCallback(new com.tencent.mars.mm.AppManagerCallback(com.tencent.mm.sdk.platformtools.x2.f193071a));
        com.tencent.mars.smc.SmcManager smcManager = new com.tencent.mars.smc.SmcManager(com.tencent.mars.MarsContext.getContext());
        com.tencent.mars.MarsContext.getContext().addManager(com.tencent.mars.smc.SmcManager.class, smcManager);
        com.tencent.mm.plugin.report.service.SmcManagerCallback smcManagerCallback = new com.tencent.mm.plugin.report.service.SmcManagerCallback(com.tencent.mm.sdk.platformtools.x2.f193071a);
        smcManagerCallback.setKvReportNotify(com.tencent.mm.app.w7.f53896f);
        smcManager.setCallback(smcManagerCallback);
        com.tencent.mars.xlog.Log.i("MicroMsg.MarsOnSplashService", "mars2 end process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.tencent.mars.MarsContext.getContext().getNativeHandle()));
        try {
            com.tencent.mars.WeChatMars.onCreate();
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).onCreate();
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.WeChatMars.onCreate();
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).onCreate();
            }
        }
        ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).SetDebugFlag(kx3.a.f313280a);
        ((com.tencent.mars.smc.SmcManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.smc.SmcManager.class)).setInitiated(true);
        com.tencent.mars.cdn.CronetLogic.setCallback(new com.tencent.mars.cdn.CronetLogicCallBack());
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(bt.g1.class.getClassLoader() == null ? -1 : bt.g1.class.getClassLoader().hashCode());
        objArr[1] = java.lang.Integer.valueOf(java.lang.Thread.currentThread().getContextClassLoader() == null ? -1 : java.lang.Thread.currentThread().getContextClassLoader().hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.MarsOnSplashService", "SmcLogic, class loader %s, %s", objArr);
        if (!com.tencent.paymars.WeChatMars.abtestOpen()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MarsOnSplashService", "clicfg_enable_paymars_android:false");
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MarsOnSplashService", "clicfg_enable_paymars_android:true");
        com.tencent.paymars.WeChatMars.loadDependentLibraries();
        com.tencent.mars.xlog.Log.i("MicroMsg.MarsOnSplashService", "paymars start process:%s context:%d", bm5.f1.a(), java.lang.Long.valueOf(com.tencent.paymars.MarsContext.getContext().getNativeHandle()));
        com.tencent.paymars.app.AppManager appManager2 = new com.tencent.paymars.app.AppManager(com.tencent.paymars.MarsContext.getContext());
        com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.app.AppManager.class, appManager2);
        appManager2.setCallback(new com.tencent.paymars.mm.AppManagerCallback(com.tencent.mm.sdk.platformtools.x2.f193071a));
        com.tencent.paymars.smc.SmcManager smcManager2 = new com.tencent.paymars.smc.SmcManager(com.tencent.paymars.MarsContext.getContext());
        com.tencent.paymars.MarsContext.getContext().addManager(com.tencent.paymars.smc.SmcManager.class, smcManager2);
        com.tencent.mm.plugin.report.service.PaySmcManagerCallback paySmcManagerCallback = new com.tencent.mm.plugin.report.service.PaySmcManagerCallback(com.tencent.mm.sdk.platformtools.x2.f193071a);
        paySmcManagerCallback.setKvReportNotify(com.tencent.mm.app.w7.f53896f);
        smcManager2.setCallback(paySmcManagerCallback);
        try {
            com.tencent.paymars.WeChatMars.onCreate();
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.smc.SmcManager.class)).onCreate();
            }
        } catch (java.lang.Throwable unused2) {
            com.tencent.paymars.WeChatMars.onCreate();
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.smc.SmcManager.class)).onCreate();
            }
        }
        ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.smc.SmcManager.class)).SetDebugFlag(kx3.a.f313280a);
        ((com.tencent.paymars.smc.SmcManager) com.tencent.paymars.MarsContext.getManager(com.tencent.paymars.smc.SmcManager.class)).setInitiated(true);
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = java.lang.Integer.valueOf(bt.g1.class.getClassLoader() == null ? -1 : bt.g1.class.getClassLoader().hashCode());
        objArr2[1] = java.lang.Integer.valueOf(java.lang.Thread.currentThread().getContextClassLoader() != null ? java.lang.Thread.currentThread().getContextClassLoader().hashCode() : -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.MarsOnSplashService", "paymars SmcLogic, class loader %s, %s", objArr2);
    }

    @Override // com.tencent.mm.plugin.zero.s0
    public void x1() {
        com.tencent.mm.modelbase.a.b();
    }
}
