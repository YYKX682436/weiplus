package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f f149089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gi.h1 f149090e;

    public e(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.f fVar, gi.h1 h1Var) {
        this.f149089d = fVar;
        this.f149090e = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BatteryMonitorService", "traceBgn: " + this.f149089d.f149098e + ", id=" + this.f149089d.f149097d);
        final gi.h1 h1Var = this.f149090e;
        final java.lang.String str = this.f149089d.f149098e;
        h1Var.getClass();
        ph.u e17 = gi.d.e();
        final rh.c1 c1Var = e17 == null ? null : new gi.k1(e17.f435829h, "module", str).f353554a;
        if (c1Var != null) {
            final gi.l1 l1Var = new gi.l1(str, c1Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.ModuleJiffiesMonitor", "traceBgn: " + l1Var.hashCode());
            synchronized (h1Var.f353571b) {
                final gi.l1 l1Var2 = (gi.l1) ((java.util.HashMap) h1Var.f353571b).remove(str);
                if (l1Var2 != null) {
                    final long j17 = (l1Var.f353599a - l1Var2.f353599a) / 60000;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.ModuleJiffiesMonitor", "duplicated! deltaMin=" + j17 + ", old=" + l1Var2);
                    h1Var.f476827a.f444870f.post(new java.lang.Runnable() { // from class: gi.h1$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            gi.h1 h1Var2 = gi.h1.this;
                            h1Var2.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Matrix.battery.ModuleJiffiesMonitor", "remove dulicated");
                            gi.l1 l1Var3 = l1Var2;
                            h1Var2.k(l1Var3, true);
                            long j18 = j17;
                            if (j18 > 0) {
                                ap.a.a(1, "errMoudleProfiler", null, null, "dulicated", l1Var3.f353600b, java.lang.String.valueOf(j18));
                            }
                        }
                    });
                }
                ((java.util.HashMap) h1Var.f353571b).put(str, l1Var);
            }
            h1Var.f476827a.f444870f.post(new java.lang.Runnable() { // from class: gi.h1$$c
                @Override // java.lang.Runnable
                public final void run() {
                    gi.h1 h1Var2 = gi.h1.this;
                    gi.l1 l1Var3 = l1Var;
                    rh.c1 c1Var2 = c1Var;
                    java.lang.String str2 = str;
                    h1Var2.getClass();
                    synchronized (l1Var3) {
                        if (!l1Var3.f353602d) {
                            c1Var2.I();
                            if (str2.equals("Finder") || str2.equals("FinderLive")) {
                                final android.content.Context d17 = h1Var2.f476827a.d();
                                java.util.Map map = pj.i.f436443a;
                                ph.u e18 = gi.d.e();
                                if (e18 != null) {
                                    final int i17 = 3000;
                                    e18.f435829h.f444870f.post(new java.lang.Runnable() { // from class: pj.i$$a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            final android.content.Context context = d17;
                                            if (wh.m.w(context)) {
                                                return;
                                            }
                                            final int i18 = i17;
                                            pj.i.b("ampInMicro", "batt_amp_micro_pos", "batt_amp_micro_neg", new m3.i() { // from class: pj.i$$b
                                                @Override // m3.i
                                                public final java.lang.Object get() {
                                                    android.content.Context context2 = context;
                                                    if (!wh.m.w(context2)) {
                                                        long h17 = wh.m.h(context2);
                                                        if (h17 != -1 && h17 != 0) {
                                                            return new pj.j(java.lang.Math.abs(h17) > ((long) i18), false, h17);
                                                        }
                                                    }
                                                    return null;
                                                }
                                            });
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
            });
        }
    }
}
