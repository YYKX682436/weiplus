package com.facebook.yoga;

/* loaded from: classes15.dex */
public class YogaNodeJNIFinalizer extends com.facebook.yoga.YogaNodeJNIBase {
    public YogaNodeJNIFinalizer() {
    }

    public void finalize() {
        try {
            freeNatives();
        } finally {
            super.finalize();
        }
    }

    public void freeNatives() {
        long j17 = this.mNativePointer;
        if (j17 != 0) {
            this.mNativePointer = 0L;
            com.facebook.yoga.YogaNative.jni_YGNodeFreeJNI(j17);
        }
    }

    public YogaNodeJNIFinalizer(com.facebook.yoga.YogaConfig yogaConfig) {
        super(yogaConfig);
    }
}
