package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/biz/JsApiChooseBizPoi$BizPoiResponse", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiChooseBizPoi$BizPoiResponse */
/* loaded from: classes11.dex */
public final /* data */ class C12024x43acfd3d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12024x43acfd3d> f33931x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f161442d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12023x4ffb7510 f161443e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12026xb4f163e2 f161444f;

    public C12024x43acfd3d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12023x4ffb7510 c12023x4ffb7510, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12026xb4f163e2 c12026xb4f163e2) {
        this.f161442d = i17;
        this.f161443e = c12023x4ffb7510;
        this.f161444f = c12026xb4f163e2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50665xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12024x43acfd3d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12024x43acfd3d c12024x43acfd3d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12024x43acfd3d) obj;
        return this.f161442d == c12024x43acfd3d.f161442d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161443e, c12024x43acfd3d.f161443e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161444f, c12024x43acfd3d.f161444f);
    }

    /* renamed from: hashCode */
    public int m50666x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f161442d) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12023x4ffb7510 c12023x4ffb7510 = this.f161443e;
        int m50662x8cdac1b = (hashCode + (c12023x4ffb7510 == null ? 0 : c12023x4ffb7510.m50662x8cdac1b())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12026xb4f163e2 c12026xb4f163e2 = this.f161444f;
        return m50662x8cdac1b + (c12026xb4f163e2 != null ? c12026xb4f163e2.m50674x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m50667x9616526c() {
        return "BizPoiResponse(responseType=" + this.f161442d + ", launchResponse=" + this.f161443e + ", selectResponse=" + this.f161444f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f161442d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12023x4ffb7510 c12023x4ffb7510 = this.f161443e;
        if (c12023x4ffb7510 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c12023x4ffb7510.writeToParcel(out, i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12026xb4f163e2 c12026xb4f163e2 = this.f161444f;
        if (c12026xb4f163e2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c12026xb4f163e2.writeToParcel(out, i17);
        }
    }
}
