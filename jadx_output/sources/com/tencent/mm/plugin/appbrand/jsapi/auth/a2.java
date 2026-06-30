package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class a2 implements android.os.Parcelable.Creator {
    public a2(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        int readInt = parcel.readInt();
        java.lang.String readString2 = parcel.readString();
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse(readString, readInt, readString2 != null ? readString2 : "");
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumResponse[i17];
    }
}
