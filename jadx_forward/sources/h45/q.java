package h45;

/* loaded from: classes9.dex */
public interface q extends i95.m {
    /* renamed from: TenPaySDKABTestKindaEnable */
    boolean mo24754xf742bfee();

    /* renamed from: canOpenKindaCashier */
    boolean mo24755x47b8ea10(android.content.Context context);

    /* renamed from: checkIfNeedRequestUserBindqueryWhenUnBindCard */
    void mo24756xcebbfc8c(java.lang.String str);

    /* renamed from: checkIfNeedUpdateOfflinePayToken */
    void mo24757x68e57170();

    /* renamed from: ensureLibraryLoaded */
    void mo24758xc71a7102();

    /* renamed from: getAccountLoginSuccessTime */
    long mo24759x4aecb65e();

    /* renamed from: getAppColdStartTime */
    long mo24760x3928d6a0();

    /* renamed from: getColorByMode */
    long mo24761xf794c2a7(long j17, long j18);

    /* renamed from: getCrossActivity */
    android.app.Activity mo24762xef326bb9();

    /* renamed from: getDeeplinkUrlInMemory */
    java.lang.String mo24763xa804d319();

    /* renamed from: getFirstPreloadTime */
    long mo24764xd641b71c();

    /* renamed from: getKindaLiteUseCaseSessionId */
    java.lang.String mo24765x3b648fbf();

    /* renamed from: getLastEnterForegroundTime */
    long mo24766xca84c8fc();

    /* renamed from: getOverseaFunctionUrlWithToken */
    java.lang.String mo24767xd9be2a81(java.lang.String str);

    /* renamed from: handleHKHongbaoRouteInfoFromUriSpan */
    boolean mo24768x94c527ba(java.lang.String str);

    /* renamed from: handleHKNativeCashier */
    void mo24769x9a395b41(android.content.Context context, android.os.Bundle bundle, h45.k kVar);

    /* renamed from: handleHKOfflineNewXmlMsg */
    void mo24770xe430ce52(java.lang.String str);

    /* renamed from: handleHKWalletScanCodeRoute */
    void mo24771x42240bbb(java.lang.String str, int i17, h45.i iVar);

    /* renamed from: isDeviceSupportNFC */
    boolean mo24772x3494ab9c();

    /* renamed from: isEnableLiteAppUseCase */
    boolean mo24773x6a93e3f1(java.lang.String str, java.lang.Object obj);

    /* renamed from: isKindaActivity */
    boolean mo24774x8fe94872(android.app.Activity activity);

    /* renamed from: isKindaEnabled */
    boolean mo24775x5d907d7e();

    /* renamed from: isKindaLitePaying */
    boolean mo24776x1e9bb12b();

    /* renamed from: isOfflineReady */
    boolean mo24777x653c03ca();

    /* renamed from: isSwitch2InWxAppPay */
    boolean mo24778x3c5fbb61(java.lang.String str);

    /* renamed from: isUseCaseAlive */
    boolean mo24779x384d4000(java.lang.String str);

    /* renamed from: markFirstPreloadTimeIfNeeded */
    void mo24780x95138e5();

    /* renamed from: notifyAddPaycardUsecase */
    void mo24781x29b0a117(android.os.Bundle bundle, java.lang.String str, h45.i iVar);

    /* renamed from: notifyAllLiteAppForPay */
    void mo24782x854b4da(java.lang.String str, java.util.Map map);

    /* renamed from: notifyAllUseCase */
    void mo24783x40cf7c9f(java.lang.Object obj);

    /* renamed from: notifyKindaOnManualAuthOk */
    void mo24784xd8bbbb2d();

    /* renamed from: notifyRealnameCancel */
    void mo24785x199d1cac();

    /* renamed from: notifyRealnameEnd */
    void mo24786xf79697e9();

    /* renamed from: notifyUploadCardSuccess */
    void mo24788x8ddb4dc9();

    /* renamed from: notifyWalletPageRefresh */
    void mo24789xcfbaeb4a();

