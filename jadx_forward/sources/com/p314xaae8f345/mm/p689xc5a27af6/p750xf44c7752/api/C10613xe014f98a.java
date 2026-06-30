package com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/BizPhotoGalleryImageEntry;", "Landroid/os/Parcelable;", "gallery-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry */
/* loaded from: classes8.dex */
public final /* data */ class C10613xe014f98a implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10613xe014f98a> f28878x681a0c0c = new e60.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f148628d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f148629e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f148630f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f148631g;

    /* renamed from: h, reason: collision with root package name */
    public final long f148632h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f148633i;

    public C10613xe014f98a(java.lang.String originUrl, java.lang.String thumbUrl, boolean z17, java.lang.String liveVideoUrl, long j17, java.lang.String originLiveVideoUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originUrl, "originUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbUrl, "thumbUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveVideoUrl, "liveVideoUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originLiveVideoUrl, "originLiveVideoUrl");
        this.f148628d = originUrl;
        this.f148629e = thumbUrl;
        this.f148630f = z17;
        this.f148631g = liveVideoUrl;
        this.f148632h = j17;
        this.f148633i = originLiveVideoUrl;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45029xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10613xe014f98a)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10613xe014f98a c10613xe014f98a = (com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10613xe014f98a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148628d, c10613xe014f98a.f148628d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148629e, c10613xe014f98a.f148629e) && this.f148630f == c10613xe014f98a.f148630f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148631g, c10613xe014f98a.f148631g) && this.f148632h == c10613xe014f98a.f148632h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148633i, c10613xe014f98a.f148633i);
    }

    /* renamed from: hashCode */
    public int m45030x8cdac1b() {
        return (((((((((this.f148628d.hashCode() * 31) + this.f148629e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f148630f)) * 31) + this.f148631g.hashCode()) * 31) + java.lang.Long.hashCode(this.f148632h)) * 31) + this.f148633i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m45031x9616526c() {
        return "BizPhotoGalleryImageEntry(originUrl=" + this.f148628d + ", thumbUrl=" + this.f148629e + ", isLivePhoto=" + this.f148630f + ", liveVideoUrl=" + this.f148631g + ", fileSize=" + this.f148632h + ", originLiveVideoUrl=" + this.f148633i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f148628d);
        out.writeString(this.f148629e);
        out.writeInt(this.f148630f ? 1 : 0);
        out.writeString(this.f148631g);
        out.writeLong(this.f148632h);
        out.writeString(this.f148633i);
    }
}
