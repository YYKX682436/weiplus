package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class r3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pq5.g f108886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fp0.r f108887c;

    public r3(com.tencent.mm.plugin.finder.feed.a7 a7Var, pq5.g gVar, fp0.r rVar) {
        this.f108885a = a7Var;
        this.f108886b = gVar;
        this.f108887c = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.modelbase.i iVar = fVar2.f70620f;
        db2.j4 j4Var = iVar instanceof db2.j4 ? (db2.j4) iVar : null;
        java.lang.Long valueOf = j4Var != null ? java.lang.Long.valueOf(j4Var.f228025t) : null;
        r45.vg7 vg7Var = j4Var != null ? j4Var.f228029x : null;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127971ud).getValue()).r()).booleanValue() && valueOf != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f108885a.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            if (valueOf.longValue() != finderItem.getId()) {
                com.tencent.mars.xlog.Log.w("Finder.DrawerPresenter", "loadMore skip feedId not match");
                this.f108886b.j(true);
                this.f108887c.b(fp0.u.f265290f);
                return new com.tencent.mm.plugin.finder.feed.m2(false, null);
            }
        }
        if (this.f108885a.G() && vg7Var != this.f108885a.j0()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMore skip sortType not match, reqSortType = ");
            sb6.append(vg7Var != null ? java.lang.Integer.valueOf(vg7Var.f388228d) : null);
            sb6.append(", sortType = ");
            sb6.append(this.f108885a.j0().f388228d);
            com.tencent.mars.xlog.Log.w("Finder.DrawerPresenter", sb6.toString());
            this.f108886b.j(true);
            this.f108887c.b(fp0.u.f265290f);
            return new com.tencent.mm.plugin.finder.feed.m2(false, null);
        }
        if (fVar2.f70615a != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            return new com.tencent.mm.plugin.finder.feed.m2(false, new java.util.ArrayList());
        }
        this.f108885a.D0(((r45.j51) fVar).getInteger(5) == 1);
        this.f108885a.f106222s = ((r45.j51) fVar2.f70618d).getByteString(3);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("loadMoreData after lastBuffer ");
        if (this.f108885a.f106222s == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f108885a.f106222s;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb7.append(b17);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb7.toString());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f108885a;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> list = ((r45.j51) fVar2.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getCommentInfo(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : list) {
            kotlin.jvm.internal.o.d(finderCommentInfo);
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
            if (finderItem2 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            long id6 = finderItem2.getId();
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = a7Var.f106212i;
            if (finderItem3 == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            java.lang.String dupFlag = finderItem3.getDupFlag();
            com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
            yj0Var.field_feedId = id6;
            yj0Var.field_dupFlag = dupFlag;
            yj0Var.field_state = 2;
            yj0Var.field_actionInfo.set(1, finderCommentInfo);
            yj0Var.n1(0L);
            arrayList2.add(new so2.y0(yj0Var));
        }
        arrayList.addAll(arrayList2);
        return new com.tencent.mm.plugin.finder.feed.m2(true, this.f108885a.Q(arrayList, true));
    }
}