    /* renamed from: parseHKHongbaoRouteInfoData */
    byte[] mo24791x3ecda1c7(java.lang.String str, java.lang.String str2);

    /* renamed from: preloadKindalite */
    void mo24792x132fe572();

    /* renamed from: registerLiteAppModuleEventForPay */
    int mo24793x32c55bbd(java.lang.String str, h45.m mVar);

    /* renamed from: requestHKCashierFromLite */
    void mo24794xd0977929(org.json.JSONObject jSONObject, h45.j jVar);

    /* renamed from: requestHKCashierNotify */
    void mo24795xebe1713a(android.content.Context context, java.lang.String str);

    /* renamed from: saveDeeplinkUrlInMemory */
    void mo24796x18d70992(java.lang.String str);

    /* renamed from: setCurrentSeesionUserName */
    void mo24797x6bdee7(java.lang.String str);

    /* renamed from: setOverseaUrlTokens */
    void mo24798xfeb18fb0(java.lang.String str, java.lang.String str2);

    /* renamed from: shouldHandleHKWalletCGPUrl */
    boolean mo24799x802b81ba(java.lang.String str);

    /* renamed from: startBindCardUseCase */
    void mo24800xa4a1f2e8(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startFaceCheckUseCase */
    void mo24801xcb599eae(java.lang.String str, android.content.Intent intent, h45.i iVar);

    /* renamed from: startFastBindUseCase */
    void mo24802xdd1fdf9c(java.lang.String str, int i17, java.lang.Runnable runnable);

    /* renamed from: startGetEncryptHKPasswd */
    void mo24803x96fa54b2(java.lang.String str, h45.i iVar);

    /* renamed from: startHKOfflinePrePay */
    void mo24804x3b8ef1e3(android.content.Context context, int i17);

    /* renamed from: startHKOfflinePrePayFromJsApi */
    void mo24805x1fe7d3e4(android.content.Context context, java.lang.String str);

    /* renamed from: startInWxAppPayUseCase */
    void mo24806xf00c9308(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startInWxAppPayUseCase */
    void mo24807xf00c9308(h45.l lVar, android.os.Bundle bundle);

    /* renamed from: startJSApiWCPaySecurityCrosscut */
    void mo24808x12ed9e2f(java.util.Map map);

    /* renamed from: startJsApiComponentUseCase */
    void mo24809x8c9a7089(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62, com.p314xaae8f345.mm.ui.da daVar, int i17);

    /* renamed from: startKindaWalletLockVerify */
    void mo24810x6f1c7888(android.content.Intent intent, int i17, h45.i iVar);

    /* renamed from: startListen */
    void mo24811x84386cc9(java.lang.String str, h45.n nVar);

    /* renamed from: startLqtDetailUseCaseInMMProcess */
    boolean mo24812x391b2a71(android.content.Context context);

    /* renamed from: startLqtDetailUseCaseInOtherProcess */
    boolean mo24813xfe71785d();

    /* renamed from: startLqtDetailUseCaseWithBalanceInMMProcess */
    boolean mo24814xf7953c6d(android.content.Context context, long j17);

    /* renamed from: startLqtFetchUseCase */
    boolean mo24815xbdb881aa(android.content.Context context, android.content.Intent intent, h45.i iVar);

    /* renamed from: startLqtFixedDepositMakePlanUseCase */
    void mo24817xf6e2c929(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startLqtFixedDepositPlanListUseCase */
    void mo24818x58c4fdf9(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startLqtSaveUseCase */
    boolean mo24819x8648fb0d(android.content.Context context, android.content.Intent intent, h45.i iVar);

    /* renamed from: startModifyPwdUseCase */
    void mo24820x20e40836(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startOfflinePay */
    void mo24821xdea349c7(android.content.Context context, java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: startOfflinePrePay */
    void mo24822x9cee3d86(android.content.Context context, int i17, int i18, int i19, java.util.Map map, boolean z17, java.lang.String str, h45.i iVar);

    /* renamed from: startOverseaWalletSuccPageUseCase */
    boolean mo24823x64e17034(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startPatternLockUseCase */
    void mo24824x2e7223fe(android.content.Intent intent, boolean z17, h45.i iVar);

    /* renamed from: startPayIBGJsGetSuccPageUseCase */
    boolean mo24825x39b1d2e1(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startPaySecurityUseCase */
    void mo24826x2446a031(int i17, h45.i iVar);

    /* renamed from: startQrcodeCollectionSettingUseCase */
    void mo24827x2fbc8dd5(android.content.Intent intent, h45.i iVar);

    /* renamed from: startResetPwdUseCase */
    void mo24828x975e1547(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startResetPwdUseCaseFromJsApi */
    boolean mo24829x14204100(android.content.Intent intent, h45.i iVar);

    /* renamed from: startSNSPay */
    void mo24830x8e9ecb12(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56);

    /* renamed from: startScanQRCodePay */
    void mo24831x2a828efb(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startTeenagerPay */
    void mo24832x725d5279(android.content.Context context, byte[] bArr, h45.i iVar);

    /* renamed from: startTeenagerPayGetDetail */
    void mo24833x7028c0ce(android.content.Context context, h45.o oVar);

    /* renamed from: startTouchLockUseCase */
    void mo24834x6e6d756f(android.content.Intent intent, boolean z17, h45.i iVar);

    /* renamed from: startUiTest */
    void mo24835x9385bc48(java.lang.String str);

    /* renamed from: startUniPcPay */
    void mo24836xf42d0927(android.os.Bundle bundle, h45.i iVar);

    /* renamed from: startUseCase */
    void mo24837xef221a95(java.lang.String str, java.lang.Object obj, java.lang.Object obj2);

    /* renamed from: startWalletBalanceEntryUseCase */
    boolean mo24838x4e268286(android.content.Context context);

    /* renamed from: startWalletBalanceFetchPageUseCase */
    void mo24839x9afc1e2f(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startWalletBalanceFetchUseCase */
    void mo24840x83d7633e(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startWalletBalanceRechargeUIUseCase */
    void mo24841xd6f21ffb(android.content.Context context);

    /* renamed from: startWalletBalanceSaveUseCase */
    void mo24842xcebd96f9(android.content.Context context, android.os.Bundle bundle);

    /* renamed from: startWalletLockSettingUseCase */
    void mo24843xf99bd94d(android.content.Context context, android.content.Intent intent, h45.i iVar);

    /* renamed from: startWalletSecuritySetting */
    void mo24844x9e1fd675(android.content.Context context, android.content.Intent intent);

    /* renamed from: startWeBankLoanPay */
    void mo24845x51356acc(android.content.Context context, java.lang.String str, java.lang.String str2, h45.p pVar);

    /* renamed from: startWxpayAppPay */
    void mo24846x2057ce0c(android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: startWxpayH5Pay */
    void mo24847xcfc610b6(android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: startWxpayJsApiPay */
    void mo24848x60cc00dc(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62, com.p314xaae8f345.mm.ui.da daVar, int i17);

    /* renamed from: startWxpayQueryCashierPay */
    void mo24849x2784dc28(java.lang.String str, int i17, int i18);

    /* renamed from: stopListen */
    void mo24850xa30a7869(java.lang.String str);

    /* renamed from: tryStartTransferToBankDetailUseCase */
    boolean mo24851x287b17dd(java.lang.String str, h45.i iVar);

    /* renamed from: tryStartTransferToBankUseCase */
    boolean mo24852xdf2d02ae(java.lang.String str, h45.i iVar);

    /* renamed from: unregisterLiteAppModuleEventForPay */
    void mo24853x34fcc656(java.lang.String str, int i17);

    /* renamed from: updateLocationCacheIfNeed */
    void mo24854x32141af7(float f17, float f18, long j17, java.lang.String str, int i17);

    /* renamed from: updateOfflinePayDefaultCard */
    void mo24855x361c2aa3(java.lang.String str, java.lang.String str2);

    /* renamed from: updateOfflinePayTokenFromScene */
    void mo24856x6b373617(int i17);
}
