package com.tencent.liteav.videoproducer2.capture;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::video")
/* loaded from: classes13.dex */
public class VirtualDisplayManagerProxy {
    private final com.tencent.liteav.videoproducer.capture.VirtualDisplayManager mManager = com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.a(com.tencent.liteav.base.ContextUtils.getApplicationContext());

    public void startVirtualDisplaySync(android.view.Surface surface, int i17, int i18, android.media.projection.MediaProjection mediaProjection, com.tencent.liteav.videoproducer.capture.VirtualDisplayManager.VirtualDisplayListener virtualDisplayListener) {
        com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager = this.mManager;
        com.tencent.liteav.base.util.LiteavLog.i("VirtualDisplayManager", "startVirtualDisplaySync, surface:" + surface + ", width:" + i17 + ", height:" + i18 + ", mediaProjection: " + mediaProjection + ", listener:" + virtualDisplayListener);
        virtualDisplayManager.f47002a.b(com.tencent.liteav.videoproducer.capture.g.a(virtualDisplayManager, surface, i17, i18, mediaProjection, virtualDisplayListener));
    }

    public void stopVirtualDisplaySync(android.view.Surface surface) {
        com.tencent.liteav.videoproducer.capture.VirtualDisplayManager virtualDisplayManager = this.mManager;
        com.tencent.liteav.base.util.LiteavLog.i("VirtualDisplayManager", "stopVirtualDisplaySync, surface:".concat(java.lang.String.valueOf(surface)));
        virtualDisplayManager.f47002a.b(com.tencent.liteav.videoproducer.capture.h.a(virtualDisplayManager, surface));
    }
}
