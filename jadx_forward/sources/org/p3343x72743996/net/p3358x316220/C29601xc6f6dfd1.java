package org.p3343x72743996.net.p3358x316220;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "cronet")
/* renamed from: org.chromium.net.impl.CronetLibraryLoader */
/* loaded from: classes13.dex */
public class C29601xc6f6dfd1 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f74552x7118e671 = false;

    /* renamed from: LOG_FLAG_NAME */
    public static final java.lang.String f74554x6ff27c23 = "Cronet_log_me";

    /* renamed from: sHttpFlags */
    private static org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f f74555x3dc3fbac;

    /* renamed from: sInitThreadInitDone */
    private static volatile boolean f74558x121a77df;

    /* renamed from: sLibraryLoaded */
    private static volatile boolean f74559x2ea54aed;

    /* renamed from: _hellAccFlag_ */
    private byte f74562x7f11beae;

    /* renamed from: sLoadLock */
    private static final java.lang.Object f74560xc965cc4 = new java.lang.Object();

    /* renamed from: LIBRARY_NAME */
    private static final java.lang.String f74553x25f8a3af = "cronet." + org.p3343x72743996.net.p3358x316220.C29616xa1995678.m154243xf714d6a5();
    public static final java.lang.String TAG = "CronetLibraryLoader";

    /* renamed from: sInitThread */
    private static final android.os.HandlerThread f74557x6a097c0d = new android.os.HandlerThread("CronetInit");

    /* renamed from: sWaitForLibLoad */
    private static final android.os.ConditionVariable f74561xe42a3eaa = new android.os.ConditionVariable();

    /* renamed from: sHttpFlagsLoaded */
    private static final android.os.ConditionVariable f74556x6e45a6d1 = new android.os.ConditionVariable();

    /* renamed from: org.chromium.net.impl.CronetLibraryLoader$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: cronetInitOnInitThread */
        void mo154085x1257d986();

        /* renamed from: getCronetVersion */
        java.lang.String mo154086xf714d6a5();

        /* renamed from: setMinLogLevel */
        void mo154087x37f1c550(int i17);
    }

    /* renamed from: ensureInitialized */
    public static void m154074x44063fb6(android.content.Context context, org.p3343x72743996.net.p3358x316220.AbstractC29599x8a199e5c abstractC29599x8a199e5c) {
        synchronized (f74560xc965cc4) {
            if (!f74558x121a77df) {
                org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152351x91f62b6f(context);
                android.os.HandlerThread handlerThread = f74557x6a097c0d;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                m154082xccb59cd5(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetLibraryLoader.2
                    @Override // java.lang.Runnable
                    public void run() {
                        org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154076x1c2a654f();
                    }
                });
            }
            if (!f74559x2ea54aed) {
                if (abstractC29599x8a199e5c.mo154053x886488ae() != null) {
                    abstractC29599x8a199e5c.mo154053x886488ae().mo153193xeb57c8f5(f74553x25f8a3af);
                } else {
                    java.lang.String str = f74553x25f8a3af;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "org/chromium/net/impl/CronetLibraryLoader", "ensureInitialized", "(Landroid/content/Context;Lorg/chromium/net/impl/CronetEngineBuilderImpl;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "org/chromium/net/impl/CronetLibraryLoader", "ensureInitialized", "(Landroid/content/Context;Lorg/chromium/net/impl/CronetEngineBuilderImpl;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                }
                java.lang.String m154243xf714d6a5 = org.p3343x72743996.net.p3358x316220.C29616xa1995678.m154243xf714d6a5();
                if (!m154243xf714d6a5.equals(org.p3343x72743996.net.p3358x316220.C29602xb308e614.get().mo154086xf714d6a5())) {
                    throw new java.lang.RuntimeException(java.lang.String.format("Expected Cronet version number %s, actual version number %s.", m154243xf714d6a5, org.p3343x72743996.net.p3358x316220.C29602xb308e614.get().mo154086xf714d6a5()));
                }
                org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "Cronet version: %s, arch: %s", m154243xf714d6a5, java.lang.System.getProperty("os.arch"));
                m154083xcbfe411e();
                f74559x2ea54aed = true;
                f74561xe42a3eaa.open();
            }
        }
    }

    /* renamed from: ensureInitializedFromNative */
    private static void m154075x84f9dcb7() {
        synchronized (f74560xc965cc4) {
            f74559x2ea54aed = true;
            f74561xe42a3eaa.open();
        }
    }

    /* renamed from: ensureInitializedOnInitThread */
    public static void m154076x1c2a654f() {
        if (f74558x121a77df) {
            return;
        }
        android.content.Context m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035();
        org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67 m153987x32c4e6 = org.p3343x72743996.net.p3357xb16faff.C29590x19befbb2.m153987x32c4e6(m152349x6e669035);
        if (m153987x32c4e6 == null) {
            m153987x32c4e6 = (org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67) org.p3343x72743996.net.p3357xb16faff.C29587x40cfe67.m153957x3136c9db().mo20556x59bc66e();
        }
        f74555x3dc3fbac = org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.m153990x416881ec(m153987x32c4e6, m152349x6e669035.getPackageName(), org.p3343x72743996.net.p3358x316220.C29616xa1995678.m154243xf714d6a5());
        f74556x6e45a6d1.open();
        org.p3343x72743996.net.p3357xb16faff.C29591x39d32d4f.Value value = f74555x3dc3fbac.m153991x5cfee87().get(f74554x6ff27c23);
        if (value != null) {
            org.p3343x72743996.p3344x2e06d1.Log.i(TAG, "HTTP flags log line: %s", value.m154001x7f48eaaa());
        }
        org.p3343x72743996.net.C29529xd78a8f24.m153329x316510();
        org.p3343x72743996.net.C29529xd78a8f24.m153333xf196e852();
        f74561xe42a3eaa.block();
        org.p3343x72743996.net.p3358x316220.C29602xb308e614.get().mo154085x1257d986();
        f74558x121a77df = true;
    }

    /* renamed from: getBaseFeatureOverrides */
    private static byte[] m154077xaf783d38() {
        f74556x6e45a6d1.block();
        return org.p3343x72743996.net.p3357xb16faff.C29581xb23996c5.m153762xd2b9cf71(f74555x3dc3fbac).mo20648x5f01b1f6();
    }

    /* renamed from: getDefaultUserAgent */
    private static java.lang.String m154078x265d382f() {
        return org.p3343x72743996.net.p3358x316220.C29633x8a022dda.m154267x3017aa(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035());
    }

    /* renamed from: initCronetInJavaWithoutLoadSo */
    public static void m154079x91d910f6(android.content.Context context) {
        synchronized (f74560xc965cc4) {
            if (!f74558x121a77df) {
                org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152351x91f62b6f(context);
                android.os.HandlerThread handlerThread = f74557x6a097c0d;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                m154082xccb59cd5(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetLibraryLoader.1
                    @Override // java.lang.Runnable
                    public void run() {
                        org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154076x1c2a654f();
                    }
                });
            }
        }
    }

    /* renamed from: libraryName */
    public static java.lang.String m154080xdba63de6() {
        return f74553x25f8a3af;
    }

    /* renamed from: onInitThread */
    private static boolean m154081xd798b279() {
        return f74557x6a097c0d.getLooper() == android.os.Looper.myLooper();
    }

    /* renamed from: postToInitThread */
    public static void m154082xccb59cd5(java.lang.Runnable runnable) {
        if (m154081xd798b279()) {
            runnable.run();
        } else {
            new android.os.Handler(f74557x6a097c0d.getLooper()).post(runnable);
        }
    }

    /* renamed from: setNativeLoggingLevel */
    private static void m154083xcbfe411e() {
        int i17;
        if (org.p3343x72743996.p3344x2e06d1.Log.m152499x492678c7("chromium", 2)) {
            i17 = -2;
        } else if (!org.p3343x72743996.p3344x2e06d1.Log.m152499x492678c7("chromium", 3)) {
            return;
        } else {
            i17 = -1;
        }
        org.p3343x72743996.net.p3358x316220.C29602xb308e614.get().mo154087x37f1c550(i17);
    }

    /* renamed from: setNetworkThreadPriorityOnNetworkThread */
    private static void m154084x6afb127f(int i17) {
        android.os.Process.setThreadPriority(i17);
    }
}
