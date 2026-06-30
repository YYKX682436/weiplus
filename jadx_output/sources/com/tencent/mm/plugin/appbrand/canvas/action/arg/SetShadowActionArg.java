package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class SetShadowActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg> CREATOR = new b91.h0();

    /* renamed from: e, reason: collision with root package name */
    public float f77125e;

    /* renamed from: f, reason: collision with root package name */
    public float f77126f;

    /* renamed from: g, reason: collision with root package name */
    public float f77127g;

    /* renamed from: h, reason: collision with root package name */
    public int f77128h;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77125e = parcel.readFloat();
        this.f77126f = parcel.readFloat();
        this.f77127g = parcel.readFloat();
        this.f77128h = parcel.readInt();
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg setShadowActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg) obj;
        return java.lang.Float.compare(setShadowActionArg.f77125e, this.f77125e) == 0 && java.lang.Float.compare(setShadowActionArg.f77126f, this.f77126f) == 0 && java.lang.Float.compare(setShadowActionArg.f77127g, this.f77127g) == 0 && this.f77128h == setShadowActionArg.f77128h;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77125e), java.lang.Float.valueOf(this.f77126f), java.lang.Float.valueOf(this.f77127g), java.lang.Integer.valueOf(this.f77128h));
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77125e);
        parcel.writeFloat(this.f77126f);
        parcel.writeFloat(this.f77127g);
        parcel.writeInt(this.f77128h);
    }
}
