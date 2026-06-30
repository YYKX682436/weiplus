package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class SetStrokeStyleActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg> CREATOR = new b91.i0();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionArg f77129e;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionArg realSetStrokeStyleActionArg = this.f77129e;
        if (realSetStrokeStyleActionArg == null) {
            return false;
        }
        return realSetStrokeStyleActionArg.a(iVar, canvas);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77129e = (com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionArg) parcel.readParcelable(com.tencent.mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg.class.getClassLoader());
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
        if ((obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg) && super.equals(obj)) {
            return java.util.Objects.equals(this.f77129e, ((com.tencent.mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg) obj).f77129e);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), this.f77129e);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeParcelable(this.f77129e, i17);
    }
}
