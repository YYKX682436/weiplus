package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class z7 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI f110794a;

    public z7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI) {
        this.f110794a = finderLiveBizListUI;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI finderLiveBizListUI = this.f110794a;
        com.tencent.mm.plugin.finder.feed.ui.y7 y7Var = new com.tencent.mm.plugin.finder.feed.ui.y7(finderLiveBizListUI);
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI.C;
        finderLiveBizListUI.d7(y7Var);
        return true;
    }
}
