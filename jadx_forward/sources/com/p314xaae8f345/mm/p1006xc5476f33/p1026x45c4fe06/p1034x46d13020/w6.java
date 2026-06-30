package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes3.dex */
public final class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f158156a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f158157b;

    /* renamed from: c, reason: collision with root package name */
    public final int f158158c;

    public w6(java.lang.String userName, java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f158156a = userName;
        this.f158157b = appId;
        this.f158158c = i17;
    }

    /* renamed from: equals */
    public boolean m49838xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w6 w6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.w6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f158156a, w6Var.f158156a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f158157b, w6Var.f158157b) && this.f158158c == w6Var.f158158c;
    }

    /* renamed from: hashCode */
    public int m49839x8cdac1b() {
        return (((this.f158156a.hashCode() * 31) + this.f158157b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f158158c);
    }

    /* renamed from: toString */
    public java.lang.String m49840x9616526c() {
        return "WxaInfo(userName=" + this.f158156a + ", appId=" + this.f158157b + ", versionType=" + this.f158158c + ')';
    }
}
