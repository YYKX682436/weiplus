package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class y2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        final ph.u e17;
        ph.u uVar;
        rh.e3 i17;
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.tencent.mm.feature.performance.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        final int intExtra = intent.getIntExtra("seconds", 1);
        if (intExtra <= 0 || (e17 = gi.d.e()) == null) {
            return;
        }
        gi.u0.f272123a = false;
        if (!ih.d.c() || (uVar = (ph.u) ih.d.d().a(ph.u.class)) == null || (i17 = uVar.f354296h.i(sh.c.class)) == null) {
            return;
        }
        sh.c cVar = (sh.c) i17;
        cVar.o();
        cVar.p(intExtra, new m3.i() { // from class: gi.u0$$v
            @Override // m3.i
            public final java.lang.Object get() {
                rh.c1 c1Var = new rh.c1(ph.u.this.f354296h, "topShell");
                c1Var.F(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.class);
                c1Var.F(uh.g.class);
                return c1Var;
            }
        }, new sh.b() { // from class: gi.u0$$x
            @Override // sh.b
            public final boolean a(final rh.c1 c1Var, long j17) {
                java.util.List o17 = c1Var.o();
                java.util.Iterator it = o17.iterator();
                long j18 = 0;
                while (it.hasNext()) {
                    j18 += ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) ((rh.o2) it.next()).f395486c).f52561g.f395552a).longValue();
                }
                long j19 = intExtra * 100;
                float k17 = sh.c.k(j18, j19);
                qh.u uVar2 = new qh.u();
                uVar2.i();
                java.lang.StringBuilder sb6 = uVar2.f363387a;
                sb6.append((java.lang.Object) "| TOP Thread\tpidNum=");
                sb6.append(java.lang.Integer.valueOf(o17.size()));
                sb6.append((java.lang.Object) "\tcpuLoad=");
                int i18 = 1;
                sb6.append((java.lang.Object) sh.c.m(k17, 1));
                sb6.append((java.lang.Object) "%");
                uVar2.a("\n");
                java.util.Iterator it6 = o17.iterator();
                while (it6.hasNext()) {
                    rh.o2 o2Var = (rh.o2) it6.next();
                    if (o2Var.b()) {
                        uVar2.b("Proc");
                        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c;
                        uVar2.h("pid", java.lang.String.valueOf(jiffiesMonitorFeature$JiffiesSnapshot.f52558d));
                        uVar2.h("cmm", java.lang.String.valueOf(jiffiesMonitorFeature$JiffiesSnapshot.f52560f));
                        uVar2.h("load", sh.c.m(sh.c.k(((java.lang.Long) jiffiesMonitorFeature$JiffiesSnapshot.f52561g.f395552a).longValue(), j19), i18) + "%");
                        uVar2.c("Thread(" + jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.size() + ")");
                        uVar2.g("  TID\tLOAD \tSTATUS \tTHREAD_NAME \tJIFFY");
                        for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry : jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a) {
                            long longValue = ((java.lang.Long) threadJiffiesEntry.f395552a).longValue();
                            sb6.append((java.lang.Object) "|   -> ");
                            sb6.append((java.lang.Object) sh.c.l(java.lang.String.valueOf(threadJiffiesEntry.f52565b), 5));
                            sb6.append((java.lang.Object) "\t");
                            java.util.Iterator it7 = it6;
                            sb6.append((java.lang.Object) sh.c.l(sh.c.m(sh.c.k(longValue, j19), 1), 4));
                            sb6.append((java.lang.Object) "\t");
                            sb6.append((java.lang.Object) (threadJiffiesEntry.f52567d ? "+" : "~"));
                            sb6.append((java.lang.Object) "/");
                            sb6.append((java.lang.Object) threadJiffiesEntry.f52568e);
                            sb6.append((java.lang.Object) "\t");
                            sb6.append((java.lang.Object) sh.c.l(threadJiffiesEntry.f52566c, 16));
                            sb6.append((java.lang.Object) "\t");
                            sb6.append(java.lang.Long.valueOf(longValue));
                            sb6.append((java.lang.Object) "\t");
                            uVar2.a("\n");
                            it6 = it7;
                        }
                    }
                    it6 = it6;
                    i18 = 1;
                }
                uVar2.f();
                try {
                    oj.j.c("HealthStatsHelper", "%s", "\t\n" + uVar2);
                } catch (java.lang.Throwable th6) {
                    oj.j.d("HealthStatsHelper", th6, "log format error", new java.lang.Object[0]);
                }
                c1Var.u(uh.g.class, new wh.t0() { // from class: gi.u0$$b0
                    @Override // wh.t0
                    public final void accept(java.lang.Object obj) {
                        gi.u0.f(com.tencent.mm.sdk.platformtools.x2.f193071a, (uh.g) ((rh.o2) obj).f395486c, rh.c1.this);
                    }
                });
                return gi.u0.f272123a;
            }
        });
    }
}
