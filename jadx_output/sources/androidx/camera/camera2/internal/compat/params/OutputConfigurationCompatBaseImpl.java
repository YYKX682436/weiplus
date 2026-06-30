package androidx.camera.camera2.internal.compat.params;

/* loaded from: classes13.dex */
class OutputConfigurationCompatBaseImpl implements androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl {
    static final java.lang.String TAG = "OutputConfigCompat";
    final java.lang.Object mObject;

    /* loaded from: classes13.dex */
    public static final class OutputConfigurationParamsApi21 {
        private static final java.lang.String DETECT_SURFACE_TYPE_METHOD = "detectSurfaceType";
        private static final java.lang.String GET_GENERATION_ID_METHOD = "getGenerationId";
        private static final java.lang.String GET_SURFACE_SIZE_METHOD = "getSurfaceSize";
        private static final java.lang.String LEGACY_CAMERA_DEVICE_CLASS = "android.hardware.camera2.legacy.LegacyCameraDevice";
        static final int MAX_SURFACES_COUNT = 1;
        final int mConfiguredFormat;
        final int mConfiguredGenerationId;
        final android.util.Size mConfiguredSize;
        java.lang.String mPhysicalCameraId;
        final java.util.List<android.view.Surface> mSurfaces;
        boolean mIsShared = false;
        long mDynamicRangeProfile = 1;

        public OutputConfigurationParamsApi21(android.view.Surface surface) {
            m3.h.d(surface, "Surface must not be null");
            this.mSurfaces = java.util.Collections.singletonList(surface);
            this.mConfiguredSize = getSurfaceSize(surface);
            this.mConfiguredFormat = getSurfaceFormat(surface);
            this.mConfiguredGenerationId = getSurfaceGenerationId(surface);
        }

        private static int getSurfaceFormat(android.view.Surface surface) {
            try {
                return ((java.lang.Integer) java.lang.Class.forName(LEGACY_CAMERA_DEVICE_CLASS).getDeclaredMethod(DETECT_SURFACE_TYPE_METHOD, android.view.Surface.class).invoke(null, surface)).intValue();
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
                androidx.camera.core.Logger.e(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve surface format.", e17);
                return 0;
            }
        }

        private static int getSurfaceGenerationId(android.view.Surface surface) {
            try {
                return ((java.lang.Integer) android.view.Surface.class.getDeclaredMethod(GET_GENERATION_ID_METHOD, new java.lang.Class[0]).invoke(surface, new java.lang.Object[0])).intValue();
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
                androidx.camera.core.Logger.e(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve surface generation id.", e17);
                return -1;
            }
        }

        private static android.util.Size getSurfaceSize(android.view.Surface surface) {
            try {
                java.lang.reflect.Method declaredMethod = java.lang.Class.forName(LEGACY_CAMERA_DEVICE_CLASS).getDeclaredMethod(GET_SURFACE_SIZE_METHOD, android.view.Surface.class);
                declaredMethod.setAccessible(true);
                return (android.util.Size) declaredMethod.invoke(null, surface);
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
                androidx.camera.core.Logger.e(androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.TAG, "Unable to retrieve surface size.", e17);
                return null;
            }
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21)) {
                return false;
            }
            androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21 outputConfigurationParamsApi21 = (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) obj;
            if (!this.mConfiguredSize.equals(outputConfigurationParamsApi21.mConfiguredSize) || this.mConfiguredFormat != outputConfigurationParamsApi21.mConfiguredFormat || this.mConfiguredGenerationId != outputConfigurationParamsApi21.mConfiguredGenerationId || this.mIsShared != outputConfigurationParamsApi21.mIsShared || this.mDynamicRangeProfile != outputConfigurationParamsApi21.mDynamicRangeProfile || !java.util.Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi21.mPhysicalCameraId)) {
                return false;
            }
            int min = java.lang.Math.min(this.mSurfaces.size(), outputConfigurationParamsApi21.mSurfaces.size());
            for (int i17 = 0; i17 < min; i17++) {
                if (this.mSurfaces.get(i17) != outputConfigurationParamsApi21.mSurfaces.get(i17)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.mSurfaces.hashCode() ^ 31;
            int i17 = this.mConfiguredGenerationId ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.mConfiguredSize.hashCode() ^ ((i17 << 5) - i17);
            int i18 = this.mConfiguredFormat ^ ((hashCode2 << 5) - hashCode2);
            int i19 = (this.mIsShared ? 1 : 0) ^ ((i18 << 5) - i18);
            int i27 = (i19 << 5) - i19;
            java.lang.String str = this.mPhysicalCameraId;
            int hashCode3 = (str == null ? 0 : str.hashCode()) ^ i27;
            return java.lang.Long.hashCode(this.mDynamicRangeProfile) ^ ((hashCode3 << 5) - hashCode3);
        }
    }

    public OutputConfigurationCompatBaseImpl(android.view.Surface surface) {
        this.mObject = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void addSurface(android.view.Surface surface) {
        m3.h.d(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new java.lang.IllegalStateException("Surface is already added!");
        }
        if (!isSurfaceSharingEnabled()) {
            throw new java.lang.IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new java.lang.IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mIsShared = true;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl) {
            return java.util.Objects.equals(this.mObject, ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl) obj).mObject);
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mDynamicRangeProfile;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        return 1;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getMirrorMode() {
        return 0;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.Object getOutputConfiguration() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.lang.String getPhysicalCameraId() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mPhysicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public long getStreamUseCase() {
        return -1L;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public android.view.Surface getSurface() {
        java.util.List<android.view.Surface> list = ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mSurfaces;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getSurfaceGroupId() {
        return -1;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public java.util.List<android.view.Surface> getSurfaces() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mSurfaces;
    }

    public int hashCode() {
        return this.mObject.hashCode();
    }

    public boolean isSurfaceSharingEnabled() {
        return ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mIsShared;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void removeSurface(android.view.Surface surface) {
        if (getSurface() != surface) {
            throw new java.lang.IllegalArgumentException("Surface is not part of this output configuration");
        }
        throw new java.lang.IllegalArgumentException("Cannot remove surface associated with this output configuration");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j17) {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mDynamicRangeProfile = j17;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setMirrorMode(int i17) {
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(java.lang.String str) {
        ((androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl.OutputConfigurationParamsApi21) this.mObject).mPhysicalCameraId = str;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setStreamUseCase(long j17) {
    }

    public OutputConfigurationCompatBaseImpl(java.lang.Object obj) {
        this.mObject = obj;
    }
}
