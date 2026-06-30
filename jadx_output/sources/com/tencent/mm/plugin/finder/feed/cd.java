package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class cd implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f106469a;

    public cd(com.tencent.mm.plugin.finder.feed.id idVar) {
        this.f106469a = idVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        java.lang.String b17;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        if (fVar2 == null) {
            com.tencent.mars.xlog.Log.e("Finder.DrawerPresenter", "refreshData resp null");
            return new com.tencent.mm.plugin.finder.feed.jc(false, null, null, null);
        }
        if (fVar2.f70615a != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            return new com.tencent.mm.plugin.finder.feed.jc(false, null, null, null);
        }
        this.f106469a.f107015u = ((r45.j61) fVar).getByteString(2);
        this.f106469a.f107013s = ((r45.j61) fVar2.f70618d).getInteger(4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshData lastBuffer ");
        if (this.f106469a.f107015u == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f106469a.f107015u;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        sb6.append(" totalCount ");
        sb6.append(this.f106469a.f107013s);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        this.f106469a.n(((r45.j61) fVar2.f70618d).getInteger(3) == 1);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.storage.z3 g17 = c01.z1.g();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("contact: ");
        sb7.append(g17 == null);
        sb7.append(", canShowLikeEdu:");
        sb7.append(com.tencent.mm.plugin.finder.feed.id.j(this.f106469a));
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb7.toString());
        if (com.tencent.mm.plugin.finder.feed.id.j(this.f106469a)) {
            int scene = this.f106469a.getScene();
            com.tencent.mm.plugin.finder.view.vc vcVar = com.tencent.mm.plugin.finder.view.FinderLikeDrawer.D;
            if (scene == 2 && g17 != null) {
                r45.md1 md1Var = new r45.md1();
                com.tencent.mm.plugin.finder.feed.id idVar = this.f106469a;
                md1Var.set(0, g17.f2());
                md1Var.set(5, idVar.f107008n);
                md1Var.set(2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                linkedList.add(md1Var);
                java.util.LinkedList list = ((r45.j61) fVar2.f70618d).getList(1);
                kotlin.jvm.internal.o.f(list, "getLikeList(...)");
                com.tencent.mm.plugin.finder.feed.id idVar2 = this.f106469a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!kotlin.jvm.internal.o.b(((r45.md1) obj2).getString(5), idVar2.f107008n)) {
                        arrayList.add(obj2);
                    }
                }
                linkedList.addAll(arrayList);
                return new com.tencent.mm.plugin.finder.feed.jc(true, linkedList, (r45.tl6) ((r45.j61) fVar2.f70618d).getCustom(5), (r45.a31) ((r45.j61) fVar2.f70618d).getCustom(6));
            }
        }
        linkedList.addAll(((r45.j61) fVar2.f70618d).getList(1));
        return new com.tencent.mm.plugin.finder.feed.jc(true, linkedList, (r45.tl6) ((r45.j61) fVar2.f70618d).getCustom(5), (r45.a31) ((r45.j61) fVar2.f70618d).getCustom(6));
    }
}
