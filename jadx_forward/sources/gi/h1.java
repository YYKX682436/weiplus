package gi;

/* loaded from: classes12.dex */
public final class h1 extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f353571b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public android.app.Application.ActivityLifecycleCallbacks f353572c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f353573d;

    @Override // rh.e3
    public int b() {
        return 0;
    }

    @Override // rh.a, rh.e3
    public void c() {
        android.os.PowerManager powerManager;
        super.c();
        this.f353572c = new gi.j1(this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().registerActivityLifecycleCallbacks(this.f353572c);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            try {
                if (!j62.e.g().a("clicfg_battery_thermal_alert", "1", false, true).equals("1") || (powerManager = (android.os.PowerManager) this.f476827a.d().getSystemService("power")) == null) {
                    return;
                }
                java.lang.Object obj = this.f353573d;
                if (obj != null) {
                    try {
                        powerManager.removeThermalStatusListener((android.os.PowerManager.OnThermalStatusChangedListener) obj);
                    } catch (java.lang.Throwable unused) {
                    }
                }
                android.os.PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener = new android.os.PowerManager.OnThermalStatusChangedListener() { // from class: gi.h1$$e
                    @Override // android.os.PowerManager.OnThermalStatusChangedListener
                    public final void onThermalStatusChanged(final int i17) {
                        final gi.h1 h1Var = gi.h1.this;
                        h1Var.f476827a.f444870f.post(new java.lang.Runnable() { // from class: gi.h1$$f
                            @Override // java.lang.Runnable
                            public final void run() {
                                gi.h1.this.getClass();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ThermalStatus = ");
                                int i18 = i17;
                                sb6.append(i18);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.ModuleJiffiesMonitor", sb6.toString());
                                if (android.os.Build.VERSION.SDK_INT < 29) {
                                    java.util.List list = ri.p.f477492a;
                                    return;
                                }
                                int i19 = ri.p.f477493b;
                                ri.p.f477493b = i18;
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                                    boolean c17 = mm.o.c();
                                    boolean z17 = i18 >= 4 && i18 <= 6 && i19 < i18;
                                    if (c17 || z17) {
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        if (c17) {
                                            arrayList.add(java.lang.Boolean.FALSE);
                                        }
                                        if (z17) {
                                            arrayList.add(java.lang.Boolean.TRUE);
                                        }
                                        long currentTimeMillis = ri.p.f477494c != 0 ? (java.lang.System.currentTimeMillis() - ri.p.f477494c) / 60000 : 0L;
                                        qh.b a17 = qh.b.a();
                                        java.lang.String f17 = ri.i.f();
                                        java.lang.String a18 = ri.t.a();
                                        int m17 = wh.m.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#reportThermalStatus");
                                        java.util.Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            boolean booleanValue = ((java.lang.Boolean) it.next()).booleanValue();
                                            android.util.SparseArray sparseArray = ri.s.f477541a;
                                            ri.s.b(booleanValue ? 1 : 0, 5, f17, "duringMin", a17.c(), a17.d(), "thermalStatus".concat(booleanValue ? "Exception" : "Stat"), i18, "lastStatus", i19, "duringMin", currentTimeMillis, a18, "", m17, 0L, 0L, "");
                                            ri.p.f477494c = java.lang.System.currentTimeMillis();
                                            m17 = m17;
                                        }
                                    }
                                }
                            }
                        });
                    }
                };
                this.f353573d = onThermalStatusChangedListener;
                powerManager.addThermalStatusListener(onThermalStatusChangedListener);
            } catch (java.lang.Exception unused2) {
            }
        }
    }

    @Override // rh.a, rh.e3
    public void e() {
        super.e();
        if (this.f353572c != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a().unregisterActivityLifecycleCallbacks(this.f353572c);
        }
        ((java.util.HashMap) this.f353571b).clear();
        if (android.os.Build.VERSION.SDK_INT < 29 || this.f353573d == null) {
            return;
        }
        try {
            android.os.PowerManager powerManager = (android.os.PowerManager) this.f476827a.d().getSystemService("power");
            if (powerManager != null) {
                powerManager.removeThermalStatusListener((android.os.PowerManager.OnThermalStatusChangedListener) this.f353573d);
            }
        } catch (java.lang.Throwable unused) {
        }
        this.f353573d = null;
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.ModuleJiffiesMonitor";
    }

    public final void k(gi.l1 l1Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.ModuleJiffiesMonitor", "traceEnd: " + l1Var.hashCode());
        rh.c1 c1Var = l1Var.f353601c;
        synchronized (l1Var) {
            l1Var.f353602d = true;
            if (!z17) {
                c1Var.l();
            } else if (c1Var instanceof gi.w0) {
                ((gi.w0) c1Var).a();
                c1Var.b();
            }
        }
    }
}
