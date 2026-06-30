package ix3;

/* loaded from: classes10.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.u5 f376959d;

    public g4(ix3.u5 u5Var) {
        this.f376959d = u5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ix3.u5 u5Var = this.f376959d;
        u5Var.f377112e++;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.i2) ((jz5.n) u5Var.f435465d).mo141623x754a37bb()).e(u5Var);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
