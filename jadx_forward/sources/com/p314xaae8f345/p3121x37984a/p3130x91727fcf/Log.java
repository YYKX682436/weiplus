package com.p314xaae8f345.p3121x37984a.p3130x91727fcf;

/* loaded from: classes12.dex */
public class Log {

    /* renamed from: LOGGER_DEFAULT */
    public static final int f58431x7f1f6272 = 1;

    /* renamed from: LOGGER_NONE */
    public static final int f58432x5857f087 = 0;

    /* renamed from: mCallback */
    private static com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.InterfaceC26990xc0dc4b89 f58433x1ab9c7d2;

    /* renamed from: com.tencent.wcdb.support.Log$LogCallback */
    /* loaded from: classes12.dex */
    public interface InterfaceC26990xc0dc4b89 {
        /* renamed from: println */
        void mo75055xed3dc8ef(int i17, java.lang.String str, java.lang.String str2);
    }

    private Log() {
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        m108028xed3dc8ef(3, str, str2);
    }

    public static void e(java.lang.String str, java.lang.String str2) {
        m108028xed3dc8ef(6, str, str2);
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        m108028xed3dc8ef(7, str, str2);
    }

    public static void i(java.lang.String str, java.lang.String str2) {
        m108028xed3dc8ef(4, str, str2);
    }

    /* renamed from: nativePrintLn */
    private static native void m108026xb43514f8(int i17, java.lang.String str, java.lang.String str2);

    /* renamed from: nativeSetLogger */
    private static native void m108027xfd47463b(int i17, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.InterfaceC26990xc0dc4b89 interfaceC26990xc0dc4b89);

    /* renamed from: println */
    public static void m108028xed3dc8ef(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.InterfaceC26990xc0dc4b89 interfaceC26990xc0dc4b89 = f58433x1ab9c7d2;
        if (interfaceC26990xc0dc4b89 != null) {
            interfaceC26990xc0dc4b89.mo75055xed3dc8ef(i17, str, str2);
        } else {
            m108026xb43514f8(i17, str, str2);
        }
    }

    /* renamed from: setLogger */
    public static void m108029x16e44c92(int i17) {
        f58433x1ab9c7d2 = null;
        m108027xfd47463b(i17, null);
    }

    public static void v(java.lang.String str, java.lang.String str2) {
        m108028xed3dc8ef(2, str, str2);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        m108028xed3dc8ef(5, str, str2);
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m108028xed3dc8ef(3, str, java.lang.String.format(str2, objArr));
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m108028xed3dc8ef(6, str, java.lang.String.format(str2, objArr));
    }

    public static void f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m108028xed3dc8ef(7, str, java.lang.String.format(str2, objArr));
    }

    public static void i(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m108028xed3dc8ef(4, str, java.lang.String.format(str2, objArr));
    }

    public static void v(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m108028xed3dc8ef(2, str, java.lang.String.format(str2, objArr));
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        m108028xed3dc8ef(5, str, java.lang.String.format(str2, objArr));
    }

    /* renamed from: setLogger */
    public static void m108030x16e44c92(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.InterfaceC26990xc0dc4b89 interfaceC26990xc0dc4b89) {
        f58433x1ab9c7d2 = interfaceC26990xc0dc4b89;
        m108027xfd47463b(-1, interfaceC26990xc0dc4b89);
    }
}
