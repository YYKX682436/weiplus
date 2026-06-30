package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class DrawImageActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg> CREATOR = new b91.e();

    /* renamed from: e, reason: collision with root package name */
    public int f77054e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f77055f;

    /* renamed from: g, reason: collision with root package name */
    public float f77056g;

    /* renamed from: h, reason: collision with root package name */
    public float f77057h;

    /* renamed from: i, reason: collision with root package name */
    public float f77058i;

    /* renamed from: m, reason: collision with root package name */
    public float f77059m;

    /* renamed from: n, reason: collision with root package name */
    public int f77060n;

    /* renamed from: o, reason: collision with root package name */
    public int f77061o;

    /* renamed from: p, reason: collision with root package name */
    public int f77062p;

    /* renamed from: q, reason: collision with root package name */
    public int f77063q;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77054e = parcel.readInt();
        this.f77055f = parcel.readString();
        this.f77056g = parcel.readFloat();
        this.f77057h = parcel.readFloat();
        this.f77058i = parcel.readFloat();
        this.f77059m = parcel.readFloat();
        this.f77060n = parcel.readInt();
        this.f77061o = parcel.readInt();
        this.f77062p = parcel.readInt();
        this.f77063q = parcel.readInt();
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg drawImageActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg) obj;
        return this.f77054e == drawImageActionArg.f77054e && java.lang.Float.compare(drawImageActionArg.f77056g, this.f77056g) == 0 && java.lang.Float.compare(drawImageActionArg.f77057h, this.f77057h) == 0 && java.lang.Float.compare(drawImageActionArg.f77058i, this.f77058i) == 0 && java.lang.Float.compare(drawImageActionArg.f77059m, this.f77059m) == 0 && this.f77060n == drawImageActionArg.f77060n && this.f77061o == drawImageActionArg.f77061o && this.f77062p == drawImageActionArg.f77062p && this.f77063q == drawImageActionArg.f77063q && java.util.Objects.equals(this.f77055f, drawImageActionArg.f77055f);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Integer.valueOf(this.f77054e), this.f77055f, java.lang.Float.valueOf(this.f77056g), java.lang.Float.valueOf(this.f77057h), java.lang.Float.valueOf(this.f77058i), java.lang.Float.valueOf(this.f77059m), java.lang.Integer.valueOf(this.f77060n), java.lang.Integer.valueOf(this.f77061o), java.lang.Integer.valueOf(this.f77062p), java.lang.Integer.valueOf(this.f77063q));
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeInt(this.f77054e);
        parcel.writeString(this.f77055f);
        parcel.writeFloat(this.f77056g);
        parcel.writeFloat(this.f77057h);
        parcel.writeFloat(this.f77058i);
        parcel.writeFloat(this.f77059m);
        parcel.writeInt(this.f77060n);
        parcel.writeInt(this.f77061o);
        parcel.writeInt(this.f77062p);
        parcel.writeInt(this.f77063q);
    }
}
