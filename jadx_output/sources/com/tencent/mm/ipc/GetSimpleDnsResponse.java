package com.tencent.mm.ipc;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ipc/GetSimpleDnsResponse;", "Landroid/os/Parcelable;", "feature-cronet_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final /* data */ class GetSimpleDnsResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipc.GetSimpleDnsResponse> CREATOR = new jk0.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f68324d;

    public GetSimpleDnsResponse(java.util.ArrayList ipList) {
        kotlin.jvm.internal.o.g(ipList, "ipList");
        this.f68324d = ipList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ipc.GetSimpleDnsResponse) && kotlin.jvm.internal.o.b(this.f68324d, ((com.tencent.mm.ipc.GetSimpleDnsResponse) obj).f68324d);
    }

    public int hashCode() {
        return this.f68324d.hashCode();
    }

    public java.lang.String toString() {
        return "GetSimpleDnsResponse(ipList=" + this.f68324d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeStringList(this.f68324d);
    }
}
