package com.tencent.liteav.base.util;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f46462a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f46463b = false;

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f46464c = "";
    private byte _hellAccFlag_;

    public static boolean a() {
        boolean z17;
        synchronized (f46462a) {
            if (!f46463b) {
                "load library txsoundtouch ".concat(java.lang.String.valueOf(b("txsoundtouch")));
                b(android.text.TextUtils.isEmpty("xffmpeg") ? "txffmpeg" : "xffmpeg");
                f46463b = b("liteavsdk");
            }
            z17 = f46463b;
        }
        return z17;
    }

    private static boolean b(java.lang.String str) {
        try {
            if (!android.text.TextUtils.isEmpty(f46464c) ? a(f46464c, str) : false) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/liteav/base/util/q", "b", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
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
            com.tencent.cso.CsoLoader.g(str + "/lib" + str2 + ".so");
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
        f46464c = str;
    }
}
