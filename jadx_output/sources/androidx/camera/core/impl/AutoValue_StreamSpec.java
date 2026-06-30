package androidx.camera.core.impl;

/* loaded from: classes14.dex */
final class AutoValue_StreamSpec extends androidx.camera.core.impl.StreamSpec {
    private final androidx.camera.core.DynamicRange dynamicRange;
    private final android.util.Range<java.lang.Integer> expectedFrameRateRange;
    private final androidx.camera.core.impl.Config implementationOptions;
    private final android.util.Size resolution;
    private final boolean zslDisabled;

    /* loaded from: classes14.dex */
    public static final class Builder extends androidx.camera.core.impl.StreamSpec.Builder {
        private androidx.camera.core.DynamicRange dynamicRange;
        private android.util.Range<java.lang.Integer> expectedFrameRateRange;
        private androidx.camera.core.impl.Config implementationOptions;
        private android.util.Size resolution;
        private java.lang.Boolean zslDisabled;

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec build() {
            java.lang.String str = this.resolution == null ? " resolution" : "";
            if (this.dynamicRange == null) {
                str = str + " dynamicRange";
            }
            if (this.expectedFrameRateRange == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.zslDisabled == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new androidx.camera.core.impl.AutoValue_StreamSpec(this.resolution, this.dynamicRange, this.expectedFrameRateRange, this.implementationOptions, this.zslDisabled.booleanValue());
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec.Builder setDynamicRange(androidx.camera.core.DynamicRange dynamicRange) {
            if (dynamicRange == null) {
                throw new java.lang.NullPointerException("Null dynamicRange");
            }
            this.dynamicRange = dynamicRange;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec.Builder setExpectedFrameRateRange(android.util.Range<java.lang.Integer> range) {
            if (range == null) {
                throw new java.lang.NullPointerException("Null expectedFrameRateRange");
            }
            this.expectedFrameRateRange = range;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec.Builder setImplementationOptions(androidx.camera.core.impl.Config config) {
            this.implementationOptions = config;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec.Builder setResolution(android.util.Size size) {
            if (size == null) {
                throw new java.lang.NullPointerException("Null resolution");
            }
            this.resolution = size;
            return this;
        }

        @Override // androidx.camera.core.impl.StreamSpec.Builder
        public androidx.camera.core.impl.StreamSpec.Builder setZslDisabled(boolean z17) {
            this.zslDisabled = java.lang.Boolean.valueOf(z17);
            return this;
        }

        public Builder() {
        }

        private Builder(androidx.camera.core.impl.StreamSpec streamSpec) {
            this.resolution = streamSpec.getResolution();
            this.dynamicRange = streamSpec.getDynamicRange();
            this.expectedFrameRateRange = streamSpec.getExpectedFrameRateRange();
            this.implementationOptions = streamSpec.getImplementationOptions();
            this.zslDisabled = java.lang.Boolean.valueOf(streamSpec.getZslDisabled());
        }
    }

    public boolean equals(java.lang.Object obj) {
        androidx.camera.core.impl.Config config;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.StreamSpec)) {
            return false;
        }
        androidx.camera.core.impl.StreamSpec streamSpec = (androidx.camera.core.impl.StreamSpec) obj;
        return this.resolution.equals(streamSpec.getResolution()) && this.dynamicRange.equals(streamSpec.getDynamicRange()) && this.expectedFrameRateRange.equals(streamSpec.getExpectedFrameRateRange()) && ((config = this.implementationOptions) != null ? config.equals(streamSpec.getImplementationOptions()) : streamSpec.getImplementationOptions() == null) && this.zslDisabled == streamSpec.getZslDisabled();
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public androidx.camera.core.DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
        return this.expectedFrameRateRange;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public androidx.camera.core.impl.Config getImplementationOptions() {
        return this.implementationOptions;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public android.util.Size getResolution() {
        return this.resolution;
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public boolean getZslDisabled() {
        return this.zslDisabled;
    }

    public int hashCode() {
        int hashCode = (((((this.resolution.hashCode() ^ 1000003) * 1000003) ^ this.dynamicRange.hashCode()) * 1000003) ^ this.expectedFrameRateRange.hashCode()) * 1000003;
        androidx.camera.core.impl.Config config = this.implementationOptions;
        return ((hashCode ^ (config == null ? 0 : config.hashCode())) * 1000003) ^ (this.zslDisabled ? 1231 : 1237);
    }

    @Override // androidx.camera.core.impl.StreamSpec
    public androidx.camera.core.impl.StreamSpec.Builder toBuilder() {
        return new androidx.camera.core.impl.AutoValue_StreamSpec.Builder(this);
    }

    public java.lang.String toString() {
        return "StreamSpec{resolution=" + this.resolution + ", dynamicRange=" + this.dynamicRange + ", expectedFrameRateRange=" + this.expectedFrameRateRange + ", implementationOptions=" + this.implementationOptions + ", zslDisabled=" + this.zslDisabled + "}";
    }

    private AutoValue_StreamSpec(android.util.Size size, androidx.camera.core.DynamicRange dynamicRange, android.util.Range<java.lang.Integer> range, androidx.camera.core.impl.Config config, boolean z17) {
        this.resolution = size;
        this.dynamicRange = dynamicRange;
        this.expectedFrameRateRange = range;
        this.implementationOptions = config;
        this.zslDisabled = z17;
    }
}
