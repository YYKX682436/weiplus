package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiTaskRequest", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiTaskRequest */
/* loaded from: classes9.dex */
public final /* data */ class C12025xc3abaace implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12025xc3abaace> f33932x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.e();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161445d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12022x63a30bfc f161446e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f161447f;

    public C12025xc3abaace(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12022x63a30bfc deviceGpsInfo, java.util.List imgGpsInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceGpsInfo, "deviceGpsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgGpsInfoList, "imgGpsInfoList");
        this.f161445d = str;
        this.f161446e = deviceGpsInfo;
        this.f161447f = imgGpsInfoList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50669xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12025xc3abaace)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12025xc3abaace c12025xc3abaace = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12025xc3abaace) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161445d, c12025xc3abaace.f161445d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161446e, c12025xc3abaace.f161446e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161447f, c12025xc3abaace.f161447f);
    }

    /* renamed from: hashCode */
    public int m50670x8cdac1b() {
        java.lang.String str = this.f161445d;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f161446e.m50658x8cdac1b()) * 31) + this.f161447f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50671x9616526c() {
        return "BizPoiTaskRequest(bizUin=" + this.f161445d + ", deviceGpsInfo=" + this.f161446e + ", imgGpsInfoList=" + this.f161447f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f161445d);
        this.f161446e.writeToParcel(out, i17);
        java.util.List list = this.f161447f;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12022x63a30bfc) it.next()).writeToParcel(out, i17);
        }
    }
}
