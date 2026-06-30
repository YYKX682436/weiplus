package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes14.dex */
public final class OutputConfigurationCompat {
    public static final int STREAM_USE_CASE_NONE = -1;
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private final androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl mImpl;

    /* loaded from: classes14.dex */
    public interface OutputConfigurationCompatImpl {
        void addSurface(android.view.Surface surface);

        void enableSurfaceSharing();

        long getDynamicRangeProfile();

        int getMaxSharedSurfaceCount();

        int getMirrorMode();

        java.lang.Object getOutputConfiguration();

        java.lang.String getPhysicalCameraId();

        long getStreamUseCase();

        android.view.Surface getSurface();

        int getSurfaceGroupId();

        java.util.List<android.view.Surface> getSurfaces();

        void removeSurface(android.view.Surface surface);

        void setDynamicRangeProfile(long j17);

        void setMirrorMode(int i17);

        void setPhysicalCameraId(java.lang.String str);

        void setStreamUseCase(long j17);
    }

    public OutputConfigurationCompat(android.view.Surface surface) {
        this(-1, surface);
    }

    public static androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat wrap(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl wrap = i17 >= 33 ? androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl.wrap((android.hardware.camera2.params.OutputConfiguration) obj) : i17 >= 28 ? androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.wrap((android.hardware.camera2.params.OutputConfiguration) obj) : i17 >= 26 ? androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.wrap((android.hardware.camera2.params.OutputConfiguration) obj) : androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl.wrap((android.hardware.camera2.params.OutputConfiguration) obj);
        if (wrap == null) {
            return null;
        }
        return new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat(wrap);
    }

    public void addSurface(android.view.Surface surface) {
        this.mImpl.addSurface(surface);
    }

    public void enableSurfaceSharing() {
        this.mImpl.enableSurfaceSharing();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) {
            return this.mImpl.equals(((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public long getDynamicRangeProfile() {
        return this.mImpl.getDynamicRangeProfile();
    }

    public int getMaxSharedSurfaceCount() {
        return this.mImpl.getMaxSharedSurfaceCount();
    }

    public int getMirrorMode() {
        return this.mImpl.getMirrorMode();
    }

    public java.lang.String getPhysicalCameraId() {
        return this.mImpl.getPhysicalCameraId();
    }

    public long getStreamUseCase() {
        return this.mImpl.getStreamUseCase();
    }

    public android.view.Surface getSurface() {
        return this.mImpl.getSurface();
    }

    public int getSurfaceGroupId() {
        return this.mImpl.getSurfaceGroupId();
    }

    public java.util.List<android.view.Surface> getSurfaces() {
        return this.mImpl.getSurfaces();
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public void removeSurface(android.view.Surface surface) {
        this.mImpl.removeSurface(surface);
    }

    public void setDynamicRangeProfile(long j17) {
        this.mImpl.setDynamicRangeProfile(j17);
    }

    public void setMirrorMode(int i17) {
        this.mImpl.setMirrorMode(i17);
    }

    public void setPhysicalCameraId(java.lang.String str) {
        this.mImpl.setPhysicalCameraId(str);
    }

    public void setStreamUseCase(long j17) {
        this.mImpl.setStreamUseCase(j17);
    }

    public java.lang.Object unwrap() {
        return this.mImpl.getOutputConfiguration();
    }

    public OutputConfigurationCompat(int i17, android.view.Surface surface) {
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 33) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl(i17, surface);
            return;
        }
        if (i18 >= 28) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl(i17, surface);
        } else if (i18 >= 26) {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl(i17, surface);
        } else {
            this.mImpl = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi24Impl(i17, surface);
        }
    }

    public <T> OutputConfigurationCompat(android.util.Size size, java.lang.Class<T> cls) {
        android.hardware.camera2.params.OutputConfiguration newOutputConfiguration = androidx.camera.camera2.internal.compat.ApiCompat.Api26Impl.newOutputConfiguration(size, cls);
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            this.mImpl = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl.wrap(newOutputConfiguration);
        } else if (i17 >= 28) {
            this.mImpl = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi28Impl.wrap(newOutputConfiguration);
        } else {
            this.mImpl = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi26Impl.wrap(newOutputConfiguration);
        }
    }

    public OutputConfigurationCompat(android.hardware.camera2.params.OutputConfiguration outputConfiguration) {
        this.mImpl = androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatApi33Impl.wrap(outputConfiguration);
    }

    private OutputConfigurationCompat(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl outputConfigurationCompatImpl) {
        this.mImpl = outputConfigurationCompatImpl;
    }
}
