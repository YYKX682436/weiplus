package com.tencent.mm.brandService;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/SyncPhotoRequest;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class SyncPhotoRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.brandService.SyncPhotoRequest> CREATOR = new rm.e0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63628d;

    public SyncPhotoRequest(boolean z17) {
        this.f63628d = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.brandService.SyncPhotoRequest) && this.f63628d == ((com.tencent.mm.brandService.SyncPhotoRequest) obj).f63628d;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f63628d);
    }

    public java.lang.String toString() {
        return "SyncPhotoRequest(enable=" + this.f63628d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f63628d ? 1 : 0);
    }
}
