package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class d0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask jsApiRemoveStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask();
        jsApiRemoveStorageTask.v(parcel);
        return jsApiRemoveStorageTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask[i17];
    }
}
