package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class q7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f108800a;

    public q7(com.tencent.mm.plugin.finder.feed.f8 f8Var) {
        this.f108800a = f8Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        if (fVar2 == null) {
            com.tencent.mars.xlog.Log.e("Finder.FavListDrawerPresenter", "loadMoreData resp null");
            return new java.util.LinkedList();
        }
        if (fVar2.f70615a != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            return new java.util.LinkedList();
        }
        this.f108800a.f(((r45.b61) fVar).f370542f == 1);
        this.f108800a.f106712f = ((r45.b61) fVar2.f70618d).f370541e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData after lastBuffer ");
        if (this.f108800a.f106712f == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f108800a.f106712f;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        return ((r45.b61) fVar2.f70618d).f370540d;
    }
}
