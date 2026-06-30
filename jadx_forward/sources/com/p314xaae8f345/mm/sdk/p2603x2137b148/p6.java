package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class p6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f274455a;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o6 f274457c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f274458d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f274459e;

    /* renamed from: f, reason: collision with root package name */
    public final long f274460f;

    /* renamed from: g, reason: collision with root package name */
    public final long f274461g;

    /* renamed from: h, reason: collision with root package name */
    public final long f274462h;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f274456b = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f274463i = true;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f274464j = false;

    public p6(com.p314xaae8f345.mm.sdk.p2603x2137b148.o6 o6Var, android.os.Looper looper, int i17, int i18, long j17, long j18) {
        if (o6Var == null) {
            throw new java.lang.IllegalArgumentException("arg appender can not be null!");
        }
        if (looper == null) {
            throw new java.lang.IllegalArgumentException("arg looper can not be null!");
        }
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("arg size can not be <= 0!");
        }
        this.f274457c = o6Var;
        this.f274455a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(i17);
        this.f274460f = i18 > 0 ? i18 : 40L;
        this.f274461g = j17 <= 0 ? 60000L : j17;
        this.f274462h = j18 <= 0 ? 60000L : j18;
        this.f274458d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(looper, (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.sdk.p2603x2137b148.k6(this), false);
        this.f274459e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("RWCache_timeoutChecker", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.sdk.p2603x2137b148.l6(this), false);
    }

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RWCache", "summer appendAll force: " + z17 + " tid: " + java.lang.Thread.currentThread().getId() + " holderMap size: " + this.f274456b.size());
        synchronized (this) {
            this.f274463i = true;
            if (this.f274456b.isEmpty()) {
                return;
            }
            if (this.f274457c.B()) {
                java.util.Iterator it = this.f274456b.entrySet().iterator();
                if (z17) {
                    while (it.hasNext()) {
                        this.f274457c.d0(this, (com.p314xaae8f345.mm.sdk.p2603x2137b148.n6) ((java.util.Map.Entry) it.next()).getValue());
                        it.remove();
                    }
                } else {
                    this.f274464j = false;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f274459e;
                    long j17 = this.f274462h;
                    b4Var.c(j17, j17);
                    while (!this.f274464j && it.hasNext()) {
                        this.f274457c.d0(this, (com.p314xaae8f345.mm.sdk.p2603x2137b148.n6) ((java.util.Map.Entry) it.next()).getValue());
                        it.remove();
                    }
                    if (this.f274464j) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RWCache", "summer appendAll timeout size[%d] hasNext[%b] end", java.lang.Integer.valueOf(this.f274456b.size()), java.lang.Boolean.valueOf(it.hasNext()));
                    }
                    this.f274459e.d();
                }
                this.f274457c.u();
            }
        }
    }

    public java.lang.Object b(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f274455a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m6 m6Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.m6) r2Var.get(obj);
        if (m6Var != null) {
            return m6Var.f274388a;
        }
        r2Var.put(obj, new com.p314xaae8f345.mm.sdk.p2603x2137b148.m6(null));
        return null;
    }

    public boolean c(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m6 m6Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.m6) this.f274455a.get(obj);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.m6 m6Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.m6(obj2);
        if (m6Var2.m77766xb2c87fbf(m6Var)) {
            return false;
        }
        this.f274455a.put(obj, m6Var2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n6 n6Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n6();
        n6Var.f274406b = obj;
        n6Var.f274407c = obj2;
        n6Var.f274405a = obj2 == null ? 2 : 1;
        synchronized (this) {
            this.f274456b.put(obj, n6Var);
            if (this.f274463i && this.f274456b.size() > this.f274460f) {
                this.f274458d.c(0L, 0L);
                this.f274463i = false;
            } else if (this.f274458d.e()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f274458d;
                long j17 = this.f274461g;
                b4Var.c(j17, j17);
            }
        }
        return true;
    }
}
