package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionRadialArg */
/* loaded from: classes13.dex */
public class C11764x35ed2837 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11760xd89292d6 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11764x35ed2837> f33534x681a0c0c = new b91.m();

    /* renamed from: e, reason: collision with root package name */
    public float f158618e;

    /* renamed from: f, reason: collision with root package name */
    public float f158619f;

    /* renamed from: g, reason: collision with root package name */
    public float f158620g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f158621h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f158622i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        if (this.f158621h == null || this.f158622i == null) {
            return false;
        }
        iVar.f552245b.setShader(new android.graphics.RadialGradient(this.f158618e, this.f158619f, this.f158620g, this.f158621h, this.f158622i, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158618e = parcel.readFloat();
        this.f158619f = parcel.readFloat();
        this.f158620g = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f158621h = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f158622i = fArr;
            parcel.readFloatArray(fArr);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11760xd89292d6, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11764x35ed2837) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11764x35ed2837 c11764x35ed2837 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11764x35ed2837) obj;
        return java.lang.Float.compare(c11764x35ed2837.f158618e, this.f158618e) == 0 && java.lang.Float.compare(c11764x35ed2837.f158619f, this.f158619f) == 0 && java.lang.Float.compare(c11764x35ed2837.f158620g, this.f158620g) == 0 && java.util.Arrays.equals(this.f158621h, c11764x35ed2837.f158621h) && java.util.Arrays.equals(this.f158622i, c11764x35ed2837.f158622i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return (((java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158618e), java.lang.Float.valueOf(this.f158619f), java.lang.Float.valueOf(this.f158620g)) * 31) + java.util.Arrays.hashCode(this.f158621h)) * 31) + java.util.Arrays.hashCode(this.f158622i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158618e);
        parcel.writeFloat(this.f158619f);
        parcel.writeFloat(this.f158620g);
        int[] iArr = this.f158621h;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f158621h);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f158622i;
        if (fArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f158622i);
        }
    }
}
