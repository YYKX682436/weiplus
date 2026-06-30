package fv2;

/* loaded from: classes10.dex */
public final class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f348512d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f348513e;

    /* renamed from: f, reason: collision with root package name */
    public final jv2.c f348514f;

    public i(jv2.c unsentComment, iv2.b uniEntityItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unsentComment, "unsentComment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniEntityItem, "uniEntityItem");
        r45.w03 w03Var = new r45.w03();
        this.f348514f = unsentComment;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = w03Var;
        r45.x03 x03Var = new r45.x03();
        x03Var.f76492x92037252 = new r45.ie();
        lVar.f152198b = x03Var;
        lVar.f152205i = 30000;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderunicomment";
        lVar.f152200d = 6964;
        this.f348512d = lVar.a();
        w03Var.f470280f = uniEntityItem.f376658a;
        w03Var.f470281g = uniEntityItem.f376659b;
        w03Var.f470295x = null;
        w03Var.f470278d = db2.t4.f309704a.a(6964);
        w03Var.f470287p = 1;
        w03Var.f470288q = unsentComment.f67483x29cbf907 == 1 ? 3 : 2;
        w03Var.f470284m = unsentComment.j();
        long J0 = unsentComment.J0();
        long F0 = unsentComment.F0();
        w03Var.f470285n = J0;
        w03Var.f470286o = F0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f348513e = u0Var;
        return mo9409x10f9447a(sVar, this.f348512d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6964;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        jv2.c cVar = this.f348514f;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f348512d.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUniCommentResponse");
            cVar.u0().m76115x6e101bcb(c01.id.a() / 1000);
            cVar.u0().m76109x2a50d98(((r45.x03) fVar).f471150d);
            java.util.LinkedList linkedList = cVar.Q;
            if (linkedList != null) {
                linkedList.clear();
            }
            cVar.f67484x29d3a50c = 2;
        } else {
            cVar.f67484x29d3a50c = 1;
        }
        jv2.h.f383750f.a().y0(cVar.f67478xf9a02e3e, cVar.t0(), cVar.f67480xf609be94, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wj0.R, cVar);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f348513e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
