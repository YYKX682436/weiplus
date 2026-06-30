package com.tencent.mm.plugin.appbrand.config;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/config/AppBrandLaunchModeParams;", "Landroid/os/Parcelable;", "data-model_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandLaunchModeParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams> CREATOR = new k91.k0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f77321d;

    public AppBrandLaunchModeParams(java.lang.String chatToolMode) {
        kotlin.jvm.internal.o.g(chatToolMode, "chatToolMode");
        this.f77321d = chatToolMode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams) && kotlin.jvm.internal.o.b(this.f77321d, ((com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams) obj).f77321d);
    }

    public int hashCode() {
        return this.f77321d.hashCode();
    }

    public java.lang.String toString() {
        return "AppBrandLaunchModeParams(chatToolMode=" + this.f77321d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f77321d);
    }
}
