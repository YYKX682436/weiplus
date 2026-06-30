package com.tencent.mm.feature.appbrand.support;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord", "Lft/c;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord implements ft.c, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord> CREATOR = new com.tencent.mm.feature.appbrand.support.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65044d;

    /* renamed from: e, reason: collision with root package name */
    public final ft.d f65045e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f65046f;

    public AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord(java.lang.String appId, ft.d appType, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(appType, "appType");
        this.f65044d = appId;
        this.f65045e = appType;
        this.f65046f = z17;
    }

    @Override // ft.c
    /* renamed from: a, reason: from getter */
    public boolean getF65046f() {
        return this.f65046f;
    }

    @Override // ft.c
    /* renamed from: b, reason: from getter */
    public java.lang.String getF65044d() {
        return this.f65044d;
    }

    @Override // ft.c
    /* renamed from: c, reason: from getter */
    public ft.d getF65045e() {
        return this.f65045e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord)) {
            return false;
        }
        com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord appBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord = (com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord) obj;
        return kotlin.jvm.internal.o.b(this.f65044d, appBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord.f65044d) && this.f65045e == appBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord.f65045e && this.f65046f == appBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord.f65046f;
    }

    public int hashCode() {
        return (((this.f65044d.hashCode() * 31) + this.f65045e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f65046f);
    }

    public java.lang.String toString() {
        return "ParcelizedAppRecord(appId='" + this.f65044d + "', appType=" + this.f65045e + ", isHeadlessMode=" + this.f65046f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f65044d);
        ft.d dVar = this.f65045e;
        kotlin.jvm.internal.o.g(dVar, "<this>");
        out.writeInt(dVar.ordinal());
        out.writeInt(this.f65046f ? 1 : 0);
    }
}
