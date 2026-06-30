package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/magicbrush/plugin/scl/jsapi/MBJsApiSetCanvasStatus$IPCData", "Landroid/os/Parcelable;", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.magicbrush.plugin.scl.jsapi.MBJsApiSetCanvasStatus$IPCData */
/* loaded from: classes7.dex */
final /* data */ class C10861xec608ef2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.C10861xec608ef2> f29648x681a0c0c = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.m();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f150184d;

    /* renamed from: e, reason: collision with root package name */
    public final int f150185e;

    public C10861xec608ef2(java.lang.String frameSetId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        this.f150184d = frameSetId;
        this.f150185e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m46577xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.C10861xec608ef2)) {
            return false;
        }
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.C10861xec608ef2 c10861xec608ef2 = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.C10861xec608ef2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150184d, c10861xec608ef2.f150184d) && this.f150185e == c10861xec608ef2.f150185e;
    }

    /* renamed from: hashCode */
    public int m46578x8cdac1b() {
        return (this.f150184d.hashCode() * 31) + java.lang.Integer.hashCode(this.f150185e);
    }

    /* renamed from: toString */
    public java.lang.String m46579x9616526c() {
        return "IPCData(frameSetId=" + this.f150184d + ", canvasId=" + this.f150185e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f150184d);
        out.writeInt(this.f150185e);
    }
}
