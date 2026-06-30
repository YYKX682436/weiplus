package io.p3277xa1c40a32.p3282x38e8d6d7;

/* renamed from: io.clipworks.corekit.NativeLogger */
/* loaded from: classes5.dex */
public final class C28524x8cbdd8a7 {

    /* renamed from: DEBUG */
    private static final int f70377x3de9e33 = 5;

    /* renamed from: ERROR */
    private static final int f70378x3f2d9e8 = 2;

    /* renamed from: FATAL */
    private static final int f70379x3f93ce4 = 1;

    /* renamed from: INFO */
    private static final int f70380x225cae = 4;

    /* renamed from: ISSUE */
    private static final int f70381x42bb0b9 = 0;

    /* renamed from: WARN */
    private static final int f70382x288a86 = 3;

    private C28524x8cbdd8a7() {
    }

    /* renamed from: debug */
    public static void m136900x5b09653(java.lang.String str, java.lang.String str2) {
        m136906xba7add57(5, str, str2);
    }

    /* renamed from: error */
    public static void m136901x5c4d208(java.lang.String str, java.lang.String str2) {
        m136906xba7add57(2, str, str2);
    }

    /* renamed from: fatal */
    public static void m136902x5cb3504(java.lang.String str, java.lang.String str2) {
        m136906xba7add57(1, str, str2);
    }

    /* renamed from: info */
    public static void m136903x3164ae(java.lang.String str, java.lang.String str2) {
        m136906xba7add57(4, str, str2);
    }

    /* renamed from: issue */
    public static void m136904x5fda8d9(java.lang.String str, java.lang.String str2) {
        m136906xba7add57(0, str, str2);
    }

    /* renamed from: nativeTracingWithLevel */
    private static native void m136905x43a115f3(int i17, java.lang.String str);

    /* renamed from: printLog */
    private static void m136906xba7add57(int i17, java.lang.String str, java.lang.String str2) {
        m136905x43a115f3(i17, java.lang.String.format("%1$s: %2$s", str, str2));
    }

    /* renamed from: warning */
    public static void m136907x4305af9c(java.lang.String str, java.lang.String str2) {
        m136906xba7add57(3, str, str2);
    }
}
