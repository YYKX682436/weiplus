package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
class Camera2SessionConfigBuilder {
    private int mSessionTemplateId = 1;
    private int mSessionType = 0;
    private java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mSessionParameters = new java.util.HashMap();
    private java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> mCamera2OutputConfigs = new java.util.ArrayList();

    /* loaded from: classes14.dex */
    public static class SessionConfigImpl implements androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig {
        private final java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> mCamera2OutputConfigs;
        private final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mSessionParameters;
        private final int mSessionTemplateId;
        private final int mSessionType;

        public SessionConfigImpl(int i17, int i18, java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> map, java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> list) {
            this.mSessionTemplateId = i17;
            this.mSessionType = i18;
            this.mSessionParameters = map;
            this.mCamera2OutputConfigs = list;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        public java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> getOutputConfigs() {
            return this.mCamera2OutputConfigs;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        public java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getSessionParameters() {
            return this.mSessionParameters;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        public int getSessionTemplateId() {
            return this.mSessionTemplateId;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        public int getSessionType() {
            return this.mSessionType;
        }
    }

    public androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder addOutputConfig(androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig camera2OutputConfig) {
        this.mCamera2OutputConfigs.add(camera2OutputConfig);
        return this;
    }

    public androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder addSessionParameter(android.hardware.camera2.CaptureRequest.Key key, java.lang.Object obj) {
        this.mSessionParameters.put(key, obj);
        return this;
    }

    public androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig build() {
        return new androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder.SessionConfigImpl(this.mSessionTemplateId, this.mSessionType, this.mSessionParameters, this.mCamera2OutputConfigs);
    }

    public java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> getCamera2OutputConfigs() {
        return this.mCamera2OutputConfigs;
    }

    public java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getSessionParameters() {
        return this.mSessionParameters;
    }

    public int getSessionTemplateId() {
        return this.mSessionTemplateId;
    }

    public androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder setSessionTemplateId(int i17) {
        this.mSessionTemplateId = i17;
        return this;
    }

    public androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfigBuilder setSessionType(int i17) {
        this.mSessionType = i17;
        return this;
    }
}
