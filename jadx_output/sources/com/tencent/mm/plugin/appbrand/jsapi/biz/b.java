package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes9.dex */
public final class b implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo(parcel.readDouble(), parcel.readDouble());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo[i17];
    }
}
