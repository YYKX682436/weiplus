package lp4;

/* loaded from: classes5.dex */
public final class f0 extends yt3.a implements bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f401876f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f401877g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f401878h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f401879i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f401880m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f401881n;

    /* renamed from: o, reason: collision with root package name */
    public long f401882o;

    /* renamed from: p, reason: collision with root package name */
    public long f401883p;

    /* renamed from: q, reason: collision with root package name */
    public long f401884q;

    /* renamed from: r, reason: collision with root package name */
    public long f401885r;

    /* renamed from: s, reason: collision with root package name */
    public long f401886s;

    /* renamed from: t, reason: collision with root package name */
    public zu3.a f401887t;

    /* renamed from: u, reason: collision with root package name */
    public final lp4.b0 f401888u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 holder, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f401876f = holder;
        jz5.h.b(new lp4.z(this));
        this.f401877g = jz5.h.b(new lp4.d0(this));
        this.f401878h = jz5.h.b(new lp4.e0(this));
        this.f401879i = jz5.h.b(new lp4.v(this));
        this.f401880m = jz5.h.b(new lp4.a0(this));
        this.f401888u = new lp4.b0(this, status);
    }

    @Override // bp4.a0
    public void c(long j17) {
        z().getVisibility();
        z().m72574x3ae760af(j17);
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f401876f;
        if (!c17043x8103c103.h()) {
            return false;
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
            this.f401876f.m68236x76500a7f(false);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d z() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2330x8434dedd.C18800xbc8bc43d) ((jz5.n) this.f401878h).mo141623x754a37bb();
    }
}
