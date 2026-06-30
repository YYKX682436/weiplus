package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ha implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult modularizingPkgRetrieverContract$IPCCallResult = new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult(0, null, null, false, 0, null, 62, null);
        int readInt = source.readInt();
        modularizingPkgRetrieverContract$IPCCallResult.f84447d = readInt;
        if (readInt == 1) {
            modularizingPkgRetrieverContract$IPCCallResult.f84448e = (com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress) source.readParcelable(com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress.class.getClassLoader());
        } else if (readInt == 2) {
            int readInt2 = source.readInt();
            java.util.ArrayList arrayList = new java.util.ArrayList(readInt2);
            for (int i17 = 0; i17 < readInt2; i17++) {
                java.lang.String readString = source.readString();
                java.lang.ClassLoader classLoader = kotlin.jvm.internal.o.b(readString, com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.class.getName()) ? com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.class.getClassLoader() : kotlin.jvm.internal.o.b(readString, com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo.class.getName()) ? com.tencent.mm.plugin.appbrand.appcache.WxaPluginPkgInfo.class.getClassLoader() : null;
                kotlin.jvm.internal.o.d(classLoader);
                android.os.Parcelable readParcelable = source.readParcelable(classLoader);
                kotlin.jvm.internal.o.e(readParcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appcache.IPkgInfo");
                arrayList.add((com.tencent.mm.plugin.appbrand.appcache.IPkgInfo) readParcelable);
            }
            modularizingPkgRetrieverContract$IPCCallResult.f84449f = arrayList;
            modularizingPkgRetrieverContract$IPCCallResult.f84450g = source.readByte() > 0;
            modularizingPkgRetrieverContract$IPCCallResult.f84451h = source.readInt();
            modularizingPkgRetrieverContract$IPCCallResult.f84452i = source.readString();
        }
        return modularizingPkgRetrieverContract$IPCCallResult;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult[i17];
    }
}
