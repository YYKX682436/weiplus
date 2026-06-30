package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/texture/IPCMBExternalInputData;", "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData */
/* loaded from: classes7.dex */
public final /* data */ class C16467x9eb59478 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478> f37626x681a0c0c = new ve3.w();

    /* renamed from: d, reason: collision with root package name */
    public final ve3.u f229695d;

    /* renamed from: e, reason: collision with root package name */
    public final int f229696e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f229697f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f229698g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Parcelable f229699h;

    public C16467x9eb59478(ve3.u action, int i17, java.lang.String str, java.lang.String str2, android.os.Parcelable parcelable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f229695d = action;
        this.f229696e = i17;
        this.f229697f = str;
        this.f229698g = str2;
        this.f229699h = parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66526xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478 c16467x9eb59478 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16467x9eb59478) obj;
        return this.f229695d == c16467x9eb59478.f229695d && this.f229696e == c16467x9eb59478.f229696e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229697f, c16467x9eb59478.f229697f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229698g, c16467x9eb59478.f229698g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229699h, c16467x9eb59478.f229699h);
    }

    /* renamed from: hashCode */
    public int m66527x8cdac1b() {
        int hashCode = ((this.f229695d.hashCode() * 31) + java.lang.Integer.hashCode(this.f229696e)) * 31;
        java.lang.String str = this.f229697f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f229698g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        android.os.Parcelable parcelable = this.f229699h;
        return hashCode3 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m66528x9616526c() {
        return "IPCMBExternalInputData(action=" + this.f229695d + ", id=" + this.f229696e + ", type=" + this.f229697f + ", extraData=" + this.f229698g + ", payload=" + this.f229699h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f229695d.name());
        out.writeInt(this.f229696e);
        out.writeString(this.f229697f);
        out.writeString(this.f229698g);
        out.writeParcelable(this.f229699h, i17);
    }

    public /* synthetic */ C16467x9eb59478(ve3.u uVar, int i17, java.lang.String str, java.lang.String str2, android.os.Parcelable parcelable, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(uVar, i17, str, (i18 & 8) != 0 ? null : str2, (i18 & 16) != 0 ? null : parcelable);
    }
}
