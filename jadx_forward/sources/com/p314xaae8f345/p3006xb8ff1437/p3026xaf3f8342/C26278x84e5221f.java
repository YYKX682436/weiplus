package com.p314xaae8f345.p3006xb8ff1437.p3026xaf3f8342;

/* renamed from: com.tencent.thumbplayer.config.TPPlayerConfig */
/* loaded from: classes16.dex */
public class C26278x84e5221f {
    private static java.lang.String DOT = "\\.";

    /* renamed from: ISOTT */
    public static final boolean f51519x42ba1a5 = false;

    /* renamed from: LOCAL_SERVER_BUFFER_SIZE_KEY */
    private static final java.lang.String f51520xa8fbb898 = "key_localserver_buffer_size";

    /* renamed from: LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_KEY */
    private static final java.lang.String f51521xd2380663 = "key_localserver_send_socket_buffer_size";
    private static final java.lang.String TAG = "TPPlayerConfig";

    /* renamed from: VERSION */
    public static final java.lang.String f51522x3fc0a8b8 = "2.33.0.1206";

    /* renamed from: appVersion */
    private static java.lang.String f51523x5875c377 = "";

    /* renamed from: appVersionName */
    private static java.lang.String f51524xd88e1ea2 = null;

    /* renamed from: beacon_log_host */
    public static java.lang.String f51525xdff6675e = "";

    /* renamed from: beacon_policy_host */
    public static java.lang.String f51526x126f5d1a = "";

    /* renamed from: buildNum */
    private static long f51527xaab9ae38 = -1;

    /* renamed from: enableStackTrace */
    public static boolean f51528x6acacd80 = false;

    /* renamed from: host_config */
    private static java.lang.String f51529x66365db9 = "";

    /* renamed from: localserver_buffer_size */
    public static int f51530xf795684f = 0;

    /* renamed from: localserver_send_socket_buffer_size */
    public static int f51531xd7b63d1a = 0;

    /* renamed from: mAbUserId */
    private static java.lang.String f51532x59027154 = "";

    /* renamed from: mEnableDataReport */
    private static boolean f51533x61b04dee = true;

    /* renamed from: mEnablePlayerReport */
    private static boolean f51534x6f9b17e5 = true;

    /* renamed from: mGuid */
    private static java.lang.String f51535x6220c96 = "";

    /* renamed from: mOutNetIp */
    private static java.lang.String f51536x27462883 = "";

    /* renamed from: mPlatform */
    private static int f51537x94bb1000 = -1;

    /* renamed from: mProxyServiceType */
    private static int f51538x29a3dece = -1;

    /* renamed from: mUseP2P */
    private static boolean f51539x1d96d294 = true;

    /* renamed from: mUserIsVip */
    private static boolean f51540x8dbd4f9b = false;

    /* renamed from: mUserUin */
    private static java.lang.String f51541x95537b62 = null;

    /* renamed from: mUserUpc */
    private static java.lang.String f51542x95537c30 = "";

    /* renamed from: mUserUpcState */
    private static int f51543xb62a7641;

    /* renamed from: getAbUserId */
    public static java.lang.String m101630xafdf073d() {
        return android.text.TextUtils.isEmpty(f51532x59027154) ? "" : f51532x59027154;
    }

