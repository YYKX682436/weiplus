package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vd implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.hr2 f104781c;

    public vd(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.hr2 hr2Var) {
        this.f104779a = s0Var;
        this.f104780b = baseFinderFeed;
        this.f104781c = hr2Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        in5.s0 s0Var = this.f104779a;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        cw2.da videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.qt2 d17 = xy2.c.d(context);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("video_progress", java.lang.Long.valueOf(finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getCurrentPlayMs() : 0L));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f104780b;
        lVarArr[1] = new jz5.l("videodurations", finderThumbPlayerProxy != null ? java.lang.Long.valueOf(finderThumbPlayerProxy.getVideoDurationMs()) : java.lang.Integer.valueOf(baseFinderFeed.getFeedObject().getVideoDuration() * 1000));
        r45.hr2 hr2Var = this.f104781c;
        lVarArr[2] = new jz5.l("keyword", hr2Var != null ? hr2Var.getString(0) : null);
        lVarArr[3] = new jz5.l("finder_tab_context_id", d17 != null ? d17.getString(2) : null);
        lVarArr[4] = new jz5.l("finder_context_id", d17 != null ? d17.getString(1) : null);
        lVarArr[5] = new jz5.l("comment_scene", d17 != null ? java.lang.Integer.valueOf(d17.getInteger(5)) : null);
        lVarArr[6] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        lVarArr[7] = new jz5.l("jump_progress", java.lang.Integer.valueOf((hr2Var != null ? hr2Var.getInteger(1) : 0) * 1000));
        return kz5.c1.k(lVarArr);
    }
}
