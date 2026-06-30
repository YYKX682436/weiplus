package com.tencent.mm.feature.gallery.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/BizPhotoTargetRect;", "Landroid/os/Parcelable;", "gallery-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final /* data */ class BizPhotoTargetRect implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.feature.gallery.api.BizPhotoTargetRect> CREATOR = new e60.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f67101d;

    /* renamed from: e, reason: collision with root package name */
    public final int f67102e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67103f;

    /* renamed from: g, reason: collision with root package name */
    public final int f67104g;

    public BizPhotoTargetRect(int i17, int i18, int i19, int i27) {
        this.f67101d = i17;
        this.f67102e = i18;
        this.f67103f = i19;
        this.f67104g = i27;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.gallery.api.BizPhotoTargetRect)) {
            return false;
        }
        com.tencent.mm.feature.gallery.api.BizPhotoTargetRect bizPhotoTargetRect = (com.tencent.mm.feature.gallery.api.BizPhotoTargetRect) obj;
        return this.f67101d == bizPhotoTargetRect.f67101d && this.f67102e == bizPhotoTargetRect.f67102e && this.f67103f == bizPhotoTargetRect.f67103f && this.f67104g == bizPhotoTargetRect.f67104g;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f67101d) * 31) + java.lang.Integer.hashCode(this.f67102e)) * 31) + java.lang.Integer.hashCode(this.f67103f)) * 31) + java.lang.Integer.hashCode(this.f67104g);
    }

    public java.lang.String toString() {
        return "BizPhotoTargetRect(left=" + this.f67101d + ", top=" + this.f67102e + ", right=" + this.f67103f + ", bottom=" + this.f67104g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f67101d);
        out.writeInt(this.f67102e);
        out.writeInt(this.f67103f);
        out.writeInt(this.f67104g);
    }
}
