package ni2;

/* loaded from: classes10.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f418984a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f418985b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.x0 f418986c;

    /* renamed from: d, reason: collision with root package name */
    public xh2.a f418987d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f418988e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f418989f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f418990g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f418991h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f418992i;

    public r1(android.content.Context context, gk2.e buContext, lj2.x0 server) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(server, "server");
        this.f418984a = context;
        this.f418985b = buContext;
        this.f418986c = server;
        this.f418988e = "";
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        this.f418989f = k0Var;
        this.f418990g = jz5.h.b(new ni2.q1(this));
        this.f418991h = jz5.h.b(new ni2.p1(this));
        this.f418992i = true;
        k0Var.V1 = true;
        k0Var.f293405n = new ni2.m1(this);
        k0Var.f293414s = new ni2.n1(this);
    }

    public final void a(xh2.a micCoverData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micCoverData, "micCoverData");
        if (micCoverData.f536053a == null) {
            this.f418992i = true;
        } else {
            this.f418992i = false;
        }
        this.f418987d = micCoverData;
        this.f418988e = ((mm2.y2) this.f418985b.a(mm2.y2.class)).R6(micCoverData.f536054b.f536086e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f418989f;
        k0Var.q(this.f418984a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lzl, java.lang.Integer.valueOf(micCoverData.f536054b.f536086e)), 17);
        k0Var.v();
    }
}
