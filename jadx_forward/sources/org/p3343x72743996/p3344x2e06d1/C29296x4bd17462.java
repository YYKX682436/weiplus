package org.p3343x72743996.p3344x2e06d1;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
/* renamed from: org.chromium.base.ContextUtils */
/* loaded from: classes13.dex */
public class C29296x4bd17462 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73249x7118e671 = false;

    /* renamed from: RECEIVER_EXPORTED */
    public static final int f73250xc36107a3 = 2;

    /* renamed from: RECEIVER_NOT_EXPORTED */
    public static final int f73251x55d03baf = 4;
    private static final java.lang.String TAG = "ContextUtils";

    /* renamed from: sApplicationContext */
    private static android.content.Context f73252x2c57d412;

    /* renamed from: org.chromium.base.ContextUtils$Holder */
    /* loaded from: classes13.dex */
    public static class Holder {

        /* renamed from: sSharedPreferences */
        private static android.content.SharedPreferences f73253xaddf6d20 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.a();

        private Holder() {
        }
    }

    public static /* bridge */ /* synthetic */ android.content.SharedPreferences a() {
        return m152346x4fc5f0c();
    }

    /* renamed from: activityFromContext */
    public static android.app.Activity m152344x68f02816(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: clearApplicationContextForTests */
    public static void m152345xce172664() {
        f73252x2c57d412 = null;
        org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.Holder.f73253xaddf6d20 = null;
    }

    /* renamed from: fetchAppSharedPreferences */
    private static android.content.SharedPreferences m152346x4fc5f0c() {
        org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3 m152646x9633ec9a = org.p3343x72743996.p3344x2e06d1.C29366xf526a7e3.m152646x9633ec9a();
        try {
            android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(f73252x2c57d412);
            if (m152646x9633ec9a != null) {
                m152646x9633ec9a.close();
            }
            return defaultSharedPreferences;
        } catch (java.lang.Throwable th6) {
            if (m152646x9633ec9a != null) {
                try {
                    m152646x9633ec9a.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: getAppSharedPreferences */
    public static android.content.SharedPreferences m152347xccd281a8() {
        return org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.Holder.f73253xaddf6d20;
    }

    /* renamed from: getApplicationAssets */
    public static android.content.res.AssetManager m152348x2168b03d() {
        android.content.Context m152349x6e669035 = m152349x6e669035();
        while (m152349x6e669035 instanceof android.content.ContextWrapper) {
            m152349x6e669035 = ((android.content.ContextWrapper) m152349x6e669035).getBaseContext();
        }
        return m152349x6e669035.getAssets();
    }

    /* renamed from: getApplicationContext */
    public static android.content.Context m152349x6e669035() {
        return f73252x2c57d412;
    }

    /* renamed from: getProcessName */
    public static java.lang.String m152350xe5e58464() {
        return org.p3343x72743996.p3344x2e06d1.C29279xa15234bb.m152168xe5e58464();
    }

    /* renamed from: initApplicationContext */
    public static void m152351x91f62b6f(android.content.Context context) {
        m152353xda96bde8(context);
    }

    /* renamed from: initApplicationContextForTests */
    public static void m152352x23051767(android.content.Context context) {
        m152353xda96bde8(context);
        org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.Holder.f73253xaddf6d20 = m152346x4fc5f0c();
    }

    /* renamed from: initJavaSideApplicationContext */
    private static void m152353xda96bde8(android.content.Context context) {
        if (org.p3343x72743996.p3353x59bc66e.C29454xce2ad330.f73669xed5d0f11 && (context instanceof android.app.Application)) {
            context = new android.content.ContextWrapper(context);
        }
        f73252x2c57d412 = context;
    }

    /* renamed from: isIsolatedProcess */
    public static boolean m152354xa9d1348c() {
        return android.os.Process.isIsolated();
    }

    /* renamed from: isProcess64Bit */
    public static boolean m152355x47101eaa() {
        return org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29390xdcec370c.m152803x47101eaa();
    }

    /* renamed from: isSdkSandboxProcess */
    public static boolean m152356x5d82a078() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return android.os.Process.isSdkSandbox();
        }
        return false;
    }

    /* renamed from: registerBroadcastReceiver */
    private static android.content.Intent m152357xb544b16d(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str, android.os.Handler handler, int i17) {
        return android.os.Build.VERSION.SDK_INT >= 26 ? org.p3343x72743996.p3344x2e06d1.p3346xaf3f3382.C29392xdcec370e.m152828xc20729b2(context, broadcastReceiver, intentFilter, str, handler, i17) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    /* renamed from: registerExportedBroadcastReceiver */
    public static android.content.Intent m152358xb625b15a(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, java.lang.String str) {
        return m152357xb544b16d(context, broadcastReceiver, intentFilter, str, null, 2);
    }

    /* renamed from: registerNonExportedBroadcastReceiver */
    public static android.content.Intent m152359x63418b3(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return m152357xb544b16d(context, broadcastReceiver, intentFilter, null, null, 4);
    }

    /* renamed from: registerProtectedBroadcastReceiver */
    public static android.content.Intent m152361xd9ec0c5(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        return m152357xb544b16d(context, broadcastReceiver, intentFilter, null, null, 0);
    }

    /* renamed from: registerNonExportedBroadcastReceiver */
    public static android.content.Intent m152360x63418b3(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, android.os.Handler handler) {
        return m152357xb544b16d(context, broadcastReceiver, intentFilter, null, handler, 4);
    }

    /* renamed from: registerProtectedBroadcastReceiver */
    public static android.content.Intent m152362xd9ec0c5(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter, android.os.Handler handler) {
        return m152357xb544b16d(context, broadcastReceiver, intentFilter, null, handler, 0);
    }
}
