package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class DrawTextActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg> CREATOR = new b91.g();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77068e;

    /* renamed from: f, reason: collision with root package name */
    public float f77069f;

    /* renamed from: g, reason: collision with root package name */
    public float f77070g;

    /* renamed from: h, reason: collision with root package name */
    public float f77071h;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77068e = parcel.readString();
        this.f77069f = parcel.readFloat();
        this.f77070g = parcel.readFloat();
        this.f77071h = parcel.readFloat();
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg drawTextActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg) obj;
        return java.lang.Float.compare(drawTextActionArg.f77069f, this.f77069f) == 0 && java.lang.Float.compare(drawTextActionArg.f77070g, this.f77070g) == 0 && java.lang.Float.compare(drawTextActionArg.f77071h, this.f77071h) == 0 && java.util.Objects.equals(this.f77068e, drawTextActionArg.f77068e);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), this.f77068e, java.lang.Float.valueOf(this.f77069f), java.lang.Float.valueOf(this.f77070g), java.lang.Float.valueOf(this.f77071h));
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeString(this.f77068e);
        parcel.writeFloat(this.f77069f);
        parcel.writeFloat(this.f77070g);
        parcel.writeFloat(this.f77071h);
    }
}
