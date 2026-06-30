package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class u implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask jsApiGetStorageInfoTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask();
        jsApiGetStorageInfoTask.v(parcel);
        return jsApiGetStorageInfoTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask[i17];
    }
}
