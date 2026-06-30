package com.tencent.mm.maas_api;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/maas_api/MJMediaItem;", "Landroid/os/Parcelable;", "pp0/u0", "maas-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class MJMediaItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.maas_api.MJMediaItem> CREATOR = new pp0.t0();

    /* renamed from: d, reason: collision with root package name */
    public final pp0.u0 f68638d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f68639e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f68640f;

    /* renamed from: g, reason: collision with root package name */
    public int f68641g;

    /* renamed from: h, reason: collision with root package name */
    public int f68642h;

    /* renamed from: i, reason: collision with root package name */
    public int f68643i;

    public MJMediaItem(pp0.u0 mediaType, java.lang.String mediaPath, java.lang.String thumbPath, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        this.f68638d = mediaType;
        this.f68639e = mediaPath;
        this.f68640f = thumbPath;
        this.f68641g = i17;
        this.f68642h = i18;
        this.f68643i = i19;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.maas_api.MJMediaItem)) {
            return false;
        }
        com.tencent.mm.maas_api.MJMediaItem mJMediaItem = (com.tencent.mm.maas_api.MJMediaItem) obj;
        return this.f68638d == mJMediaItem.f68638d && kotlin.jvm.internal.o.b(this.f68639e, mJMediaItem.f68639e) && kotlin.jvm.internal.o.b(this.f68640f, mJMediaItem.f68640f) && this.f68641g == mJMediaItem.f68641g && this.f68642h == mJMediaItem.f68642h && this.f68643i == mJMediaItem.f68643i;
    }

    public int hashCode() {
        return (((((((((this.f68638d.hashCode() * 31) + this.f68639e.hashCode()) * 31) + this.f68640f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f68641g)) * 31) + java.lang.Integer.hashCode(this.f68642h)) * 31) + java.lang.Integer.hashCode(this.f68643i);
    }

    public java.lang.String toString() {
        return "MJMediaItem(mediaType=" + this.f68638d + ", mediaPath=" + this.f68639e + ", thumbPath=" + this.f68640f + ", width=" + this.f68641g + ", height=" + this.f68642h + ", rotate=" + this.f68643i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f68638d.name());
        out.writeString(this.f68639e);
        out.writeString(this.f68640f);
        out.writeInt(this.f68641g);
        out.writeInt(this.f68642h);
        out.writeInt(this.f68643i);
    }

    public /* synthetic */ MJMediaItem(pp0.u0 u0Var, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this(u0Var, str, (i27 & 4) != 0 ? str : str2, (i27 & 8) != 0 ? -1 : i17, (i27 & 16) != 0 ? -1 : i18, (i27 & 32) != 0 ? 0 : i19);
    }
}
