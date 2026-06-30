package com.p314xaae8f345.map.p511x696c9db.net;

/* renamed from: com.tencent.map.tools.net.NetUtil */
/* loaded from: classes12.dex */
public class C4332xd10a8f1f {

    /* renamed from: BUF_SIZE */
    private static final int f16987xd5540a6d = 4096;

    /* renamed from: CMWAP */
    private static final java.lang.String f16988x3d4761c = "cmwap";

    /* renamed from: CTWAP */
    private static final java.lang.String f16989x3d7a4b5 = "ctwap";

    /* renamed from: DEFAULT_TIME_OUT */
    public static final int f16990x1713231a = 10000;

    /* renamed from: MAP_USER_AGENT */
    public static final java.lang.String f16991xed309c54 = "QQ Map Mobile";

    /* renamed from: NET_3G */
    private static final java.lang.String f16992x890df076 = "3gnet";

    /* renamed from: STR_UserAgent */
    public static final java.lang.String f16993xbd49c92c = "androidsdk";

    /* renamed from: TYPE_3GWAP */
    public static final int f16994x115c5a8d = 3;

    /* renamed from: TYPE_CMWAP */
    public static final int f16995x12408cd7 = 1;

    /* renamed from: TYPE_CTWAP */
    public static final int f16996x1243bb70 = 4;

    /* renamed from: TYPE_NET_WORK_DISABLED */
    public static final int f16997xeb5ff6e3 = 0;

    /* renamed from: TYPE_OTHER_NET */
    public static final int f16998x6aec2ce9 = 6;

    /* renamed from: TYPE_UNIWAP */
    public static final int f16999x5490549b = 2;

    /* renamed from: TYPE_WIFI */
    public static final int f17000xc6d14cfa = 5;

    /* renamed from: UNIWAP */
    private static final java.lang.String f17001x957993f6 = "uniwap";

    /* renamed from: WAP_3G */
    private static final java.lang.String f17002x982f5e8d = "3gwap";

    /* renamed from: WIFI */
    public static final java.lang.String f17003x28a715 = "wifi";

    /* renamed from: getNetType */
    public static int m36031xab9ed241(android.content.Context context) {
        return m36032xab9ed241(m36034x6625b2c6(context));
    }

    /* renamed from: getNetTypeStr */
    public static java.lang.String m36033xa736c030(android.content.Context context) {
        int m36031xab9ed241 = m36031xab9ed241(context);
        return m36031xab9ed241 != 1 ? m36031xab9ed241 != 2 ? m36031xab9ed241 != 3 ? m36031xab9ed241 != 4 ? m36031xab9ed241 != 5 ? "" : "wifi" : f16989x3d7a4b5 : f17002x982f5e8d : f17001x957993f6 : f16988x3d4761c;
    }

    /* renamed from: getNetworkInfo */
    public static android.net.NetworkInfo m36034x6625b2c6(android.content.Context context) {
        try {
            return ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: getNetworkType */
    public static java.lang.String m36035x662add52(android.content.Context context) {
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
        return com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
    }

    /* renamed from: isMobile */
    public static boolean m36036xe877826c(android.content.Context context) {
        int m36031xab9ed241 = m36031xab9ed241(context);
        return (m36031xab9ed241 == 0 || m36031xab9ed241 == 5) ? false : true;
    }

    /* renamed from: isNetAvailable */
    public static boolean m36037xdc2973f6(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        android.net.NetworkInfo m36034x6625b2c6;
        try {
            connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
            m36034x6625b2c6 = m36034x6625b2c6(context);
        } catch (java.lang.Exception unused) {
        }
        if (m36034x6625b2c6 != null) {
            return m36034x6625b2c6.isAvailable();
        }
        for (android.net.NetworkInfo networkInfo : connectivityManager.getAllNetworkInfo()) {
            if (networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isWifi */
    public static boolean m36038xb9aa8b5f(android.content.Context context) {
        return m36031xab9ed241(context) == 5;
    }

    /* renamed from: safeClose */
    public static final void m36039xbb07de6b(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: toBytes */
    public static byte[] m36040xb99796b0(java.io.InputStream inputStream) {
        try {
            return m36041xd4dbce16(inputStream);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: toBytesThrow */
    public static byte[] m36041xd4dbce16(java.io.InputStream inputStream) {
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
                        m36039xbb07de6b(byteArrayOutputStream2);
                        return byteArray;
                    }
                    byteArrayOutputStream2.write(bArr, 0, read);
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                byteArrayOutputStream = byteArrayOutputStream2;
                m36039xbb07de6b(byteArrayOutputStream);
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    /* renamed from: writeBytesWithoutClose */
    public static void m36042xe4e1b7fc(byte[] bArr, java.io.OutputStream outputStream) {
        if (bArr != null && bArr.length != 0 && outputStream != null) {
            try {
                outputStream.write(bArr);
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* renamed from: getNetType */
    private static int m36032xab9ed241(android.net.NetworkInfo networkInfo) {
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
        if (extraInfo.equalsIgnoreCase(f16988x3d4761c)) {
            return 1;
        }
        if (extraInfo.equalsIgnoreCase(f17002x982f5e8d)) {
            return 3;
        }
        if (extraInfo.equalsIgnoreCase(f17001x957993f6)) {
            return 2;
        }
        return extraInfo.equalsIgnoreCase(f16989x3d7a4b5) ? 4 : 3;
    }
}
