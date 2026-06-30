package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

/* loaded from: classes13.dex */
public abstract class PathActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg {

    /* renamed from: e, reason: collision with root package name */
    public float f77140e;

    /* renamed from: f, reason: collision with root package name */
    public float f77141f;

    /* renamed from: g, reason: collision with root package name */
    public float f77142g;

    /* renamed from: h, reason: collision with root package name */
    public float f77143h;

    /* renamed from: i, reason: collision with root package name */
    public float f77144i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f77145m;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77140e = parcel.readFloat();
        this.f77141f = parcel.readFloat();
        this.f77142g = parcel.readFloat();
        this.f77143h = parcel.readFloat();
        this.f77144i = parcel.readFloat();
        this.f77145m = parcel.readInt() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj) || !(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArg)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArg pathActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArg) obj;
        return pathActionArg.f77140e == this.f77140e && pathActionArg.f77141f == this.f77141f && pathActionArg.f77142g == this.f77142g && pathActionArg.f77143h == this.f77143h && pathActionArg.f77145m == this.f77145m;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77140e);
        parcel.writeFloat(this.f77141f);
        parcel.writeFloat(this.f77142g);
        parcel.writeFloat(this.f77143h);
        parcel.writeFloat(this.f77144i);
        parcel.writeInt(this.f77145m ? 1 : 0);
    }
}
