package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionLinearArg */
/* loaded from: classes13.dex */
public class C11761x5899d71 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11760xd89292d6 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11761x5899d71> f33531x681a0c0c = new b91.j();

    /* renamed from: e, reason: collision with root package name */
    public float f158609e;

    /* renamed from: f, reason: collision with root package name */
    public float f158610f;

    /* renamed from: g, reason: collision with root package name */
    public float f158611g;

    /* renamed from: h, reason: collision with root package name */
    public float f158612h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f158613i;

    /* renamed from: m, reason: collision with root package name */
    public float[] f158614m;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        if (this.f158613i == null || this.f158614m == null) {
            return false;
        }
        iVar.f552245b.setShader(new android.graphics.LinearGradient(this.f158609e, this.f158610f, this.f158611g, this.f158612h, this.f158613i, this.f158614m, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    public void b(android.os.Parcel parcel) {
        this.f158574d = parcel.readString();
        this.f158609e = parcel.readFloat();
        this.f158610f = parcel.readFloat();
        this.f158611g = parcel.readFloat();
        this.f158612h = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f158613i = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f158614m = fArr;
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
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11761x5899d71) || !super.mo50000xb2c87fbf(obj)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11761x5899d71 c11761x5899d71 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.C11761x5899d71) obj;
        return java.lang.Float.compare(c11761x5899d71.f158609e, this.f158609e) == 0 && java.lang.Float.compare(c11761x5899d71.f158610f, this.f158610f) == 0 && java.lang.Float.compare(c11761x5899d71.f158611g, this.f158611g) == 0 && java.lang.Float.compare(c11761x5899d71.f158612h, this.f158612h) == 0 && java.util.Arrays.equals(this.f158613i, c11761x5899d71.f158613i) && java.util.Arrays.equals(this.f158614m, c11761x5899d71.f158614m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb
    /* renamed from: hashCode */
    public int mo50001x8cdac1b() {
        return (((java.util.Objects.hash(java.lang.Integer.valueOf(super.mo50001x8cdac1b()), java.lang.Float.valueOf(this.f158609e), java.lang.Float.valueOf(this.f158610f), java.lang.Float.valueOf(this.f158611g), java.lang.Float.valueOf(this.f158612h)) * 31) + java.util.Arrays.hashCode(this.f158613i)) * 31) + java.util.Arrays.hashCode(this.f158614m);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1040xae7a7558.p1041xab2f7e36.arg.AbstractC11750x219b3eb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f158574d);
        parcel.writeFloat(this.f158609e);
        parcel.writeFloat(this.f158610f);
        parcel.writeFloat(this.f158611g);
        parcel.writeFloat(this.f158612h);
        int[] iArr = this.f158613i;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f158613i);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f158614m;
        if (fArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f158614m);
        }
    }
}
