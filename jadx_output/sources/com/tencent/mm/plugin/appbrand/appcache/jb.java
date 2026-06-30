package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public final class jb implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        return new com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap(source);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.appcache.WxaRuntimeModulePluginListMap[i17];
    }
}
