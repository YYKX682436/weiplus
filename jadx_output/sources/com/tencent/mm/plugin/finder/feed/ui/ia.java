package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ia implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI f110146d;

    public ia(com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI) {
        this.f110146d = finderLiveKTVReplayUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI = this.f110146d;
        g4Var.d(0, i65.a.d(finderLiveKTVReplayUI.getContext(), com.tencent.mm.R.color.FG_0), finderLiveKTVReplayUI.getString(com.tencent.mm.R.string.ot7));
    }
}
