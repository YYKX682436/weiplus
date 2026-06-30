package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/advertise/impl/jsapi/MBJsApiClearAdPushMsg$RequestType", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiClearAdPushMsg$RequestType */
/* loaded from: classes.dex */
public final /* data */ class C4980x3635de58 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4980x3635de58> f21391x681a0c0c = new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.j();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f134695d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f134696e;

    public C4980x3635de58(java.lang.String slotid, java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotid, "slotid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        this.f134695d = slotid;
        this.f134696e = bizName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42892xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4980x3635de58)) {
            return false;
        }
        com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4980x3635de58 c4980x3635de58 = (com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4980x3635de58) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134695d, c4980x3635de58.f134695d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134696e, c4980x3635de58.f134696e);
    }

    /* renamed from: hashCode */
    public int m42893x8cdac1b() {
        return (this.f134695d.hashCode() * 31) + this.f134696e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m42894x9616526c() {
        return "RequestType(slotid=" + this.f134695d + ", bizName=" + this.f134696e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f134695d);
        out.writeString(this.f134696e);
    }
}
