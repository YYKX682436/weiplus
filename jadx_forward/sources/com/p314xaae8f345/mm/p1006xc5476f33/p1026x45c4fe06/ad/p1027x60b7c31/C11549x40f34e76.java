package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/ad/jsapi/JsApiGetAdPushMsg$AdPushMsgListWrapper", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ad.jsapi.JsApiGetAdPushMsg$AdPushMsgListWrapper */
/* loaded from: classes.dex */
public final /* data */ class C11549x40f34e76 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.C11549x40f34e76> f33374x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.o();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f156430d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f156431e;

    public C11549x40f34e76(java.util.List msgDataList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgDataList, "msgDataList");
        this.f156430d = msgDataList;
        this.f156431e = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48841xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.C11549x40f34e76)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.C11549x40f34e76 c11549x40f34e76 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.C11549x40f34e76) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156430d, c11549x40f34e76.f156430d) && this.f156431e == c11549x40f34e76.f156431e;
    }

    /* renamed from: hashCode */
    public int m48842x8cdac1b() {
        return (this.f156430d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f156431e);
    }

    /* renamed from: toString */
    public java.lang.String m48843x9616526c() {
        return "AdPushMsgListWrapper(msgDataList=" + this.f156430d + ", status=" + this.f156431e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f156430d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeParcelable((android.os.Parcelable) it.next(), i17);
        }
        out.writeInt(this.f156431e ? 1 : 0);
    }
}
