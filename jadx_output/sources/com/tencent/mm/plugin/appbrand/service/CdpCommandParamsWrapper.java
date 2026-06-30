package com.tencent.mm.plugin.appbrand.service;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/CdpCommandParamsWrapper;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class CdpCommandParamsWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.service.CdpCommandParamsWrapper> CREATOR = new com.tencent.mm.plugin.appbrand.service.m0();

    /* renamed from: d, reason: collision with root package name */
    public final int f88610d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.service.CdpCommandParams f88611e;

    public CdpCommandParamsWrapper(int i17, com.tencent.mm.plugin.appbrand.service.CdpCommandParams params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f88610d = i17;
        this.f88611e = params;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.service.CdpCommandParamsWrapper)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.CdpCommandParamsWrapper cdpCommandParamsWrapper = (com.tencent.mm.plugin.appbrand.service.CdpCommandParamsWrapper) obj;
        return this.f88610d == cdpCommandParamsWrapper.f88610d && kotlin.jvm.internal.o.b(this.f88611e, cdpCommandParamsWrapper.f88611e);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f88610d) * 31) + this.f88611e.hashCode();
    }

    public java.lang.String toString() {
        return "CdpCommandParamsWrapper(callbackId=" + this.f88610d + ", params=" + this.f88611e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f88610d);
        this.f88611e.writeToParcel(out, i17);
    }
}
