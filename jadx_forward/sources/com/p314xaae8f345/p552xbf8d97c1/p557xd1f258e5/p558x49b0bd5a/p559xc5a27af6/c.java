package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6;

/* loaded from: classes12.dex */
public final class c extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.RunnableC4637x6ac2667 f134130b = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.RunnableC4637x6ac2667(this);

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.RunnableC4637x6ac2667 f134131c = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.RunnableC4637x6ac2667(this);

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.RunnableC4637x6ac2667 runnableC4637x6ac2667 = this.f134130b;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.RunnableC4637x6ac2667 runnableC4637x6ac26672 = this.f134131c;
        if (z17) {
            runnableC4637x6ac2667.a();
            synchronized (runnableC4637x6ac26672.f134112e) {
                android.os.Handler handler = runnableC4637x6ac26672.f134113f;
                if (handler != null) {
                    handler.removeCallbacks(runnableC4637x6ac26672);
                    runnableC4637x6ac26672.f134113f.getLooper().quit();
                    runnableC4637x6ac26672.f134113f = null;
                }
            }
            return;
        }
        runnableC4637x6ac26672.a();
        synchronized (runnableC4637x6ac2667.f134112e) {
            android.os.Handler handler2 = runnableC4637x6ac2667.f134113f;
            if (handler2 != null) {
                handler2.removeCallbacks(runnableC4637x6ac2667);
                runnableC4637x6ac2667.f134113f.getLooper().quit();
                runnableC4637x6ac2667.f134113f = null;
            }
        }
    }

    @Override // rh.e3
    public int b() {
        return Integer.MAX_VALUE;
    }

    @Override // rh.a, rh.e3
    public void c() {
        super.c();
        this.f476827a.f444868d.getClass();
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.JiffiesMonitorFeature";
    }

    public com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc k(boolean z17) {
        boolean z18 = this.f476827a.f444868d.f444830p;
        if (z18 || z17) {
            return com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.a(android.os.Process.myPid(), z17), z18);
        }
        throw new java.lang.IllegalStateException("stats nothing!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.ArrayList] */
    public com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc l() {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85 c4639x13061b85;
        android.content.Context d17 = this.f476827a.d();
        qh.a0 a0Var = this.f476827a.f444868d;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc c4638x3e8bd3fc = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc();
        java.util.List n17 = sh.c.n(d17);
        java.util.ArrayList arrayList = (java.util.ArrayList) n17;
        c4638x3e8bd3fc.f134116e = new java.util.ArrayList(arrayList.size());
        int i17 = 0;
        oj.j.c("Matrix.battery.JiffiesMonitorFeature", "currProcList: " + n17, new java.lang.Object[0]);
        java.util.Iterator it = arrayList.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            int intValue = ((java.lang.Integer) dVar.f404625a).intValue();
            java.lang.String valueOf = java.lang.String.valueOf(dVar.f404626b);
            if (wh.u1.a(intValue)) {
                oj.j.c("Matrix.battery.JiffiesMonitorFeature", "proc: " + intValue, new java.lang.Object[i17]);
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc b17 = com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.a(intValue, true), a0Var.f444830p);
                b17.f134093f = th.o.c(valueOf);
                j17 += ((java.lang.Long) b17.f134094g.f477085a).longValue();
                c4638x3e8bd3fc.f134116e.add(b17);
            } else {
                wh.u0 u0Var = a0Var.B;
                if (u0Var == null || (c4639x13061b85 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85) ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.C10656x58a5d54) u0Var).mo40854x58b836e(dVar)) == null) {
                    oj.j.c("Matrix.battery.JiffiesMonitorFeature", "skip: " + intValue, new java.lang.Object[0]);
                    i17 = 0;
                    j17 = j17;
                } else {
                    oj.j.c("Matrix.battery.JiffiesMonitorFeature", "ipc: " + intValue, new java.lang.Object[i17]);
                    com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc(null);
                    c4635xec0343cc.f134091d = c4639x13061b85.f134118d;
                    c4635xec0343cc.f134093f = c4639x13061b85.f134119e;
                    c4635xec0343cc.f134094g = rh.x2.b(java.lang.Long.valueOf(c4639x13061b85.f134120f));
                    ?? emptyList = java.util.Collections.emptyList();
                    if (!c4639x13061b85.f134122h.isEmpty()) {
                        emptyList = new java.util.ArrayList(c4639x13061b85.f134122h.size());
                        for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4639x13061b85.IpcThreadJiffies ipcThreadJiffies : c4639x13061b85.f134122h) {
                            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot(java.lang.Long.valueOf(ipcThreadJiffies.f134126g));
                            threadJiffiesSnapshot.f134099c = ipcThreadJiffies.f134124e;
                            threadJiffiesSnapshot.f134101e = ipcThreadJiffies.f134125f;
                            threadJiffiesSnapshot.f134098b = ipcThreadJiffies.f134123d;
                            threadJiffiesSnapshot.f134100d = true;
                            emptyList.add(threadJiffiesSnapshot);
                            j17 = j17;
                        }
                    }
                    rh.y2 y2Var = new rh.y2();
                    y2Var.f477093a = emptyList;
                    c4635xec0343cc.f134095h = y2Var;
                    c4635xec0343cc.f134096i = rh.x2.b(java.lang.Integer.valueOf(emptyList.size()));
                    c4635xec0343cc.f134093f = th.o.c(valueOf);
                    j17 += ((java.lang.Long) c4635xec0343cc.f134094g.f477085a).longValue();
                    c4638x3e8bd3fc.f134116e.add(c4635xec0343cc);
                    i17 = 0;
                }
            }
        }
        c4638x3e8bd3fc.f134115d = rh.x2.b(java.lang.Long.valueOf(j17));
        return c4638x3e8bd3fc;
    }

    public void m(boolean z17, int i17, int i18) {
        if (z17) {
            this.f134130b.b(i17, i18);
        } else {
            this.f134131c.b(i17, i18);
        }
    }
}
