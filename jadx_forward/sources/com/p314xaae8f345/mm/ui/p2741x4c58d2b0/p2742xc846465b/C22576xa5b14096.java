package com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/transmit/recent/ForwardConversationInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/ui/transmit/recent/e", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.transmit.recent.ForwardConversationInfo */
/* loaded from: classes8.dex */
public final /* data */ class C22576xa5b14096 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.e f39694x681a0c0c = new com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.e(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292578d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f292579e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f292580f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f292581g;

    public C22576xa5b14096(java.lang.String str, java.lang.String nickName, java.lang.String contactAlias, java.lang.String contactConRemark) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactAlias, "contactAlias");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactConRemark, "contactConRemark");
        this.f292578d = str;
        this.f292579e = nickName;
        this.f292580f = contactAlias;
        this.f292581g = contactConRemark;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m81143xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096 c22576xa5b14096 = (com.p314xaae8f345.mm.ui.p2741x4c58d2b0.p2742xc846465b.C22576xa5b14096) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f292578d, c22576xa5b14096.f292578d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f292579e, c22576xa5b14096.f292579e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f292580f, c22576xa5b14096.f292580f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f292581g, c22576xa5b14096.f292581g);
    }

    /* renamed from: hashCode */
    public int m81144x8cdac1b() {
        java.lang.String str = this.f292578d;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.f292579e.hashCode()) * 31) + this.f292580f.hashCode()) * 31) + this.f292581g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m81145x9616526c() {
        return "ForwardConversationInfo(userName=" + this.f292578d + ", nickName=" + this.f292579e + ", contactAlias=" + this.f292580f + ", contactConRemark=" + this.f292581g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f292578d);
        parcel.writeString(this.f292579e);
        parcel.writeString(this.f292580f);
        parcel.writeString(this.f292581g);
    }
}
