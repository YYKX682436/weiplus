package com.tencent.mm.ipcinvoker;

/* loaded from: classes8.dex */
public class w0 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.tencent.mm.ipcinvoker.w0 f68409c;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Handler f68410a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f68411b;

    public w0() {
        com.tencent.mm.ipcinvoker.r0 r0Var = com.tencent.mm.ipcinvoker.r0.f68395b;
        this.f68410a = new android.os.Handler(com.tencent.mm.ipcinvoker.r0.f68397d.getLooper());
        this.f68411b = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static com.tencent.mm.ipcinvoker.w0 a() {
        if (f68409c == null) {
            synchronized (com.tencent.mm.ipcinvoker.w0.class) {
                if (f68409c == null) {
                    f68409c = new com.tencent.mm.ipcinvoker.w0();
                }
            }
        }
        return f68409c;
    }

    public static boolean b(java.lang.Runnable runnable) {
        return a().f68410a.post(runnable);
    }

    public static boolean c(boolean z17, java.lang.Runnable runnable) {
        return z17 ? a().f68411b.post(runnable) : a().f68410a.post(runnable);
    }

    public static boolean d(java.lang.Runnable runnable, long j17) {
        return a().f68410a.postDelayed(runnable, j17);
    }
}
