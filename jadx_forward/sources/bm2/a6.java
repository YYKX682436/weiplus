package bm2;

/* loaded from: classes3.dex */
public final class a6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.c6 f103305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.v2 f103306e;

    public a6(bm2.c6 c6Var, el2.v2 v2Var) {
        this.f103305d = c6Var;
        this.f103306e = v2Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLivePromoteSubListAdapter$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.p pVar = this.f103305d.f103351e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        pVar.mo149xb9724478(view, this.f103306e);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLivePromoteSubListAdapter$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
