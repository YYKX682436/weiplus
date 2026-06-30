package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class v7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f110878a;

    public v7(com.tencent.mm.plugin.finder.feed.f8 f8Var) {
        this.f110878a = f8Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        if (fVar2 == null) {
            com.tencent.mars.xlog.Log.e("Finder.FavListDrawerPresenter", "refreshData resp null");
            return new com.tencent.mm.plugin.finder.feed.m7(false, null, null, null);
        }
        if (fVar2.f70615a != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            return new com.tencent.mm.plugin.finder.feed.m7(false, null, null, null);
        }
        this.f110878a.f106712f = ((r45.b61) fVar).f370541e;
        com.tencent.mm.plugin.finder.feed.f8 f8Var = this.f110878a;
        r45.b61 b61Var = (r45.b61) fVar2.f70618d;
        f8Var.f106713g = b61Var.f370543g;
        f8Var.f106714h = b61Var.f370545i;
        f8Var.f106715i = b61Var.f370546m;
        f8Var.f106716m = b61Var.f370548o;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshData: lastBuffer=");
        if (this.f110878a.f106712f == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f110878a.f106712f;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        sb6.append(", totalCount=");
        sb6.append(this.f110878a.f106713g);
        sb6.append(", snsFavCount=");
        sb6.append(this.f110878a.f106714h);
        sb6.append(", commentFavCount: ");
        sb6.append(this.f110878a.f106715i);
        sb6.append(", fromMySnsFingerLikeCount: ");
        sb6.append(this.f110878a.f106716m);
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        this.f110878a.f(((r45.b61) fVar2.f70618d).f370542f == 1);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.storage.z3 g17 = c01.z1.g();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("contact: ");
        sb7.append(g17 == null);
        sb7.append(", canShowLikeEdu:false");
        this.f110878a.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", sb7.toString());
        linkedList.addAll(((r45.b61) fVar2.f70618d).f370540d);
        r45.b61 b61Var2 = (r45.b61) fVar2.f70618d;
        return new com.tencent.mm.plugin.finder.feed.m7(true, linkedList, b61Var2.f370547n, b61Var2.f370549p);
    }
}
