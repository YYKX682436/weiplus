package com.tencent.liteav.base.system;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes13.dex */
public class LiteavSystemInfo {
    private static final int APP_SYSTEM_METHOD_DEFAULT_GET_INTERVAL_MS = 1000;
    private static final java.lang.String EXT_KEY_APP_BACKGROUND = "isAppBackground";
    private static final java.lang.String EXT_KEY_APP_NAME = "appName";
    private static final java.lang.String EXT_KEY_APP_PACKAGE_NAME = "appPackageName";
    private static final java.lang.String EXT_KEY_APP_VERSION = "appVersion";
    private static final java.lang.String EXT_KEY_BUILD_BOARD = "buildBoard";
    private static final java.lang.String EXT_KEY_BUILD_BRAND = "buildBrand";
    private static final java.lang.String EXT_KEY_BUILD_HARDWARE = "buildHardware";
    private static final java.lang.String EXT_KEY_BUILD_MANUFACTURER = "buildManufacturer";
    private static final java.lang.String EXT_KEY_BUILD_MODEL = "buildModel";
    private static final java.lang.String EXT_KEY_BUILD_VERSION = "buildVersion";
    private static final java.lang.String EXT_KEY_BUILD_VERSION_INT = "buildVersionInt";
    private static final int GET_APP_MEMORY_INTERVAL_MS = 15000;
    private static final int NETWORK_TYPE_2G = 4;
    private static final int NETWORK_TYPE_3G = 3;
    private static final int NETWORK_TYPE_4G = 2;
    private static final int NETWORK_TYPE_5G = 6;
    private static final int NETWORK_TYPE_UNKNOWN = 0;
    private static final int NETWORK_TYPE_WIFI = 1;
    private static final int NETWORK_TYPE_WIRED = 5;
    private static final java.lang.String TAG = "LiteavBaseSystemInfo";
    private static final com.tencent.liteav.base.util.r<java.lang.String> sModel = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.j.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String> sBrand = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.k.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String> sManufacturer = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.l.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String> sHardware = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.m.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String> sSystemOSVersion = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.n.a());
    private static final com.tencent.liteav.base.util.r<java.lang.Integer> sSystemOSVersionInt = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.o.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String> sBoard = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.p.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String> sAppPackageName = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.d.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String> sAppName = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.e.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String> sAppVersion = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.f.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String> sUUID = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.g.a());
    private static final com.tencent.liteav.base.util.r<java.lang.String[]> sCpuABIs = new com.tencent.liteav.base.util.r<>(com.tencent.liteav.base.system.h.a());
    private static java.util.concurrent.atomic.AtomicBoolean sIsGettingMemoryUsage = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static java.util.concurrent.atomic.AtomicInteger sLastMemoryUsage = new java.util.concurrent.atomic.AtomicInteger(0);
    private static final com.tencent.liteav.base.b.a sMemoryUsageThrottler = new com.tencent.liteav.base.b.a(15000);
    private static int sLastNetworkType = 0;
    private static final com.tencent.liteav.base.b.a sNetworkTypeThrottler = new com.tencent.liteav.base.b.a(1000);
    private static int sLastGateway = 0;
    private static final com.tencent.liteav.base.b.a sGatewayThrottler = new com.tencent.liteav.base.b.a(1000);
    private static boolean sLastMicPermission = false;
    private static final com.tencent.liteav.base.b.a sMicPermissionThrottler = new com.tencent.liteav.base.b.a(1000);

    public static synchronized int getAppBackgroundState() {
        boolean b17;
        synchronized (com.tencent.liteav.base.system.LiteavSystemInfo.class) {
            b17 = com.tencent.liteav.base.util.i.a().b();
        }
        return b17 ? 1 : 0;
    }

    public static synchronized int getAppMemoryUsage() {
        int i17;
        synchronized (com.tencent.liteav.base.system.LiteavSystemInfo.class) {
            if (sMemoryUsageThrottler.a()) {
                getAppMemoryUsageFromSystem();
            }
            i17 = sLastMemoryUsage.get();
        }
        return i17;
    }

    private static void getAppMemoryUsageFromSystem() {
        if (sIsGettingMemoryUsage.get()) {
            return;
        }
        sIsGettingMemoryUsage.set(true);
        android.os.AsyncTask.execute(com.tencent.liteav.base.system.c.a());
    }

    public static java.lang.String getAppName() {
        return sAppName.a();
    }

    public static java.lang.String getAppPackageName() {
        return sAppPackageName.a();
    }

    public static synchronized int getAppThreadSize() {
        int activeCount;
        synchronized (com.tencent.liteav.base.system.LiteavSystemInfo.class) {
            java.lang.ThreadGroup threadGroup = java.lang.Thread.currentThread().getThreadGroup();
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            activeCount = threadGroup.activeCount();
        }
        return activeCount;
    }

    public static java.lang.String getAppVersion() {
        return sAppVersion.a();
    }

    public static synchronized boolean getAudioRecordPermission() {
        boolean z17;
        synchronized (com.tencent.liteav.base.system.LiteavSystemInfo.class) {
            if (sMicPermissionThrottler.a()) {
                sLastMicPermission = getAudioRecordPermissionFromSystem();
            }
            z17 = sLastMicPermission;
        }
        return z17;
    }

    private static boolean getAudioRecordPermissionFromSystem() {
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        return applicationContext != null && applicationContext.checkPermission("android.permission.RECORD_AUDIO", android.os.Process.myPid(), android.os.Process.myUid()) == 0;
    }

    public static java.lang.String getBoard() {
        return sBoard.a();
    }

    public static java.lang.String getBrand() {
        return sBrand.a();
    }

    public static java.lang.String getDeviceUuid() {
        return sUUID.a();
    }

    public static synchronized int getGateway() {
        int i17;
        synchronized (com.tencent.liteav.base.system.LiteavSystemInfo.class) {
            if (sGatewayThrottler.a()) {
                sLastGateway = getGatewayFromSystem();
            }
            i17 = sLastGateway;
        }
        return i17;
    }

    private static int getGatewayFromSystem() {
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            return ((android.net.wifi.WifiManager) applicationContext.getSystemService("wifi")).getDhcpInfo().gateway;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "getGateway error " + th6.getMessage(), new java.lang.Object[0]);
            return 0;
        }
    }

    public static java.lang.String getHardware() {
        return sHardware.a();
    }

    public static java.lang.String getManufacturer() {
        return sManufacturer.a();
    }

    public static java.lang.String getModel() {
        return sModel.a();
    }

    public static synchronized int getNetworkType() {
        int i17;
        synchronized (com.tencent.liteav.base.system.LiteavSystemInfo.class) {
            if (sNetworkTypeThrottler.a()) {
                sLastNetworkType = getNetworkTypeFromSystem();
            }
            i17 = sLastNetworkType;
        }
        return i17;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x004b. Please report as an issue. */
    private static int getNetworkTypeFromSystem() {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo networkInfo;
        android.telephony.TelephonyManager telephonyManager;
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null || (connectivityManager = (android.net.ConnectivityManager) applicationContext.getSystemService("connectivity")) == null) {
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
            telephonyManager = (android.telephony.TelephonyManager) applicationContext.getSystemService("phone");
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
                return (getSystemOSVersionInt() < 29 || networkType != 20) ? 2 : 6;
        }
    }

    public static synchronized java.lang.String getProperty(java.lang.String str) {
        java.lang.String str2;
        synchronized (com.tencent.liteav.base.system.LiteavSystemInfo.class) {
            try {
                str2 = java.lang.System.getProperty(str);
                try {
                    com.tencent.liteav.base.Log.i(TAG, "Get " + str + " property is " + str2, new java.lang.Object[0]);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.tencent.liteav.base.Log.e(TAG, "Get property failed. ".concat(java.lang.String.valueOf(th)), new java.lang.Object[0]);
                    return str2;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                str2 = null;
            }
        }
        return str2;
    }

    public static int[] getScreenSizeInPixels() {
        int[] iArr = {0, 0};
        android.content.Context applicationContext = com.tencent.liteav.base.ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            com.tencent.liteav.base.Log.e(TAG, "Context is null.", new java.lang.Object[0]);
            return iArr;
        }
        try {
            android.view.WindowManager windowManager = (android.view.WindowManager) applicationContext.getSystemService("window");
            if (windowManager == null) {
                com.tencent.liteav.base.Log.e(TAG, "WindowManager is null.", new java.lang.Object[0]);
                return iArr;
            }
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            iArr[0] = java.lang.Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            iArr[1] = java.lang.Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            return iArr;
        } catch (java.lang.Throwable th6) {
            com.tencent.liteav.base.Log.e(TAG, "Get display from window service failed. ".concat(java.lang.String.valueOf(th6)), new java.lang.Object[0]);
            return iArr;
        }
    }

    public static java.lang.String[] getSupportABIs() {
        return sCpuABIs.a();
    }

    public static java.lang.String getSystemOSVersion() {
        return sSystemOSVersion.a();
    }

    public static int getSystemOSVersionInt() {
        return sSystemOSVersionInt.a().intValue();
    }

    public static synchronized java.lang.String getSystemProperty(java.lang.String str) {
        java.lang.String str2;
        synchronized (com.tencent.liteav.base.system.LiteavSystemInfo.class) {
            str2 = null;
            try {
                java.lang.Object invoke = java.lang.Class.forName("android.os.SystemProperties").getMethod("get", java.lang.String.class).invoke(null, str);
                if (invoke != null) {
                    java.lang.String str3 = (java.lang.String) invoke;
                    try {
                        com.tencent.liteav.base.Log.i(TAG, "Get " + str + " property is " + str3, new java.lang.Object[0]);
                        str2 = str3;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str2 = str3;
                        com.tencent.liteav.base.Log.e(TAG, "Get system property failed. ".concat(java.lang.String.valueOf(th)), new java.lang.Object[0]);
                        return str2;
                    }
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
        return str2;
    }

    public static /* synthetic */ void lambda$getAppMemoryUsageFromSystem$9() {
        int i17;
        try {
            android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
            android.os.Debug.getMemoryInfo(memoryInfo);
            i17 = memoryInfo.getTotalPss();
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.e(TAG, "Get App memory usage failed." + e17.getMessage(), new java.lang.Object[0]);
            i17 = 0;
        }
        sLastMemoryUsage.set(i17 / 1024);
        sIsGettingMemoryUsage.set(false);
    }

    public static synchronized void listenAppBackgroundState() {
        synchronized (com.tencent.liteav.base.system.LiteavSystemInfo.class) {
            com.tencent.liteav.base.util.i.a().a(com.tencent.liteav.base.system.i.a());
        }
    }

    private static native void nativeOnAppBackgroundStateChanged(int i17);

    public static void onAppBackgroundStateChanged(boolean z17) {
        nativeOnAppBackgroundStateChanged(z17 ? 1 : 0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x009e. Please report as an issue. */
    public static boolean setExtID(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            str.getClass();
            char c17 = 65535;
            switch (str.hashCode()) {
                case -1978299099:
                    if (str.equals(EXT_KEY_APP_BACKGROUND)) {
                        c17 = 0;
                        break;
                    }
                    break;
                case -911706486:
                    if (str.equals(EXT_KEY_BUILD_VERSION)) {
                        c17 = 1;
                        break;
                    }
                    break;
                case -794136500:
                    if (str.equals(EXT_KEY_APP_NAME)) {
                        c17 = 2;
                        break;
                    }
                    break;
                case -589756065:
                    if (str.equals(EXT_KEY_BUILD_MANUFACTURER)) {
                        c17 = 3;
                        break;
                    }
                    break;
                case -497349352:
                    if (str.equals(EXT_KEY_BUILD_BOARD)) {
                        c17 = 4;
                        break;
                    }
                    break;
                case -497260103:
                    if (str.equals(EXT_KEY_BUILD_BRAND)) {
                        c17 = 5;
                        break;
                    }
                    break;
                case -487188133:
                    if (str.equals(EXT_KEY_BUILD_MODEL)) {
                        c17 = 6;
                        break;
                    }
                    break;
                case -441921776:
                    if (str.equals(EXT_KEY_APP_PACKAGE_NAME)) {
                        c17 = 7;
                        break;
                    }
                    break;
                case -391134602:
                    if (str.equals(EXT_KEY_BUILD_HARDWARE)) {
                        c17 = '\b';
                        break;
                    }
                    break;
                case 725329157:
                    if (str.equals(EXT_KEY_BUILD_VERSION_INT)) {
                        c17 = '\t';
                        break;
                    }
                    break;
                case 1484112759:
                    if (str.equals(EXT_KEY_APP_VERSION)) {
                        c17 = '\n';
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                    try {
                        com.tencent.liteav.base.util.i.a(java.lang.Integer.parseInt(str2) == 1);
                        return true;
                    } catch (java.lang.Exception e17) {
                        com.tencent.liteav.base.Log.e(TAG, "set app background state failed. ".concat(java.lang.String.valueOf(e17)), new java.lang.Object[0]);
                        break;
                    }
                case 1:
                    sSystemOSVersion.a(str2);
                    return true;
                case 2:
                    sAppName.a(str2);
                    return true;
                case 3:
                    sManufacturer.a(str2);
                    return true;
                case 4:
                    sBoard.a(str2);
                    return true;
                case 5:
                    sBrand.a(str2);
                    return true;
                case 6:
                    sModel.a(str2);
                    return true;
                case 7:
                    sAppPackageName.a(str2);
                    return true;
                case '\b':
                    sHardware.a(str2);
                    return true;
                case '\t':
                    try {
                        sSystemOSVersionInt.a(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2)));
                    } catch (java.lang.Exception unused) {
                    }
                    return true;
                case '\n':
                    sAppVersion.a(str2);
                    return true;
                default:
                    return false;
            }
        }
        return false;
    }
}
