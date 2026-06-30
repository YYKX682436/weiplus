package mi5;

/* loaded from: classes9.dex */
public final class k0 implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.y0 f408401a;

    /* renamed from: b, reason: collision with root package name */
    public ld5.b f408402b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.y0 y0Var = this.f408401a;
        android.view.View view = y0Var != null ? y0Var.f336468a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ehr, (android.view.ViewGroup) null);
        this.f408401a = new em.y0(inflate);
        c(null, this.f408402b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        ld5.b bVar = (ld5.b) pVar;
        ld5.b bVar2 = this.f408402b;
        this.f408402b = bVar;
        c(bVar2, bVar);
    }

    public final void c(ld5.b bVar, ld5.b bVar2) {
        em.y0 y0Var = this.f408401a;
        if (bVar2 == null || y0Var == null) {
            return;
        }
        android.widget.TextView textView = y0Var.f336471d;
        android.view.View view = y0Var.f336468a;
        if (textView == null) {
            y0Var.f336471d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
        }
        y0Var.f336471d.setText(bVar2.j());
        boolean z17 = false;
        if (!gk5.b0.a(bVar2)) {
            java.util.LinkedList k17 = bVar2.k();
            if (!(k17 == null || k17.isEmpty())) {
                z17 = true;
            }
        }
        if (z17) {
            if (y0Var.f336470c == null) {
                y0Var.f336470c = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.che);
            }
            y0Var.f336470c.setOnClickListener(new mi5.j0(bVar2));
        } else {
            if (y0Var.f336469b == null) {
                y0Var.f336469b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cwk);
            }
            y0Var.f336469b.setVisibility(8);
        }
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f408402b;
    }
}
