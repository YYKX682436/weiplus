package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.d f211833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f211834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f211835g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, jv2.d dVar, yz5.a aVar, yz5.a aVar2) {
        super(0);
        this.f211832d = o0Var;
        this.f211833e = dVar;
        this.f211834f = aVar;
        this.f211835g = aVar2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211832d;
        int i17 = o0Var.f211862n == 2 ? 2 : 3;
        fv2.e eVar = new fv2.e();
        iv2.a aVar = o0Var.f211861m;
        if (aVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        long mo2128x1ed62e84 = this.f211833e.mo2128x1ed62e84();
        java.lang.String userName = aVar.f376652b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.lang.String entity_id = aVar.f376651a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity_id, "entity_id");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.w03 w03Var = new r45.w03();
        w03Var.f470281g = entity_id;
        w03Var.f470293v = userName;
        w03Var.f470287p = 2;
        w03Var.f470288q = i17;
        w03Var.f470283i = mo2128x1ed62e84;
        w03Var.f470292u = c01.id.c();
        lVar.f152197a = w03Var;
        lVar.f152198b = new r45.b13();
        lVar.f152199c = "/cgi-bin/micromsg-bin/statuscomment";
        lVar.f152200d = 9704;
        eVar.p(lVar.a());
        pq5.g l17 = eVar.l();
        l17.f(o0Var);
        l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.l(this.f211834f, this.f211835g));
        return jz5.f0.f384359a;
    }
}
