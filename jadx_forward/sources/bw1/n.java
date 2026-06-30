package bw1;

/* loaded from: classes12.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public java.util.concurrent.Future f106361a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.Future f106362b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f106363c;

    /* renamed from: d, reason: collision with root package name */
    public long f106364d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f106365e;

    public void a(boolean z17) {
        java.util.concurrent.Future future = this.f106361a;
        java.util.concurrent.Future future2 = this.f106362b;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f106363c;
        if (future != null && (future.cancel(false) || z17)) {
            this.f106361a = null;
        }
        if (future2 != null && (future2.cancel(false) || z17)) {
            this.f106362b = null;
        }
        if (c26987xeef691ab != null) {
            c26987xeef691ab.m108007xae7a2e7a();
            this.f106363c = null;
        }
    }

    public abstract java.lang.Object b(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z17);

    public java.lang.Object c(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        java.util.concurrent.Future future = this.f106361a;
        java.util.concurrent.Future future2 = this.f106362b;
        if (future == null || future.isCancelled()) {
            future = e();
            this.f106361a = future;
        } else if (future2 != null && future2.isDone() && !future2.isCancelled()) {
            this.f106361a = future2;
            this.f106362b = null;
            future = future2;
        }
        try {
            if (c26987xeef691ab == null) {
                return future.get();
            }
            while (true) {
                try {
                    return future.get(100L, java.util.concurrent.TimeUnit.MILLISECONDS);
                } catch (java.util.concurrent.TimeoutException unused) {
                    c26987xeef691ab.m108011xf4ed245c();
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PreloadTask", e17, "Cannot get list result", new java.lang.Object[0]);
            return null;
        }
    }

    public void d() {
        java.util.concurrent.Future future = this.f106361a;
        java.util.concurrent.Future future2 = this.f106362b;
        if (future == null || future.isCancelled()) {
            this.f106361a = e();
        } else if (future.isDone()) {
            if (future2 == null || future2.isCancelled()) {
                this.f106362b = e();
            }
        }
    }

    public final java.util.concurrent.Future e() {
        final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        this.f106363c = c26987xeef691ab;
        this.f106364d = java.lang.System.currentTimeMillis();
        return ((ku5.t0) ku5.t0.f394148d).c(new java.util.concurrent.Callable() { // from class: bw1.n$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                bw1.n nVar = bw1.n.this;
                return nVar.b(c26987xeef691ab, nVar.f106365e);
            }
        });
    }
}
