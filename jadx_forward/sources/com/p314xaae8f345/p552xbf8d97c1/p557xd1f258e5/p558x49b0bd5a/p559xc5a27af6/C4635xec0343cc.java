package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot */
/* loaded from: classes12.dex */
public class C4635xec0343cc extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public int f134091d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f134092e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f134093f;

    /* renamed from: g, reason: collision with root package name */
    public rh.x2 f134094g;

    /* renamed from: h, reason: collision with root package name */
    public rh.y2 f134095h;

    /* renamed from: i, reason: collision with root package name */
    public rh.x2 f134096i;

    /* renamed from: j, reason: collision with root package name */
    public rh.y2 f134097j;

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass1 extends rh.o2 {
        public AnonymousClass1(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc2, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc3) {
            super(c4635xec0343cc2, c4635xec0343cc3);
        }

        @Override // rh.o2
        public rh.d3 a() {
            boolean z17;
            boolean z18;
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc(null);
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc2 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) this.f477018b;
            c4635xec0343cc.f134091d = c4635xec0343cc2.f134091d;
            c4635xec0343cc.f134092e = c4635xec0343cc2.f134092e;
            c4635xec0343cc.f134093f = c4635xec0343cc2.f134093f;
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc3 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) this.f477017a;
            c4635xec0343cc.f134094g = rh.p2.a(c4635xec0343cc3.f134094g, c4635xec0343cc2.f134094g);
            c4635xec0343cc.f134096i = rh.p2.a(c4635xec0343cc3.f134096i, c4635xec0343cc2.f134096i);
            c4635xec0343cc.f134095h = rh.y2.b();
            if (c4635xec0343cc2.f134095h.f477093a.size() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot : c4635xec0343cc2.f134095h.f477093a) {
                    long longValue = ((java.lang.Long) threadJiffiesSnapshot.f477085a).longValue();
                    java.util.Iterator it = c4635xec0343cc3.f134095h.f477093a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z18 = true;
                            break;
                        }
                        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot2 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) it.next();
                        if (threadJiffiesSnapshot2.f134099c.equals(threadJiffiesSnapshot.f134099c) && threadJiffiesSnapshot2.f134098b == threadJiffiesSnapshot.f134098b) {
                            longValue = ((java.lang.Long) rh.p2.a(threadJiffiesSnapshot2, threadJiffiesSnapshot).f477085a).longValue();
                            z18 = false;
                            break;
                        }
                    }
                    if (longValue > 0) {
                        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot3 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot(java.lang.Long.valueOf(longValue));
                        threadJiffiesSnapshot3.f134098b = threadJiffiesSnapshot.f134098b;
                        threadJiffiesSnapshot3.f134099c = threadJiffiesSnapshot.f134099c;
                        threadJiffiesSnapshot3.f134101e = threadJiffiesSnapshot.f134101e;
                        threadJiffiesSnapshot3.f134100d = z18;
                        arrayList.add(threadJiffiesSnapshot3);
                    }
                }
                if (arrayList.size() > 0) {
                    java.util.Collections.sort(arrayList, new java.util.Comparator<com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot>(this) { // from class: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.1.1
                        @Override // java.util.Comparator
                        public int compare(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot4, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot5) {
                            long longValue2 = ((java.lang.Long) threadJiffiesSnapshot4.f477085a).longValue() - ((java.lang.Long) threadJiffiesSnapshot5.f477085a).longValue();
                            if (longValue2 == 0) {
                                return 0;
                            }
                            return longValue2 > 0 ? -1 : 1;
                        }
                    });
                    rh.y2 y2Var = new rh.y2();
                    y2Var.f477093a = arrayList;
                    c4635xec0343cc.f134095h = y2Var;
                }
            }
            if (c4635xec0343cc3.f134095h.f477093a.size() > 0) {
                java.util.List emptyList = java.util.Collections.emptyList();
                for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot4 : c4635xec0343cc3.f134095h.f477093a) {
                    java.util.Iterator it6 = c4635xec0343cc.f134095h.f477093a.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z17 = true;
                            break;
                        }
                        if (((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot) it6.next()).f134098b == threadJiffiesSnapshot4.f134098b) {
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
                    y2Var2.f477093a = emptyList;
                    c4635xec0343cc.f134097j = y2Var2;
                }
            }
            return c4635xec0343cc;
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry */
    /* loaded from: classes12.dex */
    public static class ThreadJiffiesEntry extends rh.x2 {

        /* renamed from: b, reason: collision with root package name */
        public int f134098b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f134099c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f134100d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f134101e;

        public ThreadJiffiesEntry(java.lang.Long l17) {
            super(l17);
        }

        @Override // rh.x2
        public java.lang.Number a(java.lang.Number number) {
            return java.lang.Long.valueOf(((java.lang.Long) this.f477085a).longValue() - ((java.lang.Long) number).longValue());
        }
    }

    @java.lang.Deprecated
    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot */
    /* loaded from: classes12.dex */
    public static class ThreadJiffiesSnapshot extends com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry {
        public static com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot c(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.ThreadInfo threadInfo) {
            try {
                threadInfo.a();
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot threadJiffiesSnapshot = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot(java.lang.Long.valueOf(threadInfo.f134110e));
                threadJiffiesSnapshot.f134099c = threadInfo.f134108c;
                threadJiffiesSnapshot.f134101e = threadInfo.f134109d;
                threadJiffiesSnapshot.f134098b = threadInfo.f134107b;
                threadJiffiesSnapshot.f134100d = true;
                return threadJiffiesSnapshot;
            } catch (java.io.IOException e17) {
                oj.j.d("Matrix.battery.JiffiesMonitorFeature", e17, "parseThreadJiffies fail", new java.lang.Object[0]);
                return null;
            }
        }
    }

    public /* synthetic */ C4635xec0343cc(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.AbstractRunnableC4633xf627c201 abstractRunnableC4633xf627c201) {
        this();
    }

    public static com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc b(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d c4636x85728d6d, boolean z17) {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc();
        c4635xec0343cc.f134091d = c4636x85728d6d.f134102a;
        c4635xec0343cc.f134093f = c4636x85728d6d.f134103b;
        int i17 = 0;
        long j17 = 0;
        if (z17) {
            try {
                c4636x85728d6d.b();
                j17 = c4636x85728d6d.f134104c;
            } catch (java.io.IOException e17) {
                oj.j.d("Matrix.battery.JiffiesMonitorFeature", e17, "parseProcJiffies fail", new java.lang.Object[0]);
                c4635xec0343cc.f476898c = false;
                z17 = false;
            }
        }
        java.util.List emptyList = java.util.Collections.emptyList();
        if (c4636x85728d6d.f134105d.size() > 0) {
            int size = c4636x85728d6d.f134105d.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(c4636x85728d6d.f134105d.size());
            java.util.Iterator it = c4636x85728d6d.f134105d.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot c17 = com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesSnapshot.c((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4636x85728d6d.ThreadInfo) it.next());
                if (c17 != null) {
                    arrayList.add(c17);
                    if (!z17) {
                        j17 += ((java.lang.Long) c17.f477085a).longValue();
                    }
                } else {
                    c4635xec0343cc.f476898c = false;
                }
            }
            i17 = size;
            emptyList = arrayList;
        }
        c4635xec0343cc.f134094g = rh.x2.b(java.lang.Long.valueOf(j17));
        rh.y2 y2Var = new rh.y2();
        y2Var.f477093a = emptyList;
        c4635xec0343cc.f134095h = y2Var;
        c4635xec0343cc.f134096i = rh.x2.b(java.lang.Integer.valueOf(i17));
        return c4635xec0343cc;
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        return new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.AnonymousClass1(this, (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) d3Var, this);
    }

    public rh.o2 c(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc) {
        return new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.AnonymousClass1(this, c4635xec0343cc, this);
    }

    private C4635xec0343cc() {
        this.f134092e = false;
        this.f134097j = rh.y2.b();
    }
}
