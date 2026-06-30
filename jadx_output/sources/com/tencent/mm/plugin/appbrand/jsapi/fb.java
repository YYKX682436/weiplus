package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class fb implements android.os.Parcelable.Creator {
    public fb(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiPreloadWebSearchPage$PreloadWebSearchPageTask(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.JsApiPreloadWebSearchPage$PreloadWebSearchPageTask[i17];
    }
}
