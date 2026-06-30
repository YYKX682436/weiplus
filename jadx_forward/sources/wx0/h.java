package wx0;

/* loaded from: classes5.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f532024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.z f532025e;

    public h(wx0.c0 c0Var, mx0.z zVar) {
        this.f532024d = c0Var;
        this.f532025e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.i2(m7Var, null), 3, null);
        android.view.View view2 = this.f532024d.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        boolean z17 = false;
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) this.f532025e).f1(false);
        boolean z18 = this.f532024d.f531992g.Q != null;
        ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209419q).mo141623x754a37bb()).r()).booleanValue();
        if (z18 && booleanValue) {
            z17 = true;
        }
        this.f532024d.b().m47336x8c1f850d(z17);
        this.f532024d.b().a();
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/BeautifyPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
