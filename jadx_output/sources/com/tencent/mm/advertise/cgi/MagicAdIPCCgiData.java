package com.tencent.mm.advertise.cgi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiData;", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class MagicAdIPCCgiData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.advertise.cgi.MagicAdIPCCgiData> CREATOR = new yj.j();

    /* renamed from: d, reason: collision with root package name */
    public final yj.h f53151d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData f53152e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData f53153f;

    public MagicAdIPCCgiData(yj.h action, com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData magicAdIPCCgiPullData, com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f53151d = action;
        this.f53152e = magicAdIPCCgiPullData;
        this.f53153f = magicAdIPCCgiReportData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.advertise.cgi.MagicAdIPCCgiData)) {
            return false;
        }
        com.tencent.mm.advertise.cgi.MagicAdIPCCgiData magicAdIPCCgiData = (com.tencent.mm.advertise.cgi.MagicAdIPCCgiData) obj;
        return this.f53151d == magicAdIPCCgiData.f53151d && kotlin.jvm.internal.o.b(this.f53152e, magicAdIPCCgiData.f53152e) && kotlin.jvm.internal.o.b(this.f53153f, magicAdIPCCgiData.f53153f);
    }

    public int hashCode() {
        int hashCode = this.f53151d.hashCode() * 31;
        com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData magicAdIPCCgiPullData = this.f53152e;
        int hashCode2 = (hashCode + (magicAdIPCCgiPullData == null ? 0 : magicAdIPCCgiPullData.hashCode())) * 31;
        com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData = this.f53153f;
        return hashCode2 + (magicAdIPCCgiReportData != null ? magicAdIPCCgiReportData.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MagicAdIPCCgiData(action=" + this.f53151d + ", pullData=" + this.f53152e + ", reportData=" + this.f53153f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f53151d.name());
        com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData magicAdIPCCgiPullData = this.f53152e;
        if (magicAdIPCCgiPullData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            magicAdIPCCgiPullData.writeToParcel(out, i17);
        }
        com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData = this.f53153f;
        if (magicAdIPCCgiReportData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            magicAdIPCCgiReportData.writeToParcel(out, i17);
        }
    }

    public /* synthetic */ MagicAdIPCCgiData(yj.h hVar, com.tencent.mm.advertise.cgi.MagicAdIPCCgiPullData magicAdIPCCgiPullData, com.tencent.mm.advertise.cgi.MagicAdIPCCgiReportData magicAdIPCCgiReportData, int i17, kotlin.jvm.internal.i iVar) {
        this(hVar, (i17 & 2) != 0 ? null : magicAdIPCCgiPullData, (i17 & 4) != 0 ? null : magicAdIPCCgiReportData);
    }
}
