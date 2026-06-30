package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f272082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f272083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272084f;

    public p0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, boolean z17, int i17) {
        this.f272084f = c19666xfd6e2f33;
        this.f272082d = z17;
        this.f272083e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f272084f;
        boolean z17 = this.f272082d;
        if (!z17 && c19666xfd6e2f33.f271497c2) {
            db5.e1.s(c19666xfd6e2f33.getContext(), c19666xfd6e2f33.getContext().getString(this.f272083e), "");
            c19666xfd6e2f33.b1();
            return;
        }
        if (z17) {
            return;
        }
        c19666xfd6e2f33.b1();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n9 n9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n9) ((sb5.g2) c19666xfd6e2f33.f271488a3.a().f542241c.a(sb5.g2.class));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) n9Var.f280113d.f542241c.a(sb5.s0.class));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f332 = jbVar.f280796e;
        if (c19666xfd6e2f332 == null) {
            return;
        }
        n9Var.f281105m = c19666xfd6e2f332.m75456x4681cb8c();
        n9Var.f281108p = jbVar.f280796e.m75455x208b7874();
        n9Var.f281107o = jbVar.f280796e.m75457x6526e44a();
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(n9Var.f280113d.x());
        if (p17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Conversation", "clearQuoteInfo");
            p17.r1(0L);
            pt0.m mVar = (pt0.m) i95.n0.c(pt0.m.class);
            java.lang.String msgTalker = p17.h1();
            ((ez.j) mVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
            ti3.c cVar = ti3.c.f501112a;
            g15.b a17 = cVar.a(msgTalker);
            if (a17 == null) {
                a17 = new g15.b();
            }
            a17.q(null);
            cVar.d(a17, msgTalker, "");
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).W(p17, p17.h1());
        }
    }
}
