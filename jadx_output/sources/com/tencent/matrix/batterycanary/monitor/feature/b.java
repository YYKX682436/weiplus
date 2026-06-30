package com.tencent.matrix.batterycanary.monitor.feature;

/* loaded from: classes12.dex */
public class b implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot f52595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.batterycanary.monitor.feature.c f52596b;

    public b(rh.c1 c1Var, com.tencent.matrix.batterycanary.monitor.feature.c cVar) {
        this.f52596b = cVar;
    }

    @Override // wh.u0
    public java.lang.Object apply(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot l17 = this.f52596b.l();
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot jiffiesMonitorFeature$UidJiffiesSnapshot = this.f52595a;
        if (jiffiesMonitorFeature$UidJiffiesSnapshot == null) {
            this.f52595a = l17;
            return 0;
        }
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.AnonymousClass1 anonymousClass1 = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.AnonymousClass1(l17, jiffiesMonitorFeature$UidJiffiesSnapshot, l17);
        long j17 = anonymousClass1.f395487d;
        long max = java.lang.Math.max(1L, j17 / 60000);
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot jiffiesMonitorFeature$UidJiffiesSnapshot2 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot) anonymousClass1.f395486c;
        long f17 = rh.c1.f(((java.lang.Long) jiffiesMonitorFeature$UidJiffiesSnapshot2.f52582d.f395552a).longValue(), j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSampling ");
        sb6.append(c3Var.f395346g);
        sb6.append(" ");
        java.lang.String str = c3Var.f395340a;
        sb6.append(str);
        sb6.append(" avgUidJiffies, val = ");
        sb6.append(f17);
        sb6.append(", minute = ");
        sb6.append(max);
        oj.j.c("Matrix.battery.CompositeMonitors", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Iterator it = jiffiesMonitorFeature$UidJiffiesSnapshot2.f52584f.iterator(); it.hasNext(); it = it) {
            rh.o2 o2Var = (rh.o2) it.next();
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f395346g + " " + str + " avgPidJiffies, val = " + rh.c1.f(((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52561g.f395552a).longValue(), j17) + ", minute = " + max + ", name = " + ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52560f, new java.lang.Object[0]);
        }
        this.f52595a = l17;
        return java.lang.Long.valueOf(f17);
    }
}
