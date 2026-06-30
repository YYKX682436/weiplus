package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes4.dex */
public final class z0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse[i17];
    }
}
