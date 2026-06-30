package bp4;

/* loaded from: classes10.dex */
public final class b1 implements yt3.r2, bp4.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f104631d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f104632e;

    /* renamed from: f, reason: collision with root package name */
    public bp4.c0 f104633f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f104634g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f104635h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f104636i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f104637m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f104638n;

    /* renamed from: o, reason: collision with root package name */
    public long f104639o;

    /* renamed from: p, reason: collision with root package name */
    public long f104640p;

    /* renamed from: q, reason: collision with root package name */
    public long f104641q;

    /* renamed from: r, reason: collision with root package name */
    public long f104642r;

    /* renamed from: s, reason: collision with root package name */
    public bp4.q0 f104643s;

    /* renamed from: t, reason: collision with root package name */
    public final bp4.y0 f104644t;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 holder, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104631d = holder;
        this.f104632e = status;
        this.f104634g = jz5.h.b(new bp4.z0(this));
        this.f104635h = jz5.h.b(new bp4.a1(this));
        this.f104636i = jz5.h.b(new bp4.r0(this));
        this.f104637m = jz5.h.b(new bp4.x0(this));
        this.f104644t = new bp4.y0(this);
    }

    public final android.view.View a() {
        return (android.view.View) ((jz5.n) this.f104634g).mo141623x754a37bb();
    }

    @Override // bp4.a0
    public void c(long j17) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d) ((jz5.n) this.f104635h).mo141623x754a37bb()).m72574x3ae760af(j17);
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
        this.f104633f = c0Var;
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f104631d;
        if (!c17043x8103c103.h()) {
            return false;
        }
        bp4.q0 q0Var = this.f104643s;
        if (q0Var != null) {
            ((bp4.h1) q0Var).b();
        }
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
            bp4.q0 q0Var = this.f104643s;
            if (q0Var != null) {
                ((bp4.h1) q0Var).b();
            }
            this.f104631d.m68236x76500a7f(false);
        }
    }
}
