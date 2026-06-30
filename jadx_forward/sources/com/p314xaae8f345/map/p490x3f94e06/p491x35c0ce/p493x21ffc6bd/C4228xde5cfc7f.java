package com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd;

/* renamed from: com.tencent.map.geolocation.sapp.internal.TencentExtraKeys */
/* loaded from: classes13.dex */
public class C4228xde5cfc7f {

    /* renamed from: ALLOW_NLP_LOCATION */
    public static final boolean f16274x5ace7858 = true;

    /* renamed from: DIDI_INTERNAL */
    public static final boolean f16275x18318792 = false;

    /* renamed from: LOCATION_KEY_ADMIN_LEVEL1 */
    public static final java.lang.String f16276x76e851a7 = "admin_level_1";

    /* renamed from: LOCATION_KEY_ADMIN_LEVEL2 */
    public static final java.lang.String f16277x76e851a8 = "admin_level_2";

    /* renamed from: LOCATION_KEY_ADMIN_LEVEL3 */
    public static final java.lang.String f16278x76e851a9 = "admin_level_3";

    /* renamed from: LOCATION_KEY_LOCALITY */
    public static final java.lang.String f16279xc3c8dbad = "locality";

    /* renamed from: LOCATION_KEY_NATION */
    public static final java.lang.String f16280x1473c11 = "nation";

    /* renamed from: LOCATION_KEY_ROUTE */
    public static final java.lang.String f16281x190f801f = "route";

    /* renamed from: LOCATION_KEY_SUBLOCALITY */
    public static final java.lang.String f16282xecdb04f9 = "sublocality";

    /* renamed from: LOCATION_SOURCE_CELL */
    public static final java.lang.String f16283x83aa3d7c = "cell";

    /* renamed from: LOCATION_SOURCE_GPS */
    public static final java.lang.String f16284xc816d30 = "gps";

    /* renamed from: LOCATION_SOURCE_WIFI */
    public static final java.lang.String f16285x83b3632f = "wifi";

    /* renamed from: RAW_DATA */
    public static final java.lang.String f16286x4e65a981 = "raw_data";

    /* renamed from: REQUEST_RAW_DATA */
    public static final java.lang.String f16287xf6762951 = "request_raw_data";

    /* renamed from: STRICT_CELL_FILTER */
    public static final boolean f16288x1626147f = true;
    private static final java.lang.String TAG = "TencentExtraKeys";

    /* renamed from: TENCENT_INTERNAL */
    public static final boolean f16289x6892a297 = true;

    /* renamed from: mContext */
    private static android.content.Context f16290xd6cfe882;

    /* renamed from: mLoader */
    private static dalvik.system.DexClassLoader f16291xe0156e0;

    /* renamed from: mProxyObj */
    private static java.lang.Object f16292xea44d336;

    /* renamed from: mProxyclass */
    private static java.lang.Class f16293x6d7b2c17;

    private static boolean a(android.content.Context context, int i17) {
        if (i17 > 0) {
            try {
                c.t.m.p134x35c0ce.c.q.a(c.t.m.p134x35c0ce.c.q.c(context));
                c.t.m.p134x35c0ce.c.q.a(c.t.m.p134x35c0ce.c.q.h(context));
                c.t.m.p134x35c0ce.c.q.a();
                c.t.m.p134x35c0ce.c.f.a(context).c();
            } catch (java.lang.Throwable th6) {
                c.t.m.p134x35c0ce.c.e.b().a("EKS", "init error 3," + i17 + "," + th6.toString());
                return false;
            }
        }
        dalvik.system.DexClassLoader a17 = c.t.m.p134x35c0ce.c.f.a(context).a();
        if (a17 == null) {
            c.t.m.p134x35c0ce.c.i.a("EKS,loader is null");
            c.t.m.p134x35c0ce.c.e.b().a("EKS", "init error 2," + i17);
            return false;
        }
        if (f16293x6d7b2c17 == null || f16292xea44d336 == null) {
            java.lang.Class<?> loadClass = a17.loadClass("com.tencent.map.geolocation.sapp.proxy.TencentExtraKeysProxy");
            f16293x6d7b2c17 = loadClass;
            f16292xea44d336 = loadClass.newInstance();
        }
        c.t.m.p134x35c0ce.c.e.b().a("EKS", "init ok 0," + i17);
        return true;
    }

