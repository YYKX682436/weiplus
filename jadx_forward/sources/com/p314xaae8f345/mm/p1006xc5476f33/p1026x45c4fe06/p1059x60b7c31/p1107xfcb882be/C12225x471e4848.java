package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/rencentusage/JsApiOperateRecentUsageList$Companion$Result", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.rencentusage.JsApiOperateRecentUsageList$Companion$Result */
/* loaded from: classes14.dex */
public final /* data */ class C12225x471e4848 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848> f34730x681a0c0c = new td1.n();

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848 f164451g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848(true, td1.l.f499141e, null, 4, null);

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848 f164452h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848(false, td1.l.f499142f, null, 4, null);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f164453d;

    /* renamed from: e, reason: collision with root package name */
    public final td1.l f164454e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f164455f;

    public C12225x471e4848(boolean z17, td1.l errorCode, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCode, "errorCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        this.f164453d = z17;
        this.f164454e = errorCode;
        this.f164455f = errorMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51240xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848 c12225x471e4848 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12225x471e4848) obj;
        return this.f164453d == c12225x471e4848.f164453d && this.f164454e == c12225x471e4848.f164454e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164455f, c12225x471e4848.f164455f);
    }

    /* renamed from: hashCode */
    public int m51241x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f164453d) * 31) + this.f164454e.hashCode()) * 31) + this.f164455f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51242x9616526c() {
        return "Result(success=" + this.f164453d + ", errorCode=" + this.f164454e + ", errorMsg=" + this.f164455f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeByte(this.f164453d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f164454e.name());
        parcel.writeString(this.f164455f);
    }

    public /* synthetic */ C12225x471e4848(boolean z17, td1.l lVar, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, lVar, (i17 & 4) != 0 ? "" : str);
    }
}
