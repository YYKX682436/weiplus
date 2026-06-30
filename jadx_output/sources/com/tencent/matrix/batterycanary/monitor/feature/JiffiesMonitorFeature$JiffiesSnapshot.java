package com.tencent.matrix.batterycanary.monitor.feature;

/* loaded from: classes12.dex */
public class JiffiesMonitorFeature$JiffiesSnapshot extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public int f52558d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52559e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f52560f;

    /* renamed from: g, reason: collision with root package name */
    public rh.x2 f52561g;

    /* renamed from: h, reason: collision with root package name */
    public rh.y2 f52562h;

    /* renamed from: i, reason: collision with root package name */
    public rh.x2 f52563i;

    /* renamed from: j, reason: collision with root package name */
    public rh.y2 f52564j;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass1 extends rh.o2 {
        public AnonymousClass1(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot, com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot2, com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot3) {
            super(jiffiesMonitorFeature$JiffiesSnapshot2, jiffiesMonitorFeature$JiffiesSnapshot3);
        }

        @Override // rh.o2
        public rh.d3 a() {
            boolean z17;
            boolean z18;
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot(null);
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot2 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) this.f395485b;
            jiffiesMonitorFeature$JiffiesSnapshot.f52558d = jiffiesMonitorFeature$JiffiesSnapshot2.f52558d;
            jiffiesMonitorFeature$JiffiesSnapshot.f52559e = jiffiesMonitorFeature$JiffiesSnapshot2.f52559e;
            jiffiesMonitorFeature$JiffiesSnapshot.f52560f = jiffiesMonitorFeature$JiffiesSnapshot2.f52560f;
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot3 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) this.f395484a;
            jiffiesMonitorFeature$JiffiesSnapshot.f52561g = rh.p2.a(jiffiesMonitorFeature$JiffiesSnapshot3.f52561g, jiffiesMonitorFeature$JiffiesSnapshot2.f52561g);
            jiffiesMonitorFeature$JiffiesSnapshot.f52563i = rh.p2.a(jiffiesMonitorFeature$JiffiesSnapshot3.f52563i, jiffiesMonitorFeature$JiffiesSnapshot2.f52563i);
            jiffiesMonitorFeature$JiffiesSnapshot.f52562h = rh.y2.b();
            if (jiffiesMonitorFeature$JiffiesSnapshot2.f52562h.f395560a.size() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot : jiffiesMonitorFeature$JiffiesSnapshot2.f52562h.f395560a) {
                    long longValue = ((java.lang.Long) threadJiffiesSnapshot.f395552a).longValue();
                    java.util.Iterator it = jiffiesMonitorFeature$JiffiesSnapshot3.f52562h.f395560a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z18 = true;
                            break;
                        }
                        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot2 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot) it.next();
                        if (threadJiffiesSnapshot2.f52566c.equals(threadJiffiesSnapshot.f52566c) && threadJiffiesSnapshot2.f52565b == threadJiffiesSnapshot.f52565b) {
                            longValue = ((java.lang.Long) rh.p2.a(threadJiffiesSnapshot2, threadJiffiesSnapshot).f395552a).longValue();
                            z18 = false;
                            break;
                        }
                    }
                    if (longValue > 0) {
                        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot3 = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot(java.lang.Long.valueOf(longValue));
                        threadJiffiesSnapshot3.f52565b = threadJiffiesSnapshot.f52565b;
                        threadJiffiesSnapshot3.f52566c = threadJiffiesSnapshot.f52566c;
                        threadJiffiesSnapshot3.f52568e = threadJiffiesSnapshot.f52568e;
                        threadJiffiesSnapshot3.f52567d = z18;
                        arrayList.add(threadJiffiesSnapshot3);
                    }
                }
                if (arrayList.size() > 0) {
                    java.util.Collections.sort(arrayList, new java.util.Comparator<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot>(this) { // from class: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.1.1
                        @Override // java.util.Comparator
                        public int compare(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot4, com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot5) {
                            long longValue2 = ((java.lang.Long) threadJiffiesSnapshot4.f395552a).longValue() - ((java.lang.Long) threadJiffiesSnapshot5.f395552a).longValue();
                            if (longValue2 == 0) {
                                return 0;
                            }
                            return longValue2 > 0 ? -1 : 1;
                        }
                    });
                    rh.y2 y2Var = new rh.y2();
                    y2Var.f395560a = arrayList;
                    jiffiesMonitorFeature$JiffiesSnapshot.f52562h = y2Var;
                }
            }
            if (jiffiesMonitorFeature$JiffiesSnapshot3.f52562h.f395560a.size() > 0) {
                java.util.List emptyList = java.util.Collections.emptyList();
                for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot4 : jiffiesMonitorFeature$JiffiesSnapshot3.f52562h.f395560a) {
                    java.util.Iterator it6 = jiffiesMonitorFeature$JiffiesSnapshot.f52562h.f395560a.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z17 = true;
                            break;
                        }
                        if (((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot) it6.next()).f52565b == threadJiffiesSnapshot4.f52565b) {
                            z17 = false;
                            break;
                        }
                    }
                    if (z17) {
                        if (emptyList.isEmpty()) {
                            emptyList = new java.util.ArrayList();
                        }
                        emptyList.add(threadJiffiesSnapshot4);
                    }
                }
                if (!emptyList.isEmpty()) {
                    rh.y2 y2Var2 = new rh.y2();
                    y2Var2.f395560a = emptyList;
                    jiffiesMonitorFeature$JiffiesSnapshot.f52564j = y2Var2;
                }
            }
            return jiffiesMonitorFeature$JiffiesSnapshot;
        }
    }

    /* loaded from: classes12.dex */
    public static class ThreadJiffiesEntry extends rh.x2 {

        /* renamed from: b, reason: collision with root package name */
        public int f52565b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f52566c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f52567d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f52568e;

        public ThreadJiffiesEntry(java.lang.Long l17) {
            super(l17);
        }

        @Override // rh.x2
        public java.lang.Number a(java.lang.Number number) {
            return java.lang.Long.valueOf(((java.lang.Long) this.f395552a).longValue() - ((java.lang.Long) number).longValue());
        }
    }

    @java.lang.Deprecated
    /* loaded from: classes12.dex */
    public static class ThreadJiffiesSnapshot extends com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesEntry {
        public static com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot c(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.ThreadInfo threadInfo) {
            try {
                threadInfo.a();
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot(java.lang.Long.valueOf(threadInfo.f52577e));
                threadJiffiesSnapshot.f52566c = threadInfo.f52575c;
                threadJiffiesSnapshot.f52568e = threadInfo.f52576d;
                threadJiffiesSnapshot.f52565b = threadInfo.f52574b;
                threadJiffiesSnapshot.f52567d = true;
                return threadJiffiesSnapshot;
            } catch (java.io.IOException e17) {
                oj.j.d("Matrix.battery.JiffiesMonitorFeature", e17, "parseThreadJiffies fail", new java.lang.Object[0]);
                return null;
            }
        }
    }

    public /* synthetic */ JiffiesMonitorFeature$JiffiesSnapshot(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$1 jiffiesMonitorFeature$1) {
        this();
    }

    public static com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot b(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo jiffiesMonitorFeature$ProcessInfo, boolean z17) {
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot();
        jiffiesMonitorFeature$JiffiesSnapshot.f52558d = jiffiesMonitorFeature$ProcessInfo.f52569a;
        jiffiesMonitorFeature$JiffiesSnapshot.f52560f = jiffiesMonitorFeature$ProcessInfo.f52570b;
        int i17 = 0;
        long j17 = 0;
        if (z17) {
            try {
                jiffiesMonitorFeature$ProcessInfo.b();
                j17 = jiffiesMonitorFeature$ProcessInfo.f52571c;
            } catch (java.io.IOException e17) {
                oj.j.d("Matrix.battery.JiffiesMonitorFeature", e17, "parseProcJiffies fail", new java.lang.Object[0]);
                jiffiesMonitorFeature$JiffiesSnapshot.f395365c = false;
                z17 = false;
            }
        }
        java.util.List emptyList = java.util.Collections.emptyList();
        if (jiffiesMonitorFeature$ProcessInfo.f52572d.size() > 0) {
            int size = jiffiesMonitorFeature$ProcessInfo.f52572d.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(jiffiesMonitorFeature$ProcessInfo.f52572d.size());
            java.util.Iterator it = jiffiesMonitorFeature$ProcessInfo.f52572d.iterator();
            while (it.hasNext()) {
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot c17 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot.c((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.ThreadInfo) it.next());
                if (c17 != null) {
                    arrayList.add(c17);
                    if (!z17) {
                        j17 += ((java.lang.Long) c17.f395552a).longValue();
                    }
                } else {
                    jiffiesMonitorFeature$JiffiesSnapshot.f395365c = false;
                }
            }
            i17 = size;
            emptyList = arrayList;
        }
        jiffiesMonitorFeature$JiffiesSnapshot.f52561g = rh.x2.b(java.lang.Long.valueOf(j17));
        rh.y2 y2Var = new rh.y2();
        y2Var.f395560a = emptyList;
        jiffiesMonitorFeature$JiffiesSnapshot.f52562h = y2Var;
        jiffiesMonitorFeature$JiffiesSnapshot.f52563i = rh.x2.b(java.lang.Integer.valueOf(i17));
        return jiffiesMonitorFeature$JiffiesSnapshot;
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        return new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.AnonymousClass1(this, (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) d3Var, this);
    }

    public rh.o2 c(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot jiffiesMonitorFeature$JiffiesSnapshot) {
        return new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.AnonymousClass1(this, jiffiesMonitorFeature$JiffiesSnapshot, this);
    }

    private JiffiesMonitorFeature$JiffiesSnapshot() {
        this.f52559e = false;
        this.f52564j = rh.y2.b();
    }
}
