package c05;

/* loaded from: classes9.dex */
public class f extends np5.g {
    public f(c05.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) objArr[0];
        this.f338834b.d(new d05.d(bankcard.field_bindSerial, true, bankcard.field_bankcardType), true);
        return true;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
