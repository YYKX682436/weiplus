package com.facebook.yoga;

/* loaded from: classes15.dex */
public abstract class YogaConfigJNIBase extends com.facebook.yoga.YogaConfig {
    private com.facebook.yoga.YogaLogger mLogger;
    long mNativePointer;

    private YogaConfigJNIBase(long j17) {
        if (j17 != 0) {
            this.mNativePointer = j17;
            return;
        }
        throw new java.lang.IllegalStateException("Failed to allocate native memory");
    }

    @Override // com.facebook.yoga.YogaConfig
    public com.facebook.yoga.YogaLogger getLogger() {
        return this.mLogger;
    }

    @Override // com.facebook.yoga.YogaConfig
    public long getNativePointer() {
        return this.mNativePointer;
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setExperimentalFeatureEnabled(com.facebook.yoga.YogaExperimentalFeature yogaExperimentalFeature, boolean z17) {
        com.facebook.yoga.YogaNative.jni_YGConfigSetExperimentalFeatureEnabledJNI(this.mNativePointer, yogaExperimentalFeature.intValue(), z17);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setLogger(com.facebook.yoga.YogaLogger yogaLogger) {
        this.mLogger = yogaLogger;
        com.facebook.yoga.YogaNative.jni_YGConfigSetLoggerJNI(this.mNativePointer, yogaLogger);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setPointScaleFactor(float f17) {
        com.facebook.yoga.YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setPrintTreeFlag(boolean z17) {
        com.facebook.yoga.YogaNative.jni_YGConfigSetPrintTreeFlagJNI(this.mNativePointer, z17);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setShouldDiffLayoutWithoutLegacyStretchBehaviour(boolean z17) {
        com.facebook.yoga.YogaNative.jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviourJNI(this.mNativePointer, z17);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setUseLegacyStretchBehaviour(boolean z17) {
        com.facebook.yoga.YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.mNativePointer, z17);
    }

    @Override // com.facebook.yoga.YogaConfig
    public void setUseWebDefaults(boolean z17) {
        com.facebook.yoga.YogaNative.jni_YGConfigSetUseWebDefaultsJNI(this.mNativePointer, z17);
    }

    public YogaConfigJNIBase() {
        this(com.facebook.yoga.YogaNative.jni_YGConfigNewJNI());
    }

    public YogaConfigJNIBase(boolean z17) {
        this(com.facebook.yoga.YogaNative.jni_YGConfigNewJNI());
    }
}
