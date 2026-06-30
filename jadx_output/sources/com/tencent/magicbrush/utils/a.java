package com.tencent.magicbrush.utils;

/* loaded from: classes6.dex */
public final class a extends com.tencent.magicbrush.utils.NativeTaskHelper.NativeTaskWrapper implements android.graphics.SurfaceTexture.OnFrameAvailableListener {
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (this) {
            long j17 = this.f48662d;
            if (j17 != 0) {
                com.tencent.magicbrush.utils.NativeTaskHelper.INSTANCE.doRunTask(j17);
            }
        }
    }
}
