package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class zj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f111272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f111273e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(com.tencent.mm.plugin.finder.feed.tl tlVar, long j17) {
        super(0);
        this.f111272d = tlVar;
        this.f111273e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        cw2.da videoView;
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f111272d;
        java.lang.Object obj = tlVar.f().f293125i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        long j17 = this.f111273e;
        if (j17 > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L7).getValue()).r()).intValue() != 1) {
                com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "show remind dialog not open");
            } else {
                java.lang.String stringExtra = tlVar.f109069d.getIntent().getStringExtra("FLOAT_BALL_KEY");
                boolean z17 = false;
                if (!(!(stringExtra == null || stringExtra.length() == 0))) {
                    if (u1Var != null && tlVar.f109088z == u1Var.getItemId()) {
                        z17 = true;
                    }
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "same feed id");
                    } else {
                        tlVar.f().p(com.tencent.mm.R.id.frs).getLocationInWindow(new int[2]);
                        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) tlVar.f().p(com.tencent.mm.R.id.e_k);
                        long videoDurationMs = (finderVideoLayout == null || (videoView = finderVideoLayout.getVideoView()) == null) ? 0L : videoView.getVideoDurationMs();
                        if (videoDurationMs <= 0) {
                            videoDurationMs = 1000 * ((u1Var == null || (feedObject = u1Var.getFeedObject()) == null) ? 0L : feedObject.getVideoDuration());
                        }
                        if (videoDurationMs > 0) {
                            com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "setupSeekLayoutRemindDialog, timeMill:" + j17 + ", duration:" + videoDurationMs);
                            double width = ((double) ((com.tencent.mm.plugin.finder.video.FinderVideoLayout) tlVar.f().p(com.tencent.mm.R.id.e_k)).getWidth()) * 0.15d;
                            android.content.Context context = tlVar.f().f293121e;
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            do2.k kVar = new do2.k(context);
                            kVar.e((int) width, r12[1] - 8);
                            tlVar.B = kVar;
                            kVar.show();
                            pm0.v.V(3500L, new com.tencent.mm.plugin.finder.feed.nl(tlVar));
                        }
                    }
                }
            }
        }
        in5.c cVar = (in5.c) tlVar.f().f293125i;
        long itemId = cVar != null ? cVar.getItemId() : 0L;
        com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "[checkSeek] video feedId=" + pm0.v.u(itemId) + " seekTime=" + j17);
        ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).N6(itemId);
        java.lang.Object obj2 = tlVar.f().f293125i;
        so2.u1 u1Var2 = obj2 instanceof so2.u1 ? (so2.u1) obj2 : null;
        if (u1Var2 != null) {
            u1Var2.f410632f = true;
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) tlVar.f().p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout2 != null) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout2, this.f111273e, 3, 0.0f, false, null, 28, null);
        }
        return jz5.f0.f302826a;
    }
}
