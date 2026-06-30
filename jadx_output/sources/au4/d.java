package au4;

/* loaded from: classes9.dex */
public class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI f14141d;

    public d(com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI walletPayUSecurityQuestionSettingUI) {
        this.f14141d = walletPayUSecurityQuestionSettingUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        int i17 = com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionSettingUI.f181278m;
        java.util.ArrayList parcelableArrayList = this.f14141d.getInput().getParcelableArrayList("key_security_question_list");
        if (parcelableArrayList != null) {
            for (int i18 = 0; i18 < parcelableArrayList.size(); i18++) {
                g4Var.add(((com.tencent.mm.plugin.wallet_payu.security_question.model.PayUSecurityQuestion) parcelableArrayList.get(i18)).f181273e);
            }
        }
    }
}
