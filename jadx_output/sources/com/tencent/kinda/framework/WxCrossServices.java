package com.tencent.kinda.framework;

@j95.b
/* loaded from: classes9.dex */
public class WxCrossServices extends i95.w implements h45.q, wo3.s {
    private static final java.lang.String OFFLINE_FINISH_KEY = "Offline.shouldFinishTransparentUI";
    public static final int REPORT_IDKEY = 1004;
    private static final java.lang.String SINGLE_BYTE_CHARSET_FOR_SAVE = "ISO-8859-1";
    public static final java.lang.String TAG = "MicroMsg.WxCrossServices";
    private static final java.lang.String TAG_SCAN_QR_CODE_PAY = "tag_scan_qrcode_pay";
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppActiveEvent> appListener;
    com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryEvent;
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent> jsApiOfflineUserBindQueryListener;
    private float lastLat;
    private float lastLng;
    private com.tencent.mm.ui.widget.dialog.u3 mDialogForScanPay;
    private com.tencent.mm.network.s0 netListener;
    private i11.c onLocationGet;
    private com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletLockProtectEvent> walletLockListener;
    public static com.tencent.kinda.framework.WxCrossServices.MaybeCrashReport report = new com.tencent.kinda.framework.WxCrossServices.MaybeCrashReport();
    public static java.lang.String currentSessionUserName = "";
    private boolean hasUpdateNfc = false;
    private java.lang.String deeplinkUrl = "";
    public java.util.HashMap<java.lang.String, java.lang.String> overseaWalletRequestInfo = new java.util.HashMap<>();
    private com.tencent.kinda.framework.kindalite.KindaLiteMgr kindaLiteMgr = new com.tencent.kinda.framework.kindalite.KindaLiteMgr();
    private long firstPreloadTime = 0;
    private long accountLoginSuccessTime = 0;
    private long lastEnterForegroundTime = 0;
    private boolean mInitFlag = false;

