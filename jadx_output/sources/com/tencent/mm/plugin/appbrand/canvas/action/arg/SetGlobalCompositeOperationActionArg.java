package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class SetGlobalCompositeOperationActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg> CREATOR = new b91.b0();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77114e;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77114e = parcel.readString();
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
        if ((obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg) && super.equals(obj)) {
            return java.util.Objects.equals(this.f77114e, ((com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg) obj).f77114e);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), this.f77114e);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeString(this.f77114e);
    }
}
