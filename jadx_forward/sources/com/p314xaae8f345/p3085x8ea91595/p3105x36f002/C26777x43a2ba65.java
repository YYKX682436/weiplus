package com.p314xaae8f345.p3085x8ea91595.p3105x36f002;

/* renamed from: com.tencent.tmassistantsdk.util.GlobalUtil */
/* loaded from: classes13.dex */
public class C26777x43a2ba65 {

    /* renamed from: NET_TYPE_WIFI */
    static final int f56826x7ea7cb8 = 4;

    /* renamed from: SharedPreferencesName */
    protected static final java.lang.String f56827x3a35f65e = "TMAssistantSDKSharedPreference";
    private static final java.lang.String TAG = "GlobalUtil";

    /* renamed from: mInstance */
    protected static com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65 f56828x46143c22;

    /* renamed from: mMemUUID */
    protected static int f56829xd6a151e3;

    /* renamed from: mContext */
    protected android.content.Context f56836xd6cfe882;

    /* renamed from: mJCECmdIdMap */
    public java.util.HashMap<java.lang.Integer, java.lang.String> f56837x9b3788e6;

    /* renamed from: mQUA */
    public java.lang.String f56838x32c710 = "";

    /* renamed from: JCE_CMDID_Empty */
    public final int f56830x614e6690 = 0;

    /* renamed from: JCE_CMDID_ReportLog */
    public final int f56835xef53e133 = 1;

    /* renamed from: JCE_CMDID_GetSettings */
    public final int f56834x4afd9c9c = 2;

    /* renamed from: JCE_CMDID_GetAppUpdate */
    public final int f56832x1671f0f1 = 3;

    /* renamed from: JCE_CMDID_GetAuthorized */
    public final int f56833x28d19bd4 = 4;

    /* renamed from: JCE_CMDID_GetAppSimpleDetail */
    public final int f56831xc1b4a2cb = 5;

    public C26777x43a2ba65() {
        this.f56837x9b3788e6 = null;
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = new java.util.HashMap<>();
        this.f56837x9b3788e6 = hashMap;
        hashMap.put(1, "ReportLog");
        this.f56837x9b3788e6.put(2, "GetSettings");
        this.f56837x9b3788e6.put(3, "GetAppUpdate");
        this.f56837x9b3788e6.put(4, "GetAuthorized");
        this.f56837x9b3788e6.put(5, "GetAppSimpleDetail");
    }

    /* renamed from: String2List */
    public static java.util.ArrayList<java.lang.String> m105479x6d7665f(java.lang.String str) {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        if (!android.text.TextUtils.isEmpty(str)) {
            for (java.lang.String str2 : str.split(",")) {
                if (!android.text.TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: assistantErrorCode2SDKErrorCode */
    public static int m105480xba38b0d6(int i17) {
        if (i17 == -1000) {
            return 604;
        }
        if (i17 == -16) {
            return 731;
        }
        if (i17 == -15) {
            return 1;
        }
        if (i17 == -1) {
            return 709;
        }
        if (i17 == 0) {
            return 0;
        }
        switch (i17) {
            case -28:
                return 701;
            case -27:
                return 606;
            case -26:
            case -24:
                return 604;
            case -25:
                return 602;
            case -23:
                return 601;
            case -22:
                return com.p314xaae8f345.p3085x8ea91595.p3088xaf3f29eb.C26651x338099a8.f55984x5fe5d0c0;
            case -21:
                return 700;
            default:
                switch (i17) {
                    case -13:
                        return 703;
                    case -12:
                        return com.p314xaae8f345.p3085x8ea91595.p3088xaf3f29eb.C26651x338099a8.f55997x158ee071;
                    case -11:
                        return 708;
                    default:
                        return 604;
                }
        }
    }

    /* renamed from: assistantState2SDKState */
    public static int m105481x258bf3d6(int i17) {
        if (i17 == 1) {
            return 2;
        }
        if (i17 == 2) {
            return 3;
        }
        if (i17 == 3) {
            return 5;
        }
        if (i17 == 4) {
            return 4;
        }
        if (i17 != 6) {
            return i17 != 9 ? 0 : 6;
        }
        return 1;
    }

    /* renamed from: calcMD5AsString */
    public static java.lang.String m105482x427490c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes();
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bytes, 0, bytes.length);
            byte[] digest = messageDigest.digest();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (byte b17 : digest) {
                stringBuffer.append(java.lang.Integer.toHexString(b17 & 255));
            }
            return stringBuffer.toString();
        } catch (java.security.NoSuchAlgorithmException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    /* renamed from: deleteOldDB */
    public static void m105483xbc3d25fa(java.lang.String str) {
        if (m105486x9cf0d20b().m105492x76847179() != null) {
            com.p314xaae8f345.mm.vfs.r6 j17 = com.p314xaae8f345.mm.vfs.r6.j(m105486x9cf0d20b().m105492x76847179().getDatabasePath(str));
            if (j17.m()) {
                try {
                    j17.l();
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "deleteDB");
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "deleteDB failed");
                }
            }
        }
    }

    /* renamed from: getAppPackageName */
    public static java.lang.String m105484xd4409c06(android.content.Context context) {
        return context != null ? context.getPackageName() : "";
    }

    /* renamed from: getAppVersionCode */
    public static int m105485xc7211efa(android.content.Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65 m105486x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65 c26777x43a2ba65;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.class) {
            if (f56828x46143c22 == null) {
                f56828x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65();
            }
            c26777x43a2ba65 = f56828x46143c22;
        }
        return c26777x43a2ba65;
    }

