package com.tencent.kinda.framework.module.base;

/* loaded from: classes9.dex */
public class KindaBaseServiceModule extends com.tencent.kinda.modularize.KindaModule {
    static boolean liteModuleRegisted;

    private void registerLiteAppModules() {
        if (liteModuleRegisted) {
            return;
        }
        liteModuleRegisted = true;
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        com.tencent.mm.plugin.lite.LiteAppCenter.registerModule("WeixinPayService", com.tencent.liteapp.framework.dynamic_module.WeixinPayService.class);
    }

    @Override // com.tencent.kinda.modularize.KindaModule
    public void configModule() {
        registerNativeModule("KContactService", com.tencent.kinda.framework.module.impl.ContactServiceImpl.class);
        registerNativeModule("KCacheService", com.tencent.kinda.framework.module.impl.KindaCacheServiceImpl.class);
        registerNativeModule("KPlatformUIRouter", com.tencent.kinda.framework.module.impl.PlatformUIRouterImpl.class);
        registerNativeModule("KNetworkService", com.tencent.kinda.framework.module.impl.NetworkServiceImpl.class);
        registerNativeModule("IPlatformUtil", com.tencent.kinda.framework.app.KindaPlatformUtil.class);
        registerNativeModule("KLogService", com.tencent.kinda.framework.app.KLogServiceImpl.class);
        registerNativeModule("KDeviceService", com.tencent.kinda.framework.app.KindaDeviceServiceImpl.class);
        registerNativeModule("KUserService", com.tencent.mm.plugin.luckymoney.ui.c.class);
        registerNativeModule("KPayMenuRedDotHelper", com.tencent.kinda.framework.app.KindaPayMenuRedDotHelper.class);
        registerNativeModule("KReportService", com.tencent.kinda.framework.module.impl.ReportServiceImpl.class);
        registerNativeModule("IDeviceFrameDrawLoopCallback", com.tencent.kinda.framework.app.KindaDeviceFrameDrawLoopCallback.class);
        registerNativeModule("KPlatformUIRouter", com.tencent.kinda.framework.module.impl.PlatformUIRouterImpl.class);
        registerNativeModule("KCrtService", com.tencent.kinda.framework.module.impl.KindaCrtServiceImpl.class);
        registerNativeModule("KRealNameService", com.tencent.kinda.framework.app.KindaRealNameServiceImpl.class);
        registerNativeModule("KindaAnimator", com.tencent.kinda.framework.animate.MMKAnimator.class);
        registerNativeModule("KTimerService", com.tencent.kinda.framework.app.KindaTimerService.class);
        registerNativeModule("KindaModalManager", com.tencent.kinda.framework.module.impl.KindaModalManagerImpl.class);
        registerNativeModule("KUUIDService", com.tencent.kinda.framework.module.impl.KindaUUIDService.class);
        registerNativeModule("KFingerprintService", com.tencent.kinda.framework.app.KindaFingerprintImpl.class);
        registerNativeModule("IKindaResult", com.tencent.kinda.framework.module.impl.KindaResultImpl.class);
        registerNativeModule("IUIPageController", com.tencent.kinda.framework.app.UIPageControllerImpl.class);
        registerNativeModule("EventLoopManager", com.tencent.kinda.framework.module.impl.KindaEventLoopManagerImpl.class);
        registerNativeModule("KindaPasswordManager", com.tencent.kinda.framework.app.KindaPasswordManagerImpl.class);
        registerNativeModule("KindaRealNameManager", com.tencent.kinda.framework.app.KindaRealNameManagerImpl.class);
        registerNativeModule("IShakeCheckingManager", com.tencent.kinda.framework.app.KindaShakeCheckingManager.class);
        registerNativeModule("KFileService", com.tencent.kinda.framework.app.KindaFileServiceImpl.class);
        registerNativeModule("KWordingService", com.tencent.kinda.framework.module.impl.KindaWordingServiceImpl.class);
        registerNativeModule("KScanWidget", com.tencent.kinda.framework.module.impl.KindaScanWidgetImpl.class);
        registerNativeModule("KindaWalletMixManager", com.tencent.kinda.framework.module.impl.KindaWalletMixManagerImpl.class);
        registerNativeModule("KJSEvent", com.tencent.kinda.framework.module.impl.KindaJSEvent.class);
        registerNativeModule("KindaOpenBiometricVerifyManager", com.tencent.kinda.framework.app.KindaOpenBiometricVerifyManagerImpl.class);
        registerNativeModule("KindaJumpRemindManager", com.tencent.kinda.framework.app.KindaJumpRemindManagerImpl.class);
        registerNativeModule("KindaTextStatusSetupManager", com.tencent.kinda.framework.app.KindaTextStatusSetupManagerImpl.class);
        registerNativeModule("KindaLocationManager", com.tencent.kinda.framework.app.KindaLocationManagerImpl.class);
        registerNativeModule("KOfflinePayService", com.tencent.kinda.framework.app.KOfflinePayServiceImpl.class);
        registerNativeModule("KHKOfflinePayService", com.tencent.kinda.framework.app.KHKOfflinePayServiceImpl.class);
        registerNativeModule("KWCPayService", com.tencent.kinda.framework.app.KWCPayServiceImpl.class);
        registerNativeModule("KindaPayCardManager", com.tencent.kinda.framework.app.KindaPayCardManagerImpl.class);
        registerNativeModule("KindaFaceRegManager", com.tencent.kinda.framework.app.MMKindaFaceRegManagerImpl.class);
        registerNativeModule("RsaCryptUtil", com.tencent.kinda.framework.module.impl.RsaCryptUtilImpl.class);
        registerNativeModule("KindaFinderRegManager", com.tencent.kinda.framework.app.MMKindaFinderRegManagerImpl.class);
        registerNativeModule("SecureCtrItem", com.tencent.kinda.framework.module.impl.KindaSecureCtrItemImpl.class);
        registerNativeModule("KAddPayCardService", com.tencent.kinda.framework.app.KindaAddPayCardServiceImpl.class);
        registerNativeModule("KindaNotify", com.tencent.kinda.framework.module.impl.KindaNotifyImpl.class);
        registerNativeModule("KUtilityService", com.tencent.kinda.framework.app.KindaUtilityServiceImpl.class);
        registerNativeModule("KindaWebService", com.tencent.kinda.framework.module.impl.KindaWebServiceImpl.class);
        registerNativeModule("KPaySettingsService", com.tencent.kinda.framework.app.KPaySettingsServiceImpl.class);
        registerNativeModule("KThirdPayService", com.tencent.kinda.framework.module.impl.KindaThirdPayService.class);
        registerNativeModule("KHoneyPayService", com.tencent.kinda.framework.module.impl.KindaHoneyPayService.class);
        registerNativeModule("KHKFingerPrintService", com.tencent.kinda.framework.app.KindaHKFingerprintImpl.class);
        registerNativeModule("KWalletLockService", com.tencent.kinda.framework.app.KindaWalletLockService.class);
        registerNativeModule("KTransferPayService", com.tencent.kinda.framework.app.KTransferPayServiceImpl.class);
        registerNativeModule("IKindaLiteUseCaseWrapper", com.tencent.kinda.framework.kindalite.KindaLiteUseCaseWrapper.class);
        registerLiteAppModules();
    }

    @Override // com.tencent.kinda.modularize.KindaModule
    public void onAppCreate() {
    }
}
