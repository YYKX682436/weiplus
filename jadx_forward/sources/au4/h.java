package au4;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19198x5ada7678 f95678d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19198x5ada7678 activityC19198x5ada7678) {
        this.f95678d = activityC19198x5ada7678;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19198x5ada7678 activityC19198x5ada7678 = this.f95678d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2385x41871e05.ui.ActivityC19198x5ada7678 activityC19198x5ada76782 = activityC19198x5ada7678.f262817i.f95679a;
        if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19198x5ada76782.f262812d.f262820f) ^ true) && activityC19198x5ada76782.f262813e.n()) {
            activityC19198x5ada7678.m83105x7498fe14().putString("key_question_id", activityC19198x5ada7678.f262816h);
            activityC19198x5ada7678.m83105x7498fe14().putString("key_question_answer", activityC19198x5ada7678.f262813e.m83183xfb85ada3());
            com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC19198x5ada7678, activityC19198x5ada7678.m83105x7498fe14());
        } else {
            au4.i.a(activityC19198x5ada7678.f262817i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_payu/security_question/ui/WalletPayUSecurityQuestionSettingUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
