package com.tencent.mm.minigame;

/* loaded from: classes5.dex */
public final class a implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.minigame.AppBrandProcessWVARunningNotifyTask$Args(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.minigame.AppBrandProcessWVARunningNotifyTask$Args[i17];
    }
}
