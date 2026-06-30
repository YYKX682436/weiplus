package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs", "Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverContract$SharedIPCCallArgs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs extends com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$SharedIPCCallArgs {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs> CREATOR = new com.tencent.mm.plugin.appbrand.launching.na();

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f84465s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.luggage.sdk.launching.h f84466t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.String readString = source.readString();
        kotlin.jvm.internal.o.d(readString);
        this.f84465s = readString;
        this.f84466t = com.tencent.luggage.sdk.launching.k.a(source);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$SharedIPCCallArgs, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        dest.writeString(this.f84465s);
        com.tencent.luggage.sdk.launching.k.d(this.f84466t, dest, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModularizingPkgRetrieverSeparatedPluginsCompatible$IPCCallArgs(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6, java.lang.String moduleName) {
        super(rt6);
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        this.f84465s = moduleName;
    }
}
