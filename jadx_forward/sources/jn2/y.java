package jn2;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.hy1 f382285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.z f382286e;

    public y(r45.hy1 hy1Var, jn2.z zVar) {
        this.f382285d = hy1Var;
        this.f382286e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSmartBoxAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Choose smartbox ");
        r45.hy1 hy1Var = this.f382285d;
        sb6.append(hy1Var.f458086f);
        sb6.append(", id ");
        sb6.append(hy1Var.f458085e);
        sb6.append(", real key ");
        sb6.append(hy1Var.f458087g);
        sb6.append(", type ");
        sb6.append(hy1Var.f458084d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongAddPanelSmartBoxAdapter", sb6.toString());
        this.f382286e.f382293d.mo146xb9724478(hy1Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSmartBoxAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
