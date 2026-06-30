package qp2;

/* loaded from: classes.dex */
public final class z extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f447360g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f447361h;

    public /* synthetic */ z(r45.qt2 qt2Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(qt2Var, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? "" : str, (i18 & 8) != 0 ? "" : str2, (i18 & 16) != 0 ? "" : str3, (i18 & 32) != 0 ? "" : str4);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f447360g;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f447360g = u0Var;
        return mo9409x10f9447a(sVar, this.f447361h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4210;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(r45.qt2 qt2Var, int i17, java.lang.String byPass, java.lang.String title, java.lang.String encrypted_object_id, java.lang.String object_nonce_id) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byPass, "byPass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encrypted_object_id, "encrypted_object_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object_nonce_id, "object_nonce_id");
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.g81 g81Var = new r45.g81();
        g81Var.set(1, db2.t4.f309704a.b(4210, qt2Var));
        g81Var.set(2, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        g81Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        g81Var.set(4, java.lang.Integer.valueOf(i17));
        g81Var.set(5, byPass);
        g81Var.set(7, encrypted_object_id);
        g81Var.set(8, object_nonce_id);
        g81Var.set(6, title);
        lVar.f152197a = g81Var;
        lVar.f152198b = new r45.h81();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetlivetabs";
        lVar.f152200d = 4210;
        this.f447361h = lVar.a();
    }
}
