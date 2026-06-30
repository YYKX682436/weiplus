package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes3.dex */
public final class a4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13872x6961ca6f f189234e;

    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13872x6961ca6f c13872x6961ca6f) {
        this.f189234e = c13872x6961ca6f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13872x6961ca6f c13872x6961ca6f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWecoinHotLoader", "onSceneEnd: errType " + i17 + ", errCode " + i18 + " errMsg " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b4(i17, i18, str, new java.util.LinkedList(), 0L);
        if (!(scene instanceof ek2.l3) || i17 != 0 || i18 != 0) {
            return b4Var;
        }
        ek2.l3 l3Var = (ek2.l3) scene;
        java.util.Iterator it = l3Var.K().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            oVar = l3Var.f335029g;
            c13872x6961ca6f = this.f189234e;
            if (!hasNext) {
                break;
            }
            r45.a82 a82Var = (r45.a82) it.next();
            java.util.AbstractCollection m56387xe6796cde = c13872x6961ca6f.m56387xe6796cde();
            int size = l3Var.K().size();
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
            m56387xe6796cde.add(new so2.w2(size, ((r45.b81) fVar).m75942xfb822ef2(7), a82Var));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd: getTotalHeat:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        sb6.append(((r45.b81) fVar2).m75942xfb822ef2(9));
        sb6.append(", ifUseNewHeat:");
        sb6.append(c13872x6961ca6f.f189031h);
        sb6.append(", getNewTotalWecoinHot:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        sb6.append(((r45.b81) fVar3).m75942xfb822ef2(8));
        sb6.append(",getTotalWecoinHot:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        sb6.append(((r45.b81) fVar4).m75942xfb822ef2(7));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWecoinHotLoader", sb6.toString());
        if (c13872x6961ca6f.f189030g == 1) {
            java.util.LinkedList K = l3Var.K();
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar5 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b4(i17, i18, str, K, ((r45.b81) fVar5).m75942xfb822ef2(8));
        }
        java.util.LinkedList K2 = l3Var.K();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar6 = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.b4(i17, i18, str, K2, ((r45.b81) fVar6).m75942xfb822ef2(9));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p944x882e457a.m1 c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13872x6961ca6f c13872x6961ca6f = this.f189234e;
        return new ek2.l3(c13872x6961ca6f.f189027d, c13872x6961ca6f.f189028e, c13872x6961ca6f.f189029f, c13872x6961ca6f.m56357x44e5026c(), c13872x6961ca6f.f189030g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public com.p314xaae8f345.mm.p944x882e457a.m1 d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13872x6961ca6f c13872x6961ca6f = this.f189234e;
        return new ek2.l3(c13872x6961ca6f.f189027d, c13872x6961ca6f.f189028e, c13872x6961ca6f.f189029f, c13872x6961ca6f.m56357x44e5026c(), c13872x6961ca6f.f189030g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y
    public java.util.List e() {
        return kz5.b0.c(4168);
    }
}
