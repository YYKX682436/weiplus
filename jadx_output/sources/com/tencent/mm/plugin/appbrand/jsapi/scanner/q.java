package com.tencent.mm.plugin.appbrand.jsapi.scanner;

/* loaded from: classes.dex */
public final class q implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanItem$CheckScanItemTask(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiScanItem$CheckScanItemTask[i17];
    }
}
