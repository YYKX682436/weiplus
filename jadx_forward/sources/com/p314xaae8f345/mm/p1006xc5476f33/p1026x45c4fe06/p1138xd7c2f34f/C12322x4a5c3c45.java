package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/AppBrandCgiPrefetchedResp;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandCgiPrefetchedResp */
/* loaded from: classes4.dex */
public final /* data */ class C12322x4a5c3c45 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45> f35047x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f165869d;

    /* renamed from: e, reason: collision with root package name */
    public final int f165870e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f165871f;

    public C12322x4a5c3c45(java.lang.String result, int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f165869d = result;
        this.f165870e = i17;
        this.f165871f = errMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m51648xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45 c12322x4a5c3c45 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12322x4a5c3c45) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165869d, c12322x4a5c3c45.f165869d) && this.f165870e == c12322x4a5c3c45.f165870e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f165871f, c12322x4a5c3c45.f165871f);
    }

    /* renamed from: hashCode */
    public int m51649x8cdac1b() {
        return (((this.f165869d.hashCode() * 31) + java.lang.Integer.hashCode(this.f165870e)) * 31) + this.f165871f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51650x9616526c() {
        return "AppBrandCgiPrefetchedResp(result=" + this.f165869d + ", errCode=" + this.f165870e + ", errMsg=" + this.f165871f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f165869d);
        out.writeInt(this.f165870e);
        out.writeString(this.f165871f);
    }
}
