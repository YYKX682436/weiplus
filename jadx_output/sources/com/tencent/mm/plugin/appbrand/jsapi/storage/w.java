package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class w implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask jsApiGetStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask();
        jsApiGetStorageTask.v(parcel);
        return jsApiGetStorageTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask[i17];
    }
}
