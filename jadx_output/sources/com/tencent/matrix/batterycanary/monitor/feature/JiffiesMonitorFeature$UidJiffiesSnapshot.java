package com.tencent.matrix.batterycanary.monitor.feature;

/* loaded from: classes12.dex */
public class JiffiesMonitorFeature$UidJiffiesSnapshot extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f52582d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f52583e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f52584f = java.util.Collections.emptyList();

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass1 extends rh.o2 {
        public AnonymousClass1(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot jiffiesMonitorFeature$UidJiffiesSnapshot, com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot jiffiesMonitorFeature$UidJiffiesSnapshot2, com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot jiffiesMonitorFeature$UidJiffiesSnapshot3) {
            super(jiffiesMonitorFeature$UidJiffiesSnapshot2, jiffiesMonitorFeature$UidJiffiesSnapshot3);
        }

        @Override // rh.o2
        public rh.d3 a() {
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot;
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot jiffiesMonitorFeature$UidJiffiesSnapshot = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot();
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot jiffiesMonitorFeature$UidJiffiesSnapshot2 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot) this.f395484a;
            rh.x2 x2Var = jiffiesMonitorFeature$UidJiffiesSnapshot2.f52582d;
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot jiffiesMonitorFeature$UidJiffiesSnapshot3 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot) this.f395485b;
            jiffiesMonitorFeature$UidJiffiesSnapshot.f52582d = rh.p2.a(x2Var, jiffiesMonitorFeature$UidJiffiesSnapshot3.f52582d);
            if (jiffiesMonitorFeature$UidJiffiesSnapshot3.f52583e.size() > 0) {
                jiffiesMonitorFeature$UidJiffiesSnapshot.f52584f = new java.util.ArrayList();
                for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot2 : jiffiesMonitorFeature$UidJiffiesSnapshot3.f52583e) {
                    java.util.Iterator it = jiffiesMonitorFeature$UidJiffiesSnapshot2.f52583e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            jiffiesMonitorFeature$JiffiesSnapshot = null;
                            break;
                        }
                        jiffiesMonitorFeature$JiffiesSnapshot = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) it.next();
                        if (jiffiesMonitorFeature$JiffiesSnapshot.f52558d == jiffiesMonitorFeature$JiffiesSnapshot2.f52558d) {
                            break;
                        }
                    }
                    if (jiffiesMonitorFeature$JiffiesSnapshot == null) {
                        jiffiesMonitorFeature$JiffiesSnapshot2.f52559e = true;
                        jiffiesMonitorFeature$JiffiesSnapshot = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot(null);
                        jiffiesMonitorFeature$JiffiesSnapshot.f52558d = jiffiesMonitorFeature$JiffiesSnapshot2.f52558d;
                        jiffiesMonitorFeature$JiffiesSnapshot.f52560f = jiffiesMonitorFeature$JiffiesSnapshot2.f52560f;
                        jiffiesMonitorFeature$JiffiesSnapshot.f52561g = rh.x2.b(0L);
                        jiffiesMonitorFeature$JiffiesSnapshot.f52562h = rh.y2.b();
                        jiffiesMonitorFeature$JiffiesSnapshot.f52563i = rh.x2.b(0);
                    }
                    boolean z17 = jiffiesMonitorFeature$JiffiesSnapshot2.f52559e;
                    jiffiesMonitorFeature$UidJiffiesSnapshot.f52584f.add(new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.AnonymousClass1(jiffiesMonitorFeature$JiffiesSnapshot2, jiffiesMonitorFeature$JiffiesSnapshot, jiffiesMonitorFeature$JiffiesSnapshot2));
                }
                java.util.Collections.sort(jiffiesMonitorFeature$UidJiffiesSnapshot.f52584f, new java.util.Comparator<rh.o2>(this) { // from class: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.UidJiffiesSnapshot.1.1
                    @Override // java.util.Comparator
                    public int compare(rh.o2 o2Var, rh.o2 o2Var2) {
                        long longValue = ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52561g.f395552a).longValue() - ((java.lang.Long) ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var2.f395486c).f52561g.f395552a).longValue();
                        if (longValue == 0) {
                            return 0;
                        }
                        return longValue > 0 ? -1 : 1;
                    }
                });
            }
            return jiffiesMonitorFeature$UidJiffiesSnapshot;
        }
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        return new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot.AnonymousClass1(this, (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot) d3Var, this);
    }
}
