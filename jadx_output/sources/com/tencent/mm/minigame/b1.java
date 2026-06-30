package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class b1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.minigame.WVAModulePkgPathHelper$GetWVAModulePkgPathTask[i17];
    }
}
