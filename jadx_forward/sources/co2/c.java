package co2;

/* loaded from: classes2.dex */
public final class c extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co2.k f125317a;

    public c(co2.k kVar) {
        this.f125317a = kVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            if (k3Var instanceof in5.s0) {
                so2.j5 j5Var = (so2.j5) ((in5.s0) k3Var).f374658i;
                if (j5Var instanceof bo2.c) {
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    jz5.l lVar = new jz5.l("view_id", "watch_later_card");
                    ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                    ((cy1.a) rVar).yj("view_exp", null, kz5.c1.k(lVar, new jz5.l("finder_context_id", b52.b.b()), new jz5.l("comment_scene", java.lang.Integer.valueOf(((r45.qt2) ((jz5.n) this.f125317a.f125326e).mo141623x754a37bb()).m75939xb282bd08(5))), new jz5.l("feed_id", pm0.v.u(j5Var.mo2128x1ed62e84())), new jz5.l("session_buffer", ((bo2.c) j5Var).getFeedObject().getFeedObject().m76829x97edf6c0())), 1, true);
                }
            }
        }
    }
}
