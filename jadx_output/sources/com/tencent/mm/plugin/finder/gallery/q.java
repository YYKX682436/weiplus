package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment f111399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment finderGalleryFragment) {
        super(1);
        this.f111399d = finderGalleryFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.gallery.FinderGalleryFragment finderGalleryFragment = this.f111399d;
        com.tencent.mm.plugin.finder.gallery.a0 a0Var = finderGalleryFragment.f111330w;
        if (a0Var == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        a0Var.h();
        com.tencent.mm.plugin.finder.gallery.v0 v0Var = finderGalleryFragment.f111331x;
        if (v0Var != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.T(v0Var.f106180m, 0, false, null, 7, null);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }
}
