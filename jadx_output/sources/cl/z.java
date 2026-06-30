package cl;

/* loaded from: classes7.dex */
public class z implements cl.r {

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Looper f42833b;

    /* renamed from: c, reason: collision with root package name */
    public final cl.y f42834c;

    /* renamed from: a, reason: collision with root package name */
    public cl.q f42832a = null;

    /* renamed from: d, reason: collision with root package name */
    public final cl.o0 f42835d = new cl.o0();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f42836e = null;

    public z(android.os.Looper looper) {
        this.f42833b = looper;
        this.f42834c = new cl.y(this, looper);
    }

    @Override // cl.r
    public java.lang.String a() {
        return (java.lang.String) ((java.util.concurrent.LinkedBlockingDeque) this.f42835d.f42708b).peek();
    }

    @Override // cl.r
    public void e() {
        com.tencent.mars.xlog.Log.e("resumeLoopTasks", "should not to be here");
    }

    @Override // cl.r
    public void h(boolean z17) {
        this.f42835d.f42707a = z17;
    }

    @Override // cl.r
    public void i(java.lang.Runnable runnable) {
        this.f42836e = runnable;
    }

    @Override // cl.r
    public boolean j() {
        com.tencent.mars.xlog.Log.e("doInnerLoopTask", "should not to be here");
        return true;
    }

    @Override // cl.r
    public boolean k() {
        return this.f42833b.getThread().getId() == java.lang.Thread.currentThread().getId();
    }

    @Override // cl.r
    public void l(java.lang.Runnable runnable, long j17, boolean z17) {
        this.f42834c.post(runnable);
    }

    @Override // cl.r
    public void m() {
        android.os.Looper.loop();
        java.lang.Runnable runnable = this.f42836e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // cl.r
    public void n(java.lang.Runnable runnable, boolean z17) {
        if (runnable == null) {
            return;
        }
        if (java.lang.Thread.currentThread().getId() != this.f42833b.getThread().getId()) {
            this.f42834c.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (com.eclipsesource.mmv8.V8ScriptException e17) {
            cl.q qVar = this.f42832a;
            if (qVar != null) {
                cl.a aVar = ((cl.f) qVar).f42625a.f42617e;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = cl.a.f42565x;
                aVar.f(e17);
            }
        }
        if (this.f42835d.f42707a) {
            ((java.util.concurrent.LinkedBlockingDeque) this.f42835d.f42708b).remove(null);
        }
    }

    @Override // cl.r
    public void o(cl.q qVar) {
        this.f42832a = qVar;
    }

    @Override // cl.r
    public void pause() {
    }

    @Override // cl.r
    public void quit() {
        this.f42833b.quitSafely();
    }

    @Override // cl.r
    public void resume() {
    }
}
