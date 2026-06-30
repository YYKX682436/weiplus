package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
class Camera2OutputConfigConverter {
    private Camera2OutputConfigConverter() {
    }

    public static androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig fromImpl(androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl camera2OutputConfigImpl) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            java.util.Iterator it = camera2OutputConfigImpl.getSurfaceSharingOutputConfigs().iterator();
            while (it.hasNext()) {
                arrayList.add(fromImpl((androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl) it.next()));
            }
        }
        try {
            try {
                try {
                    androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl surfaceOutputConfigImpl = (androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl) camera2OutputConfigImpl;
                    return androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig.create(surfaceOutputConfigImpl.getId(), surfaceOutputConfigImpl.getSurfaceGroupId(), surfaceOutputConfigImpl.getPhysicalCameraId(), arrayList, surfaceOutputConfigImpl.getSurface());
                } catch (java.lang.ClassCastException unused) {
                    throw new java.lang.IllegalArgumentException("Not supported Camera2OutputConfigImpl: " + camera2OutputConfigImpl.getClass());
                }
            } catch (java.lang.ClassCastException unused2) {
                androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
                return androidx.camera.extensions.internal.sessionprocessor.MultiResolutionImageReaderOutputConfig.create(multiResolutionImageReaderOutputConfigImpl.getId(), multiResolutionImageReaderOutputConfigImpl.getSurfaceGroupId(), multiResolutionImageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
            }
        } catch (java.lang.ClassCastException unused3) {
            androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            return androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig.create(imageReaderOutputConfigImpl.getId(), imageReaderOutputConfigImpl.getSurfaceGroupId(), imageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
        }
    }
}
