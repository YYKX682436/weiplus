package com.tencent.map.geolocation.sapp;

/* loaded from: classes13.dex */
public final class TencentLocationManager {
    public static final int COORDINATE_TYPE_GCJ02 = 1;
    public static final int COORDINATE_TYPE_WGS84 = 0;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "TencentLocationManager";
    public static final java.lang.String TYPE_OAID = "oaId";
    public static final java.lang.String TYPE_QIMEI = "qImei";
    private static android.content.Context mContext;
    private static android.util.Pair<java.lang.String, java.lang.String> mPair;
    private static java.lang.Class mProxyClass;
    private static java.lang.Object mProxyObj;
    private static com.tencent.map.geolocation.sapp.TencentLocationManager sInstance;
    private int mInitStatus;
    private final byte[] mLock = new byte[0];

    private TencentLocationManager(android.content.Context context, android.util.Pair<java.lang.String, java.lang.String> pair) {
        android.util.Pair<java.lang.String, java.lang.String> pair2;
        this.mInitStatus = 0;
        if (com.tencent.map.geolocation.sapp.TencentLocationManagerOptions.isLoadLibraryEnabled()) {
            try {
                com.tencent.cso.CsoLoader.e("tencentlocsapp");
            } catch (java.lang.Throwable th6) {
                c.t.m.sapp.c.i.a("libtencentloc", th6);
                this.mInitStatus = 3;
                return;
            }
        }
        mContext = context;
        c.t.m.sapp.c.q.a(context, pair);
        c.t.m.sapp.c.e.a(context).c();
        for (int i17 = 0; i17 < 3; i17++) {
            if ((pair != null || (pair2 = mPair) == null) ? a(context, pair, i17) : a(context, pair2, i17)) {
                com.tencent.map.geolocation.sapp.databus.DataBusNativeInterface.init(context);
                return;
            }
        }
    }

    private boolean a(android.content.Context context, android.util.Pair<java.lang.String, java.lang.String> pair, int i17) {
        if (i17 > 0) {
            c.t.m.sapp.c.q.a(c.t.m.sapp.c.q.c(context));
            c.t.m.sapp.c.q.a(c.t.m.sapp.c.q.h(context));
            c.t.m.sapp.c.q.a();
            c.t.m.sapp.c.f.a(context).c();
        }
        try {
            dalvik.system.DexClassLoader a17 = c.t.m.sapp.c.f.a(context).a();
            if (a17 == null) {
                c.t.m.sapp.c.i.a("class loader is null," + i17);
                c.t.m.sapp.c.e.b().a("LMI", "41");
                this.mInitStatus = 4;
                return false;
            }
            java.lang.Class<?> loadClass = a17.loadClass("com.tencent.map.geolocation.sapp.proxy.TencentLocationManagerProxy");
            mProxyClass = loadClass;
            if (pair != null) {
                mProxyObj = loadClass.getConstructor(android.content.Context.class, android.util.Pair.class).newInstance(context, pair);
            } else {
                mProxyObj = loadClass.getConstructor(android.content.Context.class).newInstance(context);
            }
            if (mProxyObj != null) {
                c.t.m.sapp.c.e.b().a("LMI", "0," + i17);
                return true;
            }
            this.mInitStatus = 4;
            c.t.m.sapp.c.i.a("Mgr init failed," + i17);
            c.t.m.sapp.c.e.b().a("LMI", "42," + i17);
            return false;
        } catch (java.lang.Throwable th6) {
            this.mInitStatus = 5;
            c.t.m.sapp.c.i.a("initLocManager", th6);
            c.t.m.sapp.c.e.b().a("LMI", "5" + th6.toString());
            return false;
        }
    }

    public static synchronized com.tencent.map.geolocation.sapp.TencentLocationManager getInstance(android.content.Context context) {
        com.tencent.map.geolocation.sapp.TencentLocationManager tencentLocationManager;
        synchronized (com.tencent.map.geolocation.sapp.TencentLocationManager.class) {
            if (sInstance == null) {
                if (context != null) {
                    if (context.getApplicationContext() != null) {
                        java.lang.System.currentTimeMillis();
                        sInstance = new com.tencent.map.geolocation.sapp.TencentLocationManager(context.getApplicationContext(), null);
                    } else {
                        throw new java.lang.NullPointerException("application context is null");
                    }
                } else {
                    throw new java.lang.NullPointerException("context is null");
                }
            }
            tencentLocationManager = sInstance;
        }
        return tencentLocationManager;
    }

