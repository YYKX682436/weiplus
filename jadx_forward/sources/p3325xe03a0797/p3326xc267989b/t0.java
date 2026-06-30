package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes12.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f392210a = q26.h0.y(q26.y.a(p3325xe03a0797.p3326xc267989b.s0.a()));

    public static final void a(oz5.l lVar, java.lang.Throwable th6) {
        java.lang.Throwable runtimeException;
        java.util.Iterator it = f392210a.iterator();
        while (it.hasNext()) {
            try {
                ((p3325xe03a0797.p3326xc267989b.r0) it.next()).mo565x9514ef07(lVar, th6);
            } catch (java.lang.Throwable th7) {
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th6 == th7) {
                    runtimeException = th6;
                } else {
                    runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th7);
                    jz5.a.a(runtimeException, th6);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            jz5.a.a(th6, new p3325xe03a0797.p3326xc267989b.l1(lVar));
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th8) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th8));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th6);
    }
}
