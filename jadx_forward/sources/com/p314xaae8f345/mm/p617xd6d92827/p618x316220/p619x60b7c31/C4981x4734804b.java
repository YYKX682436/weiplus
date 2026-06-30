package com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/advertise/impl/jsapi/MBJsApiGetAdPushMsg$AdPushMsgListWrapper", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.advertise.impl.jsapi.MBJsApiGetAdPushMsg$AdPushMsgListWrapper */
/* loaded from: classes.dex */
public final /* data */ class C4981x4734804b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4981x4734804b> f21392x681a0c0c = new com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.p();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f134697d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f134698e;

    public C4981x4734804b(java.util.List msgDataList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgDataList, "msgDataList");
        this.f134697d = msgDataList;
        this.f134698e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m42896xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4981x4734804b)) {
            return false;
        }
        com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4981x4734804b c4981x4734804b = (com.p314xaae8f345.mm.p617xd6d92827.p618x316220.p619x60b7c31.C4981x4734804b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f134697d, c4981x4734804b.f134697d) && this.f134698e == c4981x4734804b.f134698e;
    }

    /* renamed from: hashCode */
    public int m42897x8cdac1b() {
        return (this.f134697d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f134698e);
    }

    /* renamed from: toString */
    public java.lang.String m42898x9616526c() {
        return "AdPushMsgListWrapper(msgDataList=" + this.f134697d + ", status=" + this.f134698e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f134697d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        out.writeInt(this.f134698e ? 1 : 0);
    }
}
