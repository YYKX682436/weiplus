package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes11.dex */
public final class d implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse(parcel.readInt(), parcel.readInt() == 0 ? null : com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiLaunchResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskResponse.CREATOR.createFromParcel(parcel) : null);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse[i17];
    }
}
