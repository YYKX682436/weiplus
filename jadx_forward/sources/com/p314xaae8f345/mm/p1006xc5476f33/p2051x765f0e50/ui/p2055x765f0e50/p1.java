package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class p1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f242949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f f242950e;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f activityC17379xdc3f7e5f, boolean z17) {
        this.f242950e = activityC17379xdc3f7e5f;
        this.f242949d = z17;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17379xdc3f7e5f activityC17379xdc3f7e5f = this.f242950e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq tqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq) activityC17379xdc3f7e5f.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq.class);
        boolean z17 = this.f242949d;
        tqVar.P6(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.oq(z17));
        g4Var.a(5, com.p314xaae8f345.mm.R.C30867xcad56011.phm);
        g4Var.a(1, com.p314xaae8f345.mm.R.C30867xcad56011.ipw);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(activityC17379xdc3f7e5f.f241690d)) {
            return;
        }
        if (z17) {
            g4Var.o(4, activityC17379xdc3f7e5f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9q), activityC17379xdc3f7e5f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9s));
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq tqVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq) activityC17379xdc3f7e5f.m80391xac8f1cfd(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq.class);
            xj.m mVar = tqVar2.f243120d;
            if (mVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoAvatarUIC", "reportAdExpose: aid=" + mVar.f536286a);
                i95.m c17 = i95.n0.c(xj.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                xj.i.gg((xj.i) c17, mVar.f536286a, wj.w0.f528074d, null, 4, null);
                tqVar2.f243121e = true;
            }
        }
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str = activityC17379xdc3f7e5f.f241690d;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
        android.graphics.Bitmap b17 = com.p314xaae8f345.mm.p943x351df9c2.g.b(str, true, -1, null);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        if (com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().i(c01.z1.r() + ".last", true, false))) {
            g4Var.a(3, com.p314xaae8f345.mm.R.C30867xcad56011.ixz);
        }
        if (b17 != null) {
            g4Var.a(2, com.p314xaae8f345.mm.R.C30867xcad56011.frw);
        }
    }
}
