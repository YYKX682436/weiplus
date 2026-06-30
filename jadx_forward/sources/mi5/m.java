package mi5;

/* loaded from: classes9.dex */
public final class m implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.s0 f408410a;

    /* renamed from: b, reason: collision with root package name */
    public fc5.d f408411b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.s0 s0Var = this.f408410a;
        android.view.View view = s0Var != null ? s0Var.f336300a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eho, (android.view.ViewGroup) null);
        this.f408410a = new em.s0(inflate);
        c(null, this.f408411b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.d dVar = (fc5.d) pVar;
        fc5.d dVar2 = this.f408411b;
        this.f408411b = dVar;
        c(dVar2, dVar);
    }

    public final void c(fc5.d dVar, fc5.d dVar2) {
        zy2.g gVar;
        r45.ev2 ev2Var;
        em.s0 s0Var = this.f408410a;
        java.lang.String j17 = dVar2 != null ? dVar2.j() : null;
        if (dVar2 == null || s0Var == null || j17 == null) {
            return;
        }
        android.view.View view = s0Var.f336300a;
        android.content.Context context = view.getContext();
        ot0.q v17 = ot0.q.v(j17);
        if (v17 == null || (gVar = (zy2.g) v17.y(zy2.g.class)) == null || (ev2Var = gVar.f558916b) == null) {
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f542035a;
        java.lang.String m75945x2fec8307 = ev2Var.m75945x2fec8307(3);
        if (s0Var.f336303d == null) {
            s0Var.f336303d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.tco);
        }
        lVar.h(m75945x2fec8307, s0Var.f336303d, mn2.f1.B);
        if (s0Var.f336301b == null) {
            s0Var.f336301b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566514tw0);
        }
        s0Var.f336301b.setText(ev2Var.m75945x2fec8307(1));
        if (s0Var.f336304e == null) {
            s0Var.f336304e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565976tc4);
        }
        s0Var.f336304e.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.etp, java.lang.Integer.valueOf(ev2Var.m75939xb282bd08(4))));
        if (s0Var.f336302c == null) {
            s0Var.f336302c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.tf_);
        }
        s0Var.f336302c.setText(v17.f430199i == 119 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyc) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.njl));
        view.setOnClickListener(new mi5.l(ev2Var, dVar2, v17, context));
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408411b;
    }
}
