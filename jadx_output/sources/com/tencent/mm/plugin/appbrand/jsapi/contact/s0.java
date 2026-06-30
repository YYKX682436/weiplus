package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes5.dex */
public final class s0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact$UpdateWxaAttrsTaskParam[i17];
    }
}
