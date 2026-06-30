package com.tencent.mm.brandService;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/CheckCanCreatePhotoAccountRequest;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class CheckCanCreatePhotoAccountRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.brandService.CheckCanCreatePhotoAccountRequest> CREATOR = new rm.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f63610d;

    public CheckCanCreatePhotoAccountRequest(int i17) {
        this.f63610d = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.brandService.CheckCanCreatePhotoAccountRequest) && this.f63610d == ((com.tencent.mm.brandService.CheckCanCreatePhotoAccountRequest) obj).f63610d;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f63610d);
    }

    public java.lang.String toString() {
        return "CheckCanCreatePhotoAccountRequest(scene=" + this.f63610d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f63610d);
    }
}
