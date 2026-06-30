package lp4;

/* loaded from: classes10.dex */
public final class p extends yt3.a implements bp4.m2, bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f401921f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f401922g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f401923h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f401924i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f401925m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f401926n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f401927o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f401928p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f401929q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f401930r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f401931s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f401932t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f401933u;

    /* renamed from: v, reason: collision with root package name */
    public long f401934v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f401935w;

    /* renamed from: x, reason: collision with root package name */
    public bp4.c0 f401936x;

    /* renamed from: y, reason: collision with root package name */
    public final lp4.i f401937y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.view.ViewGroup layout, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f401921f = layout;
        android.content.Context context = layout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103(context);
        layout.addView(c17043x8103c103);
        c17043x8103c103.setVisibility(8);
        this.f401922g = c17043x8103c103;
        this.f401923h = jz5.h.b(new lp4.j(this));
        this.f401924i = jz5.h.b(new lp4.o(this));
        this.f401925m = jz5.h.b(new lp4.g(this));
        this.f401926n = jz5.h.b(new lp4.a(this));
        this.f401927o = jz5.h.b(new lp4.h(this));
        this.f401928p = jz5.h.b(new lp4.n(this));
        this.f401929q = jz5.h.b(new lp4.m(this));
        this.f401930r = jz5.h.b(new lp4.f(this));
        this.f401931s = jz5.h.b(new lp4.l(this));
        this.f401932t = jz5.h.b(new lp4.k(this));
        this.f401937y = new lp4.i(this, status);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 A() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727) ((jz5.n) this.f401924i).mo141623x754a37bb();
    }

    public final void B(rm5.v composition, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composition, "composition");
        this.f401935w = false;
        boolean z17 = this.f401933u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f401922g;
        if (!z17) {
            this.f401933u = true;
            c17043x8103c103.m68232x76bcab3c(false);
            A().m72639x6c4ebec7(this.f401937y);
            dq4.c cVar = dq4.c.f323902a;
            jz5.g gVar = this.f401926n;
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-cancelView>(...)");
            cVar.f(imageView);
            jz5.g gVar2 = this.f401927o;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) gVar2).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView2, "<get-okView>(...)");
            cVar.f(imageView2);
            android.content.Context context = z().getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.Object systemService = context.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            ((android.widget.TextView) ((jz5.n) this.f401928p).mo141623x754a37bb()).setTextSize(1, (displayMetrics.density * 17.0f) / context.getResources().getDisplayMetrics().density);
            ((android.widget.ImageView) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new lp4.b(this));
            ((android.widget.ImageView) ((jz5.n) gVar2).mo141623x754a37bb()).setOnClickListener(new lp4.c(this));
            ((android.view.View) ((jz5.n) this.f401932t).mo141623x754a37bb()).setOnClickListener(new lp4.d(this));
            c17043x8103c103.m68234x466a35c6(new lp4.e(this));
        }
        this.f401934v = j17;
        c17043x8103c103.m68236x76500a7f(true);
        A().m72643x53c3b209(composition);
        C();
    }

    public final void C() {
        long c17 = a06.d.c(((float) java.lang.Math.min(this.f401934v, A().m72636xcff918c0())) / 1000.0f);
        jz5.g gVar = this.f401925m;
        ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setText(this.f401922g.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k8_, java.lang.Long.valueOf(c17)));
        ((android.widget.TextView) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(A().m72637x26969bc5() > this.f401934v ? 0 : 4);
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f401922g.h()) {
            A().m72641x3ae760af(j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
        this.f401936x = c0Var;
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f401922g;
        if (!c17043x8103c103.h()) {
            return false;
        }
        this.f401935w = false;
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
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f401931s).mo141623x754a37bb()).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f401921f.getContext(), com.p314xaae8f345.mm.R.raw.f79865xc8527e4c, -1));
        ((android.view.View) ((jz5.n) this.f401932t).mo141623x754a37bb()).setContentDescription(z().getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f401930r).mo141623x754a37bb()).setContentDescription(z().getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq));
    }

    @Override // bp4.m2
    /* renamed from: onVideoPlay */
    public void mo10996x4d9b9b30() {
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f401931s).mo141623x754a37bb()).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f401921f.getContext(), com.p314xaae8f345.mm.R.raw.f79844x41f895de, -1));
        ((android.view.View) ((jz5.n) this.f401932t).mo141623x754a37bb()).setContentDescription(z().getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f401930r).mo141623x754a37bb()).setContentDescription(z().getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572044x5));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (i17 == 8) {
            this.f401935w = false;
            this.f401922g.m68236x76500a7f(false);
        }
    }

    public final android.view.ViewGroup z() {
        return (android.view.ViewGroup) ((jz5.n) this.f401923h).mo141623x754a37bb();
    }
}
