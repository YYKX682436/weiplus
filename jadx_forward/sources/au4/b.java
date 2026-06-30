package au4;

/* loaded from: classes9.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19197xb0ad1ebe f95672d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19197xb0ad1ebe activityC19197xb0ad1ebe) {
        this.f95672d = activityC19197xb0ad1ebe;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionAnswerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19197xb0ad1ebe activityC19197xb0ad1ebe = this.f95672d;
        if (activityC19197xb0ad1ebe.f262808e.n()) {
            activityC19197xb0ad1ebe.m83105x7498fe14().putString("key_question_answer", activityC19197xb0ad1ebe.f262808e.m83183xfb85ada3());
            activityC19197xb0ad1ebe.m83106x57340563().d(new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionAnswerUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
