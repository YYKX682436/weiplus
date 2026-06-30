package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class m0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.service.CdpCommandParamsWrapper(parcel.readInt(), com.tencent.mm.plugin.appbrand.service.CdpCommandParams.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.service.CdpCommandParamsWrapper[i17];
    }
}
