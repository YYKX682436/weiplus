package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class jd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f290536d;

    public jd(java.lang.Runnable runnable) {
        this.f290536d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.md mdVar = com.p314xaae8f345.mm.ui.td.f291426c;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(myLooper, mainLooper);
        java.lang.Runnable runnable = this.f290536d;
        if (b17) {
            runnable.run();
            return;
        }
        java.lang.reflect.Field field = com.p314xaae8f345.mm.ui.td.f291428e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(field);
        java.lang.Object obj = field.get(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.lang.ThreadLocal<in android.os.Looper>");
        java.lang.ThreadLocal threadLocal = (java.lang.ThreadLocal) obj;
        try {
            threadLocal.set(mainLooper);
            runnable.run();
        } finally {
            threadLocal.set(myLooper);
        }
    }
}
