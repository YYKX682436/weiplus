package au4;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI f14146a;

    public i(com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI) {
        this.f14146a = walletPayUSecurityQuestionSettingUI;
    }

    public static void a(au4.i iVar) {
        com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI = iVar.f14146a;
        boolean z17 = (com.tencent.mm.sdk.platformtools.t8.K0(walletPayUSecurityQuestionSettingUI.f181279d.f181287f) ^ true) && walletPayUSecurityQuestionSettingUI.f181280e.n();
        com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI2 = iVar.f14146a;
        if (z17) {
            walletPayUSecurityQuestionSettingUI2.f181281f.setEnabled(true);
        } else {
            walletPayUSecurityQuestionSettingUI2.f181281f.setEnabled(false);
        }
    }
}
