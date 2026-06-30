package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs */
/* loaded from: classes7.dex */
public final /* data */ class C11546x19c44775 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11546x19c44775> f33372x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pe();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f156412d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f156413e;

    public C11546x19c44775(java.lang.String sourceInstanceId, java.lang.String targetAppId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceInstanceId, "sourceInstanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetAppId, "targetAppId");
        this.f156412d = sourceInstanceId;
        this.f156413e = targetAppId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48833xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11546x19c44775)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11546x19c44775 c11546x19c44775 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11546x19c44775) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156412d, c11546x19c44775.f156412d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156413e, c11546x19c44775.f156413e);
    }

    /* renamed from: hashCode */
    public int m48834x8cdac1b() {
        return (this.f156412d.hashCode() * 31) + this.f156413e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m48835x9616526c() {
        return "MigrateRestartPreLaunchArgs(sourceInstanceId=" + this.f156412d + ", targetAppId=" + this.f156413e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f156412d);
        out.writeString(this.f156413e);
    }
}
