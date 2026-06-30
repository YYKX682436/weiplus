package wx0;

/* loaded from: classes5.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wx0.z0 f532092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f532093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f532094f;

    public w0(wx0.z0 z0Var, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        this.f532092d = z0Var;
        this.f532093e = viewGroup;
        this.f532094f = viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/MaxRecordDurationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.j7(m7Var, null), 3, null);
        wx0.z0 z0Var = this.f532092d;
        android.view.View view2 = z0Var.f413347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view2, "<this>");
        view2.performHapticFeedback(6);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10991xb30eef44 c10991xb30eef44 = z0Var.f532108h;
        if (c10991xb30eef44 == null) {
            z0Var.getClass();
            android.content.Context context = z0Var.f413347d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c10991xb30eef44 = new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c.C10991xb30eef44(context, null, 0, 6, null);
            c10991xb30eef44.setId(android.view.View.generateViewId());
            c10991xb30eef44.setLayoutParams(new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1));
            c10991xb30eef44.b(com.p314xaae8f345.mm.R.C30867xcad56011.jv9, com.p314xaae8f345.mm.R.C30867xcad56011.jxf, com.p314xaae8f345.mm.R.C30867xcad56011.jx9);
            c10991xb30eef44.setElevation(j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 16.0f);
            c10991xb30eef44.m47404xfdccc737(com.p314xaae8f345.mm.R.id.f568313s46);
            c10991xb30eef44.m47405x405278aa(new wx0.y0(z0Var));
            z0Var.f532108h = c10991xb30eef44;
            this.f532094f.addView(c10991xb30eef44);
        }
        c10991xb30eef44.c(z0Var.f413347d, this.f532093e.getWidth());
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/MaxRecordDurationPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
