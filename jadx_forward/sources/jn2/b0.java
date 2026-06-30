package jn2;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.f0 f382087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f382088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f382089f;

    public b0(jn2.f0 f0Var, int i17, p3325xe03a0797.p3326xc267989b.y0 y0Var) {
        this.f382087d = f0Var;
        this.f382088e = i17;
        this.f382089f = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$initSubTabs$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f382087d.a(this.f382088e, null, this.f382089f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelTabView$initSubTabs$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
