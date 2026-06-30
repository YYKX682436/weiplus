package com.tencent.mm.advertise.cgi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiReportData;", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class MagicAdIPCCgiReportData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData> CREATOR = new yj.l();

    /* renamed from: d, reason: collision with root package name */
    public final wj.p0 f53155d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f53156e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f53157f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f53158g;

    /* renamed from: h, reason: collision with root package name */
    public final long f53159h;

    public MagicAdIPCCgiReportData(wj.p0 reportType, java.lang.String serverAid, byte[] adsInfo, java.lang.Integer num, long j17) {
        kotlin.jvm.internal.o.g(reportType, "reportType");
        kotlin.jvm.internal.o.g(serverAid, "serverAid");
        kotlin.jvm.internal.o.g(adsInfo, "adsInfo");
        this.f53155d = reportType;
        this.f53156e = serverAid;
        this.f53157f = adsInfo;
        this.f53158g = num;
        this.f53159h = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData");
        com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData = (com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData) obj;
        return this.f53155d == magicAdIPCCgiReportData.f53155d && kotlin.jvm.internal.o.b(this.f53156e, magicAdIPCCgiReportData.f53156e) && java.util.Arrays.equals(this.f53157f, magicAdIPCCgiReportData.f53157f) && kotlin.jvm.internal.o.b(this.f53158g, magicAdIPCCgiReportData.f53158g) && this.f53159h == magicAdIPCCgiReportData.f53159h;
    }

    public int hashCode() {
        int hashCode = ((((this.f53155d.hashCode() * 31) + this.f53156e.hashCode()) * 31) + java.util.Arrays.hashCode(this.f53157f)) * 31;
        java.lang.Integer num = this.f53158g;
        return ((hashCode + (num != null ? num.intValue() : 0)) * 31) + java.lang.Long.hashCode(this.f53159h);
    }

    public java.lang.String toString() {
        return "MagicAdIPCCgiReportData(reportType=" + this.f53155d + ", serverAid=" + this.f53156e + ", adsInfo=" + java.util.Arrays.toString(this.f53157f) + ", rejectReason=" + this.f53158g + ", exposeTime=" + this.f53159h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        int intValue;
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f53155d.name());
        out.writeString(this.f53156e);
        out.writeByteArray(this.f53157f);
        java.lang.Integer num = this.f53158g;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeLong(this.f53159h);
    }
}
