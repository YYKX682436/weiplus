package lp4;

/* loaded from: classes10.dex */
public final class a1 extends yt3.a implements bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f401846f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f401847g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f401848h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f401849i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f401850m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f401851n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f401852o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f401853p;

    /* renamed from: q, reason: collision with root package name */
    public long f401854q;

    /* renamed from: r, reason: collision with root package name */
    public long f401855r;

    /* renamed from: s, reason: collision with root package name */
    public long f401856s;

    /* renamed from: t, reason: collision with root package name */
    public long f401857t;

    /* renamed from: u, reason: collision with root package name */
    public long f401858u;

    /* renamed from: v, reason: collision with root package name */
    public final lp4.x0 f401859v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 holder, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f401846f = holder;
        this.f401847g = "MicroMsg.VLogTrackEditPlugin";
        this.f401848h = jz5.h.b(new lp4.y0(this));
        this.f401849i = jz5.h.b(new lp4.z0(this));
        this.f401850m = jz5.h.b(new lp4.v0(this));
        this.f401851n = jz5.h.b(new lp4.r0(this));
        this.f401852o = jz5.h.b(new lp4.w0(this));
        this.f401859v = new lp4.x0(this, status);
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f401846f.h()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0) ((jz5.n) this.f401849i).mo141623x754a37bb()).m72661x3ae760af(j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f401846f;
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
            this.f401846f.m68236x76500a7f(false);
        }
    }

    public final void z() {
        ((android.widget.TextView) ((jz5.n) this.f401850m).mo141623x754a37bb()).setText(this.f401846f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k8_, java.lang.Integer.valueOf(a06.d.b(((float) (this.f401857t - this.f401856s)) / 1000.0f))));
    }
}
