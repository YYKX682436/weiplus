package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class e2 {
    public static final java.util.concurrent.CancellationException a(java.lang.String str, java.lang.Throwable th6) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th6);
        return cancellationException;
    }
}
