package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/ModularizingPkgBatchLoadTransaction$IPCCallModuleItem", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class ModularizingPkgBatchLoadTransaction$IPCCallModuleItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem> CREATOR = new com.tencent.mm.plugin.appbrand.launching.w9();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84445d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.h f84446e;

    public ModularizingPkgBatchLoadTransaction$IPCCallModuleItem(java.lang.String moduleName, com.tencent.luggage.sdk.launching.h hVar) {
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        this.f84445d = moduleName;
        this.f84446e = hVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem modularizingPkgBatchLoadTransaction$IPCCallModuleItem = (com.tencent.mm.plugin.appbrand.launching.ModularizingPkgBatchLoadTransaction$IPCCallModuleItem) obj;
        return kotlin.jvm.internal.o.b(this.f84445d, modularizingPkgBatchLoadTransaction$IPCCallModuleItem.f84445d) && kotlin.jvm.internal.o.b(this.f84446e, modularizingPkgBatchLoadTransaction$IPCCallModuleItem.f84446e);
    }

    public int hashCode() {
        int hashCode = this.f84445d.hashCode() * 31;
        com.tencent.luggage.sdk.launching.h hVar = this.f84446e;
        return hashCode + (hVar == null ? 0 : hVar.hashCode());
    }

    public java.lang.String toString() {
        return "IPCCallModuleItem(moduleName=" + this.f84445d + ", callback=" + this.f84446e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f84445d);
        com.tencent.luggage.sdk.launching.k.d(this.f84446e, dest, 0, 4, null);
    }
}
