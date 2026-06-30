package com.tencent.liteav.beauty;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::manager")
/* loaded from: classes16.dex */
public class TXBeautyManagerImpl implements com.tencent.liteav.beauty.TXBeautyManager {
    private long mNativeBeautyManager;

    public TXBeautyManagerImpl(long j17) {
        this.mNativeBeautyManager = j17;
    }

    private static native void nativeDestroy(long j17);

    private static native void nativeEnableSharpnessEnhancement(long j17, boolean z17);

    private static native void nativeSetBeautyLevel(long j17, float f17);

    private static native void nativeSetBeautyStyle(long j17, int i17);

    private static native int nativeSetChinLevel(long j17, float f17);

    private static native int nativeSetEyeAngleLevel(long j17, float f17);

    private static native int nativeSetEyeDistanceLevel(long j17, float f17);

    private static native int nativeSetEyeLightenLevel(long j17, float f17);

    private static native int nativeSetEyeScaleLevel(long j17, float f17);

    private static native int nativeSetFaceBeautyLevel(long j17, float f17);

    private static native int nativeSetFaceNarrowLevel(long j17, float f17);

    private static native int nativeSetFaceShortLevel(long j17, float f17);

    private static native int nativeSetFaceSlimLevel(long j17, float f17);

    private static native int nativeSetFaceVLevel(long j17, float f17);

    private static native void nativeSetFilter(long j17, android.graphics.Bitmap bitmap);

    private static native void nativeSetFilterStrength(long j17, float f17);

    private static native int nativeSetForeheadLevel(long j17, float f17);

    private static native int nativeSetGreenScreenFile(long j17, java.lang.String str);

    private static native int nativeSetLipsThicknessLevel(long j17, float f17);

    private static native void nativeSetMotionMute(long j17, boolean z17);

    private static native void nativeSetMotionTmpl(long j17, java.lang.String str);

    private static native int nativeSetMouthShapeLevel(long j17, float f17);

    private static native int nativeSetNosePositionLevel(long j17, float f17);

    private static native int nativeSetNoseSlimLevel(long j17, float f17);

    private static native int nativeSetNoseWingLevel(long j17, float f17);

    private static native int nativeSetPounchRemoveLevel(long j17, float f17);

    private static native void nativeSetRuddyLevel(long j17, float f17);

    private static native int nativeSetSmileLinesRemoveLevel(long j17, float f17);

    private static native int nativeSetToothWhitenLevel(long j17, float f17);

    private static native void nativeSetWhitenessLevel(long j17, float f17);

    private static native int nativeSetWrinkleRemoveLevel(long j17, float f17);

    public void clear() {
        this.mNativeBeautyManager = 0L;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void enableSharpnessEnhancement(boolean z17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeEnableSharpnessEnhancement(j17, z17);
        }
    }

    public void finalize() {
        super.finalize();
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeDestroy(j17);
            this.mNativeBeautyManager = 0L;
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeSetBeautyLevel(j17, f17);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyStyle(int i17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeSetBeautyStyle(j17, i17);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setChinLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetChinLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeAngleLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetEyeAngleLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeDistanceLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetEyeDistanceLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeLightenLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetEyeLightenLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeScaleLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetEyeScaleLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceBeautyLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetFaceBeautyLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceNarrowLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetFaceNarrowLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceShortLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetFaceShortLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceSlimLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetFaceSlimLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceVLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetFaceVLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilter(android.graphics.Bitmap bitmap) {
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeSetFilter(j17, bitmap);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilterStrength(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeSetFilterStrength(j17, f17);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setForeheadLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetForeheadLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setGreenScreenFile(java.lang.String str) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetGreenScreenFile(j17, str);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setLipsThicknessLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetLipsThicknessLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionMute(boolean z17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeSetMotionMute(j17, z17);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionTmpl(java.lang.String str) {
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeSetMotionTmpl(j17, str);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setMouthShapeLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetMouthShapeLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNosePositionLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetNosePositionLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseSlimLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetNoseSlimLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseWingLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetNoseWingLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setPounchRemoveLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetPounchRemoveLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setRuddyLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeSetRuddyLevel(j17, f17);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setSmileLinesRemoveLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetSmileLinesRemoveLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setToothWhitenLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetToothWhitenLevel(j17, f17);
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWhitenessLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 != 0) {
            nativeSetWhitenessLevel(j17, f17);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setWrinkleRemoveLevel(float f17) {
        long j17 = this.mNativeBeautyManager;
        if (j17 == 0) {
            return 0;
        }
        nativeSetWrinkleRemoveLevel(j17, f17);
        return 0;
    }
}
