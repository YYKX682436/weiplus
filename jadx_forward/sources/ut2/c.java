package ut2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.p f512373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.hw0 f512374e;

    public c(ut2.p pVar, r45.hw0 hw0Var) {
        this.f512373d = pVar;
        this.f512374e = hw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bind$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.p pVar = this.f512373d;
        gk2.e eVar = pVar.f512560e;
        r45.hw0 hw0Var = this.f512374e;
        ut2.p.l(pVar, hw0Var, eVar);
        pVar.s(hw0Var, 0L, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bind$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
