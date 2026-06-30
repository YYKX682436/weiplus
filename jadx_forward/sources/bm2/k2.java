package bm2;

/* loaded from: classes3.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m2 f103561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.g2 f103563f;

    public k2(bm2.m2 m2Var, int i17, bm2.g2 g2Var) {
        this.f103561d = m2Var;
        this.f103562e = i17;
        this.f103563f = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDelCommentManagerAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.m2 m2Var = this.f103561d;
        java.util.ArrayList arrayList2 = m2Var.f103624e;
        int i17 = this.f103562e;
        boolean z17 = ((bm2.l2) arrayList2.get(i17)).f103597b;
        ((bm2.l2) m2Var.f103624e.get(i17)).f103597b = !z17;
        ((bm2.l2) m2Var.f103623d.get(i17)).f103597b = ((bm2.l2) m2Var.f103624e.get(i17)).f103597b;
        this.f103563f.f103439f.setChecked(!z17);
        yz5.a aVar = m2Var.f103625f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDelCommentManagerAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
