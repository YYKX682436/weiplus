package au4;

/* loaded from: classes9.dex */
public class a implements qp5.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI f14138d;

    public a(com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI walletPayUSecurityQuestionAnswerUI) {
        this.f14138d = walletPayUSecurityQuestionAnswerUI;
    }

    @Override // qp5.i0
    public void onInputValidChange(boolean z17) {
        com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI walletPayUSecurityQuestionAnswerUI = this.f14138d.f181277g.f14140a;
        if (walletPayUSecurityQuestionAnswerUI.f181275e.n()) {
            walletPayUSecurityQuestionAnswerUI.f181276f.setEnabled(true);
        } else {
            walletPayUSecurityQuestionAnswerUI.f181276f.setEnabled(false);
        }
    }
}
