package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class sw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f109011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f109011d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f109011d;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar.f108756h;
        if (finderHomeTabFragment != null && (l0Var = ((com.tencent.mm.plugin.finder.viewmodel.component.w6) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d) != null) {
            return l0Var;
        }
        com.tencent.mm.ui.MMActivity activity = pzVar.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((com.tencent.mm.plugin.finder.viewmodel.component.w6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.w6.class)).f136307d;
    }
}
