package aw1;

/* loaded from: classes12.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final aw1.a0 f14494i = new aw1.a0(null);

    /* renamed from: d, reason: collision with root package name */
    public final aw1.x f14495d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14496e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.vfs.l6 f14497f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.wcdb.support.CancellationSignal f14498g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f14499h;

    public b0(aw1.x callback, boolean z17, com.tencent.mm.vfs.l6 l6Var, com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f14495d = callback;
        this.f14496e = z17;
        this.f14497f = l6Var;
        this.f14498g = cancellationSignal;
        this.f14499h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        aw1.x xVar = this.f14495d;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f14498g;
        if (cancellationSignal != null) {
            try {
                cancellationSignal.throwIfCanceled();
            } catch (com.tencent.wcdb.support.OperationCanceledException unused) {
                xVar.a(true);
                return;
            }
        }
        java.lang.Runnable runnable = this.f14499h;
        if (runnable != null) {
            runnable.run();
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        f14494i.b();
        java.util.Iterator it = ((pm5.b) com.tencent.mm.vfs.b2.g(this.f14496e, this.f14497f)).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            xVar.b((com.tencent.mm.vfs.k6) it.next());
            i17++;
            if ((i17 & 15) == 0 && cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
        }
        xVar.a(false);
    }
}
