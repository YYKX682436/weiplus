package e05;

/* loaded from: classes9.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19556xc9270018 f327722d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19556xc9270018 activityC19556xc9270018) {
        this.f327722d = activityC19556xc9270018;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        d05.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ActivityC19556xc9270018 activityC19556xc9270018 = this.f327722d;
        if (id6 == com.p314xaae8f345.mm.R.id.pfm) {
            d05.k kVar2 = activityC19556xc9270018.f270079m;
            if (kVar2 != null) {
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d0(activityC19556xc9270018, kVar2.f307141n.f307127a);
            }
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.pfk && (kVar = activityC19556xc9270018.f270079m) != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC19556xc9270018, kVar.f307140m, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
