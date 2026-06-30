package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/advertise/impl/jsapi/MBJsApiGetAdPushMsg$RequestType", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$RequestType */
/* loaded from: classes.dex */
public final /* data */ class C4982x236cabef implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4982x236cabef> f21393x681a0c0c = new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.r();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f134699d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f134700e;

    public C4982x236cabef(java.lang.String slotid, java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotid, "slotid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        this.f134699d = slotid;
        this.f134700e = bizName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42900xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4982x236cabef)) {
            return false;
        }
        com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4982x236cabef c4982x236cabef = (com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4982x236cabef) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134699d, c4982x236cabef.f134699d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134700e, c4982x236cabef.f134700e);
    }

    /* renamed from: hashCode */
    public int m42901x8cdac1b() {
        return (this.f134699d.hashCode() * 31) + this.f134700e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m42902x9616526c() {
        return "RequestType(slotid=" + this.f134699d + ", bizName=" + this.f134700e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f134699d);
        out.writeString(this.f134700e);
    }
}
