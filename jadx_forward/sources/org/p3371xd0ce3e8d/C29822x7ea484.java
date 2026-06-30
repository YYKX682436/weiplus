package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.NativeLibrary */
/* loaded from: classes13.dex */
class C29822x7ea484 {
    private static java.lang.String TAG = "NativeLibrary";

    /* renamed from: libraryLoaded */
    private static boolean f75587x886488a0;

    /* renamed from: lock */
    private static java.lang.Object f75588x32c52b = new java.lang.Object();

    /* renamed from: org.webrtc.NativeLibrary$DefaultLoader */
    /* loaded from: classes13.dex */
    public static class DefaultLoader implements org.p3371xd0ce3e8d.InterfaceC29823x76a44db7 {

        /* renamed from: _hellAccFlag_ */
        private byte f75589x7f11beae;

        @Override // org.p3371xd0ce3e8d.InterfaceC29823x76a44db7
        /* renamed from: load */
        public boolean mo155802x32c4e6(java.lang.String str) {
            org.p3371xd0ce3e8d.C29806x779f633f.d(org.p3371xd0ce3e8d.C29822x7ea484.TAG, "Loading library: " + str);
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "org/webrtc/NativeLibrary$DefaultLoader", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                yj0.a.f(obj, "org/webrtc/NativeLibrary$DefaultLoader", "load", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                return true;
            } catch (java.lang.UnsatisfiedLinkError e17) {
                org.p3371xd0ce3e8d.C29806x779f633f.e(org.p3371xd0ce3e8d.C29822x7ea484.TAG, "Failed to load native library: " + str, e17);
                return false;
            }
        }
    }

    /* renamed from: initialize */
    public static void m155800x33ebcb90(org.p3371xd0ce3e8d.InterfaceC29823x76a44db7 interfaceC29823x76a44db7, java.lang.String str) {
        synchronized (f75588x32c52b) {
            if (f75587x886488a0) {
                org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Native library has already been loaded.");
                return;
            }
            org.p3371xd0ce3e8d.C29806x779f633f.d(TAG, "Loading native library: " + str);
            f75587x886488a0 = interfaceC29823x76a44db7.mo155802x32c4e6(str);
        }
    }

    /* renamed from: isLoaded */
    public static boolean m155801xe6c221cf() {
        boolean z17;
        synchronized (f75588x32c52b) {
            z17 = f75587x886488a0;
        }
        return z17;
    }
}
