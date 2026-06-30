package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class CaptureSession implements androidx.camera.camera2.internal.CaptureSessionInterface {
    private static final java.lang.String TAG = "CaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private final boolean mCanUseMultiResolutionImageReader;
    private final java.util.List<androidx.camera.core.impl.CaptureConfig> mCaptureConfigs;
    private final androidx.camera.camera2.internal.CaptureSession.StateCallback mCaptureSessionStateCallback;
    java.util.List<androidx.camera.core.impl.DeferrableSurface> mConfiguredDeferrableSurfaces;
    private final java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> mConfiguredSurfaceMap;
    private final androidx.camera.camera2.internal.compat.params.DynamicRangesCompat mDynamicRangesCompat;
    t2.k mReleaseCompleter;
    wa.a mReleaseFuture;
    private final androidx.camera.camera2.internal.compat.workaround.RequestMonitor mRequestMonitor;
    androidx.camera.core.impl.SessionConfig mSessionConfig;
    final java.lang.Object mSessionLock;
    androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener mSessionOpener;
    androidx.camera.camera2.internal.CaptureSession.State mState;
    private final androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow mStillCaptureFlow;
    private java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> mStreamUseCaseMap;
    androidx.camera.camera2.internal.SynchronizedCaptureSession mSynchronizedCaptureSession;
    private final androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride mTemplateParamsOverride;
    private final androidx.camera.camera2.internal.compat.workaround.TorchStateReset mTorchStateReset;

    /* loaded from: classes14.dex */
    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* loaded from: classes14.dex */
    public final class StateCallback extends androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback {
        public StateCallback() {
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigureFailed(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (androidx.camera.camera2.internal.CaptureSession.this.mSessionLock) {
                switch (androidx.camera.camera2.internal.CaptureSession.this.mState) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                        throw new java.lang.IllegalStateException("onConfigureFailed() should not be possible in state: " + androidx.camera.camera2.internal.CaptureSession.this.mState);
                    case OPENING:
                    case CLOSED:
                    case RELEASING:
                        androidx.camera.camera2.internal.CaptureSession.this.finishClose();
                        break;
                    case RELEASED:
                        androidx.camera.core.Logger.d(androidx.camera.camera2.internal.CaptureSession.TAG, "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                androidx.camera.core.Logger.e(androidx.camera.camera2.internal.CaptureSession.TAG, "CameraCaptureSession.onConfigureFailed() " + androidx.camera.camera2.internal.CaptureSession.this.mState);
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onConfigured(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (androidx.camera.camera2.internal.CaptureSession.this.mSessionLock) {
                switch (androidx.camera.camera2.internal.CaptureSession.this.mState) {
                    case UNINITIALIZED:
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENED:
                    case RELEASED:
                        throw new java.lang.IllegalStateException("onConfigured() should not be possible in state: " + androidx.camera.camera2.internal.CaptureSession.this.mState);
                    case OPENING:
                        androidx.camera.camera2.internal.CaptureSession captureSession = androidx.camera.camera2.internal.CaptureSession.this;
                        captureSession.mState = androidx.camera.camera2.internal.CaptureSession.State.OPENED;
                        captureSession.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        androidx.camera.core.Logger.d(androidx.camera.camera2.internal.CaptureSession.TAG, "Attempting to send capture request onConfigured");
                        androidx.camera.camera2.internal.CaptureSession captureSession2 = androidx.camera.camera2.internal.CaptureSession.this;
                        captureSession2.issueRepeatingCaptureRequests(captureSession2.mSessionConfig);
                        androidx.camera.camera2.internal.CaptureSession.this.issuePendingCaptureRequest();
                        break;
                    case CLOSED:
                        androidx.camera.camera2.internal.CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        break;
                    case RELEASING:
                        synchronizedCaptureSession.close();
                        break;
                }
                androidx.camera.core.Logger.d(androidx.camera.camera2.internal.CaptureSession.TAG, "CameraCaptureSession.onConfigured() mState=" + androidx.camera.camera2.internal.CaptureSession.this.mState);
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onReady(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (androidx.camera.camera2.internal.CaptureSession.this.mSessionLock) {
                if (androidx.camera.camera2.internal.CaptureSession.this.mState.ordinal() == 0) {
                    throw new java.lang.IllegalStateException("onReady() should not be possible in state: " + androidx.camera.camera2.internal.CaptureSession.this.mState);
                }
                androidx.camera.core.Logger.d(androidx.camera.camera2.internal.CaptureSession.TAG, "CameraCaptureSession.onReady() " + androidx.camera.camera2.internal.CaptureSession.this.mState);
            }
        }

        @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
        public void onSessionFinished(androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (androidx.camera.camera2.internal.CaptureSession.this.mSessionLock) {
                if (androidx.camera.camera2.internal.CaptureSession.this.mState == androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED) {
                    throw new java.lang.IllegalStateException("onSessionFinished() should not be possible in state: " + androidx.camera.camera2.internal.CaptureSession.this.mState);
                }
                androidx.camera.core.Logger.d(androidx.camera.camera2.internal.CaptureSession.TAG, "onSessionFinished()");
                androidx.camera.camera2.internal.CaptureSession.this.finishClose();
            }
        }
    }

    public CaptureSession(androidx.camera.camera2.internal.compat.params.DynamicRangesCompat dynamicRangesCompat) {
        this(dynamicRangesCompat, false);
    }

    private android.hardware.camera2.CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list, android.hardware.camera2.CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + captureCallbackArr.length);
        java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.camera2.internal.CaptureCallbackConverter.toCaptureCallback(it.next()));
        }
        java.util.Collections.addAll(arrayList, captureCallbackArr);
        return androidx.camera.camera2.internal.Camera2CaptureCallbacks.createComboCallback(arrayList);
    }

    private static java.util.List<android.hardware.camera2.params.OutputConfiguration> createInstancesForMultiResolutionOutput(java.util.List<android.hardware.camera2.params.MultiResolutionStreamInfo> list, int i17) {
        try {
            return (java.util.List) android.hardware.camera2.params.OutputConfiguration.class.getMethod("createInstancesForMultiResolutionOutput", java.util.Collection.class, java.lang.Integer.TYPE).invoke(null, list, java.lang.Integer.valueOf(i17));
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            androidx.camera.core.Logger.e(TAG, "Failed to create instances for multi-resolution output, " + e17.getMessage());
            return null;
        }
    }

    private static java.util.Map<androidx.camera.core.impl.SessionConfig.OutputConfig, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> createMultiResolutionOutputConfigurationCompats(java.util.Map<java.lang.Integer, java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig>> map, java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> map2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<java.lang.Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 0;
            for (androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig : map.get(java.lang.Integer.valueOf(intValue))) {
                androidx.camera.core.impl.utils.SurfaceUtil.SurfaceInfo surfaceInfo = androidx.camera.core.impl.utils.SurfaceUtil.getSurfaceInfo(map2.get(outputConfig.getSurface()));
                if (i17 == 0) {
                    i17 = surfaceInfo.format;
                }
                int i18 = surfaceInfo.width;
                int i19 = surfaceInfo.height;
                java.lang.String physicalCameraId = outputConfig.getPhysicalCameraId();
                java.util.Objects.requireNonNull(physicalCameraId);
                arrayList.add(new android.hardware.camera2.params.MultiResolutionStreamInfo(i18, i19, physicalCameraId));
            }
            if (i17 == 0 || arrayList.isEmpty()) {
                androidx.camera.core.Logger.e(TAG, "Skips to create instances for multi-resolution output. imageFormat: " + i17 + ", streamInfos size: " + arrayList.size());
            } else {
                java.util.List<android.hardware.camera2.params.OutputConfiguration> createInstancesForMultiResolutionOutput = createInstancesForMultiResolutionOutput(arrayList, i17);
                if (createInstancesForMultiResolutionOutput != null) {
                    for (androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig2 : map.get(java.lang.Integer.valueOf(intValue))) {
                        android.hardware.camera2.params.OutputConfiguration remove = createInstancesForMultiResolutionOutput.remove(0);
                        remove.addSurface(map2.get(outputConfig2.getSurface()));
                        hashMap.put(outputConfig2, new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat(remove));
                    }
                }
            }
        }
        return hashMap;
    }

    private androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat getOutputConfigurationCompat(androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig, java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> map, java.lang.String str) {
        long j17;
        android.hardware.camera2.params.DynamicRangeProfiles dynamicRangeProfiles;
        android.view.Surface surface = map.get(outputConfig.getSurface());
        m3.h.d(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat outputConfigurationCompat = new androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat(outputConfig.getSurfaceGroupId(), surface);
        if (str != null) {
            outputConfigurationCompat.setPhysicalCameraId(str);
        } else {
            outputConfigurationCompat.setPhysicalCameraId(outputConfig.getPhysicalCameraId());
        }
        if (outputConfig.getMirrorMode() == 0) {
            outputConfigurationCompat.setMirrorMode(1);
        } else if (outputConfig.getMirrorMode() == 1) {
            outputConfigurationCompat.setMirrorMode(2);
        }
        if (!outputConfig.getSharedSurfaces().isEmpty()) {
            outputConfigurationCompat.enableSurfaceSharing();
            java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = outputConfig.getSharedSurfaces().iterator();
            while (it.hasNext()) {
                android.view.Surface surface2 = map.get(it.next());
                m3.h.d(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                outputConfigurationCompat.addSurface(surface2);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && (dynamicRangeProfiles = this.mDynamicRangesCompat.toDynamicRangeProfiles()) != null) {
            androidx.camera.core.DynamicRange dynamicRange = outputConfig.getDynamicRange();
            java.lang.Long dynamicRangeToFirstSupportedProfile = androidx.camera.camera2.internal.compat.params.DynamicRangeConversions.dynamicRangeToFirstSupportedProfile(dynamicRange, dynamicRangeProfiles);
            if (dynamicRangeToFirstSupportedProfile != null) {
                j17 = dynamicRangeToFirstSupportedProfile.longValue();
                outputConfigurationCompat.setDynamicRangeProfile(j17);
                return outputConfigurationCompat;
            }
            androidx.camera.core.Logger.e(TAG, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + dynamicRange);
        }
        j17 = 1;
        outputConfigurationCompat.setDynamicRangeProfile(j17);
        return outputConfigurationCompat;
    }

    private java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> getUniqueOutputConfigurations(java.util.List<androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat outputConfigurationCompat : list) {
            if (!arrayList.contains(outputConfigurationCompat.getSurface())) {
                arrayList.add(outputConfigurationCompat.getSurface());
                arrayList2.add(outputConfigurationCompat);
            }
        }
        return arrayList2;
    }

    private static java.util.Map<java.lang.Integer, java.util.List<androidx.camera.core.impl.SessionConfig.OutputConfig>> groupMrirOutputConfigs(java.util.Collection<androidx.camera.core.impl.SessionConfig.OutputConfig> collection) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig : collection) {
            if (outputConfig.getSurfaceGroupId() > 0 && outputConfig.getSharedSurfaces().isEmpty()) {
                java.util.List list = (java.util.List) hashMap.get(java.lang.Integer.valueOf(outputConfig.getSurfaceGroupId()));
                if (list == null) {
                    list = new java.util.ArrayList();
                    hashMap.put(java.lang.Integer.valueOf(outputConfig.getSurfaceGroupId()), list);
                }
                list.add(outputConfig);
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (((java.util.List) hashMap.get(java.lang.Integer.valueOf(intValue))).size() >= 2) {
                hashMap2.put(java.lang.Integer.valueOf(intValue), (java.util.List) hashMap.get(java.lang.Integer.valueOf(intValue)));
            }
        }
        return hashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$issueBurstCaptureRequest$3(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, boolean z17) {
        synchronized (this.mSessionLock) {
            if (this.mState == androidx.camera.camera2.internal.CaptureSession.State.OPENED) {
                issueRepeatingCaptureRequests(this.mSessionConfig);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$issuePendingCaptureRequest$2() {
        synchronized (this.mSessionLock) {
            if (this.mCaptureConfigs.isEmpty()) {
                return;
            }
            try {
                issueBurstCaptureRequest(this.mCaptureConfigs);
            } finally {
                this.mCaptureConfigs.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$release$1(t2.k kVar) {
        java.lang.String str;
        synchronized (this.mSessionLock) {
            m3.h.e(this.mReleaseCompleter == null, "Release completer expected to be null");
            this.mReleaseCompleter = kVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openCaptureSession, reason: merged with bridge method [inline-methods] */
    public wa.a lambda$open$0(java.util.List<android.view.Surface> list, androidx.camera.core.impl.SessionConfig sessionConfig, android.hardware.camera2.CameraDevice cameraDevice) {
        synchronized (this.mSessionLock) {
            int ordinal = this.mState.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2) {
                    this.mConfiguredSurfaceMap.clear();
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        this.mConfiguredSurfaceMap.put(this.mConfiguredDeferrableSurfaces.get(i17), list.get(i17));
                    }
                    this.mState = androidx.camera.camera2.internal.CaptureSession.State.OPENING;
                    androidx.camera.core.Logger.d(TAG, "Opening capture session.");
                    androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback createComboCallback = androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks.createComboCallback(this.mCaptureSessionStateCallback, new androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig.getSessionStateCallbacks()));
                    androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig = new androidx.camera.camera2.impl.Camera2ImplConfig(sessionConfig.getImplementationOptions());
                    androidx.camera.core.impl.CaptureConfig.Builder from = androidx.camera.core.impl.CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                    java.util.Map hashMap = new java.util.HashMap();
                    if (this.mCanUseMultiResolutionImageReader && android.os.Build.VERSION.SDK_INT >= 35) {
                        hashMap = createMultiResolutionOutputConfigurationCompats(groupMrirOutputConfigs(sessionConfig.getOutputConfigs()), this.mConfiguredSurfaceMap);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.String physicalCameraId = camera2ImplConfig.getPhysicalCameraId(null);
                    for (androidx.camera.core.impl.SessionConfig.OutputConfig outputConfig : sessionConfig.getOutputConfigs()) {
                        androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat outputConfigurationCompat = (!this.mCanUseMultiResolutionImageReader || android.os.Build.VERSION.SDK_INT < 35) ? null : (androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat) hashMap.get(outputConfig);
                        if (outputConfigurationCompat == null) {
                            outputConfigurationCompat = getOutputConfigurationCompat(outputConfig, this.mConfiguredSurfaceMap, physicalCameraId);
                            if (this.mStreamUseCaseMap.containsKey(outputConfig.getSurface())) {
                                outputConfigurationCompat.setStreamUseCase(this.mStreamUseCaseMap.get(outputConfig.getSurface()).longValue());
                            }
                        }
                        arrayList.add(outputConfigurationCompat);
                    }
                    androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat createSessionConfigurationCompat = this.mSessionOpener.createSessionConfigurationCompat(sessionConfig.getSessionType(), getUniqueOutputConfigurations(arrayList), createComboCallback);
                    if (sessionConfig.getTemplateType() == 5 && sessionConfig.getInputConfiguration() != null) {
                        createSessionConfigurationCompat.setInputConfiguration(androidx.camera.camera2.internal.compat.params.InputConfigurationCompat.wrap(sessionConfig.getInputConfiguration()));
                    }
                    try {
                        android.hardware.camera2.CaptureRequest buildWithoutTarget = androidx.camera.camera2.internal.Camera2CaptureRequestBuilder.buildWithoutTarget(from.build(), cameraDevice, this.mTemplateParamsOverride);
                        if (buildWithoutTarget != null) {
                            createSessionConfigurationCompat.setSessionParameters(buildWithoutTarget);
                        }
                        return this.mSessionOpener.openCaptureSession(cameraDevice, createSessionConfigurationCompat, this.mConfiguredDeferrableSurfaces);
                    } catch (android.hardware.camera2.CameraAccessException e17) {
                        return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(e17);
                    }
                }
                if (ordinal != 4) {
                    return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.util.concurrent.CancellationException("openCaptureSession() not execute in state: " + this.mState));
                }
            }
            return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("openCaptureSession() should not be possible in state: " + this.mState));
        }
    }

    public void abortCaptures() {
        synchronized (this.mSessionLock) {
            if (this.mState != androidx.camera.camera2.internal.CaptureSession.State.OPENED) {
                androidx.camera.core.Logger.e(TAG, "Unable to abort captures. Incorrect state:" + this.mState);
            } else {
                try {
                    this.mSynchronizedCaptureSession.abortCaptures();
                } catch (android.hardware.camera2.CameraAccessException e17) {
                    androidx.camera.core.Logger.e(TAG, "Unable to abort captures.", e17);
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void cancelIssuedCaptureRequests() {
        java.util.ArrayList<androidx.camera.core.impl.CaptureConfig> arrayList;
        synchronized (this.mSessionLock) {
            if (this.mCaptureConfigs.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList(this.mCaptureConfigs);
                this.mCaptureConfigs.clear();
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.CaptureConfig captureConfig : arrayList) {
                java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = captureConfig.getCameraCaptureCallbacks().iterator();
                while (it.hasNext()) {
                    it.next().onCaptureCancelled(captureConfig.getId());
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void close() {
        synchronized (this.mSessionLock) {
            int ordinal = this.mState.ordinal();
            if (ordinal == 0) {
                throw new java.lang.IllegalStateException("close() should not be possible in state: " + this.mState);
            }
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m3.h.d(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSessionOpener.stop();
                } else if (ordinal == 3 || ordinal == 4) {
                    m3.h.d(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSessionOpener.stop();
                    this.mState = androidx.camera.camera2.internal.CaptureSession.State.CLOSED;
                    this.mRequestMonitor.stop();
                    this.mSessionConfig = null;
                }
            }
            this.mState = androidx.camera.camera2.internal.CaptureSession.State.RELEASED;
        }
    }

    public void finishClose() {
        androidx.camera.camera2.internal.CaptureSession.State state = this.mState;
        androidx.camera.camera2.internal.CaptureSession.State state2 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED;
        if (state == state2) {
            androidx.camera.core.Logger.d(TAG, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.mState = state2;
        this.mSynchronizedCaptureSession = null;
        t2.k kVar = this.mReleaseCompleter;
        if (kVar != null) {
            kVar.a(null);
            this.mReleaseCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public java.util.List<androidx.camera.core.impl.CaptureConfig> getCaptureConfigs() {
        java.util.List<androidx.camera.core.impl.CaptureConfig> unmodifiableList;
        synchronized (this.mSessionLock) {
            unmodifiableList = java.util.Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return unmodifiableList;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        androidx.camera.core.impl.SessionConfig sessionConfig;
        synchronized (this.mSessionLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    public androidx.camera.camera2.internal.CaptureSession.State getState() {
        androidx.camera.camera2.internal.CaptureSession.State state;
        synchronized (this.mSessionLock) {
            state = this.mState;
        }
        return state;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public boolean isInOpenState() {
        boolean z17;
        synchronized (this.mSessionLock) {
            androidx.camera.camera2.internal.CaptureSession.State state = this.mState;
            z17 = state == androidx.camera.camera2.internal.CaptureSession.State.OPENED || state == androidx.camera.camera2.internal.CaptureSession.State.OPENING;
        }
        return z17;
    }

    public int issueBurstCaptureRequest(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
        androidx.camera.camera2.internal.CameraBurstCaptureCallback cameraBurstCaptureCallback;
        java.util.ArrayList arrayList;
        boolean z17;
        boolean z18;
        synchronized (this.mSessionLock) {
            if (this.mState != androidx.camera.camera2.internal.CaptureSession.State.OPENED) {
                androidx.camera.core.Logger.d(TAG, "Skipping issueBurstCaptureRequest due to session closed");
                return -1;
            }
            if (list.isEmpty()) {
                return -1;
            }
            try {
                cameraBurstCaptureCallback = new androidx.camera.camera2.internal.CameraBurstCaptureCallback();
                arrayList = new java.util.ArrayList();
                androidx.camera.core.Logger.d(TAG, "Issuing capture request.");
                z17 = false;
                for (androidx.camera.core.impl.CaptureConfig captureConfig : list) {
                    if (captureConfig.getSurfaces().isEmpty()) {
                        androidx.camera.core.Logger.d(TAG, "Skipping issuing empty capture request.");
                    } else {
                        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = captureConfig.getSurfaces().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z18 = true;
                                break;
                            }
                            androidx.camera.core.impl.DeferrableSurface next = it.next();
                            if (!this.mConfiguredSurfaceMap.containsKey(next)) {
                                androidx.camera.core.Logger.d(TAG, "Skipping capture request with invalid surface: " + next);
                                z18 = false;
                                break;
                            }
                        }
                        if (z18) {
                            if (captureConfig.getTemplateType() == 2) {
                                z17 = true;
                            }
                            androidx.camera.core.impl.CaptureConfig.Builder from = androidx.camera.core.impl.CaptureConfig.Builder.from(captureConfig);
                            if (captureConfig.getTemplateType() == 5 && captureConfig.getCameraCaptureResult() != null) {
                                from.setCameraCaptureResult(captureConfig.getCameraCaptureResult());
                            }
                            androidx.camera.core.impl.SessionConfig sessionConfig = this.mSessionConfig;
                            if (sessionConfig != null) {
                                from.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                            }
                            from.addImplementationOptions(captureConfig.getImplementationOptions());
                            android.hardware.camera2.CaptureRequest build = androidx.camera.camera2.internal.Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, false, this.mTemplateParamsOverride);
                            if (build == null) {
                                androidx.camera.core.Logger.d(TAG, "Skipping issuing request without surface.");
                                return -1;
                            }
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it6 = captureConfig.getCameraCaptureCallbacks().iterator();
                            while (it6.hasNext()) {
                                androidx.camera.camera2.internal.CaptureCallbackConverter.toCaptureCallback(it6.next(), arrayList2);
                            }
                            cameraBurstCaptureCallback.addCamera2Callbacks(build, arrayList2);
                            arrayList.add(build);
                        }
                    }
                }
            } catch (android.hardware.camera2.CameraAccessException e17) {
                androidx.camera.core.Logger.e(TAG, "Unable to access camera: " + e17.getMessage());
                java.lang.Thread.dumpStack();
            }
            if (arrayList.isEmpty()) {
                androidx.camera.core.Logger.d(TAG, "Skipping issuing burst request due to no valid request elements");
                return -1;
            }
            if (this.mStillCaptureFlow.shouldStopRepeatingBeforeCapture(arrayList, z17)) {
                this.mSynchronizedCaptureSession.stopRepeating();
                cameraBurstCaptureCallback.setCaptureSequenceCallback(new androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback() { // from class: androidx.camera.camera2.internal.CaptureSession$$a
                    @Override // androidx.camera.camera2.internal.CameraBurstCaptureCallback.CaptureSequenceCallback
                    public final void onCaptureSequenceCompletedOrAborted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, int i17, boolean z19) {
                        androidx.camera.camera2.internal.CaptureSession.this.lambda$issueBurstCaptureRequest$3(cameraCaptureSession, i17, z19);
                    }
                });
            }
            if (this.mTorchStateReset.isTorchResetRequired(arrayList, z17)) {
                cameraBurstCaptureCallback.addCamera2Callbacks((android.hardware.camera2.CaptureRequest) arrayList.get(arrayList.size() - 1), java.util.Collections.singletonList(new android.hardware.camera2.CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.CaptureSession.2
                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession cameraCaptureSession, android.hardware.camera2.CaptureRequest captureRequest, android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
                        synchronized (androidx.camera.camera2.internal.CaptureSession.this.mSessionLock) {
                            androidx.camera.core.impl.SessionConfig sessionConfig2 = androidx.camera.camera2.internal.CaptureSession.this.mSessionConfig;
                            if (sessionConfig2 == null) {
                                return;
                            }
                            androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig = sessionConfig2.getRepeatingCaptureConfig();
                            androidx.camera.core.Logger.d(androidx.camera.camera2.internal.CaptureSession.TAG, "Submit FLASH_MODE_OFF request");
                            androidx.camera.camera2.internal.CaptureSession captureSession = androidx.camera.camera2.internal.CaptureSession.this;
                            captureSession.issueCaptureRequests(java.util.Collections.singletonList(captureSession.mTorchStateReset.createTorchResetRequest(repeatingCaptureConfig)));
                        }
                    }
                }));
            }
            return this.mSynchronizedCaptureSession.captureBurstRequests(arrayList, cameraBurstCaptureCallback);
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void issueCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list) {
        synchronized (this.mSessionLock) {
            switch (this.mState) {
                case UNINITIALIZED:
                    throw new java.lang.IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.mCaptureConfigs.addAll(list);
                    break;
                case OPENED:
                    this.mCaptureConfigs.addAll(list);
                    issuePendingCaptureRequest();
                    break;
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new java.lang.IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    public void issuePendingCaptureRequest() {
        this.mRequestMonitor.getRequestsProcessedFuture().addListener(new java.lang.Runnable() { // from class: androidx.camera.camera2.internal.CaptureSession$$b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.camera2.internal.CaptureSession.this.lambda$issuePendingCaptureRequest$2();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
    }

    public int issueRepeatingCaptureRequests(androidx.camera.core.impl.SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            if (sessionConfig == null) {
                androidx.camera.core.Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            if (this.mState != androidx.camera.camera2.internal.CaptureSession.State.OPENED) {
                androidx.camera.core.Logger.d(TAG, "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            }
            androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                androidx.camera.core.Logger.d(TAG, "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (android.hardware.camera2.CameraAccessException e17) {
                    androidx.camera.core.Logger.e(TAG, "Unable to access camera: " + e17.getMessage());
                    java.lang.Thread.dumpStack();
                }
                return -1;
            }
            try {
                androidx.camera.core.Logger.d(TAG, "Issuing request for session.");
                android.hardware.camera2.CaptureRequest build = androidx.camera.camera2.internal.Camera2CaptureRequestBuilder.build(repeatingCaptureConfig, this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap, true, this.mTemplateParamsOverride);
                if (build == null) {
                    androidx.camera.core.Logger.d(TAG, "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.mSynchronizedCaptureSession.setSingleRepeatingRequest(build, this.mRequestMonitor.createMonitorListener(createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), new android.hardware.camera2.CameraCaptureSession.CaptureCallback[0])));
            } catch (android.hardware.camera2.CameraAccessException e18) {
                androidx.camera.core.Logger.e(TAG, "Unable to access camera: " + e18.getMessage());
                java.lang.Thread.dumpStack();
                return -1;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public wa.a open(final androidx.camera.core.impl.SessionConfig sessionConfig, final android.hardware.camera2.CameraDevice cameraDevice, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener opener) {
        synchronized (this.mSessionLock) {
            if (this.mState.ordinal() != 1) {
                androidx.camera.core.Logger.e(TAG, "Open not allowed in state: " + this.mState);
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new java.lang.IllegalStateException("open() should not allow the state: " + this.mState));
            }
            this.mState = androidx.camera.camera2.internal.CaptureSession.State.GET_SURFACE;
            java.util.ArrayList arrayList = new java.util.ArrayList(sessionConfig.getSurfaces());
            this.mConfiguredDeferrableSurfaces = arrayList;
            this.mSessionOpener = opener;
            androidx.camera.core.impl.utils.futures.FutureChain transformAsync = androidx.camera.core.impl.utils.futures.FutureChain.from(opener.startWithDeferrableSurface(arrayList, TIMEOUT_GET_SURFACE_IN_MS)).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.camera2.internal.CaptureSession$$d
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final wa.a apply(java.lang.Object obj) {
                    wa.a lambda$open$0;
                    lambda$open$0 = androidx.camera.camera2.internal.CaptureSession.this.lambda$open$0(sessionConfig, cameraDevice, (java.util.List) obj);
                    return lambda$open$0;
                }
            }, this.mSessionOpener.getExecutor());
            androidx.camera.core.impl.utils.futures.Futures.addCallback(transformAsync, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.camera2.internal.CaptureSession.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(java.lang.Throwable th6) {
                    synchronized (androidx.camera.camera2.internal.CaptureSession.this.mSessionLock) {
                        androidx.camera.camera2.internal.CaptureSession.this.mSessionOpener.stop();
                        int ordinal = androidx.camera.camera2.internal.CaptureSession.this.mState.ordinal();
                        if ((ordinal == 3 || ordinal == 5 || ordinal == 6) && !(th6 instanceof java.util.concurrent.CancellationException)) {
                            androidx.camera.core.Logger.w(androidx.camera.camera2.internal.CaptureSession.TAG, "Opening session with fail " + androidx.camera.camera2.internal.CaptureSession.this.mState, th6);
                            androidx.camera.camera2.internal.CaptureSession.this.finishClose();
                        }
                    }
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onSuccess(java.lang.Void r17) {
                }
            }, this.mSessionOpener.getExecutor());
            return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(transformAsync);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public wa.a release(boolean z17) {
        synchronized (this.mSessionLock) {
            switch (this.mState) {
                case UNINITIALIZED:
                    throw new java.lang.IllegalStateException("release() should not be possible in state: " + this.mState);
                case GET_SURFACE:
                    m3.h.d(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    this.mSessionOpener.stop();
                case INITIALIZED:
                    this.mState = androidx.camera.camera2.internal.CaptureSession.State.RELEASED;
                    return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
                case OPENED:
                case CLOSED:
                    androidx.camera.camera2.internal.SynchronizedCaptureSession synchronizedCaptureSession = this.mSynchronizedCaptureSession;
                    if (synchronizedCaptureSession != null) {
                        if (z17) {
                            try {
                                synchronizedCaptureSession.abortCaptures();
                            } catch (android.hardware.camera2.CameraAccessException e17) {
                                androidx.camera.core.Logger.e(TAG, "Unable to abort captures.", e17);
                            }
                        }
                        this.mSynchronizedCaptureSession.close();
                    }
                case OPENING:
                    this.mState = androidx.camera.camera2.internal.CaptureSession.State.RELEASING;
                    this.mRequestMonitor.stop();
                    m3.h.d(this.mSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                    if (this.mSessionOpener.stop()) {
                        finishClose();
                        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
                    }
                case RELEASING:
                    if (this.mReleaseFuture == null) {
                        this.mReleaseFuture = t2.p.a(new t2.m() { // from class: androidx.camera.camera2.internal.CaptureSession$$c
                            @Override // t2.m
                            public final java.lang.Object attachCompleter(t2.k kVar) {
                                java.lang.Object lambda$release$1;
                                lambda$release$1 = androidx.camera.camera2.internal.CaptureSession.this.lambda$release$1(kVar);
                                return lambda$release$1;
                            }
                        });
                    }
                    return this.mReleaseFuture;
                default:
                    return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setSessionConfig(androidx.camera.core.impl.SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            switch (this.mState) {
                case UNINITIALIZED:
                    throw new java.lang.IllegalStateException("setSessionConfig() should not be possible in state: " + this.mState);
                case INITIALIZED:
                case GET_SURFACE:
                case OPENING:
                    this.mSessionConfig = sessionConfig;
                    break;
                case OPENED:
                    this.mSessionConfig = sessionConfig;
                    if (sessionConfig != null) {
                        if (!this.mConfiguredSurfaceMap.keySet().containsAll(sessionConfig.getSurfaces())) {
                            androidx.camera.core.Logger.e(TAG, "Does not have the proper configured lists");
                            return;
                        } else {
                            androidx.camera.core.Logger.d(TAG, "Attempting to submit CaptureRequest after setting");
                            issueRepeatingCaptureRequests(this.mSessionConfig);
                            break;
                        }
                    } else {
                        return;
                    }
                case CLOSED:
                case RELEASING:
                case RELEASED:
                    throw new java.lang.IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public void setStreamUseCaseMap(java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> map) {
        synchronized (this.mSessionLock) {
            this.mStreamUseCaseMap = map;
        }
    }

    public void stopRepeating() {
        synchronized (this.mSessionLock) {
            if (this.mState != androidx.camera.camera2.internal.CaptureSession.State.OPENED) {
                androidx.camera.core.Logger.e(TAG, "Unable to stop repeating. Incorrect state:" + this.mState);
            } else {
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (android.hardware.camera2.CameraAccessException e17) {
                    androidx.camera.core.Logger.e(TAG, "Unable to stop repeating.", e17);
                }
            }
        }
    }

    public CaptureSession(androidx.camera.camera2.internal.compat.params.DynamicRangesCompat dynamicRangesCompat, boolean z17) {
        this(dynamicRangesCompat, new androidx.camera.core.impl.Quirks(java.util.Collections.emptyList()), z17);
    }

    public CaptureSession(androidx.camera.camera2.internal.compat.params.DynamicRangesCompat dynamicRangesCompat, androidx.camera.core.impl.Quirks quirks) {
        this(dynamicRangesCompat, quirks, false);
    }

    public CaptureSession(androidx.camera.camera2.internal.compat.params.DynamicRangesCompat dynamicRangesCompat, androidx.camera.core.impl.Quirks quirks, boolean z17) {
        this.mSessionLock = new java.lang.Object();
        this.mCaptureConfigs = new java.util.ArrayList();
        this.mConfiguredSurfaceMap = new java.util.HashMap();
        this.mConfiguredDeferrableSurfaces = java.util.Collections.emptyList();
        this.mState = androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED;
        this.mStreamUseCaseMap = new java.util.HashMap();
        this.mStillCaptureFlow = new androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow();
        this.mTorchStateReset = new androidx.camera.camera2.internal.compat.workaround.TorchStateReset();
        this.mState = androidx.camera.camera2.internal.CaptureSession.State.INITIALIZED;
        this.mDynamicRangesCompat = dynamicRangesCompat;
        this.mCaptureSessionStateCallback = new androidx.camera.camera2.internal.CaptureSession.StateCallback();
        this.mRequestMonitor = new androidx.camera.camera2.internal.compat.workaround.RequestMonitor(quirks.contains(androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk.class));
        this.mTemplateParamsOverride = new androidx.camera.camera2.internal.compat.workaround.TemplateParamsOverride(quirks);
        this.mCanUseMultiResolutionImageReader = z17;
    }
}
