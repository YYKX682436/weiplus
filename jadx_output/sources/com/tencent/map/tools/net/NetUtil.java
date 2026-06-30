package com.tencent.map.tools.net;

/* loaded from: classes12.dex */
public class NetUtil {
    private static final int BUF_SIZE = 4096;
    private static final java.lang.String CMWAP = "cmwap";
    private static final java.lang.String CTWAP = "ctwap";
    public static final int DEFAULT_TIME_OUT = 10000;
    public static final java.lang.String MAP_USER_AGENT = "QQ Map Mobile";
    private static final java.lang.String NET_3G = "3gnet";
    public static final java.lang.String STR_UserAgent = "androidsdk";
    public static final int TYPE_3GWAP = 3;
    public static final int TYPE_CMWAP = 1;
    public static final int TYPE_CTWAP = 4;
    public static final int TYPE_NET_WORK_DISABLED = 0;
    public static final int TYPE_OTHER_NET = 6;
    public static final int TYPE_UNIWAP = 2;
    public static final int TYPE_WIFI = 5;
    private static final java.lang.String UNIWAP = "uniwap";
    private static final java.lang.String WAP_3G = "3gwap";
    public static final java.lang.String WIFI = "wifi";

    public static int getNetType(android.content.Context context) {
        return getNetType(getNetworkInfo(context));
    }

    public static java.lang.String getNetTypeStr(android.content.Context context) {
        int netType = getNetType(context);
        return netType != 1 ? netType != 2 ? netType != 3 ? netType != 4 ? netType != 5 ? "" : "wifi" : CTWAP : WAP_3G : UNIWAP : CMWAP;
    }

    public static android.net.NetworkInfo getNetworkInfo(android.content.Context context) {
        try {
            return ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static java.lang.String getNetworkType(android.content.Context context) {
        try {
            android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type == 1) {
                    return "wifi";
                }
                if (type != 0) {
                    return "other";
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                        return "2g";
                    case 3:
                        return "3g";
                    case 4:
                        return "2g";
                    case 5:
                    case 6:
                    case 8:
                        return "3g";
                    case 7:
                    default:
                        return "other";
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return com.eclipsesource.mmv8.Platform.UNKNOWN;
    }

    public static boolean isMobile(android.content.Context context) {
        int netType = getNetType(context);
        return (netType == 0 || netType == 5) ? false : true;
    }

    public static boolean isNetAvailable(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo networkInfo;
        try {
            connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            networkInfo = getNetworkInfo(context);
        } catch (java.lang.Exception unused) {
        }
        if (networkInfo != null) {
            return networkInfo.isAvailable();
        }
        for (android.net.NetworkInfo networkInfo2 : connectivityManager.getAllNetworkInfo()) {
            if (networkInfo2.isAvailable() && networkInfo2.isConnectedOrConnecting()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWifi(android.content.Context context) {
        return getNetType(context) == 5;
    }

    public static final void safeClose(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static byte[] toBytes(java.io.InputStream inputStream) {
        try {
            return toBytesThrow(inputStream);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static byte[] toBytesThrow(java.io.InputStream inputStream) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
        if (inputStream == null) {
            return null;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read == -1) {
                        byteArrayOutputStream2.flush();
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        safeClose(byteArrayOutputStream2);
                        return byteArray;
                    }
                    byteArrayOutputStream2.write(bArr, 0, read);
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                byteArrayOutputStream = byteArrayOutputStream2;
                safeClose(byteArrayOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static void writeBytesWithoutClose(byte[] bArr, java.io.OutputStream outputStream) {
        if (bArr != null && bArr.length != 0 && outputStream != null) {
            try {
                outputStream.write(bArr);
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static int getNetType(android.net.NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable()) {
            return 0;
        }
        int type = networkInfo.getType();
        if (type == 1) {
            return 5;
        }
        if (type != 0) {
            return 6;
        }
        java.lang.String extraInfo = networkInfo.getExtraInfo();
        if (android.text.TextUtils.isEmpty(extraInfo)) {
            return 6;
        }
        if (extraInfo.equalsIgnoreCase(CMWAP)) {
            return 1;
        }
        if (extraInfo.equalsIgnoreCase(WAP_3G)) {
            return 3;
        }
        if (extraInfo.equalsIgnoreCase(UNIWAP)) {
            return 2;
        }
        return extraInfo.equalsIgnoreCase(CTWAP) ? 4 : 3;
    }
}
