package c05;

/* loaded from: classes9.dex */
public class o extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f37712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c05.q qVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37712c = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        c05.q qVar = this.f37712c;
        boolean z17 = qVar.f213801c.getBoolean("key_is_bank_user", false);
        np5.b0 b0Var = this.f338834b;
        if (z17) {
            b0Var.d(new d05.g(qVar.f213801c.getString("key_verify_code"), qVar.f213801c.getString("KEY_SESSION_KEY"), qVar.f213801c.getString("key_pwd1"), ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().d(), qVar.f213801c.getString("key_bank_type")), true);
        } else {
            b0Var.d(new rs4.b((at4.z0) objArr[0]), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof rs4.b;
            np5.b0 b0Var = this.f338834b;
            if (z17) {
                b0Var.d(new ss4.e0(null, 0), true);
                return true;
            }
            boolean z18 = m1Var instanceof ss4.e0;
            c05.q qVar = this.f37712c;
            if (z18) {
                b0Var.d(new d05.g(qVar.f213801c.getString("key_verify_code"), qVar.f213801c.getString("KEY_SESSION_KEY"), qVar.f213801c.getString("key_pwd1"), ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().d(), qVar.f213801c.getString("key_bank_type")), true);
                return true;
            }
            if (m1Var instanceof d05.g) {
                java.lang.String str2 = ((d05.g) m1Var).f225591d;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    qVar.f213801c.putString("key_bank_username", str2);
                }
                qVar.o(this.f338833a, 0, qVar.f213801c);
                return true;
            }
        }
        return false;
    }
}
