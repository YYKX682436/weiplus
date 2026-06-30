package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class ImmediateSurface extends androidx.camera.core.impl.DeferrableSurface {
    private final android.view.Surface mSurface;

    public ImmediateSurface(android.view.Surface surface, android.util.Size size, int i17) {
        super(size, i17);
        this.mSurface = surface;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public wa.a provideSurface() {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(this.mSurface);
    }

    public ImmediateSurface(android.view.Surface surface) {
        this.mSurface = surface;
    }
}
