package com.tencent.mm.plugin.appbrand.canvas.action.arg;

/* loaded from: classes13.dex */
public abstract class BaseDrawActionArg implements com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f77041d;

    public BaseDrawActionArg(android.os.Parcel parcel, java.lang.Object obj) {
        this.f77041d = parcel.readString();
    }

    public boolean a(z81.i iVar, android.graphics.Canvas canvas) {
        return false;
    }

    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg) {
            java.lang.String str = this.f77041d;
            java.lang.String str2 = ((com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg) obj).f77041d;
            if (str == str2) {
                return true;
            }
            if (str != null && str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public java.lang.String toString() {
        return java.lang.String.format("method %s", this.f77041d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
    }

    public BaseDrawActionArg(android.os.Parcel parcel) {
        b(parcel);
    }
}
