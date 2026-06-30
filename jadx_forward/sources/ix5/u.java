package ix5;

/* loaded from: classes13.dex */
public final class u extends p3325xe03a0797.p3326xc267989b.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f377209e = jz5.h.b(ix5.t.f377208d);

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        ((java.util.concurrent.ExecutorService) ((jz5.n) this.f377209e).mo141623x754a37bb()).execute(block);
    }

    @Override // p3325xe03a0797.p3326xc267989b.f2
    public java.util.concurrent.Executor K() {
        return (java.util.concurrent.ExecutorService) ((jz5.n) this.f377209e).mo141623x754a37bb();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((java.util.concurrent.ExecutorService) ((jz5.n) this.f377209e).mo141623x754a37bb()).shutdown();
    }
}
