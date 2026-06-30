package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class la extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI f110262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f110263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f110264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI, int i17, int i18) {
        super(0);
        this.f110262d = finderLiveKTVReplayUI;
        this.f110263e = i17;
        this.f110264f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI.D;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI = this.f110262d;
        android.widget.TextView textView = finderLiveKTVReplayUI.A;
        int i18 = this.f110263e;
        int i19 = this.f110264f;
        if (textView != null) {
            textView.setText(finderLiveKTVReplayUI.getString(com.tencent.mm.R.string.ot9, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
        }
        int i27 = (i18 * 100) / i19;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveKTVReplayCircleProgressView finderLiveKTVReplayCircleProgressView = finderLiveKTVReplayUI.f109381z;
        if (finderLiveKTVReplayCircleProgressView != null) {
            finderLiveKTVReplayCircleProgressView.setProgress(i27);
        }
        return jz5.f0.f302826a;
    }
}
