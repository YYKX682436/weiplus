package y53;

/* loaded from: classes8.dex */
public final class m extends dm.m5 implements u53.u {
    public static final l75.e0 C = dm.m5.m125222x3593deb(y53.m.class);
    public boolean B = true;

    @Override // dm.m5, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return C;
    }

    public java.lang.String t0() {
        java.lang.String field_username = this.f67433xdec927b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
        return field_username;
    }

    /* renamed from: toString */
    public java.lang.String m176524x9616526c() {
        return "username: " + this.f67433xdec927b + " nickname: " + this.f67429x21f9b213;
    }

    public final java.lang.String u0() {
        return "username: " + this.f67433xdec927b;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 v0() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        if (!this.B) {
            this.f67429x21f9b213 = this.f67433xdec927b;
        }
        z3Var.M1(this.f67429x21f9b213);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = this.f67429x21f9b213;
        ((ke0.e) xVar).getClass();
        z3Var.J2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str);
        z3Var.X1(this.f67433xdec927b);
        z3Var.E2 = z3Var.f72763xa3c65b86;
        return z3Var;
    }
}
