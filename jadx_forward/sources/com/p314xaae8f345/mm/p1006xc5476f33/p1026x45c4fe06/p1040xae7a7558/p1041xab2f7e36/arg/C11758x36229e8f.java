package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg */
/* loaded from: classes13.dex */
public class C11758x36229e8f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11758x36229e8f> f33528x681a0c0c = new b91.g();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f158601e;

    /* renamed from: f, reason: collision with root package name */
    public float f158602f;

    /* renamed from: g, reason: collision with root package name */
    public float f158603g;

    /* renamed from: h, reason: collision with root package name */
    public float f158604h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158601e = parcel.readString();
        this.f158602f = parcel.readFloat();
        this.f158603g = parcel.readFloat();
        this.f158604h = parcel.readFloat();
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11758x36229e8f) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11758x36229e8f c11758x36229e8f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11758x36229e8f) obj;
        return java.lang.Float.compare(c11758x36229e8f.f158602f, this.f158602f) == 0 && java.lang.Float.compare(c11758x36229e8f.f158603g, this.f158603g) == 0 && java.lang.Float.compare(c11758x36229e8f.f158604h, this.f158604h) == 0 && java.util.Objects.equals(this.f158601e, c11758x36229e8f.f158601e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), this.f158601e, java.lang.Float.valueOf(this.f158602f), java.lang.Float.valueOf(this.f158603g), java.lang.Float.valueOf(this.f158604h));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeString(this.f158601e);
        parcel.writeFloat(this.f158602f);
        parcel.writeFloat(this.f158603g);
        parcel.writeFloat(this.f158604h);
    }
}
