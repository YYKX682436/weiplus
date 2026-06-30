package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class RealSetFillStyleActionLinearArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionLinearArg> CREATOR = new b91.j();

    /* renamed from: e, reason: collision with root package name */
    public float f77076e;

    /* renamed from: f, reason: collision with root package name */
    public float f77077f;

    /* renamed from: g, reason: collision with root package name */
    public float f77078g;

    /* renamed from: h, reason: collision with root package name */
    public float f77079h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f77080i;

    /* renamed from: m, reason: collision with root package name */
    public float[] f77081m;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        if (this.f77080i == null || this.f77081m == null) {
            return false;
        }
        iVar.f470712b.setShader(new android.graphics.LinearGradient(this.f77076e, this.f77077f, this.f77078g, this.f77079h, this.f77080i, this.f77081m, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77076e = parcel.readFloat();
        this.f77077f = parcel.readFloat();
        this.f77078g = parcel.readFloat();
        this.f77079h = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f77080i = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f77081m = fArr;
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionLinearArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionLinearArg realSetFillStyleActionLinearArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionLinearArg) obj;
        return java.lang.Float.compare(realSetFillStyleActionLinearArg.f77076e, this.f77076e) == 0 && java.lang.Float.compare(realSetFillStyleActionLinearArg.f77077f, this.f77077f) == 0 && java.lang.Float.compare(realSetFillStyleActionLinearArg.f77078g, this.f77078g) == 0 && java.lang.Float.compare(realSetFillStyleActionLinearArg.f77079h, this.f77079h) == 0 && java.util.Arrays.equals(this.f77080i, realSetFillStyleActionLinearArg.f77080i) && java.util.Arrays.equals(this.f77081m, realSetFillStyleActionLinearArg.f77081m);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return (((java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77076e), java.lang.Float.valueOf(this.f77077f), java.lang.Float.valueOf(this.f77078g), java.lang.Float.valueOf(this.f77079h)) * 31) + java.util.Arrays.hashCode(this.f77080i)) * 31) + java.util.Arrays.hashCode(this.f77081m);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77076e);
        parcel.writeFloat(this.f77077f);
        parcel.writeFloat(this.f77078g);
        parcel.writeFloat(this.f77079h);
        int[] iArr = this.f77080i;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f77080i);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f77081m;
        if (fArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f77081m);
        }
    }
}
