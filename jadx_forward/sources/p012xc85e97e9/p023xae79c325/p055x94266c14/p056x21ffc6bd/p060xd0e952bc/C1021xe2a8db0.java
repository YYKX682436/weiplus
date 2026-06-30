package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigConverter */
/* loaded from: classes14.dex */
class C1021xe2a8db0 {
    private C1021xe2a8db0() {
    }

    /* renamed from: fromImpl */
    public static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 m6820xb5cb08ea(androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl camera2OutputConfigImpl) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            java.util.Iterator it = camera2OutputConfigImpl.getSurfaceSharingOutputConfigs().iterator();
            while (it.hasNext()) {
                arrayList.add(m6820xb5cb08ea((androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl) it.next()));
            }
        }
        try {
            try {
                try {
                    androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl surfaceOutputConfigImpl = (androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl) camera2OutputConfigImpl;
                    return p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0.m6883xaf65a0fc(surfaceOutputConfigImpl.getId(), surfaceOutputConfigImpl.getSurfaceGroupId(), surfaceOutputConfigImpl.getPhysicalCameraId(), arrayList, surfaceOutputConfigImpl.getSurface());
                } catch (java.lang.ClassCastException unused) {
                    throw new java.lang.IllegalArgumentException("Not supported Camera2OutputConfigImpl: " + camera2OutputConfigImpl.getClass());
                }
            } catch (java.lang.ClassCastException unused2) {
                androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
                return p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1029xa426485c.m6850xaf65a0fc(multiResolutionImageReaderOutputConfigImpl.getId(), multiResolutionImageReaderOutputConfigImpl.getSurfaceGroupId(), multiResolutionImageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
            }
        } catch (java.lang.ClassCastException unused3) {
            androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            return p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1026x206360a1.m6846xaf65a0fc(imageReaderOutputConfigImpl.getId(), imageReaderOutputConfigImpl.getSurfaceGroupId(), imageReaderOutputConfigImpl.getPhysicalCameraId(), arrayList, imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
        }
    }
}
