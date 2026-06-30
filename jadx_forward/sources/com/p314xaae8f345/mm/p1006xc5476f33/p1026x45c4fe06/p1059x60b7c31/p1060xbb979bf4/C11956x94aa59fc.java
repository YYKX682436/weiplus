package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/address/AddressSelectorContract$SelectResponse", "Landroid/os/Parcelable;", "appbrand-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectResponse */
/* loaded from: classes.dex */
public final /* data */ class C11956x94aa59fc implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc> f33691x681a0c0c = new ab1.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f160241d;

    /* renamed from: e, reason: collision with root package name */
    public final int f160242e;

    public C11956x94aa59fc(java.util.ArrayList list, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f160241d = list;
        this.f160242e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50507xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc c11956x94aa59fc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11956x94aa59fc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160241d, c11956x94aa59fc.f160241d) && this.f160242e == c11956x94aa59fc.f160242e;
    }

    /* renamed from: hashCode */
    public int m50508x8cdac1b() {
        return (this.f160241d.hashCode() * 31) + java.lang.Integer.hashCode(this.f160242e);
    }

    /* renamed from: toString */
    public java.lang.String m50509x9616526c() {
        return "SelectResponse(list=" + this.f160241d + ", postcode=" + this.f160242e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.ArrayList arrayList = this.f160241d;
        out.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11954x6b9417d7) it.next()).writeToParcel(out, i17);
        }
        out.writeInt(this.f160242e);
    }
}
