package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class CaptureConfig {
    public static final java.lang.String CAPTURE_CONFIG_ID_TAG_KEY = "CAPTURE_CONFIG_ID_KEY";
    public static final int DEFAULT_ID = -1;
    public static final int TEMPLATE_TYPE_NONE = -1;
    final java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCameraCaptureCallbacks;
    private final androidx.camera.core.impl.CameraCaptureResult mCameraCaptureResult;
    final androidx.camera.core.impl.Config mImplementationOptions;
    final boolean mPostviewEnabled;
    final java.util.List<androidx.camera.core.impl.DeferrableSurface> mSurfaces;
    private final androidx.camera.core.impl.TagBundle mTagBundle;
    final int mTemplateType;
    private final boolean mUseRepeatingSurface;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_ROTATION = androidx.camera.core.impl.Config.Option.create("camerax.core.captureConfig.rotation", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_JPEG_QUALITY = androidx.camera.core.impl.Config.Option.create("camerax.core.captureConfig.jpegQuality", java.lang.Integer.class);
    private static final androidx.camera.core.impl.Config.Option<android.util.Range<java.lang.Integer>> OPTION_RESOLVED_FRAME_RATE = androidx.camera.core.impl.Config.Option.create("camerax.core.captureConfig.resolvedFrameRate", android.util.Range.class);

    /* loaded from: classes14.dex */
    public interface OptionUnpacker {
        void unpack(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig, androidx.camera.core.impl.CaptureConfig.Builder builder);
    }

    public CaptureConfig(java.util.List<androidx.camera.core.impl.DeferrableSurface> list, androidx.camera.core.impl.Config config, int i17, boolean z17, java.util.List<androidx.camera.core.impl.CameraCaptureCallback> list2, boolean z18, androidx.camera.core.impl.TagBundle tagBundle, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        this.mSurfaces = list;
        this.mImplementationOptions = config;
        this.mTemplateType = i17;
        this.mCameraCaptureCallbacks = java.util.Collections.unmodifiableList(list2);
        this.mUseRepeatingSurface = z18;
        this.mTagBundle = tagBundle;
        this.mCameraCaptureResult = cameraCaptureResult;
        this.mPostviewEnabled = z17;
    }

    public static androidx.camera.core.impl.CaptureConfig defaultEmptyCaptureConfig() {
        return new androidx.camera.core.impl.CaptureConfig.Builder().build();
    }

    public java.util.List<androidx.camera.core.impl.CameraCaptureCallback> getCameraCaptureCallbacks() {
        return this.mCameraCaptureCallbacks;
    }

    public androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
        return this.mCameraCaptureResult;
    }

    public android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
        android.util.Range<java.lang.Integer> range = (android.util.Range) this.mImplementationOptions.retrieveOption(OPTION_RESOLVED_FRAME_RATE, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        java.util.Objects.requireNonNull(range);
        return range;
    }

    public int getId() {
        java.lang.Object tag = this.mTagBundle.getTag(CAPTURE_CONFIG_ID_TAG_KEY);
        if (tag == null) {
            return -1;
        }
        return ((java.lang.Integer) tag).intValue();
    }

    public androidx.camera.core.impl.Config getImplementationOptions() {
        return this.mImplementationOptions;
    }

    public int getPreviewStabilizationMode() {
        java.lang.Integer num = (java.lang.Integer) this.mImplementationOptions.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, 0);
        java.util.Objects.requireNonNull(num);
        return num.intValue();
    }

    public java.util.List<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
        return java.util.Collections.unmodifiableList(this.mSurfaces);
    }

    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.mTagBundle;
    }

    public int getTemplateType() {
        return this.mTemplateType;
    }

    public int getVideoStabilizationMode() {
        java.lang.Integer num = (java.lang.Integer) this.mImplementationOptions.retrieveOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, 0);
        java.util.Objects.requireNonNull(num);
        return num.intValue();
    }

    public boolean isPostviewEnabled() {
        return this.mPostviewEnabled;
    }

    public boolean isUseRepeatingSurface() {
        return this.mUseRepeatingSurface;
    }

    /* loaded from: classes14.dex */
    public static final class Builder {
        private java.util.List<androidx.camera.core.impl.CameraCaptureCallback> mCameraCaptureCallbacks;
        private androidx.camera.core.impl.CameraCaptureResult mCameraCaptureResult;
        private androidx.camera.core.impl.MutableConfig mImplementationOptions;
        private androidx.camera.core.impl.MutableTagBundle mMutableTagBundle;
        private boolean mPostviewEnabled;
        private final java.util.Set<androidx.camera.core.impl.DeferrableSurface> mSurfaces;
        private int mTemplateType;
        private boolean mUseRepeatingSurface;

        public Builder() {
            this.mSurfaces = new java.util.HashSet();
            this.mImplementationOptions = androidx.camera.core.impl.MutableOptionsBundle.create();
            this.mTemplateType = -1;
            this.mPostviewEnabled = false;
            this.mCameraCaptureCallbacks = new java.util.ArrayList();
            this.mUseRepeatingSurface = false;
            this.mMutableTagBundle = androidx.camera.core.impl.MutableTagBundle.create();
        }

        public static androidx.camera.core.impl.CaptureConfig.Builder createFrom(androidx.camera.core.impl.UseCaseConfig<?> useCaseConfig) {
            androidx.camera.core.impl.CaptureConfig.OptionUnpacker captureOptionUnpacker = useCaseConfig.getCaptureOptionUnpacker(null);
            if (captureOptionUnpacker != null) {
                androidx.camera.core.impl.CaptureConfig.Builder builder = new androidx.camera.core.impl.CaptureConfig.Builder();
                captureOptionUnpacker.unpack(useCaseConfig, builder);
                return builder;
            }
            throw new java.lang.IllegalStateException("Implementation is missing option unpacker for " + useCaseConfig.getTargetName(useCaseConfig.toString()));
        }

        public static androidx.camera.core.impl.CaptureConfig.Builder from(androidx.camera.core.impl.CaptureConfig captureConfig) {
            return new androidx.camera.core.impl.CaptureConfig.Builder(captureConfig);
        }

        public void addAllCameraCaptureCallbacks(java.util.Collection<androidx.camera.core.impl.CameraCaptureCallback> collection) {
            java.util.Iterator<androidx.camera.core.impl.CameraCaptureCallback> it = collection.iterator();
            while (it.hasNext()) {
                addCameraCaptureCallback(it.next());
            }
        }

        public void addAllTags(androidx.camera.core.impl.TagBundle tagBundle) {
            this.mMutableTagBundle.addTagBundle(tagBundle);
        }

        public void addCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            if (this.mCameraCaptureCallbacks.contains(cameraCaptureCallback)) {
                return;
            }
            this.mCameraCaptureCallbacks.add(cameraCaptureCallback);
        }

        public <T> void addImplementationOption(androidx.camera.core.impl.Config.Option<T> option, T t17) {
            this.mImplementationOptions.insertOption(option, t17);
        }

        public void addImplementationOptions(androidx.camera.core.impl.Config config) {
            for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
                java.lang.Object retrieveOption = this.mImplementationOptions.retrieveOption(option, null);
                java.lang.Object retrieveOption2 = config.retrieveOption(option);
                if (retrieveOption instanceof androidx.camera.core.impl.MultiValueSet) {
                    ((androidx.camera.core.impl.MultiValueSet) retrieveOption).addAll(((androidx.camera.core.impl.MultiValueSet) retrieveOption2).getAllItems());
                } else {
                    if (retrieveOption2 instanceof androidx.camera.core.impl.MultiValueSet) {
                        retrieveOption2 = ((androidx.camera.core.impl.MultiValueSet) retrieveOption2).m2clone();
                    }
                    this.mImplementationOptions.insertOption(option, config.getOptionPriority(option), retrieveOption2);
                }
            }
        }

        public void addSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            this.mSurfaces.add(deferrableSurface);
        }

        public void addTag(java.lang.String str, java.lang.Object obj) {
            this.mMutableTagBundle.putTag(str, obj);
        }

        public androidx.camera.core.impl.CaptureConfig build() {
            return new androidx.camera.core.impl.CaptureConfig(new java.util.ArrayList(this.mSurfaces), androidx.camera.core.impl.OptionsBundle.from(this.mImplementationOptions), this.mTemplateType, this.mPostviewEnabled, new java.util.ArrayList(this.mCameraCaptureCallbacks), this.mUseRepeatingSurface, androidx.camera.core.impl.TagBundle.from(this.mMutableTagBundle), this.mCameraCaptureResult);
        }

        public void clearSurfaces() {
            this.mSurfaces.clear();
        }

        public android.util.Range<java.lang.Integer> getExpectedFrameRateRange() {
            return (android.util.Range) this.mImplementationOptions.retrieveOption(androidx.camera.core.impl.CaptureConfig.OPTION_RESOLVED_FRAME_RATE, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED);
        }

        public androidx.camera.core.impl.Config getImplementationOptions() {
            return this.mImplementationOptions;
        }

        public java.util.Set<androidx.camera.core.impl.DeferrableSurface> getSurfaces() {
            return this.mSurfaces;
        }

        public java.lang.Object getTag(java.lang.String str) {
            return this.mMutableTagBundle.getTag(str);
        }

        public int getTemplateType() {
            return this.mTemplateType;
        }

        public boolean isUseRepeatingSurface() {
            return this.mUseRepeatingSurface;
        }

        public boolean removeCameraCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
            return this.mCameraCaptureCallbacks.remove(cameraCaptureCallback);
        }

        public void removeSurface(androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            this.mSurfaces.remove(deferrableSurface);
        }

        public void setCameraCaptureResult(androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
            this.mCameraCaptureResult = cameraCaptureResult;
        }

        public void setExpectedFrameRateRange(android.util.Range<java.lang.Integer> range) {
            addImplementationOption(androidx.camera.core.impl.CaptureConfig.OPTION_RESOLVED_FRAME_RATE, range);
        }

        public void setId(int i17) {
            this.mMutableTagBundle.putTag(androidx.camera.core.impl.CaptureConfig.CAPTURE_CONFIG_ID_TAG_KEY, java.lang.Integer.valueOf(i17));
        }

        public void setImplementationOptions(androidx.camera.core.impl.Config config) {
            this.mImplementationOptions = androidx.camera.core.impl.MutableOptionsBundle.from(config);
        }

        public void setPostviewEnabled(boolean z17) {
            this.mPostviewEnabled = z17;
        }

        public void setPreviewStabilization(int i17) {
            if (i17 != 0) {
                addImplementationOption(androidx.camera.core.impl.UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, java.lang.Integer.valueOf(i17));
            }
        }

        public void setTemplateType(int i17) {
            this.mTemplateType = i17;
        }

        public void setUseRepeatingSurface(boolean z17) {
            this.mUseRepeatingSurface = z17;
        }

        public void setVideoStabilization(int i17) {
            if (i17 != 0) {
                addImplementationOption(androidx.camera.core.impl.UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, java.lang.Integer.valueOf(i17));
            }
        }

        private Builder(androidx.camera.core.impl.CaptureConfig captureConfig) {
            java.util.HashSet hashSet = new java.util.HashSet();
            this.mSurfaces = hashSet;
            this.mImplementationOptions = androidx.camera.core.impl.MutableOptionsBundle.create();
            this.mTemplateType = -1;
            this.mPostviewEnabled = false;
            this.mCameraCaptureCallbacks = new java.util.ArrayList();
            this.mUseRepeatingSurface = false;
            this.mMutableTagBundle = androidx.camera.core.impl.MutableTagBundle.create();
            hashSet.addAll(captureConfig.mSurfaces);
            this.mImplementationOptions = androidx.camera.core.impl.MutableOptionsBundle.from(captureConfig.mImplementationOptions);
            this.mTemplateType = captureConfig.mTemplateType;
            this.mCameraCaptureCallbacks.addAll(captureConfig.getCameraCaptureCallbacks());
            this.mUseRepeatingSurface = captureConfig.isUseRepeatingSurface();
            this.mMutableTagBundle = androidx.camera.core.impl.MutableTagBundle.from(captureConfig.getTagBundle());
            this.mPostviewEnabled = captureConfig.mPostviewEnabled;
        }
    }
}
