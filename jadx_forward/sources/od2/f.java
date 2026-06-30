package od2;

/* loaded from: classes12.dex */
public class f implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ od2.k f426144d;

    public f(od2.k kVar) {
        this.f426144d = kVar;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "FinderFollow storage change: event=%s | eventData=%s", str, w0Var);
        int i17 = w0Var.f398507b;
        if ((i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) && (obj = w0Var.f398509d) != null && (obj instanceof java.lang.String) && "FinderContact".equals(str)) {
            od2.k kVar = this.f426144d;
            p13.c cVar = kVar.f426155g;
            if (cVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) kVar.f426153e).a().a(cVar);
            }
            java.lang.String username = w0Var.f398509d.toString();
            c61.l7 l7Var = (c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class));
            l7Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            ya2.b2 y07 = l7Var.Jj().y0(username);
            if (y07 != null) {
                if (y07.f69313xcad4ef95 == ya2.b2.Q2) {
                    od2.h hVar = new od2.h(kVar, w0Var.f398509d.toString());
                    kVar.f426155g = hVar;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) kVar.f426153e).b(65646, hVar);
                    return;
                }
            }
            od2.g gVar = new od2.g(kVar, w0Var.f398509d.toString());
            kVar.f426155g = gVar;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.t) kVar.f426153e).b(65646, gVar);
        }
    }
}
