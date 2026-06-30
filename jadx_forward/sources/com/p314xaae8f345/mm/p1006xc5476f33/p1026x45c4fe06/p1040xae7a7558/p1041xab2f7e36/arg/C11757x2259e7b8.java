package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawRectActionArg */
/* loaded from: classes13.dex */
public class C11757x2259e7b8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11757x2259e7b8> f33527x681a0c0c = new b91.f();

    /* renamed from: e, reason: collision with root package name */
    public float f158597e;

    /* renamed from: f, reason: collision with root package name */
    public float f158598f;

    /* renamed from: g, reason: collision with root package name */
    public float f158599g;

    /* renamed from: h, reason: collision with root package name */
    public float f158600h;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158597e = parcel.readFloat();
        this.f158598f = parcel.readFloat();
        this.f158599g = parcel.readFloat();
        this.f158600h = parcel.readFloat();
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11757x2259e7b8) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11757x2259e7b8 c11757x2259e7b8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11757x2259e7b8) obj;
        return java.lang.Float.compare(c11757x2259e7b8.f158597e, this.f158597e) == 0 && java.lang.Float.compare(c11757x2259e7b8.f158598f, this.f158598f) == 0 && java.lang.Float.compare(c11757x2259e7b8.f158599g, this.f158599g) == 0 && java.lang.Float.compare(c11757x2259e7b8.f158600h, this.f158600h) == 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158597e), java.lang.Float.valueOf(this.f158598f), java.lang.Float.valueOf(this.f158599g), java.lang.Float.valueOf(this.f158600h));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158597e);
        parcel.writeFloat(this.f158598f);
        parcel.writeFloat(this.f158599g);
        parcel.writeFloat(this.f158600h);
    }
}
