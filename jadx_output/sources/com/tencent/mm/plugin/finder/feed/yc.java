package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class yc extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f111158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f111159b;

    public yc(com.tencent.mm.plugin.finder.feed.id idVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f111158a = idVar;
        this.f111159b = finderItem;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.feed.xc(this.f111158a, this.f111159b));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mm.plugin.finder.feed.id idVar = this.f111158a;
        if (idVar.f107012r) {
            return;
        }
        yw2.n nVar = idVar.f107010p;
        if (nVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(nVar.o(), null, 1, null);
        }
        yw2.n nVar2 = idVar.f107010p;
        if (nVar2 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.r(nVar2.o(), false, null, new com.tencent.mm.plugin.finder.feed.kc(idVar), 3, null);
        }
    }
}
