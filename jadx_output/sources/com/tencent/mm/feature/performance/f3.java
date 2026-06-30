package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class f3 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f67571b = true;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.f3 f67570a = new com.tencent.mm.feature.performance.f3();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f67572c = jz5.h.b(com.tencent.mm.feature.performance.d3.f67554d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Runnable f67573d = new com.tencent.mm.feature.performance.e3();

    public final void a(boolean z17) {
        if (mm.k.Q.k(java.lang.String.valueOf(-1L)) * 1000 > 0) {
            f67571b = !z17;
            android.os.Handler handler = (android.os.Handler) ((jz5.n) f67572c).getValue();
            java.lang.Runnable runnable = f67573d;
            handler.removeCallbacks(runnable);
            ((com.tencent.mm.feature.performance.e3) runnable).run();
        }
    }
}
