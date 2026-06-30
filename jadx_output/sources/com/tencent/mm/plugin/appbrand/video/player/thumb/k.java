package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class k implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.l f90886d;

    public k(com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar) {
        this.f90886d = lVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public final void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar = this.f90886d;
        java.lang.String str = lVar.f90889r;
        lVar.L((int) j17, (int) j18);
    }
}
