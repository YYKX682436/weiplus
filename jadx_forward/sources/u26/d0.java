package u26;

/* loaded from: classes14.dex */
public abstract class d0 {
    public static final void a(u26.t0 t0Var, java.lang.Throwable th6) {
        if (th6 != null) {
            r0 = th6 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th6 : null;
            if (r0 == null) {
                r0 = p3325xe03a0797.p3326xc267989b.e2.a("Channel was consumed, consumer had failed", th6);
            }
        }
        t0Var.b(r0);
    }
}
