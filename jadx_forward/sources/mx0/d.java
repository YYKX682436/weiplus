package mx0;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.l f413424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f413425e;

    public d(mx0.l lVar, yx0.b8 b8Var) {
        this.f413424d = lVar;
        this.f413425e = b8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mx0.l lVar = this.f413424d;
        lVar.f413645o = !lVar.f413645o;
        lVar.f();
        pp0.k0 k0Var = (pp0.k0) i95.n0.c(pp0.k0.class);
        java.lang.String templateId = lVar.f413646p;
        boolean z17 = lVar.f413645o;
        ((yy0.o0) k0Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        m7Var.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.f7(m7Var, templateId, z17, null), 3, null);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        m7Var.wj(z17);
        java.util.Map Ai = m7Var.Ai();
        java.lang.String str = !z17 ? "sc_template_cancel_favorite" : "sc_template_favorite";
        Ai.put("view_id", str);
        ((cy1.a) rVar).yj(str, null, Ai, 6, false);
        java.lang.String templateId2 = lVar.f413646p;
        boolean z18 = lVar.f413645o;
        yx0.b8 b8Var = this.f413425e;
        b8Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId2, "templateId");
        p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.p3(b8Var, templateId2, z18, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/FavoritePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
