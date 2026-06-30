package mj4;

/* loaded from: classes11.dex */
public final class l extends rj4.e {
    public static final l75.e0 W = rj4.e.m162519x3593deb(rj4.e.class);
    public java.lang.String V = "";

    @Override // rj4.e, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 _dbInfo = W;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(_dbInfo, "_dbInfo");
        return _dbInfo;
    }

    /* renamed from: getUserName */
    public final java.lang.String m147400x6bf53a6c() {
        if (this.V.length() > 0) {
            return this.V;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f76605x8d8a3769, bk4.k1.a())) {
            java.lang.String field_HashUserName = this.f76605x8d8a3769;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_HashUserName, "field_HashUserName");
            return field_HashUserName;
        }
        java.lang.String str = this.f76605x8d8a3769;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.TextStatusUtils", "getUserNameByHash: failed", new java.lang.Object[0]);
            return "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 wi6 = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).wi(str, 1);
        java.lang.String d17 = wi6 != null ? wi6.d1() : "";
        return d17 == null ? "" : d17;
    }
}
