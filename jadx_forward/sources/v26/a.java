package v26;

/* loaded from: classes14.dex */
public final class a extends java.util.concurrent.CancellationException {

    /* renamed from: d, reason: collision with root package name */
    public final transient p3325xe03a0797.p3326xc267989b.p3328x30012e.k f514505d;

    public a(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar) {
        super("Flow was aborted, no more elements needed");
        this.f514505d = kVar;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
