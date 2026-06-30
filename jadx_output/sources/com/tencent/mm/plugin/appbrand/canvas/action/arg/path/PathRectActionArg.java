package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

/* loaded from: classes13.dex */
public class PathRectActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg> CREATOR = new c91.j();

    /* renamed from: e, reason: collision with root package name */
    public float f77161e;

    /* renamed from: f, reason: collision with root package name */
    public float f77162f;

    /* renamed from: g, reason: collision with root package name */
    public float f77163g;

    /* renamed from: h, reason: collision with root package name */
    public float f77164h;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77161e = parcel.readFloat();
        this.f77162f = parcel.readFloat();
        this.f77163g = parcel.readFloat();
        this.f77164h = parcel.readFloat();
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj) || !(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg pathRectActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg) obj;
        return pathRectActionArg.f77161e == this.f77161e && pathRectActionArg.f77162f == this.f77162f && pathRectActionArg.f77163g == this.f77163g && pathRectActionArg.f77164h == this.f77164h;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77161e);
        parcel.writeFloat(this.f77162f);
        parcel.writeFloat(this.f77163g);
        parcel.writeFloat(this.f77164h);
    }
}
