package com.tencent.mm.brandService;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/brandService/GetBizRequest;", "Landroid/os/Parcelable;", "biz-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class GetBizRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.brandService.GetBizRequest> CREATOR = new rm.v();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63618d;

    /* renamed from: e, reason: collision with root package name */
    public final int f63619e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f63620f;

    public GetBizRequest(boolean z17, int i17, boolean z18) {
        this.f63618d = z17;
        this.f63619e = i17;
        this.f63620f = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.brandService.GetBizRequest)) {
            return false;
        }
        com.tencent.mm.brandService.GetBizRequest getBizRequest = (com.tencent.mm.brandService.GetBizRequest) obj;
        return this.f63618d == getBizRequest.f63618d && this.f63619e == getBizRequest.f63619e && this.f63620f == getBizRequest.f63620f;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f63618d) * 31) + java.lang.Integer.hashCode(this.f63619e)) * 31) + java.lang.Boolean.hashCode(this.f63620f);
    }

    public java.lang.String toString() {
        return "GetBizRequest(needCheckBiz=" + this.f63618d + ", bizType=" + this.f63619e + ", getAllBiz=" + this.f63620f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f63618d ? 1 : 0);
        out.writeInt(this.f63619e);
        out.writeInt(this.f63620f ? 1 : 0);
    }
}
