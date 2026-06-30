package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/address/AddressSelectorContract$AddressNode", "Landroid/os/Parcelable;", "appbrand-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$AddressNode */
/* loaded from: classes.dex */
public final /* data */ class C11954x6b9417d7 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7> f33689x681a0c0c = new ab1.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f160236d;

    /* renamed from: e, reason: collision with root package name */
    public final int f160237e;

    public C11954x6b9417d7(java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f160236d = name;
        this.f160237e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50499xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7 c11954x6b9417d7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160236d, c11954x6b9417d7.f160236d) && this.f160237e == c11954x6b9417d7.f160237e;
    }

    /* renamed from: hashCode */
    public int m50500x8cdac1b() {
        return (this.f160236d.hashCode() * 31) + java.lang.Integer.hashCode(this.f160237e);
    }

    /* renamed from: toString */
    public java.lang.String m50501x9616526c() {
        return "AddressNode(name=" + this.f160236d + ", code=" + this.f160237e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f160236d);
        out.writeInt(this.f160237e);
    }
}
