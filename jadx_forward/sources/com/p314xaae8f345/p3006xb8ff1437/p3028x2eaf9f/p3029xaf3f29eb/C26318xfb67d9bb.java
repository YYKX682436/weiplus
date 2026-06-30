package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPNativeLibraryLoader */
/* loaded from: classes13.dex */
public class C26318xfb67d9bb {

    /* renamed from: DEFAULT_LIB_PLAYER_CORE_VERSION */
    private static final java.lang.String f52274xd10d9bbe = "2.33.0.1025.wechat";

    /* renamed from: MAIN_PLAYER_CORE_VERSION */
    private static final java.lang.String f52275x5e682d30 = "2.33.0";

    /* renamed from: mIsLibLoaded */
    private static boolean f52276xe0a15a33 = false;

    /* renamed from: mIsLibLoadedLock */
    private static java.lang.Object f52277x9f5741fe = new java.lang.Object();

    /* renamed from: mIsNeedLoadThirdPartiesAndFFmpeg */
    private static final boolean f52278x3fddf04c = true;

    /* renamed from: mLibFFmpegPrefix */
    private static final java.lang.String f52279x3023300f = "xffmpeg";

    /* renamed from: mLibLoader */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26281xce6dadbd f52280x6b0e510b = null;

    /* renamed from: mLibNameHasArchSuffix */
    private static final boolean f52281x53be94be = false;

    /* renamed from: mLibPlayerCorePrefix */
    private static final java.lang.String f52282x265f37ca = "TPCore-master";

    /* renamed from: mLibThirdPartiesPrefix */
    private static final java.lang.String f52283x59af2c87 = "TPThirdParties-master";

    /* renamed from: mLibXFFmpegEnabled */
    private static final boolean f52284x1964c0bc = true;

    /* renamed from: mPlayerCoreSupportMinAndroidAPILevel */
    private static final int f52285x557ec0a9 = 14;

    /* renamed from: _hellAccFlag_ */
    private byte f52286x7f11beae;

    /* renamed from: _getPlayerCoreVersion */
    private static native java.lang.String m101874x26c7ccc1();

    /* renamed from: getLibVersion */
    public static java.lang.String m101875x9aeda89() {
        return m101876x7a04b1e2();
    }

    /* renamed from: getPlayerCoreVersion */
    public static java.lang.String m101876x7a04b1e2() {
        try {
            return m101874x26c7ccc1();
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "getPlayerCoreVersion: *.so is not loaded yet, return the hard-coded version number:2.33.0.1025.wechat");
            return f52274xd10d9bbe;
        }
    }

    /* renamed from: isLibLoaded */
    public static boolean m101877x369448e0() {
        return f52276xe0a15a33;
    }

    /* renamed from: isLibLoadedAndTryToLoad */
    public static boolean m101878x5f41dc85() {
        boolean z17;
        try {
            m101882x9ec66011(null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "TPNativeLibraryLoader isLibLoaded error:" + th6.getMessage());
        }
        synchronized (f52277x9f5741fe) {
            z17 = f52276xe0a15a33;
        }
        return z17;
    }

    /* renamed from: isMatchJavaAndPlayerCore */
    private static boolean m101879xac7ceda(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "javaVersion:" + str + ", coreVersion:" + str2);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        if (split.length < 3 || split2.length < 3) {
            return false;
        }
        for (int i17 = 0; i17 < 3; i17++) {
            if (!split[i17].matches(split2[i17])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: loadLib */
    private static boolean m101880x141073bf(android.content.Context context) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "loadLib cpu arch:" + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101938xb2fdd4e5());
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101934xb471af00() < 14) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(3, "so load failed, current api level " + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101934xb471af00() + " is less than 14");
            return false;
        }
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101938xb2fdd4e5() == 3 || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101938xb2fdd4e5() == 4 || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101938xb2fdd4e5() == 0) {
            return false;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26281xce6dadbd interfaceC26281xce6dadbd = f52280x6b0e510b;
        if (!(interfaceC26281xce6dadbd != null ? interfaceC26281xce6dadbd.mo101140x141073bf(f52283x59af2c87, f52274xd10d9bbe) : m101881xa1651582(f52283x59af2c87, context))) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "Failed to load TPThirdParties-master");
            return false;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26281xce6dadbd interfaceC26281xce6dadbd2 = f52280x6b0e510b;
        if (!(interfaceC26281xce6dadbd2 != null ? interfaceC26281xce6dadbd2.mo101140x141073bf(f52279x3023300f, f52274xd10d9bbe) : m101881xa1651582(f52279x3023300f, context))) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "Failed to load xffmpeg");
            return false;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26281xce6dadbd interfaceC26281xce6dadbd3 = f52280x6b0e510b;
        boolean mo101140x141073bf = interfaceC26281xce6dadbd3 != null ? interfaceC26281xce6dadbd3.mo101140x141073bf(f52282x265f37ca, f52274xd10d9bbe) : m101881xa1651582(f52282x265f37ca, context);
        if (mo101140x141073bf) {
            java.lang.String m101876x7a04b1e2 = m101876x7a04b1e2();
            boolean m101879xac7ceda = m101879xac7ceda(f52275x5e682d30, m101876x7a04b1e2);
            if (!m101879xac7ceda) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "nativePlayerCoreVer(" + m101876x7a04b1e2 + ") doesn't match javaPlayerCoreVer:(2.33.0)");
            }
            mo101140x141073bf = m101879xac7ceda;
        }
        if (mo101140x141073bf) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "Native libs loaded successfully");
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "Failed to load native libs");
        }
        return mo101140x141073bf;
    }

    /* renamed from: loadLibDefault */
    private static boolean m101881xa1651582(java.lang.String str, android.content.Context context) {
        boolean z17 = false;
        try {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "loadLibDefault loading " + str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/thumbplayer/core/common/TPNativeLibraryLoader", "loadLibDefault", "(Ljava/lang/String;Landroid/content/Context;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tencent/thumbplayer/core/common/TPNativeLibraryLoader", "loadLibDefault", "(Ljava/lang/String;Landroid/content/Context;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            z17 = true;
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "loadLibDefault " + str + " loaded successfully");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "loadLibDefault failed to load " + str + "," + th6.getMessage());
        }
        if (!z17 && context != null && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26329xaae09719.m101938xb2fdd4e5() >= 6) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "loadLibDefault try to load " + str + " from APK");
                z17 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26305xfe98deef.m101794x32c4e6(str, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26318xfb67d9bb.class.getClassLoader(), context);
                if (z17) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "loadLibDefault loaded " + str + " from APK successfully");
                } else {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "loadLibDefault loaded " + str + " from APK failed");
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(4, "loadLibDefault loaded " + str + " from APK failed," + th7.getMessage());
            }
        }
        return z17;
    }

    /* renamed from: loadLibIfNeeded */
    public static void m101882x9ec66011(android.content.Context context) {
        synchronized (f52277x9f5741fe) {
            if (!f52276xe0a15a33) {
                boolean m101880x141073bf = m101880x141073bf(context);
                f52276xe0a15a33 = m101880x141073bf;
                if (m101880x141073bf) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "TPNativeLibraryLoader load lib successfully");
                } else {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101885xba7add57(2, "TPNativeLibraryLoader load lib failed");
                }
            }
            if (!f52276xe0a15a33) {
                throw new java.lang.UnsupportedOperationException("Failed to load native library");
            }
        }
    }

    /* renamed from: setLibLoader */
    public static void m101883x4c1838b6(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.InterfaceC26281xce6dadbd interfaceC26281xce6dadbd) {
        f52280x6b0e510b = interfaceC26281xce6dadbd;
    }
}
