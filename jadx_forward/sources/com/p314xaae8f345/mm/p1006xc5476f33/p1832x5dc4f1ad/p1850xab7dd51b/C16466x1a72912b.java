package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/texture/IPCMBExternalCallbackData;", "Landroid/os/Parcelable;", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData */
/* loaded from: classes7.dex */
public final /* data */ class C16466x1a72912b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b> f37625x681a0c0c = new ve3.v();

    /* renamed from: d, reason: collision with root package name */
    public final int f229692d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f229693e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f229694f;

    public C16466x1a72912b(int i17, java.lang.String str, java.lang.String str2) {
        this.f229692d = i17;
        this.f229693e = str;
        this.f229694f = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m66522xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b c16466x1a72912b = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1850xab7dd51b.C16466x1a72912b) obj;
        return this.f229692d == c16466x1a72912b.f229692d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229693e, c16466x1a72912b.f229693e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f229694f, c16466x1a72912b.f229694f);
    }

    /* renamed from: hashCode */
    public int m66523x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f229692d) * 31;
        java.lang.String str = this.f229693e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f229694f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m66524x9616526c() {
        return "IPCMBExternalCallbackData(errCode=" + this.f229692d + ", errMsg=" + this.f229693e + ", extraData=" + this.f229694f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f229692d);
        out.writeString(this.f229693e);
        out.writeString(this.f229694f);
    }

    public /* synthetic */ C16466x1a72912b(int i17, java.lang.String str, java.lang.String str2, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i18 & 2) != 0 ? null : str, (i18 & 4) != 0 ? null : str2);
    }
}
