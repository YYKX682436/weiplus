package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.i f211747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f211749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(jv2.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, boolean z17) {
        super(1);
        this.f211747d = iVar;
        this.f211748e = q3Var;
        this.f211749f = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreLevel2Comments before lastBuffer ");
        jv2.i iVar = this.f211747d;
        if (iVar.f383756d.u0().m76078x44e5026c() == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m76078x44e5026c = iVar.f383756d.u0().m76078x44e5026c();
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m76078x44e5026c != null ? m76078x44e5026c.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f211748e;
        iv2.b bVar = q3Var.f211904h;
        if (bVar != null) {
            new fv2.b(bVar.f376662e, bVar.f376659b, iVar.mo2128x1ed62e84(), this.f211747d, this.f211749f).l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a3(iVar, q3Var)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.b3(q3Var, iVar, this.f211749f, task)).f(q3Var);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
        throw null;
    }
}
