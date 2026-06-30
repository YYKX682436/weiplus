package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class Camera2DeviceSurfaceManager implements androidx.camera.core.impl.CameraDeviceSurfaceManager {
    private static final java.lang.String TAG = "Camera2DeviceSurfaceManager";
    private final androidx.camera.camera2.internal.CamcorderProfileHelper mCamcorderProfileHelper;
    private final java.util.Map<java.lang.String, androidx.camera.camera2.internal.SupportedSurfaceCombination> mCameraSupportedSurfaceCombinationMap;

    public Camera2DeviceSurfaceManager(android.content.Context context, java.lang.Object obj, java.util.Set<java.lang.String> set) {
        this(context, new androidx.camera.camera2.internal.CamcorderProfileHelper() { // from class: androidx.camera.camera2.internal.Camera2DeviceSurfaceManager.1
            @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
            public android.media.CamcorderProfile get(int i17, int i18) {
                return android.media.CamcorderProfile.get(i17, i18);
            }

            @Override // androidx.camera.camera2.internal.CamcorderProfileHelper
            public boolean hasProfile(int i17, int i18) {
                return android.media.CamcorderProfile.hasProfile(i17, i18);
            }
        }, obj, set);
    }

    private void init(android.content.Context context, androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat, java.util.Set<java.lang.String> set) {
        context.getClass();
        for (java.lang.String str : set) {
            this.mCameraSupportedSurfaceCombinationMap.put(str, new androidx.camera.camera2.internal.SupportedSurfaceCombination(context, str, cameraManagerCompat, this.mCamcorderProfileHelper));
        }
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public android.util.Pair<java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, androidx.camera.core.impl.StreamSpec>, java.util.Map<androidx.camera.core.impl.AttachedSurfaceInfo, androidx.camera.core.impl.StreamSpec>> getSuggestedStreamSpecs(int i17, java.lang.String str, java.util.List<androidx.camera.core.impl.AttachedSurfaceInfo> list, java.util.Map<androidx.camera.core.impl.UseCaseConfig<?>, java.util.List<android.util.Size>> map, boolean z17, boolean z18) {
        m3.h.b(!map.isEmpty(), "No new use cases to be bound.");
        androidx.camera.camera2.internal.SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.getSuggestedStreamSpecifications(i17, list, map, z17, z18);
        }
        throw new java.lang.IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public androidx.camera.core.impl.SurfaceConfig transformSurfaceConfig(int i17, java.lang.String str, int i18, android.util.Size size) {
        androidx.camera.camera2.internal.SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.transformSurfaceConfig(i17, i18, size);
        }
        return null;
    }

    public Camera2DeviceSurfaceManager(android.content.Context context, androidx.camera.camera2.internal.CamcorderProfileHelper camcorderProfileHelper, java.lang.Object obj, java.util.Set<java.lang.String> set) {
        androidx.camera.camera2.internal.compat.CameraManagerCompat from;
        this.mCameraSupportedSurfaceCombinationMap = new java.util.HashMap();
        camcorderProfileHelper.getClass();
        this.mCamcorderProfileHelper = camcorderProfileHelper;
        if (obj instanceof androidx.camera.camera2.internal.compat.CameraManagerCompat) {
            from = (androidx.camera.camera2.internal.compat.CameraManagerCompat) obj;
        } else {
            from = androidx.camera.camera2.internal.compat.CameraManagerCompat.from(context);
        }
        init(context, from, set);
    }
}
