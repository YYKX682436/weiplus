package c05;

/* loaded from: classes9.dex */
public class n extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Authen f37710c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c05.q f37711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c05.q qVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f37711d = qVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.utils.b1.e();
        com.tencent.mm.plugin.wallet_core.model.Authen authen = new com.tencent.mm.plugin.wallet_core.model.Authen();
        this.f37710c = authen;
        authen.f179551p = (java.lang.String) objArr[0];
        authen.f179545g = (java.lang.String) objArr[1];
        authen.f179550o = (java.lang.String) objArr[2];
        c05.q qVar = this.f37711d;
        qVar.f213801c.putString("key_bank_phone", (java.lang.String) objArr[3]);
        this.f37710c.f179542d = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w() ? 2 : 1;
        com.tencent.mm.plugin.wallet_core.model.Authen authen2 = this.f37710c;
        authen2.f179549n = 1;
        authen2.f179557v = (com.tencent.mm.pluginsdk.wallet.PayInfo) qVar.f213801c.getParcelable("key_pay_info");
        this.f37710c.f179544f = qVar.f213801c.getString("key_pwd1");
        if (!qVar.f213801c.getBoolean("key_has_indentity_info", false)) {
            this.f37710c.f179547i = qVar.f213801c.getString("key_name");
            this.f37710c.f179548m = qVar.f213801c.getString("key_indentity");
        }
        qVar.f213801c.putString("key_mobile", com.tencent.mm.wallet_core.ui.r1.e0(this.f37710c.f179550o));
        qVar.f213801c.putBoolean("key_is_oversea", false);
        this.f338834b.d(new rs4.a(this.f37710c, "", ""), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof rs4.a)) {
            return false;
        }
        rs4.a aVar = (rs4.a) m1Var;
        if (aVar.f399345f == null) {
            c05.q qVar = this.f37711d;
            qVar.f213801c.putString("kreq_token", aVar.f399344e);
            qVar.o(this.f338833a, 0, qVar.f213801c);
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenWXCreditProcess", "NetSceneTenpayBindBankcard show juveniles dialog");
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        at4.y0 y0Var = aVar.f399345f;
        db5.e1.A(mMActivity, y0Var.f14013a, "", y0Var.f14015c, y0Var.f14014b, new c05.l(this), new c05.m(this));
        return true;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        this.f338834b.d(new ss4.z("", (java.lang.String) objArr[0], (com.tencent.mm.pluginsdk.wallet.PayInfo) this.f37711d.f213801c.getParcelable("key_pay_info")), true);
        return true;
    }
}
