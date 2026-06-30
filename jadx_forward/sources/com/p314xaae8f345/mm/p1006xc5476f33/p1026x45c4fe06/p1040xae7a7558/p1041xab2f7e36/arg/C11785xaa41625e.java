package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg */
/* loaded from: classes13.dex */
public class C11785xaa41625e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11785xaa41625e> f33555x681a0c0c = new b91.h0();

    /* renamed from: e, reason: collision with root package name */
    public float f158658e;

    /* renamed from: f, reason: collision with root package name */
    public float f158659f;

    /* renamed from: g, reason: collision with root package name */
    public float f158660g;

    /* renamed from: h, reason: collision with root package name */
    public int f158661h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158658e = parcel.readFloat();
        this.f158659f = parcel.readFloat();
        this.f158660g = parcel.readFloat();
        this.f158661h = parcel.readInt();
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11785xaa41625e) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11785xaa41625e c11785xaa41625e = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11785xaa41625e) obj;
        return java.lang.Float.compare(c11785xaa41625e.f158658e, this.f158658e) == 0 && java.lang.Float.compare(c11785xaa41625e.f158659f, this.f158659f) == 0 && java.lang.Float.compare(c11785xaa41625e.f158660g, this.f158660g) == 0 && this.f158661h == c11785xaa41625e.f158661h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158658e), java.lang.Float.valueOf(this.f158659f), java.lang.Float.valueOf(this.f158660g), java.lang.Integer.valueOf(this.f158661h));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158658e);
        parcel.writeFloat(this.f158659f);
        parcel.writeFloat(this.f158660g);
        parcel.writeInt(this.f158661h);
    }
}
