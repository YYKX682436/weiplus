package cl;

/* loaded from: classes7.dex */
public abstract class u3 implements cl.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f124311a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Thread f124312b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f124315e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f124316f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f124317g;

    /* renamed from: h, reason: collision with root package name */
    public cl.q f124318h;

    /* renamed from: c, reason: collision with root package name */
    public final cl.p0 f124313c = new cl.p0(new java.util.LinkedList());

    /* renamed from: d, reason: collision with root package name */
    public cl.v3 f124314d = cl.v3.NONE;

    /* renamed from: i, reason: collision with root package name */
    public final cl.o0 f124319i = new cl.o0();

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Runnable f124320j = null;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Queue f124321k = new java.util.LinkedList();

    /* renamed from: l, reason: collision with root package name */
    public final java.util.Queue f124322l = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f124323m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f124324n = -1;

    static {
        new java.lang.ThreadLocal();
    }

    public u3(java.lang.String str, boolean z17) {
        java.lang.String str2 = str + "@" + hashCode();
        this.f124311a = str2;
        this.f124312b = java.lang.Thread.currentThread();
        this.f124317g = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "V8JSRuntimeLooper <init> ignoreRemainingTaskWhenLoopEnd?%b", java.lang.Boolean.valueOf(z17));
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("from=");
        sb6.append(android.text.TextUtils.isEmpty(b17) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a() : b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
    }

    @Override // cl.r
    public java.lang.String a() {
        return (java.lang.String) ((java.util.concurrent.LinkedBlockingDeque) this.f124319i.f124241b).peek();
    }

    public final int b() {
        int size;
        synchronized (this.f124313c) {
            size = this.f124313c.size();
        }
        return size;
    }

    public void c() {
        for (java.lang.Runnable runnable : this.f124322l) {
            if (this.f124317g && this.f124316f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "LoopTask break for mLooperEnd");
                return;
            } else {
                t(runnable);
                if (this.f124319i.f124240a) {
                    ((java.util.concurrent.LinkedBlockingDeque) this.f124319i.f124241b).pollFirst();
                }
            }
        }
    }

    public synchronized boolean d() {
        boolean z17;
        z17 = false;
        if (this.f124315e) {
            if (!(this.f124313c.f124248e >= 0)) {
                z17 = true;
            }
        }
        return z17;
    }

    @Override // cl.r
    public void e() {
        java.util.Iterator it = this.f124321k.iterator();
        int i17 = -1;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Runnable runnable = (java.lang.Runnable) it.next();
            if (this.f124317g && this.f124316f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "LoopTask break for mLooperEnd");
                break;
            }
            i17++;
            if (i17 > this.f124324n) {
                this.f124324n = i17;
                t(runnable);
                if (this.f124319i.f124240a) {
                    ((java.util.concurrent.LinkedBlockingDeque) this.f124319i.f124241b).pollFirst();
                }
                if (this.f124323m) {
                    break;
                }
            }
        }
        this.f124323m = true;
    }

    public void f(yz5.a block) {
        ((hr0.a) ((ap.i) i95.n0.c(ap.i.class))).getClass();
        java.lang.String tag = this.f124311a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8()) {
            pj.e.f436436a.g(tag, 100, block);
        }
    }

    public void g() {
        f(new yz5.a() { // from class: cl.u3$$f
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                return "loopTask: copy=" + ((java.util.LinkedList) cl.u3.this.f124321k).size();
            }
        });
        this.f124324n = -1;
        this.f124323m = false;
        for (java.lang.Runnable runnable : this.f124321k) {
            f(new yz5.a() { // from class: cl.u3$$g
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return "loopTaskInner: copy=" + ((java.util.LinkedList) cl.u3.this.f124321k).size();
                }
            });
            if (this.f124317g && this.f124316f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "LoopTask break for mLooperEnd");
                return;
            }
            this.f124324n++;
            t(runnable);
            if (this.f124319i.f124240a) {
                ((java.util.concurrent.LinkedBlockingDeque) this.f124319i.f124241b).pollFirst();
            }
            if (this.f124323m) {
                return;
            }
        }
    }

    @Override // cl.r
    public void h(boolean z17) {
        this.f124319i.f124240a = z17;
    }

    @Override // cl.r
    public void i(java.lang.Runnable runnable) {
        this.f124320j = runnable;
    }

    @Override // cl.r
    public boolean j() {
        if (this.f124316f) {
            this.f124323m = true;
            return true;
        }
        synchronized (this.f124313c) {
            while (true) {
                if (!d() && !u()) {
                    break;
                }
                try {
                    this.f124313c.wait();
                    cl.v3 v3Var = cl.v3.RESUME;
                    cl.v3 v3Var2 = this.f124314d;
                    if (v3Var == v3Var2) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "loop notify by reason:%s", v3Var2);
                    }
                    this.f124314d = cl.v3.NONE;
                } catch (java.lang.InterruptedException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "wait interrupted ; loop end");
                    this.f124312b.interrupt();
                }
            }
            ((java.util.LinkedList) this.f124322l).clear();
            this.f124313c.d(this.f124322l, this.f124315e);
        }
        c();
        return false;
    }

    @Override // cl.r
    public boolean k() {
        return java.lang.Thread.currentThread().getId() == this.f124312b.getId();
    }

    @Override // cl.r
    public void l(java.lang.Runnable runnable, long j17, final boolean z17) {
        if (runnable == null) {
            return;
        }
        if (j17 != 0) {
            throw new java.lang.IllegalStateException("V8JSRuntimeLooper#scheduleDelayed not support.");
        }
        if (this.f124316f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "scheduleDelayed but looper end");
            return;
        }
        synchronized (this.f124313c) {
            try {
                f(new yz5.a() { // from class: cl.u3$$e
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        return "scheduleDelayed: ignorePause=" + z17 + ", from=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(false);
                    }
                });
                cl.p0 p0Var = this.f124313c;
                p0Var.offer(runnable);
                if (z17) {
                    p0Var.f124248e = p0Var.f124247d.size() - 1;
                }
                if (!d()) {
                    this.f124313c.notify();
                }
                if (z17 && this.f124315e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "scheduleDelayed: important task in pause state. queue.size:[%d]", java.lang.Integer.valueOf(b()));
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        s();
    }

    @Override // cl.r
    public void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "loop start");
        while (!this.f124316f) {
            synchronized (this.f124313c) {
                f(new yz5.a() { // from class: cl.u3$$b
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
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
                        this.f124313c.wait();
                        f(new yz5.a() { // from class: cl.u3$$c
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                return "loopInner: mTaskQueueNotifyReason=" + cl.u3.this.f124314d;
                            }
                        });
                        cl.v3 v3Var = cl.v3.RESUME;
                        cl.v3 v3Var2 = this.f124314d;
                        if (v3Var == v3Var2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "loop notify by reason:%s", v3Var2);
                        }
                        this.f124314d = cl.v3.NONE;
                    } catch (java.lang.InterruptedException unused) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "wait interrupted ; loop end");
                        this.f124312b.interrupt();
                    }
                }
                ((java.util.LinkedList) this.f124321k).clear();
                this.f124313c.d(this.f124321k, this.f124315e);
                f(new yz5.a() { // from class: cl.u3$$d
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("copyToWriteUnsafe: task=");
                        cl.u3 u3Var = cl.u3.this;
                        sb6.append(u3Var.f124313c.size());
                        sb6.append(", copy=");
                        sb6.append(((java.util.LinkedList) u3Var.f124321k).size());
                        return sb6.toString();
                    }
                });
            }
            g();
        }
        p();
        synchronized (this.f124313c) {
            this.f124313c.clear();
        }
    }

    @Override // cl.r
    public void n(java.lang.Runnable runnable, final boolean z17) {
        if (runnable == null) {
            return;
        }
        if (this.f124316f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "schedule but looper end");
            return;
        }
        if (java.lang.Thread.currentThread().getId() == this.f124312b.getId()) {
            t(runnable);
            if (this.f124319i.f124240a) {
                ((java.util.concurrent.LinkedBlockingDeque) this.f124319i.f124241b).remove(null);
            }
        } else {
            synchronized (this.f124313c) {
                try {
                    f(new yz5.a() { // from class: cl.u3$$a
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            return "schedule: ignorePause=" + z17 + ", from=" + com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(false);
                        }
                    });
                    cl.p0 p0Var = this.f124313c;
                    p0Var.offer(runnable);
                    if (z17) {
                        p0Var.f124248e = p0Var.f124247d.size() - 1;
                    }
                    if (!d()) {
                        this.f124314d = cl.v3.ENQUEUE;
                        this.f124313c.notify();
                    }
                    if (z17 && this.f124315e) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "schedule: important task in pause state. queue.size:[%d]", java.lang.Integer.valueOf(b()));
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
        this.f124318h = qVar;
    }

    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "loop end");
        java.lang.Runnable runnable = this.f124320j;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // cl.r
    /* renamed from: pause */
    public void mo15038x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "pause instance: queue.size:%d", java.lang.Integer.valueOf(b()));
        synchronized (this) {
            this.f124315e = true;
        }
    }

    public void q() {
    }

    @Override // cl.r
    /* renamed from: quit */
    public void mo15039x35224f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "quit");
        q();
        this.f124316f = true;
        this.f124312b.interrupt();
    }

    public void r() {
    }

    @Override // cl.r
    /* renamed from: resume */
    public void mo15040xc84dc82d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "resume instance: queue.size:%d", java.lang.Integer.valueOf(b()));
        synchronized (this) {
            this.f124315e = false;
        }
        r();
        synchronized (this.f124313c) {
            this.f124314d = cl.v3.RESUME;
            this.f124313c.notify();
        }
    }

    public void s() {
    }

    public final void t(java.lang.Runnable runnable) {
        java.lang.String str = this.f124311a;
        try {
            runnable.run();
        } catch (com.p159x477cd522.p160x333422.AbstractC1482xef2ea8c2 e17) {
            if (this.f124318h != null) {
                cl.a aVar = ((cl.f) this.f124318h).f124158a.f124150e;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = cl.a.f124098x;
                aVar.f(e17);
            }
            if (e17.getCause() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "runTask V8ScriptException: %s, %s", e17, e17.getCause());
            }
        } catch (com.p159x477cd522.p160x333422.C1479xdecf3e19 e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e18, "runTask", new java.lang.Object[0]);
        } catch (java.lang.reflect.UndeclaredThrowableException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "runTask UndeclaredThrowableException: %s %s", e19, e19.getCause());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, th6, "runTask", new java.lang.Object[0]);
            throw th6;
        }
    }

    public boolean u() {
        return this.f124313c.isEmpty();
    }
}
