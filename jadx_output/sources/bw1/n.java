package bw1;

/* loaded from: classes12.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.Future f24828a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.Future f24829b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.wcdb.support.CancellationSignal f24830c;

    /* renamed from: d, reason: collision with root package name */
    public long f24831d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24832e;

    public void a(boolean z17) {
        java.util.concurrent.Future future = this.f24828a;
        java.util.concurrent.Future future2 = this.f24829b;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f24830c;
        if (future != null && (future.cancel(false) || z17)) {
            this.f24828a = null;
        }
        if (future2 != null && (future2.cancel(false) || z17)) {
            this.f24829b = null;
        }
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.f24830c = null;
        }
    }

    public abstract java.lang.Object b(com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z17);

    public java.lang.Object c(com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        java.util.concurrent.Future future = this.f24828a;
        java.util.concurrent.Future future2 = this.f24829b;
        if (future == null || future.isCancelled()) {
            future = e();
            this.f24828a = future;
        } else if (future2 != null && future2.isDone() && !future2.isCancelled()) {
            this.f24828a = future2;
            this.f24829b = null;
            future = future2;
        }
        try {
            if (cancellationSignal == null) {
                return future.get();
            }
            while (true) {
                try {
                    return future.get(100L, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.util.concurrent.TimeoutException unused) {
                    cancellationSignal.throwIfCanceled();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PreloadTask", e17, "Cannot get list result", new java.lang.Object[0]);
            return null;
        }
    }

    public void d() {
        java.util.concurrent.Future future = this.f24828a;
        java.util.concurrent.Future future2 = this.f24829b;
        if (future == null || future.isCancelled()) {
            this.f24828a = e();
        } else if (future.isDone()) {
            if (future2 == null || future2.isCancelled()) {
                this.f24829b = e();
            }
        }
    }

    public final java.util.concurrent.Future e() {
        final com.tencent.wcdb.support.CancellationSignal cancellationSignal = new com.tencent.wcdb.support.CancellationSignal();
        this.f24830c = cancellationSignal;
        this.f24831d = java.lang.System.currentTimeMillis();
        return ((ku5.t0) ku5.t0.f312615d).c(new java.util.concurrent.Callable() { // from class: bw1.n$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                bw1.n nVar = bw1.n.this;
                return nVar.b(cancellationSignal, nVar.f24832e);
            }
        });
    }
}
