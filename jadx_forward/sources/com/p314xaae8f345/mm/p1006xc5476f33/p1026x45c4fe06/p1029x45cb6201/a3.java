package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f156946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f156947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f156948c;

    /* renamed from: d, reason: collision with root package name */
    public long f156949d;

    public a3(java.lang.String appId, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f156946a = appId;
        this.f156947b = i17;
        this.f156948c = i18;
    }

    /* renamed from: equals */
    public boolean m49240xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3 a3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f156946a, a3Var.f156946a) && this.f156947b == a3Var.f156947b && this.f156948c == a3Var.f156948c;
    }

    /* renamed from: hashCode */
    public int m49241x8cdac1b() {
        return (((this.f156946a.hashCode() * 31) + java.lang.Integer.hashCode(this.f156947b)) * 31) + java.lang.Integer.hashCode(this.f156948c);
    }

    /* renamed from: toString */
    public java.lang.String m49242x9616526c() {
        return "AppInfo(appId=" + this.f156946a + ", versionType=" + this.f156947b + ", serviceType=" + this.f156948c + ')';
    }
}
