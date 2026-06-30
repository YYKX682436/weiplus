package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiGetWeAppNewTipsInfo$NewTipInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiGetWeAppNewTipsInfo$NewTipInfo */
/* loaded from: classes.dex */
public final /* data */ class C11919x694eb55 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11919x694eb55> f33654x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l6();

    /* renamed from: d, reason: collision with root package name */
    public final int f160056d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f160057e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f160058f;

    /* renamed from: g, reason: collision with root package name */
    public final int f160059g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f160060h;

    public C11919x694eb55(int i17, java.lang.String title, java.lang.String iconUrl, int i18, java.lang.String uniqueId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        this.f160056d = i17;
        this.f160057e = title;
        this.f160058f = iconUrl;
        this.f160059g = i18;
        this.f160060h = uniqueId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50458xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11919x694eb55)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11919x694eb55 c11919x694eb55 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11919x694eb55) obj;
        return this.f160056d == c11919x694eb55.f160056d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160057e, c11919x694eb55.f160057e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160058f, c11919x694eb55.f160058f) && this.f160059g == c11919x694eb55.f160059g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160060h, c11919x694eb55.f160060h);
    }

    /* renamed from: hashCode */
    public int m50459x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f160056d) * 31) + this.f160057e.hashCode()) * 31) + this.f160058f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f160059g)) * 31) + this.f160060h.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50460x9616526c() {
        return "NewTipInfo(showType=" + this.f160056d + ", title=" + this.f160057e + ", iconUrl=" + this.f160058f + ", tipsId=" + this.f160059g + ", uniqueId=" + this.f160060h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f160056d);
        out.writeString(this.f160057e);
        out.writeString(this.f160058f);
        out.writeInt(this.f160059g);
        out.writeString(this.f160060h);
    }
}
