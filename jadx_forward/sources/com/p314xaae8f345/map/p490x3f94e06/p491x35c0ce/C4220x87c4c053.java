package com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce;

/* renamed from: com.tencent.map.geolocation.sapp.TencentLocationManager */
/* loaded from: classes13.dex */
public final class C4220x87c4c053 {

    /* renamed from: COORDINATE_TYPE_GCJ02 */
    public static final int f16239x585c0552 = 1;

    /* renamed from: COORDINATE_TYPE_WGS84 */
    public static final int f16240x593f71a1 = 0;

    /* renamed from: DEBUG */
    private static final boolean f16241x3de9e33 = false;
    private static final java.lang.String TAG = "TencentLocationManager";

    /* renamed from: TYPE_OAID */
    public static final java.lang.String f16242xc6cd8c52 = "oaId";

    /* renamed from: TYPE_QIMEI */
    public static final java.lang.String f16243x1303df54 = "qImei";

    /* renamed from: mContext */
    private static android.content.Context f16244xd6cfe882;

    /* renamed from: mPair */
    private static android.util.Pair<java.lang.String, java.lang.String> f16245x625d8e7;

    /* renamed from: mProxyClass */
    private static java.lang.Class f16246x6bb83bf7;

    /* renamed from: mProxyObj */
    private static java.lang.Object f16247xea44d336;

    /* renamed from: sInstance */
    private static com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053 f16248xbfaed628;

    /* renamed from: mInitStatus */
    private int f16249xeb9a0d6f;

    /* renamed from: mLock */
    private final byte[] f16250x6243b38 = new byte[0];

    private C4220x87c4c053(android.content.Context context, android.util.Pair<java.lang.String, java.lang.String> pair) {
        android.util.Pair<java.lang.String, java.lang.String> pair2;
        this.f16249xeb9a0d6f = 0;
        if (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4221x9c23eacb.m34933x204ddf56()) {
            try {
                com.p314xaae8f345.cso.C2941xefde02d2.e("tencentlocsapp");
            } catch (java.lang.Throwable th6) {
                c.t.m.p134x35c0ce.c.i.a("libtencentloc", th6);
                this.f16249xeb9a0d6f = 3;
                return;
            }
        }
        f16244xd6cfe882 = context;
        c.t.m.p134x35c0ce.c.q.a(context, pair);
        c.t.m.p134x35c0ce.c.e.a(context).c();
        for (int i17 = 0; i17 < 3; i17++) {
            if ((pair != null || (pair2 = f16245x625d8e7) == null) ? a(context, pair, i17) : a(context, pair2, i17)) {
                com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p492x56057696.C4226xd0f51ac.m34983x316510(context);
                return;
            }
        }
    }

