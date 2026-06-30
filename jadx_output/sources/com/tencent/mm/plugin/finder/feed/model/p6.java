package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class p6 extends com.tencent.mm.plugin.finder.feed.model.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader f108255e;

    public p6(com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader finderProfileLiveUserPageTimeLineLoader) {
        this.f108255e = finderProfileLiveUserPageTimeLineLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse b(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        com.tencent.mm.modelbase.o oVar;
        kotlin.jvm.internal.o.g(scene, "scene");
        if (!(scene instanceof ke2.x0)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.q6 q6Var = new com.tencent.mm.plugin.finder.feed.model.q6(i17, i18, str);
        ke2.x0 x0Var = (ke2.x0) scene;
        com.tencent.mm.protobuf.f fVar = x0Var.f306998h.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        q6Var.setHasMore(((r45.xd2) fVar).getInteger(4) == 1);
        java.util.List M = x0Var.M();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
        java.util.Iterator it = M.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            oVar = x0Var.f306998h;
            if (!hasNext) {
                break;
            }
            so2.q2 q2Var = new so2.q2((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 2);
            com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xd2) fVar2).getCustom(5);
            q2Var.a1(finderContact != null ? ya2.d.h(finderContact, null, false, 3, null) : null);
            arrayList.add(q2Var);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (((so2.q2) next).o2() == 4) {
                arrayList2.add(next);
            }
        }
        q6Var.setIncrementList(arrayList2);
        int pullType = q6Var.getPullType();
        com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader finderProfileLiveUserPageTimeLineLoader = this.f108255e;
        if (pullType == 0) {
            finderProfileLiveUserPageTimeLineLoader.f107593g.clear();
        }
        finderProfileLiveUserPageTimeLineLoader.f107593g.addAll(arrayList);
        com.tencent.mm.protobuf.f fVar3 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        q6Var.setLastBuffer(((r45.xd2) fVar3).getByteString(3));
        q6Var.setPullType(x0Var.f306997g);
        return q6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 c() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader finderProfileLiveUserPageTimeLineLoader = this.f108255e;
        ke2.x0 x0Var = new ke2.x0(finderProfileLiveUserPageTimeLineLoader.f107590d, finderProfileLiveUserPageTimeLineLoader.f107591e, finderProfileLiveUserPageTimeLineLoader.getLastBuffer(), finderProfileLiveUserPageTimeLineLoader.getContextObj());
        x0Var.f306997g = 2;
        return x0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.feed.model.q6 q6Var = new com.tencent.mm.plugin.finder.feed.model.q6(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader finderProfileLiveUserPageTimeLineLoader = this.f108255e;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderProfileLiveUserPageTimeLineLoader.getCache();
        if (cache == null || (arrayList3 = cache.f108300a) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList3) {
                so2.j5 j5Var = (so2.j5) obj;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                if ((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || feedObject.getMediaType() != 4) ? false : true) {
                    arrayList.add(obj);
                }
            }
        }
        q6Var.setIncrementList(arrayList);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderProfileLiveUserPageTimeLineLoader.getCache();
        q6Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache3 = finderProfileLiveUserPageTimeLineLoader.getCache();
        if (cache3 != null && (arrayList2 = cache3.f108300a) != null) {
            finderProfileLiveUserPageTimeLineLoader.f107593g.addAll(arrayList2);
        }
        return q6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 d() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader finderProfileLiveUserPageTimeLineLoader = this.f108255e;
        ke2.x0 x0Var = new ke2.x0(finderProfileLiveUserPageTimeLineLoader.f107590d, finderProfileLiveUserPageTimeLineLoader.f107591e, null, finderProfileLiveUserPageTimeLineLoader.getContextObj());
        x0Var.f306997g = 0;
        return x0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public java.util.List e() {
        return kz5.b0.c(5870);
    }
}
