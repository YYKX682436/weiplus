package ut2;

/* loaded from: classes3.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.t0 f512593d;

    public r0(ut2.t0 t0Var) {
        this.f512593d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.q0 q0Var = this.f512593d.f512628e;
        if (q0Var != null) {
            ((st2.m) q0Var).f493927a.K(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
