package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

/* loaded from: classes13.dex */
public class PathMoveToActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg> CREATOR = new c91.h();

    /* renamed from: e, reason: collision with root package name */
    public float f77155e;

    /* renamed from: f, reason: collision with root package name */
    public float f77156f;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77155e = parcel.readFloat();
        this.f77156f = parcel.readFloat();
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj) || !(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg pathMoveToActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg) obj;
        return pathMoveToActionArg.f77155e == this.f77155e && pathMoveToActionArg.f77156f == this.f77156f;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg, com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeFloat(this.f77155e);
        parcel.writeFloat(this.f77156f);
    }
}
