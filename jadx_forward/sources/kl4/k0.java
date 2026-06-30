package kl4;

/* loaded from: classes15.dex */
public final class k0 extends jm4.m4 {
    public volatile boolean A;

    /* renamed from: d, reason: collision with root package name */
    public android.media.AudioTrack f390462d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f390463e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f390464f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.Condition f390465g;

    /* renamed from: h, reason: collision with root package name */
    public int f390466h;

    /* renamed from: i, reason: collision with root package name */
    public int f390467i;

    /* renamed from: m, reason: collision with root package name */
    public int f390468m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f390469n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f390470o;

    /* renamed from: p, reason: collision with root package name */
    public byte[] f390471p;

    /* renamed from: q, reason: collision with root package name */
    public int f390472q;

    /* renamed from: r, reason: collision with root package name */
    public int f390473r;

    /* renamed from: s, reason: collision with root package name */
    public int f390474s;

    /* renamed from: t, reason: collision with root package name */
    public int f390475t;

    /* renamed from: u, reason: collision with root package name */
    public jm4.n4 f390476u;

    /* renamed from: v, reason: collision with root package name */
    public int f390477v;

    /* renamed from: w, reason: collision with root package name */
    public kl4.b0 f390478w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f390479x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f390480y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f390481z;

    public k0() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.f390464f = reentrantLock;
        this.f390465g = reentrantLock.newCondition();
        kl4.b0 b0Var = kl4.b0.f390417d;
        this.f390478w = b0Var;
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f390479x = p0Var;
        this.f390480y = p0Var;
        this.f390481z = "MicroMsg.TingPlatformStreamPlayer";
        bw5.lq0 lq0Var = bw5.lq0.unknown;
        bw5.lq0 lq0Var2 = bw5.lq0.Error;
        bw5.lq0 lq0Var3 = bw5.lq0.Stop;
        this.f390479x = kz5.c0.i(kz5.c0.i(lq0Var, lq0Var, lq0Var2, lq0Var2, lq0Var2), kz5.c0.i(lq0Var3, lq0Var, bw5.lq0.PlayStart, lq0Var2, lq0Var2), kz5.c0.i(lq0Var3, lq0Var2, lq0Var, bw5.lq0.Pause, bw5.lq0.PlayEnd), kz5.c0.i(lq0Var3, lq0Var2, bw5.lq0.Resume, lq0Var, lq0Var2), kz5.c0.i(lq0Var3, lq0Var2, lq0Var, lq0Var, lq0Var));
        bw5.pq0 pq0Var = bw5.pq0.Idle;
        this.f390480y = kz5.c0.i(pq0Var, pq0Var, bw5.pq0.Playing, bw5.pq0.Paused, pq0Var);
        e(b0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingPlatformStreamPlayer", "TingPlatformStreamPlayer initialized");
    }

    public static final byte[] a(kl4.k0 k0Var) {
        java.util.List list;
        java.util.concurrent.locks.ReentrantLock reentrantLock = k0Var.f390464f;
        reentrantLock.lock();
        while (true) {
            list = k0Var.f390463e;
            try {
                if (!((java.util.ArrayList) list).isEmpty() || k0Var.f390469n || !k0Var.f390470o || k0Var.f390471p != null) {
                    break;
                }
                k0Var.f390465g.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        byte[] bArr = k0Var.f390471p;
        if (!k0Var.f390469n && bArr == null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (!arrayList.isEmpty()) {
                bArr = (byte[]) arrayList.remove(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f390481z, "dequeueBuffer " + bArr.length);
            }
        }
        return bArr;
    }

    public final void d() {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        ((ku5.t0) ku5.t0.f394148d).g(new kl4.f0(this));
        this.f390464f.lock();
        try {
            this.f390469n = true;
            this.f390465g.signalAll();
            this.f390464f.unlock();
            this.f390466h = 0;
            this.f390467i = 0;
            this.f390468m = 0;
            this.f390471p = null;
            this.f390472q = 0;
            this.f390473r = 0;
            this.f390470o = false;
            reentrantLock = this.f390464f;
            reentrantLock.lock();
            try {
                ((java.util.ArrayList) this.f390463e).clear();
                reentrantLock.unlock();
                e(kl4.b0.f390417d);
            } finally {
                reentrantLock.unlock();
            }
        } catch (java.lang.Throwable th6) {
            reentrantLock = this.f390464f;
            throw th6;
        }
    }

    public final void e(kl4.b0 b0Var) {
        kl4.b0 b0Var2 = this.f390478w;
        if (b0Var != b0Var2) {
            bw5.lq0 lq0Var = (bw5.lq0) ((java.util.List) this.f390479x.get(b0Var2.ordinal())).get(b0Var.ordinal());
            int i17 = ((bw5.pq0) this.f390480y.get(b0Var.ordinal())).f113341d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f390481z, "setPlayerState from " + this.f390478w + " to " + b0Var + ", playEvent " + lq0Var);
            this.f390478w = b0Var;
            if (this.f390476u == null || lq0Var == bw5.lq0.unknown) {
                return;
            }
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new kl4.h0(this, i17, lq0Var));
        }
    }

    public final void f() {
        ((ku5.t0) ku5.t0.f394148d).h(new kl4.j0(this), this.f390481z);
    }
}
