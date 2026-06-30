package com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a;

/* renamed from: com.tencent.mm.sandbox.monitor.ErrLog$PreventError */
/* loaded from: classes11.dex */
class C20965x2a3a27f5 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20965x2a3a27f5> f39171x681a0c0c = new com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.h();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f273812d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f273813e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3 f273814f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f273815g;

    public C20965x2a3a27f5(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3 c20964xc27324c3, java.lang.String str3) {
        this.f273812d = str;
        this.f273813e = str2;
        this.f273814f = c20964xc27324c3;
        this.f273815g = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m77656x9616526c() {
        return "PreventError{username='" + this.f273812d + "', tag='" + this.f273813e + "', err=" + this.f273814f + ", processName='" + this.f273815g + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f273812d);
        parcel.writeString(this.f273813e);
        parcel.writeParcelable(this.f273814f, i17);
        parcel.writeString(this.f273815g);
    }

    public C20965x2a3a27f5(android.os.Parcel parcel) {
        this.f273812d = parcel.readString();
        this.f273813e = parcel.readString();
        this.f273814f = (com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3) parcel.readParcelable(com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.C20964xc27324c3.class.getClassLoader());
        this.f273815g = parcel.readString();
    }
}
