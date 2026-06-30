package jf5;

/* loaded from: classes14.dex */
public final class h implements jf5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f380990a;

    /* renamed from: b, reason: collision with root package name */
    public final jf5.m0 f380991b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f380992c;

    /* renamed from: d, reason: collision with root package name */
    public rl5.r f380993d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 f380994e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f380995f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f380996g;

    public h(android.content.Context context, jf5.m0 m0Var, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f380990a = context;
        this.f380991b = m0Var;
        this.f380992c = lVar;
    }

    public final void a() {
        rl5.r rVar = this.f380993d;
        if (rVar == null) {
            return;
        }
        this.f380993d = null;
        this.f380994e = null;
        this.f380995f = true;
        rVar.a();
    }

    public void b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2682xeb7fcef.p2683xb915a73c.p2684x9d51ec56.C22095x76baed77 host, int i17, java.lang.String selectedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedText, "selectedText");
        jf5.m0 m0Var = this.f380991b;
        if (i17 != 1) {
            if (i17 == 2) {
                host.q(cf5.f.f122501e);
                java.lang.Runnable runnable = host.V;
                if (this.f380992c == null) {
                    host.B = true;
                    host.G = false;
                    host.removeCallbacks(runnable);
                    host.k();
                    host.y();
                    host.post(new jf5.v(host));
                } else {
                    host.B = true;
                    host.G = false;
                    host.removeCallbacks(runnable);
                    host.k();
                    host.y();
                    host.post(new jf5.w(host));
                }
            } else if (i17 != 3) {
                if (i17 != 4) {
                    if (i17 == 5 && (!r26.n0.N(selectedText))) {
                        host.q(cf5.f.f122504h);
                        if (m0Var != null) {
                            m0Var.f(host, selectedText);
                        }
                    }
                } else if (!r26.n0.N(selectedText)) {
                    host.q(cf5.f.f122503g);
                    if (m0Var != null) {
                        m0Var.h(selectedText);
                    }
                }
            } else if (!r26.n0.N(selectedText)) {
                host.q(cf5.f.f122502f);
                if (m0Var != null) {
                    m0Var.g(selectedText);
                }
            }
        } else if (!r26.n0.N(selectedText)) {
            host.q(cf5.f.f122500d);
            if (m0Var != null) {
                m0Var.a(selectedText);
            }
        }
        if (i17 == 1 || i17 == 4 || i17 == 6) {
            host.d(jf5.o0.f381025g);
        }
    }
}
