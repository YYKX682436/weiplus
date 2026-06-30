package au4;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI f14145d;

    public h(com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI) {
        this.f14145d = walletPayUSecurityQuestionSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI = this.f14145d;
        com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI2 = walletPayUSecurityQuestionSettingUI.f181284i.f14146a;
        if ((com.tencent.mm.sdk.platformtools.t8.K0(walletPayUSecurityQuestionSettingUI2.f181279d.f181287f) ^ true) && walletPayUSecurityQuestionSettingUI2.f181280e.n()) {
            walletPayUSecurityQuestionSettingUI.getInput().putString("key_question_id", walletPayUSecurityQuestionSettingUI.f181283h);
            walletPayUSecurityQuestionSettingUI.getInput().putString("key_question_answer", walletPayUSecurityQuestionSettingUI.f181280e.getText());
            com.tencent.mm.wallet_core.a.d(walletPayUSecurityQuestionSettingUI, walletPayUSecurityQuestionSettingUI.getInput());
        } else {
            au4.i.a(walletPayUSecurityQuestionSettingUI.f181284i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
