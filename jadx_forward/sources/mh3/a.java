package mh3;

/* loaded from: classes4.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(java.util.List reqTypes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqTypes, "reqTypes");
        r45.hf4 hf4Var = new r45.hf4();
        hf4Var.f457652d.addAll(reqTypes);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = hf4Var;
        r45.if4 if4Var = new r45.if4();
        if4Var.mo11485x1f73abb4(new r45.ie());
        if4Var.mo11484xe92ab0a8().f458493e = new r45.du5();
        lVar.f152198b = if4Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmecinit";
        lVar.f152200d = 24760;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.if4 resp = (r45.if4) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiMMEcInit", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList<r45.gf4> item_list = resp.f458527d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(item_list, "item_list");
            for (r45.gf4 gf4Var : item_list) {
                int i19 = gf4Var.f456727d;
                if (i19 == 1) {
                    if (gf4Var.f456729f == 0 && gf4Var.f456728e != null) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MMEC_NEW_CARD_ENTRANCE_STRING;
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = gf4Var.f456728e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
                        c17.x(u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(gVar.g()));
                    }
                } else if (i19 == 3) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hy: got MMECINIT_REQ_TYPE_GET_PRESENT_ENTRANCE_INFO errcode is ");
                    sb6.append(gf4Var.f456729f);
                    sb6.append(" and respBuffer is null?? ");
                    sb6.append(gf4Var.f456728e == null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiMMEcInit", sb6.toString());
                    if (gf4Var.f456729f == 0 && gf4Var.f456728e != null) {
                        c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
                        bw5.t8 t8Var = new bw5.t8();
                        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = gf4Var.f456728e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
                        bw5.t8 mo11468x92b714fd = t8Var.mo11468x92b714fd(gVar2.g());
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsPresentEntrance");
                        ((j00.d2) m3Var).getClass();
                        n00.g gVar3 = n00.g.f415354a;
                        gVar3.getClass();
                        n00.g.f415356c.c(gVar3, n00.g.f415355b[0], mo11468x92b714fd);
                    }
                }
            }
        }
    }
}
