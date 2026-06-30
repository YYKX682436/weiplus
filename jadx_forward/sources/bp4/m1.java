package bp4;

/* loaded from: classes10.dex */
public final class m1 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f104789d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f104790e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 f104791f;

    /* renamed from: g, reason: collision with root package name */
    public final bp4.k0 f104792g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f104793h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f104794i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f104795m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f104796n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f104797o;

    /* renamed from: p, reason: collision with root package name */
    public final bp4.o0 f104798p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f104799q;

    /* renamed from: r, reason: collision with root package name */
    public final ro4.c f104800r;

    /* renamed from: s, reason: collision with root package name */
    public ro4.b f104801s;

    /* renamed from: t, reason: collision with root package name */
    public final bp4.b1 f104802t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f104803u;

    public m1(android.view.ViewGroup parent, ju3.d0 status, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 model, bp4.k0 previewPlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewPlugin, "previewPlugin");
        this.f104789d = parent;
        this.f104790e = status;
        this.f104791f = model;
        this.f104792g = previewPlugin;
        android.widget.ImageView imageView = (android.widget.ImageView) parent.findViewById(com.p314xaae8f345.mm.R.id.d7m);
        this.f104793h = imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103) parent.findViewById(com.p314xaae8f345.mm.R.id.d8k);
        this.f104794i = c17043x8103c103;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 timePanelHolder = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103) parent.findViewById(com.p314xaae8f345.mm.R.id.d8l);
        this.f104795m = timePanelHolder;
        this.f104796n = jz5.h.b(new bp4.k1(this));
        this.f104797o = jz5.h.b(new bp4.l1(this));
        this.f104798p = new bp4.o0();
        this.f104799q = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(parent.getContext(), 5);
        this.f104800r = new ro4.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(timePanelHolder, "timePanelHolder");
        bp4.b1 b1Var = new bp4.b1(timePanelHolder, status);
        this.f104802t = b1Var;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(parent.getContext(), com.p314xaae8f345.mm.R.raw.f79794x41ce1995, i65.a.d(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a9z)));
        imageView.setOnClickListener(this);
        previewPlugin.L(b1Var);
        c17043x8103c103.m68234x466a35c6(new bp4.g1(this));
    }

    public static final void a(bp4.m1 m1Var, ro4.b bVar) {
        m1Var.f104801s = bVar;
        m1Var.f104792g.N(bVar.f479653d, bVar.f479654e);
        long j17 = bVar.f479653d;
        long j18 = bVar.f479654e;
        bp4.b1 b1Var = m1Var.f104802t;
        b1Var.f104639o = j17;
        b1Var.f104640p = j18;
        b1Var.f104641q = j17;
        b1Var.f104642r = j18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition = m1Var.f104791f.f257276t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        boolean z17 = b1Var.f104638n;
        jz5.g gVar = b1Var.f104635h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = b1Var.f104631d;
        if (!z17) {
            b1Var.f104638n = true;
            c17043x8103c103.m68232x76bcab3c(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d c18800xbc8bc43d = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d) ((jz5.n) gVar).mo141623x754a37bb();
            bp4.y0 y0Var = b1Var.f104644t;
            c18800xbc8bc43d.m72570x6c4ebec7(y0Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d) ((jz5.n) gVar).mo141623x754a37bb()).m72575x7a9de772(y0Var);
            c17043x8103c103.m68234x466a35c6(new bp4.s0(b1Var));
            ((android.view.View) ((jz5.n) b1Var.f104636i).mo141623x754a37bb()).setOnClickListener(new bp4.t0(b1Var));
            ((android.view.View) ((jz5.n) b1Var.f104637m).mo141623x754a37bb()).setOnClickListener(new bp4.u0(b1Var));
            b1Var.a().findViewById(com.p314xaae8f345.mm.R.id.j7t).setOnClickListener(new bp4.v0(b1Var));
            b1Var.a().findViewById(com.p314xaae8f345.mm.R.id.j7u).setOnClickListener(new bp4.w0(b1Var));
        }
        long j19 = 1000;
        if (b1Var.f104640p > composition.i().m97259x74606f23() / j19) {
            long m97259x74606f23 = composition.i().m97259x74606f23() / j19;
            b1Var.f104640p = m97259x74606f23;
            b1Var.f104642r = m97259x74606f23;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d) ((jz5.n) gVar).mo141623x754a37bb()).b(composition, b1Var.f104639o, b1Var.f104640p);
        c17043x8103c103.m68236x76500a7f(true);
        b1Var.f104643s = new bp4.h1(m1Var);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        ro4.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f104794i;
        if (c17043x8103c103.h()) {
            c17043x8103c103.m68236x76500a7f(false);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c1032 = this.f104795m;
        if (!c17043x8103c1032.h()) {
            return false;
        }
        bp4.b1 b1Var = this.f104802t;
        long j17 = b1Var.f104639o;
        b1Var.f104641q = j17;
        long j18 = b1Var.f104640p;
        b1Var.f104642r = j18;
        bp4.q0 q0Var = b1Var.f104643s;
        if (q0Var != null && (bVar = ((bp4.h1) q0Var).f104719a.f104801s) != null) {
            bVar.f479653d = j17;
            bVar.f479654e = j18;
            uq5.y yVar = bVar.f479652c;
            if (yVar != null) {
                yVar.b(j17, j18);
            }
        }
        bp4.q0 q0Var2 = b1Var.f104643s;
        if (q0Var2 != null) {
            ((bp4.h1) q0Var2).b();
        }
        c17043x8103c1032.m68236x76500a7f(false);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMagicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f104794i;
        if (c17043x8103c103.h()) {
            c17043x8103c103.m68236x76500a7f(false);
        } else {
            boolean z17 = this.f104803u;
            bp4.o0 o0Var = this.f104798p;
            if (!z17) {
                this.f104803u = true;
                android.view.View view2 = (android.view.View) ((jz5.n) this.f104796n).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view2, "<get-panelRoot>(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103.k(c17043x8103c103, view2, null, 2, null);
                c17043x8103c103.m68232x76bcab3c(true);
                jz5.g gVar = this.f104797o;
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) gVar).mo141623x754a37bb()).mo7960x6cab2c8d(o0Var);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) gVar).mo141623x754a37bb();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = this.f104799q;
                c1163xf1deaba4.mo7967x900dcbe1(c1161x57298f5d);
                c1161x57298f5d.B = new bp4.i1(this);
                o0Var.f104839e = new bp4.j1(this);
            }
            o0Var.x(this.f104800r.a());
            c17043x8103c103.m68236x76500a7f(true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditMagicPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        boolean c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.v0.c();
        android.widget.ImageView imageView = this.f104793h;
        if (c17) {
            imageView.setVisibility(i17);
        } else {
            imageView.setVisibility(8);
        }
    }
}
