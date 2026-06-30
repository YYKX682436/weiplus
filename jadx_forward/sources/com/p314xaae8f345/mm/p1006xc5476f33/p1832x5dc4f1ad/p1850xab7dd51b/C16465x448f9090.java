package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/texture/IPCExternalTextureEventData;", "Landroid/os/Parcelable;", "mb-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.texture.IPCExternalTextureEventData */
/* loaded from: classes7.dex */
public final /* data */ class C16465x448f9090 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16465x448f9090> f37624x681a0c0c = new ve3.t();

    /* renamed from: d, reason: collision with root package name */
    public final int f229689d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f229690e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f229691f;

    public C16465x448f9090(int i17, java.lang.String eventType, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        this.f229689d = i17;
        this.f229690e = eventType;
        this.f229691f = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66518xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16465x448f9090)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16465x448f9090 c16465x448f9090 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16465x448f9090) obj;
        return this.f229689d == c16465x448f9090.f229689d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229690e, c16465x448f9090.f229690e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229691f, c16465x448f9090.f229691f);
    }

    /* renamed from: hashCode */
    public int m66519x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f229689d) * 31) + this.f229690e.hashCode()) * 31;
        java.lang.String str = this.f229691f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m66520x9616526c() {
        return "IPCExternalTextureEventData(id=" + this.f229689d + ", eventType=" + this.f229690e + ", extraDataJsonString=" + this.f229691f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f229689d);
        out.writeString(this.f229690e);
        out.writeString(this.f229691f);
    }
}
