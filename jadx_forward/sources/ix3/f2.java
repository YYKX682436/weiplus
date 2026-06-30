package ix3;

/* loaded from: classes7.dex */
public final class f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.l2 f376941d;

    public f2(ix3.l2 l2Var) {
        this.f376941d = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerFloatBallDebugUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f376941d.f377017f.j();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerFloatBallDebugUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
