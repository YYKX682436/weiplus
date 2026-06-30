package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211972d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var) {
        super(1);
        this.f211972d = o0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData before lastBuffer ");
        if (this.f211972d.f211866r == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f211972d.f211866r;
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        fv2.c cVar = new fv2.c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211972d;
        iv2.a aVar = o0Var.f211861m;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        java.lang.String userName = aVar.f376652b;
        java.lang.String entity_id = aVar.f376651a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = o0Var.f211866r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity_id, "entity_id");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.y03 y03Var = new r45.y03();
        y03Var.f472206f = entity_id;
        y03Var.f472211n = 2;
        y03Var.f472215r = gVar2;
        y03Var.f472214q = userName;
        lVar.f152197a = y03Var;
        lVar.f152198b = new r45.z03();
        lVar.f152199c = "/cgi-bin/micromsg-bin/statusgetcommentlist";
        lVar.f152200d = 7865;
        cVar.p(lVar.a());
        cVar.l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.u(this.f211972d)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.v(this.f211972d, task)).f(this.f211972d);
        return jz5.f0.f384359a;
    }
}
