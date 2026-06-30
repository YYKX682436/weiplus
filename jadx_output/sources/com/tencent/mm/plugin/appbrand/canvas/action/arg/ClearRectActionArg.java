package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class ClearRectActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg> CREATOR = new b91.a();

    /* renamed from: e, reason: collision with root package name */
    public float f77042e;

    /* renamed from: f, reason: collision with root package name */
    public float f77043f;

    /* renamed from: g, reason: collision with root package name */
    public float f77044g;

    /* renamed from: h, reason: collision with root package name */
    public float f77045h;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77042e = parcel.readFloat();
        this.f77043f = parcel.readFloat();
        this.f77044g = parcel.readFloat();
        this.f77045h = parcel.readFloat();
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg clearRectActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg) obj;
        return java.lang.Float.compare(clearRectActionArg.f77042e, this.f77042e) == 0 && java.lang.Float.compare(clearRectActionArg.f77043f, this.f77043f) == 0 && java.lang.Float.compare(clearRectActionArg.f77044g, this.f77044g) == 0 && java.lang.Float.compare(clearRectActionArg.f77045h, this.f77045h) == 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77042e), java.lang.Float.valueOf(this.f77043f), java.lang.Float.valueOf(this.f77044g), java.lang.Float.valueOf(this.f77045h));
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77042e);
        parcel.writeFloat(this.f77043f);
        parcel.writeFloat(this.f77044g);
        parcel.writeFloat(this.f77045h);
    }
}
