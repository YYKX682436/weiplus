package fv2;

/* loaded from: classes10.dex */
public final class h extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final iv2.a f348508d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f348509e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f348510f;

    /* renamed from: g, reason: collision with root package name */
    public final jv2.a f348511g;

    public h(jv2.a unsentComment, iv2.a uniEntityItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unsentComment, "unsentComment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniEntityItem, "uniEntityItem");
        this.f348508d = uniEntityItem;
        r45.w03 w03Var = new r45.w03();
        this.f348511g = unsentComment;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = w03Var;
        r45.x03 x03Var = new r45.x03();
        x03Var.f76492x92037252 = new r45.ie();
        lVar.f152198b = x03Var;
        lVar.f152205i = 30000;
        lVar.f152199c = "/cgi-bin/micromsg-bin/statuscomment";
        lVar.f152200d = 9704;
        this.f348509e = lVar.a();
        w03Var.f470280f = "";
        w03Var.f470281g = uniEntityItem.f376651a;
        w03Var.f470293v = uniEntityItem.f376652b;
        w03Var.f470279e = java.lang.String.valueOf(c01.id.c());
        w03Var.f470295x = null;
        w03Var.f470287p = 1;
        w03Var.f470288q = unsentComment.f67483x29cbf907 == 1 ? 3 : 2;
        w03Var.f470284m = unsentComment.j();
        w03Var.f470292u = c01.id.c();
        long A0 = unsentComment.A0();
        long m76092x604d5d06 = unsentComment.u0().m76092x604d5d06();
        w03Var.f470285n = A0;
        w03Var.f470286o = m76092x604d5d06;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f348510f = u0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doScene: username=");
        iv2.a aVar = this.f348508d;
        sb6.append(aVar.f376652b);
        sb6.append(", statusId=");
        sb6.append(aVar.f376651a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneTextStatusToComment", sb6.toString());
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.String str = aVar.f376651a;
        ((we0.j1) l0Var).getClass();
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            si4.a G = ai4.m0.f86706a.G();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            mj4.h t17 = G.t(str);
            if (t17 != null && (((mj4.k) t17).s() & 64) != 0) {
                z17 = true;
            }
        }
        if (!z17) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwk));
        }
        return mo9409x10f9447a(sVar, this.f348509e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 9704;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.ie ieVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f348509e;
        jv2.a aVar = this.f348511g;
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUniCommentResponse");
            aVar.u0().m76115x6e101bcb(c01.id.a() / 1000);
            aVar.u0().m76109x2a50d98(((r45.x03) fVar).f471150d);
            java.util.LinkedList linkedList = aVar.N;
            if (linkedList != null) {
                linkedList.clear();
            }
            aVar.f67484x29d3a50c = 2;
        } else {
            aVar.f67484x29d3a50c = 1;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
        r45.x03 x03Var = fVar2 instanceof r45.x03 ? (r45.x03) fVar2 : null;
        if (x03Var != null && (ieVar = x03Var.f76492x92037252) != null && ieVar.f458492d == -10101) {
            iv2.a aVar2 = aVar.M;
            if (aVar2 != null) {
                hu2.a.f366614a.a(aVar2.f376652b, aVar2.f376651a, aVar2.f376653c);
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jwi));
        }
        p000.y.f539830f.a().y0(aVar.f67478xf9a02e3e, aVar.t0(), aVar.f67480xf609be94, 2, aVar);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f348510f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
