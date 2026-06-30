package at2;

/* loaded from: classes3.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.q0 f13642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f13643e;

    public c0(at2.q0 q0Var, android.view.ViewGroup viewGroup) {
        this.f13642d = q0Var;
        this.f13643e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplayMoreActionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f13643e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        at2.q0 q0Var = this.f13642d;
        q0Var.getClass();
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        com.tencent.mm.pluginsdk.forward.m mVar = new com.tencent.mm.pluginsdk.forward.m();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 0, true);
        k0Var.X1 = true;
        k0Var.U1 = true;
        k0Var.t(true);
        k0Var.f211855d2 = false;
        k0Var.f211872n = new at2.i0(k0Var, q0Var, context);
        k0Var.f211874o = new at2.j0(k0Var, q0Var);
        if (zl2.r4.f473950a.n(((mm2.c1) q0Var.P0(mm2.c1.class)).Q1)) {
            zl2.q4 q4Var = zl2.q4.f473933a;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) q0Var.P0(mm2.c1.class)).f328846n;
            if (((finderObject != null ? finderObject.getPermissionFlag() : 0) & 1) == 0) {
                k0Var.f211876p = new at2.l0(k0Var, mVar, context);
                k0Var.f211885w = new at2.o0(q0Var, mVar, context, k0Var);
                k0Var.f211886x = new at2.p0(k0Var, mVar);
            }
        }
        at2.h0 h0Var = new at2.h0(k0Var, context, q0Var.S0(), q0Var.R0());
        k0Var.f211881s = h0Var;
        k0Var.f211884v = h0Var;
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayMoreActionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
