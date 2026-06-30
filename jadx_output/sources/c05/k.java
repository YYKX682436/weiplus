package c05;

/* loaded from: classes9.dex */
public class k extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c05.q f37708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c05.q qVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37708c = qVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        c05.q qVar = this.f37708c;
        boolean z17 = qVar.f213801c.getBoolean("key_is_bank_user", false);
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (!z17) {
            return mMActivity.getString(com.tencent.mm.R.string.l0x, qVar.f213801c.getString("key_mobile"));
        }
        java.lang.String str = ((com.tencent.mm.plugin.wallet_core.model.Bankcard) qVar.f213801c.getParcelable("key_bankcard")).field_bankName;
        return mMActivity.getString(com.tencent.mm.R.string.l0w, str, str, qVar.f213801c.getString("key_mobile"));
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        java.lang.String str = (java.lang.String) objArr[0];
        c05.q qVar = this.f37708c;
        qVar.f213801c.putString("key_verify_code", str);
        boolean w17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w();
        np5.b0 b0Var = this.f338834b;
        if (w17) {
            if (!qVar.f213801c.getBoolean("key_need_bind_deposit", true) || qVar.f213801c.getBoolean("key_is_bank_user")) {
                b0Var.d(new d05.g(str, qVar.f213801c.getString("KEY_SESSION_KEY"), qVar.f213801c.getString("key_pwd1"), qVar.f213801c.getString("key_bind_serial"), qVar.f213801c.getString("key_bank_type")), true);
            } else {
                at4.z0 z0Var = (at4.z0) objArr[1];
                z0Var.f14022a = "2";
                b0Var.d(new ss4.w(z0Var), true);
            }
        } else if (qVar.f213801c.getBoolean("key_is_bank_user", false)) {
            qVar.f213801c.putString("key_verify_code", str);
            b0Var.d(new d05.h(str, qVar.f213801c.getString("KEY_SESSION_KEY"), qVar.f213801c.getString("key_pwd1"), qVar.f213801c.getString("key_bind_serial"), qVar.f213801c.getString("key_bank_type")), true);
        } else {
            at4.z0 z0Var2 = (at4.z0) objArr[1];
            z0Var2.f14022a = "1";
            b0Var.d(new ss4.w(z0Var2), true);
        }
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            boolean z17 = m1Var instanceof d05.g;
            com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
            c05.q qVar = this.f37708c;
            if (z17) {
                java.lang.String str2 = ((d05.g) m1Var).f225591d;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    qVar.f213801c.putString("key_bank_username", str2);
                }
                qVar.o(mMActivity, 0, qVar.f213801c);
                return true;
            }
            if (m1Var instanceof d05.h) {
                qVar.o(mMActivity, 0, qVar.f213801c);
                return true;
            }
            boolean z18 = m1Var instanceof ss4.w;
            np5.b0 b0Var = this.f338834b;
            if (z18) {
                if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                    b0Var.d(new ss4.e0(null, 0), true);
                    return true;
                }
                qVar.o(mMActivity, 0, qVar.f213801c);
                return true;
            }
            if (m1Var instanceof ss4.e0) {
                b0Var.d(new d05.g(qVar.f213801c.getString("key_verify_code"), qVar.f213801c.getString("KEY_SESSION_KEY"), qVar.f213801c.getString("key_pwd1"), ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().d(), qVar.f213801c.getString("key_bank_type")), true);
                return true;
            }
        }
        return false;
    }
}
