package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionLinearArg */
/* loaded from: classes13.dex */
public class C11766xe6d8c8a6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11765x829b89cb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11766xe6d8c8a6> f33536x681a0c0c = new b91.o();

    /* renamed from: e, reason: collision with root package name */
    public float f158623e;

    /* renamed from: f, reason: collision with root package name */
    public float f158624f;

    /* renamed from: g, reason: collision with root package name */
    public float f158625g;

    /* renamed from: h, reason: collision with root package name */
    public float f158626h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f158627i;

    /* renamed from: m, reason: collision with root package name */
    public float[] f158628m;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        if (this.f158627i == null || this.f158628m == null) {
            return false;
        }
        iVar.f552244a.setShader(new android.graphics.LinearGradient(this.f158623e, this.f158624f, this.f158625g, this.f158626h, this.f158627i, this.f158628m, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158623e = parcel.readFloat();
        this.f158624f = parcel.readFloat();
        this.f158625g = parcel.readFloat();
        this.f158626h = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f158627i = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f158628m = fArr;
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11766xe6d8c8a6) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11766xe6d8c8a6 c11766xe6d8c8a6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11766xe6d8c8a6) obj;
        return java.lang.Float.compare(c11766xe6d8c8a6.f158623e, this.f158623e) == 0 && java.lang.Float.compare(c11766xe6d8c8a6.f158624f, this.f158624f) == 0 && java.lang.Float.compare(c11766xe6d8c8a6.f158625g, this.f158625g) == 0 && java.lang.Float.compare(c11766xe6d8c8a6.f158626h, this.f158626h) == 0 && java.util.Arrays.equals(this.f158627i, c11766xe6d8c8a6.f158627i) && java.util.Arrays.equals(this.f158628m, c11766xe6d8c8a6.f158628m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return (((java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158623e), java.lang.Float.valueOf(this.f158624f), java.lang.Float.valueOf(this.f158625g), java.lang.Float.valueOf(this.f158626h)) * 31) + java.util.Arrays.hashCode(this.f158627i)) * 31) + java.util.Arrays.hashCode(this.f158628m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158623e);
        parcel.writeFloat(this.f158624f);
        parcel.writeFloat(this.f158625g);
        parcel.writeFloat(this.f158626h);
        int[] iArr = this.f158627i;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f158627i);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f158628m;
        if (fArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f158628m);
        }
    }
}
