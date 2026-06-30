package af5;

/* loaded from: classes5.dex */
public final class d1 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 {

    /* renamed from: f, reason: collision with root package name */
    public em.b4 f86096f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b f86097g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86098h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(android.content.Context context) {
        super(context, null, 0, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571104eq0, (android.view.ViewGroup) null);
        this.f86096f = new em.b4(inflate);
        inflate.setOnClickListener(new af5.z0(this));
        em.b4 b4Var = this.f86096f;
        if (b4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerVB");
            throw null;
        }
        linearLayout.addView(b4Var.f335671a);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b(context, null, 0, 6, null);
        c22094xdaed490b.setPadding(0, i65.a.b(context, 8), 0, 0);
        c22094xdaed490b.m80120x9909cadb().m80141x501b54f4(false);
        this.f86097g = c22094xdaed490b;
        c22094xdaed490b.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b2 = this.f86097g;
        if (c22094xdaed490b2 != null) {
            linearLayout.addView(c22094xdaed490b2);
            return linearLayout;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thinkingMarkdownView");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        yz5.p pVar3;
        v11.n0 n0Var;
        v11.n0 n0Var2;
        v11.m0 m0Var = (v11.m0) pVar;
        v11.m0 m0Var2 = (v11.m0) pVar2;
        if (m0Var2 == null || (n0Var2 = m0Var2.f513975d) == (n0Var = v11.n0.f513978d)) {
            if (this.f86098h) {
                this.f86098h = false;
                if (m0Var != null && (pVar3 = m0Var.f513976e) != null) {
                    pVar3.mo149xb9724478(java.lang.Boolean.FALSE, af5.c1.f86091d);
                }
            }
            setVisibility(8);
            return;
        }
        setVisibility(0);
        em.b4 b4Var = this.f86096f;
        if (b4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerVB");
            throw null;
        }
        if (b4Var.f335674d == null) {
            b4Var.f335674d = (android.widget.ProgressBar) b4Var.f335671a.findViewById(com.p314xaae8f345.mm.R.id.ve9);
        }
        android.widget.ProgressBar progressBar = b4Var.f335674d;
        v11.n0 n0Var3 = v11.n0.f513979e;
        progressBar.setVisibility((n0Var2 == n0Var3 || n0Var2 == v11.n0.f513980f) ? 0 : 8);
        em.b4 b4Var2 = this.f86096f;
        if (b4Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerVB");
            throw null;
        }
        if (b4Var2.f335672b == null) {
            b4Var2.f335672b = (android.widget.TextView) b4Var2.f335671a.findViewById(com.p314xaae8f345.mm.R.id.vea);
        }
        android.widget.TextView textView = b4Var2.f335672b;
        int ordinal = n0Var2.ordinal();
        textView.setText((ordinal == 1 || ordinal == 2) ? getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pk6) : getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575435pk5));
        boolean z17 = (n0Var2 == n0Var3 || n0Var2 == n0Var) ? false : true;
        em.b4 b4Var3 = this.f86096f;
        if (b4Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerVB");
            throw null;
        }
        b4Var3.a().setVisibility(z17 ? 0 : 8);
        em.b4 b4Var4 = this.f86096f;
        if (b4Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerVB");
            throw null;
        }
        b4Var4.a().setRotation(this.f86098h ? 180.0f : 0.0f);
        n0Var2.name();
    }
}
