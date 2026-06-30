package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchApi$GetPrefetchResultReq", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchApi$GetPrefetchResultReq */
/* loaded from: classes7.dex */
final /* data */ class C12321x2fe05094 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12321x2fe05094> f35046x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165865d;

    /* renamed from: e, reason: collision with root package name */
    public final int f165866e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f165867f;

    /* renamed from: g, reason: collision with root package name */
    public final long f165868g;

    public C12321x2fe05094(java.lang.String instanceId, int i17, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        this.f165865d = instanceId;
        this.f165866e = i17;
        this.f165867f = z17;
        this.f165868g = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51644xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12321x2fe05094)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12321x2fe05094 c12321x2fe05094 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12321x2fe05094) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165865d, c12321x2fe05094.f165865d) && this.f165866e == c12321x2fe05094.f165866e && this.f165867f == c12321x2fe05094.f165867f && this.f165868g == c12321x2fe05094.f165868g;
    }

    /* renamed from: hashCode */
    public int m51645x8cdac1b() {
        return (((((this.f165865d.hashCode() * 31) + java.lang.Integer.hashCode(this.f165866e)) * 31) + java.lang.Boolean.hashCode(this.f165867f)) * 31) + java.lang.Long.hashCode(this.f165868g);
    }

    /* renamed from: toString */
    public java.lang.String m51646x9616526c() {
        return "GetPrefetchResultReq(instanceId=" + this.f165865d + ", prefetchType=" + this.f165866e + ", pull=" + this.f165867f + ", timeout=" + this.f165868g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f165865d);
        out.writeInt(this.f165866e);
        out.writeInt(this.f165867f ? 1 : 0);
        out.writeLong(this.f165868g);
    }
}
