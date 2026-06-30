package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ui implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI f110613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f110614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f110615f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f110616g;

    public ui(com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI finderProfileTimeLineUI, long j17, boolean z17, in5.s0 s0Var) {
        this.f110613d = finderProfileTimeLineUI;
        this.f110614e = j17;
        this.f110615f = z17;
        this.f110616g = s0Var;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public final void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        cw2.da videoView;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        java.lang.String str = this.f110613d.f109505t;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSeek: onSeekComplete, feedId=");
        sb6.append(pm0.v.u(this.f110614e));
        sb6.append(", afterSeekPlay=");
        boolean z17 = this.f110615f;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        in5.s0 s0Var = this.f110616g;
        if (!z17 && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null) {
            cw2.v9.j(finderVideoLayout, false, 1, null);
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout2 == null || (videoView = finderVideoLayout2.getVideoView()) == null) {
            return;
        }
        videoView.setMute(false);
    }
}
