package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

/* loaded from: classes13.dex */
public class PathLineToActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg> CREATOR = new c91.g();

    /* renamed from: e, reason: collision with root package name */
    public float f77153e;

    /* renamed from: f, reason: collision with root package name */
    public float f77154f;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77153e = parcel.readFloat();
        this.f77154f = parcel.readFloat();
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj) || !(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg pathLineToActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg) obj;
        return pathLineToActionArg.f77153e == this.f77153e && pathLineToActionArg.f77154f == this.f77154f;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77153e);
        parcel.writeFloat(this.f77154f);
    }
}
