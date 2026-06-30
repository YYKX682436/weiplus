package com.p314xaae8f345.mm.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ipc/GetSimpleDnsResponse;", "Landroid/os/Parcelable;", "feature-cronet_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ipc.GetSimpleDnsResponse */
/* loaded from: classes.dex */
public final /* data */ class C10744xea8b52e2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ipc.C10744xea8b52e2> f29252x681a0c0c = new jk0.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f149857d;

    public C10744xea8b52e2(java.util.ArrayList ipList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ipList, "ipList");
        this.f149857d = ipList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46186xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.ipc.C10744xea8b52e2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149857d, ((com.p314xaae8f345.mm.ipc.C10744xea8b52e2) obj).f149857d);
    }

    /* renamed from: hashCode */
    public int m46187x8cdac1b() {
        return this.f149857d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m46188x9616526c() {
        return "GetSimpleDnsResponse(ipList=" + this.f149857d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeStringList(this.f149857d);
    }
}
