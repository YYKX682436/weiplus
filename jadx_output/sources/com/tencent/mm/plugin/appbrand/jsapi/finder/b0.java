package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class b0 implements android.os.Parcelable.Creator {
    public b0(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$NotifyClickRequest[i17];
    }
}
