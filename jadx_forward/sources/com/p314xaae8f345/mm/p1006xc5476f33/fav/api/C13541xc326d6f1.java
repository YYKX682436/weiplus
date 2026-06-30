package com.p314xaae8f345.mm.p1006xc5476f33.fav.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fav/api/DelFavoriteData;", "Landroid/os/Parcelable;", "CREATOR", "o72/b", "fav-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fav.api.DelFavoriteData */
/* loaded from: classes8.dex */
public final class C13541xc326d6f1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final o72.b f35514x681a0c0c = new o72.b(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f181748d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f181749e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181750f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181751g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f181752h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f181753i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f181754m;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.lang.String str = this.f181748d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("excerptKeys");
            throw null;
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f181749e;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageKey");
            throw null;
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f181750f;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initUrl");
            throw null;
        }
        parcel.writeString(str3);
        java.lang.String str4 = this.f181751g;
        if (str4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("srcDisplayName");
            throw null;
        }
        parcel.writeString(str4);
        java.lang.String str5 = this.f181752h;
        if (str5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemShowTypeStr");
            throw null;
        }
        parcel.writeString(str5);
        java.lang.String str6 = this.f181753i;
        if (str6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("srcUserName");
            throw null;
        }
        parcel.writeString(str6);
        java.lang.String str7 = this.f181754m;
        if (str7 != null) {
            parcel.writeString(str7);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsUserName");
            throw null;
        }
    }
}
