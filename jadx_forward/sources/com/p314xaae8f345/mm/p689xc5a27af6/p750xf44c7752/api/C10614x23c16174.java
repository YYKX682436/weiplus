package com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/feature/gallery/api/BizPhotoTargetRect;", "Landroid/os/Parcelable;", "gallery-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.gallery.api.BizPhotoTargetRect */
/* loaded from: classes8.dex */
public final /* data */ class C10614x23c16174 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174> f28879x681a0c0c = new e60.d();

    /* renamed from: d, reason: collision with root package name */
    public final int f148634d;

    /* renamed from: e, reason: collision with root package name */
    public final int f148635e;

    /* renamed from: f, reason: collision with root package name */
    public final int f148636f;

    /* renamed from: g, reason: collision with root package name */
    public final int f148637g;

    public C10614x23c16174(int i17, int i18, int i19, int i27) {
        this.f148634d = i17;
        this.f148635e = i18;
        this.f148636f = i19;
        this.f148637g = i27;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m45033xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174 c10614x23c16174 = (com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10614x23c16174) obj;
        return this.f148634d == c10614x23c16174.f148634d && this.f148635e == c10614x23c16174.f148635e && this.f148636f == c10614x23c16174.f148636f && this.f148637g == c10614x23c16174.f148637g;
    }

    /* renamed from: hashCode */
    public int m45034x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f148634d) * 31) + java.lang.Integer.hashCode(this.f148635e)) * 31) + java.lang.Integer.hashCode(this.f148636f)) * 31) + java.lang.Integer.hashCode(this.f148637g);
    }

    /* renamed from: toString */
    public java.lang.String m45035x9616526c() {
        return "BizPhotoTargetRect(left=" + this.f148634d + ", top=" + this.f148635e + ", right=" + this.f148636f + ", bottom=" + this.f148637g + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f148634d);
        out.writeInt(this.f148635e);
        out.writeInt(this.f148636f);
        out.writeInt(this.f148637g);
    }
}
