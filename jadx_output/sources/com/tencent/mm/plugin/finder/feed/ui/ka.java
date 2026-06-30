package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ka extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI f110220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI) {
        super(0);
        this.f110220d = finderLiveKTVReplayUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI = this.f110220d;
        android.widget.FrameLayout frameLayout = finderLiveKTVReplayUI.f109380y;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(finderLiveKTVReplayUI);
        e4Var.f211776c = finderLiveKTVReplayUI.getString(com.tencent.mm.R.string.f493731ot5);
        e4Var.b(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
