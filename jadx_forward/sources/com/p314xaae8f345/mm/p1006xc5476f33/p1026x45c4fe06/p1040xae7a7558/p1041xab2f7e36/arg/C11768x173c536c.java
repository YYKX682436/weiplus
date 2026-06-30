package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionRadialArg */
/* loaded from: classes13.dex */
public class C11768x173c536c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11765x829b89cb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11768x173c536c> f33538x681a0c0c = new b91.q();

    /* renamed from: e, reason: collision with root package name */
    public float f158630e;

    /* renamed from: f, reason: collision with root package name */
    public float f158631f;

    /* renamed from: g, reason: collision with root package name */
    public float f158632g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f158633h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f158634i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        if (this.f158633h == null || this.f158634i == null) {
            return false;
        }
        iVar.f552244a.setShader(new android.graphics.RadialGradient(this.f158630e, this.f158631f, this.f158632g, this.f158633h, this.f158634i, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158630e = parcel.readFloat();
        this.f158631f = parcel.readFloat();
        this.f158632g = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f158633h = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f158634i = fArr;
            parcel.readFloatArray(fArr);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11765x829b89cb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: equals */
    public boolean mo50000xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11768x173c536c) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11768x173c536c c11768x173c536c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11768x173c536c) obj;
        return java.lang.Float.compare(c11768x173c536c.f158630e, this.f158630e) == 0 && java.lang.Float.compare(c11768x173c536c.f158631f, this.f158631f) == 0 && java.lang.Float.compare(c11768x173c536c.f158632g, this.f158632g) == 0 && java.util.Arrays.equals(this.f158633h, c11768x173c536c.f158633h) && java.util.Arrays.equals(this.f158634i, c11768x173c536c.f158634i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return (((java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158630e), java.lang.Float.valueOf(this.f158631f), java.lang.Float.valueOf(this.f158632g)) * 31) + java.util.Arrays.hashCode(this.f158633h)) * 31) + java.util.Arrays.hashCode(this.f158634i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158630e);
        parcel.writeFloat(this.f158631f);
        parcel.writeFloat(this.f158632g);
        int[] iArr = this.f158633h;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f158633h);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f158634i;
        if (fArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f158634i);
        }
    }
}
