package e05;

/* loaded from: classes9.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19559x3ee49bce f327729d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19559x3ee49bce activityC19559x3ee49bce) {
        this.f327729d = activityC19559x3ee49bce;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19559x3ee49bce.f270085e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19559x3ee49bce activityC19559x3ee49bce = this.f327729d;
        activityC19559x3ee49bce.m83106x57340563().d(java.lang.Boolean.valueOf(activityC19559x3ee49bce.f270086d.isChecked()));
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenResultUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
