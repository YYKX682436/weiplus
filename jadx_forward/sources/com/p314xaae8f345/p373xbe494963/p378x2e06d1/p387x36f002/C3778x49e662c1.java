package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav")
/* renamed from: com.tencent.liteav.base.util.LiteavLog */
/* loaded from: classes14.dex */
public class C3778x49e662c1 {

    /* renamed from: LEVEL_DEBUG */
    private static final int f14753x34b38998 = 1;

    /* renamed from: LEVEL_ERROR */
    private static final int f14754x34c7c54d = 4;

    /* renamed from: LEVEL_FATAL */
    private static final int f14755x34ce2849 = 5;

    /* renamed from: LEVEL_INFO */
    private static final int f14756x2afff0a9 = 2;

    /* renamed from: LEVEL_NULL */
    private static final int f14757x2b025182 = 6;

    /* renamed from: LEVEL_VERBOSE */
    private static final int f14758x8f00ab87 = 0;

    /* renamed from: LEVEL_WARN */
    private static final int f14759x2b061e81 = 3;

    /* renamed from: sCallback */
    private static com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.a f14760x945461d8 = null;

    /* renamed from: useChromiumBaseLog */
    private static final boolean f14761xc97943b6 = true;

    /* renamed from: com.tencent.liteav.base.util.LiteavLog$a */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i17, java.lang.String str, java.lang.String str2);
    }

    /* renamed from: com.tencent.liteav.base.util.LiteavLog$b */
    /* loaded from: classes16.dex */
    public enum b {
        kAll(0),
        kInfo(1),
        kWarning(2),
        kError(3),
        kFatal(4),
        kNone(5);


        /* renamed from: mNativeValue */
        public int f14762x11e5d8ed;

        b(int i17) {
            this.f14762x11e5d8ed = i17;
        }

        public static int a(int i17) {
            if (i17 == 0) {
                return 0;
            }
            if (i17 == 1) {
                return 2;
            }
            if (i17 == 2) {
                return 3;
            }
            if (i17 != 3) {
                return i17 != 4 ? 6 : 5;
            }
            return 4;
        }
    }

    static {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.q.a();
    }

    public static void d(com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        d(str, str2, objArr);
    }

    public static void e(com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        e(str, str2, objArr);
    }

    /* renamed from: getLogLevel */
    public static int m29541xf2ceb016() {
        return m29542xcc59e37f();
    }

    public static void i(com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        i(str, str2, objArr);
    }

    /* renamed from: nativeGetLogLevel */
    public static native int m29542xcc59e37f();

    /* renamed from: nativeSetConsoleLogEnabled */
    public static native void m29543xce787289(boolean z17);

    /* renamed from: nativeSetLogCallbackEnabled */
    public static native void m29544xe88b6783(boolean z17);

    /* renamed from: nativeSetLogCompressEnabled */
    public static native void m29545xf2b751c6(boolean z17);

    /* renamed from: nativeSetLogFilePath */
    public static native void m29546x7a0c955a(java.lang.String str);

    /* renamed from: nativeSetLogLevel */
    public static native void m29547xc712448b(int i17);

    /* renamed from: nativeSetLogToFileEnabled */
    public static native void m29548xea224ab1(boolean z17);

    /* renamed from: onLog */
    public static void m29549x64f5ce5(int i17, java.lang.String str) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.a aVar = f14760x945461d8;
        if (aVar != null) {
            aVar.a(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.b.a(i17), "TXLiteAVSDK", str);
        }
    }

    /* renamed from: setCallback */
    public static void m29550x6c4ebec7(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.a aVar) {
        f14760x945461d8 = aVar;
    }

    public static void v(com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        v(str, str2, objArr);
    }

    public static void w(com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        w(str, str2, objArr);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        d(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        e(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        i(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        v(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        w(str, java.lang.String.format(java.util.Locale.ENGLISH, str2, objArr));
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.d(str, str2, new java.lang.Object[0]);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.e(str, str2, new java.lang.Object[0]);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i(str, str2, new java.lang.Object[0]);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.v(str, str2, new java.lang.Object[0]);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(str, str2, new java.lang.Object[0]);
    }

    public static void e(com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a aVar, java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        if (aVar == null || !aVar.a()) {
            return;
        }
        e(str, str2, th6);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        e(str, str2 + "\n" + android.util.Log.getStackTraceString(th6));
    }
}
