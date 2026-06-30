package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class tc implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f109054a;

    public tc(com.tencent.mm.plugin.finder.feed.id idVar) {
        this.f109054a = idVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        if (fVar2 == null) {
            com.tencent.mars.xlog.Log.e("Finder.DrawerPresenter", "loadMoreData resp null");
            return new java.util.LinkedList();
        }
        if (fVar2.f70615a != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            return new java.util.LinkedList();
        }
        this.f109054a.n(((r45.j61) fVar).getInteger(3) == 1);
        this.f109054a.f107015u = ((r45.j61) fVar2.f70618d).getByteString(2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData after lastBuffer ");
        if (this.f109054a.f107015u == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f109054a.f107015u;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        if (com.tencent.mm.plugin.finder.feed.id.j(this.f109054a)) {
            int scene = this.f109054a.getScene();
            com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
            if (scene == 2) {
                java.util.LinkedList list = ((r45.j61) fVar2.f70618d).getList(1);
                kotlin.jvm.internal.o.f(list, "getLikeList(...)");
                com.tencent.mm.plugin.finder.feed.id idVar = this.f109054a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!kotlin.jvm.internal.o.b(((r45.md1) obj2).getString(5), idVar.f107008n)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            }
        }
        return ((r45.j61) fVar2.f70618d).getList(1);
    }
}
