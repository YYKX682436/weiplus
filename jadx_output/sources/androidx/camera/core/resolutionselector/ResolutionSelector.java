package androidx.camera.core.resolutionselector;

/* loaded from: classes14.dex */
public final class ResolutionSelector {
    public static final int PREFER_CAPTURE_RATE_OVER_HIGHER_RESOLUTION = 0;
    public static final int PREFER_HIGHER_RESOLUTION_OVER_CAPTURE_RATE = 1;
    private final int mAllowedResolutionMode;
    private final androidx.camera.core.resolutionselector.AspectRatioStrategy mAspectRatioStrategy;
    private final androidx.camera.core.resolutionselector.ResolutionFilter mResolutionFilter;
    private final androidx.camera.core.resolutionselector.ResolutionStrategy mResolutionStrategy;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface AllowedResolutionMode {
    }

    public ResolutionSelector(androidx.camera.core.resolutionselector.AspectRatioStrategy aspectRatioStrategy, androidx.camera.core.resolutionselector.ResolutionStrategy resolutionStrategy, androidx.camera.core.resolutionselector.ResolutionFilter resolutionFilter, int i17) {
        this.mAspectRatioStrategy = aspectRatioStrategy;
        this.mResolutionStrategy = resolutionStrategy;
        this.mResolutionFilter = resolutionFilter;
        this.mAllowedResolutionMode = i17;
    }

    public int getAllowedResolutionMode() {
        return this.mAllowedResolutionMode;
    }

    public androidx.camera.core.resolutionselector.AspectRatioStrategy getAspectRatioStrategy() {
        return this.mAspectRatioStrategy;
    }

    public androidx.camera.core.resolutionselector.ResolutionFilter getResolutionFilter() {
        return this.mResolutionFilter;
    }

    public androidx.camera.core.resolutionselector.ResolutionStrategy getResolutionStrategy() {
        return this.mResolutionStrategy;
    }

    /* loaded from: classes14.dex */
    public static final class Builder {
        private int mAllowedResolutionMode;
        private androidx.camera.core.resolutionselector.AspectRatioStrategy mAspectRatioStrategy;
        private androidx.camera.core.resolutionselector.ResolutionFilter mResolutionFilter;
        private androidx.camera.core.resolutionselector.ResolutionStrategy mResolutionStrategy;

        public Builder() {
            this.mAspectRatioStrategy = androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY;
            this.mResolutionStrategy = null;
            this.mResolutionFilter = null;
            this.mAllowedResolutionMode = 0;
        }

        public static androidx.camera.core.resolutionselector.ResolutionSelector.Builder fromResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            return new androidx.camera.core.resolutionselector.ResolutionSelector.Builder(resolutionSelector);
        }

        public androidx.camera.core.resolutionselector.ResolutionSelector build() {
            return new androidx.camera.core.resolutionselector.ResolutionSelector(this.mAspectRatioStrategy, this.mResolutionStrategy, this.mResolutionFilter, this.mAllowedResolutionMode);
        }

        public androidx.camera.core.resolutionselector.ResolutionSelector.Builder setAllowedResolutionMode(int i17) {
            this.mAllowedResolutionMode = i17;
            return this;
        }

        public androidx.camera.core.resolutionselector.ResolutionSelector.Builder setAspectRatioStrategy(androidx.camera.core.resolutionselector.AspectRatioStrategy aspectRatioStrategy) {
            this.mAspectRatioStrategy = aspectRatioStrategy;
            return this;
        }

        public androidx.camera.core.resolutionselector.ResolutionSelector.Builder setResolutionFilter(androidx.camera.core.resolutionselector.ResolutionFilter resolutionFilter) {
            this.mResolutionFilter = resolutionFilter;
            return this;
        }

        public androidx.camera.core.resolutionselector.ResolutionSelector.Builder setResolutionStrategy(androidx.camera.core.resolutionselector.ResolutionStrategy resolutionStrategy) {
            this.mResolutionStrategy = resolutionStrategy;
            return this;
        }

        private Builder(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
            this.mAspectRatioStrategy = androidx.camera.core.resolutionselector.AspectRatioStrategy.RATIO_4_3_FALLBACK_AUTO_STRATEGY;
            this.mResolutionStrategy = null;
            this.mResolutionFilter = null;
            this.mAllowedResolutionMode = 0;
            this.mAspectRatioStrategy = resolutionSelector.getAspectRatioStrategy();
            this.mResolutionStrategy = resolutionSelector.getResolutionStrategy();
            this.mResolutionFilter = resolutionSelector.getResolutionFilter();
            this.mAllowedResolutionMode = resolutionSelector.getAllowedResolutionMode();
        }
    }
}
