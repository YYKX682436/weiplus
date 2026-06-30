package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ey implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106675d;

    public ey(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        this.f106675d = pzVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = this.f106675d.f108756h;
        if (finderHomeTabFragment != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).Q6();
        }
    }
}
