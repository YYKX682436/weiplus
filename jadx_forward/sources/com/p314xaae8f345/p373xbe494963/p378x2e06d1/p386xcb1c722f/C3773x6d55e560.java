package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.system.LiteavSystemInfo */
/* loaded from: classes13.dex */
public class C3773x6d55e560 {

    /* renamed from: APP_SYSTEM_METHOD_DEFAULT_GET_INTERVAL_MS */
    private static final int f14699x64d53cad = 1000;

    /* renamed from: EXT_KEY_APP_BACKGROUND */
    private static final java.lang.String f14700x5ac3732a = "isAppBackground";

    /* renamed from: EXT_KEY_APP_NAME */
    private static final java.lang.String f14701x1ac1d187 = "appName";

    /* renamed from: EXT_KEY_APP_PACKAGE_NAME */
    private static final java.lang.String f14702x5dbb3600 = "appPackageName";

    /* renamed from: EXT_KEY_APP_VERSION */
    private static final java.lang.String f14703x6f31183c = "appVersion";

    /* renamed from: EXT_KEY_BUILD_BOARD */
    private static final java.lang.String f14704x793a1157 = "buildBoard";

    /* renamed from: EXT_KEY_BUILD_BRAND */
    private static final java.lang.String f14705x793b6df8 = "buildBrand";

    /* renamed from: EXT_KEY_BUILD_HARDWARE */
    private static final java.lang.String f14706xf35e65b7 = "buildHardware";

    /* renamed from: EXT_KEY_BUILD_MANUFACTURER */
    private static final java.lang.String f14707xdd031c20 = "buildManufacturer";

    /* renamed from: EXT_KEY_BUILD_MODEL */
    private static final java.lang.String f14708x79d51d9a = "buildModel";

    /* renamed from: EXT_KEY_BUILD_VERSION */
    private static final java.lang.String f14709x24d76309 = "buildVersion";

    /* renamed from: EXT_KEY_BUILD_VERSION_INT */
    private static final java.lang.String f14710x55190199 = "buildVersionInt";

    /* renamed from: GET_APP_MEMORY_INTERVAL_MS */
    private static final int f14711xcc7c2b49 = 15000;

    /* renamed from: NETWORK_TYPE_2G */
    private static final int f14712x48a78049 = 4;

    /* renamed from: NETWORK_TYPE_3G */
    private static final int f14713x48a78068 = 3;

    /* renamed from: NETWORK_TYPE_4G */
    private static final int f14714x48a78087 = 2;

    /* renamed from: NETWORK_TYPE_5G */
    private static final int f14715x48a780a6 = 6;

    /* renamed from: NETWORK_TYPE_UNKNOWN */
    private static final int f14716x3c4bd6b6 = 0;

    /* renamed from: NETWORK_TYPE_WIFI */
    private static final int f14717xbcd97409 = 1;

    /* renamed from: NETWORK_TYPE_WIRED */
    private static final int f14718xde5539eb = 5;
    private static final java.lang.String TAG = "LiteavBaseSystemInfo";