    /* renamed from: getMemUUID */
    public static synchronized int m105487x7655dada() {
        int i17;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.class) {
            i17 = f56829xd6a151e3;
            f56829xd6a151e3 = i17 + 1;
        }
        return i17;
    }

    /* renamed from: isDBExist */
    public static boolean m105488xfc04c0af(java.lang.String str) {
        return m105486x9cf0d20b().m105492x76847179() != null && com.p314xaae8f345.mm.vfs.r6.j(m105486x9cf0d20b().m105492x76847179().getDatabasePath(str)).m();
    }

    /* renamed from: updateFilePathAuthorized */
    public static void m105489x8c8e38e5(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        java.lang.String r17 = r6Var.r();
        java.lang.String r18 = new com.p314xaae8f345.mm.vfs.r6(r17).r();
        java.lang.String r19 = new com.p314xaae8f345.mm.vfs.r6(r18).r();
        try {
            java.lang.Runtime.getRuntime().exec("chmod 777 " + r6Var.o());
            java.lang.Runtime.getRuntime().exec("chmod 777 ".concat(r17));
            java.lang.Runtime.getRuntime().exec("chmod 777 ".concat(r18));
            java.lang.Runtime.getRuntime().exec("chmod 777" + r19);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: canReportValue */
    public boolean m105490x5aef92ad() {
        return false;
    }

    /* renamed from: destroy */
    public void m105491x5cd39ffa() {
        this.f56836xd6cfe882 = null;
        f56828x46143c22 = null;
    }

    /* renamed from: getContext */
    public android.content.Context m105492x76847179() {
        return this.f56836xd6cfe882;
    }

    /* renamed from: getJceCmdIdByClassName */
    public int m105493x33b0ad8d(java.lang.String str) {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap;
        if (str != null && (hashMap = this.f56837x9b3788e6) != null) {
            for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry : hashMap.entrySet()) {
                if (entry != null) {
                    java.lang.Integer key = entry.getKey();
                    java.lang.String value = entry.getValue();
                    if (value != null && value.equals(str)) {
                        return key.intValue();
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: getNetworkOperator */
    public java.lang.String m105494x7a99aabc() {
        android.content.Context context = this.f56836xd6cfe882;
        return context == null ? "" : ((android.telephony.TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
    }

    /* renamed from: getNetworkType */
    public int m105495x662add52() {
        android.content.Context context = this.f56836xd6cfe882;
        if (context == null) {
            return 0;
        }
        try {
            if (b3.l.m9698x3fed0563(context, "android.permission.READ_PHONE_STATE") == 0) {
                return ((android.telephony.TelephonyManager) this.f56836xd6cfe882.getSystemService("phone")).getNetworkType();
            }
        } catch (java.lang.Exception unused) {
        }
        return 0;
    }

    /* renamed from: getPhoneGuid */
    public java.lang.String m105496xc2125261() {
        android.content.SharedPreferences sharedPreferences;
        android.content.Context context = this.f56836xd6cfe882;
        return (context == null || (sharedPreferences = context.getSharedPreferences(f56827x3a35f65e, 0)) == null) ? "" : sharedPreferences.getString("TMAssistantSDKPhoneGUID", "");
    }

    /* renamed from: getQQDownloaderAPILevel */
    public int m105497x3f2a2e75() {
        android.os.Bundle bundle;
        android.content.Context context = this.f56836xd6cfe882;
        if (context == null) {
            return 0;
        }
        try {
            android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.tencent.android.qqdownloader", 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return 0;
            }
            return bundle.getInt("com.tencent.android.qqdownloader.sdk.apilevel");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    /* renamed from: getQQDownloaderVersionCode */
    public int m105498x28d5ae1a() {
        android.content.pm.PackageManager packageManager;
        android.content.Context context = this.f56836xd6cfe882;
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            try {
                android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo("com.tencent.android.qqdownloader", 0);
                if (packageInfo == null) {
                    return 0;
                }
                return packageInfo.versionCode;
            } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    /* renamed from: setContext */
    public void m105499xe9f5beed(android.content.Context context) {
        this.f56836xd6cfe882 = context;
        this.f56838x32c710 = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26780xbfb9b0f3(context).m105525xaab9b56f();
    }

    /* renamed from: setNetTypeValue */
    public void m105500xeaf20abc(byte b17) {
        android.content.SharedPreferences sharedPreferences;
        android.content.Context context = this.f56836xd6cfe882;
        if (context == null || (sharedPreferences = context.getSharedPreferences(f56827x3a35f65e, 0)) == null || java.lang.Byte.parseByte(sharedPreferences.getString("TMAssistantSDKNetType", "0")) == b17) {
            return;
        }
        sharedPreferences.edit().putString("TMAssistantSDKNetType", ((int) b17) + "").commit();
    }

    /* renamed from: setPhoneGuid */
    public void m105501x1e6612d5(java.lang.String str) {
        android.content.SharedPreferences sharedPreferences;
        android.content.Context context = this.f56836xd6cfe882;
        if (context == null || str == null || (sharedPreferences = context.getSharedPreferences(f56827x3a35f65e, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString("TMAssistantSDKPhoneGUID", str).commit();
    }
}
