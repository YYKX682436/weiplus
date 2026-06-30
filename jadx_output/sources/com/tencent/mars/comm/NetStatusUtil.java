package com.tencent.mars.comm;

/* loaded from: classes12.dex */
public class NetStatusUtil {
    public static final java.lang.String CELL_CDMA = "cdma";
    public static final java.lang.String CELL_GSM = "gsm";
    public static final int CMNET = 6;
    public static final int CMWAP = 5;
    public static final int CTNET = 8;
    public static final int CTWAP = 7;
    public static final int IOS_NETTYPE_2G = 2;
    public static final int IOS_NETTYPE_3G = 3;
    public static final int IOS_NETTYPE_4G = 4;
    public static final int IOS_NETTYPE_5G = 5;
    public static final int IOS_NETTYPE_UNKNOW = 0;
    public static final int IOS_NETTYPE_WIFI = 1;
    public static final int LTE = 10;
    public static final int MOBILE = 9;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_WIFI = 1;
    public static final int NETWORK_TYPE_NR = 20;
    public static final int NET_3G = 4;
    public static final int NON_NETWORK = -1;
    public static final int NO_SIM_OPERATOR = 0;
    public static final int NR_5G = 11;
    public static final int OLD_IOS_NETTYPE_2G = 3;
    public static final int OLD_IOS_NETTYPE_3G = 4;
    public static final int OLD_IOS_NETTYPE_4G = 5;
    public static final int OLD_IOS_NETTYPE_NOT_WIFI = 0;
    public static final int OLD_IOS_NETTYPE_WAP = 2;
    public static final int OLD_IOS_NETTYPE_WIFI = 1;
    public static final int POLICY_NONE = 0;
    public static final int POLICY_REJECT_METERED_BACKGROUND = 1;
    private static final java.lang.String TAG = "MicroMsg.NetStatusUtil";
    public static final int TBACKGROUND_DATA_LIMITED = 2;
    public static final int TBACKGROUND_NOT_LIMITED = 0;
    public static final int TBACKGROUND_PROCESS_LIMITED = 1;
    public static final int TBACKGROUND_WIFI_LIMITED = 3;
    public static final int UNINET = 1;
    public static final int UNIWAP = 2;
    public static final int UNKNOW_TYPE = 999;
    public static final int WAP_3G = 3;
    public static final int WIFI = 0;
    private byte _hellAccFlag_;

    /* loaded from: classes9.dex */
    public static class CellInfo {
        public static final int MAX_CID = 65535;
        public static final int MAX_LAC = 65535;
        public java.lang.String cellid;
        public java.lang.String dbm;
        public java.lang.String lac;
        public java.lang.String mcc;
        public java.lang.String mnc;
        public java.lang.String networkId;
        public java.lang.String stationId;
        public java.lang.String systemId;
        public java.lang.String type;

