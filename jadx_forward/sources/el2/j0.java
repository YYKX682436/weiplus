package el2;

/* loaded from: classes3.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.l0 f335367d;

    public j0(el2.l0 l0Var) {
        this.f335367d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAssistPromoteWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zl2.r4 r4Var = zl2.r4.f555483a;
        el2.l0 l0Var = this.f335367d;
        android.content.Context context = l0Var.f335378d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (r4Var.Y1(context)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.q1(l0Var.f335380f, "PORTRAIT_ACTION_PROMOTE_CLICK", null, 2, null);
        } else {
            qo0.c.a(l0Var.f335379e, qo0.b.I2, null, 2, null);
        }
        bf2.c.b(bf2.c.f101131a, l0Var.f335380f.S0(), 2, 0, null, 0, 28, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/promote/FinderLiveAssistPromoteWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
