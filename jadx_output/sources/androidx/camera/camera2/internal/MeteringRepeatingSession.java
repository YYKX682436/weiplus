package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class MeteringRepeatingSession {
    private static final int IMAGE_FORMAT = 34;
    private static final java.lang.String TAG = "MeteringRepeating";
    private androidx.camera.core.impl.DeferrableSurface mDeferrableSurface;
    private final android.util.Size mMeteringRepeatingSize;
    private androidx.camera.core.impl.SessionConfig mSessionConfig;
    private final androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback mSurfaceResetCallback;
    private final androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize mSupportedRepeatingSurfaceSize = new androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize();
    private androidx.camera.core.impl.SessionConfig.CloseableErrorListener mCloseableErrorListener = null;
    private final androidx.camera.camera2.internal.MeteringRepeatingSession.MeteringRepeatingConfig mConfigWithDefaults = new androidx.camera.camera2.internal.MeteringRepeatingSession.MeteringRepeatingConfig();

    /* loaded from: classes14.dex */
    public static class MeteringRepeatingConfig implements androidx.camera.core.impl.UseCaseConfig<androidx.camera.core.UseCase> {
        private final androidx.camera.core.impl.Config mConfig;

        public MeteringRepeatingConfig() {
            androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
            create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new androidx.camera.camera2.internal.Camera2SessionOptionUnpacker());
            create.insertOption(androidx.camera.core.impl.ImageInputConfig.OPTION_INPUT_FORMAT, 34);
            setTargetConfigs(create);
            this.mConfig = create;
        }

        private void setTargetConfigs(androidx.camera.core.impl.MutableOptionsBundle mutableOptionsBundle) {
            mutableOptionsBundle.insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_CLASS, androidx.camera.camera2.internal.MeteringRepeatingSession.class);
            mutableOptionsBundle.insertOption(androidx.camera.core.internal.TargetConfig.OPTION_TARGET_NAME, androidx.camera.camera2.internal.MeteringRepeatingSession.class.getCanonicalName() + "-" + java.util.UUID.randomUUID());
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public androidx.camera.core.impl.UseCaseConfigFactory.CaptureType getCaptureType() {
            return androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public androidx.camera.core.impl.Config getConfig() {
            return this.mConfig;
        }
    }

    /* loaded from: classes14.dex */
    public interface SurfaceResetCallback {
        void onSurfaceReset();
    }

    public MeteringRepeatingSession(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, androidx.camera.camera2.internal.DisplayInfoManager displayInfoManager, androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback surfaceResetCallback) {
        this.mSurfaceResetCallback = surfaceResetCallback;
        android.util.Size properPreviewSize = getProperPreviewSize(cameraCharacteristicsCompat, displayInfoManager);
        this.mMeteringRepeatingSize = properPreviewSize;
        androidx.camera.core.Logger.d(TAG, "MeteringSession SurfaceTexture size: " + properPreviewSize);
        this.mSessionConfig = createSessionConfig();
    }

    private android.util.Size getProperPreviewSize(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat, androidx.camera.camera2.internal.DisplayInfoManager displayInfoManager) {
        android.util.Size[] outputSizes = cameraCharacteristicsCompat.getStreamConfigurationMapCompat().getOutputSizes(34);
        if (outputSizes == null) {
            androidx.camera.core.Logger.e(TAG, "Can not get output size list.");
            return new android.util.Size(0, 0);
        }
        android.util.Size[] supportedSizes = this.mSupportedRepeatingSurfaceSize.getSupportedSizes(outputSizes);
        java.util.List asList = java.util.Arrays.asList(supportedSizes);
        java.util.Collections.sort(asList, new androidx.camera.camera2.internal.MeteringRepeatingSession$$b());
        android.util.Size previewSize = displayInfoManager.getPreviewSize();
        long min = java.lang.Math.min(previewSize.getWidth() * previewSize.getHeight(), 307200L);
        int length = supportedSizes.length;
        android.util.Size size = null;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            android.util.Size size2 = supportedSizes[i17];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i17++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (android.util.Size) asList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createSessionConfig$0(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
        this.mSessionConfig = createSessionConfig();
        androidx.camera.camera2.internal.MeteringRepeatingSession.SurfaceResetCallback surfaceResetCallback = this.mSurfaceResetCallback;
        if (surfaceResetCallback != null) {
            surfaceResetCallback.onSurfaceReset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getProperPreviewSize$1(android.util.Size size, android.util.Size size2) {
        return java.lang.Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    public void clear() {
        androidx.camera.core.Logger.d(TAG, "MeteringRepeating clear!");
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.mDeferrableSurface = null;
    }

    public androidx.camera.core.impl.SessionConfig createSessionConfig() {
        final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.mMeteringRepeatingSize.getWidth(), this.mMeteringRepeatingSize.getHeight());
        final android.view.Surface surface = new android.view.Surface(surfaceTexture);
        androidx.camera.core.impl.SessionConfig.Builder createFrom = androidx.camera.core.impl.SessionConfig.Builder.createFrom(this.mConfigWithDefaults, this.mMeteringRepeatingSize);
        createFrom.setTemplateType(1);
        androidx.camera.core.impl.ImmediateSurface immediateSurface = new androidx.camera.core.impl.ImmediateSurface(surface);
        this.mDeferrableSurface = immediateSurface;
        androidx.camera.core.impl.utils.futures.Futures.addCallback(immediateSurface.getTerminationFuture(), new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                throw new java.lang.IllegalStateException("Future should never fail. Did it get completed by GC?", th6);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.lang.Void r17) {
                surface.release();
                surfaceTexture.release();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        createFrom.addSurface(this.mDeferrableSurface);
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener = this.mCloseableErrorListener;
        if (closeableErrorListener != null) {
            closeableErrorListener.close();
        }
        androidx.camera.core.impl.SessionConfig.CloseableErrorListener closeableErrorListener2 = new androidx.camera.core.impl.SessionConfig.CloseableErrorListener(new androidx.camera.core.impl.SessionConfig.ErrorListener() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession$$a
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void onError(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.SessionConfig.SessionError sessionError) {
                androidx.camera.camera2.internal.MeteringRepeatingSession.this.lambda$createSessionConfig$0(sessionConfig, sessionError);
            }
        });
        this.mCloseableErrorListener = closeableErrorListener2;
        createFrom.setErrorListener(closeableErrorListener2);
        return createFrom.build();
    }

    public android.util.Size getMeteringRepeatingSize() {
        return this.mMeteringRepeatingSize;
    }

    public java.lang.String getName() {
        return TAG;
    }

    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }

    public androidx.camera.core.impl.UseCaseConfig<?> getUseCaseConfig() {
        return this.mConfigWithDefaults;
    }
}
