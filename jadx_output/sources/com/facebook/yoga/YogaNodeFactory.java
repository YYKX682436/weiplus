package com.facebook.yoga;

/* loaded from: classes15.dex */
public abstract class YogaNodeFactory {
    public static com.facebook.yoga.YogaNode create() {
        return new com.facebook.yoga.YogaNodeJNIFinalizer();
    }

    public static com.facebook.yoga.YogaNode create(com.facebook.yoga.YogaConfig yogaConfig) {
        return new com.facebook.yoga.YogaNodeJNIFinalizer(yogaConfig);
    }
}
