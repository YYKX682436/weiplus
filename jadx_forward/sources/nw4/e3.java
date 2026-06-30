package nw4;

/* loaded from: classes.dex */
public abstract class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f422363a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f422364b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f422365c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f422366d = "";

    public static void a(java.util.Map map, boolean z17, java.lang.String str, java.lang.String str2) {
        if (map != null) {
            map.put("fromMenu", java.lang.Boolean.valueOf(z17));
            map.put("keyParam", str);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get("appId"))) {
                map.put("appId", str2);
            }
        }
    }

    public static void b(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean z17;
        boolean z18;
        int i17;
        int i18;
        int i19;
        java.lang.String str6 = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewSecurityUtil", "function name is null or nil.");
            return;
        }
        if (map != null) {
            z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) map.get("fromMenu"));
            str2 = (java.lang.String) map.get("keyParam");
            if (str2 == null) {
                str2 = "";
            }
            str3 = (java.lang.String) map.get("appId");
            if (str3 == null) {
                str3 = "";
            }
            z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) map.get("isSuccess"));
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) map.get("permissionValue"));
            i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) map.get("baseErrorCode"));
            i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) map.get("jsapiErrorCode"));
            str4 = (java.lang.String) map.get("containerEnv");
            if (str4 == null) {
                str4 = "";
            }
            str5 = (java.lang.String) map.get("miniProgramPath");
            if (str5 == null) {
                str5 = "";
            }
        } else {
            str2 = null;
            str3 = "";
            str4 = str3;
            str5 = str4;
            z17 = false;
            z18 = false;
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        java.lang.String str7 = f422364b;
        if (str7 == null) {
            str7 = "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        java.lang.String a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(str7);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) && map != null) {
            java.lang.String str8 = (java.lang.String) map.get("report_initUrl");
            if (str8 == null) {
                str8 = "";
            }
            a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(str8);
        }
        java.lang.String str9 = f422365c;
        if (str9 == null) {
            str9 = "";
        }
        java.lang.String a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(str9);
        boolean z19 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(a17);
        sb6.append(",");
        sb6.append(a18);
        sb6.append(",");
        java.lang.String str10 = f422366d;
        sb6.append(str10 != null ? str10 : "");
        sb6.append(",");
        sb6.append(str6 == null ? "" : str6);
        sb6.append(",");
        sb6.append(z17 ? "1" : "0");
        sb6.append(",");
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(",");
        sb6.append(str3);
        sb6.append(",");
        sb6.append(z18 ? "1" : "0");
        sb6.append(",");
        sb6.append(i17);
        if (z18) {
            sb6.append(",0,0,0");
        } else {
            sb6.append(",0,");
            sb6.append(i18);
            sb6.append(",");
            sb6.append(i19);
        }
        java.lang.String sb7 = sb6.toString();
        if (z19) {
            if (java.lang.System.currentTimeMillis() % 20 == 0) {
                sb6.append(",");
                sb6.append(str4);
                sb6.append(",");
                sb6.append(str5);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(18816, sb6.toString());
            }
        } else {
            if (java.lang.System.currentTimeMillis() % 20 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10417, sb7);
            }
        }
        java.util.HashSet hashSet = (java.util.HashSet) f422363a;
        if (hashSet.size() <= 0) {
            hashSet.add("openUrlByExtBrowser");
            hashSet.add("getCurrentSSID");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3.f34476x24728b);
            hashSet.add("uploadImage");
            hashSet.add("chooseVideo");
            hashSet.add("uploadVideo");
            hashSet.add("getOpenDeviceId");
            hashSet.add("chooseIdCard");
            hashSet.add("recordVideo");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z3.f34512x24728b);
            hashSet.add("requestWxFacePictureVerify");
            hashSet.add("requestWxFacePictureVerifyUnionVideo");
            hashSet.add(cb1.o0.f4276x24728b);
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g0.f33725x24728b);
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q.f33745x24728b);
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.x.f33757x24728b);
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.l1.f33739x24728b);
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33741x24728b);
            hashSet.add("launch3rdApp");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.h1.f33727x24728b);
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pc.f34669x24728b);
            hashSet.add("launchApplication");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.v.f33753x24728b);
            hashSet.add(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589);
            hashSet.add("addContact");
            hashSet.add("jumpToBizProfile");
            hashSet.add("startTempSession");
            hashSet.add("quicklyAddBrandContact");
            hashSet.add("openBizChat");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.g1.f34800x24728b);
            hashSet.add("sendAppMessage");
            hashSet.add("sendServiceAppMessage");
            hashSet.add("getSendC2CMessageRequest");
            hashSet.add("shareQQ");
            hashSet.add("selectSingleContact");
            hashSet.add("sendAppMessageToSpecifiedContact");
            hashSet.add("sendSingleAppMessage");
            hashSet.add("openWeApp");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.l.f34522x24728b);
            hashSet.add("addCustomMenuItems");
            hashSet.add("openUrlWithExtraWebview");
            hashSet.add("enableFullScreen");
            hashSet.add("openCustomWebview");
            hashSet.add("openSpecificView");
            hashSet.add("getBrandWCPayBindCardRequest");
            hashSet.add("getTransferMoneyRequest");
            hashSet.add("verifyWCPayPassword");
            hashSet.add("getRecevieBizHongBaoRequest");
            hashSet.add("getH5PrepayRequest");
            hashSet.add("getH5TransactionRequest");
            hashSet.add("getWebPayCheckoutCounterRequst");
            hashSet.add("getWCPayRealnameVerify");
            hashSet.add("unbindBankCard");
            hashSet.add("idCardRealnameVerify");
            hashSet.add("openLuckyMoneyDetailView");
            hashSet.add("setWCPayPassword");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w9.f34941x24728b);
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1070x2fd65d.j.f33900x24728b);
            hashSet.add("scanLicence");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h.f34168x24728b);
            hashSet.add("getBrandWCPayRequest");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.p1.f34641x24728b);
            hashSet.add("editAddress");
            hashSet.add("getLatestAddress");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.g0.f34402x24728b);
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u4.f34897x24728b);
            hashSet.add("requireSoterBiometricAuthentication");
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b);
        }
        if (hashSet.contains(str6)) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(a17);
            sb8.append(",");
            sb8.append(a18);
            sb8.append(",");
            if (str6 == null) {
                str6 = "";
            }
            sb8.append(str6);
            sb8.append(",");
            sb8.append(str3);
            sb8.append(",");
            sb8.append(z18 ? "1" : "0");
            java.lang.String sb9 = sb8.toString();
            if (!z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(17048, sb9);
                return;
            }
            sb8.append(",");
            sb8.append(str4);
            sb8.append(",");
            sb8.append(str5);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(18817, sb8.toString());
        }
    }
}
