package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public interface ImageInputConfig extends androidx.camera.core.impl.ReadableConfig {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Integer> OPTION_INPUT_FORMAT = androidx.camera.core.impl.Config.Option.create("camerax.core.imageInput.inputFormat", java.lang.Integer.TYPE);
    public static final androidx.camera.core.impl.Config.Option<androidx.camera.core.DynamicRange> OPTION_INPUT_DYNAMIC_RANGE = androidx.camera.core.impl.Config.Option.create("camerax.core.imageInput.inputDynamicRange", androidx.camera.core.DynamicRange.class);

    /* loaded from: classes14.dex */
    public interface Builder<B> {
        B setDynamicRange(androidx.camera.core.DynamicRange dynamicRange);
    }

    default androidx.camera.core.DynamicRange getDynamicRange() {
        androidx.camera.core.DynamicRange dynamicRange = (androidx.camera.core.DynamicRange) retrieveOption(OPTION_INPUT_DYNAMIC_RANGE, androidx.camera.core.DynamicRange.UNSPECIFIED);
        dynamicRange.getClass();
        return dynamicRange;
    }

    default int getInputFormat() {
        return ((java.lang.Integer) retrieveOption(OPTION_INPUT_FORMAT)).intValue();
    }

    default boolean hasDynamicRange() {
        return containsOption(OPTION_INPUT_DYNAMIC_RANGE);
    }
}
