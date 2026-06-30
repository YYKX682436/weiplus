package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

/* loaded from: classes13.dex */
public class PathQuadraticCurveToActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg> CREATOR = new c91.i();

    /* renamed from: e, reason: collision with root package name */
    public float f77157e;

    /* renamed from: f, reason: collision with root package name */
    public float f77158f;

    /* renamed from: g, reason: collision with root package name */
    public float f77159g;

    /* renamed from: h, reason: collision with root package name */
    public float f77160h;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77157e = parcel.readFloat();
        this.f77158f = parcel.readFloat();
        this.f77159g = parcel.readFloat();
        this.f77160h = parcel.readFloat();
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj) || !(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg pathQuadraticCurveToActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg) obj;
        return pathQuadraticCurveToActionArg.f77157e == this.f77157e && pathQuadraticCurveToActionArg.f77158f == this.f77158f && pathQuadraticCurveToActionArg.f77159g == this.f77159g && pathQuadraticCurveToActionArg.f77160h == this.f77160h;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77157e);
        parcel.writeFloat(this.f77158f);
        parcel.writeFloat(this.f77159g);
        parcel.writeFloat(this.f77160h);
    }
}
