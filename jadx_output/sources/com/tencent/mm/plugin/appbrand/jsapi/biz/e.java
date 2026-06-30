package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes9.dex */
public final class e implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String readString = parcel.readString();
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo createFromParcel = com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo.CREATOR.createFromParcel(parcel);
        int readInt = parcel.readInt();
        java.util.ArrayList arrayList = new java.util.ArrayList(readInt);
        for (int i17 = 0; i17 != readInt; i17++) {
            arrayList.add(com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiGpsInfo.CREATOR.createFromParcel(parcel));
        }
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest(readString, createFromParcel, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest[i17];
    }
}
