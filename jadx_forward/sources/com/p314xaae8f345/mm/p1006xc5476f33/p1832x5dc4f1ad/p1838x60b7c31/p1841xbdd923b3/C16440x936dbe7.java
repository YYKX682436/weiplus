package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/magicbrush/jsapi/launch/MBJsApiHandleEcsAction$AllocTempFileRequest", "Landroid/os/Parcelable;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.launch.MBJsApiHandleEcsAction$AllocTempFileRequest */
/* loaded from: classes.dex */
public final /* data */ class C16440x936dbe7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16440x936dbe7> f37490x681a0c0c = new md3.d();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229584d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f229585e;

    public C16440x936dbe7(java.lang.String str, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f229584d = str;
        this.f229585e = name;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66386xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16440x936dbe7)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16440x936dbe7 c16440x936dbe7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16440x936dbe7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229584d, c16440x936dbe7.f229584d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229585e, c16440x936dbe7.f229585e);
    }

    /* renamed from: hashCode */
    public int m66387x8cdac1b() {
        java.lang.String str = this.f229584d;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f229585e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66388x9616526c() {
        return "AllocTempFileRequest(instanceName=" + this.f229584d + ", name=" + this.f229585e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f229584d);
        out.writeString(this.f229585e);
    }
}
