package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord", "Lft/c;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.appbrand.support.AppBrandProcessManagerServiceAnyProcess$ParcelizedAppRecord */
/* loaded from: classes7.dex */
public final /* data */ class C10459x397611e9 implements ft.c, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9> f28809x681a0c0c = new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f146577d;

    /* renamed from: e, reason: collision with root package name */
    public final ft.d f146578e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f146579f;

    public C10459x397611e9(java.lang.String appId, ft.d appType, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appType, "appType");
        this.f146577d = appId;
        this.f146578e = appType;
        this.f146579f = z17;
    }

    @Override // ft.c
    /* renamed from: a, reason: from getter */
    public boolean getF146579f() {
        return this.f146579f;
    }

    @Override // ft.c
    /* renamed from: b, reason: from getter */
    public java.lang.String getF146577d() {
        return this.f146577d;
    }

    @Override // ft.c
    /* renamed from: c, reason: from getter */
    public ft.d getF146578e() {
        return this.f146578e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m43828xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9 c10459x397611e9 = (com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.C10459x397611e9) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f146577d, c10459x397611e9.f146577d) && this.f146578e == c10459x397611e9.f146578e && this.f146579f == c10459x397611e9.f146579f;
    }

    /* renamed from: hashCode */
    public int m43829x8cdac1b() {
        return (((this.f146577d.hashCode() * 31) + this.f146578e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f146579f);
    }

    /* renamed from: toString */
    public java.lang.String m43830x9616526c() {
        return "ParcelizedAppRecord(appId='" + this.f146577d + "', appType=" + this.f146578e + ", isHeadlessMode=" + this.f146579f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f146577d);
        ft.d dVar = this.f146578e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dVar, "<this>");
        out.writeInt(dVar.ordinal());
        out.writeInt(this.f146579f ? 1 : 0);
    }
}
