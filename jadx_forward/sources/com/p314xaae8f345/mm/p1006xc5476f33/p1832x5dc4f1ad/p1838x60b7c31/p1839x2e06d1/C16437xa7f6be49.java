package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/RequestType;", "Landroid/os/Parcelable;", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.jsapi.base.RequestType */
/* loaded from: classes.dex */
public final /* data */ class C16437xa7f6be49 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.C16437xa7f6be49> f37489x681a0c0c = new fd3.c();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d f229577d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d f229578e;

    public C16437xa7f6be49(com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d jsApiName, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d dataStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiName, "jsApiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataStr, "dataStr");
        this.f229577d = jsApiName;
        this.f229578e = dataStr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66382xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.C16437xa7f6be49)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.C16437xa7f6be49 c16437xa7f6be49 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.C16437xa7f6be49) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229577d, c16437xa7f6be49.f229577d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229578e, c16437xa7f6be49.f229578e);
    }

    /* renamed from: hashCode */
    public int m66383x8cdac1b() {
        return (this.f229577d.hashCode() * 31) + this.f229578e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m66384x9616526c() {
        return "RequestType(jsApiName=" + this.f229577d + ", dataStr=" + this.f229578e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.f229577d, i17);
        out.writeParcelable(this.f229578e, i17);
    }
}
