package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class g8 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI f110078a;

    public g8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI) {
        this.f110078a = finderLiveBizSearchUI;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizSearchUI finderLiveBizSearchUI = this.f110078a;
        com.tencent.mm.ui.search.FTSSearchView fTSSearchView = finderLiveBizSearchUI.f109350x;
        if (fTSSearchView != null) {
            finderLiveBizSearchUI.d7(r26.n0.u0(fTSSearchView.getFtsEditText().getEditText().getText().toString()).toString(), new com.tencent.mm.plugin.finder.feed.ui.i8(finderLiveBizSearchUI));
            return true;
        }
        kotlin.jvm.internal.o.o("searchView");
        throw null;
    }
}
