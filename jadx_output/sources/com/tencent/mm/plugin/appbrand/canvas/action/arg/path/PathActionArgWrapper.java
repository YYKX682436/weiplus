package com.tencent.mm.plugin.appbrand.canvas.action.arg.path;

/* loaded from: classes13.dex */
public class PathActionArgWrapper extends com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper> CREATOR = new c91.b();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f77146e;

    public PathActionArgWrapper(android.os.Parcel parcel) {
        super(parcel, null);
        this.f77146e = new java.util.ArrayList();
        this.f77146e = parcel.readArrayList(com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper.class.getClassLoader());
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public void b(android.os.Parcel parcel) {
        this.f77041d = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj) && (obj instanceof com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper)) {
            return this.f77146e.equals(((com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper) obj).f77146e);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f77041d);
        parcel.writeList(this.f77146e);
    }
}
