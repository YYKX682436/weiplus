package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaPlatformUtil implements com.tencent.kinda.gen.IPlatformUtil {
    private static final java.lang.String DCEP_PACKAGE = "cn.gov.pbc.dcep";
    private static final java.lang.String SINGLE_BYTE_CHARSET_FOR_SAVE = "ISO-8859-1";
    private static final int[] sKindaUseMMMetric = {-1};
    private com.tencent.kinda.gen.VoidStringCallback languageChangeCallback = null;
    private final java.lang.String TAG = "KindaPlatformUtil";
    private final java.lang.String KINDA_PLATFORM_UTIL_MMKV_PATH = "kinda_platform_util_mmkv_path";
    private final java.lang.String YUAN_BAO_ID_FOR_OLDER_USER_STATE_KEY = "yuanbao_is_for_older_user_state";
    private final com.tencent.mm.sdk.event.IListener checkLanguageChangeIListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CheckLanguageChangeEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.1
        {
            this.__eventId = -1187832230;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.CheckLanguageChangeEvent checkLanguageChangeEvent) {
            if (com.tencent.kinda.framework.app.KindaPlatformUtil.this.languageChangeCallback == null) {
                return true;
            }
            com.tencent.kinda.framework.app.KindaPlatformUtil.this.languageChangeCallback.call(com.tencent.kinda.framework.app.KindaPlatformUtil.this.currentLanguageCode());
            return true;
        }
    };

    private void doReportScreenshotPageInfo(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || iTransmitKvData == null) {
            return;
        }
        java.lang.String string = iTransmitKvData.getString("transId");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            linkedList.add(string);
        }
        str.getClass();
        char c17 = 65535;
        switch (str.hashCode()) {
            case 638974684:
                if (str.equals("WalletPageUI")) {
                    c17 = 0;
                    break;
                }
                break;
            case 1238959160:
                if (str.equals("honeyPayCardBackUI")) {
                    c17 = 1;
                    break;
                }
                break;
            case 1533124143:
                if (str.equals("honeyPayCardListUI")) {
                    c17 = 2;
                    break;
                }
                break;
            case 1683564243:
                if (str.equals("paidOrderDetail")) {
                    c17 = 3;
                    break;
                }
                break;
            case 2037676473:
                if (str.equals("balanceEntryUIPage")) {
                    c17 = 4;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                str2 = "client_wallet_page";
                break;
            case 1:
                str2 = "client_honey_pay_card_detail_page";
                break;
            case 2:
                str2 = "client_honey_pay_card_list_page";
                break;
            case 3:
                str2 = "client_pay_success_page";
                break;
            case 4:
                str2 = "client_balance_entry_page";
                break;
            default:
                str2 = "";
                break;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi(str2, linkedList, 0);
    }

    private float getDensity(android.content.Context context) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        if (useMMMetric() && (resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f17 = displayMetrics.density;
            if (f17 != 0.0f) {
                return f17;
            }
        }
        if (context != null) {
            return context.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    private com.tencent.mm.sdk.platformtools.o4 getMMKV() {
        return com.tencent.mm.sdk.platformtools.o4.M("kinda_platform_util_mmkv_path");
    }

    private com.tencent.mm.storage.u3[] getRedDotKey(java.lang.String str) {
        if (str.equalsIgnoreCase("receipt")) {
            return new com.tencent.mm.storage.u3[]{com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        if (str.equalsIgnoreCase("reward")) {
            return new com.tencent.mm.storage.u3[]{com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        if (str.equalsIgnoreCase("groupaa")) {
            return new com.tencent.mm.storage.u3[]{com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        if (str.equalsIgnoreCase("faceHongBao")) {
            return new com.tencent.mm.storage.u3[]{com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        if (str.equalsIgnoreCase("transferBank") || str.equalsIgnoreCase("transferMobile") || str.equalsIgnoreCase("transferMix")) {
            return new com.tencent.mm.storage.u3[]{com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_BANK_REMIT_STRING_SYNC, com.tencent.mm.storage.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        return null;
    }

    private int getRedDotTipsId(java.lang.String str) {
        if (str.equalsIgnoreCase("receipt")) {
            return 17;
        }
        if (str.equalsIgnoreCase("reward")) {
            return 19;
        }
        if (str.equalsIgnoreCase("groupaa")) {
            return 16;
        }
        if (str.equalsIgnoreCase("faceHongBao")) {
            return 18;
        }
        return (str.equalsIgnoreCase("transferBank") || str.equalsIgnoreCase("transferMobile") || str.equalsIgnoreCase("transferMix")) ? 20 : 0;
    }

    private com.tencent.kinda.gen.LocationInfoStruct internalGetCacheLocationInfo(int i17) {
        com.tencent.kinda.gen.LocationInfoStruct locationInfoStruct = new com.tencent.kinda.gen.LocationInfoStruct();
        r45.h67 h67Var = new r45.h67();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "no location cache data");
        } else {
            try {
                h67Var.parseFrom(str.getBytes("ISO-8859-1"));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("KindaPlatformUtil", "parse cacheString exp, " + e17.getLocalizedMessage());
            }
            locationInfoStruct.mProvince = h67Var.f375885f;
            locationInfoStruct.mCity = h67Var.f375886g;
            locationInfoStruct.mDistrict = h67Var.f375887h;
            locationInfoStruct.mCountryCode = h67Var.f375888i;
            locationInfoStruct.mCountry = h67Var.f375889m;
            locationInfoStruct.mPositionTs = h67Var.f375890n;
            locationInfoStruct.mAdCode = h67Var.f375891o;
        }
        ((h45.q) i95.n0.c(h45.q.class)).updateLocationCacheIfNeed(h67Var.f375883d, h67Var.f375884e, h67Var.f375890n, h67Var.f375888i, i17);
        return locationInfoStruct;
    }

    private boolean isDcepInstalled() {
        return com.tencent.mm.pluginsdk.model.app.j1.f(com.tencent.mm.sdk.platformtools.x2.f193071a, DCEP_PACKAGE);
    }

    private boolean isSupportNFC() {
        return ((h45.q) i95.n0.c(h45.q.class)).isDeviceSupportNFC();
    }

    private static boolean useMMMetric() {
        int[] iArr = sKindaUseMMMetric;
        if (iArr[0] == -1) {
            synchronized (iArr) {
                if (iArr[0] == -1) {
                    iArr[0] = j62.e.g().c(new com.tencent.mm.repairer.config.pay.RepairerConfigKindaUseMMMetric());
                }
            }
        }
        return iArr[0] == 1;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void accessibilityAnnounce(com.tencent.kinda.gen.KView kView, java.lang.String str) {
        if (kView != null && (kView instanceof com.tencent.kinda.framework.widget.base.MMKView)) {
            android.view.View view = ((com.tencent.kinda.framework.widget.base.MMKView) kView).getView();
            if (view == null) {
                com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "announce view is null");
            } else {
                view.announceForAccessibility(str);
            }
        }
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void accessibilityFocus(com.tencent.kinda.gen.KView kView) {
        if (kView != null && (kView instanceof com.tencent.kinda.framework.widget.base.MMKView)) {
            final android.view.View view = ((com.tencent.kinda.framework.widget.base.MMKView) kView).getView();
            if (view == null) {
                com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "focusFirst view is null");
            } else {
                view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.2
                    @Override // java.lang.Runnable
                    public void run() {
                        view.sendAccessibilityEvent(128);
                    }
                });
            }
        }
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public int androidAPILevel() {
        return android.os.Build.VERSION.SDK_INT;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public com.tencent.kinda.gen.AndroidDpiLevel androidDpiLevel() {
        return com.tencent.kinda.gen.AndroidDpiLevel.UNKNOWN;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public byte[] base64Decode(java.lang.String str) {
        return android.util.Base64.decode(str, 0);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String base64DecodeString(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : new java.lang.String(android.util.Base64.decode(str, 0));
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String base64Encode(byte[] bArr) {
        return android.util.Base64.encodeToString(bArr, 2);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void beginIgnoringInteractionEvents() {
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String currentLanguageCode() {
        return com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public com.tencent.kinda.gen.Platform currentPlatform() {
        return com.tencent.kinda.gen.Platform.ANDROID;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean delSecurityStore(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float dynamicFontSize(float f17) {
        return com.tencent.kinda.framework.widget.tools.KindaContext.get() != null ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.kinda.framework.widget.tools.KindaContext.get()) * f17 : f17;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float dynamicSize(float f17) {
        return f17;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float dynamicSizeByFontLevel(float f17, int i17) {
        return f17 * getScaleByFontLevel(i17);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void endIgnoringInteractionEvents() {
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public byte[] faceDataDecrypt(byte[] bArr, byte[] bArr2) {
        return new byte[0];
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public byte[] faceDataEncrypt(byte[] bArr, byte[] bArr2) {
        return new byte[0];
    }

    public void finalize() {
        this.checkLanguageChangeIListener.dead();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String genUUID() {
        return wo.w0.k();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public int getAccessibilityIsTouchExplorationEnabled() {
        return ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ai();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.util.ArrayList<java.lang.String> getAccessibilityServiceList() {
        return ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Di(false);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String getAndroidRepairConfig(java.lang.String str) {
        if (!str.equals("use_biometric_prompt")) {
            return "";
        }
        return "" + bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_UseBiometricPrompt_Int, 0);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getBottomSafeAreaHeight() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public com.tencent.kinda.gen.LocationInfoStruct getCachedLocationInfo() {
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "get cached location info");
        com.tencent.kinda.gen.LocationInfoStruct locationInfoStruct = new com.tencent.kinda.gen.LocationInfoStruct();
        if (!isDcepInstalled() && !isSupportNFC()) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_dcep_address_logic_revert, false)) {
                com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "dcep app is not install and nfc is not support, ignore get address data");
                return locationInfoStruct;
            }
        }
        return internalGetCacheLocationInfo(2);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public com.tencent.kinda.gen.LocationInfoStruct getCachedLocationInfoForCashier() {
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "getCachedLocationInfoForCashier");
        return internalGetCacheLocationInfo(1);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public int getClientVersion() {
        return o45.wf.f343029g;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String getDeviceInfoForYuanBaoAd() {
        try {
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommonDeviceId", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            java.lang.String b17 = v34.b.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommonDeviceId", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            return b17;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "ISnsAdService getCommonDeviceId fail");
            return "";
        }
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean getExptBoolValue(java.lang.String str) {
        if ("ShouldOpen2026NewFaceToFaceLiteAppScanEntry".equals(str)) {
            ((kd0.r2) i95.n0.c(kd0.r2.class)).getClass();
            return true;
        }
        java.lang.String a17 = j62.e.g().a(str, "", false, false);
        return (com.tencent.mm.sdk.platformtools.t8.K0(a17) || com.tencent.mm.sdk.platformtools.t8.P(a17, 0) == 0) ? false : true;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String getExptStringValue(java.lang.String str) {
        java.lang.String a17 = j62.e.g().a(str, "", false, false);
        return com.tencent.mm.sdk.platformtools.t8.K0(a17) ? "" : a17;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public int getFontLevel() {
        float scaleSize = com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.kinda.framework.widget.tools.KindaContext.get());
        int i17 = 0;
        while (true) {
            float[] fArr = com.tencent.kinda.framework.widget.tools.MMKViewUtil.fontLevel;
            if (i17 >= fArr.length) {
                return 1;
            }
            if (com.tencent.mm.ui.bk.M(scaleSize, fArr[i17])) {
                return i17;
            }
            i17++;
        }
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getIphoneSafeAreaBottomHeight() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean getIsAccessibilityServiceRunning() {
        return la5.b.f317600a.g(true);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public int getLQTVersion() {
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LQT_VERSION_INT_SYNC, 0)).intValue();
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "return lqt version:%s", java.lang.Integer.valueOf(intValue));
        return intValue;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getLoigcalResolutionHeight() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        if (useMMMetric() && (resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f17 = displayMetrics.density;
            if (f17 != 0.0f) {
                return displayMetrics.heightPixels / f17;
            }
        }
        if (com.tencent.kinda.framework.widget.tools.KindaContext.get() == null) {
            return 0.0f;
        }
        return r0.heightPixels / com.tencent.kinda.framework.widget.tools.KindaContext.get().getResources().getDisplayMetrics().density;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getLoigcalResolutionWidth() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        if (useMMMetric() && (resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f17 = displayMetrics.density;
            if (f17 != 0.0f) {
                return displayMetrics.widthPixels / f17;
            }
        }
        if (com.tencent.kinda.framework.widget.tools.KindaContext.get() == null) {
            return 0.0f;
        }
        return r0.widthPixels / com.tencent.kinda.framework.widget.tools.KindaContext.get().getResources().getDisplayMetrics().density;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String getMemoryKVString(java.lang.String str) {
        return "";
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getNavigationBarHeight() {
        if (com.tencent.kinda.framework.widget.tools.KindaContext.get() == null) {
            return 0.0f;
        }
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            return fp.a.a((com.tencent.mm.ui.MMActivity) context) / getDensity(context);
        }
        com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "KindaContext.get() is not MMActivity, is %s.", context.getClass().getName());
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getPadSplitHeight() {
        return getLoigcalResolutionHeight();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getPadSplitWidth() {
        return getLoigcalResolutionWidth();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String getPhoneOsVersion() {
        return android.os.Build.VERSION.RELEASE;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String getPhonePlatform() {
        return android.os.Build.MANUFACTURER;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String getPlatformString(java.lang.String str) {
        return "";
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getPx(float f17) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        if (useMMMetric() && (resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f18 = displayMetrics.density;
            if (f18 != 0.0f) {
                return f17 / f18;
            }
        }
        return com.tencent.kinda.framework.widget.tools.KindaContext.get() != null ? f17 / com.tencent.kinda.framework.widget.tools.KindaContext.get().getResources().getDisplayMetrics().density : f17;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public int getRedDotStatus(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        int redDotTipsId = getRedDotTipsId(str);
        if (redDotTipsId != 0) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            android.util.Pair c17 = rn3.i.Di().c(new vn3.c(redDotTipsId));
            if (c17.first == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null) {
                com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "show reddot from new tips platform, key is %s", str);
                return 2;
            }
        }
        com.tencent.mm.storage.u3[] redDotKey = getRedDotKey(str);
        if (redDotKey != null) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            if (bk0.a.g().d(redDotKey[0], redDotKey[1])) {
                com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "show reddot from newxml, key is %s", str);
                return 1;
            }
        }
        return 0;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String getRedDotWording(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals("receipt")) {
            return null;
        }
        gm0.j1.i();
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_FACING_REDDOT_WORDING_STRING_SYNC, "");
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getScaleByFontLevel(int i17) {
        if (i17 < 0) {
            i17 = 0;
        } else {
            try {
                float[] fArr = com.tencent.kinda.framework.widget.tools.MMKViewUtil.fontLevel;
                if (i17 >= fArr.length) {
                    i17 = fArr.length - 1;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "getScaleByFontLevel error:%s", e17.getMessage());
                return 1.0f;
            }
        }
        return com.tencent.kinda.framework.widget.tools.MMKViewUtil.fontLevel[i17];
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getScreenBrightness() {
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "While getScreenBrightness, We can't get the activity on the top of stack, use system brightness");
            return getSystemBrightnessPercent();
        }
        android.view.WindowManager.LayoutParams attributes = topOrUIPageFragmentActivity.getWindow().getAttributes();
        if (attributes == null) {
            return 0.0f;
        }
        float f17 = attributes.screenBrightness;
        if (f17 == -1.0f) {
            return getSystemBrightnessPercent();
        }
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "get current activity brightness :%s", java.lang.Float.valueOf(f17));
        return f17;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getScreenDensity() {
        return com.tencent.kinda.framework.widget.tools.KindaContext.get() != null ? i65.a.g(com.tencent.kinda.framework.widget.tools.KindaContext.get()) : j65.f.f();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getStatusBarHeight() {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context != null) {
            return com.tencent.mm.ui.bk.p(context) / getDensity(context);
        }
        return 0.0f;
    }

    public float getSystemBrightnessPercent() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        float f17 = 0.0f;
        if (context == null) {
            com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "MMApplicationContext is null, return 0");
            return 0.0f;
        }
        try {
            int i17 = android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "get system screen brightness :%s", java.lang.Integer.valueOf(i17));
            if (i17 < 0) {
                i17 = 0;
            }
            if (i17 > 255) {
                i17 = 255;
            }
            f17 = i17 / 255.0f;
        } catch (android.provider.Settings.SettingNotFoundException e17) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "ex %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "get screen brightness :%s", java.lang.Float.valueOf(f17));
        return f17;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getTextWidth(java.lang.String str, float f17) {
        android.content.res.Resources resources;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0.0f;
        }
        android.content.Context context = useMMMetric() ? com.tencent.mm.sdk.platformtools.x2.f193071a : com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null || (resources = context.getResources()) == null) {
            return 0.0f;
        }
        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics == null || displayMetrics.density == 0.0f) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "getTextWidth, density is 0");
            return 0.0f;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(displayMetrics.density * f17);
        float measureText = paint.measureText(str) / displayMetrics.density;
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "getTextWidth, content:%s, textSize:%s, textWidth:%s", str, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(measureText));
        return measureText;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void getUserLocationImpl(final com.tencent.kinda.gen.VoidF32F32BoolCallback voidF32F32BoolCallback) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().k(new i11.c() { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.3
            @Override // i11.c
            public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
                com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "onGetLocation %b", java.lang.Boolean.valueOf(z17));
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                i11.h.e().m(this);
                if (z17) {
                    voidF32F32BoolCallback.call(f17, f18, z17);
                    return false;
                }
                voidF32F32BoolCallback.call(0.0f, 0.0f, !z17);
                return false;
            }
        }, true);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public float getViewScale() {
        return j65.f.f297943g;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean getYuanBaoInstalledState() {
        return ik1.b.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.hunyuan.app.chat");
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean getYuanBaoIsForOldUser() {
        return getMMKV().getBoolean("yuanbao_is_for_older_user_state", false);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void handleAdFeedbackCloseWithAid(java.lang.String str) {
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).aj(str);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void handleAdOpenWithAid(java.lang.String str) {
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).bj(str, null, new xj.l() { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.5
            @Override // xj.l
            public void onJumpAppCancel() {
            }

            @Override // xj.l
            public void onJumpAppCheckExpose() {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,5,,,");
                sb6.append(com.tencent.kinda.framework.app.KindaPlatformUtil.this.getYuanBaoIsForOldUser() ? "2" : "1");
                sb6.append(",1");
                g0Var.kvStat(35858, sb6.toString());
            }

            @Override // xj.l
            public void onJumpAppFail() {
            }

            @Override // xj.l
            public void onJumpAppSuccess() {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,6,,,");
                sb6.append(com.tencent.kinda.framework.app.KindaPlatformUtil.this.getYuanBaoIsForOldUser() ? "2" : "1");
                sb6.append(",1");
                g0Var.kvStat(35858, sb6.toString());
            }

            @Override // xj.l
            public void onJumpDownloadPage() {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,7,,,");
                sb6.append(com.tencent.kinda.framework.app.KindaPlatformUtil.this.getYuanBaoIsForOldUser() ? "2" : "1");
                sb6.append(",1");
                g0Var.kvStat(35858, sb6.toString());
            }
        });
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public com.tencent.kinda.gen.IOSDevice iOSDevice() {
        return com.tencent.kinda.gen.IOSDevice.UNKNOWN;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String iOSVersion() {
        return null;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String insertZeroWidthJoiner(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() < 2) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = str.length();
        int i17 = 0;
        while (i17 < length) {
            int codePointAt = str.codePointAt(i17);
            sb6.appendCodePoint(codePointAt);
            i17 += java.lang.Character.charCount(codePointAt);
            if (i17 < length) {
                sb6.append((char) 8288);
            }
        }
        return sb6.toString();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean isAccessibilityServiceSafe() {
        return ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Bi() == 1;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean isCareModeOn() {
        return j65.e.b();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean isDarkModeOn() {
        return com.tencent.mm.ui.bk.C();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean isFlutterOnTop() {
        boolean z17;
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context instanceof com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity) {
            com.tencent.mm.flutter.ui.FlutterPageInfo flutterPageInfo = ((com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity) context).f137311i;
            kotlin.jvm.internal.o.d(flutterPageInfo);
            if ("pay".equals(flutterPageInfo.f68115f)) {
                z17 = true;
                com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "isFlutterOnTop %s", java.lang.Boolean.valueOf(z17));
                return z17;
            }
        }
        z17 = false;
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "isFlutterOnTop %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean isForAndroidTest() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return z65.c.a() || o45.wf.f343033k;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean isLocationAuthorized() {
        return ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(com.tencent.mm.sdk.platformtools.x2.f193071a, "android.permission.ACCESS_FINE_LOCATION", d85.f0.C.f227177e) == d85.h0.GRANTED;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean isNetworkConnected() {
        return com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean isPad() {
        return false;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean isScreenCaptured() {
        return false;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void launchFlutter(boolean z17) {
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "launchFlutter, supportSwipe:%s", java.lang.Boolean.valueOf(z17));
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        kotlin.jvm.internal.o.g(context, "context");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new ej0.a("pay", context, null), 3, null);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public byte[] loadSecurityStore(java.lang.String str) {
        return new byte[0];
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void makesureLonglink() {
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new c01.ra(new com.tencent.mm.wallet_core.ui.h1(), null));
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String md5(java.lang.String str) {
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        return com.tencent.mm.sdk.platformtools.w2.b(str.getBytes());
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String md5Data(byte[] bArr) {
        return "";
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void openNativeScanView() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
        intent.putExtra("key_scan_report_enter_scene", 31);
        intent.putExtra("key_config_black_interval", true);
        intent.putExtra("key_enable_multi_code", true);
        intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
        intent.putExtra("key_enable_scan_code_product_merge", true);
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (context == null) {
            com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "[openNativeScanView] KindaContext is null, use MMApplicationContext");
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "[openNativeScanView] context is null, open scan fail");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        j45.l.j(context, "scanner", ".ui.BaseScanUI", intent, null);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void openTinyApp(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        java.lang.String string = iTransmitKvData.getString("KindaTinyAppUserName");
        java.lang.String string2 = iTransmitKvData.getString("KindaTinyAppPath");
        java.lang.String string3 = iTransmitKvData.getString("KindaTinyAppVersion");
        int P = com.tencent.mm.sdk.platformtools.t8.P(iTransmitKvData.getString("KindaTinyAppScene"), 0);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P(iTransmitKvData.getString("KindaTinyAppType"), 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "failed openTinyApp for empty appusername");
            return;
        }
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = string;
        b1Var.f317022f = string2;
        int P3 = com.tencent.mm.sdk.platformtools.t8.P(string3, 0);
        if (P3 > 0) {
            b1Var.f317018d = P3;
        }
        if (P == 0) {
            b1Var.f317032k = 1034;
        } else {
            b1Var.f317032k = P;
        }
        if (P2 == 0) {
            b1Var.f317016c = 0;
        } else {
            b1Var.f317016c = 2;
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void playVibration() {
        try {
            android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
            if (context == null) {
                com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "KindaContext get null while playVibration!");
                return;
            }
            android.os.Vibrator vibrator = (android.os.Vibrator) context.getSystemService("vibrator");
            if (vibrator == null) {
                com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "playVibration call getSystemService get null!");
            } else {
                vibrator.vibrate(15L);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "playVibration exception %s", e17.getMessage());
        }
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void preloadLiteApp(final java.lang.String str, final java.lang.String str2) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(str, new com.tencent.mm.plugin.lite.api.h() { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.4
            @Override // com.tencent.mm.plugin.lite.api.h
            public void fail(java.lang.String str3, int i17) {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(context, str, str2, "preloadLiteApp");
            }

            @Override // com.tencent.mm.plugin.lite.api.h
            public void success(com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, int i17) {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(context, str, str2, "preloadLiteApp");
            }
        });
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void publishPayLiteAppGlobalEvent(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "publishPayLiteAppGlobalEvent");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.Iterator<java.lang.String> it = iTransmitKvData.allKeys().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                java.lang.String string = iTransmitKvData.getString(next);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    jSONObject.put(next, string);
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("KindaPlatformUtil", e17, "notify data exception", new java.lang.Object[0]);
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        com.tencent.mm.plugin.lite.w.l("pay.notifyAll", jSONObject);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void releasePreloadLiteApp(java.lang.String str, java.lang.String str2) {
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Yj(str, str2);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void reportAdWithAidAndType(java.lang.String str) {
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).mj(str, wj.w0.f446541d, null);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void reportDidTakeScreenshot(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        java.lang.String string = iTransmitKvData.getString("pageUrl");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return;
        }
        if (!string.equals("paidOrderDetail")) {
            doReportScreenshotPageInfo(string, iTransmitKvData);
            return;
        }
        java.lang.String string2 = iTransmitKvData.getString("transId");
        if (string2 == null) {
            string2 = "";
        }
        w04.l.INSTANCE.Ta(string2);
        doReportScreenshotPageInfo(string, iTransmitKvData);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String resolveLanguageStringForGlobal(java.lang.String str) {
        return c01.je.r(str);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String resolveURLStringForGlobal(java.lang.String str) {
        java.util.Set set = c01.je.f37271a;
        int i17 = com.tencent.mm.sdk.platformtools.n9.f192884a;
        if (i17 == 0 || i17 == 1) {
            return str;
        }
        int indexOf = str.indexOf("://");
        java.lang.String str2 = "";
        java.lang.String str3 = "";
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf + 3);
            if (!str2.startsWith("http")) {
                return str;
            }
        }
        if (indexOf >= 0) {
            str = str.substring(indexOf + 3);
        }
        int indexOf2 = str.indexOf("/");
        java.lang.String substring = indexOf2 >= 0 ? str.substring(indexOf2) : "";
        if (indexOf2 >= 0) {
            str = str.substring(0, indexOf2);
        }
        int indexOf3 = str.indexOf(":");
        if (indexOf3 >= 0) {
            java.lang.String substring2 = str.substring(0, indexOf3);
            str3 = str.substring(indexOf3);
            str = substring2;
        }
        if (c01.ge.f37217a == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            synchronized (c01.ge.class) {
                if (c01.ge.f37217a == null) {
                    c01.ee.c(context, com.tencent.mm.R.raw.domain_mainland, new c01.fe());
                }
            }
        }
        return str2 + c01.ee.f37168b.a((java.lang.String) c01.ge.f37217a.get(str), new com.tencent.mm.pointers.PInt()) + str3 + substring;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void saveAdInfoWithPosId(int i17, java.lang.String str) {
        try {
            xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
            boolean z17 = false;
            xj.m qj6 = ((wj.j0) iVar).qj(wj.t0.f446510s, new r45.e5().fromJson(str).toByteArray(), false);
            if (qj6 != null) {
                z17 = qj6.f454760h;
            } else {
                com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "saveAdInfoWithPosId return MagicAdInfo is nil");
            }
            getMMKV().putBoolean("yuanbao_is_for_older_user_state", z17);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "AdsInfo toByteArray fail");
        }
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean saveSecurityStore(java.lang.String str, byte[] bArr) {
        return false;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void setIdleTimerDisable(boolean z17) {
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "While setIdleTimerDisable, We can't get the activity on the top of stack");
        } else if (z17) {
            topOrUIPageFragmentActivity.getWindow().addFlags(128);
        } else {
            topOrUIPageFragmentActivity.getWindow().clearFlags(128);
        }
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void setLanguageChangeCallbackImpl(com.tencent.kinda.gen.VoidStringCallback voidStringCallback) {
        this.languageChangeCallback = voidStringCallback;
        this.checkLanguageChangeIListener.alive();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void setPaySafeAccessibilityServiceListCache(java.util.ArrayList<java.lang.Integer> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        if (arrayList == null || arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "[setPaySafeAccessibilityServiceListCache] serviceAction == null || serviceAction.size() <= 0 ,return");
            return;
        }
        if (arrayList2 == null || arrayList2.size() <= 0) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "[setPaySafeAccessibilityServiceListCache] serviceListName == null || serviceListName.size() <= 0 ,return");
            return;
        }
        r45.ex6 ex6Var = new r45.ex6();
        r45.c1 c1Var = new r45.c1();
        ex6Var.f373793g = c1Var;
        c1Var.f371197d = arrayList.get(0).intValue();
        ex6Var.f373793g.f371198e = arrayList.get(1).intValue();
        ex6Var.f373793g.f371199f = arrayList.get(2).intValue();
        ex6Var.f373793g.f371200g = arrayList.get(3).intValue();
        ex6Var.f373793g.f371201h = arrayList.get(4).intValue();
        ex6Var.f373793g.f371202i = arrayList.get(5).intValue();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            java.lang.String str = arrayList2.get(i17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                r45.b1 b1Var = new r45.b1();
                b1Var.f370424d = str;
                linkedList.add(b1Var);
            }
        }
        ex6Var.f373792f = linkedList;
        try {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAY_SAFE_ACCESSIBILITY_SERVICE_SERVER_CONFIG_NEW_STRING_SYNC, new java.lang.String(ex6Var.toByteArray(), java.nio.charset.StandardCharsets.ISO_8859_1));
            com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "[setPaySafeAccessibilityServiceListCache] setConfig success");
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "[setPaySafeAccessibilityServiceListCache] setConfig failed :%s", e17.getMessage());
        }
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void setRedDotStatus(java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        int redDotTipsId = getRedDotTipsId(str);
        if (redDotTipsId != 0 && !z17) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(redDotTipsId);
        }
        com.tencent.mm.storage.u3[] redDotKey = getRedDotKey(str);
        if (redDotKey == null || z17) {
            return;
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().j(redDotKey[0], redDotKey[1]);
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void setReportLocationState(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "setLocationState, set wifiSsidState as: [%b], set cellInfoState as [%b].", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        at4.u1 p17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p();
        p17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "setReportLocation, set wifiSsidState as: [%b], set cellInfoState as [%b].", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17) {
            p17.f13981a |= 262144;
        } else {
            p17.f13981a &= -262145;
        }
        if (z18) {
            p17.f13981a |= 8388608;
        } else {
            p17.f13981a &= -8388609;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchConfig", "setReportLocation, After set, switchBit is [%d]", java.lang.Integer.valueOf(p17.f13981a));
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void setScreenBrightness(float f17) {
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "set brightness to : %s", java.lang.Float.valueOf(f17));
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "While setScreenBrightness, We can't get the activity on the top of stack");
            return;
        }
        if (f17 != -1.0f && !(topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity)) {
            com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "While set brightness to %s, We can't get the UIPageFragmentActivity on the top of stack, which we get is %s", java.lang.Float.valueOf(f17), topOrUIPageFragmentActivity);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 107L, 1L, false);
            return;
        }
        com.tencent.mars.xlog.Log.i("KindaPlatformUtil", "start set brightness to %s, activity is %s", java.lang.Float.valueOf(f17), topOrUIPageFragmentActivity);
        android.view.WindowManager.LayoutParams attributes = topOrUIPageFragmentActivity.getWindow().getAttributes();
        if (attributes != null) {
            attributes.screenBrightness = f17;
            topOrUIPageFragmentActivity.getWindow().setAttributes(attributes);
        }
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void setStatusBarHidden(boolean z17, boolean z18) {
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity instanceof com.tencent.mm.framework.app.UIPageFragmentActivity) {
            if (z17) {
                topOrUIPageFragmentActivity.getWindow().addFlags(1024);
                return;
            } else {
                topOrUIPageFragmentActivity.getWindow().clearFlags(1024);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("KindaPlatformUtil", "While setStatusBarHidden, We can't get the UIPageFragmentActivity on the top of stack, which we get is [" + topOrUIPageFragmentActivity + "]");
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public java.lang.String sha256(byte[] bArr, boolean z17) {
        return "";
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean shouldReportCellInfo() {
        return at4.g0.g();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean shouldReportLocation() {
        return at4.g0.h();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean shouldReportWifiSsid() {
        return at4.g0.i();
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public boolean supportSecurityStore() {
        return false;
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void triggerPrefetchMallIndexWeApp(java.util.ArrayList<java.lang.String> arrayList) {
    }

    @Override // com.tencent.kinda.gen.IPlatformUtil
    public void updateWalletRegion(int i17) {
    }
}
