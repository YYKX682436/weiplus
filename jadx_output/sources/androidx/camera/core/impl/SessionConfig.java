package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class SessionConfig {
    public static final int DEFAULT_SESSION_TYPE = 0;
    private static final java.util.List<java.lang.Integer> SUPPORTED_TEMPLATE_PRIORITY = java.util.Arrays.asList(1, 5, 3);
    private final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> mDeviceStateCallbacks;
    private final androidx.camera.core.impl.SessionConfig.ErrorListener mErrorListener;
    private android.hardware.camera2.params.InputConfiguration mInputConfiguration;
    private final java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> mOutputConfigs;
    private final androidx.camera.core.impl.SessionConfig.OutputConfig mPostviewOutputConfig;
    private final androidx.camera.core.impl.CaptureConfig mRepeatingCaptureConfig;
    private final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> mSessionStateCallbacks;
    private final int mSessionType;
    private final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mSingleCameraCaptureCallbacks;

    /* loaded from: classes14.dex */
    public static class BaseBuilder {
        androidx.camera.core.impl.SessionConfig.ErrorListener mErrorListener;
        android.hardware.camera2.params.InputConfiguration mInputConfiguration;
        androidx.camera.core.impl.SessionConfig.OutputConfig mPostviewOutputConfig;
        final java.util.Set<androidx.camera.core.impl.SessionConfig.OutputConfig> mOutputConfigs = new java.util.LinkedHashSet();
        final androidx.camera.core.impl.CaptureConfig.Builder mCaptureConfigBuilder = new androidx.camera.core.impl.CaptureConfig.Builder();
        final java.util.List<android.hardware.camera2.CameraDevice.StateCallback> mDeviceStateCallbacks = new java.util.ArrayList();
        final java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> mSessionStateCallbacks = new java.util.ArrayList();
        final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mSingleCameraCaptureCallbacks = new java.util.ArrayList();
        int mSessionType = 0;
    }

    /* loaded from: classes14.dex */
    public static class Builder extends androidx.camera.core.impl.SessionConfig.BaseBuilder {
        public static androidx.camera.core.impl.SessionConfig.Builder createFrom(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, android.util.Size size) {
            androidx.camera.core.impl.SessionConfig.OptionUnpacker sessionOptionUnpacker = useCaseConfig.getSessionOptionUnpacker(null);
            if (sessionOptionUnpacker != null) {
                androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
                sessionOptionUnpacker.unpack(size, useCaseConfig, builder);
                return builder;
            }
            throw new java.lang.IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.getTargetName(useCaseConfig.toString()));
        }

        public androidx.camera.core.impl.SessionConfig.Builder addAllCameraCaptureCallbacks(java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> collection) {
            for (androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback : collection) {
                this.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
                if (!this.mSingleCameraCaptureCallbacks.contains(cameraCaptureCallback)) {
                    this.mSingleCameraCaptureCallbacks.add(cameraCaptureCallback);
                }
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addAllDeviceStateCallbacks(java.util.Collection<android.hardware.camera2.CameraDevice.StateCallback> collection) {
            java.util.Iterator<android.hardware.camera2.CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                addDeviceStateCallback(it.next());
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addAllRepeatingCameraCaptureCallbacks(java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> collection) {
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(collection);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addAllSessionStateCallbacks(java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list) {
            java.util.Iterator<android.hardware.camera2.CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                addSessionStateCallback(it.next());
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            this.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
            if (!this.mSingleCameraCaptureCallbacks.contains(cameraCaptureCallback)) {
                this.mSingleCameraCaptureCallbacks.add(cameraCaptureCallback);
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addDeviceStateCallback(android.hardware.camera2.CameraDevice.StateCallback stateCallback) {
            if (this.mDeviceStateCallbacks.contains(stateCallback)) {
                return this;
            }
            this.mDeviceStateCallbacks.add(stateCallback);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addImplementationOptions(androidx.camera.core.impl.Config config) {
            this.mCaptureConfigBuilder.addImplementationOptions(config);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addNonRepeatingSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            return addNonRepeatingSurface(deferrableSurface, androidx.camera.core.DynamicRange.SDR);
        }

        public androidx.camera.core.impl.SessionConfig.Builder addOutputConfig(androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig) {
            this.mOutputConfigs.add(outputConfig);
            this.mCaptureConfigBuilder.addSurface(outputConfig.getSurface());
            java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                this.mCaptureConfigBuilder.addSurface(it.next());
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addRepeatingCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            this.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addSessionStateCallback(android.hardware.camera2.CameraCaptureSession.StateCallback stateCallback) {
            if (this.mSessionStateCallbacks.contains(stateCallback)) {
                return this;
            }
            this.mSessionStateCallbacks.add(stateCallback);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            return addSurface(deferrableSurface, androidx.camera.core.DynamicRange.SDR, null, -1);
        }

        public androidx.camera.core.impl.SessionConfig.Builder addTag(java.lang.String str, java.lang.Object obj) {
            this.mCaptureConfigBuilder.addTag(str, obj);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig build() {
            return new androidx.camera.core.impl.SessionConfig(new java.util.ArrayList(this.mOutputConfigs), new java.util.ArrayList(this.mDeviceStateCallbacks), new java.util.ArrayList(this.mSessionStateCallbacks), new java.util.ArrayList(this.mSingleCameraCaptureCallbacks), this.mCaptureConfigBuilder.build(), this.mErrorListener, this.mInputConfiguration, this.mSessionType, this.mPostviewOutputConfig);
        }

        public androidx.camera.core.impl.SessionConfig.Builder clearSurfaces() {
            this.mOutputConfigs.clear();
            this.mCaptureConfigBuilder.clearSurfaces();
            return this;
        }

        public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
            return java.util.Collections.unmodifiableList(this.mSingleCameraCaptureCallbacks);
        }

        public boolean removeCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            return this.mCaptureConfigBuilder.removeCameraCaptureCallback(cameraCaptureCallback) || this.mSingleCameraCaptureCallbacks.remove(cameraCaptureCallback);
        }

        public androidx.camera.core.impl.SessionConfig.Builder removeSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig;
            java.util.Iterator<androidx.camera.core.impl.SessionConfig.OutputConfig> it = this.mOutputConfigs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    outputConfig = null;
                    break;
                }
                outputConfig = it.next();
                if (outputConfig.getSurface().equals(deferrableSurface)) {
                    break;
                }
            }
            if (outputConfig != null) {
                this.mOutputConfigs.remove(outputConfig);
            }
            this.mCaptureConfigBuilder.removeSurface(deferrableSurface);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setErrorListener(androidx.camera.core.impl.SessionConfig.ErrorListener errorListener) {
            this.mErrorListener = errorListener;
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setExpectedFrameRateRange(android.util.Range<java.lang.Integer> range) {
            this.mCaptureConfigBuilder.setExpectedFrameRateRange(range);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setImplementationOptions(androidx.camera.core.impl.Config config) {
            this.mCaptureConfigBuilder.setImplementationOptions(config);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setInputConfiguration(android.hardware.camera2.params.InputConfiguration inputConfiguration) {
            this.mInputConfiguration = inputConfiguration;
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setPostviewSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            this.mPostviewOutputConfig = androidx.camera.core.impl.SessionConfig.OutputConfig.builder(deferrableSurface).build();
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setPreviewStabilization(int i17) {
            if (i17 != 0) {
                this.mCaptureConfigBuilder.setPreviewStabilization(i17);
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setSessionType(int i17) {
            this.mSessionType = i17;
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setTemplateType(int i17) {
            this.mCaptureConfigBuilder.setTemplateType(i17);
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder setVideoStabilization(int i17) {
            if (i17 != 0) {
                this.mCaptureConfigBuilder.setVideoStabilization(i17);
            }
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addNonRepeatingSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.core.DynamicRange dynamicRange) {
            this.mOutputConfigs.add(androidx.camera.core.impl.SessionConfig.OutputConfig.builder(deferrableSurface).setDynamicRange(dynamicRange).build());
            return this;
        }

        public androidx.camera.core.impl.SessionConfig.Builder addSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface, androidx.camera.core.DynamicRange dynamicRange, java.lang.String str, int i17) {
            this.mOutputConfigs.add(androidx.camera.core.impl.SessionConfig.OutputConfig.builder(deferrableSurface).setPhysicalCameraId(str).setDynamicRange(dynamicRange).setMirrorMode(i17).build());
            this.mCaptureConfigBuilder.addSurface(deferrableSurface);
            return this;
        }
    }

    /* loaded from: classes14.dex */
    public static final class CloseableErrorListener implements androidx.camera.core.impl.SessionConfig.ErrorListener {
        private final androidx.camera.core.impl.SessionConfig.ErrorListener mErrorListener;
        private final java.util.concurrent.atomic.AtomicBoolean mIsClosed = new java.util.concurrent.atomic.AtomicBoolean(false);

        public CloseableErrorListener(androidx.camera.core.impl.SessionConfig.ErrorListener errorListener) {
            this.mErrorListener = errorListener;
        }

        public void close() {
            this.mIsClosed.set(true);
        }

        @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
        public void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
            if (this.mIsClosed.get()) {
                return;
            }
            this.mErrorListener.onError(sessionConfig, sessionError);
        }
    }

    /* loaded from: classes14.dex */
    public interface ErrorListener {
        void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError);
    }

    /* loaded from: classes14.dex */
    public interface OptionUnpacker {
        void unpack(android.util.Size size, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.SessionConfig.Builder builder);
    }

    /* loaded from: classes14.dex */
    public static abstract class OutputConfig {
        public static final int SURFACE_GROUP_ID_NONE = -1;

        /* loaded from: classes14.dex */
        public static abstract class Builder {
            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig build();

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setMirrorMode(int i17);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setPhysicalCameraId(java.lang.String str);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSharedSurfaces(java.util.List<androidx.camera.core.impl.DeferrableSurface> list);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface);

            public abstract androidx.camera.core.impl.SessionConfig.OutputConfig.Builder setSurfaceGroupId(int i17);
        }

        public static androidx.camera.core.impl.SessionConfig.OutputConfig.Builder builder(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            return new androidx.camera.core.impl.AutoValue_SessionConfig_OutputConfig.Builder().setSurface(deferrableSurface).setSharedSurfaces(java.util.Collections.emptyList()).setPhysicalCameraId(null).setMirrorMode(-1).setSurfaceGroupId(-1).setDynamicRange(androidx.camera.core.DynamicRange.SDR);
        }

        public abstract androidx.camera.core.DynamicRange getDynamicRange();

        public abstract int getMirrorMode();

        public abstract java.lang.String getPhysicalCameraId();

        public abstract java.util.List<androidx.camera.core.impl.DeferrableSurface> getSharedSurfaces();

        public abstract androidx.camera.core.impl.DeferrableSurface getSurface();

        public abstract int getSurfaceGroupId();
    }

    /* loaded from: classes6.dex */
    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    /* loaded from: classes14.dex */
    public static final class ValidatingBuilder extends androidx.camera.core.impl.SessionConfig.BaseBuilder {
        private static final java.lang.String TAG = "ValidatingBuilder";
        private final androidx.camera.core.internal.compat.workaround.SurfaceSorter mSurfaceSorter = new androidx.camera.core.internal.compat.workaround.SurfaceSorter();
        private boolean mValid = true;
        private boolean mTemplateSet = false;
        private java.util.List<androidx.camera.core.impl.SessionConfig.ErrorListener> mErrorListeners = new java.util.ArrayList();

        private java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig : this.mOutputConfigs) {
                arrayList.add(outputConfig.getSurface());
                java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$build$0(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
            java.util.Iterator<androidx.camera.core.impl.SessionConfig.ErrorListener> it = this.mErrorListeners.iterator();
            while (it.hasNext()) {
                it.next().onError(sessionConfig, sessionError);
            }
        }

        private void setOrVerifyExpectFrameRateRange(android.util.Range<java.lang.Integer> range) {
            android.util.Range<java.lang.Integer> range2 = androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED;
            if (range.equals(range2)) {
                return;
            }
            if (this.mCaptureConfigBuilder.getExpectedFrameRateRange().equals(range2)) {
                this.mCaptureConfigBuilder.setExpectedFrameRateRange(range);
            } else {
                if (this.mCaptureConfigBuilder.getExpectedFrameRateRange().equals(range)) {
                    return;
                }
                this.mValid = false;
                androidx.camera.core.Logger.d(TAG, "Different ExpectedFrameRateRange values");
            }
        }

        private void setPreviewStabilizationMode(int i17) {
            if (i17 != 0) {
                this.mCaptureConfigBuilder.setPreviewStabilization(i17);
            }
        }

        private void setVideoStabilizationMode(int i17) {
            if (i17 != 0) {
                this.mCaptureConfigBuilder.setVideoStabilization(i17);
            }
        }

        public void add(androidx.camera.core.impl.SessionConfig sessionConfig) {
            androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getTemplateType() != -1) {
                this.mTemplateSet = true;
                this.mCaptureConfigBuilder.setTemplateType(androidx.camera.core.impl.SessionConfig.getHigherPriorityTemplateType(repeatingCaptureConfig.getTemplateType(), this.mCaptureConfigBuilder.getTemplateType()));
            }
            setOrVerifyExpectFrameRateRange(repeatingCaptureConfig.getExpectedFrameRateRange());
            setPreviewStabilizationMode(repeatingCaptureConfig.getPreviewStabilizationMode());
            setVideoStabilizationMode(repeatingCaptureConfig.getVideoStabilizationMode());
            this.mCaptureConfigBuilder.addAllTags(sessionConfig.getRepeatingCaptureConfig().getTagBundle());
            this.mDeviceStateCallbacks.addAll(sessionConfig.getDeviceStateCallbacks());
            this.mSessionStateCallbacks.addAll(sessionConfig.getSessionStateCallbacks());
            this.mCaptureConfigBuilder.addAllCameraCaptureCallbacks(sessionConfig.getRepeatingCameraCaptureCallbacks());
            this.mSingleCameraCaptureCallbacks.addAll(sessionConfig.getSingleCameraCaptureCallbacks());
            if (sessionConfig.getErrorListener() != null) {
                this.mErrorListeners.add(sessionConfig.getErrorListener());
            }
            if (sessionConfig.getInputConfiguration() != null) {
                this.mInputConfiguration = sessionConfig.getInputConfiguration();
            }
            this.mOutputConfigs.addAll(sessionConfig.getOutputConfigs());
            this.mCaptureConfigBuilder.getSurfaces().addAll(repeatingCaptureConfig.getSurfaces());
            if (!getSurfaces().containsAll(this.mCaptureConfigBuilder.getSurfaces())) {
                androidx.camera.core.Logger.d(TAG, "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.mValid = false;
            }
            if (sessionConfig.getSessionType() != this.mSessionType && sessionConfig.getSessionType() != 0 && this.mSessionType != 0) {
                androidx.camera.core.Logger.d(TAG, "Invalid configuration due to that two non-default session types are set");
                this.mValid = false;
            } else if (sessionConfig.getSessionType() != 0) {
                this.mSessionType = sessionConfig.getSessionType();
            }
            if (sessionConfig.mPostviewOutputConfig != null) {
                if (this.mPostviewOutputConfig == sessionConfig.mPostviewOutputConfig || this.mPostviewOutputConfig == null) {
                    this.mPostviewOutputConfig = sessionConfig.mPostviewOutputConfig;
                } else {
                    androidx.camera.core.Logger.d(TAG, "Invalid configuration due to that two different postview output configs are set");
                    this.mValid = false;
                }
            }
            this.mCaptureConfigBuilder.addImplementationOptions(repeatingCaptureConfig.getImplementationOptions());
        }

        public <T> void addImplementationOption(androidx.camera.core.impl.Config.Option<T> option, T t17) {
            this.mCaptureConfigBuilder.addImplementationOption(option, t17);
        }

        public androidx.camera.core.impl.SessionConfig build() {
            if (!this.mValid) {
                throw new java.lang.IllegalArgumentException("Unsupported session configuration combination");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.mOutputConfigs);
            this.mSurfaceSorter.sort(arrayList);
            return new androidx.camera.core.impl.SessionConfig(arrayList, new java.util.ArrayList(this.mDeviceStateCallbacks), new java.util.ArrayList(this.mSessionStateCallbacks), new java.util.ArrayList(this.mSingleCameraCaptureCallbacks), this.mCaptureConfigBuilder.build(), !this.mErrorListeners.isEmpty() ? new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.core.impl.SessionConfig$ValidatingBuilder$$a
                @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
                public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                    androidx.camera.core.impl.SessionConfig.ValidatingBuilder.this.lambda$build$0(sessionConfig, sessionError);
                }
            } : null, this.mInputConfiguration, this.mSessionType, this.mPostviewOutputConfig);
        }

        public void clearSurfaces() {
            this.mOutputConfigs.clear();
            this.mCaptureConfigBuilder.clearSurfaces();
        }

        public boolean isValid() {
            return this.mTemplateSet && this.mValid;
        }
    }

    public SessionConfig(java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> list, java.util.List<android.hardware.camera2.CameraDevice.StateCallback> list2, java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> list3, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list4, androidx.camera.core.impl.CaptureConfig captureConfig, androidx.camera.core.impl.SessionConfig.ErrorListener errorListener, android.hardware.camera2.params.InputConfiguration inputConfiguration, int i17, androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig) {
        this.mOutputConfigs = list;
        this.mDeviceStateCallbacks = java.util.Collections.unmodifiableList(list2);
        this.mSessionStateCallbacks = java.util.Collections.unmodifiableList(list3);
        this.mSingleCameraCaptureCallbacks = java.util.Collections.unmodifiableList(list4);
        this.mErrorListener = errorListener;
        this.mRepeatingCaptureConfig = captureConfig;
        this.mInputConfiguration = inputConfiguration;
        this.mSessionType = i17;
        this.mPostviewOutputConfig = outputConfig;
    }

    public static androidx.camera.core.impl.SessionConfig defaultEmptySessionConfig() {
        return new androidx.camera.core.impl.SessionConfig(new java.util.ArrayList(), new java.util.ArrayList(0), new java.util.ArrayList(0), new java.util.ArrayList(0), new androidx.camera.core.impl.CaptureConfig.Builder().build(), null, null, 0, null);
    }

    public static int getHigherPriorityTemplateType(int i17, int i18) {
        java.util.List<java.lang.Integer> list = SUPPORTED_TEMPLATE_PRIORITY;
        return list.indexOf(java.lang.Integer.valueOf(i17)) >= list.indexOf(java.lang.Integer.valueOf(i18)) ? i17 : i18;
    }

    public java.util.List<android.hardware.camera2.CameraDevice.StateCallback> getDeviceStateCallbacks() {
        return this.mDeviceStateCallbacks;
    }

    public androidx.camera.core.impl.SessionConfig.ErrorListener getErrorListener() {
        return this.mErrorListener;
    }

    public android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
        return this.mRepeatingCaptureConfig.getExpectedFrameRateRange();
    }

    public androidx.camera.core.impl.Config getImplementationOptions() {
        return this.mRepeatingCaptureConfig.getImplementationOptions();
    }

    public android.hardware.camera2.params.InputConfiguration getInputConfiguration() {
        return this.mInputConfiguration;
    }

    public java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig> getOutputConfigs() {
        return this.mOutputConfigs;
    }

    public androidx.camera.core.impl.SessionConfig.OutputConfig getPostviewOutputConfig() {
        return this.mPostviewOutputConfig;
    }

    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getRepeatingCameraCaptureCallbacks() {
        return this.mRepeatingCaptureConfig.getCameraCaptureCallbacks();
    }

    public androidx.camera.core.impl.CaptureConfig getRepeatingCaptureConfig() {
        return this.mRepeatingCaptureConfig;
    }

    public java.util.List<android.hardware.camera2.CameraCaptureSession.StateCallback> getSessionStateCallbacks() {
        return this.mSessionStateCallbacks;
    }

    public int getSessionType() {
        return this.mSessionType;
    }

    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getSingleCameraCaptureCallbacks() {
        return this.mSingleCameraCaptureCallbacks;
    }

    public java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig : this.mOutputConfigs) {
            arrayList.add(outputConfig.getSurface());
            java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public int getTemplateType() {
        return this.mRepeatingCaptureConfig.getTemplateType();
    }
}
