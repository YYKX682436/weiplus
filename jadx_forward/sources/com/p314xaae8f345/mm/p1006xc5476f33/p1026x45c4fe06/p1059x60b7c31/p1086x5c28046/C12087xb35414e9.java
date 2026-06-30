package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/emoji/JsApiOpenDesignerProfile$DesignerResult", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.emoji.JsApiOpenDesignerProfile$DesignerResult */
/* loaded from: classes13.dex */
public final /* data */ class C12087xb35414e9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12087xb35414e9> f34141x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.i();

    /* renamed from: d, reason: collision with root package name */
    public final int f162348d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f162349e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f162350f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f162351g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f162352h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f162353i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f162354m;

    public C12087xb35414e9(int i17, java.lang.String name, java.lang.String headUrl, java.lang.String finderUserName, java.lang.String finderNickname, java.lang.String finderHeadimgUrl, java.lang.String designerDescription) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headUrl, "headUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderNickname, "finderNickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderHeadimgUrl, "finderHeadimgUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(designerDescription, "designerDescription");
        this.f162348d = i17;
        this.f162349e = name;
        this.f162350f = headUrl;
        this.f162351g = finderUserName;
        this.f162352h = finderNickname;
        this.f162353i = finderHeadimgUrl;
        this.f162354m = designerDescription;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50903xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12087xb35414e9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12087xb35414e9 c12087xb35414e9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1086x5c28046.C12087xb35414e9) obj;
        return this.f162348d == c12087xb35414e9.f162348d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162349e, c12087xb35414e9.f162349e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162350f, c12087xb35414e9.f162350f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162351g, c12087xb35414e9.f162351g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162352h, c12087xb35414e9.f162352h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162353i, c12087xb35414e9.f162353i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f162354m, c12087xb35414e9.f162354m);
    }

    /* renamed from: hashCode */
    public int m50904x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.f162348d) * 31) + this.f162349e.hashCode()) * 31) + this.f162350f.hashCode()) * 31) + this.f162351g.hashCode()) * 31) + this.f162352h.hashCode()) * 31) + this.f162353i.hashCode()) * 31) + this.f162354m.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50905x9616526c() {
        return "DesignerResult(designerUin=" + this.f162348d + ", name=" + this.f162349e + ", headUrl=" + this.f162350f + ", finderUserName=" + this.f162351g + ", finderNickname=" + this.f162352h + ", finderHeadimgUrl=" + this.f162353i + ", designerDescription=" + this.f162354m + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f162348d);
        out.writeString(this.f162349e);
        out.writeString(this.f162350f);
        out.writeString(this.f162351g);
        out.writeString(this.f162352h);
        out.writeString(this.f162353i);
        out.writeString(this.f162354m);
    }
}
