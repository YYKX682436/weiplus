package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment f111119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f111120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment, com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f111119d = finderHomeTabFragment;
        this.f111120e = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment = this.f111119d;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        ((com.tencent.mm.plugin.finder.viewmodel.component.t80) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)).O6(this.f111120e.f108755g.getIntent());
        return jz5.f0.f302826a;
    }
}
