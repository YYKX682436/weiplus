package bl2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bl2.c f103229d;

    public b(bl2.c cVar) {
        this.f103229d = cVar;
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
        bl2.c cVar = this.f103229d;
        cVar.a();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Oj((ml2.r0) c17, 3, null, null, null, null, 30, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = cVar.f103230h;
        if (ubVar != null && (oxVar = (df2.ox) ubVar.mo57658x143f1b92(df2.ox.class)) != null && (o9Var = oxVar.f312549q) != null) {
            pk2.ta.a(o9Var, false, 2, 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveFloatWindowEnabledPanel$openPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
