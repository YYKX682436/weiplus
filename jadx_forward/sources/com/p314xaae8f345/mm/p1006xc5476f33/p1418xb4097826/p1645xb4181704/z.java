package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv2.d f211998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f212000f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(jv2.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, boolean z17) {
        super(1);
        this.f211998d = dVar;
        this.f211999e = o0Var;
        this.f212000f = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreLevel2Comments before lastBuffer ");
        jv2.d dVar = this.f211998d;
        if (dVar.f383740d.u0().m76078x44e5026c() == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m76078x44e5026c = dVar.f383740d.u0().m76078x44e5026c();
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m76078x44e5026c != null ? m76078x44e5026c.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211999e;
        iv2.a aVar = o0Var.f211861m;
        if (aVar != null) {
            new fv2.d(aVar.f376652b, aVar.f376651a, dVar.mo2128x1ed62e84(), this.f211998d, this.f212000f).l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.x(dVar, o0Var)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.y(o0Var, dVar, this.f212000f, task)).f(o0Var);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
        throw null;
    }
}