    private static boolean isOtherIdIllegal(java.lang.String str) {
        return str.matches("^[a-z0-9A-Z]{6,32}$");
    }

    public static void setDeviceID(android.util.Pair<java.lang.String, java.lang.String> pair) {
        if (pair == null) {
            throw new java.lang.IllegalArgumentException("deviceID is null!");
        }
        if (!((java.lang.String) pair.first).equals(TYPE_QIMEI) && !((java.lang.String) pair.first).equals(TYPE_OAID) && !isOtherIdIllegal((java.lang.String) pair.first)) {
            throw new java.lang.IllegalArgumentException("your deviceID is illegal!");
        }
        try {
            java.lang.Object obj = pair.first;
            if (obj != null && pair.second != null) {
                if (((java.lang.String) obj).equals(TYPE_QIMEI) || ((java.lang.String) pair.first).equals(TYPE_OAID)) {
                    if (mContext == null) {
                        mPair = pair;
                        return;
                    }
                    java.lang.Class cls = mProxyClass;
                    if (cls != null) {
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("uploadLimeiInfo", android.content.Context.class, android.util.Pair.class);
                        declaredMethod.setAccessible(true);
                        java.lang.Object obj2 = mProxyObj;
                        if (obj2 != null) {
                            declaredMethod.invoke(obj2, mContext, pair);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public java.lang.String getBuild() {
        try {
            return (java.lang.String) mProxyClass.getDeclaredMethod("getBuild", new java.lang.Class[0]).invoke(mProxyObj, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return "error";
        }
    }

    public int getCoordinateType() {
        try {
            return ((java.lang.Integer) mProxyClass.getDeclaredMethod("getCoordinateType", new java.lang.Class[0]).invoke(mProxyObj, new java.lang.Object[0])).intValue();
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public int getIndoorStatus() {
        try {
            return ((java.lang.Integer) mProxyClass.getDeclaredMethod("getIndoorStatus", new java.lang.Class[0]).invoke(mProxyObj, new java.lang.Object[0])).intValue();
        } catch (java.lang.Throwable unused) {
            return -2;
        }
    }

    public com.tencent.map.geolocation.sapp.TencentLocation getLastKnownLocation() {
        try {
            return (com.tencent.map.geolocation.sapp.TencentLocation) mProxyClass.getDeclaredMethod("getLastKnownLocation", new java.lang.Class[0]).invoke(mProxyObj, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public java.lang.String getVersion() {
        try {
            return (java.lang.String) mProxyClass.getDeclaredMethod("getVersion", new java.lang.Class[0]).invoke(mProxyObj, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return "error";
        }
    }

    public void removeUpdates(com.tencent.map.geolocation.sapp.TencentLocationListener tencentLocationListener) {
        synchronized (this.mLock) {
            try {
                mProxyClass.getDeclaredMethod("removeUpdates", com.tencent.map.geolocation.sapp.TencentLocationListener.class).invoke(mProxyObj, tencentLocationListener);
                c.t.m.sapp.c.e.b().d();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public int requestLocationUpdates(com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest, com.tencent.map.geolocation.sapp.TencentLocationListener tencentLocationListener) {
        int i17 = this.mInitStatus;
        if (i17 > 0) {
            return i17;
        }
        try {
            return ((java.lang.Integer) mProxyClass.getDeclaredMethod("requestLocationUpdates", com.tencent.map.geolocation.sapp.TencentLocationRequest.class, com.tencent.map.geolocation.sapp.TencentLocationListener.class).invoke(mProxyObj, tencentLocationRequest, tencentLocationListener)).intValue();
        } catch (java.lang.Throwable th6) {
            c.t.m.sapp.c.i.a("reqLocUpdates error. ", th6);
            return 5;
        }
    }

    public int requestSingleFreshLocation(com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest, com.tencent.map.geolocation.sapp.TencentLocationListener tencentLocationListener, android.os.Looper looper, boolean z17) {
        int intValue;
        if (tencentLocationListener == null) {
            throw new java.lang.NullPointerException("listener is null");
        }
        if (looper != null) {
            int i17 = this.mInitStatus;
            if (i17 > 0) {
                return i17;
            }
            synchronized (this.mLock) {
                try {
                    intValue = ((java.lang.Integer) mProxyClass.getDeclaredMethod("requestSingleFreshLocation", com.tencent.map.geolocation.sapp.TencentLocationRequest.class, com.tencent.map.geolocation.sapp.TencentLocationListener.class, android.os.Looper.class, java.lang.Boolean.TYPE).invoke(mProxyObj, tencentLocationRequest, tencentLocationListener, looper, java.lang.Boolean.valueOf(z17))).intValue();
                } catch (java.lang.Throwable th6) {
                    c.t.m.sapp.c.i.a("reqSigLoc error. ", th6);
                    return 5;
                }
            }
            return intValue;
        }
        throw new java.lang.NullPointerException("looper is null");
    }

    public void setCoordinateType(int i17) {
        try {
            if (i17 != 1 && i17 != 0) {
                throw new java.lang.IllegalArgumentException("unknown coordinate type: " + i17);
            }
            synchronized (this.mLock) {
                try {
                    mProxyClass.getDeclaredMethod("setCoordinateType", java.lang.Integer.TYPE).invoke(mProxyObj, java.lang.Integer.valueOf(i17));
                } catch (java.lang.Throwable unused) {
                }
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    public boolean startIndoorLocation() {
        try {
            return ((java.lang.Boolean) mProxyClass.getDeclaredMethod("startIndoorLocation", new java.lang.Class[0]).invoke(mProxyObj, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public boolean stopIndoorLocation() {
        try {
            return ((java.lang.Boolean) mProxyClass.getDeclaredMethod("stopIndoorLocation", new java.lang.Class[0]).invoke(mProxyObj, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public int requestLocationUpdates(com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest, com.tencent.map.geolocation.sapp.TencentLocationListener tencentLocationListener, android.os.Looper looper) {
        int intValue;
        java.lang.System.currentTimeMillis();
        if (tencentLocationRequest == null) {
            throw new java.lang.NullPointerException("request is null");
        }
        if (tencentLocationListener == null) {
            throw new java.lang.NullPointerException("listener is null");
        }
        if (looper != null) {
            int i17 = this.mInitStatus;
            if (i17 > 0) {
                return i17;
            }
            synchronized (this.mLock) {
                try {
                    java.lang.Integer num = (java.lang.Integer) mProxyClass.getDeclaredMethod("requestLocationUpdates", com.tencent.map.geolocation.sapp.TencentLocationRequest.class, com.tencent.map.geolocation.sapp.TencentLocationListener.class, android.os.Looper.class).invoke(mProxyObj, tencentLocationRequest, tencentLocationListener, looper);
                    c.t.m.sapp.c.e.b().a("RLU", num.toString());
                    intValue = num.intValue();
                } catch (java.lang.Throwable th6) {
                    c.t.m.sapp.c.e.b().a("RLU", "5," + th6.toString());
                    c.t.m.sapp.c.i.a("reqLocUpdates looper error. ", th6);
                    return 5;
                }
            }
            return intValue;
        }
        throw new java.lang.NullPointerException("looper is null");
    }

    public static synchronized com.tencent.map.geolocation.sapp.TencentLocationManager getInstance(android.content.Context context, android.util.Pair<java.lang.String, java.lang.String> pair) {
        com.tencent.map.geolocation.sapp.TencentLocationManager tencentLocationManager;
        synchronized (com.tencent.map.geolocation.sapp.TencentLocationManager.class) {
            if (sInstance == null) {
                if (context != null) {
                    if (context.getApplicationContext() != null) {
                        java.lang.System.currentTimeMillis();
                        sInstance = new com.tencent.map.geolocation.sapp.TencentLocationManager(context.getApplicationContext(), pair);
                    } else {
                        throw new java.lang.NullPointerException("application context is null");
                    }
                } else {
                    throw new java.lang.NullPointerException("context is null");
                }
            }
            tencentLocationManager = sInstance;
        }
        return tencentLocationManager;
    }

    public int requestSingleFreshLocation(com.tencent.map.geolocation.sapp.TencentLocationRequest tencentLocationRequest, com.tencent.map.geolocation.sapp.TencentLocationListener tencentLocationListener, android.os.Looper looper) {
        return requestSingleFreshLocation(tencentLocationRequest, tencentLocationListener, looper, false);
    }
}
