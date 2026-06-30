package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/gatewayreg/GateWayRespData;", "Landroid/os/Parcelable;", "CREATOR", "u61/p", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.account.gatewayreg.GateWayRespData */
/* loaded from: classes4.dex */
public final /* data */ class C11382xcabbddbe implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final u61.p f33357x681a0c0c = new u61.p(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f154708d;

    /* renamed from: e, reason: collision with root package name */
    public final int f154709e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f154710f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f154711g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f154712h;

    /* renamed from: i, reason: collision with root package name */
    public final int f154713i;

    /* renamed from: m, reason: collision with root package name */
    public final int f154714m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f154715n;

    public C11382xcabbddbe(int i17, int i18, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i19, int i27, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2) {
        this.f154708d = i17;
        this.f154709e = i18;
        this.f154710f = str;
        this.f154711g = str2;
        this.f154712h = gVar;
        this.f154713i = i19;
        this.f154714m = i27;
        this.f154715n = gVar2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48660xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe c11382xcabbddbe = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11382xcabbddbe) obj;
        return this.f154708d == c11382xcabbddbe.f154708d && this.f154709e == c11382xcabbddbe.f154709e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f154710f, c11382xcabbddbe.f154710f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f154711g, c11382xcabbddbe.f154711g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f154712h, c11382xcabbddbe.f154712h) && this.f154713i == c11382xcabbddbe.f154713i && this.f154714m == c11382xcabbddbe.f154714m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f154715n, c11382xcabbddbe.f154715n);
    }

    /* renamed from: hashCode */
    public int m48661x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f154708d) * 31) + java.lang.Integer.hashCode(this.f154709e)) * 31;
        java.lang.String str = this.f154710f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f154711g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f154712h;
        int hashCode4 = (((((hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f154713i)) * 31) + java.lang.Integer.hashCode(this.f154714m)) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f154715n;
        return hashCode4 + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m48662x9616526c() {
        return "GateWayRespData(channel=" + this.f154708d + ", channelCarrierType=" + this.f154709e + ", uplinkUrl=" + this.f154710f + ", msgId=" + this.f154711g + ", respSpamInfo=" + this.f154712h + ", reqUrlExpiredTime=" + this.f154713i + ", getMobileExpiredTime=" + this.f154714m + ", gatewayTicket=" + this.f154715n + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f154708d);
        parcel.writeInt(this.f154709e);
        parcel.writeString(this.f154710f);
        parcel.writeString(this.f154711g);
        parcel.writeInt(this.f154713i);
        parcel.writeInt(this.f154714m);
    }
}
