package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class y2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        final ph.u e17;
        ph.u uVar;
        rh.e3 i17;
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.w1) ((ob0.a3) i95.n0.c(ob0.a3.class))).getClass();
        final int intExtra = intent.getIntExtra("seconds", 1);
        if (intExtra <= 0 || (e17 = gi.d.e()) == null) {
            return;
        }
        gi.u0.f353656a = false;
        if (!ih.d.c() || (uVar = (ph.u) ih.d.d().a(ph.u.class)) == null || (i17 = uVar.f435829h.i(sh.c.class)) == null) {
            return;
        }
        sh.c cVar = (sh.c) i17;
        cVar.o();
        cVar.p(intExtra, new m3.i() { // from class: gi.u0$$v
            @Override // m3.i
            public final java.lang.Object get() {
                rh.c1 c1Var = new rh.c1(ph.u.this.f435829h, "topShell");
                c1Var.F(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.class);
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
                    j18 += ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) ((rh.o2) it.next()).f477019c).f134094g.f477085a).longValue();
                }
                long j19 = intExtra * 100;
                float k17 = sh.c.k(j18, j19);
                qh.u uVar2 = new qh.u();
                uVar2.i();
                java.lang.StringBuilder sb6 = uVar2.f444920a;
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
                        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c;
                        uVar2.h("pid", java.lang.String.valueOf(c4635xec0343cc.f134091d));
                        uVar2.h("cmm", java.lang.String.valueOf(c4635xec0343cc.f134093f));
                        uVar2.h("load", sh.c.m(sh.c.k(((java.lang.Long) c4635xec0343cc.f134094g.f477085a).longValue(), j19), i18) + "%");
                        uVar2.c("Thread(" + c4635xec0343cc.f134095h.f477093a.size() + ")");
                        uVar2.g("  TID\tLOAD \tSTATUS \tTHREAD_NAME \tJIFFY");
                        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry : c4635xec0343cc.f134095h.f477093a) {
                            long longValue = ((java.lang.Long) threadJiffiesEntry.f477085a).longValue();
                            sb6.append((java.lang.Object) "|   -> ");
                            sb6.append((java.lang.Object) sh.c.l(java.lang.String.valueOf(threadJiffiesEntry.f134098b), 5));
                            sb6.append((java.lang.Object) "\t");
                            java.util.Iterator it7 = it6;
                            sb6.append((java.lang.Object) sh.c.l(sh.c.m(sh.c.k(longValue, j19), 1), 4));
                            sb6.append((java.lang.Object) "\t");
                            sb6.append((java.lang.Object) (threadJiffiesEntry.f134100d ? "+" : "~"));
                            sb6.append((java.lang.Object) "/");
                            sb6.append((java.lang.Object) threadJiffiesEntry.f134101e);
                            sb6.append((java.lang.Object) "\t");
                            sb6.append((java.lang.Object) sh.c.l(threadJiffiesEntry.f134099c, 16));
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
                    /* renamed from: accept */
                    public final void mo40853xab27b508(java.lang.Object obj) {
                        gi.u0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (uh.g) ((rh.o2) obj).f477019c, rh.c1.this);
                    }
                });
                return gi.u0.f353656a;
            }
        });
    }
}
