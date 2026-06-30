package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/magicbrush/core/event/MagicBrushServerEvent$RequestTypeForAppBrand", "Landroid/os/Parcelable;", "mb-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.core.event.MagicBrushServerEvent$RequestTypeForAppBrand */
/* loaded from: classes5.dex */
public final /* data */ class C16426xbe438480 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a.C16426xbe438480> f37485x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f229426d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f229427e;

    public C16426xbe438480(java.lang.String eventName, java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f229426d = eventName;
        this.f229427e = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66297xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a.C16426xbe438480)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a.C16426xbe438480 c16426xbe438480 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a.C16426xbe438480) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229426d, c16426xbe438480.f229426d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229427e, c16426xbe438480.f229427e);
    }

    /* renamed from: hashCode */
    public int m66298x8cdac1b() {
        return (this.f229426d.hashCode() * 31) + this.f229427e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66299x9616526c() {
        return "RequestTypeForAppBrand(eventName=" + this.f229426d + ", data=" + this.f229427e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f229426d);
        out.writeString(this.f229427e);
    }
}
