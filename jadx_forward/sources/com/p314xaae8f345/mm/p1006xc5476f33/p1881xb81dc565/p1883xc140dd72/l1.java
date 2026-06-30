package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s70 f231219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m1 f231220e;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m1 m1Var, r45.s70 s70Var) {
        this.f231220e = m1Var;
        this.f231219d = s70Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.m1 m1Var = this.f231220e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = m1Var.f231252a;
        i4Var.f231173o2 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s sVar = i4Var.f231158g;
        r45.s70 s70Var = this.f231219d;
        sVar.d(s70Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = m1Var.f231252a;
        i4Var2.f231158g.b();
        if (s70Var != null) {
            zj3.g gVar = zj3.g.f554835a;
            long j17 = s70Var.f467067d;
            zj3.g.f554836b = j17;
            rq4.u.f480643b = j17;
            rq4.u.f480644c = 0L;
        }
        i4Var2.V(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.k1(this));
    }
}
