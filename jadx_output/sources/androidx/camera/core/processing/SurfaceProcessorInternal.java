package androidx.camera.core.processing;

/* loaded from: classes14.dex */
public interface SurfaceProcessorInternal extends androidx.camera.core.SurfaceProcessor {
    void release();

    default wa.a snapshot(int i17, int i18) {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
    }
}
