package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class v implements android.os.Parcelable.Creator {
    public v(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        boolean z17 = parcel.readByte() != 0;
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo(z17, readString);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserPrivacyProtectInfo[i17];
    }
}
