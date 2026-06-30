package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class f2 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader f107848d;

    public f2(com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader) {
        this.f107848d = finderFriendLikeLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.g2 g2Var = new com.tencent.mm.plugin.finder.feed.model.g2(0, 0, "");
        java.util.Collection collection = (java.util.List) com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader.f107456g.get(this.f107848d.f107457d);
        if (collection == null) {
            collection = new java.util.ArrayList();
        }
        g2Var.setIncrementList(collection);
        g2Var.setLastBuffer(null);
        return g2Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        java.util.List list;
        int i19;
        boolean z17;
        java.util.ArrayList arrayList;
        java.util.List incrementList;
        com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader = this.f107848d;
        if (i18 == -4100) {
            com.tencent.mm.plugin.finder.assist.k8 k8Var = com.tencent.mm.plugin.finder.assist.k8.f102328a;
            java.lang.String wxUsername = finderFriendLikeLoader.f107457d;
            kotlin.jvm.internal.o.g(wxUsername, "wxUsername");
            r45.nw6 b17 = k8Var.b(wxUsername);
            if (b17 != null) {
                b17.set(3, 0);
            }
        }
        if (!(iVar instanceof bq.n0) || !(fVar instanceof r45.d71)) {
            return null;
        }
        if (i17 == 0 && i18 == 0) {
            yr2.a aVar = yr2.a.f464659a;
            r45.d71 d71Var = (r45.d71) fVar;
            r45.sq2 sq2Var = (r45.sq2) d71Var.getCustom(8);
            java.util.LinkedList list2 = d71Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getLiked_list(...)");
            aVar.b(sq2Var, list2, 3965);
            java.util.LinkedList list3 = d71Var.getList(1);
            kotlin.jvm.internal.o.f(list3, "getLiked_list(...)");
            if (list3.size() > 0) {
                java.lang.Object obj = list3.get(0);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                com.tencent.mars.xlog.Log.i(getTAG(), "onGYNetEnd list:" + list3.size() + " firstItem:" + pm0.b0.g((com.tencent.mm.protocal.protobuf.FinderObject) obj));
            }
            java.lang.String tag = getTAG();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd list:");
            sb6.append(list3.size());
            sb6.append(", continueFlag:");
            sb6.append(d71Var.getInteger(3));
            sb6.append(", maxId:");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.k0(list3);
            sb6.append(finderObject != null ? java.lang.Long.valueOf(finderObject.getDisplayId()) : null);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i(tag, sb6.toString());
            bq.n0 n0Var = (bq.n0) iVar;
            boolean z18 = n0Var.f23497o != 2 && com.tencent.mm.sdk.platformtools.t8.K0(n0Var.f23498p);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list3) {
                if (hc2.o0.C((com.tencent.mm.protocal.protobuf.FinderObject) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            cu2.t tVar = cu2.u.f222441a;
            list = tVar.j(arrayList2, 4, finderFriendLikeLoader.getContextObj());
            if (z18 && n0Var.f23500r != 1 && n0Var.f23499q) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it.next()));
                }
                tVar.m(arrayList3, 4, "", z18);
            }
        } else {
            list = null;
        }
        if (i17 != 0 || i18 != 0) {
            i19 = -4100;
            if (i18 != -4100) {
                z17 = true;
            }
            z17 = false;
        } else if (((r45.d71) fVar).getInteger(3) == 1) {
            z17 = true;
            i19 = -4100;
        } else {
            i19 = -4100;
            z17 = false;
        }
        com.tencent.mm.plugin.finder.feed.model.g2 g2Var = i18 != i19 ? new com.tencent.mm.plugin.finder.feed.model.g2(i17, i18, str) : new com.tencent.mm.plugin.finder.feed.model.g2(0, 0, "");
        if (list != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList4.add(cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()));
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        g2Var.setIncrementList(arrayList);
        bq.n0 n0Var2 = (bq.n0) iVar;
        g2Var.setPullType(n0Var2.f23497o);
        g2Var.setLastBuffer(((r45.d71) fVar).getByteString(2));
        g2Var.setHasMore(z17);
        if (n0Var2.f23497o == 0 && (incrementList = g2Var.getIncrementList()) != null) {
        }
        return g2Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader = this.f107848d;
        return new bq.n0(0L, finderFriendLikeLoader.getLastBuffer(), 2, finderFriendLikeLoader.f107457d, finderFriendLikeLoader.getContextObj(), 0, false, 32, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderFriendLikeLoader finderFriendLikeLoader = this.f107848d;
        return new bq.n0(0L, finderFriendLikeLoader.getLastBuffer(), 0, finderFriendLikeLoader.f107457d, finderFriendLikeLoader.getContextObj(), 0, false, 32, null);
    }
}
