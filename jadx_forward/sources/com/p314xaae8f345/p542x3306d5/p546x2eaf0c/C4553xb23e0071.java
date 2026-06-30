package com.p314xaae8f345.p542x3306d5.p546x2eaf0c;

/* renamed from: com.tencent.mars.comm.NetStatusUtil */
/* loaded from: classes12.dex */
public class C4553xb23e0071 {

    /* renamed from: CELL_CDMA */
    public static final java.lang.String f19265x8fe4272 = "cdma";

    /* renamed from: CELL_GSM */
    public static final java.lang.String f19266xf8084484 = "gsm";

    /* renamed from: CMNET */
    public static final int f19267x3d454d3 = 6;

    /* renamed from: CMWAP */
    public static final int f19268x3d4761c = 5;

    /* renamed from: CTNET */
    public static final int f19269x3d7836c = 8;

    /* renamed from: CTWAP */
    public static final int f19270x3d7a4b5 = 7;

    /* renamed from: IOS_NETTYPE_2G */
    public static final int f19271x34cc70ef = 2;

    /* renamed from: IOS_NETTYPE_3G */
    public static final int f19272x34cc710e = 3;

    /* renamed from: IOS_NETTYPE_4G */
    public static final int f19273x34cc712d = 4;

    /* renamed from: IOS_NETTYPE_5G */
    public static final int f19274x34cc714c = 5;

    /* renamed from: IOS_NETTYPE_UNKNOW */
    public static final int f19275x627bea3e = 0;

    /* renamed from: IOS_NETTYPE_WIFI */
    public static final int f19276x3384d32f = 1;
    public static final int LTE = 10;

    /* renamed from: MOBILE */
    public static final int f19277x87dd84a2 = 9;

    /* renamed from: NETTYPE_NOT_WIFI */
    public static final int f19278xf226fa29 = 0;

    /* renamed from: NETTYPE_WIFI */
    public static final int f19279x68aefc1d = 1;

    /* renamed from: NETWORK_TYPE_NR */
    public static final int f19280x48a783b8 = 20;

    /* renamed from: NET_3G */
    public static final int f19281x890df076 = 4;

    /* renamed from: NON_NETWORK */
    public static final int f19282x126ebe7c = -1;

    /* renamed from: NO_SIM_OPERATOR */
    public static final int f19283x1b06e8ea = 0;

    /* renamed from: NR_5G */
    public static final int f19284x471db0d = 11;

    /* renamed from: OLD_IOS_NETTYPE_2G */
    public static final int f19285x136a7e27 = 3;

    /* renamed from: OLD_IOS_NETTYPE_3G */
    public static final int f19286x136a7e46 = 4;

    /* renamed from: OLD_IOS_NETTYPE_4G */
    public static final int f19287x136a7e65 = 5;

    /* renamed from: OLD_IOS_NETTYPE_NOT_WIFI */
    public static final int f19288x54b43b73 = 0;

    /* renamed from: OLD_IOS_NETTYPE_WAP */
    public static final int f19289x59e5d134 = 2;

    /* renamed from: OLD_IOS_NETTYPE_WIFI */
    public static final int f19290xe2d47267 = 1;

    /* renamed from: POLICY_NONE */
    public static final int f19291x328b625 = 0;

    /* renamed from: POLICY_REJECT_METERED_BACKGROUND */
    public static final int f19292xeb73fd8 = 1;
    private static final java.lang.String TAG = "MicroMsg.NetStatusUtil";

    /* renamed from: TBACKGROUND_DATA_LIMITED */
    public static final int f19293x37810a82 = 2;

    /* renamed from: TBACKGROUND_NOT_LIMITED */
    public static final int f19294x168de7b1 = 0;

    /* renamed from: TBACKGROUND_PROCESS_LIMITED */
    public static final int f19295xe2286dcd = 1;

    /* renamed from: TBACKGROUND_WIFI_LIMITED */
    public static final int f19296xb6f52eed = 3;

    /* renamed from: UNINET */
    public static final int f19297x957972ad = 1;

    /* renamed from: UNIWAP */
    public static final int f19298x957993f6 = 2;

