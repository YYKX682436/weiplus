package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p844x5a753b7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/magicbrush/plugin/scl/jsapi/cover/MBJsApiOperateCanvasFirstSnapshot$IPCData", "Landroid/os/Parcelable;", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.magicbrush.plugin.scl.jsapi.cover.MBJsApiOperateCanvasFirstSnapshot$IPCData */
/* loaded from: classes7.dex */
final /* data */ class C10862x9d0f83b6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p844x5a753b7.C10862x9d0f83b6> f29649x681a0c0c = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p844x5a753b7.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150187d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f150188e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f150189f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f150190g;

    public C10862x9d0f83b6(java.lang.String action, java.lang.String extInfo, java.lang.String instanceName, java.lang.String snapshotLocalPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshotLocalPath, "snapshotLocalPath");
        this.f150187d = action;
        this.f150188e = extInfo;
        this.f150189f = instanceName;
        this.f150190g = snapshotLocalPath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46581xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p844x5a753b7.C10862x9d0f83b6)) {
            return false;
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p844x5a753b7.C10862x9d0f83b6 c10862x9d0f83b6 = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p844x5a753b7.C10862x9d0f83b6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150187d, c10862x9d0f83b6.f150187d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150188e, c10862x9d0f83b6.f150188e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150189f, c10862x9d0f83b6.f150189f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150190g, c10862x9d0f83b6.f150190g);
    }

    /* renamed from: hashCode */
    public int m46582x8cdac1b() {
        return (((((this.f150187d.hashCode() * 31) + this.f150188e.hashCode()) * 31) + this.f150189f.hashCode()) * 31) + this.f150190g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m46583x9616526c() {
        return "IPCData(action=" + this.f150187d + ", extInfo=" + this.f150188e + ", instanceName=" + this.f150189f + ", snapshotLocalPath=" + this.f150190g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f150187d);
        out.writeString(this.f150188e);
        out.writeString(this.f150189f);
        out.writeString(this.f150190g);
    }
}
