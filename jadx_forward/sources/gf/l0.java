package gf;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f352649b;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f352652e;

    /* renamed from: a, reason: collision with root package name */
    public static final gf.l0 f352648a = new gf.l0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f352650c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f352651d = new java.util.ArrayList();

    public static final void d(java.lang.Runnable runnable) {
        if (f352649b) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        synchronized (f352650c) {
            if (!f352649b) {
                f352651d.add(runnable);
            } else {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC11702x4ae7c33);
        return java.lang.Boolean.parseBoolean(interfaceC11702x4ae7c33.qe("skyline"));
    }

    public final boolean b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = df.h.f311005c;
        return o4Var.getInt("renderBackend", 0) == 1 || o4Var.getInt("renderBackend", 0) == 2;
    }

    public final void c(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "<this>");
        if (bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }
}