        public CellInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
            this.mcc = str;
            this.mnc = str2;
            this.lac = str3;
            this.type = str6;
            this.cellid = str4;
            this.stationId = str7;
            this.networkId = str8;
            this.systemId = str9;
            this.dbm = str5;
        }
    }

    /* loaded from: classes.dex */
    public static class MacInfo {
        public java.lang.String dbm;
        public java.lang.String mac;

        public MacInfo(java.lang.String str, java.lang.String str2) {
            this.mac = str;
            this.dbm = str2;
        }
    }

    public static java.lang.String dumpNetStatus(android.content.Context context) {
        java.lang.String str;
        java.lang.String sb6;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            sb7.append("isAvailable " + activeNetworkInfo.isAvailable() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("isConnected " + activeNetworkInfo.isConnected() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("isRoaming " + activeNetworkInfo.isRoaming() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("isFailover " + activeNetworkInfo.isFailover() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("getSubtypeName " + activeNetworkInfo.getSubtypeName() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("getSubtype " + activeNetworkInfo.getSubtype() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("getType " + activeNetworkInfo.getType() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("getExtraInfo " + activeNetworkInfo.getExtraInfo() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("activeNetInfo " + activeNetworkInfo.toString() + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("is2G " + is2G(context) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("is3G " + is3G(context) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("is4G " + is4G(context) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            sb7.append("isWifi " + isWifi(context) + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("netstatus ");
            sb8.append(sb7.toString());
            sb6 = sb8.toString();
            str = TAG;
        } catch (java.lang.Exception e17) {
            e = e17;
            str = TAG;
        }
        try {
            com.tencent.mars.xlog.Log.i(str, sb6);
        } catch (java.lang.Exception e18) {
            e = e18;
            com.tencent.mars.xlog.Log.i(str, e.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "", new java.lang.Object[0]);
            return sb7.toString();
        }
        return sb7.toString();
    }

    public static android.net.NetworkInfo getActiveNetworkInfo(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        if (context == null || context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "getActiveNetworkInfo error t = " + th6.getMessage());
            return null;
        }
    }

    public static int getBackgroundLimitType(android.content.Context context) {
        int wifiSleepPolicy;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ActivityManagerNative");
            java.lang.Object invoke = cls.getMethod("getDefault", new java.lang.Class[0]).invoke(cls, new java.lang.Object[0]);
            if (((java.lang.Integer) invoke.getClass().getMethod("getProcessLimit", new java.lang.Class[0]).invoke(invoke, new java.lang.Object[0])).intValue() == 0) {
                return 1;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
        try {
            wifiSleepPolicy = getWifiSleepPolicy(context);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "", new java.lang.Object[0]);
        }
        if (wifiSleepPolicy != 2) {
            if (getNetType(context) == 0) {
                return (wifiSleepPolicy == 1 || wifiSleepPolicy == 0) ? 3 : 0;
            }
        }
        return 0;
    }

    @java.lang.Deprecated
    public static synchronized java.util.List<com.tencent.mars.comm.NetStatusUtil.CellInfo> getCellInfoList(android.content.Context context) {
        java.util.LinkedList linkedList;
        synchronized (com.tencent.mars.comm.NetStatusUtil.class) {
            com.tencent.mars.xlog.Log.e(TAG, "getCellInfoList() here will always return empty list, and mostly you should not read cell info list any more");
            linkedList = new java.util.LinkedList();
        }
        return linkedList;
    }

    public static java.lang.String getFormatedNetType(android.content.Context context) {
        return is2G(context) ? "2G" : is3G(context) ? "3G" : is4G(context) ? "4G" : is5G(context) ? "5G" : isWifi(context) ? "WIFI" : getNetTypeString(context);
    }

    public static int getIOSNetType(android.content.Context context) {
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

    public static int getIOSOldNetType(android.content.Context context) {
        int netType;
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 0;
        }
        try {
            netType = getNetType(context);
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
            return isWap(netType) ? 2 : 0;
        }
        return 3;
    }

    public static int getISPCode(android.content.Context context) {
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
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    public static java.lang.String getISPName(android.content.Context context) {
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

    public static int getNetType(android.net.NetworkInfo networkInfo) {
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

    public static int getNetTypeForStat(android.content.Context context) {
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
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return 999;
        }
    }

    public static java.lang.String getNetTypeString(android.content.Context context) {
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
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return "NON_NETWORK";
        }
    }

    public static int getNetWorkType(android.content.Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return -1;
        }
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.getType();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
        return -1;
    }

    public static int getProxyInfo(android.content.Context context, java.lang.StringBuffer stringBuffer) {
        java.lang.String defaultHost;
        int defaultPort;
        try {
            defaultHost = android.net.Proxy.getDefaultHost();
            defaultPort = android.net.Proxy.getDefaultPort();
            java.lang.Thread.currentThread().getId();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
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

    public static int getWifiSleepPolicy(android.content.Context context) {
        return android.provider.Settings.System.getInt(context.getContentResolver(), "wifi_sleep_policy", 2);
    }

    public static int guessNetSpeed(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 102400;
        }
        try {
            activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
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

    public static boolean is2G(android.content.Context context) {
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
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public static boolean is3G(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
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

    public static boolean is4G(android.content.Context context) {
        android.net.NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
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

    public static boolean is5G(android.content.Context context) {
        if (context != null) {
            try {
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    return false;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) {
            return false;
        }
        activeNetworkInfo.getSubtype();
        return activeNetworkInfo.getSubtype() >= 20;
    }

    public static boolean isCellularEnabled(android.content.Context context) {
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(0);
    }

    public static boolean isConnected(android.net.NetworkInfo networkInfo) {
        try {
            return networkInfo.isConnected();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean isImmediatelyDestroyActivities(android.content.Context context) {
        return android.provider.Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0) != 0;
    }

    public static boolean isKnownDirectNet(android.content.Context context) {
        int netType = getNetType(context);
        return 6 == netType || 1 == netType || 4 == netType || 8 == netType || 10 == netType || netType == 0;
    }

    public static boolean isLimited(int i17) {
        return i17 == 2 || i17 == 1 || i17 == 3;
    }

    public static boolean isMobile(android.content.Context context) {
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
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean isMobileEnabled(android.content.Context context) {
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

    public static boolean isMobileNetworkOpen(android.content.Context context) {
        try {
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager != null) {
                java.lang.reflect.Method method = connectivityManager.getClass().getMethod("getMobileDataEnabled", new java.lang.Class[0]);
                method.setAccessible(true);
                return ((java.lang.Boolean) method.invoke(connectivityManager, new java.lang.Object[0])).booleanValue();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
        return false;
    }

    @java.lang.Deprecated
    public static boolean isNetworkConnected(android.content.Context context) {
        return isConnected(context);
    }

    public static boolean isNetworkConnectedAboveApi23(android.content.Context context) {
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
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean isWap(int i17) {
        return i17 == 2 || i17 == 5 || i17 == 7 || i17 == 3;
    }

    public static boolean isWifi(int i17) {
        return i17 == 0;
    }

    public static boolean isWifiOr4G(android.content.Context context) {
        int netType = getNetType(context);
        return netType == 0 || netType == 10;
    }

    private static android.content.Intent searchIntentByClass(android.content.Context context, java.lang.String str) {
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            java.util.List<android.content.pm.PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            if (installedPackages == null || installedPackages.size() <= 0) {
                return null;
            }
            com.tencent.mars.xlog.Log.e(TAG, "package  size" + installedPackages.size());
            for (int i17 = 0; i17 < installedPackages.size(); i17++) {
                try {
                    com.tencent.mars.xlog.Log.e(TAG, "package " + installedPackages.get(i17).packageName);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setPackage(installedPackages.get(i17).packageName);
                    java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                    int size = queryIntentActivities != null ? queryIntentActivities.size() : 0;
                    if (size > 0) {
                        try {
                            com.tencent.mars.xlog.Log.e(TAG, "activityName count " + size);
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
                                                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e, "", new java.lang.Object[0]);
                                            } catch (java.lang.Exception e18) {
                                                e = e18;
                                                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e, "", new java.lang.Object[0]);
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
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e29, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static void startSettingItent(android.content.Context context, int i17) {
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
                searchIntentByClass(context, "DevelopmentSettings");
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
                searchIntentByClass(context, "AdvancedSettings");
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
                searchIntentByClass(context, "ManageAccountsSettings");
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

    public static boolean isConnected(android.content.Context context) {
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

    public static boolean isWap(android.content.Context context) {
        return isWap(getNetType(context));
    }

    public static boolean isWifi(android.net.NetworkInfo networkInfo) {
        return isWifi(getNetType(networkInfo));
    }

    public static boolean isWifi(android.content.Context context) {
        return isWifi(getNetType(context));
    }

    public static int getIOSNetType(android.net.NetworkInfo networkInfo) {
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

    public static int getNetType(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo activeNetworkInfo;
        if ((context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) || (connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return -1;
        }
        return getNetType(activeNetworkInfo);
    }
}
