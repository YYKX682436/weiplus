package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot */
/* loaded from: classes12.dex */
public class C4638x3e8bd3fc extends rh.d3 {

    /* renamed from: d, reason: collision with root package name */
    public rh.x2 f134115d = rh.x2.b(0L);

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f134116e = java.util.Collections.emptyList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f134117f = java.util.Collections.emptyList();

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass1 extends rh.o2 {
        public AnonymousClass1(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc c4638x3e8bd3fc, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc c4638x3e8bd3fc2, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc c4638x3e8bd3fc3) {
            super(c4638x3e8bd3fc2, c4638x3e8bd3fc3);
        }

        @Override // rh.o2
        public rh.d3 a() {
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc;
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc c4638x3e8bd3fc = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc();
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc c4638x3e8bd3fc2 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc) this.f477017a;
            rh.x2 x2Var = c4638x3e8bd3fc2.f134115d;
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc c4638x3e8bd3fc3 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc) this.f477018b;
            c4638x3e8bd3fc.f134115d = rh.p2.a(x2Var, c4638x3e8bd3fc3.f134115d);
            if (c4638x3e8bd3fc3.f134116e.size() > 0) {
                c4638x3e8bd3fc.f134117f = new java.util.ArrayList();
                for (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc2 : c4638x3e8bd3fc3.f134116e) {
                    java.util.Iterator it = c4638x3e8bd3fc2.f134116e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c4635xec0343cc = null;
                            break;
                        }
                        c4635xec0343cc = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) it.next();
                        if (c4635xec0343cc.f134091d == c4635xec0343cc2.f134091d) {
                            break;
                        }
                    }
                    if (c4635xec0343cc == null) {
                        c4635xec0343cc2.f134092e = true;
                        c4635xec0343cc = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc(null);
                        c4635xec0343cc.f134091d = c4635xec0343cc2.f134091d;
                        c4635xec0343cc.f134093f = c4635xec0343cc2.f134093f;
                        c4635xec0343cc.f134094g = rh.x2.b(0L);
                        c4635xec0343cc.f134095h = rh.y2.b();
                        c4635xec0343cc.f134096i = rh.x2.b(0);
                    }
                    boolean z17 = c4635xec0343cc2.f134092e;
                    c4638x3e8bd3fc.f134117f.add(new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.AnonymousClass1(c4635xec0343cc2, c4635xec0343cc, c4635xec0343cc2));
                }
                java.util.Collections.sort(c4638x3e8bd3fc.f134117f, new java.util.Comparator<rh.o2>(this) { // from class: com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.UidJiffiesSnapshot.1.1
                    @Override // java.util.Comparator
                    public int compare(rh.o2 o2Var, rh.o2 o2Var2) {
                        long longValue = ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134094g.f477085a).longValue() - ((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var2.f477019c).f134094g.f477085a).longValue();
                        if (longValue == 0) {
                            return 0;
                        }
                        return longValue > 0 ? -1 : 1;
                    }
                });
            }
            return c4638x3e8bd3fc;
        }
    }

    @Override // rh.d3
    public rh.o2 a(rh.d3 d3Var) {
        return new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.AnonymousClass1(this, (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc) d3Var, this);
    }
}
