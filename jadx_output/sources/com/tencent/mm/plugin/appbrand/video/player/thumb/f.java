package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class f implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.l f90881d;

    public f(com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar) {
        this.f90881d = lVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public final void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar = this.f90881d;
        java.lang.String str = lVar.f90889r;
        lVar.f461162a = 6;
        lVar.E();
    }
}