    /* renamed from: UNKNOW_TYPE */
    public static final int f19299xe1dc29f5 = 999;

    /* renamed from: WAP_3G */
    public static final int f19300x982f5e8d = 3;

    /* renamed from: WIFI */
    public static final int f19301x28a715 = 0;

    /* renamed from: _hellAccFlag_ */
    private byte f19302x7f11beae;

    /* renamed from: com.tencent.mars.comm.NetStatusUtil$CellInfo */
    /* loaded from: classes9.dex */
    public static class CellInfo {

        /* renamed from: MAX_CID */
        public static final int f19303x5d2f1b23 = 65535;

        /* renamed from: MAX_LAC */
        public static final int f19304x5d2f3bf3 = 65535;

        /* renamed from: cellid */
        public java.lang.String f19305xaeb1c5fd;
        public java.lang.String dbm;
        public java.lang.String lac;
        public java.lang.String mcc;
        public java.lang.String mnc;

        /* renamed from: networkId */
        public java.lang.String f19306x7af38fe9;

        /* renamed from: stationId */
        public java.lang.String f19307x83f08d6f;

        /* renamed from: systemId */
        public java.lang.String f19308x75c8abaa;

        /* renamed from: type */
        public java.lang.String f19309x368f3a;

        public CellInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
            this.mcc = str;
            this.mnc = str2;
            this.lac = str3;
            this.f19309x368f3a = str6;
            this.f19305xaeb1c5fd = str4;
            this.f19307x83f08d6f = str7;
            this.f19306x7af38fe9 = str8;
            this.f19308x75c8abaa = str9;
            this.dbm = str5;
        }
    }

    /* renamed from: com.tencent.mars.comm.NetStatusUtil$MacInfo */
    /* loaded from: classes.dex */
    public static class MacInfo {
        public java.lang.String dbm;
        public java.lang.String mac;

        public MacInfo(java.lang.String str, java.lang.String str2) {
            this.mac = str;
            this.dbm = str2;
        }
    }

    /* renamed from: dumpNetStatus */
    public static java.lang.String m40057xaa16d45b(android.content.Context context) {
        java.lang.String str;
        java.lang.String sb6;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            sb7.append("isAvailable " + activeNetworkInfo.isAvailable() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("isConnected " + activeNetworkInfo.isConnected() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("isRoaming " + activeNetworkInfo.isRoaming() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("isFailover " + activeNetworkInfo.isFailover() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("getSubtypeName " + activeNetworkInfo.getSubtypeName() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("getSubtype " + activeNetworkInfo.getSubtype() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("getType " + activeNetworkInfo.getType() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("getExtraInfo " + activeNetworkInfo.getExtraInfo() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("activeNetInfo " + activeNetworkInfo.toString() + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("is2G " + m40075x3170ff(context) + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("is3G " + m40076x31711e(context) + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("is4G " + m40077x31713d(context) + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            sb7.append("isWifi " + m40093xb9aa8b5f(context) + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("netstatus ");
            sb8.append(sb7.toString());
            sb6 = sb8.toString();
            str = TAG;
        } catch (java.lang.Exception e17) {
            e = e17;
            str = TAG;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6);
        } catch (java.lang.Exception e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, e.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e, "", new java.lang.Object[0]);
            return sb7.toString();
        }
        return sb7.toString();
    }

    /* renamed from: getActiveNetworkInfo */
    public static android.net.NetworkInfo m40058x63929c60(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getActiveNetworkInfo error t = " + th6.getMessage());
            return null;
        }
    }

    /* renamed from: getBackgroundLimitType */
    public static int m40059xf9c494d1(android.content.Context context) {
        int m40073xedfe5e;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityManagerNative");
            java.lang.Object invoke = cls.getMethod("getDefault", new java.lang.Class[0]).invoke(cls, new java.lang.Object[0]);
            if (((java.lang.Integer) invoke.getClass().getMethod("getProcessLimit", new java.lang.Class[0]).invoke(invoke, new java.lang.Object[0])).intValue() == 0) {
                return 1;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        try {
            m40073xedfe5e = m40073xedfe5e(context);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
        }
        if (m40073xedfe5e != 2) {
            if (m40067xab9ed241(context) == 0) {
                return (m40073xedfe5e == 1 || m40073xedfe5e == 0) ? 3 : 0;
            }
        }
        return 0;
    }

    @java.lang.Deprecated
    /* renamed from: getCellInfoList */
    public static synchronized java.util.List<com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.CellInfo> m40060xc32c8064(android.content.Context context) {
        java.util.LinkedList linkedList;
        synchronized (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.class) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "getCellInfoList() here will always return empty list, and mostly you should not read cell info list any more");
            linkedList = new java.util.LinkedList();
        }
        return linkedList;
    }

    /* renamed from: getFormatedNetType */
    public static java.lang.String m40061x1de3608b(android.content.Context context) {
        return m40075x3170ff(context) ? "2G" : m40076x31711e(context) ? "3G" : m40077x31713d(context) ? "4G" : m40078x31715c(context) ? "5G" : m40093xb9aa8b5f(context) ? "WIFI" : m40070xdc68a9b2(context);
    }

    /* renamed from: getIOSNetType */
    public static int m40062x608a19a0(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 0;
        }
        try {
            activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception unused) {
        }
        if (activeNetworkInfo == null) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        if (activeNetworkInfo.getSubtype() != 1 && activeNetworkInfo.getSubtype() != 2) {
            if (activeNetworkInfo.getSubtype() >= 20) {
                return 5;
            }
            if (activeNetworkInfo.getSubtype() >= 13) {
                return 4;
            }
            return activeNetworkInfo.getSubtype() >= 3 ? 3 : 0;
        }
        return 2;
    }

    /* renamed from: getIOSOldNetType */
    public static int m40064x8b9dd687(android.content.Context context) {
        int m40067xab9ed241;
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 0;
        }
        try {
            m40067xab9ed241 = m40067xab9ed241(context);
            activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception unused) {
        }
        if (activeNetworkInfo == null) {
            return 0;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        if (activeNetworkInfo.getSubtype() != 1 && activeNetworkInfo.getSubtype() != 2) {
            if (activeNetworkInfo.getSubtype() >= 13) {
                return 5;
            }
            if (activeNetworkInfo.getSubtype() >= 3) {
                return 4;
            }
            return m40090x5fd3d5c(m40067xab9ed241) ? 2 : 0;
        }
        return 3;
    }

    /* renamed from: getISPCode */
    public static int m40065x82653f5d(android.content.Context context) {
        java.lang.String simOperator;
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null && (simOperator = telephonyManager.getSimOperator()) != null && simOperator.length() >= 5) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            try {
                int length = simOperator.length();
                if (length > 6) {
                    length = 6;
                }
                for (int i17 = 0; i17 < length; i17++) {
                    if (!java.lang.Character.isDigit(simOperator.charAt(i17))) {
                        if (sb6.length() > 0) {
                            break;
                        }
                    } else {
                        sb6.append(simOperator.charAt(i17));
                    }
                }
                return java.lang.Integer.valueOf(sb6.toString()).intValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    /* renamed from: getISPName */
    public static java.lang.String m40066x826a0bfb(android.content.Context context) {
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            telephonyManager.getSimOperatorName();
            return telephonyManager.getSimOperatorName().length() <= 100 ? telephonyManager.getSimOperatorName() : telephonyManager.getSimOperatorName().substring(0, 100);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* renamed from: getNetType */
    public static int m40068xab9ed241(android.net.NetworkInfo networkInfo) {
        if (networkInfo.getType() == 1) {
            return 0;
        }
        networkInfo.getExtraInfo();
        networkInfo.getType();
        if (networkInfo.getExtraInfo() == null) {
            return 9;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("uninet")) {
            return 1;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("uniwap")) {
            return 2;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("3gwap")) {
            return 3;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("3gnet")) {
            return 4;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("cmwap")) {
            return 5;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("cmnet")) {
            return 6;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("ctwap")) {
            return 7;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("ctnet")) {
            return 8;
        }
        return networkInfo.getExtraInfo().equalsIgnoreCase("LTE") ? 10 : 9;
    }

    /* renamed from: getNetTypeForStat */
    public static int m40069xf869653c(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 999;
        }
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 999;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == 0) {
                return 999;
            }
            return subtype * 1000;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return 999;
        }
    }

    /* renamed from: getNetTypeString */
    public static java.lang.String m40070xdc68a9b2(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return "NON_NETWORK";
        }
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "NON_NETWORK";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            activeNetworkInfo.getExtraInfo();
            activeNetworkInfo.getType();
            return activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo() : "MOBILE";
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return "NON_NETWORK";
        }
    }

    /* renamed from: getNetWorkType */
    public static int m40071x6a054172(android.content.Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return -1;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.getType();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        return -1;
    }

    /* renamed from: getProxyInfo */
    public static int m40072xe3092d86(android.content.Context context, java.lang.StringBuffer stringBuffer) {
        java.lang.String defaultHost;
        int defaultPort;
        try {
            defaultHost = android.net.Proxy.getDefaultHost();
            defaultPort = android.net.Proxy.getDefaultPort();
            java.lang.Thread.currentThread().getId();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        if (defaultHost != null && defaultHost.length() > 0 && defaultPort > 0) {
            stringBuffer.append(defaultHost);
            return defaultPort;
        }
        java.lang.String property = java.lang.System.getProperty("http.proxyHost");
        java.lang.String property2 = java.lang.System.getProperty("http.proxyPort");
        java.lang.Thread.currentThread().getId();
        int parseInt = (property2 == null || property2.length() <= 0) ? 80 : java.lang.Integer.parseInt(property2);
        if (property != null && property.length() > 0) {
            stringBuffer.append(property);
            return parseInt;
        }
        return 0;
    }

    /* renamed from: getWifiSleepPolicy */
    public static int m40073xedfe5e(android.content.Context context) {
        return android.provider.Settings.System.getInt(context.getContentResolver(), "wifi_sleep_policy", 2);
    }

    /* renamed from: guessNetSpeed */
    public static int m40074xe107aba1(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 102400;
        }
        try {
            activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        if (activeNetworkInfo.getType() == 1) {
            return 102400;
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype != 1) {
            return subtype != 2 ? 102400 : 8192;
        }
        return 4096;
    }

    /* renamed from: is2G */
    public static boolean m40075x3170ff(android.content.Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) {
                    return false;
                }
                activeNetworkInfo.getSubtype();
                if (activeNetworkInfo.getSubtype() != 2 && activeNetworkInfo.getSubtype() != 1 && activeNetworkInfo.getSubtype() != 4 && activeNetworkInfo.getSubtype() != 16 && activeNetworkInfo.getSubtype() != 7) {
                    if (activeNetworkInfo.getSubtype() == 11) {
                    }
                }
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }

    /* renamed from: is3G */
    public static boolean m40076x31711e(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) {
            return false;
        }
        activeNetworkInfo.getSubtype();
        if (activeNetworkInfo.getSubtype() >= 5) {
            if (activeNetworkInfo.getSubtype() < 13) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: is4G */
    public static boolean m40077x31713d(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) {
            return false;
        }
        activeNetworkInfo.getSubtype();
        if (activeNetworkInfo.getSubtype() >= 13) {
            if (activeNetworkInfo.getSubtype() < 20) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: is5G */
    public static boolean m40078x31715c(android.content.Context context) {
        if (context != null) {
            try {
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    return false;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) {
            return false;
        }
        activeNetworkInfo.getSubtype();
        return activeNetworkInfo.getSubtype() >= 20;
    }

    /* renamed from: isCellularEnabled */
    public static boolean m40079x78562fed(android.content.Context context) {
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(0);
    }

    /* renamed from: isConnected */
    public static boolean m40081x23b734ff(android.net.NetworkInfo networkInfo) {
        try {
            return networkInfo.isConnected();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: isImmediatelyDestroyActivities */
    public static boolean m40082x752a2473(android.content.Context context) {
        return android.provider.Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0) != 0;
    }

    /* renamed from: isKnownDirectNet */
    public static boolean m40083x4ca1c0bb(android.content.Context context) {
        int m40067xab9ed241 = m40067xab9ed241(context);
        return 6 == m40067xab9ed241 || 1 == m40067xab9ed241 || 4 == m40067xab9ed241 || 8 == m40067xab9ed241 || 10 == m40067xab9ed241 || m40067xab9ed241 == 0;
    }

    /* renamed from: isLimited */
    public static boolean m40084xe7f09d10(int i17) {
        return i17 == 2 || i17 == 1 || i17 == 3;
    }

    /* renamed from: isMobile */
    public static boolean m40085xe877826c(android.content.Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return false;
            }
            return activeNetworkInfo.getType() != 1;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: isMobileEnabled */
    public static boolean m40086x22b94f35(android.content.Context context) {
        try {
            if (((android.telephony.TelephonyManager) context.getSystemService("phone")).getSimState() == 1) {
                return false;
            }
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            java.lang.reflect.Method declaredMethod = android.net.ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            return ((java.lang.Boolean) declaredMethod.invoke(connectivityManager, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable unused) {
            return true;
        }
    }

    /* renamed from: isMobileNetworkOpen */
    public static boolean m40087x5bd0d78c(android.content.Context context) {
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager != null) {
                java.lang.reflect.Method method = connectivityManager.getClass().getMethod("getMobileDataEnabled", new java.lang.Class[0]);
                method.setAccessible(true);
                return ((java.lang.Boolean) method.invoke(connectivityManager, new java.lang.Object[0])).booleanValue();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    @java.lang.Deprecated
    /* renamed from: isNetworkConnected */
    public static boolean m40088x550b09c5(android.content.Context context) {
        return m40080x23b734ff(context);
    }

    /* renamed from: isNetworkConnectedAboveApi23 */
    public static boolean m40089x474d3be3(android.content.Context context) {
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (activeNetwork != null && networkCapabilities != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0))) {
                return true;
            }
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: isWap */
    public static boolean m40090x5fd3d5c(int i17) {
        return i17 == 2 || i17 == 5 || i17 == 7 || i17 == 3;
    }

    /* renamed from: isWifi */
    public static boolean m40092xb9aa8b5f(int i17) {
        return i17 == 0;
    }

    /* renamed from: isWifiOr4G */
    public static boolean m40095x80cd5fb5(android.content.Context context) {
        int m40067xab9ed241 = m40067xab9ed241(context);
        return m40067xab9ed241 == 0 || m40067xab9ed241 == 10;
    }

    /* renamed from: searchIntentByClass */
    private static android.content.Intent m40096xddd3005d(android.content.Context context, java.lang.String str) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.util.List<android.content.pm.PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            if (installedPackages == null || installedPackages.size() <= 0) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "package  size" + installedPackages.size());
            for (int i17 = 0; i17 < installedPackages.size(); i17++) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "package " + installedPackages.get(i17).packageName);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setPackage(installedPackages.get(i17).packageName);
                    java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                    int size = queryIntentActivities != null ? queryIntentActivities.size() : 0;
                    if (size > 0) {
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "activityName count " + size);
                            for (int i18 = 0; i18 < size; i18++) {
                                android.content.pm.ActivityInfo activityInfo = queryIntentActivities.get(i18).activityInfo;
                                try {
                                    if (activityInfo.name.contains(str)) {
                                        android.content.Intent intent2 = new android.content.Intent("/");
                                        intent2.setComponent(new android.content.ComponentName(activityInfo.packageName, activityInfo.name));
                                        intent2.setAction("android.intent.action.VIEW");
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        arrayList.add(intent2);
                                        java.util.Collections.reverse(arrayList);
                                        yj0.a.d(context, arrayList.toArray(), "com/tencent/mars/comm/NetStatusUtil", "searchIntentByClass", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        try {
                                            context.startActivity((android.content.Intent) arrayList.get(0));
                                            yj0.a.f(context, "com/tencent/mars/comm/NetStatusUtil", "searchIntentByClass", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                            return intent2;
                                        } catch (java.lang.Exception e17) {
                                            e = e17;
                                            try {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e, "", new java.lang.Object[0]);
                                            } catch (java.lang.Exception e18) {
                                                e = e18;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e, "", new java.lang.Object[0]);
                                            }
                                        }
                                    }
                                } catch (java.lang.Exception e19) {
                                    e = e19;
                                }
                            }
                        } catch (java.lang.Exception e27) {
                            e = e27;
                        }
                    }
                } catch (java.lang.Exception e28) {
                    e = e28;
                }
            }
            return null;
        } catch (java.lang.Exception e29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e29, "", new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: startSettingItent */
    public static void m40097x4e10f0f2(android.content.Context context, int i17) {
        if (i17 == 1) {
            try {
                android.content.Intent intent = new android.content.Intent("/");
                intent.setComponent(new android.content.ComponentName("com.android.settings", "com.android.settings.DevelopmentSettings"));
                intent.setAction("android.intent.action.VIEW");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mars/comm/NetStatusUtil", "startSettingItent", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mars/comm/NetStatusUtil", "startSettingItent", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            } catch (java.lang.Exception unused) {
                m40096xddd3005d(context, "DevelopmentSettings");
                return;
            }
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            try {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setAction("android.settings.WIFI_IP_SETTINGS");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mars/comm/NetStatusUtil", "startSettingItent", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mars/comm/NetStatusUtil", "startSettingItent", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            } catch (java.lang.Exception unused2) {
                m40096xddd3005d(context, "AdvancedSettings");
                return;
            }
        }
        try {
            try {
                android.content.Intent intent3 = new android.content.Intent("/");
                intent3.setComponent(new android.content.ComponentName("com.android.providers.subscribedfeeds", "com.android.settings.ManageAccountsSettings"));
                intent3.setAction("android.intent.action.VIEW");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent3);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(context, arrayList3.toArray(), "com/tencent/mars/comm/NetStatusUtil", "startSettingItent", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(context, "com/tencent/mars/comm/NetStatusUtil", "startSettingItent", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception unused3) {
                m40096xddd3005d(context, "ManageAccountsSettings");
            }
        } catch (java.lang.Exception unused4) {
            android.content.Intent intent4 = new android.content.Intent("/");
            intent4.setComponent(new android.content.ComponentName("com.htc.settings.accountsync", "com.htc.settings.accountsync.ManageAccountsSettings"));
            intent4.setAction("android.intent.action.VIEW");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent4);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(context, arrayList4.toArray(), "com/tencent/mars/comm/NetStatusUtil", "startSettingItent", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(context, "com/tencent/mars/comm/NetStatusUtil", "startSettingItent", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: isConnected */
    public static boolean m40080x23b734ff(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if ((context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) || (connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            return connectivityManager.getActiveNetworkInfo().isConnected();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: isWap */
    public static boolean m40091x5fd3d5c(android.content.Context context) {
        return m40090x5fd3d5c(m40067xab9ed241(context));
    }

    /* renamed from: isWifi */
    public static boolean m40094xb9aa8b5f(android.net.NetworkInfo networkInfo) {
        return m40092xb9aa8b5f(m40068xab9ed241(networkInfo));
    }

    /* renamed from: isWifi */
    public static boolean m40093xb9aa8b5f(android.content.Context context) {
        return m40092xb9aa8b5f(m40067xab9ed241(context));
    }

    /* renamed from: getIOSNetType */
    public static int m40063x608a19a0(android.net.NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 0;
        }
        if (networkInfo.getType() == 1) {
            return 1;
        }
        if (networkInfo.getSubtype() != 1 && networkInfo.getSubtype() != 2) {
            if (networkInfo.getSubtype() >= 20) {
                return 5;
            }
            if (networkInfo.getSubtype() >= 13) {
                return 4;
            }
            return networkInfo.getSubtype() >= 3 ? 3 : 0;
        }
        return 2;
    }

    /* renamed from: getNetType */
    public static int m40067xab9ed241(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo activeNetworkInfo;
        if ((context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) || (connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return -1;
        }
        return m40068xab9ed241(activeNetworkInfo);
    }
}
