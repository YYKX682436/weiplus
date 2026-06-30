package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet */
/* loaded from: classes7.dex */
public final /* data */ class C12030x3b20338d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12030x3b20338d> f33937x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.z();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f161465d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161466e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f161467f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f161468g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Long f161469h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f161470i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f161471m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f161472n;

    public C12030x3b20338d(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f161465d = z17;
        this.f161466e = str;
        this.f161467f = str2;
        this.f161468g = str3;
        this.f161469h = l17;
        this.f161470i = str4;
        this.f161471m = str5;
        this.f161472n = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50689xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12030x3b20338d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12030x3b20338d c12030x3b20338d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12030x3b20338d) obj;
        return this.f161465d == c12030x3b20338d.f161465d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161466e, c12030x3b20338d.f161466e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161467f, c12030x3b20338d.f161467f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161468g, c12030x3b20338d.f161468g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161469h, c12030x3b20338d.f161469h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161470i, c12030x3b20338d.f161470i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161471m, c12030x3b20338d.f161471m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161472n, c12030x3b20338d.f161472n);
    }

    /* renamed from: hashCode */
    public int m50690x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f161465d) * 31;
        java.lang.String str = this.f161466e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f161467f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f161468g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Long l17 = this.f161469h;
        int hashCode5 = (hashCode4 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str4 = this.f161470i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f161471m;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f161472n;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m50691x9616526c() {
        return "IPCEditTextCoverTaskRet(isSuc=" + this.f161465d + ", filePath=" + this.f161466e + ", picId=" + this.f161467f + ", prompt=" + this.f161468g + ", source=" + this.f161469h + ", templateId=" + this.f161470i + ", dataBuf=" + this.f161471m + ", style=" + this.f161472n + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f161465d ? 1 : 0);
        out.writeString(this.f161466e);
        out.writeString(this.f161467f);
        out.writeString(this.f161468g);
        java.lang.Long l17 = this.f161469h;
        if (l17 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l17.longValue());
        }
        out.writeString(this.f161470i);
        out.writeString(this.f161471m);
        out.writeString(this.f161472n);
    }
}
