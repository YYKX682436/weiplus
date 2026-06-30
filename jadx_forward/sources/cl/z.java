package cl;

/* loaded from: classes7.dex */
public class z implements cl.r {

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Looper f124366b;

    /* renamed from: c, reason: collision with root package name */
    public final cl.y f124367c;

    /* renamed from: a, reason: collision with root package name */
    public cl.q f124365a = null;

    /* renamed from: d, reason: collision with root package name */
    public final cl.o0 f124368d = new cl.o0();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f124369e = null;

    public z(android.os.Looper looper) {
        this.f124366b = looper;
        this.f124367c = new cl.y(this, looper);
    }

    @Override // cl.r
    public java.lang.String a() {
        return (java.lang.String) ((java.util.concurrent.LinkedBlockingDeque) this.f124368d.f124241b).peek();
    }

    @Override // cl.r
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("resumeLoopTasks", "should not to be here");
    }

    @Override // cl.r
    public void h(boolean z17) {
        this.f124368d.f124240a = z17;
    }

    @Override // cl.r
    public void i(java.lang.Runnable runnable) {
        this.f124369e = runnable;
    }

    @Override // cl.r
    public boolean j() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("doInnerLoopTask", "should not to be here");
        return true;
    }

    @Override // cl.r
    public boolean k() {
        return this.f124366b.getThread().getId() == java.lang.Thread.currentThread().getId();
    }

    @Override // cl.r
    public void l(java.lang.Runnable runnable, long j17, boolean z17) {
        this.f124367c.post(runnable);
    }

    @Override // cl.r
    public void m() {
        android.os.Looper.loop();
        java.lang.Runnable runnable = this.f124369e;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // cl.r
    public void n(java.lang.Runnable runnable, boolean z17) {
        if (runnable == null) {
            return;
        }
        if (java.lang.Thread.currentThread().getId() != this.f124366b.getThread().getId()) {
            this.f124367c.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (com.p159x477cd522.p160x333422.AbstractC1482xef2ea8c2 e17) {
            cl.q qVar = this.f124365a;
            if (qVar != null) {
                cl.a aVar = ((cl.f) qVar).f124158a.f124150e;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = cl.a.f124098x;
                aVar.f(e17);
            }
        }
        if (this.f124368d.f124240a) {
            ((java.util.concurrent.LinkedBlockingDeque) this.f124368d.f124241b).remove(null);
        }
    }

    @Override // cl.r
    public void o(cl.q qVar) {
        this.f124365a = qVar;
    }

    @Override // cl.r
    /* renamed from: pause */
    public void mo15038x65825f6() {
    }

    @Override // cl.r
    /* renamed from: quit */
    public void mo15039x35224f() {
        this.f124366b.quitSafely();
    }

    @Override // cl.r
    /* renamed from: resume */
    public void mo15040xc84dc82d() {
    }
}
