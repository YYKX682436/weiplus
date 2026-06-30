package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class kc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f107181d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(com.tencent.mm.plugin.finder.feed.id idVar) {
        super(0);
        this.f107181d = idVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yw2.n nVar = this.f107181d.f107010p;
        com.tencent.mm.view.RefreshLoadMoreLayout o17 = nVar != null ? nVar.o() : null;
        if (o17 != null) {
            o17.setCanLoadMore(false);
        }
        return jz5.f0.f302826a;
    }
}
