package t26;

/* loaded from: classes14.dex */
public final class a extends t26.d {

    /* renamed from: _immediate */
    private volatile t26.a f76773xea45b232;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f496877e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f496878f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f496879g;

    /* renamed from: h, reason: collision with root package name */
    public final t26.a f496880h;

    public a(android.os.Handler handler, java.lang.String str, boolean z17) {
        super(null);
        this.f496877e = handler;
        this.f496878f = str;
        this.f496879g = z17;
        this.f76773xea45b232 = z17 ? this : null;
        t26.a aVar = this.f76773xea45b232;
        if (aVar == null) {
            aVar = new t26.a(handler, str, true);
            this.f76773xea45b232 = aVar;
        }
        this.f496880h = aVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l lVar, java.lang.Runnable runnable) {
        if (this.f496877e.post(runnable)) {
            return;
        }
        K(lVar, runnable);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public boolean I(oz5.l lVar) {
        return (this.f496879g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), this.f496877e.getLooper())) ? false : true;
    }

    public final void K(oz5.l lVar, java.lang.Runnable runnable) {
        p3325xe03a0797.p3326xc267989b.v2.b(lVar, new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        p3325xe03a0797.p3326xc267989b.q1.f392103c.D(lVar, runnable);
    }

    /* renamed from: equals */
    public boolean m165797xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof t26.a) && ((t26.a) obj).f496877e == this.f496877e;
    }

    /* renamed from: hashCode */
    public int m165798x8cdac1b() {
        return java.lang.System.identityHashCode(this.f496877e);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p0
    /* renamed from: toString */
    public java.lang.String mo143973x9616526c() {
        t26.a aVar;
        java.lang.String str;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        if (this == g3Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                aVar = ((t26.a) g3Var).f496880h;
            } catch (java.lang.UnsupportedOperationException unused) {
                aVar = null;
            }
            str = this == aVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        java.lang.String str2 = this.f496878f;
        if (str2 == null) {
            str2 = this.f496877e.toString();
        }
        if (!this.f496879g) {
            return str2;
        }
        return str2 + ".immediate";
    }

    @Override // p3325xe03a0797.p3326xc267989b.i1
    public p3325xe03a0797.p3326xc267989b.s1 v(long j17, final java.lang.Runnable runnable, oz5.l lVar) {
        if (j17 > 4611686018427387903L) {
            j17 = 4611686018427387903L;
        }
        if (this.f496877e.postDelayed(runnable, j17)) {
            return new p3325xe03a0797.p3326xc267989b.s1() { // from class: t26.a$$a
                @Override // p3325xe03a0797.p3326xc267989b.s1
                /* renamed from: dispose */
                public final void mo144008x63a5261f() {
                    t26.a.this.f496877e.removeCallbacks(runnable);
                }
            };
        }
        K(lVar, runnable);
        return p3325xe03a0797.p3326xc267989b.j3.f392081d;
    }

    @Override // p3325xe03a0797.p3326xc267989b.i1
    public void w(long j17, p3325xe03a0797.p3326xc267989b.q qVar) {
        t26.b bVar = new t26.b(qVar, this);
        if (j17 > 4611686018427387903L) {
            j17 = 4611686018427387903L;
        }
        if (!this.f496877e.postDelayed(bVar, j17)) {
            K(((p3325xe03a0797.p3326xc267989b.r) qVar).f392110e, bVar);
        } else {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).m(new t26.c(this, bVar));
        }
    }

    public a(android.os.Handler handler, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(handler, (i17 & 2) != 0 ? null : str, false);
    }
}
