package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgBatchLoadTransaction$IPCCallArgs", "Lcom/tencent/mm/plugin/appbrand/launching/ModularizingPkgRetrieverContract$SharedIPCCallArgs;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class ModularizingPkgBatchLoadTransaction$IPCCallArgs extends com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$SharedIPCCallArgs {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallArgs> CREATOR = new com.tencent.mm.plugin.appbrand.launching.v9();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f84443s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f84444t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModularizingPkgBatchLoadTransaction$IPCCallArgs(com.tencent.mm.plugin.appbrand.AppBrandRuntime rt6, java.util.List moduleItems) {
        super(rt6);
        kotlin.jvm.internal.o.g(rt6, "rt");
        kotlin.jvm.internal.o.g(moduleItems, "moduleItems");
        this.f84443s = moduleItems;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = rt6.u0();
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU appBrandInitConfigLU = u07 instanceof com.tencent.luggage.sdk.config.AppBrandInitConfigLU ? (com.tencent.luggage.sdk.config.AppBrandInitConfigLU) u07 : null;
        this.f84444t = appBrandInitConfigLU != null ? appBrandInitConfigLU.f47277w : null;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$SharedIPCCallArgs, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        super.writeToParcel(dest, i17);
        java.util.Collection collection = this.f84443s;
        if (collection == null) {
            collection = kz5.p0.f313996d;
        }
        dest.writeTypedList(collection);
        dest.writeString(this.f84444t);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModularizingPkgBatchLoadTransaction$IPCCallArgs(android.os.Parcel source) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        source.readTypedList(arrayList, com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem.CREATOR);
        this.f84443s = arrayList;
        if (source.dataAvail() > 0) {
            this.f84444t = source.readString();
        }
    }
}
