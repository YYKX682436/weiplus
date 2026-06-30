package cl;

/* loaded from: classes7.dex */
public abstract class u3 implements cl.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f42778a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Thread f42779b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42782e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f42783f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f42784g;

    /* renamed from: h, reason: collision with root package name */
    public cl.q f42785h;

    /* renamed from: c, reason: collision with root package name */
    public final cl.p0 f42780c = new cl.p0(new java.util.LinkedList());

    /* renamed from: d, reason: collision with root package name */
    public cl.v3 f42781d = cl.v3.NONE;

    /* renamed from: i, reason: collision with root package name */
    public final cl.o0 f42786i = new cl.o0();

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Runnable f42787j = null;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Queue f42788k = new java.util.LinkedList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Queue f42789l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f42790m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f42791n = -1;

    static {
        new java.lang.ThreadLocal();
    }

    public u3(java.lang.String str, boolean z17) {
        java.lang.String str2 = str + "@" + hashCode();
        this.f42778a = str2;
        this.f42779b = java.lang.Thread.currentThread();
        this.f42784g = z17;
        com.tencent.mars.xlog.Log.i(str2, "V8JSRuntimeLooper <init> ignoreRemainingTaskWhenLoopEnd?%b", java.lang.Boolean.valueOf(z17));
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.z3.b(false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("from=");
        sb6.append(android.text.TextUtils.isEmpty(b17) ? com.tencent.mm.sdk.platformtools.z3.a() : b17);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
    }

    @Override // cl.r
    public java.lang.String a() {
        return (java.lang.String) ((java.util.concurrent.LinkedBlockingDeque) this.f42786i.f42708b).peek();
    }

    public final int b() {
        int size;
        synchronized (this.f42780c) {
            size = this.f42780c.size();
        }
        return size;
    }

    public void c() {
        for (java.lang.Runnable runnable : this.f42789l) {
            if (this.f42784g && this.f42783f) {
                com.tencent.mars.xlog.Log.i(this.f42778a, "LoopTask break for mLooperEnd");
                return;
            } else {
                t(runnable);
                if (this.f42786i.f42707a) {
                    ((java.util.concurrent.LinkedBlockingDeque) this.f42786i.f42708b).pollFirst();
                }
            }
        }
    }

    public synchronized boolean d() {
        boolean z17;
        z17 = false;
        if (this.f42782e) {
            if (!(this.f42780c.f42715e >= 0)) {
                z17 = true;
            }
        }
        return z17;
    }

    @Override // cl.r
    public void e() {
        java.util.Iterator it = this.f42788k.iterator();
        int i17 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Runnable runnable = (java.lang.Runnable) it.next();
            if (this.f42784g && this.f42783f) {
                com.tencent.mars.xlog.Log.i(this.f42778a, "LoopTask break for mLooperEnd");
                break;
            }
            i17++;
            if (i17 > this.f42791n) {
                this.f42791n = i17;
                t(runnable);
                if (this.f42786i.f42707a) {
                    ((java.util.concurrent.LinkedBlockingDeque) this.f42786i.f42708b).pollFirst();
                }
                if (this.f42790m) {
                    break;
                }
            }
        }
        this.f42790m = true;
    }

    public void f(yz5.a block) {
        ((hr0.a) ((ap.i) i95.n0.c(ap.i.class))).getClass();
        java.lang.String tag = this.f42778a;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(block, "block");
        if (com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.isBackground()) {
            pj.e.f354903a.g(tag, 100, block);
        }
    }

    public void g() {
        f(new yz5.a() { // from class: cl.u3$$f
            @Override // yz5.a
            public final java.lang.Object invoke() {
                return "loopTask: copy=" + ((java.util.LinkedList) cl.u3.this.f42788k).size();
            }
        });
        this.f42791n = -1;
        this.f42790m = false;
        for (java.lang.Runnable runnable : this.f42788k) {
            f(new yz5.a() { // from class: cl.u3$$g
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return "loopTaskInner: copy=" + ((java.util.LinkedList) cl.u3.this.f42788k).size();
                }
            });
            if (this.f42784g && this.f42783f) {
                com.tencent.mars.xlog.Log.i(this.f42778a, "LoopTask break for mLooperEnd");
                return;
            }
            this.f42791n++;
            t(runnable);
            if (this.f42786i.f42707a) {
                ((java.util.concurrent.LinkedBlockingDeque) this.f42786i.f42708b).pollFirst();
            }
            if (this.f42790m) {
                return;
            }
        }
    }

    @Override // cl.r
    public void h(boolean z17) {
        this.f42786i.f42707a = z17;
    }

    @Override // cl.r
    public void i(java.lang.Runnable runnable) {
        this.f42787j = runnable;
    }

    @Override // cl.r
    public boolean j() {
        if (this.f42783f) {
            this.f42790m = true;
            return true;
        }
        synchronized (this.f42780c) {
            while (true) {
                if (!d() && !u()) {
                    break;
                }
                try {
                    this.f42780c.wait();
                    cl.v3 v3Var = cl.v3.RESUME;
                    cl.v3 v3Var2 = this.f42781d;
                    if (v3Var == v3Var2) {
                        com.tencent.mars.xlog.Log.i(this.f42778a, "loop notify by reason:%s", v3Var2);
                    }
                    this.f42781d = cl.v3.NONE;
                } catch (java.lang.InterruptedException unused) {
                    com.tencent.mars.xlog.Log.i(this.f42778a, "wait interrupted ; loop end");
                    this.f42779b.interrupt();
                }
            }
            ((java.util.LinkedList) this.f42789l).clear();
            this.f42780c.d(this.f42789l, this.f42782e);
        }
        c();
        return false;
    }

    @Override // cl.r
    public boolean k() {
        return java.lang.Thread.currentThread().getId() == this.f42779b.getId();
    }

    @Override // cl.r
    public void l(java.lang.Runnable runnable, long j17, final boolean z17) {
        if (runnable == null) {
            return;
        }
        if (j17 != 0) {
            throw new java.lang.IllegalStateException("V8JSRuntimeLooper#scheduleDelayed not support.");
        }
        if (this.f42783f) {
            com.tencent.mars.xlog.Log.i(this.f42778a, "scheduleDelayed but looper end");
            return;
        }
        synchronized (this.f42780c) {
            try {
                f(new yz5.a() { // from class: cl.u3$$e
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return "scheduleDelayed: ignorePause=" + z17 + ", from=" + com.tencent.mm.sdk.platformtools.z3.b(false);
                    }
                });
                cl.p0 p0Var = this.f42780c;
                p0Var.offer(runnable);
                if (z17) {
                    p0Var.f42715e = p0Var.f42714d.size() - 1;
                }
                if (!d()) {
                    this.f42780c.notify();
                }
                if (z17 && this.f42782e) {
                    com.tencent.mars.xlog.Log.i(this.f42778a, "scheduleDelayed: important task in pause state. queue.size:[%d]", java.lang.Integer.valueOf(b()));
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        s();
    }

    @Override // cl.r
    public void m() {
        com.tencent.mars.xlog.Log.i(this.f42778a, "loop start");
        while (!this.f42783f) {
            synchronized (this.f42780c) {
                f(new yz5.a() { // from class: cl.u3$$b
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loopOuter: isPaused=");
                        cl.u3 u3Var = cl.u3.this;
                        sb6.append(u3Var.d());
                        sb6.append(", waitCondition=");
                        sb6.append(u3Var.u());
                        return sb6.toString();
                    }
                });
                while (true) {
                    if (!d() && !u()) {
                        break;
                    }
                    try {
                        this.f42780c.wait();
                        f(new yz5.a() { // from class: cl.u3$$c
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                return "loopInner: mTaskQueueNotifyReason=" + cl.u3.this.f42781d;
                            }
                        });
                        cl.v3 v3Var = cl.v3.RESUME;
                        cl.v3 v3Var2 = this.f42781d;
                        if (v3Var == v3Var2) {
                            com.tencent.mars.xlog.Log.i(this.f42778a, "loop notify by reason:%s", v3Var2);
                        }
                        this.f42781d = cl.v3.NONE;
                    } catch (java.lang.InterruptedException unused) {
                        com.tencent.mars.xlog.Log.i(this.f42778a, "wait interrupted ; loop end");
                        this.f42779b.interrupt();
                    }
                }
                ((java.util.LinkedList) this.f42788k).clear();
                this.f42780c.d(this.f42788k, this.f42782e);
                f(new yz5.a() { // from class: cl.u3$$d
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("copyToWriteUnsafe: task=");
                        cl.u3 u3Var = cl.u3.this;
                        sb6.append(u3Var.f42780c.size());
                        sb6.append(", copy=");
                        sb6.append(((java.util.LinkedList) u3Var.f42788k).size());
                        return sb6.toString();
                    }
                });
            }
            g();
        }
        p();
        synchronized (this.f42780c) {
            this.f42780c.clear();
        }
    }

    @Override // cl.r
    public void n(java.lang.Runnable runnable, final boolean z17) {
        if (runnable == null) {
            return;
        }
        if (this.f42783f) {
            com.tencent.mars.xlog.Log.i(this.f42778a, "schedule but looper end");
            return;
        }
        if (java.lang.Thread.currentThread().getId() == this.f42779b.getId()) {
            t(runnable);
            if (this.f42786i.f42707a) {
                ((java.util.concurrent.LinkedBlockingDeque) this.f42786i.f42708b).remove(null);
            }
        } else {
            synchronized (this.f42780c) {
                try {
                    f(new yz5.a() { // from class: cl.u3$$a
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            return "schedule: ignorePause=" + z17 + ", from=" + com.tencent.mm.sdk.platformtools.z3.b(false);
                        }
                    });
                    cl.p0 p0Var = this.f42780c;
                    p0Var.offer(runnable);
                    if (z17) {
                        p0Var.f42715e = p0Var.f42714d.size() - 1;
                    }
                    if (!d()) {
                        this.f42781d = cl.v3.ENQUEUE;
                        this.f42780c.notify();
                    }
                    if (z17 && this.f42782e) {
                        com.tencent.mars.xlog.Log.i(this.f42778a, "schedule: important task in pause state. queue.size:[%d]", java.lang.Integer.valueOf(b()));
                    }
                } catch (java.lang.Throwable th6) {
                    throw th6;
                }
            }
        }
        s();
    }

    @Override // cl.r
    public void o(cl.q qVar) {
        this.f42785h = qVar;
    }

    public void p() {
        com.tencent.mars.xlog.Log.i(this.f42778a, "loop end");
        java.lang.Runnable runnable = this.f42787j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // cl.r
    public void pause() {
        com.tencent.mars.xlog.Log.i(this.f42778a, "pause instance: queue.size:%d", java.lang.Integer.valueOf(b()));
        synchronized (this) {
            this.f42782e = true;
        }
    }

    public void q() {
    }

    @Override // cl.r
    public void quit() {
        com.tencent.mars.xlog.Log.i(this.f42778a, "quit");
        q();
        this.f42783f = true;
        this.f42779b.interrupt();
    }

    public void r() {
    }

    @Override // cl.r
    public void resume() {
        com.tencent.mars.xlog.Log.i(this.f42778a, "resume instance: queue.size:%d", java.lang.Integer.valueOf(b()));
        synchronized (this) {
            this.f42782e = false;
        }
        r();
        synchronized (this.f42780c) {
            this.f42781d = cl.v3.RESUME;
            this.f42780c.notify();
        }
    }

    public void s() {
    }

    public final void t(java.lang.Runnable runnable) {
        java.lang.String str = this.f42778a;
        try {
            runnable.run();
        } catch (com.eclipsesource.mmv8.V8ScriptException e17) {
            if (this.f42785h != null) {
                cl.a aVar = ((cl.f) this.f42785h).f42625a.f42617e;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = cl.a.f42565x;
                aVar.f(e17);
            }
            if (e17.getCause() != null) {
                com.tencent.mars.xlog.Log.e(str, "runTask V8ScriptException: %s, %s", e17, e17.getCause());
            }
        } catch (com.eclipsesource.mmv8.V8RuntimeException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "runTask", new java.lang.Object[0]);
        } catch (java.lang.reflect.UndeclaredThrowableException e19) {
            com.tencent.mars.xlog.Log.e(str, "runTask UndeclaredThrowableException: %s %s", e19, e19.getCause());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "runTask", new java.lang.Object[0]);
            throw th6;
        }
    }

    public boolean u() {
        return this.f42780c.isEmpty();
    }
}
