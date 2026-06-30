package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/BindRemoteServiceResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.BindRemoteServiceResult */
/* loaded from: classes7.dex */
final /* data */ class C11541x4d2648ef implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11541x4d2648ef> f33363x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fa();

    /* renamed from: d, reason: collision with root package name */
    public final int f156404d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f156405e;

    public C11541x4d2648ef(int i17, java.lang.String str) {
        this.f156404d = i17;
        this.f156405e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m48821xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11541x4d2648ef)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11541x4d2648ef c11541x4d2648ef = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11541x4d2648ef) obj;
        return this.f156404d == c11541x4d2648ef.f156404d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156405e, c11541x4d2648ef.f156405e);
    }

    /* renamed from: hashCode */
    public int m48822x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f156404d) * 31;
        java.lang.String str = this.f156405e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m48823x9616526c() {
        return "BindRemoteServiceResult(errCode=" + this.f156404d + ", errMsg=" + this.f156405e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f156404d);
        out.writeString(this.f156405e);
    }

    public /* synthetic */ C11541x4d2648ef(int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i18 & 2) != 0 ? null : str);
    }
}
