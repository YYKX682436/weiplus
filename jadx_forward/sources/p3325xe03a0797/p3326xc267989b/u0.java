package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes12.dex */
public abstract class u0 {
    public static final void a(oz5.l lVar, java.lang.Throwable th6) {
        try {
            p3325xe03a0797.p3326xc267989b.r0 r0Var = (p3325xe03a0797.p3326xc267989b.r0) lVar.get(p3325xe03a0797.p3326xc267989b.q0.f392100d);
            if (r0Var != null) {
                r0Var.mo565x9514ef07(lVar, th6);
            } else {
                p3325xe03a0797.p3326xc267989b.t0.a(lVar, th6);
            }
        } catch (java.lang.Throwable th7) {
            if (th6 != th7) {
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th7);
                jz5.a.a(runtimeException, th6);
                th6 = runtimeException;
            }
            p3325xe03a0797.p3326xc267989b.t0.a(lVar, th6);
        }
    }
}
