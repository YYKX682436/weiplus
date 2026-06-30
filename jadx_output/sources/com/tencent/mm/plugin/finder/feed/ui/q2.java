package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager f110438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f110439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI f110440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f110441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.finder.feed.ui.FinderFloatBallDetailUI finderFloatBallDetailUI, long j17) {
        super(0);
        this.f110438d = finderLinearLayoutManager;
        this.f110439e = recyclerView;
        this.f110440f = finderFloatBallDetailUI;
        this.f110441g = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        in5.c cVar;
        androidx.recyclerview.widget.k3 p07 = this.f110439e.p0(this.f110438d.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        float floatExtra = this.f110440f.getIntent().getFloatExtra("KEY_VIDEO_PLAY_SPEED_RATIO", 1.0f);
        ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).N6((s0Var == null || (cVar = (in5.c) s0Var.f293125i) == null) ? 0L : cVar.getItemId());
        java.lang.Object obj = s0Var != null ? (in5.c) s0Var.f293125i : null;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var != null) {
            u1Var.f410632f = true;
        }
        if (s0Var != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, this.f110441g, 0, floatExtra, false, null, 26, null);
        }
        return jz5.f0.f302826a;
    }
}
