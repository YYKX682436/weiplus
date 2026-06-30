package com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/GalleryParams;", "Landroid/os/Parcelable;", "CREATOR", "e60/w0", "plugin-gallery.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.gallery.api.GalleryParams */
/* loaded from: classes11.dex */
public final class C10615x40454758 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final e60.w0 f28880x681a0c0c = new e60.w0(null);

    /* renamed from: d, reason: collision with root package name */
    public int f148638d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f148639e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f148640f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f148638d);
        parcel.writeString(this.f148639e);
        parcel.writeString(this.f148640f);
    }
}
