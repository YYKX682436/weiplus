package xu5;

/* loaded from: classes12.dex */
public class v extends wu5.l {

    /* renamed from: y, reason: collision with root package name */
    public final xu5.b f538875y;

    /* renamed from: z, reason: collision with root package name */
    public xu5.u f538876z;

    public v(java.lang.Runnable runnable, long j17, java.lang.String str, boolean z17) {
        super(runnable, j17, z17);
        xu5.b bVar;
        java.lang.ThreadLocal threadLocal = xu5.b.f538831c;
        synchronized (xu5.b.class) {
            bVar = (xu5.b) xu5.b.f538833e.get(str);
            bVar = bVar == null ? new xu5.b(str) : bVar;
        }
        this.f538875y = bVar;
    }

    @Override // wu5.l, java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        if (!super.cancel(z17)) {
            return false;
        }
        xu5.u uVar = this.f538876z;
        if (uVar != null) {
            ((xu5.d) uVar).getClass();
            xu5.t tVar = this.f538875y.f538836b;
            synchronized (tVar) {
                if (tVar.f538871h.remove(this)) {
                    tVar.f538867d.removeMessages(1, this);
                }
                java.util.Iterator it = tVar.f538872i.iterator();
                while (it.hasNext()) {
                    xu5.v vVar = (xu5.v) it.next();
                    if (vVar == this) {
                        if (!vVar.isCancelled()) {
                            vVar.cancel(false);
                        }
                        it.remove();
                    }
                }
            }
        }
        return true;
    }

    @Override // wu5.l, java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        xu5.b bVar = this.f538875y;
        try {
            java.lang.ThreadLocal threadLocal = xu5.b.f538831c;
            threadLocal.set(bVar);
            super.run();
            threadLocal.set(null);
            xu5.u uVar = this.f538876z;
            if (uVar != null) {
                ((xu5.d) uVar).a(bVar, this);
            }
        } catch (java.lang.Throwable th6) {
            xu5.b.f538831c.set(null);
            xu5.u uVar2 = this.f538876z;
            if (uVar2 != null) {
                ((xu5.d) uVar2).a(bVar, this);
            }
            throw th6;
        }
    }

    public v(java.util.concurrent.Callable callable, long j17, java.lang.String str, boolean z17) {
        super(callable, j17, z17);
        xu5.b bVar;
        java.lang.ThreadLocal threadLocal = xu5.b.f538831c;
        synchronized (xu5.b.class) {
            bVar = (xu5.b) xu5.b.f538833e.get(str);
            bVar = bVar == null ? new xu5.b(str) : bVar;
        }
        this.f538875y = bVar;
    }
}
