package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        java.lang.Boolean valueOf;
        java.lang.Boolean valueOf2;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = java.lang.Boolean.valueOf(parcel.readInt() != 0);
        }
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = java.lang.Boolean.valueOf(parcel.readInt() != 0);
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse(valueOf, valueOf2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : java.lang.Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : java.lang.Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse[i17];
    }
}
