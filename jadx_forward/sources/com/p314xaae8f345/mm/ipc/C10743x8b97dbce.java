package com.p314xaae8f345.mm.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ipc/GetSimpleDnsRequest;", "Landroid/os/Parcelable;", "feature-cronet_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ipc.GetSimpleDnsRequest */
/* loaded from: classes7.dex */
public final /* data */ class C10743x8b97dbce implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.ipc.C10743x8b97dbce> f29251x681a0c0c = new jk0.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f149852d;

    /* renamed from: e, reason: collision with root package name */
    public final int f149853e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f149854f;

    /* renamed from: g, reason: collision with root package name */
    public final int f149855g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f149856h;

    public C10743x8b97dbce(java.lang.String host, int i17, boolean z17, int i18, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f149852d = host;
        this.f149853e = i17;
        this.f149854f = z17;
        this.f149855g = i18;
        this.f149856h = z18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46182xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ipc.C10743x8b97dbce)) {
            return false;
        }
        com.p314xaae8f345.mm.ipc.C10743x8b97dbce c10743x8b97dbce = (com.p314xaae8f345.mm.ipc.C10743x8b97dbce) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f149852d, c10743x8b97dbce.f149852d) && this.f149853e == c10743x8b97dbce.f149853e && this.f149854f == c10743x8b97dbce.f149854f && this.f149855g == c10743x8b97dbce.f149855g && this.f149856h == c10743x8b97dbce.f149856h;
    }

    /* renamed from: hashCode */
    public int m46183x8cdac1b() {
        return (((((((this.f149852d.hashCode() * 31) + java.lang.Integer.hashCode(this.f149853e)) * 31) + java.lang.Boolean.hashCode(this.f149854f)) * 31) + java.lang.Integer.hashCode(this.f149855g)) * 31) + java.lang.Boolean.hashCode(this.f149856h);
    }

    /* renamed from: toString */
    public java.lang.String m46184x9616526c() {
        return "GetSimpleDnsRequest(host=" + this.f149852d + ", timeout=" + this.f149853e + ", acceptExpireIp=" + this.f149854f + ", ipStackSelection=" + this.f149855g + ", withParams=" + this.f149856h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f149852d);
        out.writeInt(this.f149853e);
        out.writeInt(this.f149854f ? 1 : 0);
        out.writeInt(this.f149855g);
        out.writeInt(this.f149856h ? 1 : 0);
    }
}
