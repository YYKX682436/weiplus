package com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6;

/* loaded from: classes12.dex */
public class b implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc f134128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c f134129b;

    public b(rh.c1 c1Var, com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c cVar) {
        this.f134129b = cVar;
    }

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc l17 = this.f134129b.l();
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc c4638x3e8bd3fc = this.f134128a;
        if (c4638x3e8bd3fc == null) {
            this.f134128a = l17;
            return 0;
        }
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.AnonymousClass1 anonymousClass1 = new com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc.AnonymousClass1(l17, c4638x3e8bd3fc, l17);
        long j17 = anonymousClass1.f477020d;
        long max = java.lang.Math.max(1L, j17 / 60000);
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc c4638x3e8bd3fc2 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4638x3e8bd3fc) anonymousClass1.f477019c;
        long f17 = rh.c1.f(((java.lang.Long) c4638x3e8bd3fc2.f134115d.f477085a).longValue(), j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSampling ");
        sb6.append(c3Var.f476879g);
        sb6.append(" ");
        java.lang.String str = c3Var.f476873a;
        sb6.append(str);
        sb6.append(" avgUidJiffies, val = ");
        sb6.append(f17);
        sb6.append(", minute = ");
        sb6.append(max);
        oj.j.c("Matrix.battery.CompositeMonitors", sb6.toString(), new java.lang.Object[0]);
        for (java.util.Iterator it = c4638x3e8bd3fc2.f134117f.iterator(); it.hasNext(); it = it) {
            rh.o2 o2Var = (rh.o2) it.next();
            oj.j.c("Matrix.battery.CompositeMonitors", "onSampling " + c3Var.f476879g + " " + str + " avgPidJiffies, val = " + rh.c1.f(((java.lang.Long) ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134094g.f477085a).longValue(), j17) + ", minute = " + max + ", name = " + ((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c).f134093f, new java.lang.Object[0]);
        }
        this.f134128a = l17;
        return java.lang.Long.valueOf(f17);
    }
}
