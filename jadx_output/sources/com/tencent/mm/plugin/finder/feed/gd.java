package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gd extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f106833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f106834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f106835f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f106836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(boolean z17, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.plugin.finder.feed.id idVar, yz5.l lVar) {
        super(1);
        this.f106833d = z17;
        this.f106834e = finderItem;
        this.f106835f = idVar;
        this.f106836g = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fp0.r task = (fp0.r) obj;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "refreshData " + this.f106833d);
        new db2.i4(this.f106834e, this.f106835f.getScene(), this.f106835f.f107015u, this.f106835f.f107004g).l().q(new com.tencent.mm.plugin.finder.feed.cd(this.f106835f)).h(new com.tencent.mm.plugin.finder.feed.fd(this.f106836g, this.f106835f, this.f106833d, this.f106834e, java.lang.System.currentTimeMillis(), task)).f(this.f106835f);
        return jz5.f0.f302826a;
    }
}