    /* renamed from: com.tencent.kinda.framework.WxCrossServices$15, reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass15 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent> {
        public AnonymousClass15(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 1878810586;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent) {
            if (!com.tencent.kinda.framework.WxCrossServices.this.isUseCaseAlive("offline")) {
                return false;
            }
            com.tencent.kinda.framework.WxCrossServices.this.jsApiOfflineUserBindQueryEvent = jsApiOfflineUserBindQueryResultCallBackEvent;
            am.uh uhVar = jsApiOfflineUserBindQueryResultCallBackEvent.f54445g;
            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "on JsApiOfflineUserBindQueryResultCallBackEvent callback，appid: %s, package: %s", uhVar.f8085a, uhVar.f8090f);
            am.uh uhVar2 = jsApiOfflineUserBindQueryResultCallBackEvent.f54445g;
            ss4.d dVar = new ss4.d(uhVar2.f8085a, uhVar2.f8089e, uhVar2.f8088d, uhVar2.f8090f, uhVar2.f8092h, uhVar2.f8091g, 23, uhVar2.f8086b, uhVar2.f8087c, com.tencent.mm.plugin.appbrand.jsapi.m8.NAME, 1137);
            gm0.j1.i();
            gm0.j1.n().f273288b.a(580, new com.tencent.mm.modelbase.u0() { // from class: com.tencent.kinda.framework.WxCrossServices.15.1
                @Override // com.tencent.mm.modelbase.u0
                public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
                    if (m1Var instanceof ss4.d) {
                        if (i17 == 0 && i18 == 0) {
                            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "onScene end NetSceneCheckPayJsapi ok");
                            if (com.tencent.kinda.framework.WxCrossServices.this.jsApiOfflineUserBindQueryEvent != null) {
                                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                                create.putString("package", com.tencent.kinda.framework.WxCrossServices.this.jsApiOfflineUserBindQueryEvent.f54445g.f8090f);
                                create.putString("func_name", "offline_request_bindquery");
                                create.putJSEvent("JSEvent", new com.tencent.kinda.gen.KJSEvent() { // from class: com.tencent.kinda.framework.WxCrossServices.15.1.1
                                    @Override // com.tencent.kinda.gen.KJSEvent
                                    public void kindaCloseWebViewImpl(boolean z17, com.tencent.kinda.gen.VoidCallback voidCallback) {
                                    }

                                    @Override // com.tencent.kinda.gen.KJSEvent
                                    public void kindaEndWithResult(java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
                                        com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent2 = com.tencent.kinda.framework.WxCrossServices.this.jsApiOfflineUserBindQueryEvent;
                                        if (jsApiOfflineUserBindQueryResultCallBackEvent2 != null) {
                                            jsApiOfflineUserBindQueryResultCallBackEvent2.f54446h.f8196a = str2;
                                            ((com.tencent.mm.plugin.appbrand.jsapi.k8) jsApiOfflineUserBindQueryResultCallBackEvent2.f54445g.f8096l).run();
                                            com.tencent.kinda.framework.WxCrossServices.this.jsApiOfflineUserBindQueryEvent = null;
                                        }
                                    }

                                    @Override // com.tencent.kinda.gen.KJSEvent
                                    public com.tencent.kinda.gen.KindaJSEventType kindaGetType() {
                                        return com.tencent.kinda.gen.KindaJSEventType.TINYAPP;
                                    }
                                });
                                com.tencent.kinda.framework.WxCrossServices.this.notifyAllUseCase(create);
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "onScene end NetSceneCheckPayJsapi fail");
                            com.tencent.mm.autogen.events.JsApiOfflineUserBindQueryResultCallBackEvent jsApiOfflineUserBindQueryResultCallBackEvent2 = com.tencent.kinda.framework.WxCrossServices.this.jsApiOfflineUserBindQueryEvent;
                            if (jsApiOfflineUserBindQueryResultCallBackEvent2 != null) {
                                jsApiOfflineUserBindQueryResultCallBackEvent2.f54446h.f8196a = "fail:NetSceneCheckPayJsapi";
                                ((com.tencent.mm.plugin.appbrand.jsapi.k8) jsApiOfflineUserBindQueryResultCallBackEvent2.f54445g.f8096l).run();
                                com.tencent.kinda.framework.WxCrossServices.this.jsApiOfflineUserBindQueryEvent = null;
                            }
                        }
                        gm0.j1.i();
                        gm0.j1.n().f273288b.q(580, this);
                    }
                }
            });
            gm0.j1.i();
            gm0.j1.n().f273288b.g(dVar);
            return false;
        }
    }

    /* loaded from: classes9.dex */
    public static class MaybeCrashReport {
        public void judgeReport() {
            long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTER_PAY_TIME_LONG_SYNC, 0L)).longValue();
            if (longValue > 0) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20560, java.lang.Integer.valueOf(((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTER_PAY_SCENE_INT_SYNC, 0)).intValue()), java.lang.Long.valueOf(longValue));
            }
            reset();
        }

        public void markEnterPay(int i17) {
            ((vc.z) i95.n0.c(vc.z.class)).requireAccountInitialized();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTER_PAY_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTER_PAY_SCENE_INT_SYNC, java.lang.Integer.valueOf(i17));
        }

        public void reset() {
            ((vc.z) i95.n0.c(vc.z.class)).requireAccountInitialized();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTER_PAY_TIME_LONG_SYNC, 0L);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTER_PAY_SCENE_INT_SYNC, 0);
        }
    }

    static {
        com.tencent.kinda.framework.widget.tools.KindaContext.initStack();
    }

    public WxCrossServices() {
        com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.appListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppActiveEvent>(a0Var) { // from class: com.tencent.kinda.framework.WxCrossServices.12
            {
                this.__eventId = 2123042947;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(final com.tencent.mm.autogen.events.AppActiveEvent appActiveEvent) {
                if (appActiveEvent == null || appActiveEvent.f53977g == null) {
                    return false;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.WxCrossServices.12.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!appActiveEvent.f53977g.f7684a) {
                            com.tencent.kinda.framework.boot.KindaApp.appKinda().applicationEnterBackground();
                            com.tencent.kinda.framework.WxCrossServices.report.reset();
                        } else {
                            com.tencent.kinda.framework.WxCrossServices.this.lastEnterForegroundTime = java.lang.System.currentTimeMillis();
                            com.tencent.kinda.framework.boot.KindaApp.appKinda().applicationEnterForeground();
                        }
                    }
                });
                return false;
            }
        };
        this.netListener = new com.tencent.mm.network.r0() { // from class: com.tencent.kinda.framework.WxCrossServices.13
            @Override // com.tencent.mm.network.s0
            public void onNetworkChange(int i17) {
                com.tencent.mm.wallet_core.b.a().getClass();
                if (com.tencent.kinda.framework.WxCrossServices.this.mInitFlag && com.tencent.kinda.framework.boot.KindaApp.appKinda().isInAnyUseCase()) {
                    com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
                        create.putString("type", "NON_NETWORK");
                    } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
                        create.putString("type", "WIFI");
                        com.tencent.mm.sdk.platformtools.i0 i0Var = com.tencent.mm.sdk.platformtools.v0.f193027a;
                        java.lang.String j17 = i0Var.j(false);
                        java.lang.String f17 = i0Var.f(false);
                        if (j17 != null && f17 != null) {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID, j17);
                            hashMap.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_BSSID, f17);
                            r45.r1 a17 = at4.g0.a(hashMap);
                            create.putString("info", a17.f384414n);
                            create.putString("info_key", a17.f384415o);
                        }
                    } else {
                        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
                            create.putString("type", "4G");
                        } else if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
                            create.putString("type", "3G");
                        } else if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
                            create.putString("type", "2G");
                        } else {
                            create.putString("type", "UNKNOW");
                        }
                        java.util.List<com.tencent.mars.comm.NetStatusUtil.CellInfo> cellInfoList = com.tencent.mars.comm.NetStatusUtil.getCellInfoList(context);
                        if (cellInfoList.size() > 0) {
                            com.tencent.mars.comm.NetStatusUtil.CellInfo cellInfo = cellInfoList.get(0);
                            java.lang.String str = cellInfo.cellid;
                            java.lang.String str2 = cellInfo.mcc;
                            java.lang.String str3 = cellInfo.mnc;
                            if (str != null && str2 != null && str3 != null) {
                                java.util.HashMap hashMap2 = new java.util.HashMap();
                                hashMap2.put("cellid", str);
                                hashMap2.put("mcc", str2);
                                hashMap2.put("mnc", str3);
                                r45.r1 a18 = at4.g0.a(hashMap2);
                                create.putString("info", a18.f384414n);
                                create.putString("info_key", a18.f384415o);
                            }
                        }
                    }
                    com.tencent.kinda.framework.boot.KindaApp.appKinda().networkChange(create);
                }
            }
        };
        this.walletLockListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletLockProtectEvent>(a0Var) { // from class: com.tencent.kinda.framework.WxCrossServices.14
            {
                this.__eventId = 1842411039;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletLockProtectEvent walletLockProtectEvent) {
                if (walletLockProtectEvent.f54960g.f7392a != 5) {
                    return false;
                }
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                create.putBool("check_wallet_lock_cancel", true);
                com.tencent.kinda.framework.WxCrossServices.this.notifyAllUseCase(create);
                return false;
            }
        };
        this.jsApiOfflineUserBindQueryEvent = null;
        this.jsApiOfflineUserBindQueryListener = new com.tencent.kinda.framework.WxCrossServices.AnonymousClass15(a0Var);
    }

    private boolean checkSnsPayLiteAppMinVersion() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_kinda_sns_pay_min_liteapp_version_android, "", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            com.tencent.mars.xlog.Log.i(TAG, "checkSnsPayLiteAppMinVersion version is empty, return false");
            return false;
        }
        com.tencent.liteapp.storage.WxaLiteAppInfo Bj = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(com.tencent.kinda.framework.kindalite.KindaLiteDef.WX_PAY_CASHIER_LITE_APP_ID);
        if (Bj == null || com.tencent.mm.sdk.platformtools.t8.K0(Bj.version)) {
            com.tencent.mars.xlog.Log.i(TAG, "checkSnsPayLiteAppMinVersion liteAppInfo is null or version is empty, return false");
            return false;
        }
        java.lang.String str = Bj.version;
        com.tencent.mars.xlog.Log.i(TAG, "checkSnsPayLiteAppMinVersion currentVersion: " + str + ", baseVersion: " + Zi);
        try {
            java.lang.String[] split = Zi.split("\\.");
            java.lang.String[] split2 = str.split("\\.");
            int max = java.lang.Math.max(split.length, split2.length);
            int i17 = 0;
            while (i17 < max) {
                int parseInt = i17 < split.length ? java.lang.Integer.parseInt(split[i17].trim()) : 0;
                int parseInt2 = i17 < split2.length ? java.lang.Integer.parseInt(split2[i17].trim()) : 0;
                if (parseInt2 > parseInt) {
                    return true;
                }
                if (parseInt2 < parseInt) {
                    return false;
                }
                i17++;
            }
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private void fillOpeimId(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        if (com.tencent.mm.storage.z3.m4(currentSessionUserName) || com.tencent.mm.storage.z3.p4(currentSessionUserName)) {
            iTransmitKvData.putString("ww_user_name", currentSessionUserName);
        } else if (c01.e2.R(currentSessionUserName)) {
            iTransmitKvData.putString("imunion_chat_room_name", currentSessionUserName);
        }
    }

    private java.lang.String getPrepayIdFromPackage(java.lang.String str) {
        int indexOf;
        if (str == null || str.isEmpty() || (indexOf = str.indexOf("prepay_id=")) == -1) {
            return null;
        }
        java.lang.String substring = str.substring(indexOf + 10);
        if (substring.isEmpty()) {
            return null;
        }
        int indexOf2 = substring.indexOf("&");
        return indexOf2 == -1 ? substring : substring.substring(0, indexOf2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWalletLockKindaCallBack(int i17, android.content.Intent intent, h45.i iVar) {
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("retCode", i17);
        if (intent != null) {
            intent2.putExtra("page_intent", intent);
        }
        if (iVar != null) {
            iVar.onKindaBusinessCallback(intent2);
        }
    }

    private void initIfNeed() {
        tryLoadLibrary();
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i(TAG, "IFingerPrintMgr is not null");
            aVar.af();
        }
        if (!this.mInitFlag) {
            this.appListener.alive();
            gm0.j1.n().a(this.netListener);
            com.tencent.kinda.framework.boot.KindaApp.instance().onCreate();
            this.mInitFlag = true;
        }
        com.tencent.kinda.framework.widget.tools.ActivityController.resetFlag();
    }

    private boolean isCloseAllLiteAppUseCase() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_close_all_android, false);
    }

    private boolean isEnableLiteAppSnsPayByPayScene(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        boolean z17 = false;
        if (!"snsPay".equals(str)) {
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppSnsPayByPayScene url is not snsPaym, return false");
            return false;
        }
        int i17 = iTransmitKvData.getInt("payScene");
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i(TAG, "payScene is 0, return false");
            return false;
        }
        if (i17 == 37) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_hongbao_android, false);
        } else if (i17 == 78) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_newyear_hongbao_android, false);
        } else if (i17 == 31) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_transfer_android, false);
        } else if (i17 == 56) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_transfer2phone_android, false);
        } else if (i17 == 49) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_transfer2bank_android, false);
        } else if (i17 == 42) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_aa_android, false);
        } else if (i17 == 32 || i17 == 33) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_f2f_transfer_android, false);
        } else if (i17 == 48) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_qrcode_reward_android, false);
        } else if (i17 == 65) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_personal_payment_android, false);
        } else if (i17 == 43) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_f2f_hongbao_android, false);
        }
        com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppSnsPayByPayScene, payScene: " + i17 + ", result: " + z17);
        return z17;
    }

    private boolean isEnableLiteAppSnsPayUseCase(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        if (!"snsPay".equals(str)) {
            return false;
        }
        if (!checkSnsPayLiteAppMinVersion()) {
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, checkMinVersion not passed");
            return false;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_close_snspay_android, false)) {
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, clicfg_kinda_lite_usecases_close_snspay_android is true, return false");
            return false;
        }
        if (iTransmitKvData == null) {
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, data is null, return false");
            return false;
        }
        if (isEnableLiteAppSnsPayByPayScene(str, iTransmitKvData)) {
            return true;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_kinda_lite_usecases_snspay_scene_list_android, "", true);
        if (Zi == null || Zi.trim().isEmpty()) {
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, snsPaySceneListStr is empty, return false");
            return false;
        }
        java.util.List<java.lang.String> asList = java.util.Arrays.asList(Zi.split(","));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : asList) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                java.lang.String trim = str2.trim();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(trim)));
                    } catch (java.lang.NumberFormatException unused) {
                        com.tencent.mars.xlog.Log.w(TAG, "isEnableLiteAppSnsPayUseCase, invalid scene: " + trim);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, sceneList is empty, return false");
            return false;
        }
        int i17 = iTransmitKvData.getInt("payScene");
        boolean contains = arrayList.contains(java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppSnsPayUseCase, payScene: " + i17 + ", sceneList: " + arrayList + ", result: " + contains);
        return contains;
    }

    private boolean isEnableLiteAppUseCase(java.lang.String str) {
        if ("jsapiPay".equals(str)) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_jsapipay_android, false);
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppUseCase jsapiPay result: " + fj6);
            return fj6;
        }
        if ("appPay".equals(str)) {
            boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_apppay_android, false);
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppUseCase appPay result: " + fj7);
            return fj7;
        }
        if ("scanQRCodePay".equals(str)) {
            boolean fj8 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_scan_qrcode_pay_android, false);
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppUseCase scanQRCodePay result: " + fj8);
            return fj8;
        }
        if ("h5Pay".equals(str)) {
            boolean fj9 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_h5pay_android, false);
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppUseCase h5Pay result: " + fj9);
            return fj9;
        }
        if ("snsPay".equals(str) && checkSnsPayLiteAppMinVersion()) {
            boolean fj10 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_snspay_android, false);
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppUseCase snsPay result: " + fj10);
            return fj10;
        }
        if ("offlinePay".equals(str)) {
            boolean fj11 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_offlinepay_android, false);
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppUseCase offlinePay result: " + fj11);
            return fj11;
        }
        if ("balanceRechargeUseCase".equals(str)) {
            boolean fj12 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_usecases_balance_recharge_pay_android, false);
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppUseCase balanceRechargeUseCase result: " + fj12);
            return fj12;
        }
        if ("inWxAppPay".equals(str) && checkSnsPayLiteAppMinVersion()) {
            boolean fj13 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_c2b_transfer_android, false);
            com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppUseCase InWxAppPayUseCase result: " + fj13);
            return fj13;
        }
        com.tencent.mars.xlog.Log.i(TAG, "isEnableLiteAppUseCase url: " + str + ", not matched any lite app use case");
        return false;
    }

    private boolean isPrepayIdIndicatesLiteApp(java.lang.String str) {
        if (str != null && str.length() >= 2) {
            if (!str.startsWith("wx") && !str.startsWith("up")) {
                com.tencent.mars.xlog.Log.i(TAG, "prepay_id does not start with wx or up, not enable lite app use case");
                return false;
            }
            if (java.lang.Character.getNumericValue(str.charAt(str.length() - 2)) == 1) {
                com.tencent.mars.xlog.Log.i(TAG, "prepay_id indicates liteapp, enable lite app use case");
                return true;
            }
            com.tencent.mars.xlog.Log.i(TAG, "prepay_id indicates non-liteapp, not enable lite app use case");
        }
        return false;
    }

    private boolean isQrCodeUrlIndicatesLiteApp(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            if (!(str.startsWith("weixin://wxpay/bizpayurl") || str.startsWith("weixin://wxpay/bizpayurl/up") || str.startsWith("weixin://wxpay/pcpayurl/up"))) {
                com.tencent.mars.xlog.Log.i(TAG, "qrCodeUrl does not have valid prefix, not enable lite app use case");
                return false;
            }
            try {
                java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("pr");
                if (queryParameter != null && queryParameter.length() > 18) {
                    if (java.lang.Character.getNumericValue(queryParameter.charAt(queryParameter.length() - 1)) == 1) {
                        com.tencent.mars.xlog.Log.i(TAG, "qrCodeUrl pr parameter indicates liteapp, enable lite app use case");
                        return true;
                    }
                    com.tencent.mars.xlog.Log.i(TAG, "qrCodeUrl pr parameter indicates non-liteapp, not enable lite app use case");
                    return false;
                }
                com.tencent.mars.xlog.Log.i(TAG, "qrCodeUrl pr parameter not found or length <= 18, not enable lite app use case");
                return false;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(TAG, "Error parsing qrCodeUrl: " + e17.getMessage());
            }
        }
        return false;
    }

    public static void judgeReprot() {
        report.judgeReport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleHKHongbaoRouteInfoFromUriSpan$2(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startKindaWalletLockVerify$0(h45.i iVar, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(TAG, "touch lock verify retcode is %s", java.lang.Integer.valueOf(intent.getIntExtra("retCode", -1)));
        if (iVar != null) {
            iVar.onKindaBusinessCallback(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startKindaWalletLockVerify$1(h45.i iVar, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(TAG, "pattern lock verify retcode is %s", java.lang.Integer.valueOf(intent.getIntExtra("retCode", -1)));
        if (iVar != null) {
            iVar.onKindaBusinessCallback(intent);
        }
    }

    private com.tencent.kinda.gen.ITransmitKvData prepareInWxAppPayUseCase(android.os.Bundle bundle) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 19L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startInWxAppPayUseCase %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        report.markEnterPay(bundle.getInt("payScene"));
        java.lang.String string = bundle.getString("prepayId", "");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("prepay_id", string);
        create.putString("bank_type", bundle.getString("bankType", ""));
        create.putString("bind_serial", bundle.getString("bindSerial", ""));
        create.putInt("payScene", bundle.getInt("payScene"));
        create.putInt("payChannel", bundle.getInt("payChannel"));
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        create.putString("qrcode_url", bundle.getString("qrCodeUrl", ""));
        create.putInt("qrcode_session_type", bundle.getInt("qrCodeSessionType"));
        create.putString("qrcode_session_name", bundle.getString("qrCodeSessionName", ""));
        create.putString("qrcode_timeline_objid", bundle.getString("qrCodeTimelineObjId", ""));
        create.putBool("enableDuplicate", bundle.getInt("enableDuplicate") == 1);
        create.putInt("chat_type", bundle.getInt("chatType"));
        create.putInt("send_type", bundle.getInt("sendType"));
        create.putString("qrcodeSenderName", bundle.getString("qrcodeSenderName"));
        create.putString("qrcodeSenderMsgId", bundle.getString("qrcodeSenderMsgId"));
        java.lang.String string2 = bundle.getString("payInitRawUrl");
        long j17 = bundle.getLong("payInitTimestamp", 0L);
        if (j17 == 0) {
            j17 = c01.id.a() / 1000;
        }
        java.lang.String string3 = bundle.getString("qrCodeUrl", "");
        create.putString("initRawUrl", string2 == null ? "" : string2);
        create.putLong("initTimestamp", j17);
        create.putString("latestUrl", string3 != null ? string3 : "");
        com.tencent.mars.xlog.Log.i(TAG, "prepareInWxAppPayUseCase initRawUrl: %s, latestUrl: %s, initTimestamp: %d", string2, string3, java.lang.Long.valueOf(j17));
        java.lang.String string4 = bundle.getString("customSucTip");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
            create.putString("succ_tip", string4);
        }
        return create;
    }

    private void preparePayDesk() {
        at4.g0.e(5);
    }

    private com.tencent.kinda.gen.ITransmitKvData processBindCardBundle(android.os.Bundle bundle) {
        boolean z17 = bundle.getInt("key_bind_scene", -1) == 1;
        int i17 = bundle.getInt("reg_flag", -1);
        if (i17 == -1) {
            i17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_is_reg;
        }
        boolean z18 = bundle.getInt("key_bind_scene") == 8;
        int i18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().t() ? 2 : 1;
        java.lang.String q17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().q();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putBool("bPresent", z17);
        create.putInt("regFlag", i17);
        create.putInt("cardUserFlag", i18);
        create.putString("trueName", q17);
        create.putInt("addPayCardScene", bundle.getInt("key_bind_scene", -1));
        create.putInt("bindScene", bundle.getInt("key_bind_scene", -1));
        create.putInt("realnameScene", bundle.getInt("entry_scene", -1));
        create.putBool("isWebankLoadScene", z18);
        create.putString("password", bundle.getString("key_pwd1"));
        if (!bundle.getString("kreq_token", "").isEmpty()) {
            create.putString("token", bundle.getString("kreq_token"));
        }
        if (!bundle.getString("usertoken", "").isEmpty()) {
            create.putString("usertoken", bundle.getString("usertoken"));
        }
        create.putBool("canChangeRealname", bundle.getBoolean("key_bind_show_change_card", false));
        create.putBool("canPassPwd", bundle.getBoolean("key_bind_card_can_pass_pwd", false));
        create.putString("usertoken", bundle.getString("key_bind_card_user_token", ""));
        com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle realNameBundle = bundle.containsKey("realname_verify_process_bundle") ? (com.tencent.mm.plugin.wallet_core.id_verify.model.RealNameBundle) bundle.getParcelable("realname_verify_process_bundle") : null;
        if (realNameBundle != null) {
            create.putBool("isNewRealname", true);
            create.putString("rn_realname_scene", bundle.getString("key_realname_scene", ""));
            create.putString("rn_true_name", realNameBundle.f179423d);
            create.putString("rn_cre_type", "" + realNameBundle.f179426g);
            create.putString("rn_cre_name", realNameBundle.f179427h);
            create.putString("rn_identify_card_origin", realNameBundle.f179424e);
            create.putString("rn_encry_identity_card", realNameBundle.f179425f);
            create.putInt("rn_creid_renewal_origin", realNameBundle.f179433q);
            create.putInt("rn_cre_expire_date_origin_year", realNameBundle.f179435s);
            create.putInt("rn_cre_expire_date_origin_month", realNameBundle.f179436t);
            create.putInt("rn_cre_expire_date_origin_day", realNameBundle.f179437u);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(realNameBundle.f179434r)) {
                create.putString("rn_cre_expire_date_encrypt", new com.tenpay.ndk.Encrypt().desedeEncode(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(realNameBundle.f179435s), java.lang.Integer.valueOf(realNameBundle.f179436t), java.lang.Integer.valueOf(realNameBundle.f179437u))));
            }
            create.putInt("rn_cre_effect_date_origin_year", realNameBundle.E);
            create.putInt("rn_cre_effect_date_origin_month", realNameBundle.F);
            create.putInt("rn_cre_effect_date_origin_day", realNameBundle.G);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(realNameBundle.D)) {
                create.putString("rn_cre_effect_date_encrypt", new com.tenpay.ndk.Encrypt().desedeEncode(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(realNameBundle.E), java.lang.Integer.valueOf(realNameBundle.F), java.lang.Integer.valueOf(realNameBundle.G))));
            }
            create.putInt("rn_birth_date_origin_year", realNameBundle.f179439w);
            create.putInt("rn_birth_date_origin_month", realNameBundle.f179440x);
            create.putInt("rn_birth_date_origin_day", realNameBundle.f179441y);
            create.putString("rn_country", realNameBundle.f179429m);
            create.putString("rn_province", realNameBundle.f179430n);
            create.putString("rn_city", realNameBundle.f179431o);
            create.putString("rn_areaStr", realNameBundle.f179432p);
            create.putString("rn_profession_type", "" + realNameBundle.f179428i.f179422e);
            create.putString("rn_profession_name", realNameBundle.f179428i.f179421d);
            create.putString("rn_iso_country_code", realNameBundle.f179442z);
            create.putInt("rn_sex", realNameBundle.I);
            create.putString("rn_detail_address", realNameBundle.C);
            boolean z19 = bundle.getBoolean("realname_verify_process_need_face", false);
            create.putBool("rn_is_need_face", z19);
            if (z19) {
                create.putInt("rn_scene", (int) bundle.getLong("realname_verify_process_face_scene"));
                create.putString("rn_package", bundle.getString("realname_verify_process_face_package"));
                create.putString("rn_package_sign", bundle.getString("realname_verify_process_face_package_sign"));
            }
            create.putString("rn_session_id", bundle.getString("key_realname_sessionid", ""));
        }
        create.putInt("bindCardScene", bundle.getInt("key_bind_scene"));
        create.putString("bindCardUuid", com.tencent.mm.wallet_core.model.i1.f213916c);
        create.putString("deviceName", wo.w0.m());
        create.putString("deviceType", "");
        create.putBool("BindCardV2", true);
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        create.putBool("marketingSwitchClosed", bundle.getBoolean("key_marketing_switch_closed", false));
        create.putBool("realname_is_minor_bindcard", bundle.getBoolean("realname_is_minor_bindcard", false));
        create.putBool("should_block_usecase_stop_when_add_card_success", bundle.getBoolean("should_block_usecase_stop_when_add_card_success", false));
        create.putString("notifyType", bundle.getString("notifyType"));
        create.putBool("stopUseCase", bundle.getBoolean("stopUseCase"));
        return create;
    }

    private boolean shouldStartLiteAppUseCase(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        boolean z17 = false;
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        if (intValue != 0 && intValue != 1) {
            com.tencent.mars.xlog.Log.i(TAG, "shouldStartLiteAppUseCase, walletRegion %s is not CN, return false", java.lang.Integer.valueOf(intValue));
            return false;
        }
        if (isCloseAllLiteAppUseCase()) {
            com.tencent.mars.xlog.Log.i(TAG, "isCloseAllLiteAppUseCase, not enable lite app use case");
            return false;
        }
        if (this.kindaLiteMgr.isCloseByMinVersionCheck()) {
            com.tencent.mars.xlog.Log.i(TAG, "closeByMinVersionCheck, not enable lite app use case");
            return false;
        }
        if (iTransmitKvData != null) {
            java.lang.String string = iTransmitKvData.getString("prepay_id");
            if (string.startsWith("sns")) {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_lite_sns_pay_scene_third_hongbao_android, false);
                boolean checkSnsPayLiteAppMinVersion = checkSnsPayLiteAppMinVersion();
                if (fj6 && checkSnsPayLiteAppMinVersion) {
                    z17 = true;
                }
                com.tencent.mars.xlog.Log.i(TAG, "prepareId hit sns logic! result is %s", java.lang.Boolean.valueOf(z17));
                return z17;
            }
            if (isPrepayIdIndicatesLiteApp(string)) {
                return true;
            }
            java.lang.String string2 = iTransmitKvData.getString("package");
            if ((string2 != null && isPrepayIdIndicatesLiteApp(getPrepayIdFromPackage(string2))) || isQrCodeUrlIndicatesLiteApp(iTransmitKvData.getString("qrCodeUrl"))) {
                return true;
            }
        }
        if (this.kindaLiteMgr.enableLiteAppUseCase(str) || isEnableLiteAppUseCase(str) || isEnableLiteAppSnsPayUseCase(str, iTransmitKvData)) {
            return true;
        }
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_kinda_lite_usecases_android", "");
        java.lang.String aj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_kinda_lite_usecases_internal_android", "");
        java.util.List asList = java.util.Arrays.asList(aj6.split(","));
        java.util.List asList2 = java.util.Arrays.asList(aj7.split(","));
        java.util.ArrayList arrayList = new java.util.ArrayList(asList);
        arrayList.addAll(asList2);
        com.tencent.mars.xlog.Log.i(TAG, "mergedKindaLiteUseCases: %s", arrayList);
        if (!arrayList.contains(str)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(TAG, "shouldStartLiteAppUseCase, url: %s, return true", str);
        return true;
    }

    private boolean startLqtDetailUseCase(final android.content.Context context, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mars.xlog.Log.i(TAG, "start LqtDetailUseCase");
        com.tencent.mm.wallet_core.b.a().getClass();
        startUseCase("lqt", iTransmitKvData, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.24
            private byte _hellAccFlag_;

            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData2) {
                java.lang.String string = iTransmitKvData2.getString("dataSource");
                java.lang.String string2 = iTransmitKvData2.getString("cmdWord");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string) || com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "datasource or cmdword is null!");
                    return;
                }
                if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "context is not instance of mmactivity");
                }
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
                if (string.equals("lqt")) {
                    if (string2.equals("startAutoChargeSetting")) {
                        android.content.Intent intent = new android.content.Intent(mMActivity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI.class);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mMActivity.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(mMActivity, "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (string2.equals("startPlainIndex")) {
                        android.content.Intent intent2 = new android.content.Intent(mMActivity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanBeforeHomeUI.class);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(mMActivity, arrayList2.toArray(), "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mMActivity.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(mMActivity, "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (string2.equals("jumpStaticVideo")) {
                        java.lang.String string3 = iTransmitKvData2.getString("video_url");
                        android.content.Intent intent3 = new android.content.Intent(mMActivity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI.class);
                        intent3.putExtra("videoUrl", string3);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(mMActivity, arrayList3.toArray(), "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mMActivity.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(mMActivity, "com/tencent/kinda/framework/WxCrossServices$24", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (string2.equals("jumpVideoFeed")) {
                        java.lang.String string4 = iTransmitKvData2.getString("feed_id");
                        java.lang.String string5 = iTransmitKvData2.getString("nonce_id");
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.putExtra("feed_object_id", pm0.v.Z(string4));
                        intent4.putExtra("feed_object_nonceId", string5);
                        intent4.putExtra("key_comment_scene", 1);
                        intent4.putExtra("tab_type", 1001);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.e1.f460472a.A(mMActivity, intent4, false);
                    }
                }
            }
        });
        return true;
    }

    public static void tryLoadLibrary() {
        if (((h45.q) i95.n0.c(h45.q.class)).isKindaEnabled()) {
            fp.d0.o("wechatxlog");
            fp.d0.o("kinda_android");
        }
    }

    @Override // h45.q
    public boolean TenPaySDKABTestKindaEnable() {
        com.tencent.mm.wallet_core.b.a().getClass();
        return true;
    }

    @Override // h45.q
    public boolean canOpenKindaCashier(android.content.Context context) {
        initIfNeed();
        com.tencent.mm.wallet_core.b.a().getClass();
        if (com.tencent.kinda.framework.boot.KindaApp.appKinda().getIsPaying() || this.kindaLiteMgr.isPaying()) {
            com.tencent.mars.xlog.Log.i("canOpenKindaCashier", "is paying");
            return false;
        }
        com.tencent.mars.xlog.Log.i("canOpenKindaCashier", "not paying");
        com.tencent.kinda.framework.boot.KindaApp.appKinda().stopUseCase("rootUseCase");
        this.kindaLiteMgr.stopAppAndH5PayUseCase();
        return true;
    }

    @Override // h45.q
    public void checkIfNeedRequestUserBindqueryWhenUnBindCard(java.lang.String str) {
        com.tencent.kinda.framework.boot.KindaApp.appKinda().checkIfNeedRequestUserBindqueryWhenUnBindCard(str);
    }

    @Override // h45.q
    public void checkIfNeedUpdateOfflinePayToken() {
        com.tencent.kinda.framework.boot.KindaApp.appKinda().checkIfNeedUpdateOfflinePayToken();
    }

    @Override // h45.q
    public void ensureLibraryLoaded() {
        tryLoadLibrary();
    }

    @Override // h45.q
    public long getAccountLoginSuccessTime() {
        return this.accountLoginSuccessTime;
    }

    @Override // h45.q
    public long getAppColdStartTime() {
        return com.tencent.mm.app.x.f53906a;
    }

    @Override // h45.q
    public long getColorByMode(long j17, long j18) {
        com.tencent.kinda.gen.DynamicColor dynamicColor = new com.tencent.kinda.gen.DynamicColor();
        dynamicColor.mNormalColor = j17;
        dynamicColor.mDarkmodeColor = j18;
        return com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor, false);
    }

    @Override // h45.q
    public android.app.Activity getCrossActivity() {
        return com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
    }

    @Override // h45.q
    public java.lang.String getDeeplinkUrlInMemory() {
        return this.deeplinkUrl;
    }

    @Override // h45.q
    public long getFirstPreloadTime() {
        return this.firstPreloadTime;
    }

    @Override // h45.q
    public java.lang.String getKindaLiteUseCaseSessionId() {
        try {
            return this.kindaLiteMgr.currentSessionId();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "getKindaLiteUseCaseSessionId error: %s", th6.getMessage());
            return null;
        }
    }

    @Override // h45.q
    public long getLastEnterForegroundTime() {
        return this.lastEnterForegroundTime;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r3 == null) goto L9;
     */
    @Override // h45.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getOverseaFunctionUrlWithToken(java.lang.String r14) {
        /*
            r13 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r13.overseaWalletRequestInfo
            java.lang.String r1 = ""
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L18
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L18
            java.net.URI r3 = r3.toURI()     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L15
            java.lang.String r3 = r3.getHost()     // Catch: java.lang.Throwable -> L18
            goto L16
        L15:
            r3 = r2
        L16:
            if (r3 != 0) goto L19
        L18:
            r3 = r1
        L19:
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L25
            boolean r6 = r0.containsKey(r3)
            if (r6 != r4) goto L25
            r6 = r4
            goto L26
        L25:
            r6 = r5
        L26:
            if (r6 == 0) goto L34
            if (r0 == 0) goto L31
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 != 0) goto L35
        L34:
            r0 = r1
        L35:
            int r3 = r0.length()
            if (r3 != 0) goto L3c
            goto L3d
        L3c:
            r4 = r5
        L3d:
            if (r4 == 0) goto L41
            goto Lc8
        L41:
            java.lang.String r3 = "_stk"
            java.lang.String r4 = "New URL: "
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> Lc7
            r5.<init>(r14)     // Catch: java.lang.Throwable -> Lc7
            java.net.URI r5 = r5.toURI()     // Catch: java.lang.Throwable -> Lc7
            if (r5 != 0) goto L54
            if (r14 != 0) goto Lc8
            goto Lc7
        L54:
            java.lang.String r14 = r5.getQuery()     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r6.<init>()     // Catch: java.lang.Throwable -> Lc7
            if (r14 == 0) goto L67
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r14 = "&"
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
        L67:
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lc7
            if (r14 == 0) goto L70
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> Lc7
            goto L71
        L70:
            r14 = r2
        L71:
            java.lang.String r14 = java.net.URLEncoder.encode(r3, r14)     // Catch: java.lang.Throwable -> Lc7
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r14 = "="
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lc7
            if (r14 == 0) goto L86
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> Lc7
            goto L87
        L86:
            r14 = r2
        L87:
            java.lang.String r14 = java.net.URLEncoder.encode(r0, r14)     // Catch: java.lang.Throwable -> Lc7
            r6.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.net.URI r14 = new java.net.URI     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r8 = r5.getScheme()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r9 = r5.getAuthority()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r10 = r5.getPath()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r11 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r12 = r5.getFragment()     // Catch: java.lang.Throwable -> Lc7
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lc7
            java.net.URL r14 = r14.toURL()     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Lc7
            r0.append(r14)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc7
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> Lc7
            r3.println(r0)     // Catch: java.lang.Throwable -> Lc7
            if (r14 == 0) goto Lc3
            java.lang.String r2 = r14.toString()     // Catch: java.lang.Throwable -> Lc7
        Lc3:
            if (r2 != 0) goto Lc6
            goto Lc7
        Lc6:
            r1 = r2
        Lc7:
            r14 = r1
        Lc8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.WxCrossServices.getOverseaFunctionUrlWithToken(java.lang.String):java.lang.String");
    }

    @Override // h45.q
    public boolean handleHKHongbaoRouteInfoFromUriSpan(java.lang.String str) {
        byte[] tryParseHKHongbaoRouteInfoFromUrl = com.tencent.kinda.framework.WxCrossHelper.INSTANCE.tryParseHKHongbaoRouteInfoFromUrl(str);
        if (tryParseHKHongbaoRouteInfoFromUrl == null) {
            return false;
        }
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putBinary("route_info", tryParseHKHongbaoRouteInfoFromUrl);
        startUseCase("commonRoute", create, (com.tencent.kinda.gen.UseCaseCallback) new com.tencent.kinda.framework.WxCrossServices$$a());
        return true;
    }

    @Override // h45.q
    public void handleHKNativeCashier(android.content.Context context, android.os.Bundle bundle, final h45.k kVar) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        java.lang.String string = bundle.getString("attach");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            create.putString("attach", string);
        }
        java.lang.String string2 = bundle.getString("ff_attach");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            create.putString("ff_attach", string2);
        }
        java.lang.String string3 = bundle.getString("req_key");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
            create.putString("req_key", string3);
        }
        create.putInt("cashierType", bundle.getInt("cashierType", 0));
        startUseCase("hkcashier", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.43
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                int i17 = iTransmitKvData.getInt("retcode");
                h45.k kVar2 = kVar;
                if (kVar2 != null) {
                    kVar2.a(i17);
                }
            }
        });
    }

    @Override // h45.q
    public void handleHKOfflineNewXmlMsg(java.lang.String str) {
        int P;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "sysmsg", null);
        if (d17 != null && (P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1)) == 51) {
            int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.HKOfflineMsgType"), 0);
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.paymsg.HKOfflineMsgInfo");
            java.lang.String str3 = (java.lang.String) d17.get(".sysmsg.paymsg.HKOfflineMsgExtInfo");
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putInt("PayMsgType", P);
            create.putInt("hk_msg_type", P2);
            create.putString("hk_msg_info", str2);
            create.putString("hk_msg_extInfo", str3);
            create.putString("func_name", "hkoffline_push_newxml");
            com.tencent.kinda.framework.boot.KindaApp.appKinda().notifyHKOfflineNewXml(create);
        }
    }

    @Override // h45.q
    public void handleHKWalletScanCodeRoute(java.lang.String str, int i17, final h45.i iVar) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            create.putString("scan_url", str);
        }
        int i18 = 1;
        if (i17 == 1) {
            i18 = 3;
        } else if (i17 != 0) {
            i18 = 2;
        }
        create.putInt("scan_scene", i18);
        com.tencent.mars.xlog.Log.i(TAG, "WPHK handle url route, url: %s, scene : %d", str, java.lang.Integer.valueOf(i18));
        startUseCase("hkScanCodeRouteUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.56
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                int i19 = iTransmitKvData.getInt("scan_continue");
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "WPHK hkScanCodeRouteUseCase call back, scan_contiune is : %s", java.lang.Integer.valueOf(i19));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("scan_continue", i19);
                h45.i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.onKindaBusinessCallback(intent);
                }
            }
        });
    }

    @Override // h45.q
    public boolean isDeviceSupportNFC() {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_WALLET_SUPPORT_NFC_TYPE_INT_SYNC, 0);
        if (!this.hasUpdateNfc) {
            this.hasUpdateNfc = true;
            com.tencent.kinda.framework.WxCrossHelper.INSTANCE.updateNfcStatus();
        }
        com.tencent.mars.xlog.Log.i(TAG, "isDeviceSupportNFC, isSupport: %s", java.lang.Integer.valueOf(r17));
        return r17 == 1;
    }

    @Override // h45.q
    public boolean isKindaActivity(android.app.Activity activity) {
        return activity != null && (activity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity);
    }

    @Override // h45.q
    public boolean isKindaEnabled() {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("kinda");
        return true;
    }

    @Override // h45.q
    public boolean isKindaLitePaying() {
        com.tencent.kinda.framework.kindalite.KindaLiteMgr kindaLiteMgr = this.kindaLiteMgr;
        if (kindaLiteMgr != null) {
            return kindaLiteMgr.isInProcess();
        }
        return false;
    }

    @Override // h45.q
    public boolean isOfflineReady() {
        return com.tencent.kinda.framework.boot.KindaApp.appKinda().checkOfflineReady();
    }

    @Override // h45.q
    public boolean isSwitch2InWxAppPay(java.lang.String str) {
        if (str != null) {
            return !str.startsWith("ts_");
        }
        com.tencent.mars.xlog.Log.i(TAG, "isSwitch2InWxAppPay prepayId is null");
        return false;
    }

    @Override // h45.q
    public boolean isUseCaseAlive(java.lang.String str) {
        com.tencent.mm.wallet_core.b.a().getClass();
        return com.tencent.kinda.framework.boot.KindaApp.appKinda().isUseCaseAlive(str);
    }

    @Override // h45.q
    public void markFirstPreloadTimeIfNeeded() {
        if (this.firstPreloadTime == 0) {
            this.firstPreloadTime = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i(TAG, "markFirstPreloadTimeIfNeeded: " + this.firstPreloadTime);
        }
    }

    @Override // h45.q
    public void notifyAddPaycardUsecase(android.os.Bundle bundle, java.lang.String str, h45.i iVar) {
        notifySpecificUseCase("addPayCard", processBindCardBundle(bundle), str, iVar);
    }

    @Override // h45.q
    public void notifyAllLiteAppForPay(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        map.put("businessEventName", str);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.w.k("", "pay.notifyAll", jSONObject);
    }

    @Override // h45.q
    public void notifyAllUseCase(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(TAG, "start common notifyAllUseCase");
        if (obj instanceof com.tencent.kinda.gen.ITransmitKvData) {
            com.tencent.kinda.gen.ITransmitKvData iTransmitKvData = (com.tencent.kinda.gen.ITransmitKvData) obj;
            com.tencent.mars.xlog.Log.i(TAG, "start common notifyAllUseCase: %s", iTransmitKvData.toJson());
            com.tencent.kinda.framework.boot.KindaApp.appKinda().notifyAllUseCases(iTransmitKvData);
            com.tencent.kinda.framework.kindalite.PayLiteAppNotify.INSTANCE.getInstance().notifyAllUseCase(obj);
        }
    }

    @Override // h45.q
    public void notifyKindaOnManualAuthOk() {
        com.tencent.mars.xlog.Log.i(TAG, "notifyKindaOnManualAuthOk");
        com.tencent.kinda.framework.boot.KindaApp.appKinda().notifyOnManualAuthOK();
    }

    @Override // h45.q
    public void notifyRealnameCancel() {
        com.tencent.mars.xlog.Log.i(TAG, "notifyRealnameCancel");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("func_name", "realnameCancel");
        notifyAllUseCase(create);
    }

    @Override // h45.q
    public void notifyRealnameEnd() {
        com.tencent.mars.xlog.Log.i(TAG, "notifyRealnameEnd");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("func_name", "realnameEnd");
        notifyAllUseCase(create);
    }

    public void notifySpecificUseCase(final java.lang.String str, java.lang.Object obj, java.lang.String str2, final h45.i iVar) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = java.lang.Boolean.valueOf(iVar == null);
        com.tencent.mars.xlog.Log.i(TAG, "notify specific usecase, url: %s, callbackkey: %s, whether callback is null: %s", objArr);
        if (obj instanceof com.tencent.kinda.gen.ITransmitKvData) {
            com.tencent.kinda.gen.ITransmitKvData iTransmitKvData = (com.tencent.kinda.gen.ITransmitKvData) obj;
            if (iVar != null) {
                iTransmitKvData.putPlatformCallback(str2, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.32
                    @Override // com.tencent.kinda.gen.UseCaseCallback
                    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData2) {
                        android.content.Intent intent = new android.content.Intent();
                        java.util.Iterator<java.lang.String> it = iTransmitKvData2.allKeys().iterator();
                        while (it.hasNext()) {
                            java.lang.String next = it.next();
                            intent.putExtra(next, iTransmitKvData2.getString(next));
                        }
                        if (java.util.Objects.equals(str, "addPayCard")) {
                            intent.putExtra("retcode", iTransmitKvData2.getInt("retcode"));
                            intent.putExtra("passport_page_style", iTransmitKvData2.getInt("passport_page_style"));
                        }
                        iVar.onKindaBusinessCallback(intent);
                    }
                });
            }
            com.tencent.kinda.gen.UseCase useCaseInStack = com.tencent.kinda.framework.boot.KindaApp.appKinda().getUseCaseInStack(str);
            if (useCaseInStack != null) {
                useCaseInStack.notify(iTransmitKvData);
            } else {
                com.tencent.mars.xlog.Log.i(TAG, "usecase is null, do not notify");
            }
        }
    }

    @Override // h45.q
    public void notifyUploadCardSuccess() {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("upload_id_success_notifycation", "1");
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        notifyAllUseCase(create);
    }

    @Override // h45.q
    public void notifyWalletPageRefresh() {
        com.tencent.mars.xlog.Log.i(TAG, "notifyAllUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("notifyType", "walletusecaserefresh");
        notifyAllUseCase(create);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        this.accountLoginSuccessTime = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i(TAG, "onAccountInitialized, accountLoginSuccessTime=" + this.accountLoginSuccessTime);
        this.kindaLiteMgr.preload(context);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        this.overseaWalletRequestInfo = null;
        com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.INSTANCE.cleanup();
    }

    @Override // wo3.s
    public boolean onNotify(wo3.v vVar) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("PayMsgType", vVar.f448216a);
        create.putString("ack_key", vVar.f448218c);
        create.putString("req_key", vVar.f448217b);
        create.putString("func_name", "offline_push_xml");
        int i17 = vVar.f448216a;
        if (i17 == 20) {
            wo3.b0 b0Var = (wo3.b0) vVar;
            create.putInt("guide_block", b0Var.f448143d.f448140f ? 1 : 0);
            wo3.a0 a0Var = b0Var.f448143d;
            create.putInt("guide_flag", java.lang.Integer.parseInt(a0Var.f448135a));
            create.putString("guide_wording", a0Var.f448136b);
            create.putString("left_button_wording", a0Var.f448137c);
            create.putString("right_button_wording", a0Var.f448138d);
            create.putString("upload_credit_url", a0Var.f448139e);
            notifyAllUseCase(create);
        } else if (i17 == 5) {
            wo3.x xVar = (wo3.x) vVar;
            create.putInt("pay_cmd", xVar.f448225i);
            create.putInt("cftretcode", com.tencent.mm.sdk.platformtools.t8.D1(xVar.f448220d, 0));
            create.putInt("wxretcode", com.tencent.mm.sdk.platformtools.t8.D1(xVar.f448222f, 0));
            create.putString("cftretmsg", xVar.f448221e);
            create.putString("wxretmsg", xVar.f448223g);
            create.putString("error_detail_url", xVar.f448224h);
            create.putString("error_icon_url", xVar.f448226j);
            create.putLong("error_icon_lcolor", xVar.f448227k);
            create.putLong("error_icon_dcolor", xVar.f448228l);
            create.putString("dialog_viewid", xVar.f448229m);
            create.putString("right_btn_title", xVar.f448230n);
            create.putString("tinyapp_username", xVar.f448231o);
            create.putString("tinyapp_path", xVar.f448232p);
            notifyAllUseCase(create);
        } else if (i17 == 6) {
            notifyAllUseCase(create);
        } else if (i17 == 8) {
            notifyAllUseCase(create);
        } else if (i17 == 4) {
            notifyAllUseCase(create);
        } else if (i17 == 23) {
            notifyAllUseCase(create);
        } else if (i17 == 24) {
            notifyAllUseCase(create);
        } else if (i17 == 42) {
            create.putString("PayMsgInfo", ((wo3.u) vVar).f448215d);
            notifyAllUseCase(create);
        }
        return false;
    }

    @Override // h45.q
    public byte[] parseHKHongbaoRouteInfoData(java.lang.String str, java.lang.String str2) {
        return com.tencent.kinda.framework.WxCrossHelper.INSTANCE.getHKHongbaoRouteInfoData(str, str2);
    }

    @Override // h45.q
    public void preloadKindalite() {
        this.kindaLiteMgr.preloadAtOnce(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // h45.q
    public int registerLiteAppModuleEventForPay(java.lang.String str, h45.m mVar) {
        com.tencent.mars.xlog.Log.i(TAG, "registerLiteAppModuleEventForPay, businessEventName: %s", str);
        return id.d.f290444c.a().b(str, mVar);
    }

    @Override // h45.q
    public void requestHKCashierFromLite(org.json.JSONObject jSONObject, final h45.j jVar) {
        com.tencent.mars.xlog.Log.i(TAG, "requestHKCashierFromLite");
        startUseCase("hkcashier", com.tencent.kinda.framework.WxCrossHelper.INSTANCE.parseHKCashierReqData(jSONObject), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.44
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                int i17 = iTransmitKvData.getInt("retcode");
                int i18 = iTransmitKvData.getInt("action");
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "requestHKCashierFromLite callback, retcode=" + i17 + ", action=" + i18);
                if (jVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("retcode", i17);
                    intent.putExtra("action", i18);
                    hd.b bVar = (hd.b) jVar;
                    bVar.getClass();
                    int intExtra = intent.getIntExtra("retcode", 0);
                    int intExtra2 = intent.getIntExtra("action", 0);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, retcode is %s", java.lang.Integer.valueOf(intExtra));
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    if (intExtra == -1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, pay fail");
                        jSONObject2.put("result", "requestHKCashier:fail");
                    } else if (intExtra != 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, pay cancel");
                        jSONObject2.put("result", "requestHKCashier:cancel");
                    } else if (intExtra2 == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, pay presucc, ignore callback");
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteHKCashierService", "hkcashier callback, pay succ");
                        jSONObject2.put("result", "requestHKCashier:ok");
                    }
                    hd.a aVar = bVar.f280371a;
                    if (aVar != null) {
                        aVar.onCall(jSONObject2);
                    }
                }
            }
        });
    }

    @Override // h45.q
    public void requestHKCashierNotify(android.content.Context context, java.lang.String str) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            create.putString("jsapi_package", str);
        }
        create.putString("func_name", "requestHKCashier");
        notifyAllUseCase(create);
    }

    @Override // h45.q
    public void saveDeeplinkUrlInMemory(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "save deeplinkUrl: %s", str);
        this.deeplinkUrl = str;
    }

    @Override // h45.q
    public void setCurrentSeesionUserName(java.lang.String str) {
        currentSessionUserName = str;
    }

    @Override // h45.q
    public void setOverseaUrlTokens(java.lang.String str, java.lang.String str2) {
        if (this.overseaWalletRequestInfo == null) {
            this.overseaWalletRequestInfo = new java.util.HashMap<>();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str2 == null) {
            return;
        }
        this.overseaWalletRequestInfo.put(str, str2);
    }

    @Override // h45.q
    public boolean shouldHandleHKWalletCGPUrl(java.lang.String str) {
        return com.tencent.kinda.framework.WxCrossHelper.INSTANCE.checkShouldHandleHKWalletCGPUrl(str);
    }

    @Override // h45.q
    public void startBindCardUseCase(android.content.Context context, final android.os.Bundle bundle) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 16L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startBindCardUseCase %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        startUseCase("addPayCard", processBindCardBundle(bundle), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.16
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startBindCardUseCase callback");
                com.tencent.mm.autogen.events.KindaBindCardEvent kindaBindCardEvent = new com.tencent.mm.autogen.events.KindaBindCardEvent();
                int i17 = iTransmitKvData.getInt("retcode");
                am.di diVar = kindaBindCardEvent.f54454g;
                if (i17 == 1) {
                    diVar.f6453a = true;
                    diVar.f6455c = iTransmitKvData.getString("bind_serial");
                    diVar.f6456d = iTransmitKvData.getString("password");
                    diVar.f6457e = iTransmitKvData.getString("bank_type");
                    diVar.f6458f = iTransmitKvData.getString("mobile_no");
                    diVar.f6459g = iTransmitKvData.getString("realname_title");
                    diVar.f6460h = iTransmitKvData.getString("realname_desc");
                    diVar.f6461i = iTransmitKvData.getString("realname_btn_title");
                    diVar.f6462j = iTransmitKvData.getString("realname_err_jump_page");
                    diVar.f6464l = iTransmitKvData.getInt("passport_page_style");
                    diVar.f6465m = iTransmitKvData.getString("confirm_btn_title");
                    diVar.f6466n = iTransmitKvData.getString("confirm_btn_url");
                    diVar.f6467o = iTransmitKvData.getString("cancel_btn_title");
                    diVar.f6468p = iTransmitKvData.getString("bottom_wording");
                    diVar.f6469q = iTransmitKvData.getString("bottom_url");
                    diVar.f6470r = iTransmitKvData.getString("bottom_username");
                } else if (iTransmitKvData.getInt("retcode") == -1) {
                    diVar.f6453a = false;
                }
                diVar.f6454b = bundle.getBoolean("key_need_bind_response", false);
                kindaBindCardEvent.e();
            }
        });
    }

    @Override // h45.q
    public void startFaceCheckUseCase(java.lang.String str, android.content.Intent intent, final h45.i iVar) {
        com.tencent.mars.xlog.Log.i(TAG, "startFaceCheckUseCase， url：%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        str.getClass();
        if (str.equals("faceCheckFrontUseCase")) {
            create.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, intent.getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
            create.putString("package", intent.getStringExtra("package"));
            create.putString("package_sign", intent.getStringExtra("package_sign"));
            create.putString("other_verify_title_front", intent.getStringExtra("other_verify_title_front"));
            startUseCase("faceCheckFrontUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.48
                @Override // com.tencent.kinda.gen.UseCaseCallback
                public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, iTransmitKvData.getInt(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE));
                    intent2.putExtra("error_msg", iTransmitKvData.getString("error_msg"));
                    intent2.putExtra("need_show_protocal", iTransmitKvData.getInt("need_show_protocal"));
                    iVar.onKindaBusinessCallback(intent2);
                }
            });
            return;
        }
        if (!str.equals("faceCheckResultUseCase")) {
            com.tencent.mars.xlog.Log.i(TAG, "unknown type");
            return;
        }
        create.putString("error_msg", intent.getStringExtra("error_msg"));
        create.putString("error_tips", intent.getStringExtra("error_tips"));
        create.putBool("can_retry", intent.getBooleanExtra("can_retry", true));
        create.putString("other_verify_title", intent.getStringExtra("other_verify_title"));
        startUseCase("faceCheckResultUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.49
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("error_msg", iTransmitKvData.getString("error_msg"));
                intent2.putExtra("other_verify_title_state", iTransmitKvData.getString("other_verify_title_state"));
                iVar.onKindaBusinessCallback(intent2);
            }
        });
    }

    @Override // h45.q
    public void startFastBindUseCase(java.lang.String str, int i17, final java.lang.Runnable runnable) {
        com.tencent.mars.xlog.Log.i(TAG, "start startFastBindUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("qr_code", str);
        create.putInt("channel", i17);
        create.putInt("bind_card_entrance_scene", 2);
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("fastbindcard", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.31
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    @Override // h45.q
    public void startGetEncryptHKPasswd(java.lang.String str, final h45.i iVar) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            create.putString("jsapi_package", str);
        }
        startUseCase("hkGetEncryptPwd", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.55
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                int i17 = iTransmitKvData.getInt("result_code");
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "retcode is %s", java.lang.Integer.valueOf(i17));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("retcode", i17);
                if (i17 == 1) {
                    java.lang.String string = iTransmitKvData.getString("encrypt_pwd");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        intent.putExtra("encryptPasswd", string);
                    }
                    java.lang.String string2 = iTransmitKvData.getString("signature");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                        intent.putExtra("signature", string2);
                    }
                }
                h45.i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.onKindaBusinessCallback(intent);
                }
            }
        });
    }

    @Override // h45.q
    public void startHKOfflinePrePay(android.content.Context context, int i17) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("entry_scene", i17);
        startUseCase("hkoffline", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.41
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            }
        });
    }

    @Override // h45.q
    public void startHKOfflinePrePayFromJsApi(android.content.Context context, java.lang.String str) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("entry_scene", 3);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            create.putString("jsapi_package", str);
        }
        startUseCase("hkoffline", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.42
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            }
        });
    }

    @Override // h45.q
    public void startInWxAppPayUseCase(final h45.l lVar, android.os.Bundle bundle) {
        startUseCase("inWxAppPay", prepareInWxAppPayUseCase(bundle), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.33
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (lVar != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.lang.String string = iTransmitKvData.getString("result");
                    java.lang.String string2 = iTransmitKvData.getString(ya.b.TRANSACTION_ID);
                    java.lang.String string3 = iTransmitKvData.getString("prepay_id");
                    hashMap.put("result", string);
                    hashMap.put("transactionId", string2);
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (string3 == null) {
                        string3 = "";
                    }
                    hashMap.put("prepayId", string3);
                    d22.a0 a0Var = (d22.a0) lVar;
                    a0Var.getClass();
                    java.lang.Object obj = hashMap.get("result");
                    boolean z18 = obj instanceof java.lang.String;
                    d22.a aVar = a0Var.f225824d;
                    if (z18) {
                        java.lang.String str = (java.lang.String) obj;
                        if (r26.i0.p(str, "ok", true)) {
                            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            g0Var.d(12738, aVar.f225817a, java.lang.Integer.valueOf(aVar.f225820d), java.lang.Integer.valueOf(aVar.f225821e), 1);
                            g0Var.idkeyStat(408L, 9L, 1L, false);
                            a0Var.a(true, 0);
                        } else if (r26.i0.p(str, "cancel", true)) {
                            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                            g0Var2.d(12738, aVar.f225817a, java.lang.Integer.valueOf(aVar.f225820d), java.lang.Integer.valueOf(aVar.f225821e), 3);
                            g0Var2.idkeyStat(408L, 3L, 1L, false);
                            a0Var.a(true, 1);
                        } else if (r26.i0.p(str, "fail", true)) {
                            if (!a0Var.f225828h) {
                                a0Var.f225828h = true;
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12738, aVar.f225817a, java.lang.Integer.valueOf(aVar.f225820d), java.lang.Integer.valueOf(aVar.f225821e), 2);
                            }
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(408L, 4L, 1L, false);
                            a0Var.a(false, -1);
                        }
                    } else {
                        if (!a0Var.f225828h) {
                            a0Var.f225828h = true;
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12738, aVar.f225817a, java.lang.Integer.valueOf(aVar.f225820d), java.lang.Integer.valueOf(aVar.f225821e), 2);
                        }
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(408L, 4L, 1L, false);
                    }
                }
                com.tencent.kinda.framework.WxCrossServices.report.reset();
            }
        });
    }

    @Override // h45.q
    public void startJSApiWCPaySecurityCrosscut(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            return;
        }
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("secure_crosscut", "1");
        create.putString("appId", (java.lang.String) map.get("appId"));
        create.putString("timeStamp", (java.lang.String) map.get("timeStamp"));
        create.putString("nonceStr", (java.lang.String) map.get("nonceStr"));
        create.putString("package", (java.lang.String) map.get("package"));
        create.putString("signType", (java.lang.String) map.get("signType"));
        create.putString("paySign", (java.lang.String) map.get("paySign"));
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        notifyAllUseCase(create);
    }

    @Override // h45.q
    public void startJsApiComponentUseCase(android.content.Context context, com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData, final com.tencent.mm.ui.da daVar, final int i17) {
        initIfNeed();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        java.util.Map map = walletJsapiData.V;
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                create.putString((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        create.putJSEvent("JSEvent", new com.tencent.kinda.gen.KJSEvent() { // from class: com.tencent.kinda.framework.WxCrossServices.17
            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaCloseWebViewImpl(boolean z17, com.tencent.kinda.gen.VoidCallback voidCallback) {
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public void kindaEndWithResult(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
                if (daVar != null) {
                    int i18 = str.endsWith("ok") ? -1 : str.endsWith("fail") ? 5 : 0;
                    android.content.Intent intent = new android.content.Intent();
                    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : hashMap.entrySet()) {
                        intent.putExtra(entry2.getKey(), entry2.getValue());
                    }
                    daVar.mmOnActivityResult(i17, i18, intent);
                }
            }

            @Override // com.tencent.kinda.gen.KJSEvent
            public com.tencent.kinda.gen.KindaJSEventType kindaGetType() {
                return com.tencent.kinda.gen.KindaJSEventType.WEB;
            }
        });
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase(walletJsapiData.W, create, (com.tencent.kinda.gen.UseCaseCallback) null);
    }

    @Override // h45.q
    public void startKindaWalletLockVerify(android.content.Intent intent, int i17, final h45.i iVar) {
        com.tencent.mars.xlog.Log.i(TAG, "startKindaWalletLockVerify, walletLockType is %s", java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            ((h45.q) i95.n0.c(h45.q.class)).startTouchLockUseCase(intent, false, new h45.i() { // from class: com.tencent.kinda.framework.WxCrossServices$$b
                @Override // h45.i
                public final void onKindaBusinessCallback(android.content.Intent intent2) {
                    com.tencent.kinda.framework.WxCrossServices.lambda$startKindaWalletLockVerify$0(h45.i.this, intent2);
                }
            });
        } else if (i17 == 1) {
            ((h45.q) i95.n0.c(h45.q.class)).startPatternLockUseCase(intent, false, new h45.i() { // from class: com.tencent.kinda.framework.WxCrossServices$$c
                @Override // h45.i
                public final void onKindaBusinessCallback(android.content.Intent intent2) {
                    com.tencent.kinda.framework.WxCrossServices.lambda$startKindaWalletLockVerify$1(h45.i.this, intent2);
                }
            });
        }
    }

    @Override // h45.q
    public void startListen(java.lang.String str, h45.n nVar) {
        com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.INSTANCE.startListen(str, nVar);
    }

    @Override // h45.q
    public boolean startLqtDetailUseCaseInMMProcess(android.content.Context context) {
        return startLqtDetailUseCase(context, com.tencent.kinda.gen.ITransmitKvData.create());
    }

    @Override // h45.q
    public boolean startLqtDetailUseCaseInOtherProcess() {
        com.tencent.mars.xlog.Log.i(TAG, "start LqtDetailUseCase");
        com.tencent.mm.wallet_core.b.a().getClass();
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            com.tencent.mars.xlog.Log.i(TAG, "is main thread");
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "is not main thread");
        }
        startUseCase("lqt", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.23
            private byte _hellAccFlag_;

            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                java.lang.String string = iTransmitKvData.getString("dataSource");
                java.lang.String string2 = iTransmitKvData.getString("cmdWord");
                if (com.tencent.mm.sdk.platformtools.t8.K0(string) || com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "datasource or cmdword is null!");
                    return;
                }
                java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                if (k17.get() == null) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "top activity null");
                    return;
                }
                android.app.Activity activity = (android.app.Activity) k17.get();
                if (string.equals("lqt")) {
                    if (string2.equals("startAutoChargeSetting")) {
                        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtBalanceAutoTransferUI.class);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(activity, arrayList.toArray(), "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(activity, "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (string2.equals("startPlainIndex")) {
                        android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanBeforeHomeUI.class);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(activity, "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (string2.equals("jumpStaticVideo")) {
                        java.lang.String string3 = iTransmitKvData.getString("video_url");
                        android.content.Intent intent3 = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletKnowLqtFullScreenVideoUI.class);
                        intent3.putExtra("videoUrl", string3);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(activity, arrayList3.toArray(), "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activity.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(activity, "com/tencent/kinda/framework/WxCrossServices$23", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    if (string2.equals("jumpVideoFeed")) {
                        java.lang.String string4 = iTransmitKvData.getString("feed_id");
                        java.lang.String string5 = iTransmitKvData.getString("nonce_id");
                        android.content.Intent intent4 = new android.content.Intent();
                        intent4.putExtra("feed_object_id", pm0.v.Z(string4));
                        intent4.putExtra("feed_object_nonceId", string5);
                        intent4.putExtra("key_comment_scene", 1);
                        intent4.putExtra("tab_type", 1001);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        ya2.e1.f460472a.A(activity, intent4, false);
                    }
                }
            }
        });
        return true;
    }

    @Override // h45.q
    public boolean startLqtDetailUseCaseWithBalanceInMMProcess(android.content.Context context, long j17) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putLong("lqtWalletBalance", j17);
        return startLqtDetailUseCase(context, create);
    }

    @Override // h45.q
    public boolean startLqtFetchUseCase(android.content.Context context, final android.content.Intent intent, final h45.i iVar) {
        com.tencent.mars.xlog.Log.i(TAG, "start LqtSaveFetchUseCase");
        com.tencent.mm.wallet_core.b.a().getClass();
        initIfNeed();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("entrance_type", intent.getIntExtra("entrance_type", 0));
        create.putString("bind_serial", intent.getStringExtra("card_serial"));
        create.putString("amount", intent.getStringExtra("fill_money"));
        startUseCase("LQTRedeemUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.26
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (iVar != null) {
                    java.util.Iterator<java.lang.String> it = iTransmitKvData.allKeys().iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        intent.putExtra(next, iTransmitKvData.getString(next));
                    }
                    iVar.onKindaBusinessCallback(intent);
                }
            }
        });
        return true;
    }

    public void startLqtFixedDepositEntranceUseCase(final android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(TAG, "start LqtFixedDepositEntranceUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("LQTFixedDepositEntranceUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.27
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if ((context instanceof com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI) && iTransmitKvData != null && iTransmitKvData.getInt("LQTMainPageShouldRefresh") == 1) {
                    ((com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI) context).Y6(0, true);
                }
            }
        });
    }

    @Override // h45.q
    public void startLqtFixedDepositMakePlanUseCase(final android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(TAG, "start LqtFixedDepositMakePlanUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        create.putInt("entry_scene", bundle.getInt("entry_scene"));
        startUseCase("LQTFixedDepositMakePlanUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.28
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if ((context instanceof com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI) && iTransmitKvData != null && iTransmitKvData.getInt("LQTMainPageShouldRefresh") == 1) {
                    ((com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI) context).Y6(0, true);
                }
            }
        });
    }

    @Override // h45.q
    public void startLqtFixedDepositPlanListUseCase(final android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(TAG, "start LqtFixedDepositPlanListUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("LQTFixedDepositPlanListUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.29
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if ((context instanceof com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI) && iTransmitKvData != null && iTransmitKvData.getInt("LQTMainPageShouldRefresh") == 1) {
                    ((com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI) context).Y6(0, true);
                }
            }
        });
    }

    @Override // h45.q
    public boolean startLqtSaveUseCase(android.content.Context context, final android.content.Intent intent, final h45.i iVar) {
        com.tencent.mars.xlog.Log.i(TAG, "start LqtSaveUseCase");
        com.tencent.mm.wallet_core.b.a().getClass();
        initIfNeed();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("entrance_type", intent.getIntExtra("entrance_type", 0));
        create.putString("bind_serial", intent.getStringExtra("card_serial"));
        create.putString("outer_trans_money", intent.getStringExtra("fill_money"));
        if (intent.getIntExtra("entrance_type", 0) == 14) {
            create.putLong("limit_cashier_amount", (long) com.tencent.mm.sdk.platformtools.t8.F(intent.getStringExtra("fill_money"), 0.0d));
        }
        startUseCase("LQTPurchaseUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.25
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (iVar != null) {
                    java.util.Iterator<java.lang.String> it = iTransmitKvData.allKeys().iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        intent.putExtra(next, iTransmitKvData.getString(next));
                    }
                    iVar.onKindaBusinessCallback(intent);
                }
            }
        });
        return true;
    }

    @Override // h45.q
    public void startModifyPwdUseCase(android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(TAG, "start startModifyPwdUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, gm0.j1.b().j() + "_" + com.tencent.mm.wallet_core.ui.r1.B());
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("modifyPwdUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.30
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            }
        });
    }

    @Override // h45.q
    public void startOfflinePay(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 18L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startOfflinePay %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        re4.n.k();
        report.markEnterPay(8);
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("req_key", str);
        create.putString("prefer_bind_serial", str2);
        create.putInt("payScene", 8);
        create.putInt("payChannel", i17);
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("offlinePay", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.10
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                boolean bool = iTransmitKvData.getBool("pay_result");
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startOfflinePay UseCaseCallback pay_result: " + bool);
                com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
                am.s10 s10Var = walletPayResultEvent.f54965g;
                s10Var.f7863c = 0;
                if (bool) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                    s10Var.f7863c = -1;
                    s10Var.f7861a = new android.content.Intent();
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("payScene", 8);
                    bundle.putString("pay_bind_serial", iTransmitKvData.getString("pay_bind_serial"));
                    bundle.putInt("isFromKinda", 1);
                    s10Var.f7861a.putExtras(bundle);
                } else {
                    s10Var.f7863c = 0;
                    s10Var.f7861a = new android.content.Intent();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putInt("payScene", 8);
                    bundle2.putInt("isFromKinda", 1);
                    s10Var.f7861a.putExtras(bundle2);
                }
                walletPayResultEvent.e();
                com.tencent.kinda.framework.WxCrossServices.report.reset();
            }
        });
    }

    @Override // h45.q
    public void startOfflinePrePay(android.content.Context context, int i17, int i18, int i19, java.util.Map<java.lang.String, java.lang.String> map, boolean z17, java.lang.String str, final h45.i iVar) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startOfflinePrePay %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        this.walletLockListener.alive();
        this.jsApiOfflineUserBindQueryListener.alive();
        wo3.c0 Ri = to3.c0.Ai().Ri();
        if (Ri.f448144a == null) {
            Ri.f448144a = new java.util.ArrayList();
        }
        ((java.util.ArrayList) Ri.f448144a).add(new java.lang.ref.WeakReference(this));
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("entry_scene", i17);
        create.putInt("payScene", 8);
        create.putInt("payChannel", i18);
        create.putInt("pay_receipt_scene", i19);
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        create.putBool("from_pinned_shortcut", z17);
        create.putString("mkt_biz_info", str);
        if (map != null) {
            com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
            create2.putString("card_id", map.get("card_id"));
            create2.putString("user_card_id", map.get("user_card_id"));
            create2.putString("card_code", map.get("card_code"));
            create.putKvData("member_card", create2);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 105L, 1L, false);
        startUseCase("offline", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.11
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                boolean bool = iTransmitKvData.getBool("Offline.shouldStopUseCase");
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "[startOfflinePrePay] CallBack Offline.shouldStopUseCase %s", java.lang.Boolean.valueOf(bool));
                if (bool) {
                    com.tencent.kinda.framework.WxCrossServices.this.walletLockListener.dead();
                    com.tencent.kinda.framework.WxCrossServices.this.jsApiOfflineUserBindQueryListener.dead();
                    to3.c0.Ai().Ri().j(com.tencent.kinda.framework.WxCrossServices.this);
                    if (iTransmitKvData.getBool("dropServiceHome")) {
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startOfflinePrePay dropServiceHome send OfflineUseCaseFinishEvent");
                        com.tencent.mm.autogen.events.OfflineUseCaseFinishEvent offlineUseCaseFinishEvent = new com.tencent.mm.autogen.events.OfflineUseCaseFinishEvent();
                        offlineUseCaseFinishEvent.f54559g.f6563a = 1;
                        offlineUseCaseFinishEvent.e();
                    }
                }
                if (iVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra(com.tencent.kinda.framework.WxCrossServices.OFFLINE_FINISH_KEY, iTransmitKvData.getBool(com.tencent.kinda.framework.WxCrossServices.OFFLINE_FINISH_KEY));
                    iVar.onKindaBusinessCallback(intent);
                }
            }
        });
    }

    @Override // h45.q
    public boolean startOverseaWalletSuccPageUseCase(final android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mm.wallet_core.b a17 = com.tencent.mm.wallet_core.b.a();
        a17.getClass();
        if (!a17.d(e42.d0.clicfg_kinda_hk_wallet_succ_page_android, true)) {
            com.tencent.mars.xlog.Log.i(TAG, "startOverseaWalletSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is false");
            return false;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 20L, 1L, false);
        com.tencent.mars.xlog.Log.i(TAG, "startOverseaWalletSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is true");
        initIfNeed();
        preparePayDesk();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("appid", bundle.getString("appid"));
        create.putString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, bundle.getString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP));
        create.putString("nonce_str", bundle.getString("nonce_str"));
        create.putString("package", bundle.getString("package"));
        create.putInt("input_pay_scene", bundle.getInt("input_pay_scene"));
        create.putString("sign_type", bundle.getString("sign_type"));
        create.putString("pay_sign", bundle.getString("pay_sign"));
        create.putString("req_key", bundle.getString("req_key"));
        create.putInt("origin_pay_scene", bundle.getInt("origin_pay_scene"));
        create.putString("order_id", bundle.getString("order_id"));
        create.putInt("retry_max_count", bundle.getInt("retry_max_count"));
        create.putInt("retry_interval_seconds", bundle.getInt("retry_interval_seconds"));
        create.putString("retry_default_wording", bundle.getString("retry_default_wording"));
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("overseaWalletSuccPage", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.36
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (context instanceof com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI) {
                    java.lang.String string = iTransmitKvData.getString("result");
                    boolean bool = iTransmitKvData.getBool("is_pending");
                    boolean bool2 = iTransmitKvData.getBool("is_jsapi_close_page");
                    com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI walletMixOrderInfoUI = (com.tencent.mm.plugin.wallet_core.ui.WalletMixOrderInfoUI) context;
                    walletMixOrderInfoUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack begin, result=%s is_pending=%b is_jsapi_close_page=%b", string, java.lang.Boolean.valueOf(bool), java.lang.Boolean.valueOf(bool2));
                    walletMixOrderInfoUI.f180006e = bool;
                    if (string.equalsIgnoreCase("pre_succ")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack not handle pre_succ");
                    } else if (string.equalsIgnoreCase("after_show_succ_page")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack handle after_show_succ_page, payScene=%d", java.lang.Integer.valueOf(walletMixOrderInfoUI.f180015q));
                        if (walletMixOrderInfoUI.f180015q == 1) {
                            com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent webViewWillCloseWindowEvent = new com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent();
                            webViewWillCloseWindowEvent.f54989g.f7689a = -1;
                            webViewWillCloseWindowEvent.e();
                            walletMixOrderInfoUI.setResult(-1);
                            walletMixOrderInfoUI.finish();
                        }
                    } else if (string.equalsIgnoreCase("ok")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack handle ok, payScene=%d prepayId=%s", java.lang.Integer.valueOf(walletMixOrderInfoUI.f180015q), walletMixOrderInfoUI.f180009h);
                        if (walletMixOrderInfoUI.f180015q == 2) {
                            com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent webViewWillCloseWindowEvent2 = new com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent();
                            webViewWillCloseWindowEvent2.f54989g.f7689a = -1;
                            webViewWillCloseWindowEvent2.e();
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(walletMixOrderInfoUI.f180009h)) {
                                com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
                                android.content.Intent intent = new android.content.Intent();
                                intent.putExtra("intent_pay_end", true);
                                intent.putExtra("is_jsapi_close_page", bool2 ? 1 : 0);
                                am.s10 s10Var = walletPayResultEvent.f54965g;
                                s10Var.f7861a = intent;
                                s10Var.f7864d = walletMixOrderInfoUI.f180009h;
                                s10Var.f7863c = -1;
                                s10Var.f7866f = 1;
                                walletPayResultEvent.e();
                            }
                            walletMixOrderInfoUI.setResult(-1);
                            walletMixOrderInfoUI.finish();
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletMixOrderInfoUI", "onKindaOverseaWalletSuccPageBack handle else, payScene=%d prepayId=%s", java.lang.Integer.valueOf(walletMixOrderInfoUI.f180015q), walletMixOrderInfoUI.f180009h);
                        com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent webViewWillCloseWindowEvent3 = new com.tencent.mm.autogen.events.WebViewWillCloseWindowEvent();
                        webViewWillCloseWindowEvent3.f54989g.f7689a = 0;
                        webViewWillCloseWindowEvent3.e();
                        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent2 = new com.tencent.mm.autogen.events.WalletPayResultEvent();
                        java.lang.String str = walletMixOrderInfoUI.f180009h;
                        am.s10 s10Var2 = walletPayResultEvent2.f54965g;
                        s10Var2.f7864d = str;
                        s10Var2.f7863c = 0;
                        walletPayResultEvent2.e();
                        walletMixOrderInfoUI.setResult(0);
                        walletMixOrderInfoUI.finish();
                    }
                    if (iTransmitKvData.getString("result").equals("ok")) {
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startOverseaWalletSuccPageUseCase, publish ok WalletPayResultEvent");
                        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent3 = new com.tencent.mm.autogen.events.WalletPayResultEvent();
                        am.s10 s10Var3 = walletPayResultEvent3.f54965g;
                        s10Var3.f7863c = -1;
                        s10Var3.f7866f = 2;
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("key_is_clear_failure", -1);
                        s10Var3.f7861a = intent2;
                        walletPayResultEvent3.e();
                        return;
                    }
                    if (iTransmitKvData.getString("result").equals("fail")) {
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startOverseaWalletSuccPageUseCase, publish canceled WalletPayResultEvent");
                        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent4 = new com.tencent.mm.autogen.events.WalletPayResultEvent();
                        am.s10 s10Var4 = walletPayResultEvent4.f54965g;
                        s10Var4.f7863c = 0;
                        s10Var4.f7866f = 2;
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("key_is_clear_failure", -1);
                        s10Var4.f7861a = intent3;
                        walletPayResultEvent4.e();
                    }
                }
            }
        });
        return true;
    }

    @Override // h45.q
    public void startPatternLockUseCase(final android.content.Intent intent, boolean z17, final h45.i iVar) {
        com.tencent.mars.xlog.Log.i(TAG, "startPatternLockUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("lock_scene", 1);
        if (intent != null) {
            create.putBool("need_block_back", intent.getBooleanExtra("need_block_back", false));
        }
        create.putBool("need_remove_same", z17);
        startUseCase("patternLockUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.53
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                int i17 = iTransmitKvData.getInt("retCode");
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "patternLockUseCase kinda callback, retcode is %s", java.lang.Integer.valueOf(i17));
                if (i17 == 1) {
                    hu4.i.f285230a = android.os.SystemClock.elapsedRealtime();
                    hu4.i.e();
                    hu4.i.g();
                    hu4.i.f();
                }
                com.tencent.kinda.framework.WxCrossServices.this.handleWalletLockKindaCallBack(i17, intent, iVar);
            }
        });
    }

    @Override // h45.q
    public boolean startPayIBGJsGetSuccPageUseCase(final android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mm.wallet_core.b a17 = com.tencent.mm.wallet_core.b.a();
        a17.getClass();
        if (!a17.d(e42.d0.clicfg_kinda_hk_wallet_succ_page_android, true)) {
            com.tencent.mars.xlog.Log.i(TAG, "startPayIBGJsGetSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is false");
            return false;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 21L, 1L, false);
        com.tencent.mars.xlog.Log.i(TAG, "startPayIBGJsGetSuccPageUseCase, isKindaOverseaWalletSuccPageEnable is true");
        initIfNeed();
        preparePayDesk();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("appid", bundle.getString("appid"));
        create.putString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, bundle.getString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP));
        create.putString("nonce_str", bundle.getString("nonce_str"));
        create.putString("package", bundle.getString("package"));
        create.putString("sign_type", bundle.getString("sign_type"));
        create.putString("pay_sign", bundle.getString("pay_sign"));
        create.putString("webview_url", bundle.getString("webview_url"));
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("payIbgGetSuccPage", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.37
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (context instanceof com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoUI) {
                    java.lang.String string = iTransmitKvData.getString("result");
                    java.lang.String string2 = iTransmitKvData.getString("subscribe_username");
                    com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoUI walletIbgOrderInfoUI = (com.tencent.mm.plugin.wallet_core.ui.ibg.WalletIbgOrderInfoUI) context;
                    walletIbgOrderInfoUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletIbgOrderInfoUI", "onKindaPayIBGGetSuccPageBack, result: %s", string);
                    if (string.equalsIgnoreCase("fail")) {
                        walletIbgOrderInfoUI.setResult(0);
                    } else if (string.equalsIgnoreCase("ok")) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletIbgOrderInfoUI", "hy: doing netscene subscribe...subscribe_username: %s", string2);
                            gm0.j1.i();
                            gm0.j1.n().f273288b.g(new com.tencent.mm.wallet_core.model.a1(string2));
                        }
                        walletIbgOrderInfoUI.setResult(-1);
                    }
                    walletIbgOrderInfoUI.finish();
                }
            }
        });
        return true;
    }

    @Override // h45.q
    public void startPaySecurityUseCase(int i17, final h45.i iVar) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("entryScene", i17);
        int i18 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_cre_type;
        java.lang.String str = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_cre_name;
        java.lang.String str2 = ((pg0.a3) i95.n0.c(pg0.a3.class)).cj().y0().field_true_name;
        create.putString("payUseInfo:credInfo.credType", java.lang.String.valueOf(i18));
        create.putString("payUseInfo:credInfo.credName", str);
        create.putString("payUseInfo:usrName", str2);
        startUseCase("paySecurity", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.40
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (iVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("finished", iTransmitKvData.getInt("finished"));
                    iVar.onKindaBusinessCallback(intent);
                }
            }
        });
    }

    @Override // h45.q
    public void startQrcodeCollectionSettingUseCase(android.content.Intent intent, final h45.i iVar) {
        com.tencent.mars.xlog.Log.i(TAG, "startQrcodeCollectionSettingUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("key_collect_type", intent.getIntExtra("key_type", 1));
        create.putString("key_collect_currency_unit", intent.getStringExtra("key_currency_unit"));
        create.putInt("key_collect_fixed_fee", intent.getIntExtra("ftf_fixed_fee", 0));
        create.putString("key_collect_fixed_desc", intent.getStringExtra("ftf_fixed_desc"));
        create.putBool("key_collect_fixed_desc_required", intent.getBooleanExtra("ftf_fixed_desc_required", false));
        create.putString("key_collect_fixed_desc_placeholder", intent.getStringExtra("ftf_fixed_desc_placeholder"));
        create.putString("key_collect_payer_desc_switch_title", intent.getStringExtra("key_payer_desc_switch_title"));
        create.putString("key_collect_payer_desc_switch_sub_title", intent.getStringExtra("key_payer_desc_switch_sub_title"));
        create.putString("key_collect_payer_desc_fill_title", intent.getStringExtra("key_payer_desc_fill_title"));
        create.putString("key_collect_payer_desc_fill_hint", intent.getStringExtra("key_payer_desc_fill_hint"));
        long longExtra = intent.getLongExtra("ftf_fixed_current_shop_id", 0L);
        if (longExtra != 0) {
            create.putLong("key_collect_current_shop_id", longExtra);
        }
        startUseCase("qrcodeCollectionSettingsUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.50
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("key_error_msg", iTransmitKvData.getString("key_error_msg"));
                intent2.putExtra("ftf_pay_url", iTransmitKvData.getString("key_collect_pay_url"));
                intent2.putExtra("ftf_fixed_fee", (int) iTransmitKvData.getLong("key_collect_fee"));
                intent2.putExtra("ftf_fixed_fee_type", iTransmitKvData.getString("key_collect_fee_type"));
                intent2.putExtra("ftf_fixed_desc", iTransmitKvData.getString("key_collect_fee_desc"));
                intent2.putExtra("key_error_level", iTransmitKvData.getInt("key_collect_error_level"));
                intent2.putExtra("key_currency_unit", iTransmitKvData.getString("key_collect_currenct_unit"));
                intent2.putExtra("key_save_notify_info", new java.lang.String(iTransmitKvData.getBinary("key_collect_save_notify_info")));
                intent2.putExtra("ftf_fixed_desc_required", iTransmitKvData.getBool("key_collect_desc_required"));
                intent2.putExtra("ftf_fixed_desc_placeholder", iTransmitKvData.getString("key_collect_fee_desc_placeholder"));
                iVar.onKindaBusinessCallback(intent2);
            }
        });
    }

    @Override // h45.q
    public void startResetPwdUseCase(android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 17L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startResetPwdUseCase %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        if (bundle == null) {
            create.putBool("bResetPwdFromPayManage", false);
            create.putInt("realnameScene", 0);
            create.putInt("payScene", 0);
        } else {
            create.putBool("bResetPwdFromPayManage", bundle.getBoolean("key_is_paymanager", false));
            create.putInt("realnameScene", 0);
            create.putInt("payScene", 0);
        }
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("resetPwdUseCase", create, (com.tencent.kinda.gen.UseCaseCallback) null);
    }

    @Override // h45.q
    public boolean startResetPwdUseCaseFromJsApi(android.content.Intent intent, h45.i iVar) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putBool("fromJsapi", true);
        startUseCase("resetPwdUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.54
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            }
        });
        return true;
    }

    @Override // h45.q
    public void startSNSPay(final android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 10L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startSNSPay %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        re4.n.k();
        report.markEnterPay(payInfo.f192109e);
        if (!((h45.q) i95.n0.c(h45.q.class)).canOpenKindaCashier(context)) {
            db5.e1.y(context, context.getString(com.tencent.mm.R.string.knf), "", context.getString(com.tencent.mm.R.string.apu), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.WxCrossServices.9
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i17) {
                    android.content.Context context2 = context;
                    if (context2 instanceof android.app.Activity) {
                        ((android.app.Activity) context2).finish();
                    }
                }
            });
            return;
        }
        com.tencent.kinda.framework.sns_cross.ISnsSceneService createService = com.tencent.kinda.framework.sns_cross.SnsSceneServiceFactory.createService(payInfo.f192109e);
        com.tencent.kinda.framework.sns_cross.ISnsUseCaseCallback createCallback = com.tencent.kinda.framework.sns_cross.SnsSceneServiceFactory.createCallback(payInfo.f192109e);
        createService.setData(context, payInfo);
        createCallback.setData(context, payInfo);
        com.tencent.kinda.gen.ITransmitKvData generateSnsUseCaseData = createService.generateSnsUseCaseData();
        generateSnsUseCaseData.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        com.tencent.mars.xlog.Log.i(TAG, "startSnsPay initRawUrl: %s, latestUrl: %s, initTimestamp: %d", generateSnsUseCaseData.getString("initRawUrl"), generateSnsUseCaseData.getString("latestUrl"), java.lang.Long.valueOf(generateSnsUseCaseData.getLong("initTimestamp")));
        startUseCase("snsPay", generateSnsUseCaseData, (com.tencent.kinda.gen.UseCaseCallback) createCallback);
    }

    @Override // h45.q
    public void startScanQRCodePay(android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 13L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startScanQRCodePay %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        re4.n.k();
        report.markEnterPay(1);
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("m_A8keyScene", bundle.getInt("a8key_scene"));
        create.putString("qrCodeUrl", bundle.getString("qrcode_url"));
        create.putInt("payChannel", bundle.getInt("channel"));
        create.putInt("payScene", 1);
        create.putInt("chat_type", bundle.getInt("chat_type"));
        create.putInt("send_type", bundle.getInt("send_type"));
        create.putInt("qrcode_session_type", bundle.getInt("qrcode_session_type"));
        create.putString("qrcode_session_name", bundle.getString("qrcode_session_name"));
        create.putString("qrcode_timeline_objid", bundle.getString("qrcode_timeline_objid"));
        create.putString("qrcodeSenderName", bundle.getString("qrcodeSenderName"));
        create.putString("qrcodeSenderMsgId", bundle.getString("qrcodeSenderMsgId"));
        java.lang.String string = bundle.getString("payInitRawUrl");
        long j17 = bundle.getLong("payInitTimestamp", 0L);
        if (j17 == 0) {
            j17 = c01.id.a() / 1000;
        }
        java.lang.String string2 = bundle.getString("qrcode_url", "");
        create.putString("initRawUrl", string == null ? "" : string);
        create.putLong("initTimestamp", j17);
        create.putString("latestUrl", string2 != null ? string2 : "");
        com.tencent.mars.xlog.Log.i(TAG, "startScanQRCodePay initRawUrl: %s, latestUrl: %s, initTimestamp: %d", string, string2, java.lang.Long.valueOf(j17));
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.mDialogForScanPay;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.mDialogForScanPay = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490386tj), context.getString(com.tencent.mm.R.string.kvq), false, false, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.WxCrossServices.6
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
            }
        });
        startUseCase("scanQRCodePay", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.7
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startScanQRCodePay call()");
                if (com.tencent.kinda.framework.WxCrossServices.this.mDialogForScanPay != null) {
                    com.tencent.kinda.framework.WxCrossServices.this.mDialogForScanPay.dismiss();
                    com.tencent.kinda.framework.WxCrossServices.this.mDialogForScanPay = null;
                }
                com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
                int i17 = iTransmitKvData.getInt("scanQRCodeState");
                am.s10 s10Var = walletPayResultEvent.f54965g;
                s10Var.f7863c = i17;
                s10Var.f7865e = true;
                iTransmitKvData.getString("failReason");
                s10Var.getClass();
                walletPayResultEvent.e();
                com.tencent.kinda.framework.WxCrossServices.report.reset();
            }
        });
    }

    @Override // h45.q
    public void startTeenagerPay(android.content.Context context, byte[] bArr, final h45.i iVar) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        if (bArr != null && bArr.length > 0) {
            create.putBinary("respData", bArr);
        }
        startUseCase("teenagerPayUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.46
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("event", iTransmitKvData.getString("event"));
                iVar.onKindaBusinessCallback(intent);
            }
        });
    }

    @Override // h45.q
    public void startTeenagerPayGetDetail(android.content.Context context, final h45.o oVar) {
        startUseCase("teenagerPayGetDetailUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.45
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                final java.lang.String string = iTransmitKvData.getString("status");
                final byte[] binary = iTransmitKvData.getBinary("respData");
                com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$$b settingsTeenModeMain$$b = (com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$$b) oVar;
                settingsTeenModeMain$$b.getClass();
                int i17 = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.I;
                final com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = settingsTeenModeMain$$b.f172871a;
                settingsTeenModeMain.getClass();
                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain2 = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.this;
                        android.view.View view = settingsTeenModeMain2.f172858o;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "lambda$updateWCPayLimit$1", "(Ljava/lang/String;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "lambda$updateWCPayLimit$1", "(Ljava/lang/String;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        settingsTeenModeMain2.f172857n.setText(string);
                        settingsTeenModeMain2.f172857n.setVisibility(0);
                        settingsTeenModeMain2.f172859p = binary;
                    }
                });
            }
        });
    }

    @Override // h45.q
    public void startTouchLockUseCase(final android.content.Intent intent, boolean z17, final h45.i iVar) {
        com.tencent.mars.xlog.Log.i(TAG, "startTouchLockUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("lock_scene", 1);
        if (intent != null) {
            create.putBool("need_block_back", intent.getBooleanExtra("need_block_back", false));
        }
        create.putBool("need_remove_same", z17);
        startUseCase("touchLockUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.52
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                int i17 = iTransmitKvData.getInt("retCode");
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "touchLockUseCase kinda callback, retcode is %s", java.lang.Integer.valueOf(i17));
                if (i17 == 1) {
                    java.lang.String string = iTransmitKvData.getString("auth_fid");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        fu4.a.a(string);
                    }
                    if (!iTransmitKvData.getBool("verifyByPwd")) {
                        fu4.a.f266884a = android.os.SystemClock.elapsedRealtime();
                    }
                }
                com.tencent.kinda.framework.WxCrossServices.this.handleWalletLockKindaCallBack(i17, intent, iVar);
            }
        });
    }

    @Override // h45.q
    public void startUiTest(java.lang.String str) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        create.putString("url", str);
        startUseCase("uiTest", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.35
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (iTransmitKvData.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) == 1) {
                    throw null;
                }
                if ("WalletDemoUI".equals(iTransmitKvData.getString("url"))) {
                    j45.l.h(com.tencent.kinda.framework.widget.tools.KindaContext.get(), "repairer", ".ui.RepairerPayDebugUI");
                }
            }
        });
    }

    @Override // h45.q
    public void startUniPcPay(android.os.Bundle bundle, final h45.i iVar) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 22L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "[startUniPcPay] %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        re4.n.k();
        report.markEnterPay(88);
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("qrCodeUrl", bundle.getString("qrcode_url"));
        create.putInt("payChannel", bundle.getInt("pay_channel"));
        create.putInt("payScene", bundle.getInt("pay_scene"));
        create.putInt("qrcode_session_type", bundle.getInt("qrcode_session_type"));
        create.putString("qrcode_session_name", bundle.getString("qrcode_session_name"));
        create.putString("qrcodeSenderName", bundle.getString("qrcode_sender_name"));
        create.putString("qrcode_timeline_objid", bundle.getString("qrcode_timeline_objid"));
        create.putInt("chat_type", bundle.getInt("chat_type"));
        create.putInt("send_type", bundle.getInt("send_type"));
        create.putString("qrcodeSenderMsgId", bundle.getString("msg_svr_id"));
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("uniPcPay", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.8
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (iVar != null && iTransmitKvData != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, iTransmitKvData.getInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE));
                    iVar.onKindaBusinessCallback(intent);
                }
                com.tencent.kinda.framework.WxCrossServices.report.reset();
            }
        });
    }

    @Override // h45.q
    public void startUseCase(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mars.xlog.Log.i(TAG, "start common useCase");
        if ((obj instanceof com.tencent.kinda.gen.ITransmitKvData) && (obj2 instanceof com.tencent.kinda.gen.UseCaseCallback)) {
            com.tencent.kinda.gen.ITransmitKvData iTransmitKvData = (com.tencent.kinda.gen.ITransmitKvData) obj;
            iTransmitKvData.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
            startUseCase(str, iTransmitKvData, (com.tencent.kinda.gen.UseCaseCallback) obj2);
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "startUseCase fail, data or callback is not the right type");
    }

    @Override // h45.q
    public boolean startWalletBalanceEntryUseCase(final android.content.Context context) {
        com.tencent.mm.wallet_core.b.a().getClass();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        gm0.j1.i();
        int intValue = ((java.lang.Integer) gm0.j1.u().c().l(196660, 0)).intValue();
        gm0.j1.i();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue());
        boolean z17 = (32768 & intValue) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "isShowRealnameGuide, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(intValue));
        if (z17) {
            gm0.j1.i();
            create.putString("balance:entry:realnameGuideTitle", (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_RELEAY_NAME_TIP_CONTENT_STRING_SYNC, null));
        }
        startUseCase("balanceEntryUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.21
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                java.lang.String string = iTransmitKvData.getString("jumpToNativeUrl");
                java.lang.String string2 = iTransmitKvData.getString("fromScene");
                android.app.Activity crossActivity = com.tencent.kinda.framework.WxCrossServices.this.getCrossActivity();
                if (com.tencent.mm.sdk.platformtools.t8.K0(string) || crossActivity == null) {
                    return;
                }
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "balance open nativeUrl: %s, fromScene: %s", string, string2);
                final com.tencent.mm.plugin.wallet.balance.model.lqt.g1 g1Var = string2.equals("recharge") ? com.tencent.mm.plugin.wallet.balance.model.lqt.g1.f177639f : com.tencent.mm.plugin.wallet.balance.model.lqt.g1.f177638e;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("fromScene", g1Var.ordinal());
                bundle.putString("bindSerial", iTransmitKvData.getString("lqtsave:bindSerial"));
                bundle.putString("amountString", iTransmitKvData.getString("lqtsave:amountString"));
                final int a17 = com.tencent.mm.plugin.wallet.balance.model.lqt.l1.f177688a.a(crossActivity, string, bundle);
                if (a17 > 0) {
                    if (crossActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) {
                        ((com.tencent.mm.framework.app.UIPageFragmentActivity) crossActivity).f68164t.put(java.lang.Integer.valueOf(a17), new ej0.f() { // from class: com.tencent.kinda.framework.WxCrossServices.21.1
                            @Override // ej0.f
                            public void handle(int i17, android.content.Intent intent) {
                                if (a17 != 32770) {
                                    return;
                                }
                                com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
                                if (g1Var == com.tencent.mm.plugin.wallet.balance.model.lqt.g1.f177638e) {
                                    create2.putInt("balance:entry:refresh", 1);
                                } else if (i17 == -1) {
                                    create2.putInt("balance:recharge:chargedLQTInBalance", 1);
                                }
                                com.tencent.kinda.framework.WxCrossServices.this.notifyAllUseCase(create2);
                            }
                        });
                    }
                } else if (string.startsWith("wxpay://lqp/balanceQuotaState")) {
                    j45.l.j(context, "wallet_ecard", ".ui.WalletECardLogoutUI", new android.content.Intent(), null);
                }
            }
        });
        return true;
    }

    @Override // h45.q
    public void startWalletBalanceFetchPageUseCase(android.content.Context context, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(TAG, "startWalletBalanceFetchPageUseCase");
        initIfNeed();
        startUseCase("FetchBalancePageUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.19
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
            }
        });
    }

    @Override // h45.q
    public void startWalletBalanceFetchUseCase(final android.content.Context context, final android.os.Bundle bundle) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startWalletBalanceFetchUseCase %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("payScene", bundle.getInt("payScene"));
        create.putString("totalFee", bundle.getString("totalFee"));
        create.putString("feeType", bundle.getString("feeType"));
        create.putString("bankType", bundle.getString("bankType"));
        create.putString("bindSerial", bundle.getString("bindSerial"));
        create.putString("operation", bundle.getString("operation"));
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("fetchBalance", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.18
            private byte _hellAccFlag_;

            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (context instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI) {
                    int i17 = iTransmitKvData.getInt("result");
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startWalletBalanceFetchUseCase result：%s", java.lang.Integer.valueOf(i17));
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startWalletBalanceFetch unknown result：%s", java.lang.Integer.valueOf(i17));
                                return;
                            } else {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16398, bundle.getString("reportSessionId"), 8, "", "");
                                return;
                            }
                        }
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI.class);
                    intent.addFlags(67108864);
                    android.content.Context context2 = context;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context2, arrayList.toArray(), "com/tencent/kinda/framework/WxCrossServices$18", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context2, "com/tencent/kinda/framework/WxCrossServices$18", "call", "(Lcom/tencent/kinda/gen/ITransmitKvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
        });
    }

    @Override // h45.q
    public void startWalletBalanceRechargeUIUseCase(android.content.Context context) {
        startUseCase("balanceRechargeUseCase", com.tencent.kinda.gen.ITransmitKvData.create(), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.22
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                java.lang.String string = iTransmitKvData.getString("jumpToNativeUrl");
                android.app.Activity crossActivity = com.tencent.kinda.framework.WxCrossServices.this.getCrossActivity();
                if (com.tencent.mm.sdk.platformtools.t8.K0(string) || crossActivity == null) {
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                com.tencent.mm.plugin.wallet.balance.model.lqt.f1 f1Var = com.tencent.mm.plugin.wallet.balance.model.lqt.g1.f177637d;
                bundle.putInt("fromScene", 1);
                bundle.putString("bindSerial", iTransmitKvData.getString("lqtsave:bindSerial"));
                bundle.putString("amountString", iTransmitKvData.getString("lqtsave:amountString"));
                final int a17 = com.tencent.mm.plugin.wallet.balance.model.lqt.l1.f177688a.a(crossActivity, string, bundle);
                if (a17 <= 0 || !(crossActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity)) {
                    return;
                }
                ((com.tencent.mm.framework.app.UIPageFragmentActivity) crossActivity).f68164t.put(java.lang.Integer.valueOf(a17), new ej0.f() { // from class: com.tencent.kinda.framework.WxCrossServices.22.1
                    @Override // ej0.f
                    public void handle(int i17, android.content.Intent intent) {
                        if (a17 != 32770) {
                            return;
                        }
                        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                        create.putInt("balance:recharge:chargedLQTInBalance", 1);
                        com.tencent.kinda.framework.WxCrossServices.this.notifyAllUseCase(create);
                    }
                });
            }
        });
    }

    @Override // h45.q
    public void startWalletBalanceSaveUseCase(final android.content.Context context, final android.os.Bundle bundle) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startWalletBalanceSaveUseCase %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("payScene", bundle.getInt("payScene"));
        create.putString("totalFee", bundle.getString("totalFee"));
        create.putString("feeType", bundle.getString("feeType"));
        create.putString("bankType", bundle.getString("bankType"));
        create.putString("bindSerial", bundle.getString("bindSerial"));
        create.putString("operation", bundle.getString("operation"));
        startUseCase("saveBalance", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.20
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (context instanceof com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI) {
                    int i17 = iTransmitKvData.getInt("result");
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startWalletBalanceSaveUseCase result：%s", java.lang.Integer.valueOf(i17));
                    if (i17 == 1) {
                        android.content.Context context2 = context;
                        ((com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI) context2).f177846v = false;
                        ((com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI) context2).finish();
                    } else if (i17 == 2) {
                        ((com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI) context).f177846v = false;
                    } else if (i17 != 3) {
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "startWalletBalanceSave unknown result：%s", java.lang.Integer.valueOf(i17));
                    } else {
                        ((com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI) context).f177846v = false;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16398, bundle.getString("reportSessionId"), 8, "", "");
                    }
                }
            }
        });
    }

    @Override // h45.q
    public void startWalletLockSettingUseCase(android.content.Context context, android.content.Intent intent, final h45.i iVar) {
        com.tencent.mars.xlog.Log.i(TAG, "startWalletLockSettingUseCase");
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        if (intent.getIntExtra("key_wallet_lock_setting_scene", -1) == 1) {
            create.putBool("hide_checkmark", true);
        }
        startUseCase("walletLockSettingUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.51
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "wallet lock setting kinda callback, action_code is %d", java.lang.Integer.valueOf(iTransmitKvData.getInt("action_code")));
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("result", true);
                h45.i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.onKindaBusinessCallback(intent2);
                }
            }
        });
    }

    @Override // h45.q
    public void startWalletSecuritySetting(android.content.Context context, android.content.Intent intent) {
        android.app.Activity crossActivity = getCrossActivity();
        if (crossActivity != null) {
            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().l(crossActivity, intent);
        }
    }

    @Override // h45.q
    public void startWeBankLoanPay(android.content.Context context, java.lang.String str, java.lang.String str2, final h45.p pVar) {
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("token", str);
        create.putString("jsapi_reqkey", str2);
        startUseCase("webankLoanPayUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.47
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (iTransmitKvData.getInt("pay_success") != 1) {
                    ((com.tencent.mm.plugin.wallet.pay.ui.n) pVar).a(null, null);
                    return;
                }
                ((com.tencent.mm.plugin.wallet.pay.ui.n) pVar).a(iTransmitKvData.getString("result_token"), iTransmitKvData.getString("bind_serial"));
            }
        });
    }

    @Override // h45.q
    public void startWxpayAppPay(final android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startWxpayAppPay %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(1004L, 11L, 1L, false);
        re4.n.k();
        report.markEnterPay(2);
        com.tencent.mm.opensdk.modelpay.PayReq payReq = new com.tencent.mm.opensdk.modelpay.PayReq();
        payReq.fromBundle(bundle);
        final com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("appid", payReq.appId);
        create.putString("partner_id", payReq.partnerId);
        create.putString("prepay_id", payReq.prepayId);
        create.putString("nonce_str", payReq.nonceStr);
        create.putString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, payReq.timeStamp);
        create.putString("package", payReq.packageValue);
        create.putString("sign", payReq.sign);
        create.putString("sign_type", payReq.signType);
        create.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
        create.putString("app_package_name", str2);
        create.putString("safe_app_package_name", bundle.getString("key_app_packagename_safe"));
        create.putString("app_display_name", str3);
        create.putString("android_sign", str4);
        create.putString("app_token", bundle.getString("key_app_token"));
        create.putInt("app_token_verifyResult", bundle.getInt("key_app_token_verify_result"));
        create.putString("app_sdkVersion", "" + bundle.getInt("key_sdk_version", 0));
        create.putString("safe_app_sdkVersion", "" + bundle.getInt("key_sdk_version_safe", 0));
        create.putString("bundle_id", "");
        create.putInt("payScene", 2);
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        final java.lang.String str5 = bundle.getInt("_wxapi_command_type", 0) == 27 ? "jointPay" : "appPay";
        com.tencent.mars.xlog.Log.i(TAG, "app url: %s", str5);
        if (((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).f188570e) {
            startUseCase(str5, create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.2
                @Override // com.tencent.kinda.gen.UseCaseCallback
                public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                    android.content.Context context2 = context;
                    if (context2 instanceof com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI) {
                        ((com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI) context2).finish();
                        com.tencent.kinda.framework.WxCrossServices.report.reset();
                    }
                }
            });
            return;
        }
        com.tencent.mars.xlog.Log.w(TAG, "soter has not initialized, wait 1s");
        g0Var.A(1104, 48);
        com.tencent.mm.sdk.platformtools.u3.i(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.WxCrossServices.1
            @Override // java.lang.Runnable
            public void run() {
                boolean z18 = ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).f188570e;
                com.tencent.kinda.framework.WxCrossServices.this.startUseCase(str5, create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.1.1
                    @Override // com.tencent.kinda.gen.UseCaseCallback
                    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                        android.content.Context context2 = context;
                        if (context2 instanceof com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI) {
                            ((com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI) context2).finish();
                        }
                    }
                });
            }
        }, 1000L);
    }

    @Override // h45.q
    public void startWxpayH5Pay(final android.content.Context context, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 14L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startWxpayH5Pay %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        re4.n.k();
        report.markEnterPay(36);
        com.tencent.mm.opensdk.modelpay.PayReq payReq = new com.tencent.mm.opensdk.modelpay.PayReq();
        payReq.fromBundle(bundle);
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("appid", payReq.appId);
        create.putString("partner_id", payReq.partnerId);
        create.putString("prepay_id", payReq.prepayId);
        create.putString("nonce_str", payReq.nonceStr);
        create.putString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, payReq.timeStamp);
        create.putString("package", payReq.packageValue);
        create.putString("sign", payReq.sign);
        create.putString("sign_type", payReq.signType);
        create.putString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
        create.putString("app_package_name", str2);
        create.putString("app_display_name", str3);
        create.putString("android_sign", str4);
        create.putString("android_sign", str4);
        create.putString("bundle_id", "");
        create.putInt("payScene", 36);
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("h5Pay", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.4
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                android.content.Context context2 = context;
                if (context2 instanceof com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI) {
                    ((com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI) context2).finish();
                    com.tencent.kinda.framework.WxCrossServices.report.reset();
                }
            }
        });
    }

    @Override // h45.q
    public void startWxpayJsApiPay(final android.content.Context context, com.tencent.mm.pluginsdk.wallet.WalletJsapiData walletJsapiData, com.tencent.mm.ui.da daVar, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 12L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startWxpayJsApiPay %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        re4.n.k();
        report.markEnterPay(walletJsapiData.f192142t);
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("appid", walletJsapiData.f192129d);
        create.putString("package", walletJsapiData.f192134i);
        create.putString("signType", walletJsapiData.f192131f);
        create.putString("timeStamp", walletJsapiData.f192133h);
        create.putString("paySign", walletJsapiData.f192138p);
        create.putString("nonce_str", walletJsapiData.f192132g);
        create.putString("stepInAppUserName", walletJsapiData.f192141s);
        java.lang.String str = walletJsapiData.f192140r;
        create.putString("stepInURL", str);
        create.putInt("payChannel", walletJsapiData.f192144v);
        create.putInt("payScene", walletJsapiData.f192142t);
        create.putInt("codeScene", walletJsapiData.f192145w);
        create.putInt("weappEnterScene", walletJsapiData.f192146x);
        create.putString("weappPayCookies", walletJsapiData.f192139q);
        create.putString("adUxInfo", walletJsapiData.H);
        create.putString("commonUxInfo", walletJsapiData.I);
        create.putInt("sendType", walletJsapiData.K);
        create.putInt("chatType", walletJsapiData.f192128J);
        create.putInt("qrcodeSessionType", walletJsapiData.L);
        create.putString("qrcodeSessionName", walletJsapiData.M);
        create.putString("qrcodeTimelineObjid", walletJsapiData.N);
        create.putBool("imitationNativeTinyApp", walletJsapiData.f192148z == 1);
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        create.putString("extInfo", walletJsapiData.f192147y);
        create.putString("qrcodeSenderMsgId", walletJsapiData.R);
        create.putString("qrcodeSenderName", walletJsapiData.Q);
        create.putString("initRawUrl", walletJsapiData.S);
        create.putLong("initTimestamp", walletJsapiData.T);
        com.tencent.kinda.framework.module.impl.KindaJSEvent kindaJSEvent = new com.tencent.kinda.framework.module.impl.KindaJSEvent();
        kindaJSEvent.setIMMOnActivityResult(daVar);
        kindaJSEvent.setRequestCode(i17);
        java.lang.String str2 = walletJsapiData.E;
        kindaJSEvent.setType(com.tencent.mm.sdk.platformtools.t8.K0(str2) ? com.tencent.kinda.gen.KindaJSEventType.WEB : com.tencent.kinda.gen.KindaJSEventType.TINYAPP);
        create.putJSEvent("JSEvent", kindaJSEvent);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            create.putString("latestUrl", str);
        } else {
            create.putString("latestUrl", str2);
        }
        java.lang.String str3 = walletJsapiData.G ? "jointPay" : "jsapiPay";
        com.tencent.mars.xlog.Log.i(TAG, "jsapi url: %s, initRawUrl is: %s, latestUrl is: %s, timestamp is: %s", str3, create.getString("initRawUrl"), create.getString("latestUrl"), java.lang.Long.valueOf(create.getLong("initTimestamp")));
        startUseCase(str3, create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.3
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (iTransmitKvData == null || !(context instanceof com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI)) {
                    return;
                }
                java.lang.String string = iTransmitKvData.getString("result");
                com.tencent.kinda.framework.WxCrossServices.report.reset();
                if (string == null) {
                    com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.WxCrossServices.TAG, "JsApiPay UseCaseCallback get result null! ");
                    string = "";
                }
                int i18 = string.endsWith("ok") ? -1 : string.endsWith("fail") ? 5 : 0;
                java.lang.String string2 = iTransmitKvData.getString("total_fee_str");
                com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI walletBrandUI = (com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI) context;
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "JsApiPay UseCaseCallback receive data, result: %s, resultCode:%d, total_fee_str: ", string, java.lang.Integer.valueOf(i18), string2);
                if (!lj.f.f(string2)) {
                    java.lang.String replaceAll = string2.replaceAll("[^0-9\\.]", "");
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "JsApiPay UseCaseCallback totalFee after format is: " + replaceAll);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_total_fee", replaceAll);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(walletBrandUI.f181089n) && walletBrandUI.f181089n.equalsIgnoreCase("key_from_scene_appbrandgame")) {
                        walletBrandUI.U6(i18, intent);
                    }
                }
                if (!string.equals("pre_ok")) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "JsApiPay UseCaseCallback finish WalletBrandUI.");
                    walletBrandUI.finish();
                    return;
                }
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.WxCrossServices.TAG, "JsApiPay UseCaseCallback preSuccess!");
                android.content.Intent intent2 = new android.content.Intent();
                java.lang.String string3 = iTransmitKvData.getString("pay_completed_data");
                intent2.putExtra("key_is_clear_failure", -1);
                if (!lj.f.f(string3)) {
                    intent2.putExtra("key_pay_completed_data", string3);
                }
                walletBrandUI.V6(i18, intent2);
            }
        });
    }

    @Override // h45.q
    public void startWxpayQueryCashierPay(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1004L, 15L, 1L, false);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "startWxpayQueryCashierPay %s", new com.tencent.mm.sdk.platformtools.z3());
        initIfNeed();
        preparePayDesk();
        report.markEnterPay(i17);
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putString("req_key", str);
        create.putInt("payScene", i17);
        create.putInt("payChannel", i18);
        create.putString("nativeReportSessionId", com.tencent.mm.wallet_core.ui.b0.a());
        startUseCase("queryCashierPay", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.5
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent = new com.tencent.mm.autogen.events.WalletPayResultEvent();
                walletPayResultEvent.f54965g.f7863c = iTransmitKvData.getString("result").equals("ok") ? -1 : 0;
                walletPayResultEvent.e();
                com.tencent.kinda.framework.WxCrossServices.report.reset();
            }
        });
    }

    @Override // h45.q
    public void stopListen(java.lang.String str) {
        com.tencent.kinda.framework.module.impl.KindaSessionIdListenerManager.INSTANCE.stopListen(str);
    }

    @Override // h45.q
    public boolean tryStartTransferToBankDetailUseCase(java.lang.String str, final h45.i iVar) {
        com.tencent.mm.wallet_core.b a17 = com.tencent.mm.wallet_core.b.a();
        a17.getClass();
        if (!a17.d(e42.d0.clicfg_transfer_to_bank_kinda_switch_android, false)) {
            return false;
        }
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            create.putString("transferBillId", str);
            create.putBool("isFromJsApi", true);
        }
        startUseCase("transferToBankShowDetailUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.39
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (iVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("finished", iTransmitKvData.getInt("finished"));
                    iVar.onKindaBusinessCallback(intent);
                }
            }
        });
        return true;
    }

    @Override // h45.q
    public boolean tryStartTransferToBankUseCase(java.lang.String str, final h45.i iVar) {
        com.tencent.mm.wallet_core.b a17 = com.tencent.mm.wallet_core.b.a();
        a17.getClass();
        if (!a17.d(e42.d0.clicfg_transfer_to_bank_kinda_switch_android, false)) {
            return false;
        }
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            create.putString("bank_card_number", str);
        }
        startUseCase("transferToBankUseCase", create, new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.38
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                if (iVar != null) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("pay_success", iTransmitKvData.getInt("pay_success"));
                    iVar.onKindaBusinessCallback(intent);
                }
            }
        });
        return true;
    }

    @Override // h45.q
    public void unregisterLiteAppModuleEventForPay(java.lang.String event, int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "registerLiteAppModuleEventForPay, businessEventName: %s", event);
        id.d a17 = id.d.f290444c.a();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        kotlin.jvm.internal.o.g(event, "event");
        java.util.Map map = a17.f290446a;
        java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(event);
        if (list == null) {
            com.tencent.mars.xlog.Log.e("LiteApp.ModuleEventManager", "unregisterEventCallback failed, event not found: %s", event);
            return;
        }
        if (valueOf == null) {
            com.tencent.mars.xlog.Log.i("LiteApp.ModuleEventManager", "unregisterEventCallback, event: %s, clear all", event);
            map.remove(event);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((id.b) next).f290442a != valueOf.intValue()) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            map.put(event, kz5.n0.V0(arrayList));
        } else {
            map.remove(event);
        }
        com.tencent.mars.xlog.Log.i("LiteApp.ModuleEventManager", "unregisterEventCallback, event: %s, id: %s", event, valueOf);
    }

    @Override // h45.q
    public void updateLocationCacheIfNeed(float f17, float f18, long j17, java.lang.String str, int i17) {
        com.tencent.kinda.framework.WxCrossHelper.INSTANCE.handleUpdateLocationCacheIfNeed(f17, f18, j17, str, i17);
    }

    @Override // h45.q
    public void updateOfflinePayDefaultCard(java.lang.String str, java.lang.String str2) {
        com.tencent.kinda.framework.boot.KindaApp.appKinda().updateOfflinePayDefaultCard(str, str2);
    }

    @Override // h45.q
    public void updateOfflinePayTokenFromScene(int i17) {
        com.tencent.kinda.framework.boot.KindaApp.appKinda().updateOfflinePayTokenWithScene(i17);
    }

    @Override // h45.q
    public void startInWxAppPayUseCase(final android.content.Context context, android.os.Bundle bundle) {
        startUseCase("inWxAppPay", prepareInWxAppPayUseCase(bundle), new com.tencent.kinda.gen.UseCaseCallback() { // from class: com.tencent.kinda.framework.WxCrossServices.34
            @Override // com.tencent.kinda.gen.UseCaseCallback
            public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
                java.lang.String string = iTransmitKvData.getString(ya.b.TRANSACTION_ID);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = iTransmitKvData.getString("prepay_id");
                if (string2 == null) {
                    string2 = "";
                }
                java.lang.String string3 = iTransmitKvData.getString("result");
                if (string3 == null) {
                    string3 = "";
                }
                android.content.Context context2 = context;
                if (context2 instanceof com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI) {
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = (com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI) context2;
                    remittanceNewBaseUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "onKindaInWxAppPayCallback result:%s prepayId:%s transactionId:%s", string3, string2, string);
                    if ("query:ok".equals(string3)) {
                        remittanceNewBaseUI.hideLoading();
                    } else if ("pre_ok".equals(string3)) {
                        remittanceNewBaseUI.Y6(string2, string);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI.W)) {
                            kw3.p.Ai().Di().d(remittanceNewBaseUI.f157456p0, remittanceNewBaseUI.f157439g, "");
                        } else {
                            kw3.p.Ai().Di().d(remittanceNewBaseUI.f157456p0, remittanceNewBaseUI.W, remittanceNewBaseUI.f157439g);
                        }
                        if (remittanceNewBaseUI.D1 > 0) {
                            if (com.tencent.mm.sdk.platformtools.t8.K0(remittanceNewBaseUI.W)) {
                                com.tencent.mm.plugin.remittance.model.h.f156847b.a(remittanceNewBaseUI.f157439g, remittanceNewBaseUI.D1, remittanceNewBaseUI.E1, remittanceNewBaseUI.f157456p0, remittanceNewBaseUI.F1);
                            } else {
                                com.tencent.mm.plugin.remittance.model.h.f156847b.a(remittanceNewBaseUI.W, remittanceNewBaseUI.D1, remittanceNewBaseUI.E1, remittanceNewBaseUI.f157456p0, remittanceNewBaseUI.F1);
                            }
                        }
                    } else if ("ok".equals(string3)) {
                        if (remittanceNewBaseUI.G1) {
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_UNION_TRANSFER_KEYBOARD_TIPS_DISABLE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                        }
                        remittanceNewBaseUI.finish();
                    } else {
                        remittanceNewBaseUI.hideLoading();
                    }
                } else if (context2 instanceof com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) {
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = (com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) context2;
                    walletLqtSaveFetchUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "onKindaInWxAppPayCallback result:%s transactionId:%s", string3, string);
                    com.tencent.mm.plugin.wallet.balance.model.lqt.w2 w2Var = walletLqtSaveFetchUI.f178053e;
                    if (w2Var != null) {
                        java.lang.String str = walletLqtSaveFetchUI.W;
                        if (string3.equalsIgnoreCase("ok")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchLogic", "%s onKindaInWxAppPayCallback, doQueryPurchaseResult, accountType: %s, reqkey: %s", java.lang.Integer.valueOf(w2Var.hashCode()), java.lang.Integer.valueOf(w2Var.f177738h), string2);
                            w2Var.f177734d = string;
                            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) w2Var.f177743m).get(string2);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                w2Var.f177733c = str2;
                            }
                            com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI = w2Var.f177732b;
                            if (walletBaseUI instanceof com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) {
                                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = (com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI) walletBaseUI;
                                walletLqtSaveFetchUI2.f178074x1 = true;
                                walletLqtSaveFetchUI2.j7();
                            }
                            w2Var.b(str, 0);
                        }
                    }
                } else if (context2 instanceof com.tencent.mm.plugin.wallet_index.ui.WalletIapUI) {
                    com.tencent.mm.plugin.wallet_index.ui.WalletIapUI walletIapUI = (com.tencent.mm.plugin.wallet_index.ui.WalletIapUI) context2;
                    com.tencent.mm.plugin.wallet_index.ui.f fVar = walletIapUI.f181110p;
                    if (fVar == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "onKindaInWxAppPayCallback mPurchaseFinishedListener is null");
                    } else {
                        nt4.f a17 = string3.equalsIgnoreCase("ok") ? nt4.f.a(0) : string3.equalsIgnoreCase("cancel") ? nt4.f.a(1) : nt4.f.a(6);
                        com.tencent.mm.plugin.wallet_index.ui.e eVar = walletIapUI.f181107m;
                        ((com.tencent.mm.plugin.wallet_index.ui.y) fVar).a(a17, new mt4.e(eVar.f181163l, eVar.f181161j, eVar.f181160i, eVar.f181159h));
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIapUI", "onKindaInWxAppPayCallback result:%s iapResult:%s", string3, a17);
                    }
                } else if (context2 instanceof com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI) {
                    com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI walletMerchantPayUI = (com.tencent.mm.plugin.remittance.ui.WalletMerchantPayUI) context2;
                    walletMerchantPayUI.getClass();
                    if (string3.equalsIgnoreCase("ok")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "in wx app pay succ");
                        walletMerchantPayUI.a7(walletMerchantPayUI.f157614w, 0);
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        com.tencent.mm.plugin.remittance.ui.b9 b9Var = new com.tencent.mm.plugin.remittance.ui.b9(walletMerchantPayUI);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(b9Var, 200L, false);
                    } else if (string3.equalsIgnoreCase("cancel")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "in wx app pay cancel");
                        walletMerchantPayUI.a7(walletMerchantPayUI.f157614w, 1);
                    } else if (string3.equalsIgnoreCase("fail")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MerchantPayUI", "in wx app pay fail");
                        walletMerchantPayUI.a7(walletMerchantPayUI.f157614w, 1);
                    }
                }
                com.tencent.kinda.framework.WxCrossServices.report.reset();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.kinda.gen.UseCase startUseCase(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.UseCaseCallback useCaseCallback) {
        fillOpeimId(iTransmitKvData);
        this.kindaLiteMgr.updateLiteAppUseCaseGrayConfig(str);
        if (shouldStartLiteAppUseCase(str, iTransmitKvData)) {
            return this.kindaLiteMgr.startKindaLiteUseCase(str, iTransmitKvData, useCaseCallback);
        }
        return com.tencent.kinda.framework.boot.KindaApp.appKinda().startUseCase(str, iTransmitKvData, useCaseCallback);
    }

    @Override // h45.q
    public boolean isEnableLiteAppUseCase(java.lang.String str, java.lang.Object obj) {
        return shouldStartLiteAppUseCase(str, obj instanceof com.tencent.kinda.gen.ITransmitKvData ? (com.tencent.kinda.gen.ITransmitKvData) obj : null);
    }
}
