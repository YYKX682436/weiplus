package com.tencent.mm.ipc;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ipc/GetSimpleDnsRequest;", "Landroid/os/Parcelable;", "feature-cronet_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class GetSimpleDnsRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.ipc.GetSimpleDnsRequest> CREATOR = new jk0.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f68319d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68320e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f68321f;

    /* renamed from: g, reason: collision with root package name */
    public final int f68322g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f68323h;

    public GetSimpleDnsRequest(java.lang.String host, int i17, boolean z17, int i18, boolean z18) {
        kotlin.jvm.internal.o.g(host, "host");
        this.f68319d = host;
        this.f68320e = i17;
        this.f68321f = z17;
        this.f68322g = i18;
        this.f68323h = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ipc.GetSimpleDnsRequest)) {
            return false;
        }
        com.tencent.mm.ipc.GetSimpleDnsRequest getSimpleDnsRequest = (com.tencent.mm.ipc.GetSimpleDnsRequest) obj;
        return kotlin.jvm.internal.o.b(this.f68319d, getSimpleDnsRequest.f68319d) && this.f68320e == getSimpleDnsRequest.f68320e && this.f68321f == getSimpleDnsRequest.f68321f && this.f68322g == getSimpleDnsRequest.f68322g && this.f68323h == getSimpleDnsRequest.f68323h;
    }

    public int hashCode() {
        return (((((((this.f68319d.hashCode() * 31) + java.lang.Integer.hashCode(this.f68320e)) * 31) + java.lang.Boolean.hashCode(this.f68321f)) * 31) + java.lang.Integer.hashCode(this.f68322g)) * 31) + java.lang.Boolean.hashCode(this.f68323h);
    }

    public java.lang.String toString() {
        return "GetSimpleDnsRequest(host=" + this.f68319d + ", timeout=" + this.f68320e + ", acceptExpireIp=" + this.f68321f + ", ipStackSelection=" + this.f68322g + ", withParams=" + this.f68323h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f68319d);
        out.writeInt(this.f68320e);
        out.writeInt(this.f68321f ? 1 : 0);
        out.writeInt(this.f68322g);
        out.writeInt(this.f68323h ? 1 : 0);
    }
}
