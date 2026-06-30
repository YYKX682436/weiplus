package c05;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.wallet_core.h {
    @Override // com.tencent.mm.wallet_core.h
    public com.tencent.mm.wallet_core.h A(android.app.Activity activity, android.os.Bundle bundle) {
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().s()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenWXCreditProcess", "unknow wallet reg status!");
        } else if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI.class, bundle);
        } else {
            B(activity, com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI.class, bundle);
        }
        return this;
    }

    @Override // com.tencent.mm.wallet_core.h
    public void c(android.app.Activity activity, int i17) {
        m(activity);
    }

    @Override // com.tencent.mm.wallet_core.h
    public java.lang.String e() {
        return "WXCreditOpenProcess";
    }

    @Override // com.tencent.mm.wallet_core.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        j(activity, "wallet", ".bind.ui.WalletBankcardManageUI");
    }

    @Override // com.tencent.mm.wallet_core.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
        boolean z17 = activity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI;
        if (z17) {
            B(activity, com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI.class, bundle);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            m(activity);
            B(activity, com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI.class, bundle);
            return;
        }
        if (z17) {
            B(activity, com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI.class, bundle);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI) {
            if (bundle.getBoolean("key_need_bind_deposit", true)) {
                B(activity, com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI.class, bundle);
                return;
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI.class, bundle);
            return;
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            if (((pg0.a3) i95.n0.c(pg0.a3.class)).fj().w()) {
                B(activity, com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI.class, bundle);
                return;
            } else {
                B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI.class, bundle);
                return;
            }
        }
        if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI) {
            B(activity, com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            B(activity, com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI.class, bundle);
        } else if (activity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI) {
            f(activity, bundle);
        }
    }

    @Override // com.tencent.mm.wallet_core.h
    public np5.g p(com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI) {
            return new c05.i(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI) {
            return new c05.j(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI) {
            return new c05.k(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI) {
            return new c05.n(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI) {
            return new c05.o(this, mMActivity, b0Var);
        }
        if (mMActivity instanceof com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI) {
            return new c05.p(this, mMActivity, b0Var);
        }
        return null;
    }

    @Override // com.tencent.mm.wallet_core.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
