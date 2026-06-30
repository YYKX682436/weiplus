package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes12.dex */
public abstract class j3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f270881a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f270882b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public abstract java.lang.Object a(java.lang.Object... objArr);

    public abstract java.util.concurrent.ExecutorService b();

    public abstract void c(java.lang.Object obj);

    public void d(java.lang.Object... objArr) {
    }

    public void e(java.lang.Object... objArr) {
    }

    public boolean f(java.lang.Object... objArr) {
        if (this.f270881a) {
            iz5.a.g("MicroMsg.MMAsyncTask Should construct a new Task", false);
        }
        this.f270881a = true;
        d(objArr);
        java.util.concurrent.ExecutorService b17 = b();
        if (b17 == null) {
            return false;
        }
        b17.execute(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h3(this, objArr));
        return true;
    }
}
