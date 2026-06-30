package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/appcache/WxaCommonLibRecordList;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.appcache.WxaCommonLibRecordList */
/* loaded from: classes5.dex */
public final /* data */ class C11662x721a1b29 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11662x721a1b29> f33463x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.l8();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f156920d;

    public C11662x721a1b29(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f156920d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m49215xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11662x721a1b29) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156920d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11662x721a1b29) obj).f156920d);
    }

    /* renamed from: hashCode */
    public int m49216x8cdac1b() {
        return this.f156920d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m49217x9616526c() {
        return "WxaCommonLibRecordList(list=" + this.f156920d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f156920d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11661x55afe3eb) it.next()).writeToParcel(out, i17);
        }
    }
}
