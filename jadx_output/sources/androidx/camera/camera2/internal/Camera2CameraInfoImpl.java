package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
public final class Camera2CameraInfoImpl implements androidx.camera.core.impl.CameraInfoInternal {
    private static final java.lang.String TAG = "Camera2CameraInfo";
    private androidx.camera.camera2.internal.Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final androidx.camera.camera2.interop.Camera2CameraInfo mCamera2CameraInfo;
    private final androidx.camera.core.impl.EncoderProfilesProvider mCamera2EncoderProfilesProvider;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristicsCompat;
    private final java.lang.String mCameraId;
    private final androidx.camera.camera2.internal.compat.CameraManagerCompat mCameraManager;
    private final androidx.camera.core.impl.Quirks mCameraQuirks;
    private final androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<androidx.camera.core.CameraState> mCameraStateLiveData;
    private java.util.Set<androidx.camera.core.CameraInfo> mPhysicalCameraInfos;
    private final java.lang.Object mLock = new java.lang.Object();
    private androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<java.lang.Integer> mRedirectTorchStateLiveData = null;
    private androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<androidx.camera.core.ZoomState> mRedirectZoomStateLiveData = null;
    private java.util.List<android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor>> mCameraCaptureCallbacks = null;

    /* loaded from: classes13.dex */
    public static class RedirectableLiveData<T> extends androidx.lifecycle.i0 {
        private final T mInitialValue;
        private androidx.lifecycle.g0 mLiveDataSource;

        public RedirectableLiveData(T t17) {
            this.mInitialValue = t17;
        }

        @Override // androidx.lifecycle.i0
        public <S> void addSource(androidx.lifecycle.g0 g0Var, androidx.lifecycle.k0 k0Var) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // androidx.lifecycle.g0
        public T getValue() {
            androidx.lifecycle.g0 g0Var = this.mLiveDataSource;
            return g0Var == null ? this.mInitialValue : (T) g0Var.getValue();
        }

        public void redirectTo(androidx.lifecycle.g0 g0Var) {
            androidx.lifecycle.g0 g0Var2 = this.mLiveDataSource;
            if (g0Var2 != null) {
                super.removeSource(g0Var2);
            }
            this.mLiveDataSource = g0Var;
            super.addSource(g0Var, new androidx.lifecycle.k0() { // from class: androidx.camera.camera2.internal.Camera2CameraInfoImpl$RedirectableLiveData$$a
                @Override // androidx.lifecycle.k0
                public final void onChanged(java.lang.Object obj) {
                    androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData.this.setValue(obj);
                }
            });
        }
    }

    public Camera2CameraInfoImpl(java.lang.String str, androidx.camera.camera2.internal.compat.CameraManagerCompat cameraManagerCompat) {
        str.getClass();
        this.mCameraId = str;
        this.mCameraManager = cameraManagerCompat;
        androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat = cameraManagerCompat.getCameraCharacteristicsCompat(str);
        this.mCameraCharacteristicsCompat = cameraCharacteristicsCompat;
        this.mCamera2CameraInfo = new androidx.camera.camera2.interop.Camera2CameraInfo(this);
        androidx.camera.core.impl.Quirks quirks = androidx.camera.camera2.internal.compat.quirk.CameraQuirks.get(str, cameraCharacteristicsCompat);
        this.mCameraQuirks = quirks;
        this.mCamera2EncoderProfilesProvider = new androidx.camera.camera2.internal.Camera2EncoderProfilesProvider(str, quirks);
        this.mCameraStateLiveData = new androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<>(androidx.camera.core.CameraState.create(androidx.camera.core.CameraState.Type.CLOSED));
    }

    private void logDeviceInfo() {
        logDeviceLevel();
    }

