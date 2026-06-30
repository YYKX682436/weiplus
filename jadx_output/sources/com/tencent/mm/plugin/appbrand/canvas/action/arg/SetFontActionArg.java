package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public class SetFontActionArg extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontActionArg> CREATOR = new b91.v();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f77107e;

    /* renamed from: f, reason: collision with root package name */
    public float f77108f;

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
        this.f77107e = parcel.readString();
        this.f77108f = parcel.readFloat();
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
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontActionArg) || !super.equals(obj)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontActionArg setFontActionArg = (com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontActionArg) obj;
        return java.lang.Float.compare(setFontActionArg.f77108f, this.f77108f) == 0 && java.util.Objects.equals(this.f77107e, setFontActionArg.f77107e);
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), this.f77107e, java.lang.Float.valueOf(this.f77108f));
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeString(this.f77107e);
        parcel.writeFloat(this.f77108f);
    }
}
