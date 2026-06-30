package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), com.tencent.mm.plugin.downloader.model.CloudGameAppInfo.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper[i17];
    }
}
