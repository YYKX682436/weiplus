package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class SetTransformActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg> CREATOR = new b91.l0();

    /* renamed from: e, reason: collision with root package name */
    public float f77132e;

    /* renamed from: f, reason: collision with root package name */
    public float f77133f;

    /* renamed from: g, reason: collision with root package name */
    public float f77134g;

    /* renamed from: h, reason: collision with root package name */
    public float f77135h;

    /* renamed from: i, reason: collision with root package name */
    public float f77136i;

    /* renamed from: m, reason: collision with root package name */
    public float f77137m;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77132e = parcel.readFloat();
        this.f77133f = parcel.readFloat();
        this.f77134g = parcel.readFloat();
        this.f77135h = parcel.readFloat();
        this.f77136i = parcel.readFloat();
        this.f77137m = parcel.readFloat();
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg setTransformActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg) obj;
        return java.lang.Float.compare(setTransformActionArg.f77132e, this.f77132e) == 0 && java.lang.Float.compare(setTransformActionArg.f77133f, this.f77133f) == 0 && java.lang.Float.compare(setTransformActionArg.f77134g, this.f77134g) == 0 && java.lang.Float.compare(setTransformActionArg.f77135h, this.f77135h) == 0 && java.lang.Float.compare(setTransformActionArg.f77136i, this.f77136i) == 0 && java.lang.Float.compare(setTransformActionArg.f77137m, this.f77137m) == 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77132e), java.lang.Float.valueOf(this.f77133f), java.lang.Float.valueOf(this.f77134g), java.lang.Float.valueOf(this.f77135h), java.lang.Float.valueOf(this.f77136i), java.lang.Float.valueOf(this.f77137m));
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77135h);
        parcel.writeFloat(this.f77133f);
        parcel.writeFloat(this.f77134g);
        parcel.writeFloat(this.f77135h);
        parcel.writeFloat(this.f77136i);
        parcel.writeFloat(this.f77137m);
    }
}
