package nf4;

/* loaded from: classes4.dex */
public final class f extends dm.db {
    public static final l75.e0 W = dm.db.m124884x3593deb(nf4.f.class);
    public static final yz5.p X = nf4.e.f418377d;

    public f() {
        this.f66297xdde069b = "";
    }

    @Override // dm.db, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cu6, "cu");
        super.mo9015xbf5d97fd(cu6);
    }

    @Override // dm.db, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        l75.e0 info = W;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        return info;
    }

    /* renamed from: getUserName */
    public final java.lang.String m149511x6bf53a6c() {
        java.lang.String field_userName = this.f66297xdde069b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_userName, "field_userName");
        return field_userName;
    }

    /* renamed from: isValid */
    public final boolean m149512x7b953cf2() {
        if (this.f66294x10ed17fb != 0) {
            int i17 = this.f66293xb7d4dd1d;
            ef4.n.f333993a.a();
            if (i17 + 86400 >= c01.id.e()) {
                return true;
            }
        }
        return false;
    }

    public final boolean t0() {
        if (m149512x7b953cf2()) {
            yz5.p pVar = X;
            if (((java.lang.Boolean) ((nf4.e) pVar).mo149xb9724478(java.lang.Long.valueOf(this.f66290xe188436), java.lang.Long.valueOf(this.f66294x10ed17fb))).booleanValue()) {
                ef4.v vVar = ef4.w.f334001t;
                if (ef4.w.f334003v == -1) {
                    ef4.w.f334003v = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_SNS_ALL_READ_TIME_LONG, 0L);
                }
                if (((java.lang.Boolean) ((nf4.e) pVar).mo149xb9724478(java.lang.Long.valueOf(ef4.w.f334003v), java.lang.Long.valueOf(this.f66295xa783a79b))).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
