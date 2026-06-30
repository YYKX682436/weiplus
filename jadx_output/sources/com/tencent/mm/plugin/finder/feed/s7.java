package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class s7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f108977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(com.tencent.mm.plugin.finder.feed.f8 f8Var) {
        super(1);
        this.f108977d = f8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String b17;
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMoreData before lastBuffer ");
        if (this.f108977d.f106712f == null) {
            b17 = "null";
        } else {
            com.tencent.mm.protobuf.g gVar = this.f108977d.f106712f;
            b17 = com.tencent.mm.sdk.platformtools.w2.b(gVar != null ? gVar.g() : null);
        }
        sb6.append(b17);
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        java.lang.String userName = this.f108977d.a().getUserName();
        this.f108977d.getClass();
        com.tencent.mm.plugin.finder.view.p9 p9Var = com.tencent.mm.plugin.finder.view.FinderFavDrawer.B;
        new db2.h4(userName, 0, this.f108977d.f106712f, this.f108977d.a().getId(), 2).l().q(new com.tencent.mm.plugin.finder.feed.q7(this.f108977d)).h(new com.tencent.mm.plugin.finder.feed.r7(this.f108977d, task)).f(this.f108977d);
        return jz5.f0.f302826a;
    }
}
