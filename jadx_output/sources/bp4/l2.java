package bp4;

/* loaded from: classes10.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.p2 f23246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f23247e;

    public l2(bp4.p2 p2Var, ju3.d0 d0Var) {
        this.f23246d = p2Var;
        this.f23247e = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ju3.c0 c0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiVideoPlayStatusPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bp4.p2 p2Var = this.f23246d;
        if (p2Var.f23340i) {
            p2Var.A();
            c0Var = ju3.c0.f301895p1;
        } else {
            p2Var.B();
            c0Var = ju3.c0.f301913x1;
        }
        p2Var.f23341m = p2Var.f23340i;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", true);
        this.f23247e.w(c0Var, bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiVideoPlayStatusPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
