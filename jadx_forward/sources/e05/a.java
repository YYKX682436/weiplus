package e05;

/* loaded from: classes9.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c f327703d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c activityC19550xb0b9025c) {
        this.f327703d = activityC19550xb0b9025c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19550xb0b9025c activityC19550xb0b9025c = this.f327703d;
        java.lang.String m83183xfb85ada3 = activityC19550xb0b9025c.f270048d.m83183xfb85ada3();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83183xfb85ada3)) {
            yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (activityC19550xb0b9025c.f270052h) {
            activityC19550xb0b9025c.m83106x57340563().f(m83183xfb85ada3);
            activityC19550xb0b9025c.f270052h = false;
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_support_bankcard", 1);
            bundle.putString("key_bank_type", activityC19550xb0b9025c.f270053i.f261192s);
            bundle.putInt("key_bankcard_type", 1);
            com.p314xaae8f345.mm.p2802xd031a825.a.g(activityC19550xb0b9025c).E(activityC19550xb0b9025c, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19110xc60f679.class, bundle, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletBindDepositUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
