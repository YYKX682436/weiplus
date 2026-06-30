package dc4;

/* loaded from: classes4.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.u f310347d;

    public s(dc4.u uVar) {
        this.f310347d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/detail/item/AdNormalSightDetailItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dc4.u uVar = this.f310347d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9 g9Var = uVar.f310368h;
        if (g9Var != null && g9Var.f249951h != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdNormalSightDetailItem", "on ad content click, snsid ");
            uVar.f310368h.f249951h.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/detail/item/AdNormalSightDetailItem$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$3");
    }
}
