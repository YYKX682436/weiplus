package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class rw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f108947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f108947d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = this.f108947d.f108756h;
        if (finderHomeTabFragment != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).Q6();
        }
        return jz5.f0.f302826a;
    }
}
