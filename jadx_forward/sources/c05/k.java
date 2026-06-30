package c05;

/* loaded from: classes9.dex */
public class k extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f119241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c05.q qVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119241c = qVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        c05.q qVar = this.f119241c;
        boolean z17 = qVar.f295334c.getBoolean("key_is_bank_user", false);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        if (!z17) {
            return abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0x, qVar.f295334c.getString("key_mobile"));
        }
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) qVar.f295334c.getParcelable("key_bankcard")).f69217xaef0808c;
        return abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0w, str, str, qVar.f295334c.getString("key_mobile"));
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        c05.q qVar = this.f119241c;
        qVar.f295334c.putString("key_verify_code", str);
        boolean w17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w();
        np5.b0 b0Var = this.f420367b;
        if (w17) {
            if (!qVar.f295334c.getBoolean("key_need_bind_deposit", true) || qVar.f295334c.getBoolean("key_is_bank_user")) {
                b0Var.d(new d05.g(str, qVar.f295334c.getString("KEY_SESSION_KEY"), qVar.f295334c.getString("key_pwd1"), qVar.f295334c.getString("key_bind_serial"), qVar.f295334c.getString("key_bank_type")), true);
            } else {
                at4.z0 z0Var = (at4.z0) objArr[1];
                z0Var.f95555a = "2";
                b0Var.d(new ss4.w(z0Var), true);
            }
        } else if (qVar.f295334c.getBoolean("key_is_bank_user", false)) {
            qVar.f295334c.putString("key_verify_code", str);
            b0Var.d(new d05.h(str, qVar.f295334c.getString("KEY_SESSION_KEY"), qVar.f295334c.getString("key_pwd1"), qVar.f295334c.getString("key_bind_serial"), qVar.f295334c.getString("key_bank_type")), true);
        } else {
            at4.z0 z0Var2 = (at4.z0) objArr[1];
            z0Var2.f95555a = "1";
            b0Var.d(new ss4.w(z0Var2), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof d05.g;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
            c05.q qVar = this.f119241c;
            if (z17) {
                java.lang.String str2 = ((d05.g) m1Var).f307124d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    qVar.f295334c.putString("key_bank_username", str2);
                }
                qVar.o(abstractActivityC21394xb3d2c0cf, 0, qVar.f295334c);
                return true;
            }
            if (m1Var instanceof d05.h) {
                qVar.o(abstractActivityC21394xb3d2c0cf, 0, qVar.f295334c);
                return true;
            }
            boolean z18 = m1Var instanceof ss4.w;
            np5.b0 b0Var = this.f420367b;
            if (z18) {
                if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                    b0Var.d(new ss4.e0(null, 0), true);
                    return true;
                }
                qVar.o(abstractActivityC21394xb3d2c0cf, 0, qVar.f295334c);
                return true;
            }
            if (m1Var instanceof ss4.e0) {
                b0Var.d(new d05.g(qVar.f295334c.getString("key_verify_code"), qVar.f295334c.getString("KEY_SESSION_KEY"), qVar.f295334c.getString("key_pwd1"), ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().d(), qVar.f295334c.getString("key_bank_type")), true);
                return true;
            }
        }
        return false;
    }
}
