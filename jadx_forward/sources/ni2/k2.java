package ni2;

/* loaded from: classes10.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f418892a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f418893b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.x0 f418894c;

    /* renamed from: d, reason: collision with root package name */
    public xh2.a f418895d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f418896e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f418897f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f418898g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f418899h;

    public k2(android.content.Context context, gk2.e buContext, lj2.x0 server) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(server, "server");
        this.f418892a = context;
        this.f418893b = buContext;
        this.f418894c = server;
        this.f418896e = "";
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        this.f418897f = k0Var;
        this.f418898g = jz5.h.b(new ni2.j2(this));
        this.f418899h = jz5.h.b(new ni2.i2(this));
        k0Var.V1 = true;
        k0Var.f293405n = new ni2.f2(this);
        k0Var.f293414s = new ni2.g2(this);
    }

    public final void a() {
        java.lang.String str;
        km2.q qVar;
        fj2.s sVar = fj2.s.f344716a;
        ml2.w4 w4Var = ml2.w4.f409722g;
        xh2.a aVar = this.f418895d;
        if (aVar == null || (qVar = aVar.f536053a) == null || (str = qVar.f390705c) == null) {
            str = "";
        }
        fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        ((nj2.b) ((jz5.n) this.f418899h).mo141623x754a37bb()).w();
    }
}
