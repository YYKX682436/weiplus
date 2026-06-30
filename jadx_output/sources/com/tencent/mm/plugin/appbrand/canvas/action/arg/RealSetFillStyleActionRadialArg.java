package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class RealSetFillStyleActionRadialArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionRadialArg> CREATOR = new b91.m();

    /* renamed from: e, reason: collision with root package name */
    public float f77085e;

    /* renamed from: f, reason: collision with root package name */
    public float f77086f;

    /* renamed from: g, reason: collision with root package name */
    public float f77087g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f77088h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f77089i;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        if (this.f77088h == null || this.f77089i == null) {
            return false;
        }
        iVar.f470712b.setShader(new android.graphics.RadialGradient(this.f77085e, this.f77086f, this.f77087g, this.f77088h, this.f77089i, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77085e = parcel.readFloat();
        this.f77086f = parcel.readFloat();
        this.f77087g = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f77088h = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f77089i = fArr;
            parcel.readFloatArray(fArr);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionRadialArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionRadialArg realSetFillStyleActionRadialArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionRadialArg) obj;
        return java.lang.Float.compare(realSetFillStyleActionRadialArg.f77085e, this.f77085e) == 0 && java.lang.Float.compare(realSetFillStyleActionRadialArg.f77086f, this.f77086f) == 0 && java.lang.Float.compare(realSetFillStyleActionRadialArg.f77087g, this.f77087g) == 0 && java.util.Arrays.equals(this.f77088h, realSetFillStyleActionRadialArg.f77088h) && java.util.Arrays.equals(this.f77089i, realSetFillStyleActionRadialArg.f77089i);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return (((java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77085e), java.lang.Float.valueOf(this.f77086f), java.lang.Float.valueOf(this.f77087g)) * 31) + java.util.Arrays.hashCode(this.f77088h)) * 31) + java.util.Arrays.hashCode(this.f77089i);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77085e);
        parcel.writeFloat(this.f77086f);
        parcel.writeFloat(this.f77087g);
        int[] iArr = this.f77088h;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f77088h);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f77089i;
        if (fArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f77089i);
        }
    }
}
