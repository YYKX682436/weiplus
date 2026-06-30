package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f231328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f231330g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u1 f231331h;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u1 u1Var, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f231331h = u1Var;
        this.f231327d = i17;
        this.f231328e = i18;
        this.f231329f = str;
        this.f231330g = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        int i17 = this.f231327d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f231328e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "on cgiGetSDKUserInfo result: %d, %d, %s", valueOf, java.lang.Integer.valueOf(i18), this.f231329f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.u1 u1Var = this.f231331h;
        if (i17 != 0 || i18 != 0 || (fVar = this.f231330g.f152244b.f152233a) == null) {
            u1Var.f231361a.f231369e.f231380a.R1 = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Multitalk.ILinkService", "hy: cgiGetSDKUserInfo fail, errType:" + i17 + ",errCode:" + i18);
            return;
        }
        java.util.LinkedList linkedList = ((r45.p07) fVar).f464183d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c0 c0Var = u1Var.f231361a.f231369e.f231380a.f231156f;
        c0Var.getClass();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.y07 y07Var = (r45.y07) it.next();
            c0Var.f(y07Var.f472222d, y07Var.f472223e, 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.v1 v1Var = u1Var.f231361a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.l(v1Var.f231369e.f231380a, v1Var.f231368d, null);
    }
}
