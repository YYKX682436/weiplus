package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

/* loaded from: classes13.dex */
public class PathBezierCurveToActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg> CREATOR = new c91.e();

    /* renamed from: e, reason: collision with root package name */
    public float f77147e;

    /* renamed from: f, reason: collision with root package name */
    public float f77148f;

    /* renamed from: g, reason: collision with root package name */
    public float f77149g;

    /* renamed from: h, reason: collision with root package name */
    public float f77150h;

    /* renamed from: i, reason: collision with root package name */
    public float f77151i;

    /* renamed from: m, reason: collision with root package name */
    public float f77152m;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77147e = parcel.readFloat();
        this.f77148f = parcel.readFloat();
        this.f77149g = parcel.readFloat();
        this.f77150h = parcel.readFloat();
        this.f77151i = parcel.readFloat();
        this.f77152m = parcel.readFloat();
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj) || !(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg pathBezierCurveToActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg) obj;
        return pathBezierCurveToActionArg.f77147e == this.f77147e && pathBezierCurveToActionArg.f77148f == this.f77148f && pathBezierCurveToActionArg.f77149g == this.f77149g && pathBezierCurveToActionArg.f77150h == this.f77150h && pathBezierCurveToActionArg.f77151i == this.f77151i && pathBezierCurveToActionArg.f77152m == this.f77152m;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77147e);
        parcel.writeFloat(this.f77148f);
        parcel.writeFloat(this.f77149g);
        parcel.writeFloat(this.f77150h);
        parcel.writeFloat(this.f77149g);
        parcel.writeFloat(this.f77150h);
    }
}
