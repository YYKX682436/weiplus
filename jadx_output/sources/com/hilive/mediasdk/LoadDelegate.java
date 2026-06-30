package com.hilive.mediasdk;

/* loaded from: classes7.dex */
public class LoadDelegate {
    private static final java.lang.String TAG = "[hilive][java]";
    private static com.hilive.mediasdk.LoadDelegate.ILoadLibrary sInstance = new com.hilive.mediasdk.LoadDelegate.ILoadLibrary() { // from class: com.hilive.mediasdk.LoadDelegate.1
        private byte _hellAccFlag_;

        private boolean loadSo(java.lang.String str) {
            for (int i17 = 0; i17 < 3; i17++) {
                try {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(str);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/hilive/mediasdk/LoadDelegate$1", "loadSo", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/hilive/mediasdk/LoadDelegate$1", "loadSo", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.hilive.mediasdk.LogDelegate.i(com.hilive.mediasdk.LoadDelegate.TAG, "loadSo " + str + " success!", new java.lang.Object[0]);
                    return true;
                } catch (java.lang.NullPointerException e17) {
                    com.hilive.mediasdk.LogDelegate.e(com.hilive.mediasdk.LoadDelegate.TAG, "loadSo " + str + " failed NullPointerException " + (e17.getMessage() == null ? "null" : e17.getMessage()), new java.lang.Object[0]);
                } catch (java.lang.SecurityException e18) {
                    com.hilive.mediasdk.LogDelegate.e(com.hilive.mediasdk.LoadDelegate.TAG, "loadSo " + str + " failed SecurityException " + (e18.getMessage() == null ? "null" : e18.getMessage()), new java.lang.Object[0]);
                } catch (java.lang.UnsatisfiedLinkError e19) {
                    com.hilive.mediasdk.LogDelegate.e(com.hilive.mediasdk.LoadDelegate.TAG, "loadSo " + str + " failed UnsatisfiedLinkError " + (e19.getMessage() == null ? "null" : e19.getMessage()), new java.lang.Object[0]);
                } catch (java.lang.Throwable th6) {
                    com.hilive.mediasdk.LogDelegate.printStackTrace(com.hilive.mediasdk.LoadDelegate.TAG, th6, "loadSo", new java.lang.Object[0]);
                }
            }
            return false;
        }

        @Override // com.hilive.mediasdk.LoadDelegate.ILoadLibrary
        public void loadLibrary(java.lang.String str, java.lang.ClassLoader classLoader) {
        }

        @Override // com.hilive.mediasdk.LoadDelegate.ILoadLibrary
        public void loadLibrary(java.lang.String str) {
            loadSo(str);
        }
    };
    private static boolean sLibraryLoaded;

    /* loaded from: classes7.dex */
    public interface ILoadLibrary {
        void loadLibrary(java.lang.String str);

        void loadLibrary(java.lang.String str, java.lang.ClassLoader classLoader);
    }

    public static void loadLibraries() {
        if (sLibraryLoaded) {
            return;
        }
        sInstance.loadLibrary("c++_shared");
        sInstance.loadLibrary("wxVcodec1");
        sInstance.loadLibrary("xffmpeg");
        sInstance.loadLibrary("mmmediasdk");
    }

    public static void loadLibrary(java.lang.String str) {
        sInstance.loadLibrary(str);
    }

    public static void setInstance(com.hilive.mediasdk.LoadDelegate.ILoadLibrary iLoadLibrary) {
        if (iLoadLibrary != null) {
            sInstance = iLoadLibrary;
        }
    }

    public static void loadLibrary(java.lang.String str, java.lang.ClassLoader classLoader) {
        sInstance.loadLibrary(str, classLoader);
    }
}
