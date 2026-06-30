package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI f110635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI) {
        super(1);
        this.f110635d = finderGallerySearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String suggestion = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(suggestion, "suggestion");
        com.tencent.mars.xlog.Log.i("Finder.FinderGallerySearchUI", "onSuggestion Click :".concat(suggestion));
        com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI = this.f110635d;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderGallerySearchUI.f109264v;
        if (fTSSearchView == null) {
            kotlin.jvm.internal.o.o("searchView");
            throw null;
        }
        fTSSearchView.getFtsEditText().n(suggestion, null);
        com.tencent.mm.plugin.finder.search.k4 k4Var = finderGallerySearchUI.I;
        if (k4Var == null) {
            kotlin.jvm.internal.o.o("historyLogic");
            throw null;
        }
        k4Var.c(suggestion);
        finderGallerySearchUI.C = 4;
        com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI.e7(finderGallerySearchUI, suggestion, null, 2, null);
        return jz5.f0.f302826a;
    }
}
