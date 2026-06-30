package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class a9 implements android.os.Parcelable.Creator {
    public a9(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenCameraForImageSearch$ChooseResult[i17];
    }
}
