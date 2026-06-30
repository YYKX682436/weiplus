package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class z4 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final int f108507d;

    /* renamed from: e, reason: collision with root package name */
    public final int f108508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader f108509f;

    public z4(com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader, int i17, int i18) {
        this.f108509f = finderMixAllFeedLoader;
        this.f108507d = i17;
        this.f108508e = i18;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.a5 a5Var = new com.tencent.mm.plugin.finder.feed.model.a5(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader = this.f108509f;
        java.util.ArrayList arrayList = null;
        if (finderMixAllFeedLoader.f107525d) {
            com.tencent.mm.plugin.finder.feed.model.r9 cache = finderMixAllFeedLoader.getCache();
            a5Var.setIncrementList(cache != null ? cache.f108300a : null);
            com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderMixAllFeedLoader.getCache();
            a5Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        } else {
            a5Var.setIncrementList(bu2.d0.i(bu2.e0.f24498a, finderMixAllFeedLoader.getPageName(), null, 2, null));
        }
        java.lang.String tag = getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderMixAllFeedLoader_");
        sb6.append(this.f108507d);
        sb6.append('_');
        sb6.append(this.f108508e);
        sb6.append(" fetchInit incrementList size=");
        java.util.List incrementList = a5Var.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        sb6.append(' ');
        java.util.List<so2.j5> incrementList2 = a5Var.getIncrementList();
        if (incrementList2 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(incrementList2, 10));
            for (so2.j5 j5Var : incrementList2) {
                arrayList.add("type=" + j5Var.h() + ",id=" + j5Var.getItemId());
            }
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        return a5Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        int i19;
        int i27;
        java.util.List list;
        java.util.ArrayList arrayList;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        java.util.List list2;
        if (!(iVar instanceof bq.b0) || !(fVar instanceof r45.x61)) {
            return null;
        }
        int i28 = this.f108507d;
        int i29 = this.f108508e;
        int i37 = 0;
        com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader = this.f108509f;
        int i38 = 1;
        if (i17 == 0 && i18 == 0) {
            int i39 = com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader.f107524m;
            int i47 = i28 != 1 ? i28 != 2 ? i28 != 4 ? com.tencent.youtu.sdkkitframework.common.ErrorCode.YT_SDK_PARAM_ERROR : i29 == 2 ? com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62 : 8388608 : 256 : 4;
            if (i29 > 0) {
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                r45.x61 x61Var = (r45.x61) fVar;
                java.util.LinkedList<r45.cc1> list3 = x61Var.getList(4);
                kotlin.jvm.internal.o.f(list3, "getItem(...)");
                for (r45.cc1 cc1Var : list3) {
                    if (cc1Var.getInteger(i37) == 0) {
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) cc1Var.getCustom(i38);
                        if (finderObject != null && hc2.o0.C(finderObject)) {
                            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, i47);
                            r45.qt2 contextObj = finderMixAllFeedLoader.getContextObj();
                            a17.setCommentScene(contextObj != null ? contextObj.getInteger(5) : 0);
                            linkedList3.addLast(cu2.u.f222441a.p(a17));
                        }
                    } else if (cc1Var.getInteger(i37) == 1) {
                        linkedList3.addLast(new so2.a0(cc1Var));
                    }
                    i37 = 0;
                    i38 = 1;
                }
                bq.b0 b0Var = (bq.b0) iVar;
                b0Var.f23477p = linkedList3;
                java.lang.String tag = getTAG();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd tabFlag:");
                sb6.append(i28);
                sb6.append(" itemFlag:");
                sb6.append(i29);
                sb6.append(" sourceType:");
                sb6.append(i47);
                sb6.append(" interactionList:");
                java.util.LinkedList linkedList4 = b0Var.f23477p;
                sb6.append(linkedList4 != null ? java.lang.Integer.valueOf(linkedList4.size()) : null);
                sb6.append(", continueFlag:");
                sb6.append(x61Var.getInteger(2));
                com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                if (finderMixAllFeedLoader.getLastBuffer() == null) {
                    java.util.LinkedList linkedList5 = new java.util.LinkedList();
                    java.util.LinkedList<so2.j5> linkedList6 = b0Var.f23477p;
                    if (linkedList6 != null) {
                        for (so2.j5 j5Var : linkedList6) {
                            if (j5Var instanceof so2.a0) {
                                linkedList5.add(new bu2.j0(i47, (so2.a0) j5Var));
                            } else if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                                long itemId = j5Var.getItemId();
                                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                                linkedList5.add(new bu2.k0(0, itemId, baseFinderFeed.getFeedObject().getFeedObject(), i47, baseFinderFeed.getIsUnReadCacheFeed()));
                            }
                        }
                    }
                    java.lang.String f17 = xy2.c.f(finderMixAllFeedLoader.getContextObj());
                    int a18 = hc2.d0.a(i47);
                    if ((f17.length() > 0) && !kotlin.jvm.internal.o.b(f17, g92.b.f269769e.T0()) && a18 == 1) {
                        a18 = 3;
                    }
                    bu2.e0.f24498a.a(a18, f17, linkedList5);
                }
            } else {
                r45.x61 x61Var2 = (r45.x61) fVar;
                java.util.LinkedList list4 = x61Var2.getList(1);
                kotlin.jvm.internal.o.f(list4, "getObject(...)");
                if (list4.size() > 0) {
                    java.lang.Object obj = list4.get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    com.tencent.mars.xlog.Log.i(getTAG(), "onGYNetEnd list:" + list4.size() + " firstItem:" + pm0.b0.g((com.tencent.mm.protocal.protobuf.FinderObject) obj));
                }
                java.lang.String tag2 = getTAG();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onGYNetEnd list:");
                sb7.append(list4.size());
                sb7.append(", continueFlag:");
                sb7.append(x61Var2.getInteger(2));
                sb7.append(", maxId:");
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.k0(list4);
                sb7.append(finderObject2 != null ? java.lang.Long.valueOf(finderObject2.getDisplayId()) : null);
                sb7.append(' ');
                com.tencent.mars.xlog.Log.i(tag2, sb7.toString());
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list4) {
                    if (hc2.o0.C((com.tencent.mm.protocal.protobuf.FinderObject) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                bq.b0 b0Var2 = (bq.b0) iVar;
                cu2.t tVar = cu2.u.f222441a;
                b0Var2.f23476o = tVar.j(arrayList2, i47, finderMixAllFeedLoader.getContextObj());
                if (finderMixAllFeedLoader.getLastBuffer() == null && (list2 = b0Var2.f23476o) != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
                    }
                    tVar.m(arrayList3, i47, "", true);
                }
            }
        }
        boolean z17 = (i17 == 0 && i18 == 0 && ((r45.x61) fVar).getInteger(2) != 1) ? false : true;
        com.tencent.mm.plugin.finder.feed.model.a5 a5Var = new com.tencent.mm.plugin.finder.feed.model.a5(i17, i18, str);
        bq.b0 b0Var3 = (bq.b0) iVar;
        if (i29 > 0) {
            b0Var3.getClass();
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            i19 = 1;
            if (pm0.v.z(i29, 1) && pm0.v.z(i29, 2)) {
                java.util.LinkedList linkedList8 = b0Var3.f23477p;
                if (linkedList8 != null) {
                    linkedList7.addAll(linkedList8);
                }
                i27 = 2;
            } else {
                if (pm0.v.z(i29, 1) && (linkedList2 = b0Var3.f23477p) != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.lang.Object obj3 : linkedList2) {
                        if (obj3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                            arrayList4.add(obj3);
                        }
                    }
                    linkedList7.addAll(arrayList4);
                }
                i27 = 2;
                if (pm0.v.z(i29, 2) && (linkedList = b0Var3.f23477p) != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    for (java.lang.Object obj4 : linkedList) {
                        if (obj4 instanceof so2.a0) {
                            arrayList5.add(obj4);
                        }
                    }
                    linkedList7.addAll(arrayList5);
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("getAllItemInfo itemFlag=");
            sb8.append(i29);
            sb8.append(" videoList:");
            java.util.List list5 = b0Var3.f23476o;
            sb8.append(list5 != null ? java.lang.Integer.valueOf(list5.size()) : null);
            sb8.append(", interactionList:");
            java.util.LinkedList linkedList9 = b0Var3.f23477p;
            sb8.append(linkedList9 != null ? java.lang.Integer.valueOf(linkedList9.size()) : null);
            sb8.append(" resultList:");
            sb8.append(linkedList7.size());
            com.tencent.mars.xlog.Log.i("Finder.FinderGetAllListCgi", sb8.toString());
            list = linkedList7;
        } else {
            i19 = 1;
            i27 = 2;
            java.util.List list6 = b0Var3.f23476o;
            if (list6 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(list6, 10));
                java.util.Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()));
                }
                list = kz5.n0.V0(arrayList6);
            } else {
                list = null;
            }
        }
        if (finderMixAllFeedLoader.f107525d && list != null) {
            pm0.v.c0(list, com.tencent.mm.plugin.finder.feed.model.y4.f108477d);
        }
        a5Var.setIncrementList(list);
        a5Var.setPullType(finderMixAllFeedLoader.getLastBuffer() == null ? i19 : i27);
        a5Var.setLastBuffer(((r45.x61) fVar).getByteString(3));
        a5Var.setHasMore(z17);
        java.lang.String tag3 = getTAG();
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("FinderMixAllFeedLoader_");
        sb9.append(i28);
        sb9.append('_');
        sb9.append(i29);
        sb9.append(" dealOnSceneEnd pullType=");
        sb9.append(a5Var.getPullType());
        sb9.append(" dataList(");
        sb9.append(finderMixAllFeedLoader.getDataList().hashCode());
        sb9.append(") size=");
        sb9.append(finderMixAllFeedLoader.getDataList().size());
        sb9.append(" incrementList size=");
        java.util.List incrementList = a5Var.getIncrementList();
        sb9.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        sb9.append("(incrementListFromCgi size=");
        sb9.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb9.append(") ");
        java.util.List<so2.j5> incrementList2 = a5Var.getIncrementList();
        if (incrementList2 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(incrementList2, 10));
            for (so2.j5 j5Var2 : incrementList2) {
                arrayList.add("type=" + j5Var2.h() + ",id=" + j5Var2.getItemId());
            }
        } else {
            arrayList = null;
        }
        sb9.append(arrayList);
        com.tencent.mars.xlog.Log.i(tag3, sb9.toString());
        return a5Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader = this.f108509f;
        return new bq.b0(this.f108507d, finderMixAllFeedLoader.getLastBuffer(), finderMixAllFeedLoader.getContextObj(), this.f108508e);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader = this.f108509f;
        return new bq.b0(this.f108507d, finderMixAllFeedLoader.getLastBuffer(), finderMixAllFeedLoader.getContextObj(), this.f108508e);
    }
}
