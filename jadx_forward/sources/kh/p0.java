package kh;

/* loaded from: classes12.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.u0 f389417d;

    public p0(kh.u0 u0Var) {
        this.f389417d = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Looper looper;
        android.os.HandlerThread handlerThread;
        android.os.Looper looper2;
        android.os.Looper looper3;
        android.os.HandlerThread handlerThread2;
        android.os.Looper looper4;
        kh.u0 u0Var = this.f389417d;
        java.util.List list = u0Var.f389457a;
        kh.k1 k1Var = u0Var.f389460d;
        synchronized (list) {
            oj.j.c("Matrix.battery.LooperTaskMonitorFeatureKt", "#startWatching", new java.lang.Object[0]);
            if (k1Var.A()) {
                for (java.lang.Thread thread : java.lang.Thread.getAllStackTraces().keySet()) {
                    if (android.os.Looper.getMainLooper().getThread() == thread) {
                        if (!((java.util.HashMap) u0Var.f389458b).containsKey(android.os.Looper.getMainLooper())) {
                            u0Var.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, android.os.Looper.getMainLooper());
                        }
                    } else if ((thread instanceof android.os.HandlerThread) && (looper3 = ((android.os.HandlerThread) thread).getLooper()) != null && !((java.util.HashMap) u0Var.f389458b).containsKey(looper3) && (looper4 = (handlerThread2 = (android.os.HandlerThread) thread).getLooper()) != null) {
                        java.lang.String name = handlerThread2.getName();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                        u0Var.a(name, looper4);
                    }
                }
            } else {
                if (k1Var.B()) {
                    if (!((java.util.HashMap) u0Var.f389458b).containsKey(android.os.Looper.getMainLooper())) {
                        u0Var.a(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, android.os.Looper.getMainLooper());
                    }
                }
                java.util.Collection<java.lang.Thread> collection = kz5.p0.f395529d;
                java.util.Collection<java.lang.String> collection2 = k1Var.f476827a.f444868d.f444837w;
                if (collection2 == null) {
                    collection2 = collection;
                }
                for (java.lang.String str : collection2) {
                    if (!android.text.TextUtils.isEmpty(str) && !r26.i0.p(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29, str, true) && !((java.util.ArrayList) u0Var.f389457a).contains(str)) {
                        if (collection.isEmpty()) {
                            collection = java.lang.Thread.getAllStackTraces().keySet();
                        }
                        for (java.lang.Thread thread2 : collection) {
                            if (android.os.Looper.getMainLooper().getThread() != thread2) {
                                java.lang.String name2 = thread2.getName();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "getName(...)");
                                if (r26.n0.B(name2, str, false) && (thread2 instanceof android.os.HandlerThread) && (looper = ((android.os.HandlerThread) thread2).getLooper()) != null && !((java.util.HashMap) u0Var.f389458b).containsKey(looper) && (looper2 = (handlerThread = (android.os.HandlerThread) thread2).getLooper()) != null) {
                                    java.lang.String name3 = handlerThread.getName();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name3, "getName(...)");
                                    u0Var.a(name3, looper2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
