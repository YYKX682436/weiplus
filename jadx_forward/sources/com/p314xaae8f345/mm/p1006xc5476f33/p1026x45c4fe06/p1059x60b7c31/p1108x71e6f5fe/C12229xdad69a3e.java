package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/scanner/JsApiDetectImageCode$CheckWXAppInfoDataList", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.scanner.JsApiDetectImageCode$CheckWXAppInfoDataList */
/* loaded from: classes4.dex */
public final /* data */ class C12229xdad69a3e implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12229xdad69a3e> f34746x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f164468d;

    public C12229xdad69a3e(java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f164468d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51257xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12229xdad69a3e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f164468d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12229xdad69a3e) obj).f164468d);
    }

    /* renamed from: hashCode */
    public int m51258x8cdac1b() {
        return this.f164468d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51259x9616526c() {
        return "CheckWXAppInfoDataList(list=" + this.f164468d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f164468d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12228xb5493580) it.next()).writeToParcel(out, i17);
        }
    }
}
