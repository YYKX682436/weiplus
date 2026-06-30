package bp4;

/* loaded from: classes10.dex */
public final class n extends yt3.a implements bp4.m2, bp4.a0, bp4.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f104806f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f104807g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f104808h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f104809i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f104810m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f104811n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f104812o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f104813p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f104814q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f104815r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f104816s;

    /* renamed from: t, reason: collision with root package name */
    public long f104817t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f104818u;

    /* renamed from: v, reason: collision with root package name */
    public bp4.c0 f104819v;

    /* renamed from: w, reason: collision with root package name */
    public final bp4.p f104820w;

    /* renamed from: x, reason: collision with root package name */
    public final bp4.i f104821x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104806f = layout;
        android.content.Context context = layout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103(context);
        layout.addView(c17043x8103c103);
        c17043x8103c103.setVisibility(8);
        this.f104807g = c17043x8103c103;
        this.f104808h = jz5.h.b(new bp4.j(this));
        this.f104809i = jz5.h.b(new bp4.m(this));
        this.f104810m = jz5.h.b(new bp4.g(this));
        this.f104811n = jz5.h.b(new bp4.a(this));
        this.f104812o = jz5.h.b(new bp4.h(this));
        this.f104813p = jz5.h.b(new bp4.l(this));
        this.f104814q = jz5.h.b(new bp4.f(this));
        this.f104815r = jz5.h.b(new bp4.k(this));
        this.f104820w = new bp4.p();
        this.f104821x = new bp4.i(this, status);
    }

    public static final android.view.ViewGroup z(bp4.n nVar) {
        return (android.view.ViewGroup) ((jz5.n) nVar.f104808h).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 A(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        bp4.p pVar = this.f104820w;
        pVar.getClass();
        java.util.Map map = pVar.f104867a;
        ((java.util.LinkedHashMap) map).clear();
        java.util.Iterator it = composition.f257130c.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
            int i17 = i1Var.f257158j;
            rm5.j jVar = i1Var.f257160l;
            map.put(java.lang.Integer.valueOf(i1Var.f257152d), new bp4.o(i17, jVar.f479037f, jVar.f479038g));
            so4.g.f492309a.e(i1Var, 0);
        }
        return composition;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 B() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727) ((jz5.n) this.f104809i).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 C(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        bp4.p pVar = this.f104820w;
        pVar.getClass();
        java.util.Iterator it = composition.f257130c.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next();
            bp4.o oVar = (bp4.o) ((java.util.LinkedHashMap) pVar.f104867a).get(java.lang.Integer.valueOf(i1Var.f257152d));
            if (oVar != null) {
                if (z17) {
                    i1Var.d(oVar.f104836b);
                    i1Var.c(oVar.f104837c);
                }
                so4.g.f492309a.e(i1Var, oVar.f104835a);
            }
        }
        return composition;
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 composition, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        this.f104818u = false;
        boolean z17 = this.f104816s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f104807g;
        if (!z17) {
            this.f104816s = true;
            c17043x8103c103.m68232x76bcab3c(false);
            B().m72639x6c4ebec7(this.f104821x);
            ((android.widget.ImageView) ((jz5.n) this.f104811n).mo141623x754a37bb()).setOnClickListener(new bp4.b(this));
            ((android.widget.ImageView) ((jz5.n) this.f104812o).mo141623x754a37bb()).setOnClickListener(new bp4.c(this));
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f104815r).mo141623x754a37bb()).setOnClickListener(new bp4.d(this));
            c17043x8103c103.m68234x466a35c6(new bp4.e(this));
        }
        this.f104817t = j17;
        c17043x8103c103.m68236x76500a7f(true);
        B().m72642x53c3b209(composition);
        E();
    }

    public final void E() {
        a06.d.d(((float) B().m72636xcff918c0()) / 1000.0f);
        long c17 = a06.d.c(((float) java.lang.Math.min(this.f104817t, B().m72636xcff918c0())) / 1000.0f);
        jz5.g gVar = this.f104810m;
        ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setText(this.f104807g.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k8_, java.lang.Long.valueOf(c17)));
        ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(B().m72637x26969bc5() > this.f104817t ? 0 : 4);
    }

    @Override // bp4.b0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var, long j17, boolean z17) {
        if (h1Var == null || j17 < 0) {
            return;
        }
        B().b(h1Var, j17);
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f104807g.h()) {
            B().m72641x3ae760af(j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
        this.f104819v = c0Var;
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f104807g;
        if (!c17043x8103c103.h()) {
            return false;
        }
        this.f104818u = false;
        c17043x8103c103.m68236x76500a7f(false);
        return true;
    }

    @Override // bp4.a0
    /* renamed from: onFinish */
    public void mo10982x42fe6352() {
    }

    @Override // bp4.m2
    /* renamed from: onVideoPause */
    public void mo10995x65d3157a() {
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f104815r).mo141623x754a37bb()).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f104806f.getContext(), com.p314xaae8f345.mm.R.raw.f79865xc8527e4c, -1));
    }

    @Override // bp4.m2
    /* renamed from: onVideoPlay */
    public void mo10996x4d9b9b30() {
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f104815r).mo141623x754a37bb()).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f104806f.getContext(), com.p314xaae8f345.mm.R.raw.f79844x41f895de, -1));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (i17 == 8) {
            this.f104818u = false;
            this.f104807g.m68236x76500a7f(false);
        }
    }
}
