package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface ImageOutputConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final int INVALID_ROTATION = -1;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_APP_TARGET_ROTATION;
    public static final androidx.camera.core.impl.Config.Option<java.util.List<android.util.Size>> OPTION_CUSTOM_ORDERED_RESOLUTIONS;
    public static final androidx.camera.core.impl.Config.Option<android.util.Size> OPTION_DEFAULT_RESOLUTION;
    public static final androidx.camera.core.impl.Config.Option<android.util.Size> OPTION_MAX_RESOLUTION;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_MIRROR_MODE;
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.resolutionselector.ResolutionSelector> OPTION_RESOLUTION_SELECTOR;
    public static final androidx.camera.core.impl.Config.Option<java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>>> OPTION_SUPPORTED_RESOLUTIONS;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_TARGET_ASPECT_RATIO = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.targetAspectRatio", androidx.camera.core.AspectRatio.class);
    public static final androidx.camera.core.impl.Config.Option<android.util.Size> OPTION_TARGET_RESOLUTION;
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_TARGET_ROTATION;
    public static final int ROTATION_NOT_SPECIFIED = -1;

    /* loaded from: classes14.dex */
    public interface Builder<B> {
        B setCustomOrderedResolutions(java.util.List<android.util.Size> list);

        B setDefaultResolution(android.util.Size size);

        B setMaxResolution(android.util.Size size);

        B setMirrorMode(int i17);

        B setResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector);

        B setSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list);

        B setTargetAspectRatio(int i17);

        B setTargetResolution(android.util.Size size);

        B setTargetRotation(int i17);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface OptionalRotationValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface RotationDegreesValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface RotationValue {
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        OPTION_TARGET_ROTATION = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.targetRotation", cls);
        OPTION_APP_TARGET_ROTATION = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.appTargetRotation", cls);
        OPTION_MIRROR_MODE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.mirrorMode", cls);
        OPTION_TARGET_RESOLUTION = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.targetResolution", android.util.Size.class);
        OPTION_DEFAULT_RESOLUTION = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.defaultResolution", android.util.Size.class);
        OPTION_MAX_RESOLUTION = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.maxResolution", android.util.Size.class);
        OPTION_SUPPORTED_RESOLUTIONS = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.supportedResolutions", java.util.List.class);
        OPTION_RESOLUTION_SELECTOR = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.resolutionSelector", androidx.camera.core.resolutionselector.ResolutionSelector.class);
        OPTION_CUSTOM_ORDERED_RESOLUTIONS = androidx.camera.core.impl.Config.Option.create("camerax.core.imageOutput.customOrderedResolutions", java.util.List.class);
    }

    static void validateConfig(androidx.camera.core.impl.ImageOutputConfig imageOutputConfig) {
        boolean hasTargetAspectRatio = imageOutputConfig.hasTargetAspectRatio();
        boolean z17 = imageOutputConfig.getTargetResolution(null) != null;
        if (hasTargetAspectRatio && z17) {
            throw new java.lang.IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (imageOutputConfig.getResolutionSelector(null) != null) {
            if (hasTargetAspectRatio || z17) {
                throw new java.lang.IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int getAppTargetRotation(int i17) {
        return ((java.lang.Integer) retrieveOption(OPTION_APP_TARGET_ROTATION, java.lang.Integer.valueOf(i17))).intValue();
    }

    default java.util.List<android.util.Size> getCustomOrderedResolutions(java.util.List<android.util.Size> list) {
        java.util.List list2 = (java.util.List) retrieveOption(OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
        if (list2 != null) {
            return new java.util.ArrayList(list2);
        }
        return null;
    }

    default android.util.Size getDefaultResolution(android.util.Size size) {
        return (android.util.Size) retrieveOption(OPTION_DEFAULT_RESOLUTION, size);
    }

    default android.util.Size getMaxResolution(android.util.Size size) {
        return (android.util.Size) retrieveOption(OPTION_MAX_RESOLUTION, size);
    }

    default int getMirrorMode(int i17) {
        return ((java.lang.Integer) retrieveOption(OPTION_MIRROR_MODE, java.lang.Integer.valueOf(i17))).intValue();
    }

    default androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector(androidx.camera.core.resolutionselector.ResolutionSelector resolutionSelector) {
        return (androidx.camera.core.resolutionselector.ResolutionSelector) retrieveOption(OPTION_RESOLUTION_SELECTOR, resolutionSelector);
    }

    default java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedResolutions(java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> list) {
        return (java.util.List) retrieveOption(OPTION_SUPPORTED_RESOLUTIONS, list);
    }

    default int getTargetAspectRatio() {
        return ((java.lang.Integer) retrieveOption(OPTION_TARGET_ASPECT_RATIO)).intValue();
    }

    default android.util.Size getTargetResolution(android.util.Size size) {
        return (android.util.Size) retrieveOption(OPTION_TARGET_RESOLUTION, size);
    }

    default int getTargetRotation(int i17) {
        return ((java.lang.Integer) retrieveOption(OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(i17))).intValue();
    }

    default boolean hasTargetAspectRatio() {
        return containsOption(OPTION_TARGET_ASPECT_RATIO);
    }

    default android.util.Size getDefaultResolution() {
        return (android.util.Size) retrieveOption(OPTION_DEFAULT_RESOLUTION);
    }

    default android.util.Size getMaxResolution() {
        return (android.util.Size) retrieveOption(OPTION_MAX_RESOLUTION);
    }

    default androidx.camera.core.resolutionselector.ResolutionSelector getResolutionSelector() {
        return (androidx.camera.core.resolutionselector.ResolutionSelector) retrieveOption(OPTION_RESOLUTION_SELECTOR);
    }

    default java.util.List<android.util.Pair<java.lang.Integer, android.util.Size[]>> getSupportedResolutions() {
        return (java.util.List) retrieveOption(OPTION_SUPPORTED_RESOLUTIONS);
    }

    default android.util.Size getTargetResolution() {
        return (android.util.Size) retrieveOption(OPTION_TARGET_RESOLUTION);
    }

    default int getTargetRotation() {
        return ((java.lang.Integer) retrieveOption(OPTION_TARGET_ROTATION)).intValue();
    }

    default java.util.List<android.util.Size> getCustomOrderedResolutions() {
        java.util.List list = (java.util.List) retrieveOption(OPTION_CUSTOM_ORDERED_RESOLUTIONS);
        java.util.Objects.requireNonNull(list);
        return new java.util.ArrayList(list);
    }
}
