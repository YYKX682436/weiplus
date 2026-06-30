package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/magicbrush/jsapi/launch/MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest", "Landroid/os/Parcelable;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$GetAbsoluteFilePathRequest */
/* loaded from: classes.dex */
public final /* data */ class C16442x885519fe implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16442x885519fe> f37492x681a0c0c = new md3.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229587d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f229588e;

    public C16442x885519fe(java.lang.String str, java.lang.String rawPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawPath, "rawPath");
        this.f229587d = str;
        this.f229588e = rawPath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66394xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16442x885519fe)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16442x885519fe c16442x885519fe = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16442x885519fe) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229587d, c16442x885519fe.f229587d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229588e, c16442x885519fe.f229588e);
    }

    /* renamed from: hashCode */
    public int m66395x8cdac1b() {
        java.lang.String str = this.f229587d;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f229588e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66396x9616526c() {
        return "GetAbsoluteFilePathRequest(instanceName=" + this.f229587d + ", rawPath=" + this.f229588e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f229587d);
        out.writeString(this.f229588e);
    }
}
