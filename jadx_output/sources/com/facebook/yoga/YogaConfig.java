package com.facebook.yoga;

/* loaded from: classes15.dex */
public abstract class YogaConfig {
    public static int SPACING_TYPE = 1;

    public abstract com.facebook.yoga.YogaLogger getLogger();

    public abstract long getNativePointer();

    public abstract void setExperimentalFeatureEnabled(com.facebook.yoga.YogaExperimentalFeature yogaExperimentalFeature, boolean z17);

    public abstract void setLogger(com.facebook.yoga.YogaLogger yogaLogger);

    public abstract void setPointScaleFactor(float f17);

    public abstract void setPrintTreeFlag(boolean z17);

    public abstract void setShouldDiffLayoutWithoutLegacyStretchBehaviour(boolean z17);

    public abstract void setUseLegacyStretchBehaviour(boolean z17);

    public abstract void setUseWebDefaults(boolean z17);
}
