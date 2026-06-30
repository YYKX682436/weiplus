package com.tencent.mm.mj_publisher.finder.shoot_composing.beautify;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/beautify/LegacyBeautyPartDescWrapper;", "Landroid/os/Parcelable;", "CREATOR", "nx0/w2", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegacyBeautyPartDescWrapper implements android.os.Parcelable {
    public static final nx0.w2 CREATOR = new nx0.w2(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.camstudio.MJBeautyAdjustmentDesc f69606d;

    public LegacyBeautyPartDescWrapper(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc = new com.tencent.maas.camstudio.MJBeautyAdjustmentDesc();
        mJBeautyAdjustmentDesc.setSkinSmoothness(parcel.readFloat());
        mJBeautyAdjustmentDesc.setTwowayBrightRate(parcel.readFloat());
        mJBeautyAdjustmentDesc.setFaceSlimness(parcel.readFloat());
        mJBeautyAdjustmentDesc.setEyeEnhancement(parcel.readFloat());
        mJBeautyAdjustmentDesc.setNoseShrinkage(parcel.readFloat());
        mJBeautyAdjustmentDesc.setSmileFoldReduction(parcel.readFloat());
        mJBeautyAdjustmentDesc.setLipShape(parcel.readFloat());
        mJBeautyAdjustmentDesc.setEyeDistanceFactor(parcel.readFloat());
        mJBeautyAdjustmentDesc.setCheekboneShrinkage(parcel.readFloat());
        mJBeautyAdjustmentDesc.setInnerEyeCorner(parcel.readFloat());
        this.f69606d = mJBeautyAdjustmentDesc;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.maas.camstudio.MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc = this.f69606d;
        parcel.writeFloat(mJBeautyAdjustmentDesc.getSkinSmoothness());
        parcel.writeFloat(mJBeautyAdjustmentDesc.getTwowayBrightRate());
        parcel.writeFloat(mJBeautyAdjustmentDesc.getFaceSlimness());
        parcel.writeFloat(mJBeautyAdjustmentDesc.getEyeEnhancement());
        parcel.writeFloat(mJBeautyAdjustmentDesc.getNoseShrinkage());
        parcel.writeFloat(mJBeautyAdjustmentDesc.getSmileFoldReduction());
        parcel.writeFloat(mJBeautyAdjustmentDesc.getLipShape());
        parcel.writeFloat(mJBeautyAdjustmentDesc.getEyeDistanceFactor());
        parcel.writeFloat(mJBeautyAdjustmentDesc.getCheekboneShrinkage());
        parcel.writeFloat(mJBeautyAdjustmentDesc.getInnerEyeCorner());
    }
}
