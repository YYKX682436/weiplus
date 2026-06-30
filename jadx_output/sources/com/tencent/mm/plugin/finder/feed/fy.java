package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fy implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106788d;

    public fy(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        this.f106788d = pzVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        r45.xs2 xs2Var;
        r45.bz2 bz2Var;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = this.f106788d.f108756h;
        if (finderHomeTabFragment == null || z9Var == null || (jbVar = z9Var.f105329c) == null || (xs2Var = jbVar.N) == null || (bz2Var = (r45.bz2) xs2Var.getCustom(23)) == null || r45.ox2.a(bz2Var.f371167d) != r45.ox2.FinderStreamShowReddotType_LbsSameCity) {
            return;
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).Q6();
    }
}
