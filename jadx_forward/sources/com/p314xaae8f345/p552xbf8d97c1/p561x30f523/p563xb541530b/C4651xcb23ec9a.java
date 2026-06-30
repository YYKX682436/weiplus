package com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087 J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0087 J\u0011\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0087 J!\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0087 J\u001b\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 J\u0019\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 J\u0011\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0087 J\u0019\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0087 J\t\u0010\u0016\u001a\u00020\u000bH\u0087 J\u0011\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 J#\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 J!\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0087 ¨\u0006\u001a"}, d2 = {"Lcom/tencent/matrix/hook/junwind/JUnwindJni;", "", "", "bool", "Ljz5/f0;", "nativeSetSuppressPtrDefer", "Ljava/lang/Thread;", "thread", "", "nativeGetThreadNativePeer", "nativePeer", "", "nativeGetTidOffsetFromArtThread", "offset", "tid", "nativeTestTidOffsetFromArtThread", "tidOffset", "nativeGetTidByOffsetOnceForThread", "nativeGetTidByOffsetOnceForNativePeer", "nativeGetPthreadOffsetFromArtThread", "pthreadOffset", "nativeTestPthreadOffsetFromArtThread", "nativeGetTidOffsetFromPthread", "nativeTestTidOffsetFromPthread", "nativeGetTidByOffsetTwiceForThread", "nativeGetTidByOffsetTwiceForNativePeer", "matrix-hooks_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.hook.junwind.JUnwindJni */
/* loaded from: classes12.dex */
public final class C4651xcb23ec9a {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f134178a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f134179b;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a f134184g = new com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f134180c = jz5.h.a(jz5.i.f384362d, zh.d.f554378d);

    /* renamed from: d, reason: collision with root package name */
    public static int f134181d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static int f134182e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static int f134183f = -1;

