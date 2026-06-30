package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class RealSetStrokeStyleActionRadialArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionRadialArg> CREATOR = new b91.q();

    /* renamed from: e, reason: collision with root package name */
    public float f77097e;

    /* renamed from: f, reason: collision with root package name */
    public float f77098f;

    /* renamed from: g, reason: collision with root package name */
    public float f77099g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f77100h;

    /* renamed from: i, reason: collision with root package name */
    public float[] f77101i;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        if (this.f77100h == null || this.f77101i == null) {
            return false;
        }
        iVar.f470711a.setShader(new android.graphics.RadialGradient(this.f77097e, this.f77098f, this.f77099g, this.f77100h, this.f77101i, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77097e = parcel.readFloat();
        this.f77098f = parcel.readFloat();
        this.f77099g = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f77100h = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f77101i = fArr;
            parcel.readFloatArray(fArr);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionArg, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionRadialArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionRadialArg realSetStrokeStyleActionRadialArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionRadialArg) obj;
        return java.lang.Float.compare(realSetStrokeStyleActionRadialArg.f77097e, this.f77097e) == 0 && java.lang.Float.compare(realSetStrokeStyleActionRadialArg.f77098f, this.f77098f) == 0 && java.lang.Float.compare(realSetStrokeStyleActionRadialArg.f77099g, this.f77099g) == 0 && java.util.Arrays.equals(this.f77100h, realSetStrokeStyleActionRadialArg.f77100h) && java.util.Arrays.equals(this.f77101i, realSetStrokeStyleActionRadialArg.f77101i);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return (((java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77097e), java.lang.Float.valueOf(this.f77098f), java.lang.Float.valueOf(this.f77099g)) * 31) + java.util.Arrays.hashCode(this.f77100h)) * 31) + java.util.Arrays.hashCode(this.f77101i);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77097e);
        parcel.writeFloat(this.f77098f);
        parcel.writeFloat(this.f77099g);
        int[] iArr = this.f77100h;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f77100h);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f77101i;
        if (fArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f77101i);
        }
    }
}
