package l36;

/* loaded from: classes16.dex */
public final class j implements java.io.Closeable, java.io.Flushable {

    /* renamed from: d, reason: collision with root package name */
    public final n36.m f397049d;

    /* renamed from: e, reason: collision with root package name */
    public final n36.k f397050e;

    public j(java.io.File file, long j17) {
        s36.b bVar = s36.b.f484378a;
        this.f397049d = new l36.d(this);
        java.util.regex.Pattern pattern = n36.k.A;
        if (j17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
        byte[] bArr = m36.e.f404919a;
        this.f397050e = new n36.k(bVar, file, 201105, 2, j17, new java.util.concurrent.ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new m36.d("OkHttp DiskLruCache", true)));
    }

    public static java.lang.String a(l36.k0 k0Var) {
        return x36.o.f533229h.a(k0Var.f397071h).k("MD5").m();
    }

    public static int b(x36.m mVar) {
        try {
            long p17 = mVar.p1();
            java.lang.String L0 = mVar.L0();
            if (p17 >= 0 && p17 <= 2147483647L && L0.isEmpty()) {
                return (int) p17;
            }
            throw new java.io.IOException("expected an int but was \"" + p17 + L0 + "\"");
        } catch (java.lang.NumberFormatException e17) {
            throw new java.io.IOException(e17.getMessage());
        }
    }

    public void c(l36.w0 w0Var) {
        n36.k kVar = this.f397050e;
        java.lang.String a17 = a(w0Var.f397214a);
        synchronized (kVar) {
            kVar.i();
            kVar.a();
            kVar.z(a17);
            n36.i iVar = (n36.i) kVar.f416378q.get(a17);
            if (iVar == null) {
                return;
            }
            kVar.w(iVar);
            if (kVar.f416376o <= kVar.f416374m) {
                kVar.f416383v = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f397050e.close();
    }

    @Override // java.io.Flushable
    public void flush() {
        this.f397050e.flush();
    }
}
