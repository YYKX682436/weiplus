package at2;

/* loaded from: classes3.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.q0 f95175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f95176e;

    public c0(at2.q0 q0Var, android.view.ViewGroup viewGroup) {
        this.f95175d = q0Var;
        this.f95176e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplayMoreActionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f95176e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        at2.q0 q0Var = this.f95175d;
        q0Var.getClass();
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m mVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 0, true);
        k0Var.X1 = true;
        k0Var.U1 = true;
        k0Var.t(true);
        k0Var.f293388d2 = false;
        k0Var.f293405n = new at2.i0(k0Var, q0Var, context);
        k0Var.f293407o = new at2.j0(k0Var, q0Var);
        if (zl2.r4.f555483a.n(((mm2.c1) q0Var.P0(mm2.c1.class)).Q1)) {
            zl2.q4 q4Var = zl2.q4.f555466a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) q0Var.P0(mm2.c1.class)).f410379n;
            if (((c19792x256d2725 != null ? c19792x256d2725.m76810x98d986d1() : 0) & 1) == 0) {
                k0Var.f293409p = new at2.l0(k0Var, mVar, context);
                k0Var.f293418w = new at2.o0(q0Var, mVar, context, k0Var);
                k0Var.f293419x = new at2.p0(k0Var, mVar);
            }
        }
        at2.h0 h0Var = new at2.h0(k0Var, context, q0Var.S0(), q0Var.R0());
        k0Var.f293414s = h0Var;
        k0Var.f293417v = h0Var;
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplayMoreActionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
