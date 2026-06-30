package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class UseCaseAttachState {
    private static final java.lang.String TAG = "UseCaseAttachState";
    private final java.util.Map<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> mAttachedUseCasesToInfoMap = new java.util.LinkedHashMap();
    private final java.lang.String mCameraId;

    /* loaded from: classes14.dex */
    public interface AttachStateFilter {
        boolean filter(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo);
    }

    /* loaded from: classes14.dex */
    public static final class UseCaseAttachInfo {
        private final java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> mCaptureTypes;
        private final androidx.camera.core.impl.SessionConfig mSessionConfig;
        private final androidx.camera.core.impl.StreamSpec mStreamSpec;
        private final androidx.camera.core.impl.UseCaseConfig<?> mUseCaseConfig;
        private boolean mAttached = false;
        private boolean mActive = false;

        public UseCaseAttachInfo(androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
            this.mSessionConfig = sessionConfig;
            this.mUseCaseConfig = useCaseConfig;
            this.mStreamSpec = streamSpec;
            this.mCaptureTypes = list;
        }

        public boolean getActive() {
            return this.mActive;
        }

        public boolean getAttached() {
            return this.mAttached;
        }

        public java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes() {
            return this.mCaptureTypes;
        }

        public androidx.camera.core.impl.SessionConfig getSessionConfig() {
            return this.mSessionConfig;
        }

        public androidx.camera.core.impl.StreamSpec getStreamSpec() {
            return this.mStreamSpec;
        }

        public androidx.camera.core.impl.UseCaseConfig<?> getUseCaseConfig() {
            return this.mUseCaseConfig;
        }

        public void setActive(boolean z17) {
            this.mActive = z17;
        }

        public void setAttached(boolean z17) {
            this.mAttached = z17;
        }

        public java.lang.String toString() {
            return "UseCaseAttachInfo{mSessionConfig=" + this.mSessionConfig + ", mUseCaseConfig=" + this.mUseCaseConfig + ", mStreamSpec=" + this.mStreamSpec + ", mCaptureTypes=" + this.mCaptureTypes + ", mAttached=" + this.mAttached + ", mActive=" + this.mActive + '}';
        }
    }

    public UseCaseAttachState(java.lang.String str) {
        this.mCameraId = str;
    }

    private androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo getOrCreateUseCaseAttachInfo(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
        if (useCaseAttachInfo != null) {
            return useCaseAttachInfo;
        }
        androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo2 = new androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo(sessionConfig, useCaseConfig, streamSpec, list);
        this.mAttachedUseCasesToInfoMap.put(str, useCaseAttachInfo2);
        return useCaseAttachInfo2;
    }

    private java.util.Collection<androidx.camera.core.impl.SessionConfig> getSessionConfigs(androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter attachStateFilter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue().getSessionConfig());
            }
        }
        return arrayList;
    }

    private java.util.Collection<androidx.camera.core.impl.UseCaseConfig<?>> getUseCaseConfigs(androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter attachStateFilter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue().getUseCaseConfig());
            }
        }
        return arrayList;
    }

    private java.util.Collection<androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> getUseCaseInfo(androidx.camera.core.impl.UseCaseAttachState.AttachStateFilter attachStateFilter) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.filter(entry.getValue())) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getActiveAndAttachedSessionConfigs$3(androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo) {
        return useCaseAttachInfo.getActive() && useCaseAttachInfo.getAttached();
    }

    public androidx.camera.core.impl.SessionConfig.ValidatingBuilder getActiveAndAttachedBuilder() {
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo value = entry.getValue();
            if (value.getActive() && value.getAttached()) {
                java.lang.String key = entry.getKey();
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(key);
            }
        }
        androidx.camera.core.Logger.d(TAG, "Active and attached use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    public java.util.Collection<androidx.camera.core.impl.SessionConfig> getActiveAndAttachedSessionConfigs() {
        return java.util.Collections.unmodifiableCollection(getSessionConfigs(new androidx.camera.core.impl.UseCaseAttachState$$d()));
    }

    public androidx.camera.core.impl.SessionConfig.ValidatingBuilder getAttachedBuilder() {
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> entry : this.mAttachedUseCasesToInfoMap.entrySet()) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo value = entry.getValue();
            if (value.getAttached()) {
                validatingBuilder.add(value.getSessionConfig());
                arrayList.add(entry.getKey());
            }
        }
        androidx.camera.core.Logger.d(TAG, "All use case: " + arrayList + " for camera: " + this.mCameraId);
        return validatingBuilder;
    }

    public java.util.Collection<androidx.camera.core.impl.SessionConfig> getAttachedSessionConfigs() {
        return java.util.Collections.unmodifiableCollection(getSessionConfigs(new androidx.camera.core.impl.UseCaseAttachState$$a()));
    }

    public java.util.Collection<androidx.camera.core.impl.UseCaseConfig<?>> getAttachedUseCaseConfigs() {
        return java.util.Collections.unmodifiableCollection(getUseCaseConfigs(new androidx.camera.core.impl.UseCaseAttachState$$c()));
    }

    public java.util.Collection<androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo> getAttachedUseCaseInfo() {
        return java.util.Collections.unmodifiableCollection(getUseCaseInfo(new androidx.camera.core.impl.UseCaseAttachState$$b()));
    }

    public boolean isUseCaseAttached(java.lang.String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            return this.mAttachedUseCasesToInfoMap.get(str).getAttached();
        }
        return false;
    }

    public void removeUseCase(java.lang.String str) {
        this.mAttachedUseCasesToInfoMap.remove(str);
    }

    public void setUseCaseActive(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        getOrCreateUseCaseAttachInfo(str, sessionConfig, useCaseConfig, streamSpec, list).setActive(true);
    }

    public void setUseCaseAttached(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        getOrCreateUseCaseAttachInfo(str, sessionConfig, useCaseConfig, streamSpec, list).setAttached(true);
        updateUseCase(str, sessionConfig, useCaseConfig, streamSpec, list);
    }

    public void setUseCaseDetached(java.lang.String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setAttached(false);
            if (useCaseAttachInfo.getActive()) {
                return;
            }
            this.mAttachedUseCasesToInfoMap.remove(str);
        }
    }

    public void setUseCaseInactive(java.lang.String str) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setActive(false);
            if (useCaseAttachInfo.getAttached()) {
                return;
            }
            this.mAttachedUseCasesToInfoMap.remove(str);
        }
    }

    public void updateUseCase(java.lang.String str, androidx.camera.core.impl.SessionConfig sessionConfig, androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.StreamSpec streamSpec, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(str)) {
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = new androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo(sessionConfig, useCaseConfig, streamSpec, list);
            androidx.camera.core.impl.UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo2 = this.mAttachedUseCasesToInfoMap.get(str);
            useCaseAttachInfo.setAttached(useCaseAttachInfo2.getAttached());
            useCaseAttachInfo.setActive(useCaseAttachInfo2.getActive());
            this.mAttachedUseCasesToInfoMap.put(str, useCaseAttachInfo);
        }
    }
}
