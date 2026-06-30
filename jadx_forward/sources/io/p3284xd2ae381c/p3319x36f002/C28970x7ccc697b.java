package io.p3284xd2ae381c.p3319x36f002;

/* renamed from: io.flutter.util.Preconditions */
/* loaded from: classes13.dex */
public final class C28970x7ccc697b {
    private C28970x7ccc697b() {
    }

    /* renamed from: checkNotNull */
    public static <T> T m139415x7b41bcd2(T t17) {
        t17.getClass();
        return t17;
    }

    /* renamed from: checkState */
    public static void m139416xe071d469(boolean z17) {
        if (!z17) {
            throw new java.lang.IllegalStateException();
        }
    }

    /* renamed from: checkState */
    public static void m139417xe071d469(boolean z17, java.lang.Object obj) {
        if (!z17) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
