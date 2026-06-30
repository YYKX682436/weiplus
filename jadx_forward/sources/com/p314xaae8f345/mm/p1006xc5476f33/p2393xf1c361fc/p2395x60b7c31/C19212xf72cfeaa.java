package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/websearch/jsapi/OpenWXSearchHalfPageJSApi$ResponseWrapper", "Landroid/os/Parcelable;", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$ResponseWrapper */
/* loaded from: classes.dex */
public final /* data */ class C19212xf72cfeaa implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19212xf72cfeaa> f38710x681a0c0c = new av4.z();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f263084d;

    public C19212xf72cfeaa(java.util.Map urlParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(urlParams, "urlParams");
        this.f263084d = urlParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74067xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19212xf72cfeaa) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f263084d, ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19212xf72cfeaa) obj).f263084d);
    }

    /* renamed from: hashCode */
    public int m74068x8cdac1b() {
        return this.f263084d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74069x9616526c() {
        return "ResponseWrapper(urlParams=" + this.f263084d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.Map map = this.f263084d;
        out.writeInt(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            out.writeString((java.lang.String) entry.getKey());
            out.writeString((java.lang.String) entry.getValue());
        }
    }
}
