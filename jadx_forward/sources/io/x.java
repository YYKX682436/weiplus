package io;

/* loaded from: classes.dex */
public final class x implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.a1 f374972a;

    /* renamed from: b, reason: collision with root package name */
    public ne5.a f374973b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        em.a1 a1Var = this.f374972a;
        android.view.View view = a1Var != null ? a1Var.f335582a : null;
        if (view != null) {
            return view;
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eht, (android.view.ViewGroup) null);
        this.f374972a = new em.a1(inflate);
        c(null, this.f374973b);
        return inflate;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        ne5.a aVar = (ne5.a) pVar;
        ne5.a aVar2 = this.f374973b;
        this.f374973b = aVar;
        c(aVar2, aVar);
    }

    public final void c(ne5.a aVar, ne5.a aVar2) {
        em.a1 a1Var = this.f374972a;
        if (aVar2 == null || a1Var == null) {
            return;
        }
        android.view.View view = a1Var.f335582a;
        android.content.Context context = view.getContext();
        android.text.Spanned fromHtml = android.text.Html.fromHtml(aVar2.j());
        if (a1Var.f335584c == null) {
            a1Var.f335584c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
        }
        android.widget.TextView textView = a1Var.f335584c;
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, fromHtml));
        if (a1Var.f335583b == null) {
            a1Var.f335583b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cwk);
        }
        a1Var.f335583b.setOnClickListener(new io.w(a1Var, aVar2));
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374973b;
    }
}
