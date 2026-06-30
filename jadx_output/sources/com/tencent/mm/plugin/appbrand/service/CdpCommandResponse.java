package com.tencent.mm.plugin.appbrand.service;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/CdpCommandResponse;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class CdpCommandResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.service.CdpCommandResponse> CREATOR = new com.tencent.mm.plugin.appbrand.service.n0();

    /* renamed from: d, reason: collision with root package name */
    public final int f88612d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f88613e;

    public CdpCommandResponse(int i17, java.lang.String responseJson) {
        kotlin.jvm.internal.o.g(responseJson, "responseJson");
        this.f88612d = i17;
        this.f88613e = responseJson;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.service.CdpCommandResponse)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.CdpCommandResponse cdpCommandResponse = (com.tencent.mm.plugin.appbrand.service.CdpCommandResponse) obj;
        return this.f88612d == cdpCommandResponse.f88612d && kotlin.jvm.internal.o.b(this.f88613e, cdpCommandResponse.f88613e);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f88612d) * 31) + this.f88613e.hashCode();
    }

    public java.lang.String toString() {
        return "CdpCommandResponse(code=" + this.f88612d + ", responseJson=" + this.f88613e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f88612d);
        out.writeString(this.f88613e);
    }
}
