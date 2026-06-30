package at2;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.v f13756d;

    public u(at2.v vVar) {
        this.f13756d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f13756d.R0().finish();
        ws2.u0 u0Var = ws2.k1.f449066r;
        mm2.c1 c1Var = (mm2.c1) u0Var.a().e(mm2.c1.class);
        if (c1Var != null) {
            c1Var.O1 = false;
        }
        u0Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayLivingHeaderPlugin$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
