package e05;

/* loaded from: classes9.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19558xb1674ffa f327728d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19558xb1674ffa activityC19558xb1674ffa) {
        this.f327728d = activityC19558xb1674ffa;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenNotifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19558xb1674ffa activityC19558xb1674ffa = this.f327728d;
        bundle.putParcelable("key_bankcard", activityC19558xb1674ffa.m83105x7498fe14().getParcelable("key_bankcard"));
        com.p314xaae8f345.mm.p2802xd031a825.a.j(activityC19558xb1674ffa, c05.c.class, bundle, null);
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenNotifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
