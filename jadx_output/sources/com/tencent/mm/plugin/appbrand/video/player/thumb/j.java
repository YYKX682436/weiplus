package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class j implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.l f90885d;

    public j(com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar) {
        this.f90885d = lVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener
    public final void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar = this.f90885d;
        java.lang.String str = lVar.f90889r;
        lVar.K();
    }
}
