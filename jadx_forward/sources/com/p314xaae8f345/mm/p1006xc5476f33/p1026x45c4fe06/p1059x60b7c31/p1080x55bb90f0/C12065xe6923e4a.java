package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolRoomsBundle;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle */
/* loaded from: classes4.dex */
public final /* data */ class C12065xe6923e4a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12065xe6923e4a> f34028x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.h();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f161888d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161889e;

    public C12065xe6923e4a(java.util.ArrayList userNameList, java.lang.String chatToolRoomsId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolRoomsId, "chatToolRoomsId");
        this.f161888d = userNameList;
        this.f161889e = chatToolRoomsId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50825xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12065xe6923e4a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12065xe6923e4a c12065xe6923e4a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12065xe6923e4a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161888d, c12065xe6923e4a.f161888d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161889e, c12065xe6923e4a.f161889e);
    }

    /* renamed from: hashCode */
    public int m50826x8cdac1b() {
        return (this.f161888d.hashCode() * 31) + this.f161889e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50827x9616526c() {
        return "ChatToolRoomsBundle(userNameList=" + this.f161888d + ", chatToolRoomsId=" + this.f161889e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeStringList(this.f161888d);
        out.writeString(this.f161889e);
    }
}
