package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class FillRectActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg> CREATOR = new b91.h();

    /* renamed from: e, reason: collision with root package name */
    public float f77072e;

    /* renamed from: f, reason: collision with root package name */
    public float f77073f;

    /* renamed from: g, reason: collision with root package name */
    public float f77074g;

    /* renamed from: h, reason: collision with root package name */
    public float f77075h;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77072e = parcel.readFloat();
        this.f77073f = parcel.readFloat();
        this.f77074g = parcel.readFloat();
        this.f77075h = parcel.readFloat();
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg fillRectActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg) obj;
        return java.lang.Float.compare(fillRectActionArg.f77072e, this.f77072e) == 0 && java.lang.Float.compare(fillRectActionArg.f77073f, this.f77073f) == 0 && java.lang.Float.compare(fillRectActionArg.f77074g, this.f77074g) == 0 && java.lang.Float.compare(fillRectActionArg.f77075h, this.f77075h) == 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), java.lang.Float.valueOf(this.f77072e), java.lang.Float.valueOf(this.f77073f), java.lang.Float.valueOf(this.f77074g), java.lang.Float.valueOf(this.f77075h));
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77072e);
        parcel.writeFloat(this.f77073f);
        parcel.writeFloat(this.f77074g);
        parcel.writeFloat(this.f77075h);
    }
}
