package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.FdCrashHandlerHost */
/* loaded from: classes12.dex */
public final class C25539xe69822e9 {

    /* renamed from: logger */
    private static final com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 f46699xbe97f590 = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25509x39e6a13a.m94647x23af1886("WVA.FdCrashHandlerHost");

    /* renamed from: mJavaDumpPath */
    private static java.lang.String f46700x7eecdd88;

    /* renamed from: mNativeDumpPath */
    private static java.lang.String f46701xa024af3d;

    /* renamed from: getJavaDumpFd */
    public static android.os.ParcelFileDescriptor m95573xaa4c428a() {
        try {
            return android.os.ParcelFileDescriptor.open(new java.io.File(f46700x7eecdd88), 939524096);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: getNativeDumpFd */
    public static android.os.ParcelFileDescriptor m95574xd695b73f() {
        try {
            return android.os.ParcelFileDescriptor.open(new java.io.File(f46701xa024af3d), 939524096);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: init */
    public static void m95575x316510(java.lang.String str, java.lang.String str2) {
        f46699xbe97f590.mo46953x3164ae("initCrashHandlerByFd path init: javaPath=" + str + ", nativePath=" + str2);
        f46700x7eecdd88 = str;
        f46701xa024af3d = str2;
    }

    /* renamed from: isInitialized */
    public static boolean m95576xf582434a() {
        return (f46700x7eecdd88 == null || f46701xa024af3d == null) ? false : true;
    }
}
