package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523;

/* renamed from: com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture */
/* loaded from: classes14.dex */
public final class C26498xa12119f7 extends android.graphics.SurfaceTexture {

    /* renamed from: mActionCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26498xa12119f7.ActionCallback f54146x18a7668;

    /* renamed from: com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture$ActionCallback */
    /* loaded from: classes14.dex */
    public interface ActionCallback {
        /* renamed from: onReleased */
        void mo103440x843dfc3c();
    }

    public C26498xa12119f7(int i17) {
        super(i17);
    }

    @Override // android.graphics.SurfaceTexture
    public void release() {
        super.release();
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26498xa12119f7.ActionCallback actionCallback = this.f54146x18a7668;
        if (actionCallback != null) {
            actionCallback.mo103440x843dfc3c();
        }
    }

    /* renamed from: setActionCallback */
    public final void m103439xb165a19d(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3062x30f523.C26498xa12119f7.ActionCallback actionCallback) {
        this.f54146x18a7668 = actionCallback;
    }
}
