package com.tencent.mm.feature.gallery.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/BizPhotoGalleryImageEntry;", "Landroid/os/Parcelable;", "gallery-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class BizPhotoGalleryImageEntry implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry> CREATOR = new e60.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f67095d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f67096e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f67097f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f67098g;

    /* renamed from: h, reason: collision with root package name */
    public final long f67099h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f67100i;

    public BizPhotoGalleryImageEntry(java.lang.String originUrl, java.lang.String thumbUrl, boolean z17, java.lang.String liveVideoUrl, long j17, java.lang.String originLiveVideoUrl) {
        kotlin.jvm.internal.o.g(originUrl, "originUrl");
        kotlin.jvm.internal.o.g(thumbUrl, "thumbUrl");
        kotlin.jvm.internal.o.g(liveVideoUrl, "liveVideoUrl");
        kotlin.jvm.internal.o.g(originLiveVideoUrl, "originLiveVideoUrl");
        this.f67095d = originUrl;
        this.f67096e = thumbUrl;
        this.f67097f = z17;
        this.f67098g = liveVideoUrl;
        this.f67099h = j17;
        this.f67100i = originLiveVideoUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry)) {
            return false;
        }
        com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry bizPhotoGalleryImageEntry = (com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry) obj;
        return kotlin.jvm.internal.o.b(this.f67095d, bizPhotoGalleryImageEntry.f67095d) && kotlin.jvm.internal.o.b(this.f67096e, bizPhotoGalleryImageEntry.f67096e) && this.f67097f == bizPhotoGalleryImageEntry.f67097f && kotlin.jvm.internal.o.b(this.f67098g, bizPhotoGalleryImageEntry.f67098g) && this.f67099h == bizPhotoGalleryImageEntry.f67099h && kotlin.jvm.internal.o.b(this.f67100i, bizPhotoGalleryImageEntry.f67100i);
    }

    public int hashCode() {
        return (((((((((this.f67095d.hashCode() * 31) + this.f67096e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f67097f)) * 31) + this.f67098g.hashCode()) * 31) + java.lang.Long.hashCode(this.f67099h)) * 31) + this.f67100i.hashCode();
    }

    public java.lang.String toString() {
        return "BizPhotoGalleryImageEntry(originUrl=" + this.f67095d + ", thumbUrl=" + this.f67096e + ", isLivePhoto=" + this.f67097f + ", liveVideoUrl=" + this.f67098g + ", fileSize=" + this.f67099h + ", originLiveVideoUrl=" + this.f67100i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f67095d);
        out.writeString(this.f67096e);
        out.writeInt(this.f67097f ? 1 : 0);
        out.writeString(this.f67098g);
        out.writeLong(this.f67099h);
        out.writeString(this.f67100i);
    }
}
