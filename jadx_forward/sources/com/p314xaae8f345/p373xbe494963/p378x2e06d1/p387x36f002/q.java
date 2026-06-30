package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f127995a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f127996b = false;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f127997c = "";

    /* renamed from: _hellAccFlag_ */
    private byte f14774x7f11beae;

    public static boolean a() {
        boolean z17;
        synchronized (f127995a) {
            if (!f127996b) {
                "load library txsoundtouch ".concat(java.lang.String.valueOf(b("txsoundtouch")));
                b(android.text.TextUtils.isEmpty("xffmpeg") ? "txffmpeg" : "xffmpeg");
                f127996b = b("liteavsdk");
            }
            z17 = f127996b;
        }
        return z17;
    }

    private static boolean b(java.lang.String str) {
        try {
            if (!android.text.TextUtils.isEmpty(f127997c) ? a(f127997c, str) : false) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/liteav/base/util/q", "b", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/liteav/base/util/q", "b", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return true;
        } catch (java.lang.Error e17) {
            e17.toString();
            return false;
        } catch (java.lang.Exception e18) {
            e18.toString();
            return false;
        }
    }

    private static boolean a(java.lang.String str, java.lang.String str2) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            com.p314xaae8f345.cso.C2941xefde02d2.g(str + "/lib" + str2 + ".so");
            return true;
        } catch (java.lang.Error e17) {
            e17.toString();
            return false;
        } catch (java.lang.Exception e18) {
            e18.toString();
            return false;
        }
    }

    public static void a(java.lang.String str) {
        "setLibraryPath ".concat(java.lang.String.valueOf(str));
        f127997c = str;
    }
}
