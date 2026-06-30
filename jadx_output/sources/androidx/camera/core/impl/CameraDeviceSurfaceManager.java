package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface CameraDeviceSurfaceManager {

    /* loaded from: classes14.dex */
    public interface Provider {
        androidx.camera.core.impl.CameraDeviceSurfaceManager newInstance(android.content.Context context, java.lang.Object obj, java.util.Set<java.lang.String> set);
    }

    android.util.Pair<java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec>, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec>> getSuggestedStreamSpecs(int i17, java.lang.String str, java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> map, boolean z17, boolean z18);

    androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i17, java.lang.String str, int i18, android.util.Size size);
}
