package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class i implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.l f90884d;

    public i(com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar) {
        this.f90884d = lVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar = this.f90884d;
        java.lang.String str = lVar.f90889r;
        if (lVar.A) {
            com.tencent.mars.xlog.Log.i(this.f90884d.f90889r, "onPrepared, isPassiveDownloading, pausePlayerDownload");
            this.f90884d.S();
        }
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar2 = this.f90884d;
        lVar2.f461162a = 2;
        lVar2.J();
        this.f90884d.N();
    }
}
