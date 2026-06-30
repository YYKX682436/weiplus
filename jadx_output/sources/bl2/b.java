package bl2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bl2.c f21696d;

    public b(bl2.c cVar) {
        this.f21696d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        df2.ox oxVar;
        pk2.o9 o9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveFloatWindowEnabledPanel$openPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bl2.c cVar = this.f21696d;
        cVar.a();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Oj((ml2.r0) c17, 3, null, null, null, null, 30, null);
        com.tencent.mm.plugin.finder.live.view.ub ubVar = cVar.f21697h;
        if (ubVar != null && (oxVar = (df2.ox) ubVar.getController(df2.ox.class)) != null && (o9Var = oxVar.f231016q) != null) {
            pk2.ta.a(o9Var, false, 2, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveFloatWindowEnabledPanel$openPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
