package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class p2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.i f211888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f211889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f211890g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, jv2.i iVar, yz5.a aVar, yz5.a aVar2) {
        super(0);
        this.f211887d = q3Var;
        this.f211888e = iVar;
        this.f211889f = aVar;
        this.f211890g = aVar2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f211887d;
        int i17 = q3Var.f211905i == 2 ? 2 : 3;
        fv2.g gVar = new fv2.g();
        iv2.b bVar = q3Var.f211904h;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        long mo2128x1ed62e84 = this.f211888e.mo2128x1ed62e84();
        java.lang.String app_name = bVar.f376658a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(app_name, "app_name");
        java.lang.String entity_id = bVar.f376659b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity_id, "entity_id");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.w03 w03Var = new r45.w03();
        w03Var.f470280f = app_name;
        w03Var.f470281g = entity_id;
        w03Var.f470278d = db2.t4.f309704a.a(6964);
        w03Var.f470287p = 2;
        w03Var.f470288q = i17;
        w03Var.f470283i = mo2128x1ed62e84;
        lVar.f152197a = w03Var;
        lVar.f152198b = new r45.b13();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderunicomment";
        lVar.f152200d = 6964;
        gVar.p(lVar.a());
        pq5.g l17 = gVar.l();
        l17.f(q3Var);
        l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o2(this.f211889f, this.f211890g));
        return jz5.f0.f384359a;
    }
}
