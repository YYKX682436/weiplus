package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

/* loaded from: classes7.dex */
public final class o3 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), (com.tencent.mm.plugin.appbrand.service.CdpCommandParams) parcel.readParcelable(com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData[i17];
    }
}
