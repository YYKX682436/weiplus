package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/networking/lib_server_mode/WxAppLibServerMode;", "Landroid/os/Parcelable;", "xh1/j", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode */
/* loaded from: classes7.dex */
public final /* data */ class C12444x48c806b implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f167634d;

    /* renamed from: e, reason: collision with root package name */
    public final xh1.j f167635e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b f167633f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b(false, xh1.j.f536049f);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b> f35120x681a0c0c = new xh1.h();

    public C12444x48c806b(boolean z17, xh1.j reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f167634d = z17;
        this.f167635e = reason;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52035xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b c12444x48c806b = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b) obj;
        return this.f167634d == c12444x48c806b.f167634d && this.f167635e == c12444x48c806b.f167635e;
    }

    /* renamed from: hashCode */
    public int m52036x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f167634d) * 31) + this.f167635e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52037x9616526c() {
        return "WxAppLibServerMode(switch:" + this.f167634d + ", reason:" + this.f167635e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeByte(this.f167634d ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f167635e.f536052d);
    }
}
