package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public class we implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiUploadWeRunData$UploadMiniAppStepTask[i17];
    }
}
