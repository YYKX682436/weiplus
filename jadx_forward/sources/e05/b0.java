package e05;

/* loaded from: classes8.dex */
public class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19560xce083491 f327706d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19560xce083491 activityC19560xce083491) {
        this.f327706d = activityC19560xce083491;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f327706d.mo73812x338af3();
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditOpenUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
