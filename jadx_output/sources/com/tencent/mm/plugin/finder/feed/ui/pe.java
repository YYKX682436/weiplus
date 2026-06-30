package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class pe implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI f110421d;

    public pe(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI) {
        this.f110421d = finderLiveVisitorWhiteListUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.feed.ui.ud udVar = com.tencent.mm.plugin.finder.feed.ui.ud.f110604d;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWhiteListUI finderLiveVisitorWhiteListUI = this.f110421d;
        g4Var.f(1, finderLiveVisitorWhiteListUI.getString(com.tencent.mm.R.string.oux));
        com.tencent.mm.plugin.finder.feed.ui.ud udVar2 = com.tencent.mm.plugin.finder.feed.ui.ud.f110604d;
        g4Var.f(2, finderLiveVisitorWhiteListUI.getString(com.tencent.mm.R.string.our));
    }
}
