package com.tencent.mm.plugin.appbrand.jsapi.webview;

/* loaded from: classes8.dex */
public abstract class c implements com.tencent.xweb.VideoJsCallback {
    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoEmptied() {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoEnded() {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoEnterFullscreen(boolean z17, long j17, double d17, double d18, boolean z18, boolean z19, double d19, double d27, double[] dArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandXWVideoJsCallbackIMPL", "onVideoEnterFullScreen isVideoTag:" + z17 + ", view[0]");
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoError(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandXWVideoJsCallbackIMPL", "onVideoError error:" + i17 + " msg:" + str + ", view[0]");
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoExitFullscreen() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandXWVideoJsCallbackIMPL", "onVideoExitFullscreen, view[0]");
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoPause() {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoPlay() {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoPlaying() {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoRateChange(double d17) {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoSeeked() {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoSeeking() {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoSizeUpdate(double d17, double d18) {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoTimeUpdate(double d17, double d18, double[] dArr) {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoVolumeChange(boolean z17) {
    }

    @Override // com.tencent.xweb.VideoJsCallback
    public void onVideoWaiting() {
    }
}
