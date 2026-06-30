package com.tencent.mm.feature.gallery.api;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/GalleryParams;", "Landroid/os/Parcelable;", "CREATOR", "e60/w0", "plugin-gallery.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class GalleryParams implements android.os.Parcelable {
    public static final e60.w0 CREATOR = new e60.w0(null);

    /* renamed from: d, reason: collision with root package name */
    public int f67105d = -1;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f67106e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f67107f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f67105d);
        parcel.writeString(this.f67106e);
        parcel.writeString(this.f67107f);
    }
}
