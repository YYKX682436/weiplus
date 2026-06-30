package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s70 f231401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.a3 f231402e;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.a3 a3Var, r45.s70 s70Var) {
        this.f231402e = a3Var;
        this.f231401d = s70Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.a3 a3Var = this.f231402e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = a3Var.f231041a;
        i4Var.f231173o2 = true;
        r45.s70 s70Var = this.f231401d;
        if (s70Var != null) {
            zj3.g gVar = zj3.g.f554835a;
            long j17 = s70Var.f467067d;
            zj3.g.f554836b = j17;
            rq4.u.f480643b = j17;
            rq4.u.f480644c = 0L;
        }
        i4Var.f231158g.d(s70Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var2 = a3Var.f231041a;
        i4Var2.f231158g.b();
        i4Var2.U(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.y2(this));
    }
}
