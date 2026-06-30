package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes5.dex */
public final class r implements android.os.Parcelable.Creator {
    public r(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo(parcel.readInt(), parcel.readInt(), java.lang.String.valueOf(parcel.readString()), java.lang.String.valueOf(parcel.readString()), java.lang.String.valueOf(parcel.readString()), java.lang.String.valueOf(parcel.readString()), (com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo) parcel.readParcelable(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskInfo[i17];
    }
}
