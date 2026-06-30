package wx0;

/* loaded from: classes5.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.b1 f531987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f531988e;

    public a1(wx0.b1 b1Var, yx0.b8 b8Var) {
        this.f531987d = b1Var;
        this.f531988e = b8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/ReplayPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.r6(m7Var, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = m7Var.Ai();
        Ai.put("view_id", "sc_click_replay");
        ((cy1.a) rVar).yj("sc_click_replay", null, Ai, 6, false);
        android.view.View view2 = this.f531987d.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        yx0.b8 b8Var = this.f531988e;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = b8Var.Y1;
        if (!((r2Var == null || ((p3325xe03a0797.p3326xc267989b.c3) r2Var).A()) ? false : true)) {
            b8Var.Y1 = p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.t4(b8Var, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/ReplayPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
