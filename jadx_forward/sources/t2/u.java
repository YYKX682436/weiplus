package t2;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final wa.a f496195d;

    /* renamed from: e, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f496196e;

    public u(wa.a futureToObserve, p3325xe03a0797.p3326xc267989b.q continuation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(futureToObserve, "futureToObserve");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(continuation, "continuation");
        this.f496195d = futureToObserve;
        this.f496196e = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        wa.a aVar = this.f496195d;
        boolean isCancelled = aVar.isCancelled();
        p3325xe03a0797.p3326xc267989b.q qVar = this.f496196e;
        if (isCancelled) {
            p3325xe03a0797.p3326xc267989b.p.a(qVar, null, 1, null);
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(t2.j.e(aVar)));
        } catch (java.util.concurrent.ExecutionException e17) {
            java.lang.Throwable cause = e17.getCause();
            if (cause == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.n();
                throw null;
            }
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(cause)));
        }
    }
}
