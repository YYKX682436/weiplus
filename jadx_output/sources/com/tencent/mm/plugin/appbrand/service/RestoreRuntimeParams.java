package com.tencent.mm.plugin.appbrand.service;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/RestoreRuntimeParams;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class RestoreRuntimeParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams> CREATOR = new com.tencent.mm.plugin.appbrand.service.y6();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f88617d;

    public RestoreRuntimeParams(java.util.List appIdList) {
        kotlin.jvm.internal.o.g(appIdList, "appIdList");
        this.f88617d = appIdList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams) && kotlin.jvm.internal.o.b(this.f88617d, ((com.tencent.mm.plugin.appbrand.service.RestoreRuntimeParams) obj).f88617d);
    }

    public int hashCode() {
        return this.f88617d.hashCode();
    }

    public java.lang.String toString() {
        return "RestoreRuntimeParams(appIdList=" + this.f88617d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeStringList(this.f88617d);
    }
}
