package qh;

/* loaded from: classes12.dex */
public final class g0 extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f444883b;

    /* renamed from: c, reason: collision with root package name */
    public long f444884c;

    /* renamed from: d, reason: collision with root package name */
    public long f444885d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f444886e;

    public g0() {
        super(true);
        this.f444886e = "Matrix.battery.ChargeStats#" + hashCode();
    }

    @Override // ph.f, ph.g
    public boolean g(ph.c batteryState, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        boolean z18 = this.f444883b;
        java.lang.String str = this.f444886e;
        if (z17 != z18) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (z17) {
                oj.j.c(str, "onChargingChanged: " + z17 + ", start collect", new java.lang.Object[0]);
                this.f444884c = currentTimeMillis;
            } else {
                long j17 = this.f444884c;
                if (1 <= j17 && currentTimeMillis > j17) {
                    long j18 = currentTimeMillis - j17;
                    oj.j.c(str, "onChargingChanged: " + z17 + " +" + j18 + "ms", new java.lang.Object[0]);
                    this.f444885d = this.f444885d + j18;
                } else {
                    oj.j.c(str, "onChargingChanged: " + z17 + " +$0ms, last=" + wh.m.c(this.f444884c, null, 2, null) + ", curr=" + wh.m.c(currentTimeMillis, null, 2, null), new java.lang.Object[0]);
                }
                this.f444884c = 0L;
            }
            this.f444883b = z17;
        } else {
            oj.j.f(str, "repeat status: " + z17, new java.lang.Object[0]);
        }
        return !this.f435796a;
    }

    public final void h() {
        if (ph.t.f435816k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                r2 = ph.t.f435816k != null;
            }
        }
        if (!r2) {
            throw new java.lang.RuntimeException("BatteryEventDelegate is not initialized");
        }
        if (ph.t.f435816k == null) {
            synchronized ("Matrix.battery.LifeCycle") {
                if (ph.t.f435816k == null) {
                    throw new java.lang.IllegalStateException("Call #init() first!".toString());
                }
            }
        }
        ph.t tVar = ph.t.f435816k;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        tVar.p(this);
        oj.j.c(this.f444886e, "finish", new java.lang.Object[0]);
    }

    public final void i() {
        ph.e eVar = ph.t.f435818m;
        if (!eVar.b()) {
            throw new java.lang.RuntimeException("BatteryEventDelegate is not initialized");
        }
        boolean d17 = eVar.a().c().d();
        this.f444883b = d17;
        this.f444884c = d17 ? java.lang.System.currentTimeMillis() : 0L;
        eVar.a().b(this);
        oj.j.c(this.f444886e, "start: sticky=" + this.f444883b, new java.lang.Object[0]);
    }

    public final int j(long j17, int i17) {
        if (j17 <= 0) {
            throw new java.lang.IllegalArgumentException("durationMs must > 0");
        }
        int b17 = a06.d.b((((float) this.f444885d) * 100.0f) / ((float) j17));
        java.lang.String str = this.f444886e;
        oj.j.c(str, "correctify charging ratio: " + i17 + ">>" + b17, new java.lang.Object[0]);
        if (b17 < i17 || b17 < 0 || 100 < b17) {
            oj.j.f(str, "collectedMs=" + this.f444885d + ", durationMs=" + j17, new java.lang.Object[0]);
        }
        return b17 < i17 ? i17 : b17;
    }
}
