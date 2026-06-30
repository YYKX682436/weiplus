package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final /* synthetic */ class ZslControlImpl$$c implements androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback {
    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public final void onRemove(java.lang.Object obj) {
        ((androidx.camera.core.ImageProxy) obj).close();
    }
}
