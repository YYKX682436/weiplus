package com.tencent.map.geolocation.sapp.internal;

/* loaded from: classes13.dex */
public class TencentExtraKeys {
    public static final boolean ALLOW_NLP_LOCATION = true;
    public static final boolean DIDI_INTERNAL = false;
    public static final java.lang.String LOCATION_KEY_ADMIN_LEVEL1 = "admin_level_1";
    public static final java.lang.String LOCATION_KEY_ADMIN_LEVEL2 = "admin_level_2";
    public static final java.lang.String LOCATION_KEY_ADMIN_LEVEL3 = "admin_level_3";
    public static final java.lang.String LOCATION_KEY_LOCALITY = "locality";
    public static final java.lang.String LOCATION_KEY_NATION = "nation";
    public static final java.lang.String LOCATION_KEY_ROUTE = "route";
    public static final java.lang.String LOCATION_KEY_SUBLOCALITY = "sublocality";
    public static final java.lang.String LOCATION_SOURCE_CELL = "cell";
    public static final java.lang.String LOCATION_SOURCE_GPS = "gps";
    public static final java.lang.String LOCATION_SOURCE_WIFI = "wifi";
    public static final java.lang.String RAW_DATA = "raw_data";
    public static final java.lang.String REQUEST_RAW_DATA = "request_raw_data";
    public static final boolean STRICT_CELL_FILTER = true;
    private static final java.lang.String TAG = "TencentExtraKeys";
    public static final boolean TENCENT_INTERNAL = true;
    private static android.content.Context mContext;
    private static dalvik.system.DexClassLoader mLoader;
    private static java.lang.Object mProxyObj;
    private static java.lang.Class mProxyclass;

    private static boolean a(android.content.Context context, int i17) {
        if (i17 > 0) {
            try {
                c.t.m.sapp.c.q.a(c.t.m.sapp.c.q.c(context));
                c.t.m.sapp.c.q.a(c.t.m.sapp.c.q.h(context));
                c.t.m.sapp.c.q.a();
                c.t.m.sapp.c.f.a(context).c();
            } catch (java.lang.Throwable th6) {
                c.t.m.sapp.c.e.b().a("EKS", "init error 3," + i17 + "," + th6.toString());
                return false;
            }
        }
        dalvik.system.DexClassLoader a17 = c.t.m.sapp.c.f.a(context).a();
        if (a17 == null) {
            c.t.m.sapp.c.i.a("EKS,loader is null");
            c.t.m.sapp.c.e.b().a("EKS", "init error 2," + i17);
            return false;
        }
        if (mProxyclass == null || mProxyObj == null) {
            java.lang.Class<?> loadClass = a17.loadClass("com.tencent.map.geolocation.sapp.proxy.TencentExtraKeysProxy");
            mProxyclass = loadClass;
            mProxyObj = loadClass.newInstance();
        }
        c.t.m.sapp.c.e.b().a("EKS", "init ok 0," + i17);
        return true;
    }

