package bp4;

/* loaded from: classes10.dex */
public final class o4 extends yt3.a implements bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f104849f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f104850g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f104851h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f104852i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f104853m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f104854n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f104855o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f104856p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f104857q;

    /* renamed from: r, reason: collision with root package name */
    public long f104858r;

    /* renamed from: s, reason: collision with root package name */
    public long f104859s;

    /* renamed from: t, reason: collision with root package name */
    public float f104860t;

    /* renamed from: u, reason: collision with root package name */
    public long f104861u;

    /* renamed from: v, reason: collision with root package name */
    public long f104862v;

    /* renamed from: w, reason: collision with root package name */
    public long f104863w;

    /* renamed from: x, reason: collision with root package name */
    public bp4.c0 f104864x;

    /* renamed from: y, reason: collision with root package name */
    public bp4.c0 f104865y;

    /* renamed from: z, reason: collision with root package name */
    public final bp4.l4 f104866z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 holder, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104849f = holder;
        this.f104850g = "MicroMsg.VLogTrackEditPlugin";
        this.f104851h = jz5.h.b(new bp4.m4(this));
        this.f104852i = jz5.h.b(new bp4.n4(this));
        this.f104853m = jz5.h.b(new bp4.j4(this));
        this.f104854n = jz5.h.b(new bp4.f4(this));
        this.f104855o = jz5.h.b(new bp4.k4(this));
        this.f104860t = 1.0f;
        this.f104866z = new bp4.l4(this, status);
    }

    public static void A(bp4.o4 o4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 track, boolean z17, long j17, int i17, java.lang.Object obj) {
        boolean z18 = (i17 & 2) != 0 ? false : z17;
        long j18 = (i17 & 4) != 0 ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : j17;
        o4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
        bp4.l4 l4Var = o4Var.f104866z;
        if (z18) {
            long j19 = o4Var.f104862v;
            if (j19 != 0) {
                l4Var.b(o4Var.f104861u, j19);
                return;
            }
        }
        o4Var.f104857q = false;
        boolean z19 = o4Var.f104856p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = o4Var.f104849f;
        if (!z19) {
            o4Var.f104856p = true;
            c17043x8103c103.m68232x76bcab3c(false);
            o4Var.z().m72657x6c4ebec7(l4Var);
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) o4Var.f104854n).mo141623x754a37bb();
            if (imageView != null) {
                imageView.setOnClickListener(new bp4.g4(o4Var));
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) ((jz5.n) o4Var.f104855o).mo141623x754a37bb();
            if (imageView2 != null) {
                imageView2.setOnClickListener(new bp4.h4(o4Var));
            }
            c17043x8103c103.m68234x466a35c6(new bp4.i4(o4Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(track.f257149a, track.f257150b, 0, 4, null);
        rm5.j jVar = track.f257160l;
        i1Var.c(jVar.f479041j);
        i1Var.a(((float) jVar.f479041j) / jVar.f479039h);
        i1Var.b(jVar.f479039h);
        rm5.j jVar2 = i1Var.f257160l;
        jVar2.f479049r = 0L;
        jVar2.f479050s = jVar2.f479036e;
        jVar2.g();
        o4Var.f104858r = jVar.f479037f;
        o4Var.f104859s = java.lang.Math.min(jVar.f479038g, j18);
        o4Var.f104860t = jVar.f479039h;
        o4Var.f104861u = ((float) o4Var.f104858r) / r5;
        o4Var.f104862v = ((float) r3) / r5;
        o4Var.f104863w = jVar.f479041j;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(kz5.b0.c(i1Var));
        float f17 = (float) o4Var.f104858r;
        float f18 = jVar.f479039h;
        h1Var.s(f17 / f18, ((float) o4Var.f104859s) / f18);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 z27 = o4Var.z();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z27, "<get-trackCropView>(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0.b(z27, h1Var, 0L, 0L, 6, null);
        c17043x8103c103.m68236x76500a7f(true);
        o4Var.B();
    }

    public final void B() {
        java.lang.Math.round((((float) this.f104863w) / this.f104860t) / 1000.0f);
        ((android.widget.TextView) ((jz5.n) this.f104853m).mo141623x754a37bb()).setText(this.f104849f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k8_, java.lang.Integer.valueOf(java.lang.Math.round(((float) (this.f104862v - this.f104861u)) / 1000.0f))));
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f104849f.h()) {
            z().m72661x3ae760af(j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f104849f;
        if (!c17043x8103c103.h()) {
            return false;
        }
        this.f104857q = false;
        c17043x8103c103.m68236x76500a7f(false);
        return true;
    }

    @Override // bp4.a0
    /* renamed from: onFinish */
    public void mo10982x42fe6352() {
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (i17 == 8) {
            this.f104857q = false;
            this.f104849f.m68236x76500a7f(false);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 z() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0) ((jz5.n) this.f104852i).mo141623x754a37bb();
    }
}
