package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class ke implements android.os.Parcelable.Creator {
    public ke(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiStartCircleToSearch$StartCircleToSearchTask(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiStartCircleToSearch$StartCircleToSearchTask[i17];
    }
}
