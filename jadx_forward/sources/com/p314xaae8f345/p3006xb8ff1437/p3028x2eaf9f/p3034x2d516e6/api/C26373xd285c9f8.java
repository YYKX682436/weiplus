package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper */
/* loaded from: classes16.dex */
public class C26373xd285c9f8 {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f52940x59634b6e = "TPDownloadProxyHelper";

    /* renamed from: applicationContext */
    private static android.content.Context f52941x5b0a2e3f;

    /* renamed from: offlineVinfoAdapter */
    private static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26363xd5644149 f52942xa9cab60e;

    /* renamed from: checkVideoStatus */
    public static java.lang.String m102348xee841625(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26363xd5644149 interfaceC26363xd5644149;
        return (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102336xadb37b1e() && (interfaceC26363xd5644149 = f52942xa9cab60e) != null) ? interfaceC26363xd5644149.m102269xee841625(str, str2) : "";
    }

    /* renamed from: getContext */
    public static android.content.Context m102349x76847179() {
        return f52941x5b0a2e3f;
    }

    /* renamed from: getHLSOfflineExttag */
    public static java.lang.String m102350xeb05d63(java.lang.String str, java.lang.String str2, int i17, long j17) {
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146() ? com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102406xeb05d63(str, str2, i17, j17)) : "";
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52940x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "get exttag failed, error:" + th6.toString());
            return "";
        }
    }

    /* renamed from: getNativeInfo */
    public static java.lang.String m102351xa741fd5b(int i17) {
        if (!com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            return null;
        }
        try {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102407xa741fd5b(i17));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52940x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getNativeInfo failed, error:" + th6.toString());
            return null;
        }
    }

    /* renamed from: getNativeLibVersion */
    public static java.lang.String m102352xa942c580() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102339x994c290b();
    }

    /* renamed from: getRecordDuration */
    public static int m102353x667809fb(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26363xd5644149 interfaceC26363xd5644149 = f52942xa9cab60e;
        if (interfaceC26363xd5644149 != null) {
            return interfaceC26363xd5644149.m102270x667809fb(str, str2);
        }
        return -1;
    }

    /* renamed from: isReadyForPlay */
    public static boolean m102354xccbd22c4() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102344xccbd22c4();
    }

    /* renamed from: setContext */
    public static void m102355xe9f5beed(android.content.Context context) {
        f52941x5b0a2e3f = context;
    }

    /* renamed from: setNativeLibLoader */
    public static void m102356xf1f26bdf(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26359x474967c0 interfaceC26359x474967c0) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102420x4c1838b6(interfaceC26359x474967c0);
    }

    /* renamed from: setTPOfflineVinfoAdapter */
    public static void m102357xe81f3ed0(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26363xd5644149 interfaceC26363xd5644149) {
        f52942xa9cab60e = interfaceC26363xd5644149;
    }

    /* renamed from: setTPProxyAdapter */
    public static void m102358xf15a667f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26366x9ea44a26 interfaceC26366x9ea44a26) {
    }

    /* renamed from: setUseService */
    public static void m102359x3206a930(boolean z17) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26372xd16c000.m102347x3206a930(z17);
    }

    /* renamed from: setUserData */
    public static void m102360x66a91097(java.lang.String str, java.lang.Object obj) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102424x66a91097(str, obj.toString());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52940x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "setUserData failed, error:" + th6.toString());
            }
        }
    }

    /* renamed from: verifyOfflineCacheSync */
    public static long m102361xcdfd6933(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        try {
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102412x558eb146()) {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.m102393x9cf0d20b().m102431xcdfd6933(str, i17, str2, str3);
            }
            return -1L;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52940x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "verify offline cache failed, error:" + th6.toString());
            return -1L;
        }
    }
}
