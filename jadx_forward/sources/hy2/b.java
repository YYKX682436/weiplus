package hy2;

/* loaded from: classes.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy2.f f367584d;

    public b(hy2.f fVar) {
        this.f367584d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC$checkTeenModeIcon$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.wk((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, this.f367584d.m80379x76847179(), null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC$checkTeenModeIcon$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
