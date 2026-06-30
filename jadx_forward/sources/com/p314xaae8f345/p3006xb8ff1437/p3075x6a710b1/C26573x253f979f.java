package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPNetWorkUtils */
/* loaded from: classes13.dex */
public class C26573x253f979f {

    /* renamed from: NETWORK_CLASS_2_G */
    public static final int f55309x9b9f6322 = 1;

    /* renamed from: NETWORK_CLASS_3_G */
    public static final int f55310x9b9f66e3 = 2;

    /* renamed from: NETWORK_CLASS_4_G */
    public static final int f55311x9b9f6aa4 = 3;

    /* renamed from: NETWORK_CLASS_5_G */
    public static final int f55312x9b9f6e65 = 4;

    /* renamed from: NETWORK_CLASS_UNKNOWN */
    public static final int f55313x47e9bfd2 = -1;

    /* renamed from: NETWORK_CLASS_WIFI */
    public static final int f55314xd85d806d = 0;
    private static final java.lang.String TAG = "TPNetWorkUtils";

    /* renamed from: isNetworkAvailable */
    private static int f55315x4bd2a185 = -1;

    /* renamed from: isNetworkChange */
    private static boolean f55316x2ccfd674 = false;

    /* renamed from: mAppPackageName */
    private static java.lang.String f55317xec5bd8dd = null;

    /* renamed from: mNetWorkClass */
    private static int f55318xc4fc4d7 = -1;

    /* renamed from: mNetworkTypeArray */
    private static final android.util.SparseIntArray f55319x110d8b3e;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        f55319x110d8b3e = sparseIntArray;
        sparseIntArray.put(1, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(4, 1);
        sparseIntArray.put(7, 1);
        sparseIntArray.put(11, 1);
        sparseIntArray.put(3, 2);
        sparseIntArray.put(5, 2);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(8, 2);
        sparseIntArray.put(9, 2);
        sparseIntArray.put(10, 2);
        sparseIntArray.put(12, 2);
        sparseIntArray.put(14, 2);
        sparseIntArray.put(15, 2);
        sparseIntArray.put(13, 3);
    }

    /* renamed from: checkPermission */
    private static boolean m104315x28e6dcf7(android.content.Context context, java.lang.String str) {
        if (!m104324xdcdcd1f5()) {
            return true;
        }
        if (context == null || android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        if ("android.permission.WRITE_SETTINGS".equals(str)) {
            return android.provider.Settings.System.canWrite(context);
        }
        try {
            return context.checkSelfPermission(str) == 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17.getMessage());
            return false;
        }
    }

    /* renamed from: get5GNetworkTypeIfNeed */
    private static int m104316x91abf853(android.content.Context context) {
        android.telephony.TelephonyManager telephonyManager;
        int i17 = 0;
        try {
            telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        if (telephonyManager == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "get5GNetworkTypeIfNeed TelephonyManager is null");
            return 0;
        }
        if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "get5GNetworkTypeIfNeed no permission");
            return 0;
        }
        if (android.os.Build.VERSION.SDK_INT < 29) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "get5GNetworkTypeIfNeed less api 29");
            return 0;
        }
        int networkType = telephonyManager.getNetworkType();
        try {
        } catch (java.lang.Throwable th7) {
            i17 = networkType;
            th = th7;
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th.getMessage());
            return i17;
        }
        if (networkType != 13) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "get5GNetworkTypeIfNeed not NETWORK_TYPE_LTE");
            return networkType;
        }
        android.telephony.ServiceState serviceState = telephonyManager.getServiceState();
        if (serviceState == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "get5GNetworkTypeIfNeed serviceState is null");
            return networkType;
        }
        int intValue = ((java.lang.Integer) com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26576x5bfc5899.m104361xd8c5c779(serviceState, "android.telephony.ServiceState", "getNrState", new java.lang.Class[0], new java.lang.Object[0])).intValue();
        if (intValue != 2 && intValue != 3) {
            return networkType;
        }
        i17 = 20;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "get5GNetworkTypeIfNeed networkType is 20, 5G");
        return i17;
    }

    /* renamed from: getActualNetWorkClass */
    private static int m104317xba8a266e(android.content.Context context, int i17) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? m104320xebd91781(context) : m104322x93468691(context, i17);
    }

    /* renamed from: getConnectivityManager */
    private static android.net.ConnectivityManager m104318x6a8d0ec0(android.content.Context context) {
        if (context == null) {
            return null;
        }
        return (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
    }

    /* renamed from: getNetWorkClass */
    public static int m104319xd5ad3e40(android.content.Context context) {
        int i17 = f55318xc4fc4d7;
        if (i17 > 0 && !f55316x2ccfd674) {
            return i17;
        }
        if (context == null) {
            return -1;
        }
        int m104321x7b76af8 = m104321x7b76af8(context);
        f55318xc4fc4d7 = m104321x7b76af8;
        return m104321x7b76af8;
    }

    /* renamed from: getNetWorkClassAPI29 */
    private static int m104320xebd91781(android.content.Context context) {
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            if (m104315x28e6dcf7(context, "android.permission.READ_PHONE_STATE")) {
                return m104322x93468691(context, telephonyManager.getDataNetworkType());
            }
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, "getNetWorkClassAPI29 fail: no phone permission");
            return -1;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6.getMessage());
            return -1;
        }
    }

    /* renamed from: getNetWorkClassByContext */
    private static int m104321x7b76af8(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return -1;
            }
            int type = activeNetworkInfo.getType();
            return type != 0 ? type != 1 ? -1 : 0 : m104317xba8a266e(context, activeNetworkInfo.getSubtype());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, th6.getMessage());
            return -1;
        }
    }

    /* renamed from: getNetWorkClassByType */
    private static int m104322x93468691(android.content.Context context, int i17) {
        if (m104316x91abf853(context) == 20) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "get5GNetworkTypeIfNeed netWorkType==4");
            return 4;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(f55319x110d8b3e.get(i17));
        if (valueOf == null) {
            return -1;
        }
        return valueOf.intValue();
    }

    /* renamed from: getNetworkInfo */
    private static android.net.NetworkInfo m104323x6625b2c6(android.content.Context context) {
        android.net.ConnectivityManager m104318x6a8d0ec0 = m104318x6a8d0ec0(context);
        if (m104318x6a8d0ec0 == null) {
            return null;
        }
        return m104318x6a8d0ec0.getActiveNetworkInfo();
    }

    /* renamed from: hasMarshmallow */
    private static boolean m104324xdcdcd1f5() {
        return true;
    }

    /* renamed from: isNetworkAvailable */
    public static boolean m104325x4bd2a185(android.content.Context context) {
        int i17 = f55315x4bd2a185;
        if (i17 != -1 && !f55316x2ccfd674) {
            return i17 == 1;
        }
        if (context != null) {
            try {
                android.net.NetworkInfo m104323x6625b2c6 = m104323x6625b2c6(context);
                f55315x4bd2a185 = 0;
                if (m104323x6625b2c6 != null && m104323x6625b2c6.getState() == android.net.NetworkInfo.State.CONNECTED) {
                    f55315x4bd2a185 = 1;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17.getMessage());
            }
        }
        return f55315x4bd2a185 == 1;
    }

    /* renamed from: onNetworkChange */
    public static void m104326xde9f63df(android.content.Context context) {
        f55316x2ccfd674 = true;
        m104325x4bd2a185(context);
        m104319xd5ad3e40(context);
        f55316x2ccfd674 = false;
    }
}
