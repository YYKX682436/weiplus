package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class vi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f110661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f110662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI f110663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f110664g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f110665h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f110666i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi(com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI finderProfileTimeLineUI, long j17, float f17, boolean z17) {
        super(0);
        this.f110661d = finderLinearLayoutManager;
        this.f110662e = recyclerView;
        this.f110663f = finderProfileTimeLineUI;
        this.f110664g = j17;
        this.f110665h = f17;
        this.f110666i = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vo2.d player;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        in5.c cVar;
        androidx.recyclerview.widget.k3 p07 = this.f110662e.p0(this.f110661d.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        long itemId = (s0Var == null || (cVar = (in5.c) s0Var.f293125i) == null) ? 0L : cVar.getItemId();
        boolean z17 = false;
        boolean z18 = s0Var != null && s0Var.getItemViewType() == 4;
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI finderProfileTimeLineUI = this.f110663f;
        long j17 = this.f110664g;
        if (z18) {
            com.tencent.mars.xlog.Log.i(finderProfileTimeLineUI.f109505t, "checkSeek: video feedId=" + pm0.v.u(itemId) + " seekTime=" + j17 + " playSpeedRatio:" + this.f110665h + " afterSeekPlay:" + this.f110666i);
            ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).N6(itemId);
            java.lang.Object obj = s0Var.f293125i;
            so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
            if (u1Var != null) {
                u1Var.f410632f = true;
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
            zy2.g5 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
            if (finderThumbPlayerProxy2 != null) {
                finderThumbPlayerProxy2.setMute(true);
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
            if (finderVideoLayout2 != null) {
                long j18 = this.f110664g;
                float f17 = this.f110665h;
                boolean z19 = this.f110666i;
                com.tencent.mm.plugin.finder.feed.ui.ui uiVar = new com.tencent.mm.plugin.finder.feed.ui.ui(this.f110663f, itemId, z19, s0Var);
                cw2.b0 b0Var = finderVideoLayout2.E;
                b0Var.getClass();
                pm0.v.X(new cw2.a0(b0Var, j18, 3, f17, z19, uiVar));
            }
        } else {
            if (s0Var != null && s0Var.getItemViewType() == 2) {
                z17 = true;
            }
            if (z17 && j17 > 0) {
                com.tencent.mars.xlog.Log.i(finderProfileTimeLineUI.f109505t, "[checkSeek] photo feedId=" + pm0.v.u(itemId) + " seekTime=" + j17);
                com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag = (com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag) s0Var.p(com.tencent.mm.R.id.agy);
                if (finderImgFeedMusicTag != null && (player = finderImgFeedMusicTag.getPlayer()) != null && (finderThumbPlayerProxy = ((vo2.c) player).f438559b) != null) {
                    finderThumbPlayerProxy.f0(j17, true, 3);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
