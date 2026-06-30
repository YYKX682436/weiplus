package com.tencent.mm.plugin.appbrand.launching;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/IPCUpdateStateNotifier$UpdateStateArgsParcelized", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class IPCUpdateStateNotifier$UpdateStateArgsParcelized implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized> CREATOR = new com.tencent.mm.plugin.appbrand.launching.m7();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f84436d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84437e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f84438f;

    /* renamed from: g, reason: collision with root package name */
    public final ne1.j f84439g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f84440h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f84441i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo f84442m;

    public IPCUpdateStateNotifier$UpdateStateArgsParcelized(java.lang.String appId, int i17, java.lang.String str, ne1.j state, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(state, "state");
        this.f84436d = appId;
        this.f84437e = i17;
        this.f84438f = str;
        this.f84439g = state;
        this.f84440h = str2;
        this.f84441i = str3;
        this.f84442m = wxaPkgWrappingInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized iPCUpdateStateNotifier$UpdateStateArgsParcelized = (com.tencent.mm.plugin.appbrand.launching.IPCUpdateStateNotifier$UpdateStateArgsParcelized) obj;
        return kotlin.jvm.internal.o.b(this.f84436d, iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84436d) && this.f84437e == iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84437e && kotlin.jvm.internal.o.b(this.f84438f, iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84438f) && this.f84439g == iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84439g && kotlin.jvm.internal.o.b(this.f84440h, iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84440h) && kotlin.jvm.internal.o.b(this.f84441i, iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84441i) && kotlin.jvm.internal.o.b(this.f84442m, iPCUpdateStateNotifier$UpdateStateArgsParcelized.f84442m);
    }

    public int hashCode() {
        int hashCode = ((this.f84436d.hashCode() * 31) + java.lang.Integer.hashCode(this.f84437e)) * 31;
        java.lang.String str = this.f84438f;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f84439g.hashCode()) * 31;
        java.lang.String str2 = this.f84440h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f84441i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo = this.f84442m;
        return hashCode4 + (wxaPkgWrappingInfo != null ? wxaPkgWrappingInfo.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "UpdateStateArgsParcelized(appId=" + this.f84436d + ", intVersion=" + this.f84437e + ", stringVersion=" + this.f84438f + ", state=" + this.f84439g + ", passThroughInfo=" + this.f84440h + ", stablePassThroughInfo=" + this.f84441i + ", appPkgHolder=" + this.f84442m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f84436d);
        out.writeInt(this.f84437e);
        out.writeString(this.f84438f);
        ne1.j jVar = this.f84439g;
        out.writeInt(jVar != null ? jVar.ordinal() : -1);
        out.writeString(this.f84440h);
        out.writeString(this.f84441i);
        out.writeParcelable(this.f84442m, i17);
    }
}
