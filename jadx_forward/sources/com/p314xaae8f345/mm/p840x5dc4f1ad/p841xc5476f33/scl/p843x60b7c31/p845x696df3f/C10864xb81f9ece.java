package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/magicbrush/plugin/scl/jsapi/touch/MBJsApiSetGestureRects$IPCData", "Landroid/os/Parcelable;", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCData */
/* loaded from: classes7.dex */
final /* data */ class C10864xb81f9ece implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10864xb81f9ece> f29651x681a0c0c = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150202d;

    /* renamed from: e, reason: collision with root package name */
    public final int f150203e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f150204f;

    public C10864xb81f9ece(java.lang.String frameSetId, int i17, java.lang.String rects) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rects, "rects");
        this.f150202d = frameSetId;
        this.f150203e = i17;
        this.f150204f = rects;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46598xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10864xb81f9ece)) {
            return false;
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10864xb81f9ece c10864xb81f9ece = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p845x696df3f.C10864xb81f9ece) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150202d, c10864xb81f9ece.f150202d) && this.f150203e == c10864xb81f9ece.f150203e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150204f, c10864xb81f9ece.f150204f);
    }

    /* renamed from: hashCode */
    public int m46599x8cdac1b() {
        return (((this.f150202d.hashCode() * 31) + java.lang.Integer.hashCode(this.f150203e)) * 31) + this.f150204f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m46600x9616526c() {
        return "IPCData(frameSetId=" + this.f150202d + ", canvasId=" + this.f150203e + ", rects=" + this.f150204f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f150202d);
        out.writeInt(this.f150203e);
        out.writeString(this.f150204f);
    }
}
