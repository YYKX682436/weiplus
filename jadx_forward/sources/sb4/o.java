package sb4;

/* loaded from: classes4.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb4.v f487102d;

    public o(sb4.v vVar) {
        this.f487102d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$3");
            return;
        }
        sb4.u uVar = (sb4.u) view.getTag();
        sb4.v vVar = this.f487102d;
        vVar.f487119i = uVar;
        sb4.u uVar2 = vVar.f487119i;
        vVar.d(uVar2.f487109b, uVar2.f487110c, uVar2.f487108a + 2);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$3");
    }
}