    private void logDeviceLevel() {
        java.lang.String str;
        int supportedHardwareLevel = getSupportedHardwareLevel();
        if (supportedHardwareLevel == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (supportedHardwareLevel == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (supportedHardwareLevel == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (supportedHardwareLevel == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (supportedHardwareLevel != 4) {
            str = "Unknown value: " + supportedHardwareLevel;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        androidx.camera.core.Logger.i(TAG, "Device Level: " + str);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl != null) {
                camera2CameraControlImpl.addSessionCameraCaptureCallback(executor, cameraCaptureCallback);
                return;
            }
            if (this.mCameraCaptureCallbacks == null) {
                this.mCameraCaptureCallbacks = new java.util.ArrayList();
            }
            this.mCameraCaptureCallbacks.add(new android.util.Pair<>(cameraCaptureCallback, executor));
        }
    }

    public androidx.camera.camera2.interop.Camera2CameraInfo getCamera2CameraInfo() {
        return this.mCamera2CameraInfo;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.lang.Object getCameraCharacteristics() {
        return this.mCameraCharacteristicsCompat.toCameraCharacteristics();
    }

    public androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat getCameraCharacteristicsCompat() {
        return this.mCameraCharacteristicsCompat;
    }

    public java.util.Map<java.lang.String, android.hardware.camera2.CameraCharacteristics> getCameraCharacteristicsMap() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(this.mCameraId, this.mCameraCharacteristicsCompat.toCameraCharacteristics());
        for (java.lang.String str : this.mCameraCharacteristicsCompat.getPhysicalCameraIds()) {
            if (!java.util.Objects.equals(str, this.mCameraId)) {
                try {
                    linkedHashMap.put(str, this.mCameraManager.getCameraCharacteristicsCompat(str).toCameraCharacteristics());
                } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
                    androidx.camera.core.Logger.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e17);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.lang.String getCameraId() {
        return this.mCameraId;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public androidx.camera.core.impl.Quirks getCameraQuirks() {
        return this.mCameraQuirks;
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.lifecycle.g0 getCameraState() {
        return this.mCameraStateLiveData;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public androidx.camera.core.impl.EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.mCamera2EncoderProfilesProvider;
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.camera.core.ExposureState getExposureState() {
        synchronized (this.mLock) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                return androidx.camera.camera2.internal.ExposureControl.getDefaultExposureState(this.mCameraCharacteristicsCompat);
            }
            return camera2CameraControlImpl.getExposureControl().getExposureState();
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public java.lang.String getImplementationType() {
        return getSupportedHardwareLevel() == 2 ? androidx.camera.core.CameraInfo.IMPLEMENTATION_TYPE_CAMERA2_LEGACY : androidx.camera.core.CameraInfo.IMPLEMENTATION_TYPE_CAMERA2;
    }

    @Override // androidx.camera.core.CameraInfo
    public float getIntrinsicZoomRatio() {
        if (((java.lang.Integer) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)) == null) {
            return 1.0f;
        }
        try {
            return androidx.camera.camera2.internal.FovUtil.getDeviceDefaultViewAngleDegrees(this.mCameraManager, r0.intValue()) / androidx.camera.camera2.internal.FovUtil.focalLengthToViewAngleDegrees(androidx.camera.camera2.internal.FovUtil.getDefaultFocalLength(this.mCameraCharacteristicsCompat), androidx.camera.camera2.internal.FovUtil.getSensorHorizontalLength(this.mCameraCharacteristicsCompat));
        } catch (java.lang.Exception e17) {
            androidx.camera.core.Logger.e(TAG, "The camera is unable to provide necessary information to resolve its intrinsic zoom ratio with error: " + e17);
            return 1.0f;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
        java.lang.Integer num = (java.lang.Integer) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
        m3.h.b(num != null, "Unable to get the lens facing of the camera.");
        return androidx.camera.camera2.internal.LensFacingUtil.getCameraSelectorLensFacing(num.intValue());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.lang.Object getPhysicalCameraCharacteristics(java.lang.String str) {
        try {
            if (this.mCameraCharacteristicsCompat.getPhysicalCameraIds().contains(str)) {
                return this.mCameraManager.getCameraCharacteristicsCompat(str).toCameraCharacteristics();
            }
            return null;
        } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e17);
            return null;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public java.util.Set<androidx.camera.core.CameraInfo> getPhysicalCameraInfos() {
        if (this.mPhysicalCameraInfos == null) {
            this.mPhysicalCameraInfos = new java.util.HashSet();
            for (java.lang.String str : this.mCameraCharacteristicsCompat.getPhysicalCameraIds()) {
                try {
                    this.mPhysicalCameraInfos.add(new androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl(str, this.mCameraManager));
                } catch (androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat e17) {
                    androidx.camera.core.Logger.e(TAG, "Failed to get CameraCharacteristics for cameraId " + str, e17);
                    return java.util.Collections.emptySet();
                }
            }
        }
        return this.mPhysicalCameraInfos;
    }

    public int getSensorOrientation() {
        java.lang.Integer num = (java.lang.Integer) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return num.intValue();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i17) {
        return androidx.camera.core.impl.utils.CameraOrientationUtil.getRelativeImageRotation(androidx.camera.core.impl.utils.CameraOrientationUtil.surfaceRotationToDegrees(i17), getSensorOrientation(), 1 == getLensFacing());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        return androidx.camera.camera2.internal.compat.params.DynamicRangesCompat.fromCameraCharacteristics(this.mCameraCharacteristicsCompat).getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.CameraInfo
    public java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges() {
        android.util.Range[] rangeArr = (android.util.Range[]) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new java.util.HashSet(java.util.Arrays.asList(rangeArr)) : java.util.Collections.emptySet();
    }

    public int getSupportedHardwareLevel() {
        java.lang.Integer num = (java.lang.Integer) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.List<android.util.Size> getSupportedHighResolutions(int i17) {
        android.util.Size[] highResolutionOutputSizes = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getHighResolutionOutputSizes(i17);
        return highResolutionOutputSizes != null ? java.util.Arrays.asList(highResolutionOutputSizes) : java.util.Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.Set<java.lang.Integer> getSupportedOutputFormats() {
        int[] outputFormats = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputFormats();
        if (outputFormats == null) {
            return new java.util.HashSet();
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i17 : outputFormats) {
            hashSet.add(java.lang.Integer.valueOf(i17));
        }
        return hashSet;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.List<android.util.Size> getSupportedResolutions(int i17) {
        android.util.Size[] outputSizes = this.mCameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(i17);
        return outputSizes != null ? java.util.Arrays.asList(outputSizes) : java.util.Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public androidx.camera.core.impl.Timebase getTimebase() {
        java.lang.Integer num = (java.lang.Integer) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? androidx.camera.core.impl.Timebase.UPTIME : androidx.camera.core.impl.Timebase.REALTIME;
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.lifecycle.g0 getTorchState() {
        synchronized (this.mLock) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mRedirectTorchStateLiveData == null) {
                    this.mRedirectTorchStateLiveData = new androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<>(0);
                }
                return this.mRedirectTorchStateLiveData;
            }
            androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<java.lang.Integer> redirectableLiveData = this.mRedirectTorchStateLiveData;
            if (redirectableLiveData != null) {
                return redirectableLiveData;
            }
            return camera2CameraControlImpl.getTorchControl().getTorchState();
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.lifecycle.g0 getZoomState() {
        synchronized (this.mLock) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                if (this.mRedirectZoomStateLiveData == null) {
                    this.mRedirectZoomStateLiveData = new androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<>(androidx.camera.camera2.internal.ZoomControl.getDefaultZoomState(this.mCameraCharacteristicsCompat));
                }
                return this.mRedirectZoomStateLiveData;
            }
            androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<androidx.camera.core.ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
            if (redirectableLiveData != null) {
                return redirectableLiveData;
            }
            return camera2CameraControlImpl.getZoomControl().getZoomState();
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat = this.mCameraCharacteristicsCompat;
        java.util.Objects.requireNonNull(cameraCharacteristicsCompat);
        return androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker.isFlashAvailable(new androidx.camera.camera2.internal.Camera2CameraInfoImpl$$a(cameraCharacteristicsCompat));
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        synchronized (this.mLock) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl == null) {
                return false;
            }
            return camera2CameraControlImpl.getFocusMeteringControl().isFocusMeteringSupported(focusMeteringAction);
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLogicalMultiCameraSupported() {
        return androidx.camera.camera2.internal.ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 11);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isPreviewStabilizationSupported() {
        int[] iArr = (int[]) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i17 : iArr) {
                if (i17 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        return androidx.camera.camera2.internal.ZslUtil.isCapabilitySupported(this.mCameraCharacteristicsCompat, 4);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isVideoStabilizationSupported() {
        int[] iArr = (int[]) this.mCameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i17 : iArr) {
                if (i17 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isZslSupported() {
        return isPrivateReprocessingSupported() && androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk.class) == null;
    }

    public void linkWithCameraControl(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl) {
        synchronized (this.mLock) {
            this.mCamera2CameraControlImpl = camera2CameraControlImpl;
            androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<androidx.camera.core.ZoomState> redirectableLiveData = this.mRedirectZoomStateLiveData;
            if (redirectableLiveData != null) {
                redirectableLiveData.redirectTo(camera2CameraControlImpl.getZoomControl().getZoomState());
            }
            androidx.camera.camera2.internal.Camera2CameraInfoImpl.RedirectableLiveData<java.lang.Integer> redirectableLiveData2 = this.mRedirectTorchStateLiveData;
            if (redirectableLiveData2 != null) {
                redirectableLiveData2.redirectTo(this.mCamera2CameraControlImpl.getTorchControl().getTorchState());
            }
            java.util.List<android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor>> list = this.mCameraCaptureCallbacks;
            if (list != null) {
                for (android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor> pair : list) {
                    this.mCamera2CameraControlImpl.addSessionCameraCaptureCallback((java.util.concurrent.Executor) pair.second, (androidx.camera.core.impl.CameraCaptureCallback) pair.first);
                }
                this.mCameraCaptureCallbacks = null;
            }
        }
        logDeviceInfo();
    }

    @Override // androidx.camera.core.CameraInfo
    public java.util.Set<androidx.camera.core.DynamicRange> querySupportedDynamicRanges(java.util.Set<androidx.camera.core.DynamicRange> set) {
        return androidx.camera.core.impl.DynamicRanges.findAllPossibleMatches(set, getSupportedDynamicRanges());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        synchronized (this.mLock) {
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.mCamera2CameraControlImpl;
            if (camera2CameraControlImpl != null) {
                camera2CameraControlImpl.removeSessionCameraCaptureCallback(cameraCaptureCallback);
                return;
            }
            java.util.List<android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor>> list = this.mCameraCaptureCallbacks;
            if (list == null) {
                return;
            }
            java.util.Iterator<android.util.Pair<androidx.camera.core.impl.CameraCaptureCallback, java.util.concurrent.Executor>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().first == cameraCaptureCallback) {
                    it.remove();
                }
            }
        }
    }

    public void setCameraStateSource(androidx.lifecycle.g0 g0Var) {
        this.mCameraStateLiveData.redirectTo(g0Var);
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