    public static final int a(com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a c4651xcb23ec9a, java.lang.Thread thread, int i17) {
        c4651xcb23ec9a.getClass();
        synchronized (((java.util.Map) f134180c.mo141623x754a37bb())) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
            if (di.a.a(thread)) {
                long d17 = d(thread);
                if (d17 == 0) {
                    d17 = m40887xe1bed9a2(thread);
                    oj.j.f("Matrix.JUnwindJNI", "nativeGetThreadNativePeer, nativePeer=" + d17, new java.lang.Object[0]);
                }
                if (d17 != 0) {
                    return m40888xa121e5a7(d17, i17);
                }
            }
            return -1;
        }
    }

    public static final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f134178a);
        sb6.append('|');
        sb6.append(2);
        sb6.append('|');
        sb6.append(com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.f134186b);
        sb6.append(',');
        sb6.append(f134181d);
        sb6.append('|');
        sb6.append(f134182e);
        sb6.append('|');
        sb6.append(f134183f);
        return sb6.toString();
    }

    public static final java.lang.Thread c(int i17, java.util.Set threads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threads, "threads");
        int i18 = f134181d;
        java.util.Iterator it = threads.iterator();
        while (it.hasNext()) {
            java.lang.Thread thread = (java.lang.Thread) it.next();
            synchronized (((java.util.Map) f134180c.mo141623x754a37bb())) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
                if (di.a.a(thread)) {
                    long d17 = d(thread);
                    if (d17 == 0) {
                        d17 = m40887xe1bed9a2(thread);
                        oj.j.f("Matrix.JUnwindJNI", "nativeGetThreadNativePeer, nativePeer=" + d17, new java.lang.Object[0]);
                    }
                    if (d17 != 0 && m40888xa121e5a7(d17, i18) == i17) {
                        return thread;
                    }
                }
            }
        }
        return null;
    }

    public static final long d(java.lang.Thread thread) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        try {
            if (f134179b == null) {
                java.lang.reflect.Field field = java.lang.Thread.class.getDeclaredField("nativePeer");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field, "field");
                field.setAccessible(true);
                f134179b = field;
            }
            java.lang.reflect.Field field2 = f134179b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(field2);
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
        return f134178a && com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.d() && f134178a && f134181d > 0;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a c4651xcb23ec9a = f134184g;
        if (i17 == android.os.Process.myTid()) {
            thread = java.lang.Thread.currentThread();
        } else if (i17 == android.os.Process.myPid()) {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mainLooper, "Looper.getMainLooper()");
            thread = mainLooper.getThread();
        } else {
            java.util.Iterator it = (set == null ? java.lang.Thread.getAllStackTraces().keySet() : set).iterator();
            while (true) {
                if (it.hasNext()) {
                    java.lang.Thread thread2 = (java.lang.Thread) it.next();
                    if ((thread2 instanceof android.os.HandlerThread) && ((android.os.HandlerThread) thread2).getThreadId() == i17) {
                        c4651xcb23ec9a.g(i17, thread2);
                        thread = thread2;
                        break;
                    }
                } else {
                    jz5.g gVar = f134180c;
                    synchronized (((java.util.Map) gVar.mo141623x754a37bb())) {
                        java.lang.ref.Reference reference = (java.lang.ref.Reference) ((java.util.Map) gVar.mo141623x754a37bb()).get(java.lang.Integer.valueOf(i17));
                        thread = reference != null ? (java.lang.Thread) reference.get() : null;
                    }
                }
            }
        }
        if (thread == null && e(false, 1, null)) {
            if (!z17) {
                try {
                    com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.e(true);
                } catch (java.lang.Throwable th6) {
                    if (!z17) {
                        com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.e(false);
                    }
                    throw th6;
                }
            }
            if (set == null) {
                set = java.lang.Thread.getAllStackTraces().keySet();
            }
            thread = c(i17, set);
            if (thread != null) {
                f134184g.g(i17, thread);
            }
            if (!z17) {
                com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4652xc579910a.e(false);
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

    /* renamed from: nativeGetPthreadOffsetFromArtThread */
    public static final native int m40886x868a4635(long nativePeer);

    /* renamed from: nativeGetThreadNativePeer */
    public static final native long m40887xe1bed9a2(java.lang.Thread thread);

    /* renamed from: nativeGetTidByOffsetOnceForNativePeer */
    public static final native int m40888xa121e5a7(long nativePeer, int tidOffset);

    /* renamed from: nativeGetTidByOffsetOnceForThread */
    public static final native int m40889xc029898(java.lang.Thread thread, int tidOffset);

    /* renamed from: nativeGetTidByOffsetTwiceForNativePeer */
    public static final native int m40890x882a0554(long nativePeer, int pthreadOffset, int tidOffset);

    /* renamed from: nativeGetTidByOffsetTwiceForThread */
    public static final native int m40891xf33f96c5(java.lang.Thread thread, int pthreadOffset, int tidOffset);

    /* renamed from: nativeGetTidOffsetFromArtThread */
    public static final native int m40892x1a66bd80(long nativePeer);

    /* renamed from: nativeGetTidOffsetFromPthread */
    public static final native int m40893x8c790a6d();

    /* renamed from: nativeSetSuppressPtrDefer */
    public static final native void m40894x24f0e1e4(boolean z17);

    /* renamed from: nativeTestPthreadOffsetFromArtThread */
    public static final native int m40895xe01af73f(long nativePeer, int pthreadOffset);

    /* renamed from: nativeTestTidOffsetFromArtThread */
    public static final native int m40896x683d838a(long nativePeer, int offset, int tid);

    /* renamed from: nativeTestTidOffsetFromPthread */
    public static final native int m40897xc87dcaf7(int tidOffset);

    public final void g(int i17, java.lang.Thread thread) {
        jz5.g gVar = f134180c;
        synchronized (((java.util.Map) gVar.mo141623x754a37bb())) {
        }
    }
}
