package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class MJBeautyAdjustmentDesc {
    private float browDistance;
    private float browPeak;
    private float browThickness;
    private float cheekShrinkage;
    private float cheekboneShrinkage;
    private float clarity;
    private float contouringRate;
    private float darkCircleReduction;
    private float eyeBrightness;
    private float eyeDistanceFactor;
    private float eyeEnhancement;
    private float eyelidDownStrength;
    private float faceSlimness;
    private float headShrinkage;
    private float innerEyeCorner;
    private boolean isBeautyEnabled = false;
    private float jawShrinkage;
    private float lipShape;
    private float makeupBlusher;
    private float makeupContour;
    private float makeupEyeBrow;
    private float makeupEyeLashAndLine;
    private float makeupEyeShadow;
    private float makeupLip;
    private java.lang.String materialID;
    private float nasalRoot;
    private float noseShrinkage;
    private float noseTip;
    private float noseWing;
    private java.lang.String presetID;
    private float redLip;
    private float skinSmoothness;
    private float smileFoldReduction;
    private float teethWhiteness;
    private float twowayBrightRate;

    public static com.tencent.maas.camstudio.MJBeautyAdjustmentDesc getClassicBeautyAdjustmentDesc() {
        return nativeGetBuiltinBeautyAdjustmentDesc("Classic");
    }

    public static com.tencent.maas.camstudio.MJBeautyAdjustmentDesc getGodBeautyAdjustmentDesc() {
        return nativeGetBuiltinBeautyAdjustmentDesc("God");
    }

    public static com.tencent.maas.camstudio.MJBeautyAdjustmentDesc getGoddessBeautyAdjustmentDesc() {
        return nativeGetBuiltinBeautyAdjustmentDesc("Goddess");
    }

    public static com.tencent.maas.camstudio.MJBeautyAdjustmentDesc getNaturalBeautyAdjustmentDesc() {
        return nativeGetBuiltinBeautyAdjustmentDesc("Natural");
    }

    private static native com.tencent.maas.camstudio.MJBeautyAdjustmentDesc nativeGetBuiltinBeautyAdjustmentDesc(java.lang.String str);

    public float getBrowDistance() {
        return this.browDistance;
    }

    public float getBrowPeak() {
        return this.browPeak;
    }

    public float getBrowThickness() {
        return this.browThickness;
    }

    public float getCheekShrinkage() {
        return this.cheekShrinkage;
    }

    public float getCheekboneShrinkage() {
        return this.cheekboneShrinkage;
    }

    public float getClarity() {
        return this.clarity;
    }

    public float getContouringRate() {
        return this.contouringRate;
    }

    public float getDarkCircleReduction() {
        return this.darkCircleReduction;
    }

    public float getEyeBrightness() {
        return this.eyeBrightness;
    }

    public float getEyeDistanceFactor() {
        return this.eyeDistanceFactor;
    }

    public float getEyeEnhancement() {
        return this.eyeEnhancement;
    }

    public float getEyelidDownStrength() {
        return this.eyelidDownStrength;
    }

    public float getFaceSlimness() {
        return this.faceSlimness;
    }

    public float getHeadShrinkage() {
        return this.headShrinkage;
    }

    public float getInnerEyeCorner() {
        return this.innerEyeCorner;
    }

    public float getJawShrinkage() {
        return this.jawShrinkage;
    }

    public float getLipShape() {
        return this.lipShape;
    }

    public float getMakeupBlusher() {
        return this.makeupBlusher;
    }

    public float getMakeupContour() {
        return this.makeupContour;
    }

    public float getMakeupEyeBrow() {
        return this.makeupEyeBrow;
    }

    public float getMakeupEyeLashAndLine() {
        return this.makeupEyeLashAndLine;
    }

    public float getMakeupEyeShadow() {
        return this.makeupEyeShadow;
    }

    public float getMakeupLip() {
        return this.makeupLip;
    }

    public java.lang.String getMaterialID() {
        return this.materialID;
    }

    public float getNasalRoot() {
        return this.nasalRoot;
    }

    public float getNoseShrinkage() {
        return this.noseShrinkage;
    }

    public float getNoseTip() {
        return this.noseTip;
    }

    public float getNoseWing() {
        return this.noseWing;
    }

    public java.lang.String getPresetID() {
        return this.presetID;
    }

    public float getRedLip() {
        return this.redLip;
    }

    public float getSkinSmoothness() {
        return this.skinSmoothness;
    }

    public float getSmileFoldReduction() {
        return this.smileFoldReduction;
    }

    public float getTeethWhiteness() {
        return this.teethWhiteness;
    }

    public float getTwowayBrightRate() {
        return this.twowayBrightRate;
    }

    public boolean isBeautyEnabled() {
        return this.isBeautyEnabled;
    }

    public void setBeautyEnabled(boolean z17) {
        this.isBeautyEnabled = z17;
    }

    public void setBrowDistance(float f17) {
        this.browDistance = f17;
    }

    public void setBrowPeak(float f17) {
        this.browPeak = f17;
    }

    public void setBrowThickness(float f17) {
        this.browThickness = f17;
    }

    public void setCheekShrinkage(float f17) {
        this.cheekShrinkage = f17;
    }

    public void setCheekboneShrinkage(float f17) {
        this.cheekboneShrinkage = f17;
    }

    public void setClarity(float f17) {
        this.clarity = f17;
    }

    public void setContouringRate(float f17) {
        this.contouringRate = f17;
    }

    public void setDarkCircleReduction(float f17) {
        this.darkCircleReduction = f17;
    }

    public void setEyeBrightness(float f17) {
        this.eyeBrightness = f17;
    }

    public void setEyeDistanceFactor(float f17) {
        this.eyeDistanceFactor = f17;
    }

    public void setEyeEnhancement(float f17) {
        this.eyeEnhancement = f17;
    }

    public void setEyelidDownStrength(float f17) {
        this.eyelidDownStrength = f17;
    }

    public void setFaceSlimness(float f17) {
        this.faceSlimness = f17;
    }

    public void setHeadShrinkage(float f17) {
        this.headShrinkage = f17;
    }

    public void setInnerEyeCorner(float f17) {
        this.innerEyeCorner = f17;
    }

    public void setJawShrinkage(float f17) {
        this.jawShrinkage = f17;
    }

    public void setLipShape(float f17) {
        this.lipShape = f17;
    }

    public void setMakeupBlusher(float f17) {
        this.makeupBlusher = f17;
    }

    public void setMakeupContour(float f17) {
        this.makeupContour = f17;
    }

    public void setMakeupEyeBrow(float f17) {
        this.makeupEyeBrow = f17;
    }

    public void setMakeupEyeLashAndLine(float f17) {
        this.makeupEyeLashAndLine = f17;
    }

    public void setMakeupEyeShadow(float f17) {
        this.makeupEyeShadow = f17;
    }

    public void setMakeupLip(float f17) {
        this.makeupLip = f17;
    }

    public void setMaterialID(java.lang.String str) {
        this.materialID = str;
    }

    public void setNasalRoot(float f17) {
        this.nasalRoot = f17;
    }

    public void setNoseShrinkage(float f17) {
        this.noseShrinkage = f17;
    }

    public void setNoseTip(float f17) {
        this.noseTip = f17;
    }

    public void setNoseWing(float f17) {
        this.noseWing = f17;
    }

    public void setPresetID(java.lang.String str) {
        this.presetID = str;
    }

    public void setRedLip(float f17) {
        this.redLip = f17;
    }

    public void setSkinSmoothness(float f17) {
        this.skinSmoothness = f17;
    }

    public void setSmileFoldReduction(float f17) {
        this.smileFoldReduction = f17;
    }

    public void setTeethWhiteness(float f17) {
        this.teethWhiteness = f17;
    }

    public void setTwowayBrightRate(float f17) {
        this.twowayBrightRate = f17;
    }
}
