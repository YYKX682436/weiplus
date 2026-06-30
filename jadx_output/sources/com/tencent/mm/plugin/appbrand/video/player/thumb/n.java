package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes.dex */
public final class n implements com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener {
    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int d(java.lang.String str, java.lang.String str2) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int e(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TPPlayer", str + ':' + str2);
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int i(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TPPlayer", str + ':' + str2);
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int v(java.lang.String str, java.lang.String str2) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int w(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.TPPlayer", str + ':' + str2);
        return 0;
    }
}
