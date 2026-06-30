package com.facebook.yoga;

/* loaded from: classes15.dex */
public class YogaConfigJNIFinalizer extends com.facebook.yoga.YogaConfigJNIBase {
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
            com.facebook.yoga.YogaNative.jni_YGConfigFreeJNI(j17);
        }
    }
}
