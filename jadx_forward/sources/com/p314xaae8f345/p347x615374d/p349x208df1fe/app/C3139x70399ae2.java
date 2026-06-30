package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaPlatformUtil */
/* loaded from: classes9.dex */
public class C3139x70399ae2 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe {

    /* renamed from: DCEP_PACKAGE */
    private static final java.lang.String f12051xb7794a51 = "cn.gov.pbc.dcep";

    /* renamed from: SINGLE_BYTE_CHARSET_FOR_SAVE */
    private static final java.lang.String f12052xb5bec6a6 = "ISO-8859-1";

    /* renamed from: sKindaUseMMMetric */
    private static final int[] f12053xace64efd = {-1};

    /* renamed from: languageChangeCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a f12057x12bf8d8d = null;
    private final java.lang.String TAG = "KindaPlatformUtil";

    /* renamed from: KINDA_PLATFORM_UTIL_MMKV_PATH */
    private final java.lang.String f12054x4d10ef16 = "kinda_platform_util_mmkv_path";

    /* renamed from: YUAN_BAO_ID_FOR_OLDER_USER_STATE_KEY */
    private final java.lang.String f12055x1862195d = "yuanbao_is_for_older_user_state";

    /* renamed from: checkLanguageChangeIListener */
    private final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f12056xf936b5cd = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5253x7523e44a>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.1
        {
            this.f39173x3fe91575 = -1187832230;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5253x7523e44a c5253x7523e44a) {
            if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3139x70399ae2.this.f12057x12bf8d8d == null) {
                return true;
            }
            com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3139x70399ae2.this.f12057x12bf8d8d.mo28515x2e7a5e(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3139x70399ae2.this.mo25242xdf7aed7e());
            return true;
        }
    };

    /* renamed from: doReportScreenshotPageInfo */
    private void m25225x5ff12b62(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        java.lang.String str2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || abstractC3411xcfaed72e == null) {
            return;
        }
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("transId");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307)) {
            linkedList.add(mo27551x2fec8307);
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
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi(str2, linkedList, 0);
    }

    /* renamed from: getDensity */
    private float m25226x9a59d0b2(android.content.Context context) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        if (m25233xf9a881f7() && (resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
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

    /* renamed from: getMMKV */
    private com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 m25227xfb821f61() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("kinda_platform_util_mmkv_path");
    }

    /* renamed from: getRedDotKey */
    private com.p314xaae8f345.mm.p2621x8fb0427b.u3[] m25228x26085591(java.lang.String str) {
        if (str.equalsIgnoreCase("receipt")) {
            return new com.p314xaae8f345.mm.p2621x8fb0427b.u3[]{com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_F2F_COLLECT_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        if (str.equalsIgnoreCase("reward")) {
            return new com.p314xaae8f345.mm.p2621x8fb0427b.u3[]{com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_QR_REWARD_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        if (str.equalsIgnoreCase("groupaa")) {
            return new com.p314xaae8f345.mm.p2621x8fb0427b.u3[]{com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_GROUP_PAY_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        if (str.equalsIgnoreCase("faceHongBao")) {
            return new com.p314xaae8f345.mm.p2621x8fb0427b.u3[]{com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_F2F_HB_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        if (str.equalsIgnoreCase("transferBank") || str.equalsIgnoreCase("transferMobile") || str.equalsIgnoreCase("transferMix")) {
            return new com.p314xaae8f345.mm.p2621x8fb0427b.u3[]{com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_BANK_REMIT_STRING_SYNC, com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_WATCHER_WALLET_COMMON_STRING_SYNC};
        }
        return null;
    }

    /* renamed from: getRedDotTipsId */
    private int m25229xf36f1201(java.lang.String str) {
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

    /* renamed from: internalGetCacheLocationInfo */
    private com.p314xaae8f345.p347x615374d.gen.C3578x5f29fbd8 m25230x7230284c(int i17) {
        com.p314xaae8f345.p347x615374d.gen.C3578x5f29fbd8 c3578x5f29fbd8 = new com.p314xaae8f345.p347x615374d.gen.C3578x5f29fbd8();
        r45.h67 h67Var = new r45.h67();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WCPAY_LOCATION_CACHE_CONFIG_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "no location cache data");
        } else {
            try {
                h67Var.mo11468x92b714fd(str.getBytes("ISO-8859-1"));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("KindaPlatformUtil", "parse cacheString exp, " + e17.getLocalizedMessage());
            }
            c3578x5f29fbd8.f13752xea21d2bd = h67Var.f457418f;
            c3578x5f29fbd8.f13747x6200f78 = h67Var.f457419g;
            c3578x5f29fbd8.f13750x3636db1b = h67Var.f457420h;
            c3578x5f29fbd8.f13749x5202cff6 = h67Var.f457421i;
            c3578x5f29fbd8.f13748xd7300a69 = h67Var.f457422m;
            c3578x5f29fbd8.f13751x2e82f5d5 = h67Var.f457423n;
            c3578x5f29fbd8.f13746xfa938b7d = h67Var.f457424o;
        }
        ((h45.q) i95.n0.c(h45.q.class)).mo24854x32141af7(h67Var.f457416d, h67Var.f457417e, h67Var.f457423n, h67Var.f457421i, i17);
        return c3578x5f29fbd8;
    }

    /* renamed from: isDcepInstalled */
    private boolean m25231xbdaa3026() {
        return com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, f12051xb7794a51);
    }

    /* renamed from: isSupportNFC */
    private boolean m25232x5cd36426() {
        return ((h45.q) i95.n0.c(h45.q.class)).mo24772x3494ab9c();
    }

    /* renamed from: useMMMetric */
    private static boolean m25233xf9a881f7() {
        int[] iArr = f12053xace64efd;
        if (iArr[0] == -1) {
            synchronized (iArr) {
                if (iArr[0] == -1) {
                    iArr[0] = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.pay.C20611x56dcb186());
                }
            }
        }
        return iArr[0] == 1;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: accessibilityAnnounce */
    public void mo25234x19f68bd7(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190, java.lang.String str) {
        if (interfaceC3545x4499190 != null && (interfaceC3545x4499190 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0)) {
            android.view.View mo27110xfb86a31b = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190).mo27110xfb86a31b();
            if (mo27110xfb86a31b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "announce view is null");
            } else {
                mo27110xfb86a31b.announceForAccessibility(str);
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: accessibilityFocus */
    public void mo25235x440d442a(com.p314xaae8f345.p347x615374d.gen.InterfaceC3545x4499190 interfaceC3545x4499190) {
        if (interfaceC3545x4499190 != null && (interfaceC3545x4499190 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0)) {
            final android.view.View mo27110xfb86a31b = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0) interfaceC3545x4499190).mo27110xfb86a31b();
            if (mo27110xfb86a31b == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "focusFirst view is null");
            } else {
                mo27110xfb86a31b.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.2
                    @Override // java.lang.Runnable
                    public void run() {
                        mo27110xfb86a31b.sendAccessibilityEvent(128);
                    }
                });
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: androidAPILevel */
    public int mo25236xc6cdb119() {
        return android.os.Build.VERSION.SDK_INT;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: androidDpiLevel */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3378x96666b96 mo25237xd1d3b3b6() {
        return com.p314xaae8f345.p347x615374d.gen.EnumC3378x96666b96.UNKNOWN;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: base64Decode */
    public byte[] mo25238xbab1a41d(java.lang.String str) {
        return android.util.Base64.decode(str, 0);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: base64DecodeString */
    public java.lang.String mo25239x4235a68e(java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "" : new java.lang.String(android.util.Base64.decode(str, 0));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: base64Encode */
    public java.lang.String mo25240xbce55045(byte[] bArr) {
        return android.util.Base64.encodeToString(bArr, 2);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: beginIgnoringInteractionEvents */
    public void mo25241x58ec5ed3() {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: currentLanguageCode */
    public java.lang.String mo25242xdf7aed7e() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: currentPlatform */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3591x7397cc93 mo25243xf60f010c() {
        return com.p314xaae8f345.p347x615374d.gen.EnumC3591x7397cc93.ANDROID;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: delSecurityStore */
    public boolean mo25244xdf19ef36(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: dynamicFontSize */
    public float mo25245x49c1b64f(float f17) {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() != null ? com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get()) * f17 : f17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: dynamicSize */
    public float mo25246xf0947ce0(float f17) {
        return f17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: dynamicSizeByFontLevel */
    public float mo25247x66ba5cde(float f17, int i17) {
        return f17 * mo25279xede331aa(i17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: endIgnoringInteractionEvents */
    public void mo25248xf4c38ae1() {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: faceDataDecrypt */
    public byte[] mo25249xf4913e6(byte[] bArr, byte[] bArr2) {
        return new byte[0];
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: faceDataEncrypt */
    public byte[] mo25250x538aecbe(byte[] bArr, byte[] bArr2) {
        return new byte[0];
    }

    /* renamed from: finalize */
    public void m25251xd764dc1e() {
        this.f12056xf936b5cd.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: genUUID */
    public java.lang.String mo25252xfb31530b() {
        return wo.w0.k();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getAccessibilityIsTouchExplorationEnabled */
    public int mo25253x8e6279fb() {
        return ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ai();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getAccessibilityServiceList */
    public java.util.ArrayList<java.lang.String> mo25254x623c43b() {
        return ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Di(false);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getAndroidRepairConfig */
    public java.lang.String mo25255x5cbe2a08(java.lang.String str) {
        if (!str.equals("use_biometric_prompt")) {
            return "";
        }
        return "" + bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Pay_UseBiometricPrompt_Int, 0);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getBottomSafeAreaHeight */
    public float mo25256x34bebb02() {
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getCachedLocationInfo */
    public com.p314xaae8f345.p347x615374d.gen.C3578x5f29fbd8 mo25257xb2abea3b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "get cached location info");
        com.p314xaae8f345.p347x615374d.gen.C3578x5f29fbd8 c3578x5f29fbd8 = new com.p314xaae8f345.p347x615374d.gen.C3578x5f29fbd8();
        if (!m25231xbdaa3026() && !m25232x5cd36426()) {
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_dcep_address_logic_revert, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "dcep app is not install and nfc is not support, ignore get address data");
                return c3578x5f29fbd8;
            }
        }
        return m25230x7230284c(2);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getCachedLocationInfoForCashier */
    public com.p314xaae8f345.p347x615374d.gen.C3578x5f29fbd8 mo25258xd158aa55() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "getCachedLocationInfoForCashier");
        return m25230x7230284c(1);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getClientVersion */
    public int mo25259xeb61b2d7() {
        return o45.wf.f424562g;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getDeviceInfoForYuanBaoAd */
    public java.lang.String mo25260x8042c7fb() {
        try {
            ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommonDeviceId", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            java.lang.String b17 = v34.b.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommonDeviceId", "com.tencent.mm.plugin.sns.ad.SnsAdService");
            return b17;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "ISnsAdService getCommonDeviceId fail");
            return "";
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getExptBoolValue */
    public boolean mo25261x38fc10ba(java.lang.String str) {
        if ("ShouldOpen2026NewFaceToFaceLiteAppScanEntry".equals(str)) {
            ((kd0.r2) i95.n0.c(kd0.r2.class)).getClass();
            return true;
        }
        java.lang.String a17 = j62.e.g().a(str, "", false, false);
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(a17, 0) == 0) ? false : true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getExptStringValue */
    public java.lang.String mo25262x16975333(java.lang.String str) {
        java.lang.String a17 = j62.e.g().a(str, "", false, false);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) ? "" : a17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getFontLevel */
    public int mo25263xa29269bf() {
        float m27358x8f7e19b5 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.m27358x8f7e19b5(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get());
        int i17 = 0;
        while (true) {
            float[] fArr = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.f13409xa324f875;
            if (i17 >= fArr.length) {
                return 1;
            }
            if (com.p314xaae8f345.mm.ui.bk.M(m27358x8f7e19b5, fArr[i17])) {
                return i17;
            }
            i17++;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getIphoneSafeAreaBottomHeight */
    public float mo25264xb6fd2047() {
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getIsAccessibilityServiceRunning */
    public boolean mo25265x6c3fe6f8() {
        return la5.b.f399133a.g(true);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getLQTVersion */
    public int mo25266x74f3fe3f() {
        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_VERSION_INT_SYNC, 0)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "return lqt version:%s", java.lang.Integer.valueOf(intValue));
        return intValue;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getLoigcalResolutionHeight */
    public float mo25267x8250192a() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        if (m25233xf9a881f7() && (resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f17 = displayMetrics.density;
            if (f17 != 0.0f) {
                return displayMetrics.heightPixels / f17;
            }
        }
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() == null) {
            return 0.0f;
        }
        return r0.heightPixels / com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getResources().getDisplayMetrics().density;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getLoigcalResolutionWidth */
    public float mo25268x70641963() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        if (m25233xf9a881f7() && (resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f17 = displayMetrics.density;
            if (f17 != 0.0f) {
                return displayMetrics.widthPixels / f17;
            }
        }
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() == null) {
            return 0.0f;
        }
        return r0.widthPixels / com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getResources().getDisplayMetrics().density;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getMemoryKVString */
    public java.lang.String mo25269xaf1c5253(java.lang.String str) {
        return "";
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getNavigationBarHeight */
    public float mo25270x92c6830() {
        if (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() == null) {
            return 0.0f;
        }
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            return fp.a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context) / m25226x9a59d0b2(context);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "KindaContext.get() is not MMActivity, is %s.", context.getClass().getName());
        return 0.0f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getPadSplitHeight */
    public float mo25271xe81c1744() {
        return mo25267x8250192a();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getPadSplitWidth */
    public float mo25272x8c72f009() {
        return mo25268x70641963();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getPhoneOsVersion */
    public java.lang.String mo25273x3992e97c() {
        return android.os.Build.VERSION.RELEASE;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getPhonePlatform */
    public java.lang.String mo25274xb02d784b() {
        return android.os.Build.MANUFACTURER;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getPlatformString */
    public java.lang.String mo25275xbc4e1f5a(java.lang.String str) {
        return "";
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getPx */
    public float mo25276x5db1bfe(float f17) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        if (m25233xf9a881f7() && (resources = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f18 = displayMetrics.density;
            if (f18 != 0.0f) {
                return f17 / f18;
            }
        }
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() != null ? f17 / com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get().getResources().getDisplayMetrics().density : f17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getRedDotStatus */
    public int mo25277xf24e7380(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        int m25229xf36f1201 = m25229xf36f1201(str);
        if (m25229xf36f1201 != 0) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            android.util.Pair c17 = rn3.i.Di().c(new vn3.c(m25229xf36f1201));
            if (c17.first == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "show reddot from new tips platform, key is %s", str);
                return 2;
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.u3[] m25228x26085591 = m25228x26085591(str);
        if (m25228x26085591 != null) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            if (bk0.a.g().d(m25228x26085591[0], m25228x26085591[1])) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "show reddot from newxml, key is %s", str);
                return 1;
            }
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getRedDotWording */
    public java.lang.String mo25278x2378caca(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.equals("receipt")) {
            return null;
        }
        gm0.j1.i();
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_FACING_REDDOT_WORDING_STRING_SYNC, "");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getScaleByFontLevel */
    public float mo25279xede331aa(int i17) {
        if (i17 < 0) {
            i17 = 0;
        } else {
            try {
                float[] fArr = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.f13409xa324f875;
                if (i17 >= fArr.length) {
                    i17 = fArr.length - 1;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "getScaleByFontLevel error:%s", e17.getMessage());
                return 1.0f;
            }
        }
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3375xfe0f7812.f13409xa324f875[i17];
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getScreenBrightness */
    public float mo25280xb7d9953() {
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "While getScreenBrightness, We can't get the activity on the top of stack, use system brightness");
            return m25283x64777c0f();
        }
        android.view.WindowManager.LayoutParams attributes = m27313x7608d9c4.getWindow().getAttributes();
        if (attributes == null) {
            return 0.0f;
        }
        float f17 = attributes.screenBrightness;
        if (f17 == -1.0f) {
            return m25283x64777c0f();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "get current activity brightness :%s", java.lang.Float.valueOf(f17));
        return f17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getScreenDensity */
    public float mo25281x6c461726() {
        return com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get() != null ? i65.a.g(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get()) : j65.f.f();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getStatusBarHeight */
    public float mo25282xe5345112() {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context != null) {
            return com.p314xaae8f345.mm.ui.bk.p(context) / m25226x9a59d0b2(context);
        }
        return 0.0f;
    }

    /* renamed from: getSystemBrightnessPercent */
    public float m25283x64777c0f() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        float f17 = 0.0f;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "MMApplicationContext is null, return 0");
            return 0.0f;
        }
        try {
            int i17 = android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "get system screen brightness :%s", java.lang.Integer.valueOf(i17));
            if (i17 < 0) {
                i17 = 0;
            }
            if (i17 > 255) {
                i17 = 255;
            }
            f17 = i17 / 255.0f;
        } catch (android.provider.Settings.SettingNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "ex %s", e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "get screen brightness :%s", java.lang.Float.valueOf(f17));
        return f17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getTextWidth */
    public float mo25284xc11f9de3(java.lang.String str, float f17) {
        android.content.res.Resources resources;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0.0f;
        }
        android.content.Context context = m25233xf9a881f7() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null || (resources = context.getResources()) == null) {
            return 0.0f;
        }
        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics == null || displayMetrics.density == 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "getTextWidth, density is 0");
            return 0.0f;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(displayMetrics.density * f17);
        float measureText = paint.measureText(str) / displayMetrics.density;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "getTextWidth, content:%s, textSize:%s, textWidth:%s", str, java.lang.Float.valueOf(f17), java.lang.Float.valueOf(measureText));
        return measureText;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getUserLocationImpl */
    public void mo25285x7639e256(final com.p314xaae8f345.p347x615374d.gen.AbstractC3624x36fac03 abstractC3624x36fac03) {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().k(new i11.c() { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.3
            @Override // i11.c
            /* renamed from: onGetLocation */
            public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "onGetLocation %b", java.lang.Boolean.valueOf(z17));
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                i11.h.e().m(this);
                if (z17) {
                    abstractC3624x36fac03.mo28460x2e7a5e(f17, f18, z17);
                    return false;
                }
                abstractC3624x36fac03.mo28460x2e7a5e(0.0f, 0.0f, !z17);
                return false;
            }
        }, true);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getViewScale */
    public float mo25286xa0fa2eef() {
        return j65.f.f379476g;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getYuanBaoInstalledState */
    public boolean mo25287xca4d6e68() {
        return ik1.b.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "com.tencent.hunyuan.app.chat");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: getYuanBaoIsForOldUser */
    public boolean mo25288x894633c4() {
        return m25227xfb821f61().getBoolean("yuanbao_is_for_older_user_state", false);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: handleAdFeedbackCloseWithAid */
    public void mo25289xa91962ae(java.lang.String str) {
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).aj(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: handleAdOpenWithAid */
    public void mo25290xca4b781(java.lang.String str) {
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).bj(str, null, new xj.l() { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.5
            @Override // xj.l
            /* renamed from: onJumpAppCancel */
            public void mo25335x737e9bce() {
            }

            @Override // xj.l
            /* renamed from: onJumpAppCheckExpose */
            public void mo25336x6332c618() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,5,,,");
                sb6.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3139x70399ae2.this.mo25288x894633c4() ? "2" : "1");
                sb6.append(",1");
                g0Var.mo68478xbd3cda5f(35858, sb6.toString());
            }

            @Override // xj.l
            /* renamed from: onJumpAppFail */
            public void mo25337x30578972() {
            }

            @Override // xj.l
            /* renamed from: onJumpAppSuccess */
            public void mo25338x6c3e7d2f() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,6,,,");
                sb6.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3139x70399ae2.this.mo25288x894633c4() ? "2" : "1");
                sb6.append(",1");
                g0Var.mo68478xbd3cda5f(35858, sb6.toString());
            }

            @Override // xj.l
            /* renamed from: onJumpDownloadPage */
            public void mo25339xfa564284() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,7,,,");
                sb6.append(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3139x70399ae2.this.mo25288x894633c4() ? "2" : "1");
                sb6.append(",1");
                g0Var.mo68478xbd3cda5f(35858, sb6.toString());
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: iOSDevice */
    public com.p314xaae8f345.p347x615374d.gen.EnumC3408xf675c0a3 mo25291x7f03a0c3() {
        return com.p314xaae8f345.p347x615374d.gen.EnumC3408xf675c0a3.UNKNOWN;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: iOSVersion */
    public java.lang.String mo25292x196ce80b() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: insertZeroWidthJoiner */
    public java.lang.String mo25293xcfd7f0fc(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.length() < 2) {
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

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: isAccessibilityServiceSafe */
    public boolean mo25294x79be14fe() {
        return ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Bi() == 1;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: isCareModeOn */
    public boolean mo25295xd28b7a1d() {
        return j65.e.b();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: isDarkModeOn */
    public boolean mo25296x43a4ec2() {
        return com.p314xaae8f345.mm.ui.bk.C();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: isFlutterOnTop */
    public boolean mo25297x4067f684() {
        boolean z17;
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950) {
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950) context).f218844i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10715x7014d3f9);
            if ("pay".equals(c10715x7014d3f9.f149648f)) {
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "isFlutterOnTop %s", java.lang.Boolean.valueOf(z17));
                return z17;
            }
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "isFlutterOnTop %s", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: isForAndroidTest */
    public boolean mo25298x18401ae2() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z65.c.a() || o45.wf.f424566k;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: isLocationAuthorized */
    public boolean mo25299x9b54a5fa() {
        return ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.ACCESS_FINE_LOCATION", d85.f0.C.f308710e) == d85.h0.GRANTED;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: isNetworkConnected */
    public boolean mo25300x550b09c5() {
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: isPad */
    public boolean mo25301x5fd2309() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: isScreenCaptured */
    public boolean mo25302x9c93a234() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: launchFlutter */
    public void mo25303x4d82ace9(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "launchFlutter, supportSwipe:%s", java.lang.Boolean.valueOf(z17));
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new ej0.a("pay", context, null), 3, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: loadSecurityStore */
    public byte[] mo25304x21ac2a3b(java.lang.String str) {
        return new byte[0];
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: makesureLonglink */
    public void mo25305xe9eaf499() {
        java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new c01.ra(new com.p314xaae8f345.mm.p2802xd031a825.ui.h1(), null));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    public java.lang.String md5(java.lang.String str) {
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: md5Data */
    public java.lang.String mo25306x33b71a48(byte[] bArr) {
        return "";
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: openNativeScanView */
    public void mo25307xc78cc4e3() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
        intent.putExtra("key_scan_report_enter_scene", 31);
        intent.putExtra("key_config_black_interval", true);
        intent.putExtra("key_enable_multi_code", true);
        intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
        intent.putExtra("key_enable_scan_code_product_merge", true);
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "[openNativeScanView] KindaContext is null, use MMApplicationContext");
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "[openNativeScanView] context is null, open scan fail");
            return;
        }
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        j45.l.j(context, "scanner", ".ui.BaseScanUI", intent, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: openTinyApp */
    public void mo25308xa60a7957(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppUserName");
        java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppPath");
        java.lang.String mo27551x2fec83073 = abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppVersion");
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppScene"), 0);
        int P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(abstractC3411xcfaed72e.mo27551x2fec8307("KindaTinyAppType"), 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "failed openTinyApp for empty appusername");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = mo27551x2fec8307;
        b1Var.f398555f = mo27551x2fec83072;
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(mo27551x2fec83073, 0);
        if (P3 > 0) {
            b1Var.f398551d = P3;
        }
        if (P == 0) {
            b1Var.f398565k = 1034;
        } else {
            b1Var.f398565k = P;
        }
        if (P2 == 0) {
            b1Var.f398549c = 0;
        } else {
            b1Var.f398549c = 2;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: playVibration */
    public void mo25309xec33e1be() {
        try {
            android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "KindaContext get null while playVibration!");
                return;
            }
            android.os.Vibrator vibrator = (android.os.Vibrator) context.getSystemService("vibrator");
            if (vibrator == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "playVibration call getSystemService get null!");
            } else {
                vibrator.vibrate(15L);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "playVibration exception %s", e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: preloadLiteApp */
    public void mo25310xfcc6684a(final java.lang.String str, final java.lang.String str2) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h() { // from class: com.tencent.kinda.framework.app.KindaPlatformUtil.4
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
            /* renamed from: fail */
            public void mo25333x2fd71e(java.lang.String str3, int i17) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(context, str, str2, "preloadLiteApp");
            }

            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
            /* renamed from: success */
            public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441, int i17) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Qj(context, str, str2, "preloadLiteApp");
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: publishPayLiteAppGlobalEvent */
    public void mo25311xa2cc951d(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "publishPayLiteAppGlobalEvent");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.Iterator<java.lang.String> it = abstractC3411xcfaed72e.mo27540xc99d6335().iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307(next);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307)) {
                    jSONObject.put(next, mo27551x2fec8307);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("KindaPlatformUtil", e17, "notify data exception", new java.lang.Object[0]);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l("pay.notifyAll", jSONObject);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: releasePreloadLiteApp */
    public void mo25312x69e84431(java.lang.String str, java.lang.String str2) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Yj(str, str2);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: reportAdWithAidAndType */
    public void mo25313x3471a92(java.lang.String str) {
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).mj(str, wj.w0.f528074d, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: reportDidTakeScreenshot */
    public void mo25314x927858d8(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
        java.lang.String mo27551x2fec8307 = abstractC3411xcfaed72e.mo27551x2fec8307("pageUrl");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo27551x2fec8307)) {
            return;
        }
        if (!mo27551x2fec8307.equals("paidOrderDetail")) {
            m25225x5ff12b62(mo27551x2fec8307, abstractC3411xcfaed72e);
            return;
        }
        java.lang.String mo27551x2fec83072 = abstractC3411xcfaed72e.mo27551x2fec8307("transId");
        if (mo27551x2fec83072 == null) {
            mo27551x2fec83072 = "";
        }
        w04.l.INSTANCE.Ta(mo27551x2fec83072);
        m25225x5ff12b62(mo27551x2fec8307, abstractC3411xcfaed72e);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: resolveLanguageStringForGlobal */
    public java.lang.String mo25315xc233ab7(java.lang.String str) {
        return c01.je.r(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: resolveURLStringForGlobal */
    public java.lang.String mo25316xfdba6a58(java.lang.String str) {
        java.util.Set set = c01.je.f118804a;
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n9.f274417a;
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
        if (c01.ge.f118750a == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            synchronized (c01.ge.class) {
                if (c01.ge.f118750a == null) {
                    c01.ee.c(context, com.p314xaae8f345.mm.R.raw.f78977x8f448c3f, new c01.fe());
                }
            }
        }
        return str2 + c01.ee.f118701b.a((java.lang.String) c01.ge.f118750a.get(str), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f()) + str3 + substring;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: saveAdInfoWithPosId */
    public void mo25317x54aee1bb(int i17, java.lang.String str) {
        try {
            xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
            boolean z17 = false;
            xj.m qj6 = ((wj.j0) iVar).qj(wj.t0.f528043s, new r45.e5().mo75930xb5cb93b2(str).mo14344x5f01b1f6(), false);
            if (qj6 != null) {
                z17 = qj6.f536293h;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "saveAdInfoWithPosId return MagicAdInfo is nil");
            }
            m25227xfb821f61().putBoolean("yuanbao_is_for_older_user_state", z17);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "AdsInfo toByteArray fail");
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: saveSecurityStore */
    public boolean mo25318x41349b04(java.lang.String str, byte[] bArr) {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: setIdleTimerDisable */
    public void mo25319x711a5e59(boolean z17) {
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "While setIdleTimerDisable, We can't get the activity on the top of stack");
        } else if (z17) {
            m27313x7608d9c4.getWindow().addFlags(128);
        } else {
            m27313x7608d9c4.getWindow().clearFlags(128);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: setLanguageChangeCallbackImpl */
    public void mo25320xb503974f(com.p314xaae8f345.p347x615374d.gen.AbstractC3635x710ca4a abstractC3635x710ca4a) {
        this.f12057x12bf8d8d = abstractC3635x710ca4a;
        this.f12056xf936b5cd.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: setPaySafeAccessibilityServiceListCache */
    public void mo25321xa5b642ea(java.util.ArrayList<java.lang.Integer> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        if (arrayList == null || arrayList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "[setPaySafeAccessibilityServiceListCache] serviceAction == null || serviceAction.size() <= 0 ,return");
            return;
        }
        if (arrayList2 == null || arrayList2.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "[setPaySafeAccessibilityServiceListCache] serviceListName == null || serviceListName.size() <= 0 ,return");
            return;
        }
        r45.ex6 ex6Var = new r45.ex6();
        r45.c1 c1Var = new r45.c1();
        ex6Var.f455326g = c1Var;
        c1Var.f452730d = arrayList.get(0).intValue();
        ex6Var.f455326g.f452731e = arrayList.get(1).intValue();
        ex6Var.f455326g.f452732f = arrayList.get(2).intValue();
        ex6Var.f455326g.f452733g = arrayList.get(3).intValue();
        ex6Var.f455326g.f452734h = arrayList.get(4).intValue();
        ex6Var.f455326g.f452735i = arrayList.get(5).intValue();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            java.lang.String str = arrayList2.get(i17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                r45.b1 b1Var = new r45.b1();
                b1Var.f451957d = str;
                linkedList.add(b1Var);
            }
        }
        ex6Var.f455325f = linkedList;
        try {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAY_SAFE_ACCESSIBILITY_SERVICE_SERVER_CONFIG_NEW_STRING_SYNC, new java.lang.String(ex6Var.mo14344x5f01b1f6(), java.nio.charset.StandardCharsets.ISO_8859_1));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "[setPaySafeAccessibilityServiceListCache] setConfig success");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "[setPaySafeAccessibilityServiceListCache] setConfig failed :%s", e17.getMessage());
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: setRedDotStatus */
    public void mo25322x28976e8c(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        int m25229xf36f1201 = m25229xf36f1201(str);
        if (m25229xf36f1201 != 0 && !z17) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            rn3.i.Di().a(m25229xf36f1201);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.u3[] m25228x26085591 = m25228x26085591(str);
        if (m25228x26085591 == null || z17) {
            return;
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().j(m25228x26085591[0], m25228x26085591[1]);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: setReportLocationState */
    public void mo25323x2874946(boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "setLocationState, set wifiSsidState as: [%b], set cellInfoState as [%b].", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        at4.u1 p17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p();
        p17.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "setReportLocation, set wifiSsidState as: [%b], set cellInfoState as [%b].", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17) {
            p17.f95514a |= 262144;
        } else {
            p17.f95514a &= -262145;
        }
        if (z18) {
            p17.f95514a |= 8388608;
        } else {
            p17.f95514a &= -8388609;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "setReportLocation, After set, switchBit is [%d]", java.lang.Integer.valueOf(p17.f95514a));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: setScreenBrightness */
    public void mo25324xaf7a2e5f(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "set brightness to : %s", java.lang.Float.valueOf(f17));
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "While setScreenBrightness, We can't get the activity on the top of stack");
            return;
        }
        if (f17 != -1.0f && !(m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "While set brightness to %s, We can't get the UIPageFragmentActivity on the top of stack, which we get is %s", java.lang.Float.valueOf(f17), m27313x7608d9c4);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 107L, 1L, false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KindaPlatformUtil", "start set brightness to %s, activity is %s", java.lang.Float.valueOf(f17), m27313x7608d9c4);
        android.view.WindowManager.LayoutParams attributes = m27313x7608d9c4.getWindow().getAttributes();
        if (attributes != null) {
            attributes.screenBrightness = f17;
            m27313x7608d9c4.getWindow().setAttributes(attributes);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: setStatusBarHidden */
    public void mo25325x1c40f709(boolean z17, boolean z18) {
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 instanceof com.p314xaae8f345.mm.p780x208df1fe.app.ActivityC10720x85cbbee2) {
            if (z17) {
                m27313x7608d9c4.getWindow().addFlags(1024);
                return;
            } else {
                m27313x7608d9c4.getWindow().clearFlags(1024);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPlatformUtil", "While setStatusBarHidden, We can't get the UIPageFragmentActivity on the top of stack, which we get is [" + m27313x7608d9c4 + "]");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: sha256 */
    public java.lang.String mo25326xca23b627(byte[] bArr, boolean z17) {
        return "";
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: shouldReportCellInfo */
    public boolean mo25327x1b869317() {
        return at4.g0.g();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: shouldReportLocation */
    public boolean mo25328xc38c519c() {
        return at4.g0.h();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: shouldReportWifiSsid */
    public boolean mo25329x2544617() {
        return at4.g0.i();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: supportSecurityStore */
    public boolean mo25330x862731f2() {
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: triggerPrefetchMallIndexWeApp */
    public void mo25331xaf7d45a4(java.util.ArrayList<java.lang.String> arrayList) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3409x166e89fe
    /* renamed from: updateWalletRegion */
    public void mo25332xe6046fb6(int i17) {
    }
}
