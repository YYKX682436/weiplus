package bq;

/* loaded from: classes.dex */
public final class n0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105030o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f105031p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f105032q;

    /* renamed from: r, reason: collision with root package name */
    public final int f105033r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(long j17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, java.lang.String targetUsername, r45.qt2 qt2Var, int i18, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, 1, null);
        i17 = (i19 & 4) != 0 ? 0 : i17;
        targetUsername = (i19 & 8) != 0 ? "" : targetUsername;
        i18 = (i19 & 32) != 0 ? 0 : i18;
        z17 = (i19 & 64) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetUsername, "targetUsername");
        this.f105031p = "";
        this.f105032q = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3965;
        this.f105030o = i17;
        this.f105031p = targetUsername;
        this.f105032q = z17;
        r45.c71 c71Var = new r45.c71();
        c71Var.set(1, java.lang.Long.valueOf(j17));
        c71Var.set(3, gVar);
        c71Var.set(2, xy2.c.f(qt2Var));
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(targetUsername, c01.z1.r())) {
            c71Var.set(5, targetUsername);
        }
        c71Var.set(6, java.lang.Integer.valueOf(i18));
        db2.t4 t4Var = db2.t4.f309704a;
        c71Var.set(7, t4Var.n());
        this.f105033r = i18;
        c71Var.set(4, t4Var.b(3965, qt2Var));
        lVar.f152197a = c71Var;
        lVar.f152198b = new r45.d71();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetlikedlist";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetLikedList", "NetSceneFinderGetLikedList init: " + j17 + ' ' + c71Var.m75945x2fec8307(2) + "， targetUsername：" + targetUsername);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.d71 resp = (r45.d71) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = this.f152179f.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListRequest");
        r45.c71 c71Var = (r45.c71) fVar2;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152179f;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getLiked_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 0));
        }
        r45.kv0 kv0Var = (r45.kv0) c71Var.m75936x14adae67(4);
        cq.j1.a(kVar, oVar, arrayList, kv0Var != null ? kv0Var.m75942xfb822ef2(5) : 0L, false, this.f105016m);
    }
}
