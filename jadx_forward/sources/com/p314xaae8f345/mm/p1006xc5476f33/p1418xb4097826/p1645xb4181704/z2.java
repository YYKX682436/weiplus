package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class z2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f212003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var) {
        super(1);
        this.f212003d = q3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData before lastBuffer ");
        if (this.f212003d.f211908o == null) {
            b17 = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f212003d.f211908o;
            b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicUni.DrawerPresenter", sb6.toString());
        fv2.a aVar = new fv2.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f212003d;
        iv2.b bVar = q3Var.f211904h;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        java.lang.String app_name = bVar.f376658a;
        java.lang.String entity_id = bVar.f376659b;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = q3Var.f211908o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(app_name, "app_name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity_id, "entity_id");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.y03 y03Var = new r45.y03();
        y03Var.f472205e = app_name;
        y03Var.f472206f = entity_id;
        y03Var.f472204d = db2.t4.f309704a.a(6953);
        y03Var.f472211n = 2;
        y03Var.f472215r = gVar2;
        lVar.f152197a = y03Var;
        lVar.f152198b = new r45.z03();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderunigetcomment";
        lVar.f152200d = 6953;
        aVar.p(lVar.a());
        aVar.l().q(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.x2(this.f212003d)).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.y2(this.f212003d, task)).f(this.f212003d);
        return jz5.f0.f384359a;
    }
}
