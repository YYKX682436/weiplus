package au4;

/* loaded from: classes9.dex */
public class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI f14142d;

    public e(com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI) {
        this.f14142d = walletPayUSecurityQuestionSettingUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI = this.f14142d;
        walletPayUSecurityQuestionSettingUI.f181279d.setQuestionText(((com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion) walletPayUSecurityQuestionSettingUI.getInput().getParcelableArrayList("key_security_question_list").get(i17)).f181273e);
        walletPayUSecurityQuestionSettingUI.f181283h = ((com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion) walletPayUSecurityQuestionSettingUI.getInput().getParcelableArrayList("key_security_question_list").get(i17)).f181272d;
        walletPayUSecurityQuestionSettingUI.f181280e.d();
        au4.i.a(walletPayUSecurityQuestionSettingUI.f181284i);
    }
}
