package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class l0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask jsApiSetStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask();
        jsApiSetStorageTask.v(parcel);
        return jsApiSetStorageTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask[i17];
    }
}