    /* renamed from: getAppBigVersion */
    public static java.lang.String m101631xad933503(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(f51523x5875c377)) {
            return f51523x5875c377;
        }
        java.lang.String m101632xc725eb98 = m101632xc725eb98(context);
        if (android.text.TextUtils.isEmpty(m101632xc725eb98)) {
            m101632xc725eb98 = "0.0.0";
        } else {
            java.lang.String[] split = m101632xc725eb98.split(DOT);
            if (split != null && split.length == 4) {
                m101632xc725eb98 = m101632xc725eb98.substring(0, m101632xc725eb98.lastIndexOf("."));
            }
        }
        f51523x5875c377 = m101632xc725eb98;
        return m101632xc725eb98;
    }

    /* renamed from: getAppVersionName */
    public static java.lang.String m101632xc725eb98(android.content.Context context) {
        if (!android.text.TextUtils.isEmpty(f51524xd88e1ea2)) {
            return f51524xd88e1ea2;
        }
        if (context == null) {
            return "";
        }
        try {
            java.lang.String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f51524xd88e1ea2 = str;
            return str == null ? "" : str;
        } catch (java.lang.Throwable unused) {
            return "";
        }
    }

    /* renamed from: getBuildNumber */
    public static long m101633x57b0ca21(android.content.Context context) {
        long j17 = f51527xaab9ae38;
        if (-1 != j17) {
            return j17;
        }
        try {
            long longVersionCode = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
            f51527xaab9ae38 = longVersionCode;
            return longVersionCode;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "getLongVersionCode less api 28");
            return f51527xaab9ae38;
        }
    }

    /* renamed from: getGuid */
    public static java.lang.String m101634xfb7ffeff() {
        return f51535x6220c96;
    }

    /* renamed from: getMediaDrmReuseEnable */
    public static boolean m101635xe0f9c3c6() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3030xaf3f8342.C26337x95a3941e.m102004xe0f9c3c6();
    }

    /* renamed from: getNewReportEnable */
    public static boolean m101636x91940f61() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3030xaf3f8342.C26337x95a3941e.m102003xb33f814d();
    }

    /* renamed from: getOutNetIp */
    public static java.lang.String m101637x7e22be6c() {
        return f51536x27462883;
    }

    /* renamed from: getPlatform */
    public static int m101638xeb97a5e9() {
        return f51537x94bb1000;
    }

    /* renamed from: getProxyConfigDir */
    public static java.lang.String m101639xd568a813() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (!android.text.TextUtils.isEmpty(f51529x66365db9)) {
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50776x857015f6, new org.json.JSONObject(f51529x66365db9));
            }
            int i17 = f51530xf795684f;
            if (i17 > 0) {
                jSONObject.put(f51520xa8fbb898, i17);
            }
            int i18 = f51531xd7b63d1a;
            if (i18 > 0) {
                jSONObject.put(f51521xd2380663, i18);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
        }
        return jSONObject.toString();
    }

    /* renamed from: getProxyServiceType */
    public static int m101640xab647bb7() {
        int i17;
        int i18 = f51538x29a3dece;
        return (i18 != -1 || (i17 = f51537x94bb1000) == -1) ? i18 : i17;
    }

    /* renamed from: getUserUin */
    public static java.lang.String m101641x35080459() {
        return f51541x95537b62;
    }

    /* renamed from: getUserUpc */
    public static java.lang.String m101642x35080527() {
        return f51542x95537c30;
    }

    /* renamed from: getUserUpcState */
    public static int m101643x7f87efaa() {
        return f51543xb62a7641;
    }

    /* renamed from: getVideoMediaCodecCoexistMaxCnt */
    public static int m101644x850fb159() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3030xaf3f8342.C26337x95a3941e.m102005x850fb159();
    }

    /* renamed from: getWidevineProvisioningServerUrl */
    public static java.lang.String m101645xecc3da0c() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3030xaf3f8342.C26337x95a3941e.m102006xecc3da0c();
    }

    /* renamed from: isDataReportEnable */
    public static boolean m101646xa0ad81eb() {
        return f51533x61b04dee;
    }

    /* renamed from: isPlayerReportEnable */
    public static boolean m101647x3380e822() {
        return f51534x6f9b17e5;
    }

    /* renamed from: isUserIsVip */
    public static boolean m101648x5943477e() {
        return f51540x8dbd4f9b;
    }

    /* renamed from: parseHostConfig */
    public static void m101649x67dafa1d(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "parseHostConfig, config is null.");
            return;
        }
        f51529x66365db9 = str;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "parseHostConfig:" + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50776x857015f6)) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50776x857015f6);
                if (jSONObject2.has(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50771x7973099a)) {
                    f51526x126f5d1a = jSONObject2.getString(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50771x7973099a);
                }
                if (jSONObject2.has(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50770xb25935fe)) {
                    f51525xdff6675e = jSONObject2.getString(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50770xb25935fe);
                }
            }
            if (jSONObject.has(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50785x997341f9)) {
                com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103095x103ece74(com.p314xaae8f345.p3006xb8ff1437.p3052x5bb606bf.p3053xaf3f8342.C26465x6f5da734.m103089xe23ad884(), jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.api.C26185x39dabc5b.f50785x997341f9));
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(TAG, "parseHostConfig exception: " + th6.toString());
        }
    }

    /* renamed from: setAbUserId */
    public static void m101650xaa976849(java.lang.String str) {
        f51532x59027154 = str;
    }

    /* renamed from: setDataReportEnable */
    public static void m101651x4299c123(boolean z17) {
        f51533x61b04dee = z17;
    }

    /* renamed from: setDebugEnable */
    public static void m101652xfb4317f4(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.m104310xfb4317f4(z17);
    }

    /* renamed from: setGuid */
    public static void m101653x764ac60b(java.lang.String str) {
        f51535x6220c96 = str;
    }

    /* renamed from: setMediaDrmReuseEnable */
    public static void m101654x2f3e833a(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3030xaf3f8342.C26337x95a3941e.m102008x2f3e833a(z17);
    }

    /* renamed from: setNewReportEnable */
    public static void m101655xc86aa8d5(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3030xaf3f8342.C26337x95a3941e.m102007xe5831d59(z17);
    }

    /* renamed from: setOutNetIp */
    public static void m101656x78db1f78(java.lang.String str) {
        f51536x27462883 = str;
    }

    /* renamed from: setPlatform */
    public static void m101657xe65006f5(int i17) {
        f51537x94bb1000 = i17;
    }

    /* renamed from: setPlayerReportEnable */
    public static void m101658xb5a395a(boolean z17) {
        f51534x6f9b17e5 = z17;
    }

    /* renamed from: setProxyServiceType */
    public static void m101659x4f6110c3(int i17) {
        f51538x29a3dece = i17;
    }

    /* renamed from: setUserIsVip */
    public static void m101660x6ec73746(boolean z17) {
        f51540x8dbd4f9b = z17;
    }

    /* renamed from: setUserUin */
    public static void m101661xa87951cd(java.lang.String str) {
        f51541x95537b62 = str;
    }

    /* renamed from: setUserUpc */
    public static void m101662xa879529b(java.lang.String str) {
        f51542x95537c30 = str;
    }

    /* renamed from: setUserUpcState */
    public static void m101663xb5d0eab6(int i17) {
        f51543xb62a7641 = i17;
    }

    /* renamed from: setVideoMediaCodecCoexistMaxCnt */
    public static void m101664x7ff91465(int i17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3030xaf3f8342.C26337x95a3941e.m102009x7ff91465(i17);
    }

    /* renamed from: setVideoMediaCodecStuckCheck */
    public static void m101665x5a0a87d7(boolean z17) {
    }

    /* renamed from: setWidevineProvisioningServerUrl */
    public static void m101666x4f06d880(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3030xaf3f8342.C26337x95a3941e.m102011x4f06d880(str);
    }
}
