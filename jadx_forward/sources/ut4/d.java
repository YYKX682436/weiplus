package ut4;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.ActivityC19183xa778cd1a f512719d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.ActivityC19183xa778cd1a activityC19183xa778cd1a) {
        this.f512719d = activityC19183xa778cd1a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_payu/create/ui/WalletPayUStartOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui.ActivityC19183xa778cd1a activityC19183xa778cd1a = this.f512719d;
        if (activityC19183xa778cd1a.f262783d.getVisibility() == 0) {
            activityC19183xa778cd1a.m83105x7498fe14().putString("key_mobile", activityC19183xa778cd1a.f262787h);
            activityC19183xa778cd1a.m83105x7498fe14().putString("dial_code", activityC19183xa778cd1a.f262788i);
        }
        activityC19183xa778cd1a.m83106x57340563().d(new java.lang.Object[0]);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_payu/create/ui/WalletPayUStartOpenUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
