package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
class RequestBuilder {
    int mCaptureStageId;
    private java.util.List<java.lang.Integer> mTargetOutputConfigIds = new java.util.ArrayList();
    private java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> mParameters = new java.util.HashMap();
    private int mTemplateId = 1;

    /* loaded from: classes14.dex */
    public static class RequestProcessorRequest implements androidx.camera.core.impl.RequestProcessor.Request {
        final int mCaptureStageId;
        final androidx.camera.core.impl.Config mParameterConfig;
        final java.util.List<java.lang.Integer> mTargetOutputConfigIds;
        final int mTemplateId;

        public RequestProcessorRequest(java.util.List<java.lang.Integer> list, java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> map, int i17, int i18) {
            this.mTargetOutputConfigIds = list;
            this.mTemplateId = i17;
            this.mCaptureStageId = i18;
            androidx.camera.extensions.internal.RequestOptionConfig.Builder builder = new androidx.camera.extensions.internal.RequestOptionConfig.Builder();
            for (android.hardware.camera2.CaptureRequest.Key<?> key : map.keySet()) {
                builder.setCaptureRequestOption(key, map.get(key));
            }
            this.mParameterConfig = builder.build();
        }

        public int getCaptureStageId() {
            return this.mCaptureStageId;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public androidx.camera.core.impl.Config getParameters() {
            return this.mParameterConfig;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public java.util.List<java.lang.Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public int getTemplateId() {
            return this.mTemplateId;
        }
    }

    public androidx.camera.extensions.internal.sessionprocessor.RequestBuilder addTargetOutputConfigIds(int i17) {
        this.mTargetOutputConfigIds.add(java.lang.Integer.valueOf(i17));
        return this;
    }

    public androidx.camera.core.impl.RequestProcessor.Request build() {
        return new androidx.camera.extensions.internal.sessionprocessor.RequestBuilder.RequestProcessorRequest(this.mTargetOutputConfigIds, this.mParameters, this.mTemplateId, this.mCaptureStageId);
    }

    public androidx.camera.extensions.internal.sessionprocessor.RequestBuilder setCaptureStageId(int i17) {
        this.mCaptureStageId = i17;
        return this;
    }

    public androidx.camera.extensions.internal.sessionprocessor.RequestBuilder setParameters(android.hardware.camera2.CaptureRequest.Key<?> key, java.lang.Object obj) {
        this.mParameters.put(key, obj);
        return this;
    }

    public androidx.camera.extensions.internal.sessionprocessor.RequestBuilder setTemplateId(int i17) {
        this.mTemplateId = i17;
        return this;
    }
}
