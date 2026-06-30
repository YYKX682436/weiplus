package com.p314xaae8f345.mm.p1006xc5476f33.fav.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fav/api/DoFavoriteData;", "Landroid/os/Parcelable;", "CREATOR", "o72/c", "fav-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fav.api.DoFavoriteData */
/* loaded from: classes8.dex */
public final class C13542x92d0b3b1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final o72.c f35515x681a0c0c = new o72.c(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f181755d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f181756e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181757f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181758g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181759h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f181760i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f181761m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f181762n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f181763o;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String str = this.f181755d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            throw null;
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f181756e;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("excerptJson");
            throw null;
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f181757f;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cover");
            throw null;
        }
        parcel.writeString(str3);
        java.lang.String str4 = this.f181758g;
        if (str4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initUrl");
            throw null;
        }
        parcel.writeString(str4);
        java.lang.String str5 = this.f181759h;
        if (str5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageKey");
            throw null;
        }
        parcel.writeString(str5);
        java.lang.String str6 = this.f181760i;
        if (str6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("displayName");
            throw null;
        }
        parcel.writeString(str6);
        java.lang.String str7 = this.f181761m;
        if (str7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemShowTypeStr");
            throw null;
        }
        parcel.writeString(str7);
        java.lang.String str8 = this.f181762n;
        if (str8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("srcUserName");
            throw null;
        }
        parcel.writeString(str8);
        java.lang.String str9 = this.f181763o;
        if (str9 != null) {
            parcel.writeString(str9);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsUserName");
            throw null;
        }
    }
}
