package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class DrawRectActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawRectActionArg> CREATOR = new b91.f();

    /* renamed from: e, reason: collision with root package name */
    public float f77064e;

    /* renamed from: f, reason: collision with root package name */
    public float f77065f;

    /* renamed from: g, reason: collision with root package name */
    public float f77066g;

    /* renamed from: h, reason: collision with root package name */
    public float f77067h;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77064e = parcel.readFloat();
        this.f77065f = parcel.readFloat();
        this.f77066g = parcel.readFloat();
        this.f77067h = parcel.readFloat();
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawRectActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawRectActionArg drawRectActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawRectActionArg) obj;
        return java.lang.Float.compare(drawRectActionArg.f77064e, this.f77064e) == 0 && java.lang.Float.compare(drawRectActionArg.f77065f, this.f77065f) == 0 && java.lang.Float.compare(drawRectActionArg.f77066g, this.f77066g) == 0 && java.lang.Float.compare(drawRectActionArg.f77067h, this.f77067h) == 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77064e), java.lang.Float.valueOf(this.f77065f), java.lang.Float.valueOf(this.f77066g), java.lang.Float.valueOf(this.f77067h));
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77064e);
        parcel.writeFloat(this.f77065f);
        parcel.writeFloat(this.f77066g);
        parcel.writeFloat(this.f77067h);
    }
}
