package com.tencent.matrix.hook.junwind;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087 J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0087 J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0087 J!\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0087 J\u001b\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 J\u0019\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 J\u0011\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0087 J\u0019\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0087 J\t\u0010\u0016\u001a\u00020\u000bH\u0087 J\u0011\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 J#\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 J!\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 ¨\u0006\u001a"}, d2 = {"Lcom/tencent/matrix/hook/junwind/JUnwindJni;", "", "", "bool", "Ljz5/f0;", "nativeSetSuppressPtrDefer", "Ljava/lang/Thread;", "thread", "", "nativeGetThreadNativePeer", "nativePeer", "", "nativeGetTidOffsetFromArtThread", "offset", "tid", "nativeTestTidOffsetFromArtThread", "tidOffset", "nativeGetTidByOffsetOnceForThread", "nativeGetTidByOffsetOnceForNativePeer", "nativeGetPthreadOffsetFromArtThread", "pthreadOffset", "nativeTestPthreadOffsetFromArtThread", "nativeGetTidOffsetFromPthread", "nativeTestTidOffsetFromPthread", "nativeGetTidByOffsetTwiceForThread", "nativeGetTidByOffsetTwiceForNativePeer", "matrix-hooks_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class JUnwindJni {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f52645a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f52646b;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.matrix.hook.junwind.JUnwindJni f52651g = new com.tencent.matrix.hook.junwind.JUnwindJni();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f52647c = jz5.h.a(jz5.i.f302829d, zh.d.f472845d);

    /* renamed from: d, reason: collision with root package name */
    public static int f52648d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static int f52649e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static int f52650f = -1;

    public static final int a(com.tencent.matrix.hook.junwind.JUnwindJni jUnwindJni, java.lang.Thread thread, int i17) {
        jUnwindJni.getClass();
        synchronized (((java.util.Map) f52647c.getValue())) {
            kotlin.jvm.internal.o.g(thread, "thread");
            if (di.a.a(thread)) {
                long d17 = d(thread);
                if (d17 == 0) {
                    d17 = nativeGetThreadNativePeer(thread);
                    oj.j.f("Matrix.JUnwindJNI", "nativeGetThreadNativePeer, nativePeer=" + d17, new java.lang.Object[0]);
                }
                if (d17 != 0) {
                    return nativeGetTidByOffsetOnceForNativePeer(d17, i17);
                }
            }
            return -1;
        }
    }

    public static final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f52645a);
        sb6.append('|');
        sb6.append(2);
        sb6.append('|');
        sb6.append(com.tencent.matrix.hook.junwind.PthreadHackJni.f52653b);
        sb6.append(',');
        sb6.append(f52648d);
        sb6.append('|');
        sb6.append(f52649e);
        sb6.append('|');
        sb6.append(f52650f);
        return sb6.toString();
    }

    public static final java.lang.Thread c(int i17, java.util.Set threads) {
        kotlin.jvm.internal.o.g(threads, "threads");
        int i18 = f52648d;
        java.util.Iterator it = threads.iterator();
        while (it.hasNext()) {
            java.lang.Thread thread = (java.lang.Thread) it.next();
            synchronized (((java.util.Map) f52647c.getValue())) {
                kotlin.jvm.internal.o.g(thread, "thread");
                if (di.a.a(thread)) {
                    long d17 = d(thread);
                    if (d17 == 0) {
                        d17 = nativeGetThreadNativePeer(thread);
                        oj.j.f("Matrix.JUnwindJNI", "nativeGetThreadNativePeer, nativePeer=" + d17, new java.lang.Object[0]);
                    }
                    if (d17 != 0 && nativeGetTidByOffsetOnceForNativePeer(d17, i18) == i17) {
                        return thread;
                    }
                }
            }
        }
        return null;
    }

    public static final long d(java.lang.Thread thread) {
        kotlin.jvm.internal.o.g(thread, "thread");
        try {
            if (f52646b == null) {
                java.lang.reflect.Field field = java.lang.Thread.class.getDeclaredField("nativePeer");
                kotlin.jvm.internal.o.f(field, "field");
                field.setAccessible(true);
                f52646b = field;
            }
            java.lang.reflect.Field field2 = f52646b;
            kotlin.jvm.internal.o.d(field2);
            java.lang.Object obj = field2.get(thread);
            if (obj != null) {
                return ((java.lang.Long) obj).longValue();
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Long");
        } catch (java.lang.Exception unused) {
            oj.j.f("Matrix.JUnwindJNI", "getThreadNativePeerErr, thread=" + thread, new java.lang.Object[0]);
            return 0L;
        }
    }

    public static boolean e(boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if (z17) {
            oj.j.c("Matrix.JUnwindJNI", "status=" + b(), new java.lang.Object[0]);
        }
        return f52645a && com.tencent.matrix.hook.junwind.PthreadHackJni.d() && f52645a && f52648d > 0;
    }

    public static java.lang.String f(int i17, java.util.Set set, boolean z17, java.lang.String header, int i18, java.lang.Object obj) {
        java.lang.Thread thread;
        if ((i18 & 2) != 0) {
            set = null;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        if ((i18 & 8) != 0) {
            header = "JUnwind";
        }
        kotlin.jvm.internal.o.g(header, "header");
        com.tencent.matrix.hook.junwind.JUnwindJni jUnwindJni = f52651g;
        if (i17 == android.os.Process.myTid()) {
            thread = java.lang.Thread.currentThread();
        } else if (i17 == android.os.Process.myPid()) {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            kotlin.jvm.internal.o.f(mainLooper, "Looper.getMainLooper()");
            thread = mainLooper.getThread();
        } else {
            java.util.Iterator it = (set == null ? java.lang.Thread.getAllStackTraces().keySet() : set).iterator();
            while (true) {
                if (it.hasNext()) {
                    java.lang.Thread thread2 = (java.lang.Thread) it.next();
                    if ((thread2 instanceof android.os.HandlerThread) && ((android.os.HandlerThread) thread2).getThreadId() == i17) {
                        jUnwindJni.g(i17, thread2);
                        thread = thread2;
                        break;
                    }
                } else {
                    jz5.g gVar = f52647c;
                    synchronized (((java.util.Map) gVar.getValue())) {
                        java.lang.ref.Reference reference = (java.lang.ref.Reference) ((java.util.Map) gVar.getValue()).get(java.lang.Integer.valueOf(i17));
                        thread = reference != null ? (java.lang.Thread) reference.get() : null;
                    }
                }
            }
        }
        if (thread == null && e(false, 1, null)) {
            if (!z17) {
                try {
                    com.tencent.matrix.hook.junwind.PthreadHackJni.e(true);
                } catch (java.lang.Throwable th6) {
                    if (!z17) {
                        com.tencent.matrix.hook.junwind.PthreadHackJni.e(false);
                    }
                    throw th6;
                }
            }
            if (set == null) {
                set = java.lang.Thread.getAllStackTraces().keySet();
            }
            thread = c(i17, set);
            if (thread != null) {
                f52651g.g(i17, thread);
            }
            if (!z17) {
                com.tencent.matrix.hook.junwind.PthreadHackJni.e(false);
            }
        }
        if (thread == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StackTraceElement[] stackTrace = thread.getStackTrace();
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            sb6.append(sb6.length() == 0 ? "" : "\n");
            sb6.append("at ");
            sb6.append(stackTraceElement);
        }
        if (sb6.length() == 0) {
            return null;
        }
        return header.length() == 0 ? sb6.toString() : header + '\n' + ((java.lang.Object) sb6);
    }

    public static final native int nativeGetPthreadOffsetFromArtThread(long nativePeer);

    public static final native long nativeGetThreadNativePeer(java.lang.Thread thread);

    public static final native int nativeGetTidByOffsetOnceForNativePeer(long nativePeer, int tidOffset);

    public static final native int nativeGetTidByOffsetOnceForThread(java.lang.Thread thread, int tidOffset);

    public static final native int nativeGetTidByOffsetTwiceForNativePeer(long nativePeer, int pthreadOffset, int tidOffset);

    public static final native int nativeGetTidByOffsetTwiceForThread(java.lang.Thread thread, int pthreadOffset, int tidOffset);

    public static final native int nativeGetTidOffsetFromArtThread(long nativePeer);

    public static final native int nativeGetTidOffsetFromPthread();

    public static final native void nativeSetSuppressPtrDefer(boolean z17);

    public static final native int nativeTestPthreadOffsetFromArtThread(long nativePeer, int pthreadOffset);

    public static final native int nativeTestTidOffsetFromArtThread(long nativePeer, int offset, int tid);

    public static final native int nativeTestTidOffsetFromPthread(int tidOffset);

    public final void g(int i17, java.lang.Thread thread) {
        jz5.g gVar = f52647c;
        synchronized (((java.util.Map) gVar.getValue())) {
        }
    }
}
