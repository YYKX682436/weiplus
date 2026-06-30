package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.MainThreadAsyncHandler */
/* loaded from: classes12.dex */
public final class C0792x43f0de11 {

    /* renamed from: sHandler */
    private static volatile android.os.Handler f1965x36ab1757;

    private C0792x43f0de11() {
    }

    /* renamed from: getInstance */
    public static android.os.Handler m5921x9cf0d20b() {
        if (f1965x36ab1757 != null) {
            return f1965x36ab1757;
        }
        synchronized (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0792x43f0de11.class) {
            if (f1965x36ab1757 == null) {
                f1965x36ab1757 = j3.k.a(android.os.Looper.getMainLooper());
            }
        }
        return f1965x36ab1757;
    }
}
