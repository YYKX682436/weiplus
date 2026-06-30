package bp4;

/* loaded from: classes10.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.b1 f104928d;

    public v0(bp4.b1 b1Var) {
        this.f104928d = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MagicTimeEditPlugin$checkInit$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bp4.b1 b1Var = this.f104928d;
        bp4.q0 q0Var = b1Var.f104643s;
        if (q0Var != null) {
            ((bp4.h1) q0Var).a();
        }
        b1Var.f104631d.m68236x76500a7f(false);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MagicTimeEditPlugin$checkInit$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
