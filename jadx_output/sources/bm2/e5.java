package bm2;

/* loaded from: classes3.dex */
public final class e5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.n5 f21863d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.m4 f21864e;

    public e5(bm2.n5 n5Var, bm2.m4 m4Var) {
        this.f21863d = n5Var;
        this.f21864e = m4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$fillStickView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f21863d.C;
        if (lVar != null) {
            lVar.invoke(this.f21864e.f22101a);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveMemberLinearAdapter$fillStickView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
