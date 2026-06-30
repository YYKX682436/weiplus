package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002;

/* renamed from: com.tencent.thumbplayer.tmediacodec.util.LogUtils */
/* loaded from: classes14.dex */
public final class C26513x7b544bed {

    /* renamed from: GLOBAL_TAG */
    private static final java.lang.String f54217xe9cde0de = "TMediaCodec";
    private static final java.lang.String TAG = "LogUtils";

    /* renamed from: mLogProxy */
    private static com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3 f54218x9c304917 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3() { // from class: com.tencent.thumbplayer.tmediacodec.util.LogUtils.1
        @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
        public void d(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
        public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
        public void i(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
        public void v(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3
        public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        }
    };

    /* renamed from: sLogEnable */
    private static boolean f54219x908d22b4 = true;

    /* renamed from: sLogLevel */
    private static int f54220x158cb433 = 2;

    public static void d(java.lang.String str, java.lang.String str2) {
        if (m103512x2096b4b7(3)) {
            f54218x9c304917.d("TMediaCodec." + str, str2);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        if (m103512x2096b4b7(6)) {
            f54218x9c304917.e("TMediaCodec." + str, str2, null);
        }
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        if (m103512x2096b4b7(4)) {
            f54218x9c304917.i("TMediaCodec." + str, str2);
        }
    }

    /* renamed from: isEnableLog */
    public static boolean m103512x2096b4b7(int i17) {
        return f54219x908d22b4 && i17 >= f54220x158cb433;
    }

    /* renamed from: isLogEnable */
    public static boolean m103513xa25a73dd() {
        return f54219x908d22b4;
    }

    /* renamed from: setLogEnable */
    public static void m103514xb7de63a5(boolean z17) {
        f54219x908d22b4 = z17;
    }

    /* renamed from: setLogLevel */
    public static void m103515xed871122(int i17) {
        f54220x158cb433 = i17;
    }

    /* renamed from: setLogProxy */
    public static void m103516xedc5400c(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.InterfaceC26512xc290acf3 interfaceC26512xc290acf3) {
        f54218x9c304917 = interfaceC26512xc290acf3;
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        if (m103512x2096b4b7(2)) {
            f54218x9c304917.v("TMediaCodec." + str, str2);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        if (m103512x2096b4b7(5)) {
            f54218x9c304917.w("TMediaCodec." + str, str2, null);
        }
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (m103512x2096b4b7(6)) {
            f54218x9c304917.e("TMediaCodec." + str, str2, th6);
        }
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (m103512x2096b4b7(5)) {
            f54218x9c304917.w("TMediaCodec." + str, str2, th6);
        }
    }
}
