package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class z8 implements android.os.Parcelable.Creator {
    public z8(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.finder.assist.LocalFinderAtContactParcel localFinderAtContactParcel = new com.tencent.mm.plugin.finder.assist.LocalFinderAtContactParcel();
        localFinderAtContactParcel.f101985d = parcel.readString();
        localFinderAtContactParcel.f101986e = parcel.readString();
        localFinderAtContactParcel.f101987f = parcel.readString();
        localFinderAtContactParcel.f101988g = parcel.createByteArray();
        localFinderAtContactParcel.f101989h = parcel.readLong();
        localFinderAtContactParcel.f101990i = parcel.readInt();
        localFinderAtContactParcel.f101991m = parcel.readInt();
        return localFinderAtContactParcel;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.finder.assist.LocalFinderAtContactParcel[i17];
    }
}
