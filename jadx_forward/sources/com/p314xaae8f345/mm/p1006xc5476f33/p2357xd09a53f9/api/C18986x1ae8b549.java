package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/wallet/api/JsApiRequestWCPayRealnameVerifyParameter;", "Landroid/os/Parcelable;", "wallet-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet.api.JsApiRequestWCPayRealnameVerifyParameter */
/* loaded from: classes.dex */
public final /* data */ class C18986x1ae8b549 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549> f38650x681a0c0c = new pr4.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f259086d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f259087e;

    public C18986x1ae8b549(java.lang.String scene, java.lang.String token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        this.f259086d = scene;
        this.f259087e = token;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m73791xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549 c18986x1ae8b549 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.api.C18986x1ae8b549) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f259086d, c18986x1ae8b549.f259086d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f259087e, c18986x1ae8b549.f259087e);
    }

    /* renamed from: hashCode */
    public int m73792x8cdac1b() {
        return (this.f259086d.hashCode() * 31) + this.f259087e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m73793x9616526c() {
        return "JsApiRequestWCPayRealnameVerifyParameter(scene=" + this.f259086d + ", token=" + this.f259087e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f259086d);
        out.writeString(this.f259087e);
    }
}
