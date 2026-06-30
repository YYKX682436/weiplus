package com.tencent.mm.feature.gallery.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/BizPhotoAccountGalleryArgs;", "Landroid/os/Parcelable;", "gallery-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class BizPhotoAccountGalleryArgs implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs> CREATOR = new e60.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f67089d;

    /* renamed from: e, reason: collision with root package name */
    public final int f67090e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.feature.gallery.api.BizPhotoTargetRect f67091f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f67092g;

    /* renamed from: h, reason: collision with root package name */
    public final int f67093h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.feature.gallery.api.BizData f67094i;

    public BizPhotoAccountGalleryArgs(java.util.List images, int i17, com.tencent.mm.feature.gallery.api.BizPhotoTargetRect bizPhotoTargetRect, java.lang.String str, int i18, com.tencent.mm.feature.gallery.api.BizData data) {
        kotlin.jvm.internal.o.g(images, "images");
        kotlin.jvm.internal.o.g(data, "data");
        this.f67089d = images;
        this.f67090e = i17;
        this.f67091f = bizPhotoTargetRect;
        this.f67092g = str;
        this.f67093h = i18;
        this.f67094i = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs)) {
            return false;
        }
        com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs bizPhotoAccountGalleryArgs = (com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs) obj;
        return kotlin.jvm.internal.o.b(this.f67089d, bizPhotoAccountGalleryArgs.f67089d) && this.f67090e == bizPhotoAccountGalleryArgs.f67090e && kotlin.jvm.internal.o.b(this.f67091f, bizPhotoAccountGalleryArgs.f67091f) && kotlin.jvm.internal.o.b(this.f67092g, bizPhotoAccountGalleryArgs.f67092g) && this.f67093h == bizPhotoAccountGalleryArgs.f67093h && kotlin.jvm.internal.o.b(this.f67094i, bizPhotoAccountGalleryArgs.f67094i);
    }

    public int hashCode() {
        int hashCode = ((this.f67089d.hashCode() * 31) + java.lang.Integer.hashCode(this.f67090e)) * 31;
        com.tencent.mm.feature.gallery.api.BizPhotoTargetRect bizPhotoTargetRect = this.f67091f;
        int hashCode2 = (hashCode + (bizPhotoTargetRect == null ? 0 : bizPhotoTargetRect.hashCode())) * 31;
        java.lang.String str = this.f67092g;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f67093h)) * 31) + this.f67094i.hashCode();
    }

    public java.lang.String toString() {
        return "BizPhotoAccountGalleryArgs(images=" + this.f67089d + ", currentIndex=" + this.f67090e + ", targetRect=" + this.f67091f + ", currentImageBufferBase64=" + this.f67092g + ", webViewId=" + this.f67093h + ", data=" + this.f67094i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        java.util.List list = this.f67089d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry) it.next()).writeToParcel(out, i17);
        }
        out.writeInt(this.f67090e);
        com.tencent.mm.feature.gallery.api.BizPhotoTargetRect bizPhotoTargetRect = this.f67091f;
        if (bizPhotoTargetRect == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bizPhotoTargetRect.writeToParcel(out, i17);
        }
        out.writeString(this.f67092g);
        out.writeInt(this.f67093h);
        this.f67094i.writeToParcel(out, i17);
    }
}
