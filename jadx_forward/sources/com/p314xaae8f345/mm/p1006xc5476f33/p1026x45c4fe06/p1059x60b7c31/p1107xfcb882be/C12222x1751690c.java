package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiGetRecentUsageList$Companion$Parameter", "Landroid/os/Parcelable;", "CREATOR", "td1/a", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiGetRecentUsageList$Companion$Parameter */
/* loaded from: classes7.dex */
public final /* data */ class C12222x1751690c implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final td1.a f34727x681a0c0c = new td1.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final int f164441d;

    /* renamed from: e, reason: collision with root package name */
    public final long f164442e;

    /* renamed from: f, reason: collision with root package name */
    public final int f164443f;

    public C12222x1751690c(int i17, long j17, int i18) {
        this.f164441d = i17;
        this.f164442e = j17;
        this.f164443f = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51228xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12222x1751690c)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12222x1751690c c12222x1751690c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12222x1751690c) obj;
        return this.f164441d == c12222x1751690c.f164441d && this.f164442e == c12222x1751690c.f164442e && this.f164443f == c12222x1751690c.f164443f;
    }

    /* renamed from: hashCode */
    public int m51229x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f164441d) * 31) + java.lang.Long.hashCode(this.f164442e)) * 31) + java.lang.Integer.hashCode(this.f164443f);
    }

    /* renamed from: toString */
    public java.lang.String m51230x9616526c() {
        return "Parameter(count=" + this.f164441d + ", lastUpdateTime=" + this.f164442e + ", requestId=" + this.f164443f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f164441d);
        parcel.writeLong(this.f164442e);
        parcel.writeInt(this.f164443f);
    }
}
