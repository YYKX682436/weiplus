package sb4;

/* loaded from: classes4.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb4.v f487107d;

    public t(sb4.v vVar) {
        this.f487107d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$8");
            return;
        }
        if (view.getTag() instanceof sb4.u) {
            sb4.u uVar = (sb4.u) view.getTag();
            sb4.v vVar = this.f487107d;
            vVar.f487119i = uVar;
            sb4.u uVar2 = vVar.f487119i;
            vVar.a(uVar2.f487109b, uVar2.f487110c, uVar2.f487108a);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsSelfBaseAdapter", "tag !instanceof ClickInfo");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$8");
    }
}
