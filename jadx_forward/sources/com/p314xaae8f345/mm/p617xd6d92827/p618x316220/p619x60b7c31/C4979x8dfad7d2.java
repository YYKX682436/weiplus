package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/advertise/impl/jsapi/MBJsApiAdDataReport$ADDataReportEvent", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/advertise/impl/jsapi/e", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiAdDataReport$ADDataReportEvent */
/* loaded from: classes.dex */
public final /* data */ class C4979x8dfad7d2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.e f21390x681a0c0c = new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.e(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f134693d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134694e;

    public C4979x8dfad7d2(java.lang.String str, int i17) {
        this.f134693d = str;
        this.f134694e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42888xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4979x8dfad7d2)) {
            return false;
        }
        com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4979x8dfad7d2 c4979x8dfad7d2 = (com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4979x8dfad7d2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134693d, c4979x8dfad7d2.f134693d) && this.f134694e == c4979x8dfad7d2.f134694e;
    }

    /* renamed from: hashCode */
    public int m42889x8cdac1b() {
        java.lang.String str = this.f134693d;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f134694e);
    }

    /* renamed from: toString */
    public java.lang.String m42890x9616526c() {
        return "ADDataReportEvent(reportStr=" + this.f134693d + ", logId=" + this.f134694e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f134693d);
        parcel.writeInt(this.f134694e);
    }
}
