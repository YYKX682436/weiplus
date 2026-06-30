package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg */
/* loaded from: classes13.dex */
public class C11784x64304b71 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11784x64304b71> f33554x681a0c0c = new b91.g0();

    /* renamed from: e, reason: collision with root package name */
    public int f158653e;

    /* renamed from: f, reason: collision with root package name */
    public int f158654f;

    /* renamed from: g, reason: collision with root package name */
    public int f158655g;

    /* renamed from: h, reason: collision with root package name */
    public int f158656h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f158657i;

    public C11784x64304b71(android.os.Parcel parcel) {
        super(parcel);
        this.f158657i = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158653e = parcel.readInt();
        this.f158654f = parcel.readInt();
        this.f158655g = parcel.readInt();
        this.f158656h = parcel.readInt();
        this.f158657i = (android.graphics.Bitmap) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11784x64304b71.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11784x64304b71) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11784x64304b71 c11784x64304b71 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11784x64304b71) obj;
        return this.f158653e == c11784x64304b71.f158653e && this.f158654f == c11784x64304b71.f158654f && this.f158655g == c11784x64304b71.f158655g && this.f158656h == c11784x64304b71.f158656h && java.util.Objects.equals(this.f158657i, c11784x64304b71.f158657i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Integer.valueOf(this.f158653e), java.lang.Integer.valueOf(this.f158654f), java.lang.Integer.valueOf(this.f158655g), java.lang.Integer.valueOf(this.f158656h), this.f158657i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeInt(this.f158653e);
        parcel.writeInt(this.f158654f);
        parcel.writeInt(this.f158655g);
        parcel.writeInt(this.f158656h);
        parcel.writeParcelable(this.f158657i, i17);
    }
}
