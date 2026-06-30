package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class gy implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106870d;

    public gy(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        this.f106870d = pzVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.xs2 xs2Var;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) obj;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106870d;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar.f108756h;
        if (finderHomeTabFragment != null && z9Var.f105327a) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = z9Var.f105329c;
            r45.bz2 bz2Var = (jbVar == null || (xs2Var = jbVar.N) == null) ? null : (r45.bz2) xs2Var.getCustom(23);
            java.lang.String str = pzVar.U;
            if (bz2Var == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderTlPersonalCenter callback, result?.ctrInfo?.finderRedDotExtInfo?.show_info is null, ctrlInfo:");
                sb6.append(jbVar);
                sb6.append(", finderRedDotExtInfo:");
                sb6.append(jbVar != null ? jbVar.N : null);
                com.tencent.mars.xlog.Log.e(str, sb6.toString());
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "finderTlPersonalCenter callback, result?.ctrInfo?.finderRedDotExtInfo?.show_info:" + bz2Var.toJSON());
            if (r45.ox2.a(bz2Var.f371167d) != r45.ox2.FinderStreamShowReddotType_PersonalCenter) {
                return;
            }
            so2.a2 a2Var = pzVar.f108774x1;
            so2.f5 f5Var = a2Var.f410250g;
            r45.px2 px2Var = new r45.px2();
            px2Var.set(0, java.lang.Integer.valueOf(bz2Var.f371167d));
            px2Var.set(2, java.lang.Integer.valueOf(bz2Var.f371169f));
            px2Var.set(1, bz2Var.f371168e);
            px2Var.set(3, java.lang.Long.valueOf(bz2Var.f371170g));
            px2Var.set(4, bz2Var.f371171h);
            f5Var.f410347c = px2Var;
            a2Var.f410250g.f410345a = 1;
            ((com.tencent.mm.plugin.finder.viewmodel.component.d1) pf5.z.f353948a.b(finderHomeTabFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.d1.class)).Q6();
        }
    }
}
