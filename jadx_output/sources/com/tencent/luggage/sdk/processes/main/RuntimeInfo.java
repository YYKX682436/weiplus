package com.tencent.luggage.sdk.processes.main;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class RuntimeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.processes.main.RuntimeInfo> CREATOR = new ye.m();

    /* renamed from: d, reason: collision with root package name */
    public final int f47659d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f47660e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47661f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f47662g;

    /* renamed from: h, reason: collision with root package name */
    public final int f47663h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f47664i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f47665m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig f47666n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f47667o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f47668p;

    public RuntimeInfo(int i17, java.lang.String appId, int i18, boolean z17, int i19, java.lang.String instanceId, java.lang.String userName, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig initConfig, boolean z18, java.lang.String stackTrace) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(initConfig, "initConfig");
        kotlin.jvm.internal.o.g(stackTrace, "stackTrace");
        this.f47659d = i17;
        this.f47660e = appId;
        this.f47661f = i18;
        this.f47662g = z17;
        this.f47663h = i19;
        this.f47664i = instanceId;
        this.f47665m = userName;
        this.f47666n = initConfig;
        this.f47667o = z18;
        this.f47668p = stackTrace;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.luggage.sdk.processes.main.RuntimeInfo)) {
            return false;
        }
        com.tencent.luggage.sdk.processes.main.RuntimeInfo runtimeInfo = (com.tencent.luggage.sdk.processes.main.RuntimeInfo) obj;
        return this.f47659d == runtimeInfo.f47659d && kotlin.jvm.internal.o.b(this.f47660e, runtimeInfo.f47660e) && this.f47661f == runtimeInfo.f47661f && this.f47662g == runtimeInfo.f47662g && this.f47663h == runtimeInfo.f47663h && kotlin.jvm.internal.o.b(this.f47664i, runtimeInfo.f47664i) && kotlin.jvm.internal.o.b(this.f47665m, runtimeInfo.f47665m) && kotlin.jvm.internal.o.b(this.f47666n, runtimeInfo.f47666n) && this.f47667o == runtimeInfo.f47667o && kotlin.jvm.internal.o.b(this.f47668p, runtimeInfo.f47668p);
    }

    public int hashCode() {
        return (((((((((((((((((java.lang.Integer.hashCode(this.f47659d) * 31) + this.f47660e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f47661f)) * 31) + java.lang.Boolean.hashCode(this.f47662g)) * 31) + java.lang.Integer.hashCode(this.f47663h)) * 31) + this.f47664i.hashCode()) * 31) + this.f47665m.hashCode()) * 31) + this.f47666n.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f47667o)) * 31) + this.f47668p.hashCode();
    }

    public java.lang.String toString() {
        return "RuntimeInfo(processIndex=" + this.f47659d + ", appId=" + this.f47660e + ", versionType=" + this.f47661f + ", isGame=" + this.f47662g + ", appType=" + this.f47663h + ", instanceId=" + this.f47664i + ", userName=" + this.f47665m + ", initConfig=" + this.f47666n + ", isPersistentApp=" + this.f47667o + ", stackTrace=" + this.f47668p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f47659d);
        out.writeString(this.f47660e);
        out.writeInt(this.f47661f);
        out.writeInt(this.f47662g ? 1 : 0);
        out.writeInt(this.f47663h);
        out.writeString(this.f47664i);
        out.writeString(this.f47665m);
        out.writeParcelable(this.f47666n, i17);
        out.writeInt(this.f47667o ? 1 : 0);
        out.writeString(this.f47668p);
    }
}
