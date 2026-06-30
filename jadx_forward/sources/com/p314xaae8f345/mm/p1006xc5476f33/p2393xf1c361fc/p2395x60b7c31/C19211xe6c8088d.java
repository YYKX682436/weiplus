package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/websearch/jsapi/OpenWXSearchHalfPageJSApi$RequestParams", "Landroid/os/Parcelable;", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$RequestParams */
/* loaded from: classes.dex */
public final /* data */ class C19211xe6c8088d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19211xe6c8088d> f38709x681a0c0c = new av4.y();

    /* renamed from: d, reason: collision with root package name */
    public final int f263082d;

    /* renamed from: e, reason: collision with root package name */
    public final int f263083e;

    public C19211xe6c8088d(int i17, int i18) {
        this.f263082d = i17;
        this.f263083e = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74063xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19211xe6c8088d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19211xe6c8088d c19211xe6c8088d = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2395x60b7c31.C19211xe6c8088d) obj;
        return this.f263082d == c19211xe6c8088d.f263082d && this.f263083e == c19211xe6c8088d.f263083e;
    }

    /* renamed from: hashCode */
    public int m74064x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f263082d) * 31) + java.lang.Integer.hashCode(this.f263083e);
    }

    /* renamed from: toString */
    public java.lang.String m74065x9616526c() {
        return "RequestParams(scene=" + this.f263082d + ", type=" + this.f263083e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f263082d);
        out.writeInt(this.f263083e);
    }
}
