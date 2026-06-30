package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class tf implements android.os.Parcelable.Creator {
    public tf(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusResult(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.PublishTextStatusResult[i17];
    }
}
