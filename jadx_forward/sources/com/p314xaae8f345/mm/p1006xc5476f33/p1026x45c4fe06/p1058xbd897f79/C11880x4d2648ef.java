package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/headless/BindRemoteServiceResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.headless.BindRemoteServiceResult */
/* loaded from: classes7.dex */
final /* data */ class C11880x4d2648ef implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11880x4d2648ef> f33629x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.l();

    /* renamed from: d, reason: collision with root package name */
    public final int f159813d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f159814e;

    public C11880x4d2648ef(int i17, java.lang.String str) {
        this.f159813d = i17;
        this.f159814e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50382xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11880x4d2648ef)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11880x4d2648ef c11880x4d2648ef = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1058xbd897f79.C11880x4d2648ef) obj;
        return this.f159813d == c11880x4d2648ef.f159813d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f159814e, c11880x4d2648ef.f159814e);
    }

    /* renamed from: hashCode */
    public int m50383x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f159813d) * 31;
        java.lang.String str = this.f159814e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m50384x9616526c() {
        return "BindRemoteServiceResult(errCode=" + this.f159813d + ", errMsg=" + this.f159814e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f159813d);
        out.writeString(this.f159814e);
    }

    public /* synthetic */ C11880x4d2648ef(int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i18 & 2) != 0 ? null : str);
    }
}
