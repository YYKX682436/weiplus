package com.tencent.mm.plugin.appbrand.tipsmsg;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/tipsmsg/TipsIPCData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class TipsIPCData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.tipsmsg.TipsIPCData> CREATOR = new rj1.i();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo f89231d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f89232e;

    public TipsIPCData(com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo info, boolean z17) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f89231d = info;
        this.f89232e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.tipsmsg.TipsIPCData)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsIPCData tipsIPCData = (com.tencent.mm.plugin.appbrand.tipsmsg.TipsIPCData) obj;
        return kotlin.jvm.internal.o.b(this.f89231d, tipsIPCData.f89231d) && this.f89232e == tipsIPCData.f89232e;
    }

    public int hashCode() {
        return (this.f89231d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f89232e);
    }

    public java.lang.String toString() {
        return "TipsIPCData(info=" + this.f89231d + ", isAdd=" + this.f89232e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f89231d, i17);
        out.writeInt(this.f89232e ? 1 : 0);
    }
}
