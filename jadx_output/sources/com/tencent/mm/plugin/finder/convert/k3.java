package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class k3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView f103795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f103796b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103797c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103798d;

    public k3(com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView, long j17, in5.s0 s0Var, so2.y0 y0Var) {
        this.f103795a = finderCommentAdVideoView;
        this.f103796b = j17;
        this.f103797c = s0Var;
        this.f103798d = y0Var;
    }

    @Override // ym5.n0
    public boolean getAdditionalCondition(android.view.View target) {
        kotlin.jvm.internal.o.g(target, "target");
        android.content.Context context = target.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ha haVar = (com.tencent.mm.plugin.finder.viewmodel.component.ha) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.ha.class);
        int O6 = haVar != null ? haVar.O6() : -1;
        android.content.Context context2 = this.f103797c.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.report.u.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (O6 == -1 || O6 == 1) && ((com.tencent.mm.plugin.finder.report.u) a17).f125374f;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        so2.y0 y0Var = this.f103798d;
        in5.s0 s0Var = this.f103797c;
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView = this.f103795a;
        if (!z17) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.report.u.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.finder.report.u) a17).V6(y0Var.f410703d.field_feedId, y0Var);
            rh3.o player = finderCommentAdVideoView.getPlayer();
            if (player != null ? player.isPlaying() : false) {
                finderCommentAdVideoView.q();
                return;
            } else {
                com.tencent.mars.xlog.Log.w("Finder.FinderFeedCommentConvert", "onViewExposed: ad video view is not playing, do not pause");
                return;
            }
        }
        finderCommentAdVideoView.getMediaReporter().e(this.f103796b);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.report.u.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        ((com.tencent.mm.plugin.finder.report.u) a18).T6(y0Var.f410703d.field_feedId, y0Var);
        finderCommentAdVideoView.setMute(true);
        if (finderCommentAdVideoView.getPlayerState() == 6) {
            com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.r(this.f103795a, null, 0L, 3, null);
        } else {
            finderCommentAdVideoView.curStartPlayTime = c01.id.c();
            finderCommentAdVideoView.getPlayer().b(true);
            com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.r(this.f103795a, null, 0L, 3, null);
        }
        s0Var.f293124h = java.lang.Boolean.TRUE;
    }
}
