package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KPaySettingsServiceImpl implements com.tencent.kinda.gen.KPaySettingsService {
    private static final java.lang.String TAG = "MicroMsg.KPaySettingsServiceImpl";
    private byte _hellAccFlag_;
    private com.tencent.mm.wallet_core.g bioPayProcessCallback = null;

    private void closeBioPay(final int i17, final com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        java.lang.String string = context.getString(com.tencent.mm.R.string.f_g);
        if (i17 == 2) {
            string = context.getString(com.tencent.mm.R.string.c8s);
        }
        db5.e1.K(context, false, string, "", context.getString(com.tencent.mm.R.string.lda), context.getString(com.tencent.mm.R.string.f490347sg), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                final android.app.Dialog e17 = com.tencent.mm.wallet_core.ui.b2.e(com.tencent.kinda.framework.widget.tools.KindaContext.get(), false, false, null);
                final com.tencent.mm.autogen.events.CloseFingerPrintEvent closeFingerPrintEvent = new com.tencent.mm.autogen.events.CloseFingerPrintEvent();
                closeFingerPrintEvent.f54065g.f6432a = i17;
                closeFingerPrintEvent.f192364d = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (closeFingerPrintEvent.f54066h == null) {
                            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                            create.putBool("result", false);
                            voidITransmitKvDataCallback.call(create);
                            return;
                        }
                        android.app.Dialog dialog = e17;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.KPaySettingsServiceImpl.TAG, "close event result: %s", java.lang.Integer.valueOf(closeFingerPrintEvent.f54066h.f6535a));
                        com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
                        if (closeFingerPrintEvent.f54066h.f6535a == 0) {
                            gm0.j1.n().f273288b.g(new ss4.e0(null, 19));
                            create2.putBool("result", true);
                            voidITransmitKvDataCallback.call(create2);
                            return;
                        }
                        android.content.Context context2 = com.tencent.kinda.framework.widget.tools.KindaContext.get();
                        java.lang.String string2 = context2.getString(com.tencent.mm.R.string.f_h);
                        if (i17 == 2) {
                            string2 = context2.getString(com.tencent.mm.R.string.kud);
                        }
                        db5.e1.F(context2, string2, "", true);
                        create2.putBool("result", false);
                        voidITransmitKvDataCallback.call(create2);
                    }
                };
                closeFingerPrintEvent.b(com.tencent.kinda.framework.widget.tools.KindaContext.get().getMainLooper());
            }
        }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                create.putBool("result", false);
                voidITransmitKvDataCallback.call(create);
            }
        });
    }

    private org.json.JSONObject getRedDotConfig() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                return new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    private java.lang.String normalizedReddotId(java.lang.String str) {
        return str + "_BOOLEAN_SYNC";
    }

    private void showEnrollBiometricGuideAlert(int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "show enroll biometric guide: %s", java.lang.Integer.valueOf(i17));
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        java.lang.String string = context.getString(com.tencent.mm.R.string.kur);
        if (i17 == 1) {
            string = context.getString(com.tencent.mm.R.string.kut);
        }
        db5.e1.y(context, string, "", context.getString(com.tencent.mm.R.string.kuq), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(android.content.DialogInterface dialogInterface, int i18) {
            }
        });
    }

    private void startOpenBioPayProcess(int i17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, final com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        com.tencent.mars.xlog.Log.i(TAG, "start open process: %s", java.lang.Integer.valueOf(i17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_open_biometric_type", i17);
        if (iTransmitKvData != null) {
            java.lang.String string = iTransmitKvData.getString("bus_info");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                bundle.putString("bus_info", string);
            }
        }
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        com.tencent.mm.wallet_core.g gVar = new com.tencent.mm.wallet_core.g() { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.2
            @Override // com.tencent.mm.wallet_core.g
            public android.content.Intent onProcessEnd(int i18, android.os.Bundle bundle2) {
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                if ((bundle2 != null ? bundle2.getInt("key_process_err_code", -1) : -1) == 0) {
                    create.putBool("result", true);
                    java.lang.String string2 = bundle2.getString("token");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                        create.putString("token", string2);
                    }
                    voidITransmitKvDataCallback.call(create);
                } else {
                    create.putBool("result", false);
                    voidITransmitKvDataCallback.call(create);
                }
                com.tencent.kinda.framework.app.KPaySettingsServiceImpl.this.bioPayProcessCallback = null;
                return null;
            }
        };
        this.bioPayProcessCallback = gVar;
        com.tencent.mm.wallet_core.a.k(topOrUIPageFragmentActivity, com.tencent.soter.core.biometric.FingerprintManagerProxy.FINGERPRINT_SERVICE, "FingerprintAuth", bundle, gVar);
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void commitHbRefundWayTypeChange() {
        r45.oo4 oo4Var = new r45.oo4();
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue();
        if ((longValue & 1) != 0) {
            oo4Var.f382396d = 1L;
            oo4Var.f382397e = 2L;
        } else if ((longValue & 2) != 0) {
            oo4Var.f382396d = 2L;
            oo4Var.f382397e = 1L;
        }
        com.tencent.mars.xlog.Log.i(TAG, "doSettingsOplog: extStatus: %s, set_bitmask: %s, clear_bitmask:%s", java.lang.Long.toBinaryString(longValue), java.lang.Long.toBinaryString(oo4Var.f382396d), java.lang.Long.toBinaryString(oo4Var.f382397e));
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(218, oo4Var));
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void commitTransferDelayTypeChange() {
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        int i17 = (16 & longValue) != 0 ? 1 : (longValue & 32) != 0 ? 2 : 0;
        r45.po4 po4Var = new r45.po4();
        po4Var.f383253d = i17;
        ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(205, po4Var));
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public com.tencent.kinda.gen.KHbRefundWayType getHbRefundWayType() {
        gm0.j1.i();
        return com.tencent.mm.sdk.platformtools.t8.B0(((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue() & 3, 2L) ? com.tencent.kinda.gen.KHbRefundWayType.ORIGIN : com.tencent.kinda.gen.KHbRefundWayType.LQ;
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public boolean getReddotStatus(java.lang.String str) {
        gm0.j1.i();
        return ((java.lang.Boolean) gm0.j1.u().c().p(normalizedReddotId(str), java.lang.Boolean.FALSE)).booleanValue();
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public com.tencent.kinda.gen.KTransferDelayType getTransferDelayType() {
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        return (16 & longValue) != 0 ? com.tencent.kinda.gen.KTransferDelayType.DELAY2HOUR : (longValue & 32) != 0 ? com.tencent.kinda.gen.KTransferDelayType.DELAY24HOUR : com.tencent.kinda.gen.KTransferDelayType.NODELAY;
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public int getTransferPhoneGrantFlag() {
        gm0.j1.i();
        return ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, 2)).intValue();
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public com.tencent.kinda.gen.KXMLPayRedDot getUnexpiredXMLReddot(java.lang.String str) {
        org.json.JSONObject redDotConfig = getRedDotConfig();
        if (redDotConfig == null) {
            return new com.tencent.kinda.gen.KXMLPayRedDot("", 0L, "");
        }
        if (!(redDotConfig.optInt(str, 0) == 1)) {
            return new com.tencent.kinda.gen.KXMLPayRedDot("", 0L, "");
        }
        long optLong = redDotConfig.optLong(java.lang.String.format("%s_expiretime", str), 0L);
        if (optLong <= 0 || java.lang.System.currentTimeMillis() <= optLong) {
            return new com.tencent.kinda.gen.KXMLPayRedDot(str, optLong, redDotConfig.optString(java.lang.String.format("%s_wording", str)));
        }
        com.tencent.mars.xlog.Log.i(TAG, "Reddot expired: %s, expireTime=%d", str, java.lang.Long.valueOf(optLong));
        return new com.tencent.kinda.gen.KXMLPayRedDot("", 0L, "");
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void handlePushBioPaySettingPageImpl(final com.tencent.kinda.gen.VoidCallback voidCallback) {
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver(new android.os.Handler(android.os.Looper.getMainLooper())) { // from class: com.tencent.kinda.framework.app.KPaySettingsServiceImpl.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                voidCallback.call();
            }
        };
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI.class);
        intent.putExtra("key_should_update_result_receiver", resultReceiver);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/kinda/framework/app/KPaySettingsServiceImpl", "handlePushBioPaySettingPageImpl", "(Lcom/tencent/kinda/gen/VoidCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/kinda/framework/app/KPaySettingsServiceImpl", "handlePushBioPaySettingPageImpl", "(Lcom/tencent/kinda/gen/VoidCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public boolean isBioPayTypeEnabled(com.tencent.kinda.gen.KBioPayType kBioPayType) {
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        return kBioPayType == com.tencent.kinda.gen.KBioPayType.FACEID ? ((mz2.a) aVar).b() : ((mz2.a) aVar).a();
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void logGeneralUserAction(int i17) {
        com.tencent.mm.wallet_core.ui.r1.q0(i17, 1);
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void markReddotConsumed(java.lang.String str) {
        gm0.j1.i();
        gm0.j1.u().c().y(normalizedReddotId(str), java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void markXMLReddotConsumed(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "clear reddot: %s", str);
        org.json.JSONObject redDotConfig = getRedDotConfig();
        if (redDotConfig == null) {
            return;
        }
        redDotConfig.remove(str);
        redDotConfig.remove(java.lang.String.format("%s_expiretime", str));
        redDotConfig.remove(java.lang.String.format("%s_wording", str));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, redDotConfig.toString());
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void setBioPayTypeEnabledImpl(com.tencent.kinda.gen.KBioPayType kBioPayType, boolean z17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        com.tencent.mm.sdk.platformtools.o4.M("mmkv.wallet").putInt("MMKV_KEY_SOTER_OPEN_SCENE", 1);
        com.tencent.mars.xlog.Log.i(TAG, "open bio pay, open scene is 1");
        if (kBioPayType == com.tencent.kinda.gen.KBioPayType.FACEID) {
            if (!z17) {
                closeBioPay(2, voidITransmitKvDataCallback);
                return;
            }
            if (is4.a.b()) {
                startOpenBioPayProcess(2, iTransmitKvData, voidITransmitKvDataCallback);
                return;
            }
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putBool("result", false);
            voidITransmitKvDataCallback.call(create);
            showEnrollBiometricGuideAlert(2);
            return;
        }
        if (kBioPayType == com.tencent.kinda.gen.KBioPayType.TOUCHID) {
            if (!z17) {
                closeBioPay(1, voidITransmitKvDataCallback);
                return;
            }
            if (is4.a.c()) {
                startOpenBioPayProcess(1, iTransmitKvData, voidITransmitKvDataCallback);
                return;
            }
            com.tencent.kinda.gen.ITransmitKvData create2 = com.tencent.kinda.gen.ITransmitKvData.create();
            create2.putBool("result", false);
            voidITransmitKvDataCallback.call(create2);
            showEnrollBiometricGuideAlert(1);
        }
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void setHbRefundWayType(com.tencent.kinda.gen.KHbRefundWayType kHbRefundWayType) {
        gm0.j1.i();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        if (kHbRefundWayType == com.tencent.kinda.gen.KHbRefundWayType.LQ) {
            longValue = (longValue | 1) & (-3);
        } else if (kHbRefundWayType == com.tencent.kinda.gen.KHbRefundWayType.ORIGIN) {
            longValue = (longValue & (-2)) | 2;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(longValue));
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void setTransferDelayType(com.tencent.kinda.gen.KTransferDelayType kTransferDelayType) {
        long j17;
        long j18;
        gm0.j1.i();
        long longValue = ((java.lang.Long) gm0.j1.u().c().l(147457, 0L)).longValue();
        if (kTransferDelayType == com.tencent.kinda.gen.KTransferDelayType.NODELAY) {
            longValue = longValue & (-17) & (-33);
        } else {
            if (kTransferDelayType == com.tencent.kinda.gen.KTransferDelayType.DELAY2HOUR) {
                j17 = longValue & (-33);
                j18 = 16;
            } else if (kTransferDelayType == com.tencent.kinda.gen.KTransferDelayType.DELAY24HOUR) {
                j17 = longValue & (-17);
                j18 = 32;
            }
            longValue = j17 | j18;
        }
        gm0.j1.i();
        gm0.j1.u().c().w(147457, java.lang.Long.valueOf(longValue));
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public void setTransferPhoneGrantFlag(int i17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MOBILE_REMITTANCE_SWITCH_GRANT_FLAG_INT_SYNC, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.kinda.gen.KPaySettingsService
    public java.util.ArrayList<com.tencent.kinda.gen.KBioPayType> supportedBioPayTypes() {
        java.util.ArrayList<com.tencent.kinda.gen.KBioPayType> arrayList = new java.util.ArrayList<>();
        if (is4.a.b()) {
            arrayList.add(com.tencent.kinda.gen.KBioPayType.FACEID);
        }
        if (is4.a.c()) {
            arrayList.add(com.tencent.kinda.gen.KBioPayType.TOUCHID);
        }
        return arrayList;
    }
}
