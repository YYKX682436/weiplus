package com.tencent.mm.plugin.appbrand;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/BindRemoteServiceData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class BindRemoteServiceData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.BindRemoteServiceData> CREATOR = new com.tencent.mm.plugin.appbrand.ea();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f74868d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f74869e;

    /* renamed from: f, reason: collision with root package name */
    public final int f74870f;

    public BindRemoteServiceData(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat, int i17) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(stat, "stat");
        this.f74868d = initConfig;
        this.f74869e = stat;
        this.f74870f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.BindRemoteServiceData)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.BindRemoteServiceData bindRemoteServiceData = (com.tencent.mm.plugin.appbrand.BindRemoteServiceData) obj;
        return kotlin.jvm.internal.o.b(this.f74868d, bindRemoteServiceData.f74868d) && kotlin.jvm.internal.o.b(this.f74869e, bindRemoteServiceData.f74869e) && this.f74870f == bindRemoteServiceData.f74870f;
    }

    public int hashCode() {
        return (((this.f74868d.hashCode() * 31) + this.f74869e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f74870f);
    }

    public java.lang.String toString() {
        return "BindRemoteServiceData(initConfig=" + this.f74868d + ", stat=" + this.f74869e + ", loaderId=" + this.f74870f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f74868d, i17);
        out.writeParcelable(this.f74869e, i17);
        out.writeInt(this.f74870f);
    }
}
