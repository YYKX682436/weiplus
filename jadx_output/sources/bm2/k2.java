package bm2;

/* loaded from: classes3.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m2 f22028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.g2 f22030f;

    public k2(bm2.m2 m2Var, int i17, bm2.g2 g2Var) {
        this.f22028d = m2Var;
        this.f22029e = i17;
        this.f22030f = g2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDelCommentManagerAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.m2 m2Var = this.f22028d;
        java.util.ArrayList arrayList2 = m2Var.f22091e;
        int i17 = this.f22029e;
        boolean z17 = ((bm2.l2) arrayList2.get(i17)).f22064b;
        ((bm2.l2) m2Var.f22091e.get(i17)).f22064b = !z17;
        ((bm2.l2) m2Var.f22090d.get(i17)).f22064b = ((bm2.l2) m2Var.f22091e.get(i17)).f22064b;
        this.f22030f.f21906f.setChecked(!z17);
        yz5.a aVar = m2Var.f22092f;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveDelCommentManagerAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
