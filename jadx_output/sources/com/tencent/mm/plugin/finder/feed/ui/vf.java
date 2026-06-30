package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class vf implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI f110657d;

    public vf(com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI finderLoaderFeedUI) {
        this.f110657d = finderLoaderFeedUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI finderLoaderFeedUI = this.f110657d;
            g4Var.d(10000, finderLoaderFeedUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), finderLoaderFeedUI.getContext().getResources().getString(com.tencent.mm.R.string.ev_));
        }
    }
}
