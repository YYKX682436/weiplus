package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes15.dex */
public final class g implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.video.player.thumb.l f90882d;

    public g(com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar) {
        this.f90882d = lVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public final void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        com.tencent.mm.plugin.appbrand.video.player.thumb.l lVar = this.f90882d;
        com.tencent.mars.xlog.Log.w(lVar.f90889r, "onError, errorType: " + i17 + ", errorCode: " + i18 + ", arg1: " + j17 + ", arg2: " + j18);
        if (1000 == i18) {
            return;
        }
        if (1100 == i17) {
            boolean z17 = false;
            if (11070000 <= i18 && i18 < 11080000) {
                z17 = true;
            }
            if (z17) {
                lVar.G(com.tencent.mm.hardcoder.HardCoderJNI.CLIENT_CONNECT, i18 - 11070000);
                return;
            }
        }
        lVar.G((-10000) - i17, i18);
        com.tencent.mm.plugin.appbrand.video.player.thumb.a aVar = lVar.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            com.tencent.mars.xlog.Log.i(rVar.f355486a, "onError errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            rVar.T = true;
            rVar.U = i17;
            rVar.V = i18;
        }
    }
}