    private boolean a(android.content.Context context, android.util.Pair<java.lang.String, java.lang.String> pair, int i17) {
        if (i17 > 0) {
            c.t.m.p134x35c0ce.c.q.a(c.t.m.p134x35c0ce.c.q.c(context));
            c.t.m.p134x35c0ce.c.q.a(c.t.m.p134x35c0ce.c.q.h(context));
            c.t.m.p134x35c0ce.c.q.a();
            c.t.m.p134x35c0ce.c.f.a(context).c();
        }
        try {
            dalvik.system.DexClassLoader a17 = c.t.m.p134x35c0ce.c.f.a(context).a();
            if (a17 == null) {
                c.t.m.p134x35c0ce.c.i.a("class loader is null," + i17);
                c.t.m.p134x35c0ce.c.e.b().a("LMI", "41");
                this.f16249xeb9a0d6f = 4;
                return false;
            }
            java.lang.Class<?> loadClass = a17.loadClass("com.tencent.map.geolocation.sapp.proxy.TencentLocationManagerProxy");
            f16246x6bb83bf7 = loadClass;
            if (pair != null) {
                f16247xea44d336 = loadClass.getConstructor(android.content.Context.class, android.util.Pair.class).newInstance(context, pair);
            } else {
                f16247xea44d336 = loadClass.getConstructor(android.content.Context.class).newInstance(context);
            }
            if (f16247xea44d336 != null) {
                c.t.m.p134x35c0ce.c.e.b().a("LMI", "0," + i17);
                return true;
            }
            this.f16249xeb9a0d6f = 4;
            c.t.m.p134x35c0ce.c.i.a("Mgr init failed," + i17);
            c.t.m.p134x35c0ce.c.e.b().a("LMI", "42," + i17);
            return false;
        } catch (java.lang.Throwable th6) {
            this.f16249xeb9a0d6f = 5;
            c.t.m.p134x35c0ce.c.i.a("initLocManager", th6);
            c.t.m.p134x35c0ce.c.e.b().a("LMI", "5" + th6.toString());
            return false;
        }
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053 m34915x9cf0d20b(android.content.Context context) {
        com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053 c4220x87c4c053;
        synchronized (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.class) {
            if (f16248xbfaed628 == null) {
                if (context != null) {
                    if (context.getApplicationContext() != null) {
                        java.lang.System.currentTimeMillis();
                        f16248xbfaed628 = new com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053(context.getApplicationContext(), null);
                    } else {
                        throw new java.lang.NullPointerException("application context is null");
                    }
                } else {
                    throw new java.lang.NullPointerException("context is null");
                }
            }
            c4220x87c4c053 = f16248xbfaed628;
        }
        return c4220x87c4c053;
    }

    /* renamed from: isOtherIdIllegal */
    private static boolean m34917xffdbd475(java.lang.String str) {
        return str.matches("^[a-z0-9A-Z]{6,32}$");
    }

    /* renamed from: setDeviceID */
    public static void m34918xb8af8873(android.util.Pair<java.lang.String, java.lang.String> pair) {
        if (pair == null) {
            throw new java.lang.IllegalArgumentException("deviceID is null!");
        }
        if (!((java.lang.String) pair.first).equals(f16243x1303df54) && !((java.lang.String) pair.first).equals(f16242xc6cd8c52) && !m34917xffdbd475((java.lang.String) pair.first)) {
            throw new java.lang.IllegalArgumentException("your deviceID is illegal!");
        }
        try {
            java.lang.Object obj = pair.first;
            if (obj != null && pair.second != null) {
                if (((java.lang.String) obj).equals(f16243x1303df54) || ((java.lang.String) pair.first).equals(f16242xc6cd8c52)) {
                    if (f16244xd6cfe882 == null) {
                        f16245x625d8e7 = pair;
                        return;
                    }
                    java.lang.Class cls = f16246x6bb83bf7;
                    if (cls != null) {
                        java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("uploadLimeiInfo", android.content.Context.class, android.util.Pair.class);
                        declaredMethod.setAccessible(true);
                        java.lang.Object obj2 = f16247xea44d336;
                        if (obj2 != null) {
                            declaredMethod.invoke(obj2, f16244xd6cfe882, pair);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* renamed from: getBuild */
    public java.lang.String m34919x74396cb8() {
        try {
            return (java.lang.String) f16246x6bb83bf7.getDeclaredMethod("getBuild", new java.lang.Class[0]).invoke(f16247xea44d336, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return "error";
        }
    }

    /* renamed from: getCoordinateType */
    public int m34920xc73c9c8() {
        try {
            return ((java.lang.Integer) f16246x6bb83bf7.getDeclaredMethod("getCoordinateType", new java.lang.Class[0]).invoke(f16247xea44d336, new java.lang.Object[0])).intValue();
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    /* renamed from: getIndoorStatus */
    public int m34921x66cc1a9b() {
        try {
            return ((java.lang.Integer) f16246x6bb83bf7.getDeclaredMethod("getIndoorStatus", new java.lang.Class[0]).invoke(f16247xea44d336, new java.lang.Object[0])).intValue();
        } catch (java.lang.Throwable unused) {
            return -2;
        }
    }

    /* renamed from: getLastKnownLocation */
    public com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa m34922xffca1c6c() {
        try {
            return (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa) f16246x6bb83bf7.getDeclaredMethod("getLastKnownLocation", new java.lang.Class[0]).invoke(f16247xea44d336, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: getVersion */
    public java.lang.String m34923x52c258a2() {
        try {
            return (java.lang.String) f16246x6bb83bf7.getDeclaredMethod("getVersion", new java.lang.Class[0]).invoke(f16247xea44d336, new java.lang.Object[0]);
        } catch (java.lang.Throwable unused) {
            return "error";
        }
    }

    /* renamed from: removeUpdates */
    public void m34924x3948a3a6(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce interfaceC4219xb9b728ce) {
        synchronized (this.f16250x6243b38) {
            try {
                f16246x6bb83bf7.getDeclaredMethod("removeUpdates", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce.class).invoke(f16247xea44d336, interfaceC4219xb9b728ce);
                c.t.m.p134x35c0ce.c.e.b().d();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    /* renamed from: requestLocationUpdates */
    public int m34925xcbe028c6(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa335, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce interfaceC4219xb9b728ce) {
        int i17 = this.f16249xeb9a0d6f;
        if (i17 > 0) {
            return i17;
        }
        try {
            return ((java.lang.Integer) f16246x6bb83bf7.getDeclaredMethod("requestLocationUpdates", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335.class, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce.class).invoke(f16247xea44d336, c4222x974aa335, interfaceC4219xb9b728ce)).intValue();
        } catch (java.lang.Throwable th6) {
            c.t.m.p134x35c0ce.c.i.a("reqLocUpdates error. ", th6);
            return 5;
        }
    }

    /* renamed from: requestSingleFreshLocation */
    public int m34928x5eefe48c(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa335, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce interfaceC4219xb9b728ce, android.os.Looper looper, boolean z17) {
        int intValue;
        if (interfaceC4219xb9b728ce == null) {
            throw new java.lang.NullPointerException("listener is null");
        }
        if (looper != null) {
            int i17 = this.f16249xeb9a0d6f;
            if (i17 > 0) {
                return i17;
            }
            synchronized (this.f16250x6243b38) {
                try {
                    intValue = ((java.lang.Integer) f16246x6bb83bf7.getDeclaredMethod("requestSingleFreshLocation", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335.class, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce.class, android.os.Looper.class, java.lang.Boolean.TYPE).invoke(f16247xea44d336, c4222x974aa335, interfaceC4219xb9b728ce, looper, java.lang.Boolean.valueOf(z17))).intValue();
                } catch (java.lang.Throwable th6) {
                    c.t.m.p134x35c0ce.c.i.a("reqSigLoc error. ", th6);
                    return 5;
                }
            }
            return intValue;
        }
        throw new java.lang.NullPointerException("looper is null");
    }

    /* renamed from: setCoordinateType */
    public void m34929xd46a31d4(int i17) {
        try {
            if (i17 != 1 && i17 != 0) {
                throw new java.lang.IllegalArgumentException("unknown coordinate type: " + i17);
            }
            synchronized (this.f16250x6243b38) {
                try {
                    f16246x6bb83bf7.getDeclaredMethod("setCoordinateType", java.lang.Integer.TYPE).invoke(f16247xea44d336, java.lang.Integer.valueOf(i17));
                } catch (java.lang.Throwable unused) {
                }
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    /* renamed from: startIndoorLocation */
    public boolean m34930xcf7542a() {
        try {
            return ((java.lang.Boolean) f16246x6bb83bf7.getDeclaredMethod("startIndoorLocation", new java.lang.Class[0]).invoke(f16247xea44d336, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: stopIndoorLocation */
    public boolean m34931xd553bfca() {
        try {
            return ((java.lang.Boolean) f16246x6bb83bf7.getDeclaredMethod("stopIndoorLocation", new java.lang.Class[0]).invoke(f16247xea44d336, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: requestLocationUpdates */
    public int m34926xcbe028c6(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa335, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce interfaceC4219xb9b728ce, android.os.Looper looper) {
        int intValue;
        java.lang.System.currentTimeMillis();
        if (c4222x974aa335 == null) {
            throw new java.lang.NullPointerException("request is null");
        }
        if (interfaceC4219xb9b728ce == null) {
            throw new java.lang.NullPointerException("listener is null");
        }
        if (looper != null) {
            int i17 = this.f16249xeb9a0d6f;
            if (i17 > 0) {
                return i17;
            }
            synchronized (this.f16250x6243b38) {
                try {
                    java.lang.Integer num = (java.lang.Integer) f16246x6bb83bf7.getDeclaredMethod("requestLocationUpdates", com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335.class, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce.class, android.os.Looper.class).invoke(f16247xea44d336, c4222x974aa335, interfaceC4219xb9b728ce, looper);
                    c.t.m.p134x35c0ce.c.e.b().a("RLU", num.toString());
                    intValue = num.intValue();
                } catch (java.lang.Throwable th6) {
                    c.t.m.p134x35c0ce.c.e.b().a("RLU", "5," + th6.toString());
                    c.t.m.p134x35c0ce.c.i.a("reqLocUpdates looper error. ", th6);
                    return 5;
                }
            }
            return intValue;
        }
        throw new java.lang.NullPointerException("looper is null");
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053 m34916x9cf0d20b(android.content.Context context, android.util.Pair<java.lang.String, java.lang.String> pair) {
        com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053 c4220x87c4c053;
        synchronized (com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053.class) {
            if (f16248xbfaed628 == null) {
                if (context != null) {
                    if (context.getApplicationContext() != null) {
                        java.lang.System.currentTimeMillis();
                        f16248xbfaed628 = new com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4220x87c4c053(context.getApplicationContext(), pair);
                    } else {
                        throw new java.lang.NullPointerException("application context is null");
                    }
                } else {
                    throw new java.lang.NullPointerException("context is null");
                }
            }
            c4220x87c4c053 = f16248xbfaed628;
        }
        return c4220x87c4c053;
    }

    /* renamed from: requestSingleFreshLocation */
    public int m34927x5eefe48c(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4222x974aa335 c4222x974aa335, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4219xb9b728ce interfaceC4219xb9b728ce, android.os.Looper looper) {
        return m34928x5eefe48c(c4222x974aa335, interfaceC4219xb9b728ce, looper, false);
    }
}
