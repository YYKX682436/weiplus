package c05;

/* loaded from: classes9.dex */
public class o extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f119245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c05.q qVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f119245c = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        c05.q qVar = this.f119245c;
        boolean z17 = qVar.f295334c.getBoolean("key_is_bank_user", false);
        np5.b0 b0Var = this.f420367b;
        if (z17) {
            b0Var.d(new d05.g(qVar.f295334c.getString("key_verify_code"), qVar.f295334c.getString("KEY_SESSION_KEY"), qVar.f295334c.getString("key_pwd1"), ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().d(), qVar.f295334c.getString("key_bank_type")), true);
        } else {
            b0Var.d(new rs4.b((at4.z0) objArr[0]), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof rs4.b;
            np5.b0 b0Var = this.f420367b;
            if (z17) {
                b0Var.d(new ss4.e0(null, 0), true);
                return true;
            }
            boolean z18 = m1Var instanceof ss4.e0;
            c05.q qVar = this.f119245c;
            if (z18) {
                b0Var.d(new d05.g(qVar.f295334c.getString("key_verify_code"), qVar.f295334c.getString("KEY_SESSION_KEY"), qVar.f295334c.getString("key_pwd1"), ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().d(), qVar.f295334c.getString("key_bank_type")), true);
                return true;
            }
            if (m1Var instanceof d05.g) {
                java.lang.String str2 = ((d05.g) m1Var).f307124d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    qVar.f295334c.putString("key_bank_username", str2);
                }
                qVar.o(this.f420366a, 0, qVar.f295334c);
                return true;
            }
        }
        return false;
    }
}
