package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class h implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.l f90883d;

    public h(com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar) {
        this.f90883d = lVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public final void onStateChange(int i17, int i18) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar;
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar = this.f90883d;
        java.lang.String str = lVar.f90889r;
        if (i18 == 4) {
            com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar2 = lVar.E;
            if (aVar2 != null) {
                pk1.r rVar = (pk1.r) aVar2;
                if (rVar.f355509s == 0 && rVar.f355504n > 0) {
                    rVar.f355509s = java.lang.System.currentTimeMillis() - rVar.f355504n;
                }
                com.tencent.mars.xlog.Log.i(rVar.f355486a, "onPrepared playerPreparedTime:%d", java.lang.Long.valueOf(rVar.f355509s));
                return;
            }
            return;
        }
        if (i18 == 5) {
            com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar3 = lVar.E;
            if (aVar3 != null) {
                pk1.r rVar2 = (pk1.r) aVar3;
                if (rVar2.f355510t == 0 && rVar2.f355505o > 0) {
                    rVar2.f355510t = java.lang.System.currentTimeMillis() - rVar2.f355505o;
                }
                int i19 = rVar2.f355503m + 1;
                rVar2.f355503m = i19;
                com.tencent.mars.xlog.Log.i(rVar2.f355486a, "onStart playCount:%d， firstCallStartPlayer:%d", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(rVar2.f355510t));
                return;
            }
            return;
        }
        if (i18 == 6) {
            com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar4 = lVar.E;
            if (aVar4 != null) {
                com.tencent.mars.xlog.Log.i(((pk1.r) aVar4).f355486a, "onPause");
                return;
            }
            return;
        }
        if (i18 == 9 && (aVar = lVar.E) != null) {
            pk1.r rVar3 = (pk1.r) aVar;
            com.tencent.mars.xlog.Log.i(rVar3.f355486a, "onStop");
            int recentAverageSpeed = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentAverageSpeed(2);
            rVar3.X = recentAverageSpeed;
            com.tencent.mars.xlog.Log.i(rVar3.f355486a, "updateRecentDownloadAverageSpeed recentDownloadAverageSpeed:%d", java.lang.Integer.valueOf(recentAverageSpeed));
        }
    }
}
