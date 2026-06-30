package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class RealSetStrokeStyleActionLinearArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionLinearArg> CREATOR = new b91.o();

    /* renamed from: e, reason: collision with root package name */
    public float f77090e;

    /* renamed from: f, reason: collision with root package name */
    public float f77091f;

    /* renamed from: g, reason: collision with root package name */
    public float f77092g;

    /* renamed from: h, reason: collision with root package name */
    public float f77093h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f77094i;

    /* renamed from: m, reason: collision with root package name */
    public float[] f77095m;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        if (this.f77094i == null || this.f77095m == null) {
            return false;
        }
        iVar.f470711a.setShader(new android.graphics.LinearGradient(this.f77090e, this.f77091f, this.f77092g, this.f77093h, this.f77094i, this.f77095m, android.graphics.Shader.TileMode.CLAMP));
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77090e = parcel.readFloat();
        this.f77091f = parcel.readFloat();
        this.f77092g = parcel.readFloat();
        this.f77093h = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f77094i = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f77095m = fArr;
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionLinearArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionLinearArg realSetStrokeStyleActionLinearArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionLinearArg) obj;
        return java.lang.Float.compare(realSetStrokeStyleActionLinearArg.f77090e, this.f77090e) == 0 && java.lang.Float.compare(realSetStrokeStyleActionLinearArg.f77091f, this.f77091f) == 0 && java.lang.Float.compare(realSetStrokeStyleActionLinearArg.f77092g, this.f77092g) == 0 && java.lang.Float.compare(realSetStrokeStyleActionLinearArg.f77093h, this.f77093h) == 0 && java.util.Arrays.equals(this.f77094i, realSetStrokeStyleActionLinearArg.f77094i) && java.util.Arrays.equals(this.f77095m, realSetStrokeStyleActionLinearArg.f77095m);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return (((java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77090e), java.lang.Float.valueOf(this.f77091f), java.lang.Float.valueOf(this.f77092g), java.lang.Float.valueOf(this.f77093h)) * 31) + java.util.Arrays.hashCode(this.f77094i)) * 31) + java.util.Arrays.hashCode(this.f77095m);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77090e);
        parcel.writeFloat(this.f77091f);
        parcel.writeFloat(this.f77092g);
        parcel.writeFloat(this.f77093h);
        int[] iArr = this.f77094i;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f77094i);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f77095m;
        if (fArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f77095m);
        }
    }
}
