package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class z0 implements android.os.Parcelable.Creator {
    public z0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        boolean z17 = parcel.readInt() == 1;
        java.lang.String readString = parcel.readString();
        if (readString == null) {
            readString = "";
        }
        java.lang.String readString2 = parcel.readString();
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse(z17, readString, readString2 != null ? readString2 : "");
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiOpenBizPublishImageForAppBrand$OpenBizPublishImageProcessResponse[i17];
    }
}
