package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class vc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f110894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f110895e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(com.tencent.mm.plugin.finder.feed.id idVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(1);
        this.f110894d = idVar;
        this.f110895e = finderItem;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData before lastBuffer ");
        if (this.f110894d.f107015u == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f110894d.f107015u;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        new db2.i4(this.f110895e, this.f110894d.getScene(), this.f110894d.f107015u, this.f110894d.f107004g).l().q(new com.tencent.mm.plugin.finder.feed.tc(this.f110894d)).h(new com.tencent.mm.plugin.finder.feed.uc(this.f110894d, this.f110895e, task)).f(this.f110894d);
        return jz5.f0.f302826a;
    }
}
