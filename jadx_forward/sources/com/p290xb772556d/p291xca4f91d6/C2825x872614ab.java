package com.p290xb772556d.p291xca4f91d6;

/* renamed from: com.hilive.mediasdk.LoadDelegate */
/* loaded from: classes7.dex */
public class C2825x872614ab {
    private static final java.lang.String TAG = "[hilive][java]";

    /* renamed from: sInstance */
    private static com.p290xb772556d.p291xca4f91d6.C2825x872614ab.ILoadLibrary f9488xbfaed628 = new com.p290xb772556d.p291xca4f91d6.C2825x872614ab.ILoadLibrary() { // from class: com.hilive.mediasdk.LoadDelegate.1

        /* renamed from: _hellAccFlag_ */
        private byte f9490x7f11beae;

        /* renamed from: loadSo */
        private boolean m21001xbe952de2(java.lang.String str) {
            for (int i17 = 0; i17 < 3; i17++) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/hilive/mediasdk/LoadDelegate$1", "loadSo", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/hilive/mediasdk/LoadDelegate$1", "loadSo", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.i(com.p290xb772556d.p291xca4f91d6.C2825x872614ab.TAG, "loadSo " + str + " success!", new java.lang.Object[0]);
                    return true;
                } catch (java.lang.NullPointerException e17) {
                    com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(com.p290xb772556d.p291xca4f91d6.C2825x872614ab.TAG, "loadSo " + str + " failed NullPointerException " + (e17.getMessage() == null ? "null" : e17.getMessage()), new java.lang.Object[0]);
                } catch (java.lang.SecurityException e18) {
                    com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(com.p290xb772556d.p291xca4f91d6.C2825x872614ab.TAG, "loadSo " + str + " failed SecurityException " + (e18.getMessage() == null ? "null" : e18.getMessage()), new java.lang.Object[0]);
                } catch (java.lang.UnsatisfiedLinkError e19) {
                    com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.e(com.p290xb772556d.p291xca4f91d6.C2825x872614ab.TAG, "loadSo " + str + " failed UnsatisfiedLinkError " + (e19.getMessage() == null ? "null" : e19.getMessage()), new java.lang.Object[0]);
                } catch (java.lang.Throwable th6) {
                    com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.m21005x6e0e6e2a(com.p290xb772556d.p291xca4f91d6.C2825x872614ab.TAG, th6, "loadSo", new java.lang.Object[0]);
                }
            }
            return false;
        }

        @Override // com.p290xb772556d.p291xca4f91d6.C2825x872614ab.ILoadLibrary
        /* renamed from: loadLibrary */
        public void mo21003xeb57c8f5(java.lang.String str, java.lang.ClassLoader classLoader) {
        }

        @Override // com.p290xb772556d.p291xca4f91d6.C2825x872614ab.ILoadLibrary
        /* renamed from: loadLibrary */
        public void mo21002xeb57c8f5(java.lang.String str) {
            m21001xbe952de2(str);
        }
    };

    /* renamed from: sLibraryLoaded */
    private static boolean f9489x2ea54aed;

    /* renamed from: com.hilive.mediasdk.LoadDelegate$ILoadLibrary */
    /* loaded from: classes7.dex */
    public interface ILoadLibrary {
        /* renamed from: loadLibrary */
        void mo21002xeb57c8f5(java.lang.String str);

        /* renamed from: loadLibrary */
        void mo21003xeb57c8f5(java.lang.String str, java.lang.ClassLoader classLoader);
    }

    /* renamed from: loadLibraries */
    public static void m20997x74893053() {
        if (f9489x2ea54aed) {
            return;
        }
        f9488xbfaed628.mo21002xeb57c8f5("c++_shared");
        f9488xbfaed628.mo21002xeb57c8f5("wxVcodec1");
        f9488xbfaed628.mo21002xeb57c8f5("xffmpeg");
        f9488xbfaed628.mo21002xeb57c8f5("mmmediasdk");
    }

    /* renamed from: loadLibrary */
    public static void m20998xeb57c8f5(java.lang.String str) {
        f9488xbfaed628.mo21002xeb57c8f5(str);
    }

    /* renamed from: setInstance */
    public static void m21000x97a93317(com.p290xb772556d.p291xca4f91d6.C2825x872614ab.ILoadLibrary iLoadLibrary) {
        if (iLoadLibrary != null) {
            f9488xbfaed628 = iLoadLibrary;
        }
    }

    /* renamed from: loadLibrary */
    public static void m20999xeb57c8f5(java.lang.String str, java.lang.ClassLoader classLoader) {
        f9488xbfaed628.mo21003xeb57c8f5(str, classLoader);
    }
}
