package com.p314xaae8f345.mm.p617xd6d92827.cgi;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiReportData;", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData */
/* loaded from: classes5.dex */
public final /* data */ class C4978x557b1957 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957> f21389x681a0c0c = new yj.l();

    /* renamed from: d, reason: collision with root package name */
    public final wj.p0 f134688d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f134689e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f134690f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f134691g;

    /* renamed from: h, reason: collision with root package name */
    public final long f134692h;

    public C4978x557b1957(wj.p0 reportType, java.lang.String serverAid, byte[] adsInfo, java.lang.Integer num, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportType, "reportType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serverAid, "serverAid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adsInfo, "adsInfo");
        this.f134688d = reportType;
        this.f134689e = serverAid;
        this.f134690f = adsInfo;
        this.f134691g = num;
        this.f134692h = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42884xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData");
        com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957 c4978x557b1957 = (com.p314xaae8f345.mm.p617xd6d92827.cgi.C4978x557b1957) obj;
        return this.f134688d == c4978x557b1957.f134688d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134689e, c4978x557b1957.f134689e) && java.util.Arrays.equals(this.f134690f, c4978x557b1957.f134690f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134691g, c4978x557b1957.f134691g) && this.f134692h == c4978x557b1957.f134692h;
    }

    /* renamed from: hashCode */
    public int m42885x8cdac1b() {
        int hashCode = ((((this.f134688d.hashCode() * 31) + this.f134689e.hashCode()) * 31) + java.util.Arrays.hashCode(this.f134690f)) * 31;
        java.lang.Integer num = this.f134691g;
        return ((hashCode + (num != null ? num.intValue() : 0)) * 31) + java.lang.Long.hashCode(this.f134692h);
    }

    /* renamed from: toString */
    public java.lang.String m42886x9616526c() {
        return "MagicAdIPCCgiReportData(reportType=" + this.f134688d + ", serverAid=" + this.f134689e + ", adsInfo=" + java.util.Arrays.toString(this.f134690f) + ", rejectReason=" + this.f134691g + ", exposeTime=" + this.f134692h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        int intValue;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f134688d.name());
        out.writeString(this.f134689e);
        out.writeByteArray(this.f134690f);
        java.lang.Integer num = this.f134691g;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeLong(this.f134692h);
    }
}
