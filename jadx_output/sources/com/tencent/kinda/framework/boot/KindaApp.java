package com.tencent.kinda.framework.boot;

/* loaded from: classes9.dex */
public class KindaApp {
    private static final java.lang.String TAG = "MicroMsg.Kinda.KindaApp";
    private static com.tencent.kinda.framework.boot.KindaApp instance;
    private com.tencent.kinda.modularize.KindaAppModuleManager appModuleManager;
    private com.tencent.kinda.gen.IAppKinda kinda;
    private com.tencent.mm.sdk.platformtools.u3 threadHandler;

    private KindaApp() {
        com.tencent.mars.xlog.Log.i(TAG, "create kinda app");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(782, 30);
        com.tencent.kinda.framework.WxCrossServices.tryLoadLibrary();
        com.tencent.kinda.modularize.KindaAppModuleManager kindaAppModuleManager = new com.tencent.kinda.modularize.KindaAppModuleManager();
        this.appModuleManager = kindaAppModuleManager;
        kindaAppModuleManager.registerModule(new com.tencent.kinda.framework.module.base.KindaBaseViewModule());
        this.appModuleManager.registerModule(new com.tencent.kinda.framework.module.base.KindaBaseServiceModule());
        this.appModuleManager.registerModule(new com.tencent.kinda.framework.module.pay.KindaPayServiceModule());
        this.appModuleManager.initAllModule();
        this.kinda = com.tencent.kinda.gen.NativeAppKinda.getInstance();
    }

    public static com.tencent.kinda.gen.IAppKinda appKinda() {
        return instance().kinda;
    }

    public static com.tencent.kinda.framework.boot.KindaApp instance() {
        if (instance == null) {
            synchronized (com.tencent.kinda.framework.boot.KindaApp.class) {
                if (instance == null) {
                    instance = new com.tencent.kinda.framework.boot.KindaApp();
                }
            }
        }
        return instance;
    }

    public static void reportFatalError(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th6.printStackTrace(new java.io.PrintWriter(stringWriter));
        java.lang.String errorMsg = stringWriter.toString();
        com.tencent.mars.xlog.Log.e(TAG, "reportFatalError stack : " + errorMsg);
        if (errorMsg.length() > 6000) {
            errorMsg = errorMsg.substring(0, 6000);
        }
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "6", "1", "1", errorMsg);
    }

    public void checkIfNeedRequestUserBindqueryWhenUnBindCard(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "checkIfNeedRequestUserBindqueryWhenUnBindCard bindserial : %s", str);
        this.kinda.checkIfNeedRequestUserBindqueryWhenUnBindCard(str);
    }

    public void checkIfNeedUpdateOfflinePayToken() {
        com.tencent.mars.xlog.Log.i(TAG, "checkIfNeedUpdateOfflinePayToken");
        this.kinda.checkIfNeedUpdateOfflinePayToken();
    }

    public void notifyAllUseCases(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mars.xlog.Log.i(TAG, "notifyAllUseCases");
        this.kinda.notifyAllUseCases(iTransmitKvData);
    }

    public void onBackground() {
        com.tencent.mars.xlog.Log.i(TAG, "onBackground");
        this.kinda.applicationEnterBackground();
    }

    public void onCreate() {
        com.tencent.kinda.framework.WxCrossServices.tryLoadLibrary();
        this.appModuleManager.onAppCreate();
    }

    public void onForeground() {
        com.tencent.mars.xlog.Log.i(TAG, "onForeground");
        this.kinda.applicationEnterForeground();
    }

    public void reInitModule() {
        com.tencent.kinda.modularize.KindaAppModuleManager kindaAppModuleManager = this.appModuleManager;
        if (kindaAppModuleManager != null) {
            kindaAppModuleManager.initAllModule();
            this.kinda = com.tencent.kinda.gen.IAppKinda.getInstance();
        }
    }

    public void releaseAppKinda() {
        this.kinda = null;
    }

    public void updateOfflinePayDefaultCard(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i(TAG, "updateOfflinePayDefaultCard, bindserial : %s", str);
        this.kinda.updateOfflinePayDefaultCard(str, str2);
    }

    public void updateOfflinePayTokenFromScene(int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "updateOfflinePayTokenFromScene : %s", java.lang.Integer.valueOf(i17));
        this.kinda.updateOfflinePayTokenWithScene(i17);
    }
}
