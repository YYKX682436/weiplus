package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes3.dex */
public final class a4 extends com.tencent.mm.plugin.finder.feed.model.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader f107701e;

    public a4(com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader finderLiveWecoinHotLoader) {
        this.f107701e = finderLiveWecoinHotLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader finderLiveWecoinHotLoader;
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("FinderLiveWecoinHotLoader", "onSceneEnd: errType " + i17 + ", errCode " + i18 + " errMsg " + str);
        com.tencent.mm.plugin.finder.feed.model.b4 b4Var = new com.tencent.mm.plugin.finder.feed.model.b4(i17, i18, str, new java.util.LinkedList(), 0L);
        if (!(scene instanceof ek2.l3) || i17 != 0 || i18 != 0) {
            return b4Var;
        }
        ek2.l3 l3Var = (ek2.l3) scene;
        java.util.Iterator it = l3Var.K().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            oVar = l3Var.f253496g;
            finderLiveWecoinHotLoader = this.f107701e;
            if (!hasNext) {
                break;
            }
            r45.a82 a82Var = (r45.a82) it.next();
            java.util.AbstractCollection dataList = finderLiveWecoinHotLoader.getDataList();
            int size = l3Var.K().size();
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
            dataList.add(new so2.w2(size, ((r45.b81) fVar).getLong(7), a82Var));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd: getTotalHeat:");
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        sb6.append(((r45.b81) fVar2).getLong(9));
        sb6.append(", ifUseNewHeat:");
        sb6.append(finderLiveWecoinHotLoader.f107498h);
        sb6.append(", getNewTotalWecoinHot:");
        com.tencent.mm.protobuf.f fVar3 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        sb6.append(((r45.b81) fVar3).getLong(8));
        sb6.append(",getTotalWecoinHot:");
        com.tencent.mm.protobuf.f fVar4 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        sb6.append(((r45.b81) fVar4).getLong(7));
        com.tencent.mars.xlog.Log.i("FinderLiveWecoinHotLoader", sb6.toString());
        if (finderLiveWecoinHotLoader.f107497g == 1) {
            java.util.LinkedList K = l3Var.K();
            com.tencent.mm.protobuf.f fVar5 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
            return new com.tencent.mm.plugin.finder.feed.model.b4(i17, i18, str, K, ((r45.b81) fVar5).getLong(8));
        }
        java.util.LinkedList K2 = l3Var.K();
        com.tencent.mm.protobuf.f fVar6 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        return new com.tencent.mm.plugin.finder.feed.model.b4(i17, i18, str, K2, ((r45.b81) fVar6).getLong(9));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 c() {
        com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader finderLiveWecoinHotLoader = this.f107701e;
        return new ek2.l3(finderLiveWecoinHotLoader.f107494d, finderLiveWecoinHotLoader.f107495e, finderLiveWecoinHotLoader.f107496f, finderLiveWecoinHotLoader.getLastBuffer(), finderLiveWecoinHotLoader.f107497g);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 d() {
        com.tencent.mm.plugin.finder.feed.model.FinderLiveWecoinHotLoader finderLiveWecoinHotLoader = this.f107701e;
        return new ek2.l3(finderLiveWecoinHotLoader.f107494d, finderLiveWecoinHotLoader.f107495e, finderLiveWecoinHotLoader.f107496f, finderLiveWecoinHotLoader.getLastBuffer(), finderLiveWecoinHotLoader.f107497g);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public java.util.List e() {
        return kz5.b0.c(4168);
    }
}
