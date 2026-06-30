package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes5.dex */
public final class s implements android.os.Parcelable.Creator {
    public s(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo(java.lang.String.valueOf(parcel.readString()), java.lang.String.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMAuthScopeRiskWxaAppInfo[i17];
    }
}
