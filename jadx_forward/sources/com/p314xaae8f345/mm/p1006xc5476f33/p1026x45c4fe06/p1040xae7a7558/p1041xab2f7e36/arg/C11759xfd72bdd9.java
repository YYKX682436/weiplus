package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg */
/* loaded from: classes13.dex */
public class C11759xfd72bdd9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11759xfd72bdd9> f33529x681a0c0c = new b91.h();

    /* renamed from: e, reason: collision with root package name */
    public float f158605e;

    /* renamed from: f, reason: collision with root package name */
    public float f158606f;

    /* renamed from: g, reason: collision with root package name */
    public float f158607g;

    /* renamed from: h, reason: collision with root package name */
    public float f158608h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158605e = parcel.readFloat();
        this.f158606f = parcel.readFloat();
        this.f158607g = parcel.readFloat();
        this.f158608h = parcel.readFloat();
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11759xfd72bdd9) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11759xfd72bdd9 c11759xfd72bdd9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11759xfd72bdd9) obj;
        return java.lang.Float.compare(c11759xfd72bdd9.f158605e, this.f158605e) == 0 && java.lang.Float.compare(c11759xfd72bdd9.f158606f, this.f158606f) == 0 && java.lang.Float.compare(c11759xfd72bdd9.f158607g, this.f158607g) == 0 && java.lang.Float.compare(c11759xfd72bdd9.f158608h, this.f158608h) == 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158605e), java.lang.Float.valueOf(this.f158606f), java.lang.Float.valueOf(this.f158607g), java.lang.Float.valueOf(this.f158608h));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158605e);
        parcel.writeFloat(this.f158606f);
        parcel.writeFloat(this.f158607g);
        parcel.writeFloat(this.f158608h);
    }
}
