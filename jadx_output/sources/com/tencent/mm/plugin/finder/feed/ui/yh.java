package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class yh implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment f110772a;

    public yh(com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment finderPostPlaySquareContainerFragment) {
        this.f110772a = finderPostPlaySquareContainerFragment;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment.A;
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPlaySquareContainerFragment finderPostPlaySquareContainerFragment = this.f110772a;
        com.tencent.mm.ui.MMActivity activity = (com.tencent.mm.ui.MMActivity) ((jz5.n) finderPostPlaySquareContainerFragment.f109496z).getValue();
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        return kz5.c1.k(new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("ref_commentscene", java.lang.Integer.valueOf(V6.getInteger(7))), new jz5.l("cluster_profile_type", java.lang.Integer.valueOf(finderPostPlaySquareContainerFragment.f129265p)));
    }
}
