package bl2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bl2.c f21695d;

    public a(bl2.c cVar) {
        this.f21695d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveFloatWindowEnabledPanel$openPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Oj((ml2.r0) c17, 2, null, null, null, null, 30, null);
        this.f21695d.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/FinderLiveFloatWindowEnabledPanel$openPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
