package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes7.dex */
public final class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f280780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k f280781f;

    public j(int i17, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k kVar) {
        this.f280779d = str;
        this.f280780e = h0Var;
        this.f280781f = kVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("framesetname:");
            java.lang.String frameSetName = this.f280779d;
            sb6.append(frameSetName);
            sb6.append(", msg id:");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f280780e;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d;
            sb6.append(f9Var != null ? java.lang.Long.valueOf(f9Var.m124847x74d37ac6()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", sb6.toString());
            java.lang.Object obj = h0Var.f391656d;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.k kVar = this.f280781f;
            if (obj != null) {
                c01.w9.f(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) obj).m124847x74d37ac6(), ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) h0Var.f391656d).Q0());
                kVar.f280856f.remove(frameSetName);
                g05.r rVar = (g05.r) ((g05.i) i95.n0.c(g05.i.class));
                rVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
                iq0.c Di = rVar.Di();
                if (Di != null) {
                    i95.m c17 = i95.n0.c(gq0.t.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    gq0.t.u5((gq0.t) c17, Di, null, frameSetName, 2, null);
                }
            }
            if (kVar.f280113d.B()) {
                kVar.f280113d.L(true);
            }
        }
    }
}
