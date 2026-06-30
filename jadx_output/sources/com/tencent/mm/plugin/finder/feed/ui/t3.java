package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI f110553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI) {
        super(1);
        this.f110553d = finderGallerySearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI = this.f110553d;
        com.tencent.mm.plugin.finder.search.u4 u4Var = finderGallerySearchUI.f109262J;
        if (u4Var == null) {
            kotlin.jvm.internal.o.o("searchSuggestionManager");
            throw null;
        }
        u4Var.f125891l = it;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderGallerySearchUI.f109264v;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().n(it, null);
        finderGallerySearchUI.C = 2;
        com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI.e7(finderGallerySearchUI, it, null, 2, null);
        return jz5.f0.f302826a;
    }
}
