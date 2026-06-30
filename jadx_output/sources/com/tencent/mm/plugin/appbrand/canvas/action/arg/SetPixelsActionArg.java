package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class SetPixelsActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg> CREATOR = new b91.g0();

    /* renamed from: e, reason: collision with root package name */
    public int f77120e;

    /* renamed from: f, reason: collision with root package name */
    public int f77121f;

    /* renamed from: g, reason: collision with root package name */
    public int f77122g;

    /* renamed from: h, reason: collision with root package name */
    public int f77123h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f77124i;

    public SetPixelsActionArg(android.os.Parcel parcel) {
        super(parcel);
        this.f77124i = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77120e = parcel.readInt();
        this.f77121f = parcel.readInt();
        this.f77122g = parcel.readInt();
        this.f77123h = parcel.readInt();
        this.f77124i = (android.graphics.Bitmap) parcel.readParcelable(com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg.class.getClassLoader());
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg setPixelsActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg) obj;
        return this.f77120e == setPixelsActionArg.f77120e && this.f77121f == setPixelsActionArg.f77121f && this.f77122g == setPixelsActionArg.f77122g && this.f77123h == setPixelsActionArg.f77123h && java.util.Objects.equals(this.f77124i, setPixelsActionArg.f77124i);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Integer.valueOf(this.f77120e), java.lang.Integer.valueOf(this.f77121f), java.lang.Integer.valueOf(this.f77122g), java.lang.Integer.valueOf(this.f77123h), this.f77124i);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeInt(this.f77120e);
        parcel.writeInt(this.f77121f);
        parcel.writeInt(this.f77122g);
        parcel.writeInt(this.f77123h);
        parcel.writeParcelable(this.f77124i, i17);
    }
}
