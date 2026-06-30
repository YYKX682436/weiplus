package com.tencent.mm.plugin.account.gatewayreg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;", "Landroid/os/Parcelable;", "CREATOR", "u61/r", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class GetMobileRespData implements android.os.Parcelable {
    public static final u61.r CREATOR = new u61.r(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData f73185d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fn4 f73186e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f73187f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f73188g;

    public GetMobileRespData(com.tencent.mm.plugin.account.gatewayreg.GetMobileReqData reqData, r45.fn4 fn4Var, java.lang.String msgId, boolean z17) {
        kotlin.jvm.internal.o.g(reqData, "reqData");
        kotlin.jvm.internal.o.g(msgId, "msgId");
        this.f73185d = reqData;
        this.f73186e = fn4Var;
        this.f73187f = msgId;
        this.f73188g = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData)) {
            return false;
        }
        com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData getMobileRespData = (com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData) obj;
        return kotlin.jvm.internal.o.b(this.f73185d, getMobileRespData.f73185d) && kotlin.jvm.internal.o.b(this.f73186e, getMobileRespData.f73186e) && kotlin.jvm.internal.o.b(this.f73187f, getMobileRespData.f73187f) && this.f73188g == getMobileRespData.f73188g;
    }

    public int hashCode() {
        int hashCode = this.f73185d.hashCode() * 31;
        r45.fn4 fn4Var = this.f73186e;
        return ((((hashCode + (fn4Var == null ? 0 : fn4Var.hashCode())) * 31) + this.f73187f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f73188g);
    }

    public java.lang.String toString() {
        return "GetMobileRespData(reqData=" + this.f73185d + ", mobileInfo=" + this.f73186e + ", msgId=" + this.f73187f + ", canRetry=" + this.f73188g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f73185d.writeToParcel(parcel, i17);
        r45.fn4 fn4Var = this.f73186e;
        if (fn4Var == null || (str = fn4Var.toJSON().toString()) == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.f73187f);
        parcel.writeInt(this.f73188g ? 1 : 0);
    }
}
