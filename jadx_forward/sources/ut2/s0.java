package ut2;

/* loaded from: classes3.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.t0 f512599d;

    public s0(ut2.t0 t0Var) {
        this.f512599d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ut2.q0 q0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.t0 t0Var = this.f512599d;
        if (t0Var.f512632i == ut2.p0.f512579d && (q0Var = t0Var.f512628e) != null) {
            ((st2.m) q0Var).f493927a.K(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
