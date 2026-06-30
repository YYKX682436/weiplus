package com.tencent.liteav.beauty;

/* loaded from: classes16.dex */
public interface TXBeautyManager {
    public static final int TXBeautyStyleNature = 1;
    public static final int TXBeautyStylePitu = 2;
    public static final int TXBeautyStyleSmooth = 0;

    void enableSharpnessEnhancement(boolean z17);

    void setBeautyLevel(float f17);

    void setBeautyStyle(int i17);

    int setChinLevel(float f17);

    int setEyeAngleLevel(float f17);

    int setEyeDistanceLevel(float f17);

    int setEyeLightenLevel(float f17);

    int setEyeScaleLevel(float f17);

    int setFaceBeautyLevel(float f17);

    int setFaceNarrowLevel(float f17);

    int setFaceShortLevel(float f17);

    int setFaceSlimLevel(float f17);

    int setFaceVLevel(float f17);

    void setFilter(android.graphics.Bitmap bitmap);

    void setFilterStrength(float f17);

    int setForeheadLevel(float f17);

    int setGreenScreenFile(java.lang.String str);

    int setLipsThicknessLevel(float f17);

    void setMotionMute(boolean z17);

    void setMotionTmpl(java.lang.String str);

    int setMouthShapeLevel(float f17);

    int setNosePositionLevel(float f17);

    int setNoseSlimLevel(float f17);

    int setNoseWingLevel(float f17);

    int setPounchRemoveLevel(float f17);

    void setRuddyLevel(float f17);

    int setSmileLinesRemoveLevel(float f17);

    int setToothWhitenLevel(float f17);

    void setWhitenessLevel(float f17);

    int setWrinkleRemoveLevel(float f17);
}
