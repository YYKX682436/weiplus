package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative */
/* loaded from: classes16.dex */
public class C26376xdc8e0a61 {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f53012x59634b6e = "TPDownloadProxyNative";

    /* renamed from: appContext */
    private static android.content.Context f53013x7c37dc4e;

    /* renamed from: isLoadDownloadProxySucceed */
    private static boolean f53014xcf6c01ec;

    /* renamed from: _hellAccFlag_ */
    private byte f53015x7f11beae;

    /* renamed from: mLibLoader */
    private com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26359x474967c0 f53016x6b0e510b;

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative$SingletonHolder */
    /* loaded from: classes15.dex */
    public static class SingletonHolder {

        /* renamed from: INSTANCE */
        private static final com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61 f53017x4fbc8495 = new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61();

        private SingletonHolder() {
        }
    }

    private C26376xdc8e0a61() {
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61 m102393x9cf0d20b() {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.jni.C26376xdc8e0a61.SingletonHolder.f53017x4fbc8495;
    }

    /* renamed from: nativeIntMessageCallback */
    private static int m102394x443fc5f4(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102377xe498e45b(i17, i18, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: nativeLogCallback */
    private static void m102395x36fdd712(int i17, byte[] bArr, int i18, byte[] bArr2, byte[] bArr3) {
        if (i17 == 6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr), i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr2), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr3));
            return;
        }
        if (i17 == 5) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.w(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr), i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr2), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr3));
            return;
        }
        if (i17 == 4) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr), i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr2), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr3));
        } else if (i17 == 3) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr), i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr2), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr3));
        } else {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr), i18, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr2), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(bArr3));
        }
    }

    /* renamed from: nativeMessageCallback */
    private static void m102396x15e1e455(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102376xf5a5c4ba(i17, i18, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: nativeStringMessageCallback */
    private static java.lang.String m102397x71966544(int i17, int i18, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3036x3a34147c.C26374xf3d8d63d.m102372x9cf0d20b().m102378x296a6e69(i17, i18, obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: checkResourceStatus */
    public native int m102398xc32400c8(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: clearCache */
    public native int m102399xd2bef135(java.lang.String str, java.lang.String str2, int i17);

    /* renamed from: createDownloadTask */
    public native int m102400xb8d64949(int i17, java.lang.String str, int i18, int i19);

    /* renamed from: deInitService */
    public native int m102401x5ca09844(int i17);

    /* renamed from: deleteCache */
    public native int m102402xbb8f0c97(java.lang.String str, java.lang.String str2);

    /* renamed from: getAppContext */
    public android.content.Context m102403x6a789444() {
        return f53013x7c37dc4e;
    }

    /* renamed from: getClipPlayUrl */
    public native byte[] m102404x5a566f5(int i17, int i18, int i19);

    /* renamed from: getErrorCodeStr */
    public native byte[] m102405xa7e2b452(int i17);

    /* renamed from: getHLSOfflineExttag */
    public native byte[] m102406xeb05d63(java.lang.String str, java.lang.String str2, int i17, long j17);

    /* renamed from: getNativeInfo */
    public native byte[] m102407xa741fd5b(int i17);

    /* renamed from: getNativeVersion */
    public java.lang.String m102408x994c290b() {
        java.lang.String m102494xdb3a7bbd = f53014xcf6c01ec ? com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26382xec26b607.m102494xdb3a7bbd(m102410x52c258a2()) : "2.20.0.00016";
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53012x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "get native version:" + m102494xdb3a7bbd);
        return m102494xdb3a7bbd;
    }

    /* renamed from: getResourceSize */
    public native long m102409x4a08f3a5(java.lang.String str, java.lang.String str2);

    /* renamed from: getVersion */
    public native byte[] m102410x52c258a2();

    /* renamed from: initService */
    public native int m102411xc4f22785(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: isNativeLoaded */
    public boolean m102412x558eb146() {
        if (!f53014xcf6c01ec) {
            try {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26359x474967c0 interfaceC26359x474967c0 = this.f53016x6b0e510b;
                if (interfaceC26359x474967c0 != null) {
                    boolean mo101141x141073bf = interfaceC26359x474967c0.mo101141x141073bf("DownloadProxy", m102408x994c290b());
                    f53014xcf6c01ec = mo101141x141073bf;
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53012x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "third module so load ret:".concat(mo101141x141073bf ? "0" : "1"));
                }
            } catch (java.lang.Throwable th6) {
                f53014xcf6c01ec = false;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53012x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "third module so load failed, error:" + th6.toString());
            }
            try {
                if (!f53014xcf6c01ec) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add("DownloadProxy");
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/thumbplayer/core/downloadproxy/jni/TPDownloadProxyNative", "isNativeLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
                    yj0.a.f(obj, "com/tencent/thumbplayer/core/downloadproxy/jni/TPDownloadProxyNative", "isNativeLoaded", "()Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                    f53014xcf6c01ec = true;
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53012x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "system so load success!");
                }
            } catch (java.lang.Throwable th7) {
                f53014xcf6c01ec = false;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f53012x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "system so load failed, error:" + th7.toString());
            }
        }
        return f53014xcf6c01ec;
    }

    /* renamed from: isNativeReadyForWork */
    public native boolean m102413x24ab38d8();

    /* renamed from: isReadyForWork */
    public boolean m102414xccc05ea1() {
        if (f53014xcf6c01ec) {
            return m102413x24ab38d8();
        }
        return false;
    }

    /* renamed from: pauseDownload */
    public native int m102415xe51afc9e(int i17);

    /* renamed from: pushEvent */
    public native void m102416xd0c233a0(int i17);

    /* renamed from: resumeDownload */
    public native int m102417xb0277d5(int i17);

    /* renamed from: setAppContext */
    public void m102418x989ce250(android.content.Context context) {
        if (context != null) {
            f53013x7c37dc4e = context.getApplicationContext();
        }
    }

    /* renamed from: setClipInfo */
    public native int m102419xad41f2a0(int i17, int i18, java.lang.String str, int i19, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    /* renamed from: setLibLoader */
    public void m102420x4c1838b6(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26359x474967c0 interfaceC26359x474967c0) {
        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.i(f53012x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "set third module so loader!!!");
        this.f53016x6b0e510b = interfaceC26359x474967c0;
    }

    /* renamed from: setMaxStorageSizeMB */
    public native int m102421xd7e17d2f(int i17, long j17);

    /* renamed from: setPlayerState */
    public native void m102422x90c7986e(int i17, int i18);

    /* renamed from: setServiceConfig */
    public native void m102423xb979bd15(int i17, java.lang.String str);

    /* renamed from: setUserData */
    public native void m102424x66a91097(java.lang.String str, java.lang.String str2);

    /* renamed from: startDownload */
    public native int m102425x5cae6f0a(int i17);

    /* renamed from: stopAllDownload */
    public native int m102426x41795fe7(int i17);

    /* renamed from: stopDownload */
    public native int m102427xf2c12aa(int i17);

    /* renamed from: updatePlayerPlayMsg */
    public native void m102428x7d92db43(int i17, int i18, int i19, int i27);

    /* renamed from: updateStoragePath */
    public native int m102429x9cbbacb7(int i17, java.lang.String str);

    /* renamed from: updateTaskInfo */
    public native void m102430x1b6687bc(int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: verifyOfflineCacheSync */
    public native long m102431xcdfd6933(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);
}