    /* renamed from: enableMockLocationFilter */
    public static void m34987x7aa52e9a(boolean z17) {
        try {
            if (!m34993xefd01f3e()) {
                throw new java.lang.Exception("proxy is error");
            }
            f16293x6d7b2c17.getDeclaredMethod("enableMockLocationFilter", java.lang.Boolean.TYPE).invoke(f16292xea44d336, java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: getLocationSource */
    public static java.lang.String m34988xe2316526(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa) {
        try {
            if (m34993xefd01f3e()) {
                return (java.lang.String) f16293x6d7b2c17.getDeclaredMethod("getLocationSource", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.class).invoke(f16292xea44d336, interfaceC4218x687499fa);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: getLogDir */
    public static synchronized java.io.File m34989x23ae959f() {
        java.io.File file;
        synchronized (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.class) {
            try {
                if (!m34993xefd01f3e()) {
                    throw new java.lang.Exception("proxy is error");
                }
                file = (java.io.File) f16293x6d7b2c17.getDeclaredMethod("getLogDir", new java.lang.Class[0]).invoke(f16292xea44d336, new java.lang.Object[0]);
            } finally {
            }
        }
        return file;
    }

    /* renamed from: getRawData */
    public static byte[] m34990x788703bc(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa) {
        try {
            if (m34993xefd01f3e()) {
                return (byte[]) f16293x6d7b2c17.getDeclaredMethod("getRawData", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.class).invoke(f16292xea44d336, interfaceC4218x687499fa);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: getRawGps */
    public static android.location.Location m34991x2d2db258(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa) {
        try {
            if (m34993xefd01f3e()) {
                return (android.location.Location) f16293x6d7b2c17.getDeclaredMethod("getRawGps", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.class).invoke(f16292xea44d336, interfaceC4218x687499fa);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: getRawQuery */
    public static java.lang.String m34992x991986f6(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa) {
        try {
            if (m34993xefd01f3e()) {
                return (java.lang.String) f16293x6d7b2c17.getDeclaredMethod("getRawQuery", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.class).invoke(f16292xea44d336, interfaceC4218x687499fa);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: initProxy */
    private static boolean m34993xefd01f3e() {
        if (f16290xd6cfe882 == null) {
            return false;
        }
        for (int i17 = 0; i17 < 3; i17++) {
            if (a(f16290xd6cfe882, i17)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: isAllowedLevel */
    public static boolean m34994xbd966506(int i17) {
        try {
            if (!m34993xefd01f3e()) {
                throw new java.lang.Exception("proxy is error");
            }
            return ((java.lang.Boolean) f16293x6d7b2c17.getDeclaredMethod("isAllowedLevel", java.lang.Integer.TYPE).invoke(f16292xea44d336, java.lang.Integer.valueOf(i17))).booleanValue();
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    @java.lang.Deprecated
    /* renamed from: isDebugEnabled */
    public static synchronized boolean m34995xa8834bb8() {
        boolean booleanValue;
        synchronized (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.class) {
            try {
                if (!m34993xefd01f3e()) {
                    throw new java.lang.Exception("proxy is error");
                }
                booleanValue = ((java.lang.Boolean) f16293x6d7b2c17.getDeclaredMethod("isDebugEnabled", new java.lang.Class[0]).invoke(f16292xea44d336, new java.lang.Object[0])).booleanValue();
            } finally {
            }
        }
        return booleanValue;
    }

    /* renamed from: isInsIllegalApp */
    public static int m34996x22feec4f(android.content.Context context) {
        try {
            f16290xd6cfe882 = context;
            if (m34993xefd01f3e()) {
                return ((java.lang.Integer) f16293x6d7b2c17.getDeclaredMethod("isInsIllegalApp", android.content.Context.class).invoke(f16292xea44d336, context)).intValue();
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: isRequestRawData */
    public static boolean m34997x72c2c62d(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa335) {
        try {
            if (m34993xefd01f3e()) {
                return ((java.lang.Boolean) f16293x6d7b2c17.getDeclaredMethod("isRequestRawData", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335.class).invoke(f16292xea44d336, c4222x974aa335)).booleanValue();
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: loadLibrary */
    public static void m34998xeb57c8f5(java.lang.String path) {
        try {
            com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d2 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            com.p314xaae8f345.cso.C2941xefde02d2.h(path);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: setContext */
    public static void m34999xe9f5beed(android.content.Context context) {
        f16290xd6cfe882 = context;
        c.t.m.p134x35c0ce.c.e.a(context).c();
    }

    /* renamed from: setLogDir */
    public static synchronized void m35000x16e3c9ab(java.io.File file) {
        synchronized (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.class) {
            try {
                if (!m34993xefd01f3e()) {
                    throw new java.lang.Exception("proxy is error");
                }
                f16293x6d7b2c17.getDeclaredMethod("setLogDir", java.io.File.class).invoke(f16292xea44d336, file);
            } finally {
            }
        }
    }

    /* renamed from: setRawData */
    public static com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa m35001xebf85130(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa, byte[] bArr) {
        try {
            if (m34993xefd01f3e()) {
                return (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa) f16293x6d7b2c17.getDeclaredMethod("setRawData", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.class, byte[].class).invoke(f16292xea44d336, interfaceC4218x687499fa, bArr);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: setRawGps */
    public static void m35002x2062e664(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa, android.location.Location location) {
        try {
            if (!m34993xefd01f3e()) {
                throw new java.lang.Exception("proxy is error");
            }
            f16293x6d7b2c17.getDeclaredMethod("setRawGps", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.class, android.location.Location.class).invoke(f16292xea44d336, interfaceC4218x687499fa, location);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: setRawQuery */
    public static void m35003x93d1e802(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa interfaceC4218x687499fa, java.lang.String str) {
        try {
            if (!m34993xefd01f3e()) {
                throw new java.lang.Exception("proxy is error");
            }
            f16293x6d7b2c17.getDeclaredMethod("setRawQuery", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.class, java.lang.String.class).invoke(f16292xea44d336, interfaceC4218x687499fa, str);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: setRequestRawData */
    public static com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 m35004x82a57365(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa335, boolean z17) {
        try {
            if (!m34993xefd01f3e()) {
                throw new java.lang.Exception("proxy is error");
            }
            return (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335) f16293x6d7b2c17.getDeclaredMethod("setRequestRawData", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335.class, java.lang.Boolean.TYPE).invoke(f16292xea44d336, c4222x974aa335, java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: setTencentLog */
    public static void m35005x1713bbc1(android.content.Context context, java.io.File file) {
        try {
            f16290xd6cfe882 = context;
            if (!m34993xefd01f3e()) {
                throw new java.lang.Exception("proxy is error");
            }
            f16293x6d7b2c17.getDeclaredMethod("setTencentLog", android.content.Context.class, java.io.File.class).invoke(f16292xea44d336, context, file);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: setTencentLogCallback */
    public static void m35006x1256ef26(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.InterfaceC4227xc9310094 interfaceC4227xc9310094) {
        try {
            c.t.m.p134x35c0ce.c.i.a(interfaceC4227xc9310094);
            if (!m34993xefd01f3e()) {
                throw new java.lang.Exception("proxy is error");
            }
            f16293x6d7b2c17.getDeclaredMethod("setTencentLogCallback", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.InterfaceC4227xc9310094.class).invoke(f16292xea44d336, interfaceC4227xc9310094);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    /* renamed from: wgs84ToGcj02 */
    public static boolean m35007xde5778f6(double[] dArr, double[] dArr2) {
        try {
            if (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4221x9c23eacb.m34933x204ddf56()) {
                try {
                    com.p314xaae8f345.cso.C2941xefde02d2.e("tencentlocsapp");
                } catch (java.lang.Throwable th6) {
                    th6.toString();
                    return false;
                }
            }
            if (m34993xefd01f3e()) {
                return ((java.lang.Boolean) f16293x6d7b2c17.getDeclaredMethod("wgs84ToGcj02", double[].class, double[].class).invoke(f16292xea44d336, dArr, dArr2)).booleanValue();
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th7) {
            throw new java.lang.Exception(th7.toString());
        }
    }
}
