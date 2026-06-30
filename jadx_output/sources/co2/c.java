package co2;

/* loaded from: classes2.dex */
public final class c extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co2.k f43784a;

    public c(co2.k kVar) {
        this.f43784a = kVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            if (k3Var instanceof in5.s0) {
                so2.j5 j5Var = (so2.j5) ((in5.s0) k3Var).f293125i;
                if (j5Var instanceof bo2.c) {
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    jz5.l lVar = new jz5.l("view_id", "watch_later_card");
                    ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                    ((cy1.a) rVar).yj("view_exp", null, kz5.c1.k(lVar, new jz5.l("finder_context_id", b52.b.b()), new jz5.l("comment_scene", java.lang.Integer.valueOf(((r45.qt2) ((jz5.n) this.f43784a.f43793e).getValue()).getInteger(5))), new jz5.l("feed_id", pm0.v.u(j5Var.getItemId())), new jz5.l("session_buffer", ((bo2.c) j5Var).getFeedObject().getFeedObject().getSessionBuffer())), 1, true);
                }
            }
        }
    }
}
