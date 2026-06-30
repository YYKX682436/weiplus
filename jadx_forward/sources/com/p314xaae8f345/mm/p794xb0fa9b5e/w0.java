package com.p314xaae8f345.mm.p794xb0fa9b5e;

/* loaded from: classes8.dex */
public class w0 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p794xb0fa9b5e.w0 f149942c;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f149943a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f149944b;

    public w0() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r0 r0Var = com.p314xaae8f345.mm.p794xb0fa9b5e.r0.f149928b;
        this.f149943a = new android.os.Handler(com.p314xaae8f345.mm.p794xb0fa9b5e.r0.f149930d.getLooper());
        this.f149944b = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static com.p314xaae8f345.mm.p794xb0fa9b5e.w0 a() {
        if (f149942c == null) {
            synchronized (com.p314xaae8f345.mm.p794xb0fa9b5e.w0.class) {
                if (f149942c == null) {
                    f149942c = new com.p314xaae8f345.mm.p794xb0fa9b5e.w0();
                }
            }
        }
        return f149942c;
    }

    public static boolean b(java.lang.Runnable runnable) {
        return a().f149943a.post(runnable);
    }

    public static boolean c(boolean z17, java.lang.Runnable runnable) {
        return z17 ? a().f149944b.post(runnable) : a().f149943a.post(runnable);
    }

    public static boolean d(java.lang.Runnable runnable, long j17) {
        return a().f149943a.postDelayed(runnable, j17);
    }
}
