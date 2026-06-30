package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class SetFillStyleActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFillStyleActionArg> CREATOR = new b91.u();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg f77106e;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg realSetFillStyleActionArg = this.f77106e;
        if (realSetFillStyleActionArg == null) {
            return false;
        }
        return realSetFillStyleActionArg.a(iVar, canvas);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77106e = (com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg) parcel.readParcelable(com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFillStyleActionArg.class.getClassLoader());
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
        if ((obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFillStyleActionArg) && super.equals(obj)) {
            return java.util.Objects.equals(this.f77106e, ((com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFillStyleActionArg) obj).f77106e);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), this.f77106e);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeParcelable(this.f77106e, i17);
    }
}
