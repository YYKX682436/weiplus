package com.tencent.mm.plugin.account.gatewayreg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/gatewayreg/GateWayRespData;", "Landroid/os/Parcelable;", "CREATOR", "u61/p", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class GateWayRespData implements android.os.Parcelable {
    public static final u61.p CREATOR = new u61.p(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f73175d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73176e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f73177f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f73178g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f73179h;

    /* renamed from: i, reason: collision with root package name */
    public final int f73180i;

    /* renamed from: m, reason: collision with root package name */
    public final int f73181m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f73182n;

    public GateWayRespData(int i17, int i18, java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.g gVar, int i19, int i27, com.tencent.mm.protobuf.g gVar2) {
        this.f73175d = i17;
        this.f73176e = i18;
        this.f73177f = str;
        this.f73178g = str2;
        this.f73179h = gVar;
        this.f73180i = i19;
        this.f73181m = i27;
        this.f73182n = gVar2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.account.gatewayreg.GateWayRespData)) {
            return false;
        }
        com.tencent.mm.plugin.account.gatewayreg.GateWayRespData gateWayRespData = (com.tencent.mm.plugin.account.gatewayreg.GateWayRespData) obj;
        return this.f73175d == gateWayRespData.f73175d && this.f73176e == gateWayRespData.f73176e && kotlin.jvm.internal.o.b(this.f73177f, gateWayRespData.f73177f) && kotlin.jvm.internal.o.b(this.f73178g, gateWayRespData.f73178g) && kotlin.jvm.internal.o.b(this.f73179h, gateWayRespData.f73179h) && this.f73180i == gateWayRespData.f73180i && this.f73181m == gateWayRespData.f73181m && kotlin.jvm.internal.o.b(this.f73182n, gateWayRespData.f73182n);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f73175d) * 31) + java.lang.Integer.hashCode(this.f73176e)) * 31;
        java.lang.String str = this.f73177f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f73178g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.tencent.mm.protobuf.g gVar = this.f73179h;
        int hashCode4 = (((((hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f73180i)) * 31) + java.lang.Integer.hashCode(this.f73181m)) * 31;
        com.tencent.mm.protobuf.g gVar2 = this.f73182n;
        return hashCode4 + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GateWayRespData(channel=" + this.f73175d + ", channelCarrierType=" + this.f73176e + ", uplinkUrl=" + this.f73177f + ", msgId=" + this.f73178g + ", respSpamInfo=" + this.f73179h + ", reqUrlExpiredTime=" + this.f73180i + ", getMobileExpiredTime=" + this.f73181m + ", gatewayTicket=" + this.f73182n + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f73175d);
        parcel.writeInt(this.f73176e);
        parcel.writeString(this.f73177f);
        parcel.writeString(this.f73178g);
        parcel.writeInt(this.f73180i);
        parcel.writeInt(this.f73181m);
    }
}
