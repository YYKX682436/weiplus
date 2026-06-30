package com.tencent.mm.plugin.fav.api;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/fav/api/DoFavoriteData;", "Landroid/os/Parcelable;", "CREATOR", "o72/c", "fav-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class DoFavoriteData implements android.os.Parcelable {
    public static final o72.c CREATOR = new o72.c(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f100222d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f100223e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f100224f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f100225g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f100226h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f100227i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f100228m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f100229n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f100230o;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        java.lang.String str = this.f100222d;
        if (str == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            throw null;
        }
        parcel.writeString(str);
        java.lang.String str2 = this.f100223e;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("excerptJson");
            throw null;
        }
        parcel.writeString(str2);
        java.lang.String str3 = this.f100224f;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("cover");
            throw null;
        }
        parcel.writeString(str3);
        java.lang.String str4 = this.f100225g;
        if (str4 == null) {
            kotlin.jvm.internal.o.o("initUrl");
            throw null;
        }
        parcel.writeString(str4);
        java.lang.String str5 = this.f100226h;
        if (str5 == null) {
            kotlin.jvm.internal.o.o("pageKey");
            throw null;
        }
        parcel.writeString(str5);
        java.lang.String str6 = this.f100227i;
        if (str6 == null) {
            kotlin.jvm.internal.o.o("displayName");
            throw null;
        }
        parcel.writeString(str6);
        java.lang.String str7 = this.f100228m;
        if (str7 == null) {
            kotlin.jvm.internal.o.o("itemShowTypeStr");
            throw null;
        }
        parcel.writeString(str7);
        java.lang.String str8 = this.f100229n;
        if (str8 == null) {
            kotlin.jvm.internal.o.o("srcUserName");
            throw null;
        }
        parcel.writeString(str8);
        java.lang.String str9 = this.f100230o;
        if (str9 != null) {
            parcel.writeString(str9);
        } else {
            kotlin.jvm.internal.o.o("jsUserName");
            throw null;
        }
    }
}
