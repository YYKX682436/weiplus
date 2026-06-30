package r36;

/* loaded from: classes16.dex */
public final class d0 implements x36.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final x36.k f450903d = new x36.k();

    /* renamed from: e, reason: collision with root package name */
    public boolean f450904e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f450905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r36.g0 f450906g;

    public d0(r36.g0 g0Var) {
        this.f450906g = g0Var;
    }

    @Override // x36.f0
    public void U(x36.k kVar, long j17) {
        x36.k kVar2 = this.f450903d;
        kVar2.U(kVar, j17);
        while (kVar2.f533227e >= 16384) {
            a(false);
        }
    }

    public final void a(boolean z17) {
        r36.g0 g0Var;
        long min;
        r36.g0 g0Var2;
        synchronized (this.f450906g) {
            this.f450906g.f450937j.i();
            while (true) {
                try {
                    g0Var = this.f450906g;
                    if (g0Var.f450929b > 0 || this.f450905f || this.f450904e || g0Var.f450938k != null) {
                        break;
                    } else {
                        g0Var.g();
                    }
                } finally {
                }
            }
            g0Var.f450937j.m();
            this.f450906g.b();
            min = java.lang.Math.min(this.f450906g.f450929b, this.f450903d.f533227e);
            g0Var2 = this.f450906g;
            g0Var2.f450929b -= min;
        }
        g0Var2.f450937j.i();
        try {
            r36.g0 g0Var3 = this.f450906g;
            g0Var3.f450931d.l(g0Var3.f450930c, z17 && min == this.f450903d.f533227e, this.f450903d, min);
        } finally {
        }
    }

    @Override // x36.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f450906g) {
            if (this.f450904e) {
                return;
            }
            r36.g0 g0Var = this.f450906g;
            if (!g0Var.f450935h.f450905f) {
                if (this.f450903d.f533227e > 0) {
                    while (this.f450903d.f533227e > 0) {
                        a(true);
                    }
                } else {
                    g0Var.f450931d.l(g0Var.f450930c, true, null, 0L);
                }
            }
            synchronized (this.f450906g) {
                this.f450904e = true;
            }
            this.f450906g.f450931d.m161501x5d03b04();
            this.f450906g.a();
        }
    }

    @Override // x36.f0, java.io.Flushable
    public void flush() {
        synchronized (this.f450906g) {
            this.f450906g.b();
        }
        while (this.f450903d.f533227e > 0) {
            a(false);
            this.f450906g.f450931d.m161501x5d03b04();
        }
    }

    @Override // x36.f0
    public x36.j0 h() {
        return this.f450906g.f450937j;
    }
}
