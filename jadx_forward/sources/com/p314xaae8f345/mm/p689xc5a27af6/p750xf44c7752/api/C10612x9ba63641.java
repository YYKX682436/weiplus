package com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/BizPhotoAccountGalleryArgs;", "Landroid/os/Parcelable;", "gallery-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs */
/* loaded from: classes8.dex */
public final /* data */ class C10612x9ba63641 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641> f28877x681a0c0c = new e60.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f148622d;

    /* renamed from: e, reason: collision with root package name */
    public final int f148623e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174 f148624f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f148625g;

    /* renamed from: h, reason: collision with root package name */
    public final int f148626h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10611x5d5fb73d f148627i;

    public C10612x9ba63641(java.util.List images, int i17, com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174 c10614x23c16174, java.lang.String str, int i18, com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10611x5d5fb73d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(images, "images");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f148622d = images;
        this.f148623e = i17;
        this.f148624f = c10614x23c16174;
        this.f148625g = str;
        this.f148626h = i18;
        this.f148627i = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45025xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641 c10612x9ba63641 = (com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10612x9ba63641) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148622d, c10612x9ba63641.f148622d) && this.f148623e == c10612x9ba63641.f148623e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148624f, c10612x9ba63641.f148624f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148625g, c10612x9ba63641.f148625g) && this.f148626h == c10612x9ba63641.f148626h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f148627i, c10612x9ba63641.f148627i);
    }

    /* renamed from: hashCode */
    public int m45026x8cdac1b() {
        int hashCode = ((this.f148622d.hashCode() * 31) + java.lang.Integer.hashCode(this.f148623e)) * 31;
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174 c10614x23c16174 = this.f148624f;
        int m45034x8cdac1b = (hashCode + (c10614x23c16174 == null ? 0 : c10614x23c16174.m45034x8cdac1b())) * 31;
        java.lang.String str = this.f148625g;
        return ((((m45034x8cdac1b + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f148626h)) * 31) + this.f148627i.m45022x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m45027x9616526c() {
        return "BizPhotoAccountGalleryArgs(images=" + this.f148622d + ", currentIndex=" + this.f148623e + ", targetRect=" + this.f148624f + ", currentImageBufferBase64=" + this.f148625g + ", webViewId=" + this.f148626h + ", data=" + this.f148627i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f148622d;
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10613xe014f98a) it.next()).writeToParcel(out, i17);
        }
        out.writeInt(this.f148623e);
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174 c10614x23c16174 = this.f148624f;
        if (c10614x23c16174 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c10614x23c16174.writeToParcel(out, i17);
        }
        out.writeString(this.f148625g);
        out.writeInt(this.f148626h);
        this.f148627i.writeToParcel(out, i17);
    }
}
