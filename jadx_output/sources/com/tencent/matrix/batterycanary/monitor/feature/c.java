package com.tencent.matrix.batterycanary.monitor.feature;

/* loaded from: classes12.dex */
public final class c extends rh.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ThreadWatchDog f52597b = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ThreadWatchDog(this);

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ThreadWatchDog f52598c = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ThreadWatchDog(this);

    @Override // rh.a, rh.e3
    public void a(boolean z17) {
        super.a(z17);
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ThreadWatchDog jiffiesMonitorFeature$ThreadWatchDog = this.f52597b;
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ThreadWatchDog jiffiesMonitorFeature$ThreadWatchDog2 = this.f52598c;
        if (z17) {
            jiffiesMonitorFeature$ThreadWatchDog.a();
            synchronized (jiffiesMonitorFeature$ThreadWatchDog2.f52579e) {
                android.os.Handler handler = jiffiesMonitorFeature$ThreadWatchDog2.f52580f;
                if (handler != null) {
                    handler.removeCallbacks(jiffiesMonitorFeature$ThreadWatchDog2);
                    jiffiesMonitorFeature$ThreadWatchDog2.f52580f.getLooper().quit();
                    jiffiesMonitorFeature$ThreadWatchDog2.f52580f = null;
                }
            }
            return;
        }
        jiffiesMonitorFeature$ThreadWatchDog2.a();
        synchronized (jiffiesMonitorFeature$ThreadWatchDog.f52579e) {
            android.os.Handler handler2 = jiffiesMonitorFeature$ThreadWatchDog.f52580f;
            if (handler2 != null) {
                handler2.removeCallbacks(jiffiesMonitorFeature$ThreadWatchDog);
                jiffiesMonitorFeature$ThreadWatchDog.f52580f.getLooper().quit();
                jiffiesMonitorFeature$ThreadWatchDog.f52580f = null;
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
        this.f395294a.f363335d.getClass();
    }

    @Override // rh.a
    public java.lang.String i() {
        return "Matrix.battery.JiffiesMonitorFeature";
    }

    public com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot k(boolean z17) {
        boolean z18 = this.f395294a.f363335d.f363297p;
        if (z18 || z17) {
            return com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.b(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.a(android.os.Process.myPid(), z17), z18);
        }
        throw new java.lang.IllegalStateException("stats nothing!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.ArrayList] */
    public com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot l() {
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies;
        android.content.Context d17 = this.f395294a.d();
        qh.a0 a0Var = this.f395294a.f363335d;
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot jiffiesMonitorFeature$UidJiffiesSnapshot = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot();
        java.util.List n17 = sh.c.n(d17);
        java.util.ArrayList arrayList = (java.util.ArrayList) n17;
        jiffiesMonitorFeature$UidJiffiesSnapshot.f52583e = new java.util.ArrayList(arrayList.size());
        int i17 = 0;
        oj.j.c("Matrix.battery.JiffiesMonitorFeature", "currProcList: " + n17, new java.lang.Object[0]);
        java.util.Iterator it = arrayList.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            m3.d dVar = (m3.d) it.next();
            int intValue = ((java.lang.Integer) dVar.f323092a).intValue();
            java.lang.String valueOf = java.lang.String.valueOf(dVar.f323093b);
            if (wh.u1.a(intValue)) {
                oj.j.c("Matrix.battery.JiffiesMonitorFeature", "proc: " + intValue, new java.lang.Object[i17]);
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot b17 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.b(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.a(intValue, true), a0Var.f363297p);
                b17.f52560f = th.o.c(valueOf);
                j17 += ((java.lang.Long) b17.f52561g.f395552a).longValue();
                jiffiesMonitorFeature$UidJiffiesSnapshot.f52583e.add(b17);
            } else {
                wh.u0 u0Var = a0Var.B;
                if (u0Var == null || (jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies) ((com.tencent.mm.feature.performance.c2$$c) u0Var).apply(dVar)) == null) {
                    oj.j.c("Matrix.battery.JiffiesMonitorFeature", "skip: " + intValue, new java.lang.Object[0]);
                    i17 = 0;
                    j17 = j17;
                } else {
                    oj.j.c("Matrix.battery.JiffiesMonitorFeature", "ipc: " + intValue, new java.lang.Object[i17]);
                    com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot(null);
                    jiffiesMonitorFeature$JiffiesSnapshot.f52558d = jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52585d;
                    jiffiesMonitorFeature$JiffiesSnapshot.f52560f = jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52586e;
                    jiffiesMonitorFeature$JiffiesSnapshot.f52561g = rh.x2.b(java.lang.Long.valueOf(jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52587f));
                    ?? emptyList = java.util.Collections.emptyList();
                    if (!jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52589h.isEmpty()) {
                        emptyList = new java.util.ArrayList(jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52589h.size());
                        for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies ipcThreadJiffies : jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52589h) {
                            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot(java.lang.Long.valueOf(ipcThreadJiffies.f52593g));
                            threadJiffiesSnapshot.f52566c = ipcThreadJiffies.f52591e;
                            threadJiffiesSnapshot.f52568e = ipcThreadJiffies.f52592f;
                            threadJiffiesSnapshot.f52565b = ipcThreadJiffies.f52590d;
                            threadJiffiesSnapshot.f52567d = true;
                            emptyList.add(threadJiffiesSnapshot);
                            j17 = j17;
                        }
                    }
                    rh.y2 y2Var = new rh.y2();
                    y2Var.f395560a = emptyList;
                    jiffiesMonitorFeature$JiffiesSnapshot.f52562h = y2Var;
                    jiffiesMonitorFeature$JiffiesSnapshot.f52563i = rh.x2.b(java.lang.Integer.valueOf(emptyList.size()));
                    jiffiesMonitorFeature$JiffiesSnapshot.f52560f = th.o.c(valueOf);
                    j17 += ((java.lang.Long) jiffiesMonitorFeature$JiffiesSnapshot.f52561g.f395552a).longValue();
                    jiffiesMonitorFeature$UidJiffiesSnapshot.f52583e.add(jiffiesMonitorFeature$JiffiesSnapshot);
                    i17 = 0;
                }
            }
        }
        jiffiesMonitorFeature$UidJiffiesSnapshot.f52582d = rh.x2.b(java.lang.Long.valueOf(j17));
        return jiffiesMonitorFeature$UidJiffiesSnapshot;
    }

    public void m(boolean z17, int i17, int i18) {
        if (z17) {
            this.f52597b.b(i17, i18);
        } else {
            this.f52598c.b(i17, i18);
        }
    }
}
