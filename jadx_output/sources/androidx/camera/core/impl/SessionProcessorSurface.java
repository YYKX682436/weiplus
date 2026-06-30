package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class SessionProcessorSurface extends androidx.camera.core.impl.DeferrableSurface {
    private final int mOutputConfigId;
    private final android.view.Surface mSurface;

    public SessionProcessorSurface(android.view.Surface surface, int i17) {
        this.mSurface = surface;
        this.mOutputConfigId = i17;
    }

    public int getOutputConfigId() {
        return this.mOutputConfigId;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public wa.a provideSurface() {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(this.mSurface);
    }
}