    /* renamed from: sModel */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14735xc8ae5a76 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.j.a());

    /* renamed from: sBrand */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14723xc814aad4 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.k.a());

    /* renamed from: sManufacturer */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14732xb94563e4 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.l.a());

    /* renamed from: sHardware */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14726xa590277b = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.m.a());

    /* renamed from: sSystemOSVersion */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14737x82a67812 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.n.a());

    /* renamed from: sSystemOSVersionInt */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.Integer> f14738xea2fd67d = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.o.a());

    /* renamed from: sBoard */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14722xc8134e33 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.p.a());

    /* renamed from: sAppPackageName */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14720x7805663 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.d.a());

    /* renamed from: sAppName */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14719xde0a3059 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.e.a());

    /* renamed from: sAppVersion */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14721xb203ec4a = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.f.a());

    /* renamed from: sUUID */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String> f14739x67c7aae = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.g.a());

    /* renamed from: sCpuABIs */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<java.lang.String[]> f14724x4816bae0 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.h.a());

    /* renamed from: sIsGettingMemoryUsage */
    private static java.util.concurrent.atomic.AtomicBoolean f14727x4e90c719 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: sLastMemoryUsage */
    private static java.util.concurrent.atomic.AtomicInteger f14729xef7be7b7 = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: sMemoryUsageThrottler */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a f14733x934ff25b = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a(15000);

    /* renamed from: sLastNetworkType */
    private static int f14731x27ccb51f = 0;

    /* renamed from: sNetworkTypeThrottler */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a f14736xc26bb9f3 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a(1000);

    /* renamed from: sLastGateway */
    private static int f14728x3d3f485b = 0;

    /* renamed from: sGatewayThrottler */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a f14725xeb817f37 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a(1000);

    /* renamed from: sLastMicPermission */
    private static boolean f14730x3ffa304d = false;

    /* renamed from: sMicPermissionThrottler */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a f14734xa3e9a805 = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a(1000);

    /* renamed from: getAppBackgroundState */
    public static synchronized int m29440x9af38598() {
        boolean b17;
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.class) {
            b17 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i.a().b();
        }
        return b17 ? 1 : 0;
    }

    /* renamed from: getAppMemoryUsage */
    public static synchronized int m29441xf219d535() {
        int i17;
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.class) {
            if (f14733x934ff25b.a()) {
                m29442xfaa6018e();
            }
            i17 = f14729xef7be7b7.get();
        }
        return i17;
    }

    /* renamed from: getAppMemoryUsageFromSystem */
    private static void m29442xfaa6018e() {
        if (f14727x4e90c719.get()) {
            return;
        }
        f14727x4e90c719.set(true);
        android.os.AsyncTask.execute(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.c.a());
    }

    /* renamed from: getAppName */
    public static java.lang.String m29443xe77ac16() {
        return f14719xde0a3059.a();
    }

    /* renamed from: getAppPackageName */
    public static java.lang.String m29444xd4409c06() {
        return f14720x7805663.a();
    }

    /* renamed from: getAppThreadSize */
    public static synchronized int m29445xcefbea76() {
        int activeCount;
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.class) {
            java.lang.ThreadGroup threadGroup = java.lang.Thread.currentThread().getThreadGroup();
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            activeCount = threadGroup.activeCount();
        }
        return activeCount;
    }

    /* renamed from: getAppVersion */
    public static java.lang.String m29446x46b67b6d() {
        return f14721xb203ec4a.a();
    }

    /* renamed from: getAudioRecordPermission */
    public static synchronized boolean m29447x4eae340() {
        boolean z17;
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.class) {
            if (f14734xa3e9a805.a()) {
                f14730x3ffa304d = m29448x63d13dd9();
            }
            z17 = f14730x3ffa304d;
        }
        return z17;
    }

    /* renamed from: getAudioRecordPermissionFromSystem */
    private static boolean m29448x63d13dd9() {
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        return m29240x6e669035 != null && m29240x6e669035.checkPermission("android.permission.RECORD_AUDIO", android.os.Process.myPid(), android.os.Process.myUid()) == 0;
    }

    /* renamed from: getBoard */
    public static java.lang.String m29449x74369530() {
        return f14722xc8134e33.a();
    }

    /* renamed from: getBrand */
    public static java.lang.String m29450x7437f1d1() {
        return f14723xc814aad4.a();
    }

    /* renamed from: getDeviceUuid */
    public static java.lang.String m29451x1cd12327() {
        return f14739x67c7aae.a();
    }

    /* renamed from: getGateway */
    public static synchronized int m29452x3287820e() {
        int i17;
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.class) {
            if (f14725xeb817f37.a()) {
                f14728x3d3f485b = m29453x34c83327();
            }
            i17 = f14728x3d3f485b;
        }
        return i17;
    }

    /* renamed from: getGatewayFromSystem */
    private static int m29453x34c83327() {
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null) {
            return 0;
        }
        try {
            return ((android.net.wifi.WifiManager) m29240x6e669035.getSystemService("wifi")).getDhcpInfo().gateway;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "getGateway error " + th6.getMessage(), new java.lang.Object[0]);
            return 0;
        }
    }

    /* renamed from: getHardware */
    public static java.lang.String m29454x82d2235e() {
        return f14726xa590277b.a();
    }

    /* renamed from: getManufacturer */
    public static java.lang.String m29455xeb90b647() {
        return f14732xb94563e4.a();
    }

    /* renamed from: getModel */
    public static java.lang.String m29456x74d1a173() {
        return f14735xc8ae5a76.a();
    }

    /* renamed from: getNetworkType */
    public static synchronized int m29457x662add52() {
        int i17;
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.class) {
            if (f14736xc26bb9f3.a()) {
                f14731x27ccb51f = m29458x50f5496b();
            }
            i17 = f14731x27ccb51f;
        }
        return i17;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x004b. Please report as an issue. */
    /* renamed from: getNetworkTypeFromSystem */
    private static int m29458x50f5496b() {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo networkInfo;
        android.telephony.TelephonyManager telephonyManager;
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null || (connectivityManager = (android.net.ConnectivityManager) m29240x6e669035.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (java.lang.Exception unused) {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0;
        }
        if (networkInfo.getType() == 9) {
            return 5;
        }
        if (networkInfo.getType() == 1) {
            return 1;
        }
        if (networkInfo.getType() != 0) {
            return 0;
        }
        try {
            telephonyManager = (android.telephony.TelephonyManager) m29240x6e669035.getSystemService("phone");
        } catch (java.lang.Exception unused2) {
        }
        if (telephonyManager == null) {
            return 0;
        }
        int networkType = telephonyManager.getNetworkType();
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 4;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 2;
            default:
                return (m29463x2c3e92a0() < 29 || networkType != 20) ? 2 : 6;
        }
    }

    /* renamed from: getProperty */
    public static synchronized java.lang.String m29459x40a81b4b(java.lang.String str) {
        java.lang.String str2;
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.class) {
            try {
                str2 = java.lang.System.getProperty(str);
                try {
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "Get " + str + " property is " + str2, new java.lang.Object[0]);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Get property failed. ".concat(java.lang.String.valueOf(th)), new java.lang.Object[0]);
                    return str2;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                str2 = null;
            }
        }
        return str2;
    }

    /* renamed from: getScreenSizeInPixels */
    public static int[] m29460x74f52fd5() {
        int[] iArr = {0, 0};
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Context is null.", new java.lang.Object[0]);
            return iArr;
        }
        try {
            android.view.WindowManager windowManager = (android.view.WindowManager) m29240x6e669035.getSystemService("window");
            if (windowManager == null) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "WindowManager is null.", new java.lang.Object[0]);
                return iArr;
            }
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            iArr[0] = java.lang.Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            iArr[1] = java.lang.Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            return iArr;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Get display from window service failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return iArr;
        }
    }

    /* renamed from: getSupportABIs */
    public static java.lang.String[] m29461x6b74d444() {
        return f14724x4816bae0.a();
    }

    /* renamed from: getSystemOSVersion */
    public static java.lang.String m29462x4deee6cf() {
        return f14737x82a67812.a();
    }

    /* renamed from: getSystemOSVersionInt */
    public static int m29463x2c3e92a0() {
        return f14738xea2fd67d.a().intValue();
    }

    /* renamed from: getSystemProperty */
    public static synchronized java.lang.String m29464x585ae21a(java.lang.String str) {
        java.lang.String str2;
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.class) {
            str2 = null;
            try {
                java.lang.Object invoke = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class).invoke(null, str);
                if (invoke != null) {
                    java.lang.String str3 = (java.lang.String) invoke;
                    try {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(TAG, "Get " + str + " property is " + str3, new java.lang.Object[0]);
                        str2 = str3;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str2 = str3;
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Get system property failed. ".concat(java.lang.String.valueOf(th)), new java.lang.Object[0]);
                        return str2;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        return str2;
    }

    /* renamed from: lambda$getAppMemoryUsageFromSystem$9 */
    public static /* synthetic */ void m29465x5669ba86() {
        int i17;
        try {
            android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
            android.os.Debug.getMemoryInfo(memoryInfo);
            i17 = memoryInfo.getTotalPss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "Get App memory usage failed." + e17.getMessage(), new java.lang.Object[0]);
            i17 = 0;
        }
        f14729xef7be7b7.set(i17 / 1024);
        f14727x4e90c719.set(false);
    }

    /* renamed from: listenAppBackgroundState */
    public static synchronized void m29476x99cca9c9() {
        synchronized (com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.C3773x6d55e560.class) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i.a().a(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.i.a());
        }
    }

    /* renamed from: nativeOnAppBackgroundStateChanged */
    private static native void m29477x955d78fc(int i17);

    /* renamed from: onAppBackgroundStateChanged */
    public static void m29478x44ec3793(boolean z17) {
        m29477x955d78fc(z17 ? 1 : 0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x009e. Please report as an issue. */
    /* renamed from: setExtID */
    public static boolean m29479x52f34fba(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            str.getClass();
            char c17 = 65535;
            switch (str.hashCode()) {
                case -1978299099:
                    if (str.equals(f14700x5ac3732a)) {
                        c17 = 0;
                        break;
                    }
                    break;
                case -911706486:
                    if (str.equals(f14709x24d76309)) {
                        c17 = 1;
                        break;
                    }
                    break;
                case -794136500:
                    if (str.equals(f14701x1ac1d187)) {
                        c17 = 2;
                        break;
                    }
                    break;
                case -589756065:
                    if (str.equals(f14707xdd031c20)) {
                        c17 = 3;
                        break;
                    }
                    break;
                case -497349352:
                    if (str.equals(f14704x793a1157)) {
                        c17 = 4;
                        break;
                    }
                    break;
                case -497260103:
                    if (str.equals(f14705x793b6df8)) {
                        c17 = 5;
                        break;
                    }
                    break;
                case -487188133:
                    if (str.equals(f14708x79d51d9a)) {
                        c17 = 6;
                        break;
                    }
                    break;
                case -441921776:
                    if (str.equals(f14702x5dbb3600)) {
                        c17 = 7;
                        break;
                    }
                    break;
                case -391134602:
                    if (str.equals(f14706xf35e65b7)) {
                        c17 = '\b';
                        break;
                    }
                    break;
                case 725329157:
                    if (str.equals(f14710x55190199)) {
                        c17 = '\t';
                        break;
                    }
                    break;
                case 1484112759:
                    if (str.equals(f14703x6f31183c)) {
                        c17 = '\n';
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                    try {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.i.a(java.lang.Integer.parseInt(str2) == 1);
                        return true;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(TAG, "set app background state failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
                        break;
                    }
                case 1:
                    f14737x82a67812.a(str2);
                    return true;
                case 2:
                    f14719xde0a3059.a(str2);
                    return true;
                case 3:
                    f14732xb94563e4.a(str2);
                    return true;
                case 4:
                    f14722xc8134e33.a(str2);
                    return true;
                case 5:
                    f14723xc814aad4.a(str2);
                    return true;
                case 6:
                    f14735xc8ae5a76.a(str2);
                    return true;
                case 7:
                    f14720x7805663.a(str2);
                    return true;
                case '\b':
                    f14726xa590277b.a(str2);
                    return true;
                case '\t':
                    try {
                        f14738xea2fd67d.a(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
                    } catch (java.lang.Exception unused) {
                    }
                    return true;
                case '\n':
                    f14721xb203ec4a.a(str2);
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }
}
