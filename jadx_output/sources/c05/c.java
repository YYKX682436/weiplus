package c05;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "WXCreditChangeAmountProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        j(activity, "wallet", ".bind.ui.WalletBankcardManageUI");
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            B(activity, com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI) {
            B(activity, com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI) {
            f(activity, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI) {
            return new c05.a(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            return new c05.b(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
