package com.tencent.mm.plugin.fav.api;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fav/api/DelFavoriteData;", "Landroid/os/Parcelable;", "CREATOR", "o72/b", "fav-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class DelFavoriteData implements android.os.Parcelable {
    public static final o72.b CREATOR = new o72.b(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f100215d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f100216e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f100217f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f100218g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f100219h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f100220i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f100221m;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String str = this.f100215d;
        if (str == null) {
            kotlin.jvm.internal.o.o("excerptKeys");
            throw null;
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f100216e;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("pageKey");
            throw null;
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f100217f;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("initUrl");
            throw null;
        }
        parcel.writeString(str3);
        java.lang.String str4 = this.f100218g;
        if (str4 == null) {
            kotlin.jvm.internal.o.o("srcDisplayName");
            throw null;
        }
        parcel.writeString(str4);
        java.lang.String str5 = this.f100219h;
        if (str5 == null) {
            kotlin.jvm.internal.o.o("itemShowTypeStr");
            throw null;
        }
        parcel.writeString(str5);
        java.lang.String str6 = this.f100220i;
        if (str6 == null) {
            kotlin.jvm.internal.o.o("srcUserName");
            throw null;
        }
        parcel.writeString(str6);
        java.lang.String str7 = this.f100221m;
        if (str7 != null) {
            parcel.writeString(str7);
        } else {
            kotlin.jvm.internal.o.o("jsUserName");
            throw null;
        }
    }
}
