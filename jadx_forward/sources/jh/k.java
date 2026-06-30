package jh;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable, android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f381250d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Thread f381251e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f381252f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f381253g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f381254h = new android.os.Handler(android.os.Looper.getMainLooper(), this);

    /* renamed from: i, reason: collision with root package name */
    public final long[] f381255i = {0};

    public k(java.lang.String str) {
        this.f381250d = str;
    }

    public void a(java.lang.Runnable runnable, java.lang.String str) {
        synchronized (this.f381253g) {
            if (((java.util.LinkedList) this.f381253g).contains(str)) {
                return;
            }
            ((java.util.LinkedList) this.f381253g).add(str);
            this.f381252f.put(str, runnable);
            synchronized (this) {
                java.lang.Thread thread = this.f381251e;
                if (thread == null || !thread.isAlive()) {
                    java.lang.Thread thread2 = new java.lang.Thread(this, this.f381250d);
                    this.f381251e = thread2;
                    thread2.start();
                    this.f381254h.removeMessages(1);
                    this.f381254h.sendEmptyMessageDelayed(1, 300000L);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (message.what == 1) {
            synchronized (this.f381255i) {
                if (this.f381255i[0] == 0) {
                    return false;
                }
                jh.p pVar = jh.m.f381257h;
                if (pVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.c) pVar).a(jh.o.WarmUpThreadBlocked, new java.lang.Object[0]);
                }
            }
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f381255i) {
            this.f381255i[0] = java.lang.System.currentTimeMillis();
        }
        java.lang.Runnable runnable = null;
        java.lang.String str = null;
        while (true) {
            if (runnable != null) {
                try {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    oj.j.c("Matrix.WarmUpDelegate", "Before '%s' task execution..", str);
                    runnable.run();
                    oj.j.c("Matrix.WarmUpDelegate", "After '%s' task execution..", str);
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    jh.p pVar = jh.m.f381257h;
                    if (pVar != null) {
                        if ("warm-up".equalsIgnoreCase(str)) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.c) pVar).a(jh.o.WarmUpDuration, java.lang.Long.valueOf(currentTimeMillis2));
                        } else if ("consuming-up".equalsIgnoreCase(str)) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.c) pVar).a(jh.o.ConsumeRequestDuration, java.lang.Long.valueOf(currentTimeMillis2));
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    synchronized (this.f381255i) {
                        this.f381255i[0] = 0;
                        this.f381254h.removeMessages(1);
                        throw th6;
                    }
                }
            }
            synchronized (this.f381253g) {
                str = (java.lang.String) ((java.util.LinkedList) this.f381253g).poll();
                if (str == null) {
                    synchronized (this.f381255i) {
                        this.f381255i[0] = 0;
                    }
                    this.f381254h.removeMessages(1);
                    return;
                }
                java.lang.Runnable runnable2 = (java.lang.Runnable) this.f381252f.remove(str);
                if (runnable2 == null) {
                    synchronized (this.f381255i) {
                        this.f381255i[0] = 0;
                    }
                    this.f381254h.removeMessages(1);
                    return;
                }
                runnable = runnable2;
            }
        }
    }
}
