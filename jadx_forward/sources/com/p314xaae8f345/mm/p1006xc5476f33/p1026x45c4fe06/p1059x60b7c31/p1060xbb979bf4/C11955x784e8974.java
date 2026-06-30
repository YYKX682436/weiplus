package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/address/AddressSelectorContract$SelectRequest", "Landroid/os/Parcelable;", "appbrand-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest */
/* loaded from: classes.dex */
public final /* data */ class C11955x784e8974 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974> f33690x681a0c0c = new ab1.d();

    /* renamed from: d, reason: collision with root package name */
    public final ab1.c f160238d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f160239e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f160240f;

    public C11955x784e8974(ab1.c mode, java.util.ArrayList arrayList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        this.f160238d = mode;
        this.f160239e = arrayList;
        this.f160240f = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50503xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974 c11955x784e8974 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1060xbb979bf4.C11955x784e8974) obj;
        return this.f160238d == c11955x784e8974.f160238d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160239e, c11955x784e8974.f160239e) && this.f160240f == c11955x784e8974.f160240f;
    }

    /* renamed from: hashCode */
    public int m50504x8cdac1b() {
        int hashCode = this.f160238d.hashCode() * 31;
        java.util.ArrayList arrayList = this.f160239e;
        return ((hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f160240f);
    }

    /* renamed from: toString */
    public java.lang.String m50505x9616526c() {
        return "SelectRequest(mode=" + this.f160238d + ", current=" + this.f160239e + ", autoLocation=" + this.f160240f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        ab1.c cVar = this.f160238d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
        out.writeInt(cVar.ordinal());
        out.writeStringList(this.f160239e);
        out.writeInt(this.f160240f ? 1 : 0);
    }
}
