package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/finder/live/api/params/FinderLiveGalleryParams;", "Landroid/os/Parcelable;", "CREATOR", "t40/c", "live-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.finder.live.api.params.FinderLiveGalleryParams */
/* loaded from: classes3.dex */
public final class C10598x47b4a646 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final t40.c f28875x681a0c0c = new t40.c(null);

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f148138f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f148139g;

    /* renamed from: h, reason: collision with root package name */
    public long f148140h;

    /* renamed from: d, reason: collision with root package name */
    public int f148136d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f148137e = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f148141i = "";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f148136d);
        parcel.writeString(this.f148137e);
        parcel.writeString(this.f148138f);
        parcel.writeString(this.f148139g);
        parcel.writeLong(this.f148140h);
        parcel.writeString(this.f148141i);
    }
}
