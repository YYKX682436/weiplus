package ri1;

/* loaded from: classes7.dex */
public final class p implements ri1.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f477568d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f477569e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f477570f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f477571g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f477572h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f477573i;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f477568d = o6Var;
        java.lang.String Y0 = o6Var.S2(false).Y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Y0, "versionBuildInfo(...)");
        this.f477570f = Y0;
        int i17 = o6Var.f156338p.f158814g;
        java.lang.String valueOf = i17 != 1 ? i17 != 2 ? java.lang.String.valueOf(o6Var.d2()) : "DEMO" : "TEST";
        this.f477571g = valueOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1.C12530x293588b2 c12530x293588b2 = o6Var.u0().f158830j2;
        java.lang.String str = c12530x293588b2 != null ? c12530x293588b2.f168766d : null;
        if (str == null || str.length() == 0) {
            this.f477569e = false;
            this.f477572h = "";
        } else {
            this.f477569e = true;
            this.f477572h = str + '_' + Y0.hashCode() + '_' + valueOf;
        }
        this.f477573i = new java.util.concurrent.ConcurrentHashMap();
    }

    public final r45.o8 a(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f477573i;
        r45.o8 o8Var = (r45.o8) concurrentHashMap.get(str);
        if (o8Var == null) {
            java.lang.String c17 = c(str);
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(c17);
            if (k17 > 0) {
                o8Var = new r45.o8();
                try {
                    o8Var.mo11468x92b714fd(com.p314xaae8f345.mm.vfs.w6.N(c17, 0, (int) k17));
                } catch (java.io.IOException unused) {
                    com.p314xaae8f345.mm.vfs.w6.h(c17);
                }
                concurrentHashMap.put(str, o8Var);
            }
        }
        return o8Var;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1.C12531x2a8ddffe b(java.lang.String str) {
        java.lang.String str2 = this.f477568d.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getAppId(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1172x7e5810c1.C12531x2a8ddffe(str2, this.f477570f, this.f477571g, str, null);
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f477572h);
        sb6.append('_');
        java.lang.String encode = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        sb6.append(encode);
        sb6.append(".rc");
        return sb6.toString();
    }
}
