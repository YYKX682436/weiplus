package tt2;

/* loaded from: classes3.dex */
public final class p extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f503510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f503511b;

    public p(cm2.m0 m0Var, tt2.e1 e1Var) {
        this.f503510a = m0Var;
        this.f503511b = e1Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        r45.ce0 ce0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            cm2.m0 m0Var = this.f503510a;
            r45.ce0 ce0Var2 = (r45.ce0) m0Var.f124901v.m75936x14adae67(9);
            bw5.x7 x7Var = null;
            bw5.x7 x7Var2 = ce0Var2 != null ? (bw5.x7) ce0Var2.m75936x14adae67(10) : null;
            tt2.e1 e1Var = this.f503511b;
            if (x7Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", "try preload ecs full page");
                pq.a aVar = new pq.a(e1Var.f503413h);
                i95.m c17 = i95.n0.c(pq.q.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                pq.q.h6((pq.q) c17, aVar, x7Var2, null, null, 12, null);
            }
            r45.bd5 bd5Var = (r45.bd5) m0Var.f124901v.m75936x14adae67(70);
            if (bd5Var != null && (ce0Var = (r45.ce0) bd5Var.m75936x14adae67(2)) != null) {
                x7Var = (bw5.x7) ce0Var.m75936x14adae67(10);
            }
            bw5.x7 x7Var3 = x7Var;
            if (x7Var3 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListAdapter", "try preload ecs product button page");
                pq.a aVar2 = new pq.a(e1Var.f503413h);
                i95.m c18 = i95.n0.c(pq.q.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                pq.q.h6((pq.q) c18, aVar2, x7Var3, null, null, 12, null);
            }
        }
    }
}