    public static void enableMockLocationFilter(boolean z17) {
        try {
            if (!initProxy()) {
                throw new java.lang.Exception("proxy is error");
            }
            mProxyclass.getDeclaredMethod("enableMockLocationFilter", java.lang.Boolean.TYPE).invoke(mProxyObj, java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static java.lang.String getLocationSource(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation) {
        try {
            if (initProxy()) {
                return (java.lang.String) mProxyclass.getDeclaredMethod("getLocationSource", com.tencent.map.geolocation.sapp.TencentLocation.class).invoke(mProxyObj, tencentLocation);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static synchronized java.io.File getLogDir() {
        java.io.File file;
        synchronized (com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.class) {
            try {
                if (!initProxy()) {
                    throw new java.lang.Exception("proxy is error");
                }
                file = (java.io.File) mProxyclass.getDeclaredMethod("getLogDir", new java.lang.Class[0]).invoke(mProxyObj, new java.lang.Object[0]);
            } finally {
            }
        }
        return file;
    }

    public static byte[] getRawData(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation) {
        try {
            if (initProxy()) {
                return (byte[]) mProxyclass.getDeclaredMethod("getRawData", com.tencent.map.geolocation.sapp.TencentLocation.class).invoke(mProxyObj, tencentLocation);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static android.location.Location getRawGps(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation) {
        try {
            if (initProxy()) {
                return (android.location.Location) mProxyclass.getDeclaredMethod("getRawGps", com.tencent.map.geolocation.sapp.TencentLocation.class).invoke(mProxyObj, tencentLocation);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static java.lang.String getRawQuery(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation) {
        try {
            if (initProxy()) {
                return (java.lang.String) mProxyclass.getDeclaredMethod("getRawQuery", com.tencent.map.geolocation.sapp.TencentLocation.class).invoke(mProxyObj, tencentLocation);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    private static boolean initProxy() {
        if (mContext == null) {
            return false;
        }
        for (int i17 = 0; i17 < 3; i17++) {
            if (a(mContext, i17)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAllowedLevel(int i17) {
        try {
            if (!initProxy()) {
                throw new java.lang.Exception("proxy is error");
            }
            return ((java.lang.Boolean) mProxyclass.getDeclaredMethod("isAllowedLevel", java.lang.Integer.TYPE).invoke(mProxyObj, java.lang.Integer.valueOf(i17))).booleanValue();
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    @java.lang.Deprecated
    public static synchronized boolean isDebugEnabled() {
        boolean booleanValue;
        synchronized (com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.class) {
            try {
                if (!initProxy()) {
                    throw new java.lang.Exception("proxy is error");
                }
                booleanValue = ((java.lang.Boolean) mProxyclass.getDeclaredMethod("isDebugEnabled", new java.lang.Class[0]).invoke(mProxyObj, new java.lang.Object[0])).booleanValue();
            } finally {
            }
        }
        return booleanValue;
    }

    public static int isInsIllegalApp(android.content.Context context) {
        try {
            mContext = context;
            if (initProxy()) {
                return ((java.lang.Integer) mProxyclass.getDeclaredMethod("isInsIllegalApp", android.content.Context.class).invoke(mProxyObj, context)).intValue();
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static boolean isRequestRawData(com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest) {
        try {
            if (initProxy()) {
                return ((java.lang.Boolean) mProxyclass.getDeclaredMethod("isRequestRawData", com.tencent.map.geolocation.sapp.TencentLocationRequest.class).invoke(mProxyObj, tencentLocationRequest)).booleanValue();
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static void loadLibrary(java.lang.String path) {
        try {
            com.tencent.cso.CsoLoader csoLoader = com.tencent.cso.CsoLoader.f45934a;
            kotlin.jvm.internal.o.g(path, "path");
            com.tencent.cso.CsoLoader.h(path);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static void setContext(android.content.Context context) {
        mContext = context;
        c.t.m.sapp.c.e.a(context).c();
    }

    public static synchronized void setLogDir(java.io.File file) {
        synchronized (com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.class) {
            try {
                if (!initProxy()) {
                    throw new java.lang.Exception("proxy is error");
                }
                mProxyclass.getDeclaredMethod("setLogDir", java.io.File.class).invoke(mProxyObj, file);
            } finally {
            }
        }
    }

    public static com.tencent.map.geolocation.sapp.TencentLocation setRawData(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, byte[] bArr) {
        try {
            if (initProxy()) {
                return (com.tencent.map.geolocation.sapp.TencentLocation) mProxyclass.getDeclaredMethod("setRawData", com.tencent.map.geolocation.sapp.TencentLocation.class, byte[].class).invoke(mProxyObj, tencentLocation, bArr);
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static void setRawGps(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, android.location.Location location) {
        try {
            if (!initProxy()) {
                throw new java.lang.Exception("proxy is error");
            }
            mProxyclass.getDeclaredMethod("setRawGps", com.tencent.map.geolocation.sapp.TencentLocation.class, android.location.Location.class).invoke(mProxyObj, tencentLocation, location);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static void setRawQuery(com.tencent.map.geolocation.sapp.TencentLocation tencentLocation, java.lang.String str) {
        try {
            if (!initProxy()) {
                throw new java.lang.Exception("proxy is error");
            }
            mProxyclass.getDeclaredMethod("setRawQuery", com.tencent.map.geolocation.sapp.TencentLocation.class, java.lang.String.class).invoke(mProxyObj, tencentLocation, str);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static com.tencent.map.geolocation.sapp.TencentLocationRequest setRequestRawData(com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest, boolean z17) {
        try {
            if (!initProxy()) {
                throw new java.lang.Exception("proxy is error");
            }
            return (com.tencent.map.geolocation.sapp.TencentLocationRequest) mProxyclass.getDeclaredMethod("setRequestRawData", com.tencent.map.geolocation.sapp.TencentLocationRequest.class, java.lang.Boolean.TYPE).invoke(mProxyObj, tencentLocationRequest, java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static void setTencentLog(android.content.Context context, java.io.File file) {
        try {
            mContext = context;
            if (!initProxy()) {
                throw new java.lang.Exception("proxy is error");
            }
            mProxyclass.getDeclaredMethod("setTencentLog", android.content.Context.class, java.io.File.class).invoke(mProxyObj, context, file);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static void setTencentLogCallback(com.tencent.map.geolocation.sapp.internal.LocationLogCallback locationLogCallback) {
        try {
            c.t.m.sapp.c.i.a(locationLogCallback);
            if (!initProxy()) {
                throw new java.lang.Exception("proxy is error");
            }
            mProxyclass.getDeclaredMethod("setTencentLogCallback", com.tencent.map.geolocation.sapp.internal.LocationLogCallback.class).invoke(mProxyObj, locationLogCallback);
        } catch (java.lang.Throwable th6) {
            throw new java.lang.Exception(th6.toString());
        }
    }

    public static boolean wgs84ToGcj02(double[] dArr, double[] dArr2) {
        try {
            if (com.tencent.map.geolocation.sapp.TencentLocationManagerOptions.isLoadLibraryEnabled()) {
                try {
                    com.tencent.cso.CsoLoader.e("tencentlocsapp");
                } catch (java.lang.Throwable th6) {
                    th6.toString();
                    return false;
                }
            }
            if (initProxy()) {
                return ((java.lang.Boolean) mProxyclass.getDeclaredMethod("wgs84ToGcj02", double[].class, double[].class).invoke(mProxyObj, dArr, dArr2)).booleanValue();
            }
            throw new java.lang.Exception("proxy is error");
        } catch (java.lang.Throwable th7) {
            throw new java.lang.Exception(th7.toString());
        }
    }
}
