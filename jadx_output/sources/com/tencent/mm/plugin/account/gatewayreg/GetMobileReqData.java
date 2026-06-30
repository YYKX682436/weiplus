package com.tencent.mm.plugin.account.gatewayreg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileReqData;", "Landroid/os/Parcelable;", "CREATOR", "u61/q", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class GetMobileReqData implements android.os.Parcelable {
    public static final u61.q CREATOR = new u61.q(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.gatewayreg.GateWayRespData f73183d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f73184e;

    public GetMobileReqData(com.tencent.mm.plugin.account.gatewayreg.GateWayRespData reqData, java.lang.String data) {
        kotlin.jvm.internal.o.g(reqData, "reqData");
        kotlin.jvm.internal.o.g(data, "data");
        this.f73183d = reqData;
        this.f73184e = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData)) {
            return false;
        }
        com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData getMobileReqData = (com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData) obj;
        return kotlin.jvm.internal.o.b(this.f73183d, getMobileReqData.f73183d) && kotlin.jvm.internal.o.b(this.f73184e, getMobileReqData.f73184e);
    }

    public int hashCode() {
        return (this.f73183d.hashCode() * 31) + this.f73184e.hashCode();
    }

    public java.lang.String toString() {
        return "GetMobileReqData(reqData=" + this.f73183d + ", data=" + this.f73184e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f73183d.writeToParcel(parcel, i17);
        parcel.writeString(this.f73184e);
    }
}
