package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class DrawArcActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg> CREATOR = new b91.d();

    /* renamed from: e, reason: collision with root package name */
    public float f77049e;

    /* renamed from: f, reason: collision with root package name */
    public float f77050f;

    /* renamed from: g, reason: collision with root package name */
    public float f77051g;

    /* renamed from: h, reason: collision with root package name */
    public float f77052h;

    /* renamed from: i, reason: collision with root package name */
    public float f77053i;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77049e = parcel.readFloat();
        this.f77050f = parcel.readFloat();
        this.f77051g = parcel.readFloat();
        this.f77052h = parcel.readFloat();
        this.f77053i = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg drawArcActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg) obj;
        return java.lang.Float.compare(drawArcActionArg.f77049e, this.f77049e) == 0 && java.lang.Float.compare(drawArcActionArg.f77050f, this.f77050f) == 0 && java.lang.Float.compare(drawArcActionArg.f77051g, this.f77051g) == 0 && java.lang.Float.compare(drawArcActionArg.f77052h, this.f77052h) == 0 && java.lang.Float.compare(drawArcActionArg.f77053i, this.f77053i) == 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77049e), java.lang.Float.valueOf(this.f77050f), java.lang.Float.valueOf(this.f77051g), java.lang.Float.valueOf(this.f77052h), java.lang.Float.valueOf(this.f77053i));
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77049e);
        parcel.writeFloat(this.f77050f);
        parcel.writeFloat(this.f77051g);
        parcel.writeFloat(this.f77052h);
        parcel.writeFloat(this.f77053i);
    }
}
