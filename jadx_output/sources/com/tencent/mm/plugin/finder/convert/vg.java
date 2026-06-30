package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(in5.s0 s0Var) {
        super(0);
        this.f104788d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) this.f104788d.p(com.tencent.mm.R.id.e_k);
        cw2.da videoView = finderVideoLayout.getVideoView();
        if (videoView != null) {
            finderVideoLayout.a0(false);
            videoView.setVideoViewFocused(true);
            if (videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) {
                ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView).X(-1);
            } else {
                videoView.play();
            }
        }
        return jz5.f0.f302826a;
    }
}
