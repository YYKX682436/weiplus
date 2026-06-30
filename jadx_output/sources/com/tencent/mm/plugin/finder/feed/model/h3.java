package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class h3 extends com.tencent.mm.plugin.finder.feed.model.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader f107912e;

    public h3(com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader) {
        this.f107912e = finderLiveLotteryHistoryLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i(getTAG(), "onSceneEnd: errType " + i17 + ", errCode " + i18 + " errMsg " + str);
        com.tencent.mm.plugin.finder.feed.model.i3 i3Var = new com.tencent.mm.plugin.finder.feed.model.i3(i17, i18, str);
        if ((scene instanceof ek2.m3) && i17 == 0 && i18 == 0) {
            i3Var = new com.tencent.mm.plugin.finder.feed.model.i3(i17, i18, str);
            ek2.m3 m3Var = (ek2.m3) scene;
            com.tencent.mm.modelbase.o oVar = m3Var.f253505g;
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetPrizeHistoryResponse");
            i3Var.setLastBuffer(((r45.hu1) fVar).getByteString(3));
            com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetPrizeHistoryResponse");
            i3Var.setHasMore(((r45.hu1) fVar2).getInteger(4) == 1);
            if (this.f107912e.f107482i == 2) {
                com.tencent.mm.protobuf.f fVar3 = oVar.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetPrizeHistoryResponse");
                java.util.LinkedList<r45.xc5> list = ((r45.hu1) fVar3).getList(1);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                kotlin.jvm.internal.o.d(list);
                for (r45.xc5 xc5Var : list) {
                    kotlin.jvm.internal.o.d(xc5Var);
                    linkedList.add(new so2.y2(xc5Var));
                }
                i3Var.setIncrementList(linkedList);
            } else {
                com.tencent.mm.protobuf.f fVar4 = oVar.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetPrizeHistoryResponse");
                java.util.LinkedList<r45.q94> list2 = ((r45.hu1) fVar4).getList(2);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                kotlin.jvm.internal.o.d(list2);
                for (r45.q94 q94Var : list2) {
                    kotlin.jvm.internal.o.d(q94Var);
                    linkedList2.add(new so2.z2(q94Var));
                    java.util.LinkedList<r45.xc5> list3 = q94Var.getList(1);
                    if (list3 != null) {
                        for (r45.xc5 xc5Var2 : list3) {
                            kotlin.jvm.internal.o.d(xc5Var2);
                            linkedList2.add(new so2.y2(xc5Var2));
                        }
                    }
                }
                i3Var.setIncrementList(linkedList2);
            }
            i3Var.setPullType(m3Var.f253507i);
        }
        return i3Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 c() {
        com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader = this.f107912e;
        ek2.m3 m3Var = new ek2.m3(finderLiveLotteryHistoryLoader.f107477d, finderLiveLotteryHistoryLoader.f107478e, finderLiveLotteryHistoryLoader.f107479f, finderLiveLotteryHistoryLoader.f107480g, finderLiveLotteryHistoryLoader.getLastBuffer());
        m3Var.f253507i = 2;
        return m3Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 d() {
        com.tencent.mm.plugin.finder.feed.model.FinderLiveLotteryHistoryLoader finderLiveLotteryHistoryLoader = this.f107912e;
        ek2.m3 m3Var = new ek2.m3(finderLiveLotteryHistoryLoader.f107477d, finderLiveLotteryHistoryLoader.f107478e, finderLiveLotteryHistoryLoader.f107479f, finderLiveLotteryHistoryLoader.f107480g, finderLiveLotteryHistoryLoader.getLastBuffer());
        m3Var.f253507i = 0;
        return m3Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public java.util.List e() {
        return kz5.b0.c(22440);
    }
}
