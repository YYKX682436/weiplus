package rh;

/* loaded from: classes12.dex */
public final class d2 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public rh.x1 f476893b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f476894c = java.util.Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f476895d = new rh.o1(this);

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
    }

    @Override // rh.e3
    public int b() {
        return Integer.MAX_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        wh.f2 f2Var = new wh.f2(java.lang.String.valueOf(wh.m.r(this.f476827a.d())));
        synchronized ("Matrix.battery.DeviceStatusMonitorFeature") {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f476894c = arrayList;
            arrayList.add(0, f2Var);
        }
        rh.x1 x1Var = this.f476893b;
        x1Var.f477084d = new rh.p1(this);
        if (x1Var.f477082b) {
            return;
        }
        this.f476827a.d();
        if (x1Var.f477082b) {
            return;
        }
        if (!ph.t.o()) {
            throw new java.lang.IllegalStateException("BatteryEventDelegate is not yet init!");
        }
        x1Var.f477083c = new rh.y1(x1Var, true);
        boolean d17 = ph.t.k().c().d();
        x1Var.f477084d.mo40853xab27b508(java.lang.Integer.valueOf(d17 ? 1 : 2));
        x1Var.f477081a = d17;
        ph.t.k().b(x1Var.f477083c);
        x1Var.f477082b = true;
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        rh.x1 x1Var = this.f476893b;
        if (x1Var.f477082b) {
            try {
                if (x1Var.f477083c != null && ph.t.o()) {
                    ph.t.k().p(x1Var.f477083c);
                }
            } catch (java.lang.Throwable unused) {
            }
            x1Var.f477082b = false;
        }
    }

    @Override // rh.a, rh.e3
    public void h(qh.f0 f0Var) {
        super.h(f0Var);
        this.f476893b = new rh.x1();
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.DeviceStatusMonitorFeature";
    }

    public rh.t1 k(android.content.Context context) {
        int i17;
        rh.t1 t1Var = new rh.t1();
        this.f476827a.getClass();
        try {
            i17 = wh.m.l(context);
            oj.j.c("Matrix.battery.BatteryMonitorCore", "onGetTemperature, battery = " + i17, new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.battery.BatteryMonitorCore", th6, "#currentBatteryTemperature error", new java.lang.Object[0]);
            i17 = -1;
        }
        t1Var.f477041d = rh.x2.b(java.lang.Integer.valueOf(i17));
        return t1Var;
    }

    public rh.w1 l(int[] iArr) {
        rh.w1 w1Var = new rh.w1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 : iArr) {
            arrayList.add(rh.x2.b(java.lang.Integer.valueOf(i17)));
        }
        rh.y2 y2Var = new rh.y2();
        y2Var.f477093a = arrayList;
        w1Var.f477071d = y2Var;
        return w1Var;
    }

    public rh.a2 m(long j17) {
        try {
            wh.i2 a17 = wh.j2.a(this.f476894c, j17, 10L, new rh.q1(this));
            rh.a2 a2Var = new rh.a2();
            a2Var.f476898c = a17.f527337c;
            a2Var.f476832d = rh.x2.b(java.lang.Long.valueOf(a17.f527335a));
            a2Var.f476833e = rh.x2.b(java.lang.Long.valueOf(a17.a("1")));
            a2Var.f476834f = rh.x2.b(java.lang.Long.valueOf(a17.a("2")));
            a2Var.f476835g = rh.x2.b(java.lang.Long.valueOf(a17.a("3")));
            a2Var.f476836h = rh.x2.b(java.lang.Long.valueOf(a17.a("4")));
            return a2Var;
        } catch (java.lang.Throwable th6) {
            oj.j.f("Matrix.battery.DeviceStatusMonitorFeature", "configureSnapshot fail: " + th6.getMessage(), new java.lang.Object[0]);
            rh.a2 a2Var2 = new rh.a2();
            a2Var2.f476898c = false;
            return a2Var2;
        }
    }
}
