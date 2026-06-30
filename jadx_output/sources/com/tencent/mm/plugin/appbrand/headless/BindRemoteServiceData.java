package com.tencent.mm.plugin.appbrand.headless;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/headless/BindRemoteServiceData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class BindRemoteServiceData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceData> CREATOR = new com.tencent.mm.plugin.appbrand.headless.k();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f78277d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f78278e;

    /* renamed from: f, reason: collision with root package name */
    public final int f78279f;

    public BindRemoteServiceData(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC initConfig, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject stat, int i17) {
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(stat, "stat");
        this.f78277d = initConfig;
        this.f78278e = stat;
        this.f78279f = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceData)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceData bindRemoteServiceData = (com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceData) obj;
        return kotlin.jvm.internal.o.b(this.f78277d, bindRemoteServiceData.f78277d) && kotlin.jvm.internal.o.b(this.f78278e, bindRemoteServiceData.f78278e) && this.f78279f == bindRemoteServiceData.f78279f;
    }

    public int hashCode() {
        return (((this.f78277d.hashCode() * 31) + this.f78278e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f78279f);
    }

    public java.lang.String toString() {
        return "BindRemoteServiceData(initConfig=" + this.f78277d + ", stat=" + this.f78278e + ", requestId=" + this.f78279f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeParcelable(this.f78277d, i17);
        out.writeParcelable(this.f78278e, i17);
        out.writeInt(this.f78279f);
    }
}
